package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes21.dex */
public class VectorDrawableCompat extends VectorDrawableCommon {
    private static final boolean DBG_VECTOR_DRAWABLE = false;
    static final PorterDuff.Mode DEFAULT_TINT_MODE = PorterDuff.Mode.SRC_IN;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    static final String LOGTAG = "VectorDrawableCompat";
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final String SHAPE_CLIP_PATH = "clip-path";
    private static final String SHAPE_GROUP = "group";
    private static final String SHAPE_PATH = "path";
    private static final String SHAPE_VECTOR = "vector";
    private boolean mAllowCaching;
    private Drawable.ConstantState mCachedConstantStateDelegate;
    private ColorFilter mColorFilter;
    private boolean mMutated;
    private PorterDuffColorFilter mTintFilter;
    private final Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final Matrix mTmpMatrix;
    private VectorDrawableCompatState mVectorState;

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int r1) {
        super.setChangingConfigurations(r1);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int r1, PorterDuff.Mode mode) {
        super.setColorFilter(r1, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int r1, int r2, int r3, int r4) {
        super.setHotspotBounds(r1, r2, r3, r4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] r2) {
        return super.setState(r2);
    }

    VectorDrawableCompat() {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = new VectorDrawableCompatState();
    }

    VectorDrawableCompat(@NonNull VectorDrawableCompatState vectorDrawableCompatState) {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new Matrix();
        this.mTmpBounds = new Rect();
        this.mVectorState = vectorDrawableCompatState;
        this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.mutate();
        } else if (!this.mMutated && super.mutate() == this) {
            this.mVectorState = new VectorDrawableCompatState(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    Object getTargetByName(String str) {
        return this.mVectorState.mVPathRenderer.mVGTargetsMap.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null && Build.VERSION.SDK_INT >= 24) {
            return new VectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.mChangingConfigurations = getChangingConfigurations();
        return this.mVectorState;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.draw(canvas);
            return;
        }
        copyBounds(this.mTmpBounds);
        if (this.mTmpBounds.width() > 0 && this.mTmpBounds.height() > 0) {
            ColorFilter colorFilter = this.mColorFilter == null ? this.mTintFilter : this.mColorFilter;
            canvas.getMatrix(this.mTmpMatrix);
            this.mTmpMatrix.getValues(this.mTmpFloats);
            float abs = Math.abs(this.mTmpFloats[0]);
            float abs2 = Math.abs(this.mTmpFloats[4]);
            float abs3 = Math.abs(this.mTmpFloats[1]);
            float abs4 = Math.abs(this.mTmpFloats[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int min = Math.min(2048, (int) (abs * this.mTmpBounds.width()));
            int min2 = Math.min(2048, (int) (abs2 * this.mTmpBounds.height()));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(this.mTmpBounds.left, this.mTmpBounds.top);
                if (needMirroring()) {
                    canvas.translate(this.mTmpBounds.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.mTmpBounds.offsetTo(0, 0);
                this.mVectorState.createCachedBitmapIfNeeded(min, min2);
                if (!this.mAllowCaching) {
                    this.mVectorState.updateCachedBitmap(min, min2);
                } else if (!this.mVectorState.canReuseCache()) {
                    this.mVectorState.updateCachedBitmap(min, min2);
                    this.mVectorState.updateCacheStates();
                }
                this.mVectorState.drawCachedBitmapWithRootAlpha(canvas, colorFilter, this.mTmpBounds);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.mDelegateDrawable != null ? DrawableCompat.getAlpha(this.mDelegateDrawable) : this.mVectorState.mVPathRenderer.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAlpha(r2);
        } else if (this.mVectorState.mVPathRenderer.getRootAlpha() != r2) {
            this.mVectorState.mVPathRenderer.setRootAlpha(r2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setColorFilter(colorFilter);
        } else {
            this.mColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.mDelegateDrawable != null ? DrawableCompat.getColorFilter(this.mDelegateDrawable) : this.mColorFilter;
    }

    PorterDuffColorFilter updateTintFilter(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r2) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTint(this.mDelegateDrawable, r2);
        } else {
            setTintList(ColorStateList.valueOf(r2));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintList(this.mDelegateDrawable, colorStateList);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint != colorStateList) {
            vectorDrawableCompatState.mTint = colorStateList;
            this.mTintFilter = updateTintFilter(this.mTintFilter, colorStateList, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setTintMode(this.mDelegateDrawable, mode);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTintMode != mode) {
            vectorDrawableCompatState.mTintMode = mode;
            this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.isStateful();
        }
        return super.isStateful() || (this.mVectorState != null && (this.mVectorState.isStateful() || (this.mVectorState.mTint != null && this.mVectorState.mTint.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r6) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setState(r6);
        }
        boolean z = false;
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint != null && vectorDrawableCompatState.mTintMode != null) {
            this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
            z = true;
        }
        if (vectorDrawableCompatState.isStateful() && vectorDrawableCompatState.onStateChanged(r6)) {
            invalidateSelf();
            return true;
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.mDelegateDrawable != null ? this.mDelegateDrawable.getIntrinsicWidth() : (int) this.mVectorState.mVPathRenderer.mBaseWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.mDelegateDrawable != null ? this.mDelegateDrawable.getIntrinsicHeight() : (int) this.mVectorState.mVPathRenderer.mBaseHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.canApplyTheme(this.mDelegateDrawable);
            return false;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.mDelegateDrawable != null ? DrawableCompat.isAutoMirrored(this.mDelegateDrawable) : this.mVectorState.mAutoMirrored;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.setAutoMirrored(this.mDelegateDrawable, z);
        } else {
            this.mVectorState.mAutoMirrored = z;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public float getPixelSize() {
        if (this.mVectorState == null || this.mVectorState.mVPathRenderer == null || this.mVectorState.mVPathRenderer.mBaseWidth == 0.0f || this.mVectorState.mVPathRenderer.mBaseHeight == 0.0f || this.mVectorState.mVPathRenderer.mViewportHeight == 0.0f || this.mVectorState.mVPathRenderer.mViewportWidth == 0.0f) {
            return 1.0f;
        }
        float f = this.mVectorState.mVPathRenderer.mBaseWidth;
        float f2 = this.mVectorState.mVPathRenderer.mBaseHeight;
        return Math.min(this.mVectorState.mVPathRenderer.mViewportWidth / f, this.mVectorState.mVPathRenderer.mViewportHeight / f2);
    }

    @Nullable
    public static VectorDrawableCompat create(@NonNull Resources resources, @DrawableRes int r6, @Nullable Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, r6, theme);
            vectorDrawableCompat.mCachedConstantStateDelegate = new VectorDrawableDelegateState(vectorDrawableCompat.mDelegateDrawable.getConstantState());
            return vectorDrawableCompat;
        }
        try {
            XmlResourceParser xml = resources.getXml(r6);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(resources, (XmlPullParser) xml, asAttributeSet, theme);
        } catch (IOException e) {
            Log.e(LOGTAG, "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e(LOGTAG, "parser error", e2);
            return null;
        }
    }

    public static VectorDrawableCompat createFromXmlInner(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int applyAlpha(int r2, float f) {
        return (((int) (Color.alpha(r2) * f)) << 24) | (16777215 & r2);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        if (this.mDelegateDrawable != null) {
            DrawableCompat.inflate(this.mDelegateDrawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        vectorDrawableCompatState.mVPathRenderer = new VPathRenderer();
        TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
        updateStateFromTypedArray(obtainAttributes, xmlPullParser, theme);
        obtainAttributes.recycle();
        vectorDrawableCompatState.mChangingConfigurations = getChangingConfigurations();
        vectorDrawableCompatState.mCacheDirty = true;
        inflateInternal(resources, xmlPullParser, attributeSet, theme);
        this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    private static PorterDuff.Mode parseTintModeCompat(int r0, PorterDuff.Mode mode) {
        switch (r0) {
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                return mode;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
        }
    }

    private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        vectorDrawableCompatState.mTintMode = parseTintModeCompat(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            vectorDrawableCompatState.mTint = namedColorStateList;
        }
        vectorDrawableCompatState.mAutoMirrored = TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.mAutoMirrored);
        vPathRenderer.mViewportWidth = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.mViewportWidth);
        vPathRenderer.mViewportHeight = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.mViewportHeight);
        if (vPathRenderer.mViewportWidth <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (vPathRenderer.mViewportHeight <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.mBaseWidth = typedArray.getDimension(3, vPathRenderer.mBaseWidth);
        vPathRenderer.mBaseHeight = typedArray.getDimension(2, vPathRenderer.mBaseHeight);
        if (vPathRenderer.mBaseWidth <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (vPathRenderer.mBaseHeight <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        vPathRenderer.setAlpha(TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            vPathRenderer.mRootName = string;
            vPathRenderer.mVGTargetsMap.put(string, vPathRenderer);
        }
    }

    private void inflateInternal(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        boolean z;
        VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(vPathRenderer.mRootGroup);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                VGroup vGroup = (VGroup) arrayDeque.peek();
                if ("path".equals(name)) {
                    VFullPath vFullPath = new VFullPath();
                    vFullPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vFullPath.getPathName(), vFullPath);
                    }
                    z = false;
                    vectorDrawableCompatState.mChangingConfigurations = vFullPath.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                } else if (SHAPE_CLIP_PATH.equals(name)) {
                    VClipPath vClipPath = new VClipPath();
                    vClipPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vClipPath);
                    if (vClipPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vClipPath.getPathName(), vClipPath);
                    }
                    vectorDrawableCompatState.mChangingConfigurations |= vClipPath.mChangingConfigurations;
                    z = z2;
                } else {
                    if (SHAPE_GROUP.equals(name)) {
                        VGroup vGroup2 = new VGroup();
                        vGroup2.inflate(resources, attributeSet, theme, xmlPullParser);
                        vGroup.mChildren.add(vGroup2);
                        arrayDeque.push(vGroup2);
                        if (vGroup2.getGroupName() != null) {
                            vPathRenderer.mVGTargetsMap.put(vGroup2.getGroupName(), vGroup2);
                        }
                        vectorDrawableCompatState.mChangingConfigurations |= vGroup2.mChangingConfigurations;
                    }
                    z = z2;
                }
                z2 = z;
            } else if (eventType == 3 && SHAPE_GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private void printGroupTree(VGroup vGroup, int r7) {
        int r0 = 0;
        String str = "";
        for (int r1 = 0; r1 < r7; r1++) {
            str = str + "    ";
        }
        Log.v(LOGTAG, str + "current group is :" + vGroup.getGroupName() + " rotation is " + vGroup.mRotate);
        Log.v(LOGTAG, str + "matrix is :" + vGroup.getLocalMatrix().toString());
        while (true) {
            int r12 = r0;
            if (r12 < vGroup.mChildren.size()) {
                VObject vObject = vGroup.mChildren.get(r12);
                if (vObject instanceof VGroup) {
                    printGroupTree((VGroup) vObject, r7 + 1);
                } else {
                    ((VPath) vObject).printVPath(r7 + 1);
                }
                r0 = r12 + 1;
            } else {
                return;
            }
        }
    }

    void setAllowCaching(boolean z) {
        this.mAllowCaching = z;
    }

    private boolean needMirroring() {
        if (Build.VERSION.SDK_INT >= 17) {
            return isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1;
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.mDelegateDrawable != null ? this.mDelegateDrawable.getChangingConfigurations() : super.getChangingConfigurations() | this.mVectorState.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        return this.mDelegateDrawable != null ? this.mDelegateDrawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @RequiresApi(24)
    private static class VectorDrawableDelegateState extends Drawable.ConstantState {
        private final Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (VectorDrawable) this.mDelegateState.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.mDelegateState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mDelegateState.getChangingConfigurations();
        }
    }

    private static class VectorDrawableCompatState extends Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCacheDirty;
        boolean mCachedAutoMirrored;
        Bitmap mCachedBitmap;
        int mCachedRootAlpha;
        int[] mCachedThemeAttrs;
        ColorStateList mCachedTint;
        PorterDuff.Mode mCachedTintMode;
        int mChangingConfigurations;
        Paint mTempPaint;
        ColorStateList mTint;
        PorterDuff.Mode mTintMode;
        VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState(VectorDrawableCompatState vectorDrawableCompatState) {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
            if (vectorDrawableCompatState != null) {
                this.mChangingConfigurations = vectorDrawableCompatState.mChangingConfigurations;
                this.mVPathRenderer = new VPathRenderer(vectorDrawableCompatState.mVPathRenderer);
                if (vectorDrawableCompatState.mVPathRenderer.mFillPaint != null) {
                    this.mVPathRenderer.mFillPaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mFillPaint);
                }
                if (vectorDrawableCompatState.mVPathRenderer.mStrokePaint != null) {
                    this.mVPathRenderer.mStrokePaint = new Paint(vectorDrawableCompatState.mVPathRenderer.mStrokePaint);
                }
                this.mTint = vectorDrawableCompatState.mTint;
                this.mTintMode = vectorDrawableCompatState.mTintMode;
                this.mAutoMirrored = vectorDrawableCompatState.mAutoMirrored;
            }
        }

        public void drawCachedBitmapWithRootAlpha(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.mCachedBitmap, (Rect) null, rect, getPaint(colorFilter));
        }

        public boolean hasTranslucentRoot() {
            return this.mVPathRenderer.getRootAlpha() < 255;
        }

        public Paint getPaint(ColorFilter colorFilter) {
            if (!hasTranslucentRoot() && colorFilter == null) {
                return null;
            }
            if (this.mTempPaint == null) {
                this.mTempPaint = new Paint();
                this.mTempPaint.setFilterBitmap(true);
            }
            this.mTempPaint.setAlpha(this.mVPathRenderer.getRootAlpha());
            this.mTempPaint.setColorFilter(colorFilter);
            return this.mTempPaint;
        }

        public void updateCachedBitmap(int r4, int r5) {
            this.mCachedBitmap.eraseColor(0);
            this.mVPathRenderer.draw(new Canvas(this.mCachedBitmap), r4, r5, null);
        }

        public void createCachedBitmapIfNeeded(int r2, int r3) {
            if (this.mCachedBitmap == null || !canReuseBitmap(r2, r3)) {
                this.mCachedBitmap = Bitmap.createBitmap(r2, r3, Bitmap.Config.ARGB_8888);
                this.mCacheDirty = true;
            }
        }

        public boolean canReuseBitmap(int r2, int r3) {
            return r2 == this.mCachedBitmap.getWidth() && r3 == this.mCachedBitmap.getHeight();
        }

        public boolean canReuseCache() {
            return !this.mCacheDirty && this.mCachedTint == this.mTint && this.mCachedTintMode == this.mTintMode && this.mCachedAutoMirrored == this.mAutoMirrored && this.mCachedRootAlpha == this.mVPathRenderer.getRootAlpha();
        }

        public void updateCacheStates() {
            this.mCachedTint = this.mTint;
            this.mCachedTintMode = this.mTintMode;
            this.mCachedRootAlpha = this.mVPathRenderer.getRootAlpha();
            this.mCachedAutoMirrored = this.mAutoMirrored;
            this.mCacheDirty = false;
        }

        public VectorDrawableCompatState() {
            this.mTint = null;
            this.mTintMode = VectorDrawableCompat.DEFAULT_TINT_MODE;
            this.mVPathRenderer = new VPathRenderer();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        public boolean isStateful() {
            return this.mVPathRenderer.isStateful();
        }

        public boolean onStateChanged(int[] r3) {
            boolean onStateChanged = this.mVPathRenderer.onStateChanged(r3);
            this.mCacheDirty |= onStateChanged;
            return onStateChanged;
        }
    }

    private static class VPathRenderer {
        private static final Matrix IDENTITY_MATRIX = new Matrix();
        float mBaseHeight;
        float mBaseWidth;
        private int mChangingConfigurations;
        Paint mFillPaint;
        private final Matrix mFinalPathMatrix;
        Boolean mIsStateful;
        private final Path mPath;
        private PathMeasure mPathMeasure;
        private final Path mRenderPath;
        int mRootAlpha;
        final VGroup mRootGroup;
        String mRootName;
        Paint mStrokePaint;
        final ArrayMap<String, Object> mVGTargetsMap;
        float mViewportHeight;
        float mViewportWidth;

        public VPathRenderer() {
            this.mFinalPathMatrix = new Matrix();
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            this.mVGTargetsMap = new ArrayMap<>();
            this.mRootGroup = new VGroup();
            this.mPath = new Path();
            this.mRenderPath = new Path();
        }

        public void setRootAlpha(int r1) {
            this.mRootAlpha = r1;
        }

        public int getRootAlpha() {
            return this.mRootAlpha;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (255.0f * f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public VPathRenderer(VPathRenderer vPathRenderer) {
            this.mFinalPathMatrix = new Matrix();
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            this.mVGTargetsMap = new ArrayMap<>();
            this.mRootGroup = new VGroup(vPathRenderer.mRootGroup, this.mVGTargetsMap);
            this.mPath = new Path(vPathRenderer.mPath);
            this.mRenderPath = new Path(vPathRenderer.mRenderPath);
            this.mBaseWidth = vPathRenderer.mBaseWidth;
            this.mBaseHeight = vPathRenderer.mBaseHeight;
            this.mViewportWidth = vPathRenderer.mViewportWidth;
            this.mViewportHeight = vPathRenderer.mViewportHeight;
            this.mChangingConfigurations = vPathRenderer.mChangingConfigurations;
            this.mRootAlpha = vPathRenderer.mRootAlpha;
            this.mRootName = vPathRenderer.mRootName;
            if (vPathRenderer.mRootName != null) {
                this.mVGTargetsMap.put(vPathRenderer.mRootName, this);
            }
            this.mIsStateful = vPathRenderer.mIsStateful;
        }

        private void drawGroupTree(VGroup vGroup, Matrix matrix, Canvas canvas, int r12, int r13, ColorFilter colorFilter) {
            vGroup.mStackedMatrix.set(matrix);
            vGroup.mStackedMatrix.preConcat(vGroup.mLocalMatrix);
            canvas.save();
            int r0 = 0;
            while (true) {
                int r7 = r0;
                if (r7 < vGroup.mChildren.size()) {
                    VObject vObject = vGroup.mChildren.get(r7);
                    if (vObject instanceof VGroup) {
                        drawGroupTree((VGroup) vObject, vGroup.mStackedMatrix, canvas, r12, r13, colorFilter);
                    } else if (vObject instanceof VPath) {
                        drawPath(vGroup, (VPath) vObject, canvas, r12, r13, colorFilter);
                    }
                    r0 = r7 + 1;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public void draw(Canvas canvas, int r9, int r10, ColorFilter colorFilter) {
            drawGroupTree(this.mRootGroup, IDENTITY_MATRIX, canvas, r9, r10, colorFilter);
        }

        private void drawPath(VGroup vGroup, VPath vPath, Canvas canvas, int r12, int r13, ColorFilter colorFilter) {
            float f = r12 / this.mViewportWidth;
            float f2 = r13 / this.mViewportHeight;
            float min = Math.min(f, f2);
            Matrix matrix = vGroup.mStackedMatrix;
            this.mFinalPathMatrix.set(matrix);
            this.mFinalPathMatrix.postScale(f, f2);
            float matrixScale = getMatrixScale(matrix);
            if (matrixScale != 0.0f) {
                vPath.toPath(this.mPath);
                Path path = this.mPath;
                this.mRenderPath.reset();
                if (vPath.isClipPath()) {
                    this.mRenderPath.setFillType(vPath.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.mRenderPath.addPath(path, this.mFinalPathMatrix);
                    canvas.clipPath(this.mRenderPath);
                    return;
                }
                VFullPath vFullPath = (VFullPath) vPath;
                if (vFullPath.mTrimPathStart != 0.0f || vFullPath.mTrimPathEnd != 1.0f) {
                    float f3 = (vFullPath.mTrimPathStart + vFullPath.mTrimPathOffset) % 1.0f;
                    float f4 = (vFullPath.mTrimPathEnd + vFullPath.mTrimPathOffset) % 1.0f;
                    if (this.mPathMeasure == null) {
                        this.mPathMeasure = new PathMeasure();
                    }
                    this.mPathMeasure.setPath(this.mPath, false);
                    float length = this.mPathMeasure.getLength();
                    float f5 = f3 * length;
                    float f6 = f4 * length;
                    path.reset();
                    if (f5 > f6) {
                        this.mPathMeasure.getSegment(f5, length, path, true);
                        this.mPathMeasure.getSegment(0.0f, f6, path, true);
                    } else {
                        this.mPathMeasure.getSegment(f5, f6, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.mRenderPath.addPath(path, this.mFinalPathMatrix);
                if (vFullPath.mFillColor.willDraw()) {
                    ComplexColorCompat complexColorCompat = vFullPath.mFillColor;
                    if (this.mFillPaint == null) {
                        this.mFillPaint = new Paint(1);
                        this.mFillPaint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint = this.mFillPaint;
                    if (complexColorCompat.isGradient()) {
                        Shader shader = complexColorCompat.getShader();
                        shader.setLocalMatrix(this.mFinalPathMatrix);
                        paint.setShader(shader);
                        paint.setAlpha(Math.round(vFullPath.mFillAlpha * 255.0f));
                    } else {
                        paint.setShader(null);
                        paint.setAlpha(255);
                        paint.setColor(VectorDrawableCompat.applyAlpha(complexColorCompat.getColor(), vFullPath.mFillAlpha));
                    }
                    paint.setColorFilter(colorFilter);
                    this.mRenderPath.setFillType(vFullPath.mFillRule == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.mRenderPath, paint);
                }
                if (vFullPath.mStrokeColor.willDraw()) {
                    ComplexColorCompat complexColorCompat2 = vFullPath.mStrokeColor;
                    if (this.mStrokePaint == null) {
                        this.mStrokePaint = new Paint(1);
                        this.mStrokePaint.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint2 = this.mStrokePaint;
                    if (vFullPath.mStrokeLineJoin != null) {
                        paint2.setStrokeJoin(vFullPath.mStrokeLineJoin);
                    }
                    if (vFullPath.mStrokeLineCap != null) {
                        paint2.setStrokeCap(vFullPath.mStrokeLineCap);
                    }
                    paint2.setStrokeMiter(vFullPath.mStrokeMiterlimit);
                    if (complexColorCompat2.isGradient()) {
                        Shader shader2 = complexColorCompat2.getShader();
                        shader2.setLocalMatrix(this.mFinalPathMatrix);
                        paint2.setShader(shader2);
                        paint2.setAlpha(Math.round(vFullPath.mStrokeAlpha * 255.0f));
                    } else {
                        paint2.setShader(null);
                        paint2.setAlpha(255);
                        paint2.setColor(VectorDrawableCompat.applyAlpha(complexColorCompat2.getColor(), vFullPath.mStrokeAlpha));
                    }
                    paint2.setColorFilter(colorFilter);
                    paint2.setStrokeWidth(min * matrixScale * vFullPath.mStrokeWidth);
                    canvas.drawPath(this.mRenderPath, paint2);
                }
            }
        }

        private static float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private float getMatrixScale(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float cross = cross(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(cross) / max;
            }
            return 0.0f;
        }

        public boolean isStateful() {
            if (this.mIsStateful == null) {
                this.mIsStateful = Boolean.valueOf(this.mRootGroup.isStateful());
            }
            return this.mIsStateful.booleanValue();
        }

        public boolean onStateChanged(int[] r2) {
            return this.mRootGroup.onStateChanged(r2);
        }
    }

    private static abstract class VObject {
        private VObject() {
        }

        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] r2) {
            return false;
        }
    }

    private static class VGroup extends VObject {
        int mChangingConfigurations;
        final ArrayList<VObject> mChildren;
        private String mGroupName;
        final Matrix mLocalMatrix;
        private float mPivotX;
        private float mPivotY;
        float mRotate;
        private float mScaleX;
        private float mScaleY;
        final Matrix mStackedMatrix;
        private int[] mThemeAttrs;
        private float mTranslateX;
        private float mTranslateY;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v8, types: [androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VFullPath] */
        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.collection.ArrayMap, androidx.collection.ArrayMap<java.lang.String, java.lang.Object>] */
        public VGroup(VGroup vGroup, ArrayMap<String, Object> arrayMap) {
            super();
            VClipPath vClipPath;
            this.mStackedMatrix = new Matrix();
            this.mChildren = new ArrayList<>();
            this.mRotate = 0.0f;
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            this.mLocalMatrix = new Matrix();
            this.mGroupName = null;
            this.mRotate = vGroup.mRotate;
            this.mPivotX = vGroup.mPivotX;
            this.mPivotY = vGroup.mPivotY;
            this.mScaleX = vGroup.mScaleX;
            this.mScaleY = vGroup.mScaleY;
            this.mTranslateX = vGroup.mTranslateX;
            this.mTranslateY = vGroup.mTranslateY;
            this.mThemeAttrs = vGroup.mThemeAttrs;
            this.mGroupName = vGroup.mGroupName;
            this.mChangingConfigurations = vGroup.mChangingConfigurations;
            if (this.mGroupName != null) {
                arrayMap.put(this.mGroupName, this);
            }
            this.mLocalMatrix.set(vGroup.mLocalMatrix);
            ArrayList<VObject> arrayList = vGroup.mChildren;
            int r0 = 0;
            while (true) {
                int r1 = r0;
                if (r1 < arrayList.size()) {
                    VObject vObject = arrayList.get(r1);
                    if (vObject instanceof VGroup) {
                        this.mChildren.add(new VGroup((VGroup) vObject, arrayMap));
                    } else {
                        if (vObject instanceof VFullPath) {
                            vClipPath = new VFullPath((VFullPath) vObject);
                        } else if (vObject instanceof VClipPath) {
                            vClipPath = new VClipPath((VClipPath) vObject);
                        } else {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        this.mChildren.add(vClipPath);
                        if (vClipPath.mPathName != null) {
                            arrayMap.put(vClipPath.mPathName, vClipPath);
                        }
                    }
                    r0 = r1 + 1;
                } else {
                    return;
                }
            }
        }

        public VGroup() {
            super();
            this.mStackedMatrix = new Matrix();
            this.mChildren = new ArrayList<>();
            this.mRotate = 0.0f;
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            this.mLocalMatrix = new Matrix();
            this.mGroupName = null;
        }

        public String getGroupName() {
            return this.mGroupName;
        }

        public Matrix getLocalMatrix() {
            return this.mLocalMatrix;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
            updateStateFromTypedArray(obtainAttributes, xmlPullParser);
            obtainAttributes.recycle();
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.mThemeAttrs = null;
            this.mRotate = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, Key.ROTATION, 5, this.mRotate);
            this.mPivotX = typedArray.getFloat(1, this.mPivotX);
            this.mPivotY = typedArray.getFloat(2, this.mPivotY);
            this.mScaleX = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.mScaleX);
            this.mScaleY = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.mScaleY);
            this.mTranslateX = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.mTranslateX);
            this.mTranslateY = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.mTranslateY);
            String string = typedArray.getString(0);
            if (string != null) {
                this.mGroupName = string;
            }
            updateLocalMatrix();
        }

        private void updateLocalMatrix() {
            this.mLocalMatrix.reset();
            this.mLocalMatrix.postTranslate(-this.mPivotX, -this.mPivotY);
            this.mLocalMatrix.postScale(this.mScaleX, this.mScaleY);
            this.mLocalMatrix.postRotate(this.mRotate, 0.0f, 0.0f);
            this.mLocalMatrix.postTranslate(this.mTranslateX + this.mPivotX, this.mTranslateY + this.mPivotY);
        }

        public float getRotation() {
            return this.mRotate;
        }

        public void setRotation(float f) {
            if (f != this.mRotate) {
                this.mRotate = f;
                updateLocalMatrix();
            }
        }

        public float getPivotX() {
            return this.mPivotX;
        }

        public void setPivotX(float f) {
            if (f != this.mPivotX) {
                this.mPivotX = f;
                updateLocalMatrix();
            }
        }

        public float getPivotY() {
            return this.mPivotY;
        }

        public void setPivotY(float f) {
            if (f != this.mPivotY) {
                this.mPivotY = f;
                updateLocalMatrix();
            }
        }

        public float getScaleX() {
            return this.mScaleX;
        }

        public void setScaleX(float f) {
            if (f != this.mScaleX) {
                this.mScaleX = f;
                updateLocalMatrix();
            }
        }

        public float getScaleY() {
            return this.mScaleY;
        }

        public void setScaleY(float f) {
            if (f != this.mScaleY) {
                this.mScaleY = f;
                updateLocalMatrix();
            }
        }

        public float getTranslateX() {
            return this.mTranslateX;
        }

        public void setTranslateX(float f) {
            if (f != this.mTranslateX) {
                this.mTranslateX = f;
                updateLocalMatrix();
            }
        }

        public float getTranslateY() {
            return this.mTranslateY;
        }

        public void setTranslateY(float f) {
            if (f != this.mTranslateY) {
                this.mTranslateY = f;
                updateLocalMatrix();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            for (int r1 = 0; r1 < this.mChildren.size(); r1++) {
                if (this.mChildren.get(r1).isStateful()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r4) {
            boolean z = false;
            for (int r1 = 0; r1 < this.mChildren.size(); r1++) {
                z |= this.mChildren.get(r1).onStateChanged(r4);
            }
            return z;
        }
    }

    private static abstract class VPath extends VObject {
        protected static final int FILL_TYPE_WINDING = 0;
        int mChangingConfigurations;
        int mFillRule;
        protected PathParser.PathDataNode[] mNodes;
        String mPathName;

        public VPath() {
            super();
            this.mNodes = null;
            this.mFillRule = 0;
        }

        public void printVPath(int r4) {
            String str = "";
            for (int r0 = 0; r0 < r4; r0++) {
                str = str + "    ";
            }
            Log.v(VectorDrawableCompat.LOGTAG, str + "current path is :" + this.mPathName + " pathData is " + nodesToString(this.mNodes));
        }

        public String nodesToString(PathParser.PathDataNode[] pathDataNodeArr) {
            String str = " ";
            for (int r3 = 0; r3 < pathDataNodeArr.length; r3++) {
                str = str + pathDataNodeArr[r3].mType + ":";
                for (float f : pathDataNodeArr[r3].mParams) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        public VPath(VPath vPath) {
            super();
            this.mNodes = null;
            this.mFillRule = 0;
            this.mPathName = vPath.mPathName;
            this.mChangingConfigurations = vPath.mChangingConfigurations;
            this.mNodes = PathParser.deepCopyNodes(vPath.mNodes);
        }

        public void toPath(Path path) {
            path.reset();
            if (this.mNodes != null) {
                PathParser.PathDataNode.nodesToPath(this.mNodes, path);
            }
        }

        public String getPathName() {
            return this.mPathName;
        }

        public boolean canApplyTheme() {
            return false;
        }

        public void applyTheme(Resources.Theme theme) {
        }

        public boolean isClipPath() {
            return false;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.mNodes;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (!PathParser.canMorph(this.mNodes, pathDataNodeArr)) {
                this.mNodes = PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                PathParser.updateNodes(this.mNodes, pathDataNodeArr);
            }
        }
    }

    private static class VClipPath extends VPath {
        VClipPath() {
        }

        VClipPath(VClipPath vClipPath) {
            super(vClipPath);
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
                updateStateFromTypedArray(obtainAttributes, xmlPullParser);
                obtainAttributes.recycle();
            }
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.mPathName = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.mNodes = PathParser.createNodesFromPathData(string2);
            }
            this.mFillRule = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean isClipPath() {
            return true;
        }
    }

    private static class VFullPath extends VPath {
        float mFillAlpha;
        ComplexColorCompat mFillColor;
        float mStrokeAlpha;
        ComplexColorCompat mStrokeColor;
        Paint.Cap mStrokeLineCap;
        Paint.Join mStrokeLineJoin;
        float mStrokeMiterlimit;
        float mStrokeWidth;
        private int[] mThemeAttrs;
        float mTrimPathEnd;
        float mTrimPathOffset;
        float mTrimPathStart;

        VFullPath() {
            this.mStrokeWidth = 0.0f;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = Paint.Cap.BUTT;
            this.mStrokeLineJoin = Paint.Join.MITER;
            this.mStrokeMiterlimit = 4.0f;
        }

        VFullPath(VFullPath vFullPath) {
            super(vFullPath);
            this.mStrokeWidth = 0.0f;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = Paint.Cap.BUTT;
            this.mStrokeLineJoin = Paint.Join.MITER;
            this.mStrokeMiterlimit = 4.0f;
            this.mThemeAttrs = vFullPath.mThemeAttrs;
            this.mStrokeColor = vFullPath.mStrokeColor;
            this.mStrokeWidth = vFullPath.mStrokeWidth;
            this.mStrokeAlpha = vFullPath.mStrokeAlpha;
            this.mFillColor = vFullPath.mFillColor;
            this.mFillRule = vFullPath.mFillRule;
            this.mFillAlpha = vFullPath.mFillAlpha;
            this.mTrimPathStart = vFullPath.mTrimPathStart;
            this.mTrimPathEnd = vFullPath.mTrimPathEnd;
            this.mTrimPathOffset = vFullPath.mTrimPathOffset;
            this.mStrokeLineCap = vFullPath.mStrokeLineCap;
            this.mStrokeLineJoin = vFullPath.mStrokeLineJoin;
            this.mStrokeMiterlimit = vFullPath.mStrokeMiterlimit;
        }

        private Paint.Cap getStrokeLineCap(int r1, Paint.Cap cap) {
            switch (r1) {
                case 0:
                    return Paint.Cap.BUTT;
                case 1:
                    return Paint.Cap.ROUND;
                case 2:
                    return Paint.Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private Paint.Join getStrokeLineJoin(int r1, Paint.Join join) {
            switch (r1) {
                case 0:
                    return Paint.Join.MITER;
                case 1:
                    return Paint.Join.ROUND;
                case 2:
                    return Paint.Join.BEVEL;
                default:
                    return join;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean canApplyTheme() {
            return this.mThemeAttrs != null;
        }

        public void inflate(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray obtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
            updateStateFromTypedArray(obtainAttributes, xmlPullParser, theme);
            obtainAttributes.recycle();
        }

        private void updateStateFromTypedArray(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.mThemeAttrs = null;
            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.mPathName = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.mNodes = PathParser.createNodesFromPathData(string2);
                }
                this.mFillColor = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.mFillAlpha = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.mFillAlpha);
                this.mStrokeLineCap = getStrokeLineCap(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.mStrokeLineCap);
                this.mStrokeLineJoin = getStrokeLineJoin(TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.mStrokeLineJoin);
                this.mStrokeMiterlimit = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.mStrokeMiterlimit);
                this.mStrokeColor = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.mStrokeAlpha = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.mStrokeAlpha);
                this.mStrokeWidth = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.mStrokeWidth);
                this.mTrimPathEnd = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.mTrimPathEnd);
                this.mTrimPathOffset = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.mTrimPathOffset);
                this.mTrimPathStart = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.mTrimPathStart);
                this.mFillRule = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.mFillRule);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            return this.mFillColor.isStateful() || this.mStrokeColor.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] r3) {
            return this.mFillColor.onStateChanged(r3) | this.mStrokeColor.onStateChanged(r3);
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public void applyTheme(Resources.Theme theme) {
            if (this.mThemeAttrs == null) {
            }
        }

        @ColorInt
        int getStrokeColor() {
            return this.mStrokeColor.getColor();
        }

        void setStrokeColor(int r2) {
            this.mStrokeColor.setColor(r2);
        }

        float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
        }

        float getStrokeAlpha() {
            return this.mStrokeAlpha;
        }

        void setStrokeAlpha(float f) {
            this.mStrokeAlpha = f;
        }

        @ColorInt
        int getFillColor() {
            return this.mFillColor.getColor();
        }

        void setFillColor(int r2) {
            this.mFillColor.setColor(r2);
        }

        float getFillAlpha() {
            return this.mFillAlpha;
        }

        void setFillAlpha(float f) {
            this.mFillAlpha = f;
        }

        float getTrimPathStart() {
            return this.mTrimPathStart;
        }

        void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }

        float getTrimPathEnd() {
            return this.mTrimPathEnd;
        }

        void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        float getTrimPathOffset() {
            return this.mTrimPathOffset;
        }

        void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }
    }
}
