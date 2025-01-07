package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.R;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes39.dex */
class TouchResponse {
    public static final int COMPLETE_MODE_CONTINUOUS_VELOCITY = 0;
    public static final int COMPLETE_MODE_SPRING = 1;
    private static final boolean DEBUG = false;
    private static final float EPSILON = 1.0E-7f;
    static final int FLAG_DISABLE_POST_SCROLL = 1;
    static final int FLAG_DISABLE_SCROLL = 2;
    static final int FLAG_SUPPORT_SCROLL_UP = 4;
    private static final int SEC_TO_MILLISECONDS = 1000;
    private static final int SIDE_BOTTOM = 3;
    private static final int SIDE_END = 6;
    private static final int SIDE_LEFT = 1;
    private static final int SIDE_MIDDLE = 4;
    private static final int SIDE_RIGHT = 2;
    private static final int SIDE_START = 5;
    private static final int SIDE_TOP = 0;
    private static final String TAG = "TouchResponse";
    private static final int TOUCH_DOWN = 1;
    private static final int TOUCH_END = 5;
    private static final int TOUCH_LEFT = 2;
    private static final int TOUCH_RIGHT = 3;
    private static final int TOUCH_START = 4;
    private static final int TOUCH_UP = 0;
    private float[] mAnchorDpDt;
    private int mAutoCompleteMode;
    private float mDragScale;
    private boolean mDragStarted;
    private float mDragThreshold;
    private int mFlags;
    boolean mIsRotateMode;
    private float mLastTouchX;
    private float mLastTouchY;
    private int mLimitBoundsTo;
    private float mMaxAcceleration;
    private float mMaxVelocity;
    private final MotionLayout mMotionLayout;
    private boolean mMoveWhenScrollAtTop;
    private int mOnTouchUp;
    float mRotateCenterX;
    float mRotateCenterY;
    private int mRotationCenterId;
    private int mSpringBoundary;
    private float mSpringDamping;
    private float mSpringMass;
    private float mSpringStiffness;
    private float mSpringStopThreshold;
    private int[] mTempLoc;
    private int mTouchAnchorId;
    private int mTouchAnchorSide;
    private float mTouchAnchorX;
    private float mTouchAnchorY;
    private float mTouchDirectionX;
    private float mTouchDirectionY;
    private int mTouchRegionId;
    private int mTouchSide;
    private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
    private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    TouchResponse(Context context, MotionLayout layout, XmlPullParser parser) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = layout;
        fillFromAttributeList(context, Xml.asAttributeSet(parser));
    }

    public TouchResponse(MotionLayout layout, OnSwipe onSwipe) {
        this.mTouchAnchorSide = 0;
        this.mTouchSide = 0;
        this.mOnTouchUp = 0;
        this.mTouchAnchorId = -1;
        this.mTouchRegionId = -1;
        this.mLimitBoundsTo = -1;
        this.mTouchAnchorY = 0.5f;
        this.mTouchAnchorX = 0.5f;
        this.mRotateCenterX = 0.5f;
        this.mRotateCenterY = 0.5f;
        this.mRotationCenterId = -1;
        this.mIsRotateMode = false;
        this.mTouchDirectionX = 0.0f;
        this.mTouchDirectionY = 1.0f;
        this.mDragStarted = false;
        this.mAnchorDpDt = new float[2];
        this.mTempLoc = new int[2];
        this.mMaxVelocity = 4.0f;
        this.mMaxAcceleration = 1.2f;
        this.mMoveWhenScrollAtTop = true;
        this.mDragScale = 1.0f;
        this.mFlags = 0;
        this.mDragThreshold = 10.0f;
        this.mSpringDamping = 10.0f;
        this.mSpringMass = 1.0f;
        this.mSpringStiffness = Float.NaN;
        this.mSpringStopThreshold = Float.NaN;
        this.mSpringBoundary = 0;
        this.mAutoCompleteMode = 0;
        this.mMotionLayout = layout;
        this.mTouchAnchorId = onSwipe.getTouchAnchorId();
        int touchAnchorSide = onSwipe.getTouchAnchorSide();
        this.mTouchAnchorSide = touchAnchorSide;
        if (touchAnchorSide != -1) {
            float[][] fArr = TOUCH_SIDES;
            this.mTouchAnchorX = fArr[touchAnchorSide][0];
            this.mTouchAnchorY = fArr[touchAnchorSide][1];
        }
        int dragDirection = onSwipe.getDragDirection();
        this.mTouchSide = dragDirection;
        float[][] fArr2 = TOUCH_DIRECTION;
        if (dragDirection < fArr2.length) {
            this.mTouchDirectionX = fArr2[dragDirection][0];
            this.mTouchDirectionY = fArr2[dragDirection][1];
        } else {
            this.mTouchDirectionY = Float.NaN;
            this.mTouchDirectionX = Float.NaN;
            this.mIsRotateMode = true;
        }
        this.mMaxVelocity = onSwipe.getMaxVelocity();
        this.mMaxAcceleration = onSwipe.getMaxAcceleration();
        this.mMoveWhenScrollAtTop = onSwipe.getMoveWhenScrollAtTop();
        this.mDragScale = onSwipe.getDragScale();
        this.mDragThreshold = onSwipe.getDragThreshold();
        this.mTouchRegionId = onSwipe.getTouchRegionId();
        this.mOnTouchUp = onSwipe.getOnTouchUp();
        this.mFlags = onSwipe.getNestedScrollFlags();
        this.mLimitBoundsTo = onSwipe.getLimitBoundsTo();
        this.mRotationCenterId = onSwipe.getRotationCenterId();
        this.mSpringBoundary = onSwipe.getSpringBoundary();
        this.mSpringDamping = onSwipe.getSpringDamping();
        this.mSpringMass = onSwipe.getSpringMass();
        this.mSpringStiffness = onSwipe.getSpringStiffness();
        this.mSpringStopThreshold = onSwipe.getSpringStopThreshold();
        this.mAutoCompleteMode = onSwipe.getAutoCompleteMode();
    }

    public void setRTL(boolean rtl) {
        if (rtl) {
            float[][] fArr = TOUCH_DIRECTION;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = TOUCH_SIDES;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = TOUCH_DIRECTION;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = TOUCH_SIDES;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = TOUCH_SIDES;
        int r1 = this.mTouchAnchorSide;
        this.mTouchAnchorX = fArr5[r1][0];
        this.mTouchAnchorY = fArr5[r1][1];
        int r0 = this.mTouchSide;
        float[][] fArr6 = TOUCH_DIRECTION;
        if (r0 >= fArr6.length) {
            return;
        }
        this.mTouchDirectionX = fArr6[r0][0];
        this.mTouchDirectionY = fArr6[r0][1];
    }

    private void fillFromAttributeList(Context context, AttributeSet attrs) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.OnSwipe);
        fill(a);
        a.recycle();
    }

    private void fill(TypedArray a) {
        int N = a.getIndexCount();
        for (int i = 0; i < N; i++) {
            int attr = a.getIndex(i);
            if (attr == R.styleable.OnSwipe_touchAnchorId) {
                this.mTouchAnchorId = a.getResourceId(attr, this.mTouchAnchorId);
            } else if (attr == R.styleable.OnSwipe_touchAnchorSide) {
                int r3 = a.getInt(attr, this.mTouchAnchorSide);
                this.mTouchAnchorSide = r3;
                float[][] fArr = TOUCH_SIDES;
                this.mTouchAnchorX = fArr[r3][0];
                this.mTouchAnchorY = fArr[r3][1];
            } else if (attr == R.styleable.OnSwipe_dragDirection) {
                int r32 = a.getInt(attr, this.mTouchSide);
                this.mTouchSide = r32;
                float[][] fArr2 = TOUCH_DIRECTION;
                if (r32 < fArr2.length) {
                    this.mTouchDirectionX = fArr2[r32][0];
                    this.mTouchDirectionY = fArr2[r32][1];
                } else {
                    this.mTouchDirectionY = Float.NaN;
                    this.mTouchDirectionX = Float.NaN;
                    this.mIsRotateMode = true;
                }
            } else if (attr == R.styleable.OnSwipe_maxVelocity) {
                this.mMaxVelocity = a.getFloat(attr, this.mMaxVelocity);
            } else if (attr == R.styleable.OnSwipe_maxAcceleration) {
                this.mMaxAcceleration = a.getFloat(attr, this.mMaxAcceleration);
            } else if (attr == R.styleable.OnSwipe_moveWhenScrollAtTop) {
                this.mMoveWhenScrollAtTop = a.getBoolean(attr, this.mMoveWhenScrollAtTop);
            } else if (attr == R.styleable.OnSwipe_dragScale) {
                this.mDragScale = a.getFloat(attr, this.mDragScale);
            } else if (attr == R.styleable.OnSwipe_dragThreshold) {
                this.mDragThreshold = a.getFloat(attr, this.mDragThreshold);
            } else if (attr == R.styleable.OnSwipe_touchRegionId) {
                this.mTouchRegionId = a.getResourceId(attr, this.mTouchRegionId);
            } else if (attr == R.styleable.OnSwipe_onTouchUp) {
                this.mOnTouchUp = a.getInt(attr, this.mOnTouchUp);
            } else if (attr == R.styleable.OnSwipe_nestedScrollFlags) {
                this.mFlags = a.getInteger(attr, 0);
            } else if (attr == R.styleable.OnSwipe_limitBoundsTo) {
                this.mLimitBoundsTo = a.getResourceId(attr, 0);
            } else if (attr == R.styleable.OnSwipe_rotationCenterId) {
                this.mRotationCenterId = a.getResourceId(attr, this.mRotationCenterId);
            } else if (attr == R.styleable.OnSwipe_springDamping) {
                this.mSpringDamping = a.getFloat(attr, this.mSpringDamping);
            } else if (attr == R.styleable.OnSwipe_springMass) {
                this.mSpringMass = a.getFloat(attr, this.mSpringMass);
            } else if (attr == R.styleable.OnSwipe_springStiffness) {
                this.mSpringStiffness = a.getFloat(attr, this.mSpringStiffness);
            } else if (attr == R.styleable.OnSwipe_springStopThreshold) {
                this.mSpringStopThreshold = a.getFloat(attr, this.mSpringStopThreshold);
            } else if (attr == R.styleable.OnSwipe_springBoundary) {
                this.mSpringBoundary = a.getInt(attr, this.mSpringBoundary);
            } else if (attr == R.styleable.OnSwipe_autoCompleteMode) {
                this.mAutoCompleteMode = a.getInt(attr, this.mAutoCompleteMode);
            }
        }
    }

    void setUpTouchEvent(float lastTouchX, float lastTouchY) {
        this.mLastTouchX = lastTouchX;
        this.mLastTouchY = lastTouchY;
        this.mDragStarted = false;
    }

    void processTouchRotateEvent(MotionEvent event, MotionLayout.MotionTracker velocityTracker, int currentState, MotionScene motionScene) {
        int r1;
        char c;
        velocityTracker.addMovement(event);
        switch (event.getAction()) {
            case 0:
                this.mLastTouchX = event.getRawX();
                this.mLastTouchY = event.getRawY();
                this.mDragStarted = false;
                break;
            case 1:
                this.mDragStarted = false;
                velocityTracker.computeCurrentVelocity(16);
                float tvx = velocityTracker.getXVelocity();
                float tvy = velocityTracker.getYVelocity();
                float currentPos = this.mMotionLayout.getProgress();
                float pos = currentPos;
                float rcx = this.mMotionLayout.getWidth() / 2.0f;
                float rcy = this.mMotionLayout.getHeight() / 2.0f;
                int r8 = this.mRotationCenterId;
                if (r8 != -1) {
                    View v = this.mMotionLayout.findViewById(r8);
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    rcx = this.mTempLoc[0] + ((v.getLeft() + v.getRight()) / 2.0f);
                    rcy = this.mTempLoc[1] + ((v.getTop() + v.getBottom()) / 2.0f);
                } else {
                    int r82 = this.mTouchAnchorId;
                    if (r82 != -1) {
                        MotionController mc = this.mMotionLayout.getMotionController(r82);
                        View v2 = this.mMotionLayout.findViewById(mc.getAnimateRelativeTo());
                        this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                        rcx = this.mTempLoc[0] + ((v2.getLeft() + v2.getRight()) / 2.0f);
                        rcy = this.mTempLoc[1] + ((v2.getTop() + v2.getBottom()) / 2.0f);
                    }
                }
                float relativePosX = event.getRawX() - rcx;
                float relativePosY = event.getRawY() - rcy;
                double angle1 = Math.toDegrees(Math.atan2(relativePosY, relativePosX));
                int r11 = this.mTouchAnchorId;
                if (r11 != -1) {
                    this.mMotionLayout.getAnchorDpDt(r11, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                    this.mAnchorDpDt[1] = (float) Math.toDegrees(r10[1]);
                } else {
                    this.mAnchorDpDt[1] = 360.0f;
                }
                double angle2 = Math.toDegrees(Math.atan2(tvy + relativePosY, tvx + relativePosX));
                float angularVelocity = ((float) (angle2 - angle1)) * 62.5f;
                if (!Float.isNaN(angularVelocity)) {
                    pos += ((angularVelocity * 3.0f) * this.mDragScale) / this.mAnchorDpDt[1];
                }
                if (pos != 0.0f && pos != 1.0f && (r1 = this.mOnTouchUp) != 3) {
                    float angularVelocity2 = (this.mDragScale * angularVelocity) / this.mAnchorDpDt[1];
                    float target = ((double) pos) < 0.5d ? 0.0f : 1.0f;
                    if (r1 == 6) {
                        if (currentPos + angularVelocity2 < 0.0f) {
                            angularVelocity2 = Math.abs(angularVelocity2);
                        }
                        target = 1.0f;
                    }
                    if (this.mOnTouchUp == 7) {
                        if (currentPos + angularVelocity2 > 1.0f) {
                            angularVelocity2 = -Math.abs(angularVelocity2);
                        }
                        target = 0.0f;
                    }
                    this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, target, angularVelocity2 * 3.0f);
                    if (0.0f >= currentPos || 1.0f <= currentPos) {
                        this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        break;
                    }
                } else if (0.0f >= pos || 1.0f <= pos) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    break;
                }
                break;
            case 2:
                float rawY = event.getRawY() - this.mLastTouchY;
                float rawX = event.getRawX() - this.mLastTouchX;
                float rcx2 = this.mMotionLayout.getWidth() / 2.0f;
                float rcy2 = this.mMotionLayout.getHeight() / 2.0f;
                int r14 = this.mRotationCenterId;
                if (r14 == -1) {
                    int r83 = this.mTouchAnchorId;
                    if (r83 != -1) {
                        MotionController mc2 = this.mMotionLayout.getMotionController(r83);
                        View v3 = this.mMotionLayout.findViewById(mc2.getAnimateRelativeTo());
                        if (v3 != null) {
                            this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                            rcx2 = this.mTempLoc[0] + ((v3.getLeft() + v3.getRight()) / 2.0f);
                            rcy2 = this.mTempLoc[1] + ((v3.getTop() + v3.getBottom()) / 2.0f);
                        } else {
                            Log.e(TAG, "could not find view to animate to");
                        }
                    }
                } else {
                    View v4 = this.mMotionLayout.findViewById(r14);
                    this.mMotionLayout.getLocationOnScreen(this.mTempLoc);
                    rcx2 = this.mTempLoc[0] + ((v4.getLeft() + v4.getRight()) / 2.0f);
                    rcy2 = this.mTempLoc[1] + ((v4.getTop() + v4.getBottom()) / 2.0f);
                }
                float relativePosX2 = event.getRawX() - rcx2;
                float relativePosY2 = event.getRawY() - rcy2;
                double angle12 = Math.atan2(event.getRawY() - rcy2, event.getRawX() - rcx2);
                double angle22 = Math.atan2(this.mLastTouchY - rcy2, this.mLastTouchX - rcx2);
                float drag = (float) (((angle12 - angle22) * 180.0d) / 3.141592653589793d);
                if (drag > 330.0f) {
                    drag -= 360.0f;
                } else if (drag < -330.0f) {
                    drag += 360.0f;
                }
                if (Math.abs(drag) > 0.01d || this.mDragStarted) {
                    float pos2 = this.mMotionLayout.getProgress();
                    if (!this.mDragStarted) {
                        this.mDragStarted = true;
                        this.mMotionLayout.setProgress(pos2);
                    }
                    int r15 = this.mTouchAnchorId;
                    if (r15 != -1) {
                        this.mMotionLayout.getAnchorDpDt(r15, pos2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                        c = 1;
                        this.mAnchorDpDt[1] = (float) Math.toDegrees(r2[1]);
                    } else {
                        c = 1;
                        this.mAnchorDpDt[1] = 360.0f;
                    }
                    float change = (this.mDragScale * drag) / this.mAnchorDpDt[c];
                    float pos3 = Math.max(Math.min(pos2 + change, 1.0f), 0.0f);
                    float current = this.mMotionLayout.getProgress();
                    if (pos3 == current) {
                        this.mMotionLayout.mLastVelocity = 0.0f;
                    } else {
                        if (current == 0.0f || current == 1.0f) {
                            this.mMotionLayout.endTrigger(current == 0.0f);
                        }
                        this.mMotionLayout.setProgress(pos3);
                        velocityTracker.computeCurrentVelocity(1000);
                        float tvx2 = velocityTracker.getXVelocity();
                        float tvy2 = velocityTracker.getYVelocity();
                        double angle23 = tvx2;
                        this.mMotionLayout.mLastVelocity = (float) Math.toDegrees((float) ((Math.hypot(tvy2, angle23) * Math.sin(Math.atan2(tvy2, tvx2) - angle12)) / Math.hypot(relativePosX2, relativePosY2)));
                    }
                    this.mLastTouchX = event.getRawX();
                    this.mLastTouchY = event.getRawY();
                    break;
                }
                break;
        }
    }

    void processTouchEvent(MotionEvent event, MotionLayout.MotionTracker velocityTracker, int currentState, MotionScene motionScene) {
        float velocity;
        int r9;
        float change;
        if (this.mIsRotateMode) {
            processTouchRotateEvent(event, velocityTracker, currentState, motionScene);
        }
        velocityTracker.addMovement(event);
        switch (event.getAction()) {
            case 0:
                float tvx = event.getRawX();
                this.mLastTouchX = tvx;
                this.mLastTouchY = event.getRawY();
                this.mDragStarted = false;
                break;
            case 1:
                this.mDragStarted = false;
                velocityTracker.computeCurrentVelocity(1000);
                float tvx2 = velocityTracker.getXVelocity();
                float tvy = velocityTracker.getYVelocity();
                float currentPos = this.mMotionLayout.getProgress();
                float pos = currentPos;
                int r13 = this.mTouchAnchorId;
                if (r13 != -1) {
                    this.mMotionLayout.getAnchorDpDt(r13, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                } else {
                    float minSize = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                    float[] fArr = this.mAnchorDpDt;
                    fArr[1] = this.mTouchDirectionY * minSize;
                    fArr[0] = this.mTouchDirectionX * minSize;
                }
                float minSize2 = this.mTouchDirectionX;
                float[] fArr2 = this.mAnchorDpDt;
                float f = (fArr2[0] * minSize2) + (this.mTouchDirectionY * fArr2[1]);
                if (minSize2 != 0.0f) {
                    velocity = tvx2 / fArr2[0];
                } else {
                    float velocity2 = fArr2[1];
                    velocity = tvy / velocity2;
                }
                if (!Float.isNaN(velocity)) {
                    pos += velocity / 3.0f;
                }
                if (pos != 0.0f && pos != 1.0f && (r9 = this.mOnTouchUp) != 3) {
                    float target = ((double) pos) < 0.5d ? 0.0f : 1.0f;
                    if (r9 == 6) {
                        if (currentPos + velocity < 0.0f) {
                            velocity = Math.abs(velocity);
                        }
                        target = 1.0f;
                    }
                    if (this.mOnTouchUp == 7) {
                        if (currentPos + velocity > 1.0f) {
                            velocity = -Math.abs(velocity);
                        }
                        target = 0.0f;
                    }
                    this.mMotionLayout.touchAnimateTo(this.mOnTouchUp, target, velocity);
                    if (0.0f >= currentPos || 1.0f <= currentPos) {
                        this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        break;
                    }
                } else if (0.0f >= pos || 1.0f <= pos) {
                    this.mMotionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    break;
                }
                break;
            case 2:
                float dy = event.getRawY() - this.mLastTouchY;
                float dx = event.getRawX() - this.mLastTouchX;
                float drag = (this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy);
                if (Math.abs(drag) > this.mDragThreshold || this.mDragStarted) {
                    float pos2 = this.mMotionLayout.getProgress();
                    if (!this.mDragStarted) {
                        this.mDragStarted = true;
                        this.mMotionLayout.setProgress(pos2);
                    }
                    int r15 = this.mTouchAnchorId;
                    if (r15 != -1) {
                        this.mMotionLayout.getAnchorDpDt(r15, pos2, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
                    } else {
                        float minSize3 = Math.min(this.mMotionLayout.getWidth(), this.mMotionLayout.getHeight());
                        float[] fArr3 = this.mAnchorDpDt;
                        fArr3[1] = this.mTouchDirectionY * minSize3;
                        fArr3[0] = this.mTouchDirectionX * minSize3;
                    }
                    float minSize4 = this.mTouchDirectionX;
                    float[] fArr4 = this.mAnchorDpDt;
                    float movmentInDir = (minSize4 * fArr4[0]) + (this.mTouchDirectionY * fArr4[1]);
                    if (Math.abs(movmentInDir * this.mDragScale) < 0.01d) {
                        float[] fArr5 = this.mAnchorDpDt;
                        fArr5[0] = 0.01f;
                        fArr5[1] = 0.01f;
                    }
                    if (this.mTouchDirectionX != 0.0f) {
                        change = dx / this.mAnchorDpDt[0];
                    } else {
                        change = dy / this.mAnchorDpDt[1];
                    }
                    float pos3 = Math.max(Math.min(pos2 + change, 1.0f), 0.0f);
                    if (this.mOnTouchUp == 6) {
                        pos3 = Math.max(pos3, 0.01f);
                    }
                    if (this.mOnTouchUp == 7) {
                        pos3 = Math.min(pos3, 0.99f);
                    }
                    float current = this.mMotionLayout.getProgress();
                    if (pos3 != current) {
                        if (current == 0.0f || current == 1.0f) {
                            this.mMotionLayout.endTrigger(current == 0.0f);
                        }
                        this.mMotionLayout.setProgress(pos3);
                        velocityTracker.computeCurrentVelocity(1000);
                        float tvx3 = velocityTracker.getXVelocity();
                        float tvy2 = velocityTracker.getYVelocity();
                        float velocity3 = this.mTouchDirectionX != 0.0f ? tvx3 / this.mAnchorDpDt[0] : tvy2 / this.mAnchorDpDt[1];
                        this.mMotionLayout.mLastVelocity = velocity3;
                    } else {
                        this.mMotionLayout.mLastVelocity = 0.0f;
                    }
                    this.mLastTouchX = event.getRawX();
                    this.mLastTouchY = event.getRawY();
                    break;
                }
                break;
        }
    }

    void setDown(float lastTouchX, float lastTouchY) {
        this.mLastTouchX = lastTouchX;
        this.mLastTouchY = lastTouchY;
    }

    float getProgressDirection(float dx, float dy) {
        float pos = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f = this.mTouchDirectionX;
        if (f != 0.0f) {
            float[] fArr = this.mAnchorDpDt;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            float velocity = (f * dx) / fArr[0];
            return velocity;
        }
        float[] fArr2 = this.mAnchorDpDt;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        float velocity2 = (this.mTouchDirectionY * dy) / fArr2[1];
        return velocity2;
    }

    void scrollUp(float dx, float dy) {
        float velocity;
        this.mDragStarted = false;
        float pos = this.mMotionLayout.getProgress();
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float f2 = fArr[0] * f;
        float f3 = this.mTouchDirectionY;
        float f4 = f2 + (fArr[1] * f3);
        if (f != 0.0f) {
            velocity = (f * dx) / fArr[0];
        } else {
            velocity = (f3 * dy) / fArr[1];
        }
        if (!Float.isNaN(velocity)) {
            pos += velocity / 3.0f;
        }
        if (pos != 0.0f) {
            boolean z = pos != 1.0f;
            int r8 = this.mOnTouchUp;
            if ((r8 != 3) & z) {
                this.mMotionLayout.touchAnimateTo(r8, ((double) pos) >= 0.5d ? 1.0f : 0.0f, velocity);
            }
        }
    }

    void scrollMove(float dx, float dy) {
        float change;
        float f = (this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy);
        float pos = this.mMotionLayout.getProgress();
        if (!this.mDragStarted) {
            this.mDragStarted = true;
            this.mMotionLayout.setProgress(pos);
        }
        this.mMotionLayout.getAnchorDpDt(this.mTouchAnchorId, pos, this.mTouchAnchorX, this.mTouchAnchorY, this.mAnchorDpDt);
        float f2 = this.mTouchDirectionX;
        float[] fArr = this.mAnchorDpDt;
        float movmentInDir = (f2 * fArr[0]) + (this.mTouchDirectionY * fArr[1]);
        if (Math.abs(movmentInDir) < 0.01d) {
            float[] fArr2 = this.mAnchorDpDt;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f3 = this.mTouchDirectionX;
        if (f3 != 0.0f) {
            change = (f3 * dx) / this.mAnchorDpDt[0];
        } else {
            float change2 = this.mTouchDirectionY;
            change = (change2 * dy) / this.mAnchorDpDt[1];
        }
        float pos2 = Math.max(Math.min(pos + change, 1.0f), 0.0f);
        if (pos2 != this.mMotionLayout.getProgress()) {
            this.mMotionLayout.setProgress(pos2);
        }
    }

    void setupTouch() {
        View view = null;
        int r1 = this.mTouchAnchorId;
        if (r1 != -1 && (view = this.mMotionLayout.findViewById(r1)) == null) {
            String valueOf = String.valueOf(Debug.getName(this.mMotionLayout.getContext(), this.mTouchAnchorId));
            Log.e(TAG, valueOf.length() != 0 ? "cannot find TouchAnchorId @id/".concat(valueOf) : new String("cannot find TouchAnchorId @id/"));
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView sv = (NestedScrollView) view;
            sv.setOnTouchListener(new View.OnTouchListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.1
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    return false;
                }
            });
            sv.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(this) { // from class: androidx.constraintlayout.motion.widget.TouchResponse.2
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                }
            });
        }
    }

    public void setAnchorId(int id) {
        this.mTouchAnchorId = id;
    }

    public int getAnchorId() {
        return this.mTouchAnchorId;
    }

    public void setTouchAnchorLocation(float x, float y) {
        this.mTouchAnchorX = x;
        this.mTouchAnchorY = y;
    }

    public void setMaxVelocity(float velocity) {
        this.mMaxVelocity = velocity;
    }

    public void setMaxAcceleration(float acceleration) {
        this.mMaxAcceleration = acceleration;
    }

    float getMaxAcceleration() {
        return this.mMaxAcceleration;
    }

    public float getMaxVelocity() {
        return this.mMaxVelocity;
    }

    boolean getMoveWhenScrollAtTop() {
        return this.mMoveWhenScrollAtTop;
    }

    public int getAutoCompleteMode() {
        return this.mAutoCompleteMode;
    }

    void setAutoCompleteMode(int autoCompleteMode) {
        this.mAutoCompleteMode = autoCompleteMode;
    }

    RectF getTouchRegion(ViewGroup layout, RectF rect) {
        View view;
        int r0 = this.mTouchRegionId;
        if (r0 == -1 || (view = layout.findViewById(r0)) == null) {
            return null;
        }
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rect;
    }

    int getTouchRegionId() {
        return this.mTouchRegionId;
    }

    RectF getLimitBoundsTo(ViewGroup layout, RectF rect) {
        View view;
        int r0 = this.mLimitBoundsTo;
        if (r0 == -1 || (view = layout.findViewById(r0)) == null) {
            return null;
        }
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        return rect;
    }

    int getLimitBoundsToId() {
        return this.mLimitBoundsTo;
    }

    float dot(float dx, float dy) {
        return (this.mTouchDirectionX * dx) + (this.mTouchDirectionY * dy);
    }

    public String toString() {
        if (Float.isNaN(this.mTouchDirectionX)) {
            return Key.ROTATION;
        }
        float f = this.mTouchDirectionX;
        float f2 = this.mTouchDirectionY;
        StringBuilder sb = new StringBuilder(33);
        sb.append(f);
        sb.append(" , ");
        sb.append(f2);
        return sb.toString();
    }

    public int getFlags() {
        return this.mFlags;
    }

    public void setTouchUpMode(int touchUpMode) {
        this.mOnTouchUp = touchUpMode;
    }

    public float getSpringStiffness() {
        return this.mSpringStiffness;
    }

    public float getSpringMass() {
        return this.mSpringMass;
    }

    public float getSpringDamping() {
        return this.mSpringDamping;
    }

    public float getSpringStopThreshold() {
        return this.mSpringStopThreshold;
    }

    public int getSpringBoundary() {
        return this.mSpringBoundary;
    }

    boolean isDragStarted() {
        return this.mDragStarted;
    }
}
