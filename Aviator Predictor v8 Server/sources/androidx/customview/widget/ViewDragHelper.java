package androidx.customview.widget;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.view.ViewCompat;
import java.util.Arrays;

/* loaded from: classes26.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "ViewDragHelper";
    private static final Interpolator sInterpolator = new Interpolator() { // from class: androidx.customview.widget.ViewDragHelper.1
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private final Callback mCallback;
    private View mCapturedView;
    private final int mDefaultEdgeSize;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private OverScroller mScroller;
    private int mTouchSlop;
    private int mTrackingEdges;
    private VelocityTracker mVelocityTracker;
    private int mActivePointerId = -1;
    private final Runnable mSetIdleRunnable = new Runnable() { // from class: androidx.customview.widget.ViewDragHelper.2
        @Override // java.lang.Runnable
        public void run() {
            ViewDragHelper.this.setDragState(0);
        }
    };

    public static abstract class Callback {
        public abstract boolean tryCaptureView(@NonNull View view, int r2);

        public void onViewDragStateChanged(int r1) {
        }

        public void onViewPositionChanged(@NonNull View view, int r2, int r3, @Px int r4, @Px int r5) {
        }

        public void onViewCaptured(@NonNull View view, int r2) {
        }

        public void onViewReleased(@NonNull View view, float f, float f2) {
        }

        public void onEdgeTouched(int r1, int r2) {
        }

        public boolean onEdgeLock(int r2) {
            return false;
        }

        public void onEdgeDragStarted(int r1, int r2) {
        }

        public int getOrderedChildIndex(int r1) {
            return r1;
        }

        public int getViewHorizontalDragRange(@NonNull View view) {
            return 0;
        }

        public int getViewVerticalDragRange(@NonNull View view) {
            return 0;
        }

        public int clampViewPositionHorizontal(@NonNull View view, int r3, int r4) {
            return 0;
        }

        public int clampViewPositionVertical(@NonNull View view, int r3, int r4) {
            return 0;
        }
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        return new ViewDragHelper(viewGroup.getContext(), viewGroup, callback);
    }

    public static ViewDragHelper create(@NonNull ViewGroup viewGroup, float f, @NonNull Callback callback) {
        ViewDragHelper create = create(viewGroup, callback);
        create.mTouchSlop = (int) (create.mTouchSlop * (1.0f / f));
        return create;
    }

    private ViewDragHelper(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull Callback callback) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (callback == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.mParentView = viewGroup;
        this.mCallback = callback;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mDefaultEdgeSize = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.mEdgeSize = this.mDefaultEdgeSize;
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mMaxVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mMinVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mScroller = new OverScroller(context, sInterpolator);
    }

    public void setMinVelocity(float f) {
        this.mMinVelocity = f;
    }

    public float getMinVelocity() {
        return this.mMinVelocity;
    }

    public int getViewDragState() {
        return this.mDragState;
    }

    public void setEdgeTrackingEnabled(int r1) {
        this.mTrackingEdges = r1;
    }

    @Px
    public int getEdgeSize() {
        return this.mEdgeSize;
    }

    public void setEdgeSize(@IntRange(from = 0) @Px int r1) {
        this.mEdgeSize = r1;
    }

    @Px
    public int getDefaultEdgeSize() {
        return this.mDefaultEdgeSize;
    }

    public void captureChildView(@NonNull View view, int r5) {
        if (view.getParent() != this.mParentView) {
            throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.mParentView + ")");
        }
        this.mCapturedView = view;
        this.mActivePointerId = r5;
        this.mCallback.onViewCaptured(view, r5);
        setDragState(1);
    }

    @Nullable
    public View getCapturedView() {
        return this.mCapturedView;
    }

    public int getActivePointerId() {
        return this.mActivePointerId;
    }

    @Px
    public int getTouchSlop() {
        return this.mTouchSlop;
    }

    public void cancel() {
        this.mActivePointerId = -1;
        clearMotionHistory();
        if (this.mVelocityTracker != null) {
            this.mVelocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    public void abort() {
        cancel();
        if (this.mDragState == 2) {
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            this.mScroller.abortAnimation();
            int currX2 = this.mScroller.getCurrX();
            int currY2 = this.mScroller.getCurrY();
            this.mCallback.onViewPositionChanged(this.mCapturedView, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        setDragState(0);
    }

    public boolean smoothSlideViewTo(@NonNull View view, int r4, int r5) {
        this.mCapturedView = view;
        this.mActivePointerId = -1;
        boolean forceSettleCapturedViewAt = forceSettleCapturedViewAt(r4, r5, 0, 0);
        if (!forceSettleCapturedViewAt && this.mDragState == 0 && this.mCapturedView != null) {
            this.mCapturedView = null;
        }
        return forceSettleCapturedViewAt;
    }

    public boolean settleCapturedViewAt(int r4, int r5) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        }
        return forceSettleCapturedViewAt(r4, r5, (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId));
    }

    private boolean forceSettleCapturedViewAt(int r11, int r12, int r13, int r14) {
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        int r2 = r11 - left;
        int r3 = r12 - top;
        if (r2 == 0 && r3 == 0) {
            this.mScroller.abortAnimation();
            setDragState(0);
            return false;
        }
        this.mScroller.startScroll(left, top, r2, r3, computeSettleDuration(this.mCapturedView, r2, r3, r13, r14));
        setDragState(2);
        return true;
    }

    private int computeSettleDuration(View view, int r10, int r11, int r12, int r13) {
        int clampMag = clampMag(r12, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int clampMag2 = clampMag(r13, (int) this.mMinVelocity, (int) this.mMaxVelocity);
        int abs = Math.abs(r10);
        int abs2 = Math.abs(r11);
        int abs3 = Math.abs(clampMag);
        int abs4 = Math.abs(clampMag2);
        int r6 = abs3 + abs4;
        int r7 = abs + abs2;
        return (int) (((clampMag2 != 0 ? abs4 / r6 : abs2 / r7) * computeAxisDuration(r11, clampMag2, this.mCallback.getViewVerticalDragRange(view))) + ((clampMag != 0 ? abs3 / r6 : abs / r7) * computeAxisDuration(r10, clampMag, this.mCallback.getViewHorizontalDragRange(view))));
    }

    private int computeAxisDuration(int r5, int r6, int r7) {
        int abs;
        if (r5 == 0) {
            return 0;
        }
        int width = this.mParentView.getWidth();
        int r1 = width / 2;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, Math.abs(r5) / width)) * r1) + r1;
        int abs2 = Math.abs(r6);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(r5) / r7) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int clampMag(int r2, int r3, int r4) {
        int abs = Math.abs(r2);
        if (abs < r3) {
            return 0;
        }
        return abs > r4 ? r2 <= 0 ? -r4 : r4 : r2;
    }

    private float clampMag(float f, float f2, float f3) {
        float abs = Math.abs(f);
        if (abs < f2) {
            return 0.0f;
        }
        return abs > f3 ? f <= 0.0f ? -f3 : f3 : f;
    }

    private float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    public void flingCapturedView(int r10, int r11, int r12, int r13) {
        if (!this.mReleaseInProgress) {
            throw new IllegalStateException("Cannot flingCapturedView outside of a call to Callback#onViewReleased");
        }
        this.mScroller.fling(this.mCapturedView.getLeft(), this.mCapturedView.getTop(), (int) this.mVelocityTracker.getXVelocity(this.mActivePointerId), (int) this.mVelocityTracker.getYVelocity(this.mActivePointerId), r10, r12, r11, r13);
        setDragState(2);
    }

    public boolean continueSettling(boolean z) {
        boolean z2;
        if (this.mDragState == 2) {
            boolean computeScrollOffset = this.mScroller.computeScrollOffset();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            int left = currX - this.mCapturedView.getLeft();
            int top = currY - this.mCapturedView.getTop();
            if (left != 0) {
                ViewCompat.offsetLeftAndRight(this.mCapturedView, left);
            }
            if (top != 0) {
                ViewCompat.offsetTopAndBottom(this.mCapturedView, top);
            }
            if (left != 0 || top != 0) {
                this.mCallback.onViewPositionChanged(this.mCapturedView, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.mScroller.getFinalX() && currY == this.mScroller.getFinalY()) {
                this.mScroller.abortAnimation();
                z2 = false;
            } else {
                z2 = computeScrollOffset;
            }
            if (!z2) {
                if (z) {
                    this.mParentView.post(this.mSetIdleRunnable);
                } else {
                    setDragState(0);
                }
            }
        }
        return this.mDragState == 2;
    }

    private void dispatchViewReleased(float f, float f2) {
        this.mReleaseInProgress = true;
        this.mCallback.onViewReleased(this.mCapturedView, f, f2);
        this.mReleaseInProgress = false;
        if (this.mDragState == 1) {
            setDragState(0);
        }
    }

    private void clearMotionHistory() {
        if (this.mInitialMotionX != null) {
            Arrays.fill(this.mInitialMotionX, 0.0f);
            Arrays.fill(this.mInitialMotionY, 0.0f);
            Arrays.fill(this.mLastMotionX, 0.0f);
            Arrays.fill(this.mLastMotionY, 0.0f);
            Arrays.fill(this.mInitialEdgesTouched, 0);
            Arrays.fill(this.mEdgeDragsInProgress, 0);
            Arrays.fill(this.mEdgeDragsLocked, 0);
            this.mPointersDown = 0;
        }
    }

    private void clearMotionHistory(int r4) {
        if (this.mInitialMotionX != null && isPointerDown(r4)) {
            this.mInitialMotionX[r4] = 0.0f;
            this.mInitialMotionY[r4] = 0.0f;
            this.mLastMotionX[r4] = 0.0f;
            this.mLastMotionY[r4] = 0.0f;
            this.mInitialEdgesTouched[r4] = 0;
            this.mEdgeDragsInProgress[r4] = 0;
            this.mEdgeDragsLocked[r4] = 0;
            this.mPointersDown &= (1 << r4) ^ (-1);
        }
    }

    private void ensureMotionHistorySizeForId(int r11) {
        if (this.mInitialMotionX == null || this.mInitialMotionX.length <= r11) {
            float[] fArr = new float[r11 + 1];
            float[] fArr2 = new float[r11 + 1];
            float[] fArr3 = new float[r11 + 1];
            float[] fArr4 = new float[r11 + 1];
            int[] r4 = new int[r11 + 1];
            int[] r5 = new int[r11 + 1];
            int[] r6 = new int[r11 + 1];
            if (this.mInitialMotionX != null) {
                System.arraycopy(this.mInitialMotionX, 0, fArr, 0, this.mInitialMotionX.length);
                System.arraycopy(this.mInitialMotionY, 0, fArr2, 0, this.mInitialMotionY.length);
                System.arraycopy(this.mLastMotionX, 0, fArr3, 0, this.mLastMotionX.length);
                System.arraycopy(this.mLastMotionY, 0, fArr4, 0, this.mLastMotionY.length);
                System.arraycopy(this.mInitialEdgesTouched, 0, r4, 0, this.mInitialEdgesTouched.length);
                System.arraycopy(this.mEdgeDragsInProgress, 0, r5, 0, this.mEdgeDragsInProgress.length);
                System.arraycopy(this.mEdgeDragsLocked, 0, r6, 0, this.mEdgeDragsLocked.length);
            }
            this.mInitialMotionX = fArr;
            this.mInitialMotionY = fArr2;
            this.mLastMotionX = fArr3;
            this.mLastMotionY = fArr4;
            this.mInitialEdgesTouched = r4;
            this.mEdgeDragsInProgress = r5;
            this.mEdgeDragsLocked = r6;
        }
    }

    private void saveInitialMotion(float f, float f2, int r6) {
        ensureMotionHistorySizeForId(r6);
        float[] fArr = this.mInitialMotionX;
        this.mLastMotionX[r6] = f;
        fArr[r6] = f;
        float[] fArr2 = this.mInitialMotionY;
        this.mLastMotionY[r6] = f2;
        fArr2[r6] = f2;
        this.mInitialEdgesTouched[r6] = getEdgesTouched((int) f, (int) f2);
        this.mPointersDown |= 1 << r6;
    }

    private void saveLastMotion(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int r0 = 0; r0 < pointerCount; r0++) {
            int pointerId = motionEvent.getPointerId(r0);
            if (isValidPointerForActionMove(pointerId)) {
                float x = motionEvent.getX(r0);
                float y = motionEvent.getY(r0);
                this.mLastMotionX[pointerId] = x;
                this.mLastMotionY[pointerId] = y;
            }
        }
    }

    public boolean isPointerDown(int r4) {
        return (this.mPointersDown & (1 << r4)) != 0;
    }

    void setDragState(int r3) {
        this.mParentView.removeCallbacks(this.mSetIdleRunnable);
        if (this.mDragState != r3) {
            this.mDragState = r3;
            this.mCallback.onViewDragStateChanged(r3);
            if (this.mDragState == 0) {
                this.mCapturedView = null;
            }
        }
    }

    boolean tryCaptureViewForDrag(View view, int r4) {
        if (view == this.mCapturedView && this.mActivePointerId == r4) {
            return true;
        }
        if (view != null && this.mCallback.tryCaptureView(view, r4)) {
            this.mActivePointerId = r4;
            captureChildView(view, r4);
            return true;
        }
        return false;
    }

    protected boolean canScroll(@NonNull View view, boolean z, int r14, int r15, int r16, int r17) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (r16 + scrollX >= childAt.getLeft() && r16 + scrollX < childAt.getRight() && r17 + scrollY >= childAt.getTop() && r17 + scrollY < childAt.getBottom() && canScroll(childAt, true, r14, r15, (r16 + scrollX) - childAt.getLeft(), (r17 + scrollY) - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && (view.canScrollHorizontally(-r14) || view.canScrollVertically(-r15));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ff, code lost:
    
        if (r8 != r7) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean shouldInterceptTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.customview.widget.ViewDragHelper.shouldInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public void processTouchEvent(@NonNull MotionEvent motionEvent) {
        int r0;
        int r02 = 0;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            cancel();
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                int pointerId = motionEvent.getPointerId(0);
                View findTopChildUnder = findTopChildUnder((int) x, (int) y);
                saveInitialMotion(x, y, pointerId);
                tryCaptureViewForDrag(findTopChildUnder, pointerId);
                int r1 = this.mInitialEdgesTouched[pointerId];
                if ((this.mTrackingEdges & r1) != 0) {
                    this.mCallback.onEdgeTouched(r1 & this.mTrackingEdges, pointerId);
                    break;
                }
                break;
            case 1:
                if (this.mDragState == 1) {
                    releaseViewForPointerUp();
                }
                cancel();
                break;
            case 2:
                if (this.mDragState == 1) {
                    if (isValidPointerForActionMove(this.mActivePointerId)) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        float x2 = motionEvent.getX(findPointerIndex);
                        float y2 = motionEvent.getY(findPointerIndex);
                        int r12 = (int) (x2 - this.mLastMotionX[this.mActivePointerId]);
                        int r03 = (int) (y2 - this.mLastMotionY[this.mActivePointerId]);
                        dragTo(this.mCapturedView.getLeft() + r12, this.mCapturedView.getTop() + r03, r12, r03);
                        saveLastMotion(motionEvent);
                        break;
                    }
                } else {
                    int pointerCount = motionEvent.getPointerCount();
                    while (r02 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(r02);
                        if (isValidPointerForActionMove(pointerId2)) {
                            float x3 = motionEvent.getX(r02);
                            float y3 = motionEvent.getY(r02);
                            float f = x3 - this.mInitialMotionX[pointerId2];
                            float f2 = y3 - this.mInitialMotionY[pointerId2];
                            reportNewEdgeDrags(f, f2, pointerId2);
                            if (this.mDragState != 1) {
                                View findTopChildUnder2 = findTopChildUnder((int) x3, (int) y3);
                                if (checkTouchSlop(findTopChildUnder2, f, f2) && tryCaptureViewForDrag(findTopChildUnder2, pointerId2)) {
                                }
                            }
                            saveLastMotion(motionEvent);
                            break;
                        }
                        r02++;
                    }
                    saveLastMotion(motionEvent);
                }
                break;
            case 3:
                if (this.mDragState == 1) {
                    dispatchViewReleased(0.0f, 0.0f);
                }
                cancel();
                break;
            case 5:
                int pointerId3 = motionEvent.getPointerId(actionIndex);
                float x4 = motionEvent.getX(actionIndex);
                float y4 = motionEvent.getY(actionIndex);
                saveInitialMotion(x4, y4, pointerId3);
                if (this.mDragState == 0) {
                    tryCaptureViewForDrag(findTopChildUnder((int) x4, (int) y4), pointerId3);
                    int r13 = this.mInitialEdgesTouched[pointerId3];
                    if ((this.mTrackingEdges & r13) != 0) {
                        this.mCallback.onEdgeTouched(r13 & this.mTrackingEdges, pointerId3);
                        break;
                    }
                } else if (isCapturedViewUnder((int) x4, (int) y4)) {
                    tryCaptureViewForDrag(this.mCapturedView, pointerId3);
                    break;
                }
                break;
            case 6:
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.mDragState == 1 && pointerId4 == this.mActivePointerId) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (r02 >= pointerCount2) {
                            r0 = -1;
                        } else {
                            int pointerId5 = motionEvent.getPointerId(r02);
                            if (pointerId5 != this.mActivePointerId) {
                                if (findTopChildUnder((int) motionEvent.getX(r02), (int) motionEvent.getY(r02)) == this.mCapturedView && tryCaptureViewForDrag(this.mCapturedView, pointerId5)) {
                                    r0 = this.mActivePointerId;
                                }
                            }
                            r02++;
                        }
                    }
                    if (r0 == -1) {
                        releaseViewForPointerUp();
                    }
                }
                clearMotionHistory(pointerId4);
                break;
        }
    }

    private void reportNewEdgeDrags(float f, float f2, int r6) {
        int r0 = checkNewEdgeDrag(f, f2, r6, 1) ? 1 : 0;
        if (checkNewEdgeDrag(f2, f, r6, 4)) {
            r0 |= 4;
        }
        if (checkNewEdgeDrag(f, f2, r6, 2)) {
            r0 |= 2;
        }
        if (checkNewEdgeDrag(f2, f, r6, 8)) {
            r0 |= 8;
        }
        if (r0 != 0) {
            int[] r1 = this.mEdgeDragsInProgress;
            r1[r6] = r1[r6] | r0;
            this.mCallback.onEdgeDragStarted(r0, r6);
        }
    }

    private boolean checkNewEdgeDrag(float f, float f2, int r7, int r8) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.mInitialEdgesTouched[r7] & r8) != r8 || (this.mTrackingEdges & r8) == 0 || (this.mEdgeDragsLocked[r7] & r8) == r8 || (this.mEdgeDragsInProgress[r7] & r8) == r8) {
            return false;
        }
        if (abs <= this.mTouchSlop && abs2 <= this.mTouchSlop) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.mCallback.onEdgeLock(r8)) {
            return (this.mEdgeDragsInProgress[r7] & r8) == 0 && abs > ((float) this.mTouchSlop);
        }
        int[] r1 = this.mEdgeDragsLocked;
        r1[r7] = r1[r7] | r8;
        return false;
    }

    private boolean checkTouchSlop(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.mCallback.getViewHorizontalDragRange(view) > 0;
        boolean z2 = this.mCallback.getViewVerticalDragRange(view) > 0;
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop)) : z ? Math.abs(f) > ((float) this.mTouchSlop) : z2 && Math.abs(f2) > ((float) this.mTouchSlop);
    }

    public boolean checkTouchSlop(int r5) {
        int length = this.mInitialMotionX.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (checkTouchSlop(r5, r1)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkTouchSlop(int r8, int r9) {
        if (!isPointerDown(r9)) {
            return false;
        }
        boolean z = (r8 & 1) == 1;
        boolean z2 = (r8 & 2) == 2;
        float f = this.mLastMotionX[r9] - this.mInitialMotionX[r9];
        float f2 = this.mLastMotionY[r9] - this.mInitialMotionY[r9];
        return (z && z2) ? (f * f) + (f2 * f2) > ((float) (this.mTouchSlop * this.mTouchSlop)) : z ? Math.abs(f) > ((float) this.mTouchSlop) : z2 && Math.abs(f2) > ((float) this.mTouchSlop);
    }

    public boolean isEdgeTouched(int r5) {
        int length = this.mInitialEdgesTouched.length;
        for (int r1 = 0; r1 < length; r1++) {
            if (isEdgeTouched(r5, r1)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEdgeTouched(int r2, int r3) {
        return isPointerDown(r3) && (this.mInitialEdgesTouched[r3] & r2) != 0;
    }

    private void releaseViewForPointerUp() {
        this.mVelocityTracker.computeCurrentVelocity(1000, this.mMaxVelocity);
        dispatchViewReleased(clampMag(this.mVelocityTracker.getXVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity), clampMag(this.mVelocityTracker.getYVelocity(this.mActivePointerId), this.mMinVelocity, this.mMaxVelocity));
    }

    private void dragTo(int r7, int r8, int r9, int r10) {
        int r2;
        int r3;
        int left = this.mCapturedView.getLeft();
        int top = this.mCapturedView.getTop();
        if (r9 != 0) {
            r2 = this.mCallback.clampViewPositionHorizontal(this.mCapturedView, r7, r9);
            ViewCompat.offsetLeftAndRight(this.mCapturedView, r2 - left);
        } else {
            r2 = r7;
        }
        if (r10 != 0) {
            r3 = this.mCallback.clampViewPositionVertical(this.mCapturedView, r8, r10);
            ViewCompat.offsetTopAndBottom(this.mCapturedView, r3 - top);
        } else {
            r3 = r8;
        }
        if (r9 != 0 || r10 != 0) {
            this.mCallback.onViewPositionChanged(this.mCapturedView, r2, r3, r2 - left, r3 - top);
        }
    }

    public boolean isCapturedViewUnder(int r2, int r3) {
        return isViewUnder(this.mCapturedView, r2, r3);
    }

    public boolean isViewUnder(@Nullable View view, int r4, int r5) {
        return view != null && r4 >= view.getLeft() && r4 < view.getRight() && r5 >= view.getTop() && r5 < view.getBottom();
    }

    @Nullable
    public View findTopChildUnder(int r4, int r5) {
        for (int childCount = this.mParentView.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.mParentView.getChildAt(this.mCallback.getOrderedChildIndex(childCount));
            if (r4 >= childAt.getLeft() && r4 < childAt.getRight() && r5 >= childAt.getTop() && r5 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    private int getEdgesTouched(int r4, int r5) {
        int r0 = r4 < this.mParentView.getLeft() + this.mEdgeSize ? 1 : 0;
        if (r5 < this.mParentView.getTop() + this.mEdgeSize) {
            r0 |= 4;
        }
        if (r4 > this.mParentView.getRight() - this.mEdgeSize) {
            r0 |= 2;
        }
        return r5 > this.mParentView.getBottom() - this.mEdgeSize ? r0 | 8 : r0;
    }

    private boolean isValidPointerForActionMove(int r4) {
        if (isPointerDown(r4)) {
            return true;
        }
        Log.e(TAG, "Ignoring pointerId=" + r4 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }
}
