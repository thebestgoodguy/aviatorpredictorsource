package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

/* loaded from: classes37.dex */
class MaterialButtonHelper {
    private static final boolean IS_LOLLIPOP;
    private static final boolean IS_MIN_LOLLIPOP;
    private ColorStateList backgroundTint;
    private PorterDuff.Mode backgroundTintMode;
    private boolean checkable;
    private int cornerRadius;
    private int elevation;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    private Drawable maskDrawable;
    private final MaterialButton materialButton;
    private ColorStateList rippleColor;
    private LayerDrawable rippleDrawable;
    private ShapeAppearanceModel shapeAppearanceModel;
    private ColorStateList strokeColor;
    private int strokeWidth;
    private boolean shouldDrawSurfaceColorStroke = false;
    private boolean backgroundOverwritten = false;
    private boolean cornerRadiusSet = false;

    static {
        IS_MIN_LOLLIPOP = Build.VERSION.SDK_INT >= 21;
        IS_LOLLIPOP = Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT <= 22;
    }

    MaterialButtonHelper(MaterialButton button, ShapeAppearanceModel shapeAppearanceModel) {
        this.materialButton = button;
        this.shapeAppearanceModel = shapeAppearanceModel;
    }

    void loadFromAttributes(TypedArray attributes) {
        this.insetLeft = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = attributes.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        if (attributes.hasValue(R.styleable.MaterialButton_cornerRadius)) {
            int dimensionPixelSize = attributes.getDimensionPixelSize(R.styleable.MaterialButton_cornerRadius, -1);
            this.cornerRadius = dimensionPixelSize;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(dimensionPixelSize));
            this.cornerRadiusSet = true;
        }
        this.strokeWidth = attributes.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(attributes.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), attributes, R.styleable.MaterialButton_rippleColor);
        this.checkable = attributes.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.elevation = attributes.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        if (attributes.hasValue(R.styleable.MaterialButton_android_background)) {
            setBackgroundOverwritten();
        } else {
            updateBackground();
        }
        ViewCompat.setPaddingRelative(this.materialButton, this.insetLeft + paddingStart, this.insetTop + paddingTop, this.insetRight + paddingEnd, this.insetBottom + paddingBottom);
    }

    private void updateBackground() {
        this.materialButton.setInternalBackground(createBackground());
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setElevation(this.elevation);
        }
    }

    void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    private InsetDrawable wrapDrawableWithInset(Drawable drawable) {
        return new InsetDrawable(drawable, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }

    void setSupportBackgroundTintList(ColorStateList tintList) {
        if (this.backgroundTint != tintList) {
            this.backgroundTint = tintList;
            if (getMaterialShapeDrawable() != null) {
                DrawableCompat.setTintList(getMaterialShapeDrawable(), this.backgroundTint);
            }
        }
    }

    ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.backgroundTintMode != mode) {
            this.backgroundTintMode = mode;
            if (getMaterialShapeDrawable() != null && this.backgroundTintMode != null) {
                DrawableCompat.setTintMode(getMaterialShapeDrawable(), this.backgroundTintMode);
            }
        }
    }

    PorterDuff.Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    void setShouldDrawSurfaceColorStroke(boolean shouldDrawSurfaceColorStroke) {
        this.shouldDrawSurfaceColorStroke = shouldDrawSurfaceColorStroke;
        updateStroke();
    }

    private Drawable createBackground() {
        int r5;
        MaterialShapeDrawable backgroundDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        Context context = this.materialButton.getContext();
        backgroundDrawable.initializeElevationOverlay(context);
        DrawableCompat.setTintList(backgroundDrawable, this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            DrawableCompat.setTintMode(backgroundDrawable, mode);
        }
        backgroundDrawable.setStroke(this.strokeWidth, this.strokeColor);
        MaterialShapeDrawable surfaceColorStrokeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
        surfaceColorStrokeDrawable.setTint(0);
        float f = this.strokeWidth;
        if (this.shouldDrawSurfaceColorStroke) {
            r5 = MaterialColors.getColor(this.materialButton, R.attr.colorSurface);
        } else {
            r5 = 0;
        }
        surfaceColorStrokeDrawable.setStroke(f, r5);
        if (IS_MIN_LOLLIPOP) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.maskDrawable = materialShapeDrawable;
            DrawableCompat.setTint(materialShapeDrawable, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), wrapDrawableWithInset(new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable})), this.maskDrawable);
            this.rippleDrawable = rippleDrawable;
            return rippleDrawable;
        }
        RippleDrawableCompat rippleDrawableCompat = new RippleDrawableCompat(this.shapeAppearanceModel);
        this.maskDrawable = rippleDrawableCompat;
        DrawableCompat.setTintList(rippleDrawableCompat, RippleUtils.sanitizeRippleDrawableColor(this.rippleColor));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{surfaceColorStrokeDrawable, backgroundDrawable, this.maskDrawable});
        this.rippleDrawable = layerDrawable;
        return wrapDrawableWithInset(layerDrawable);
    }

    void updateMaskBounds(int height, int width) {
        Drawable drawable = this.maskDrawable;
        if (drawable != null) {
            drawable.setBounds(this.insetLeft, this.insetTop, width - this.insetRight, height - this.insetBottom);
        }
    }

    void setBackgroundColor(int color) {
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setTint(color);
        }
    }

    void setRippleColor(ColorStateList rippleColor) {
        if (this.rippleColor != rippleColor) {
            this.rippleColor = rippleColor;
            boolean z = IS_MIN_LOLLIPOP;
            if (z && (this.materialButton.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(rippleColor));
            } else if (!z && (this.materialButton.getBackground() instanceof RippleDrawableCompat)) {
                ((RippleDrawableCompat) this.materialButton.getBackground()).setTintList(RippleUtils.sanitizeRippleDrawableColor(rippleColor));
            }
        }
    }

    ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    void setStrokeColor(ColorStateList strokeColor) {
        if (this.strokeColor != strokeColor) {
            this.strokeColor = strokeColor;
            updateStroke();
        }
    }

    ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    void setStrokeWidth(int strokeWidth) {
        if (this.strokeWidth != strokeWidth) {
            this.strokeWidth = strokeWidth;
            updateStroke();
        }
    }

    int getStrokeWidth() {
        return this.strokeWidth;
    }

    private void updateStroke() {
        int r3;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable();
        MaterialShapeDrawable surfaceColorStrokeDrawable = getSurfaceColorStrokeDrawable();
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setStroke(this.strokeWidth, this.strokeColor);
            if (surfaceColorStrokeDrawable != null) {
                float f = this.strokeWidth;
                if (this.shouldDrawSurfaceColorStroke) {
                    r3 = MaterialColors.getColor(this.materialButton, R.attr.colorSurface);
                } else {
                    r3 = 0;
                }
                surfaceColorStrokeDrawable.setStroke(f, r3);
            }
        }
    }

    void setCornerRadius(int cornerRadius) {
        if (!this.cornerRadiusSet || this.cornerRadius != cornerRadius) {
            this.cornerRadius = cornerRadius;
            this.cornerRadiusSet = true;
            setShapeAppearanceModel(this.shapeAppearanceModel.withCornerSize(cornerRadius));
        }
    }

    int getCornerRadius() {
        return this.cornerRadius;
    }

    private MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (IS_MIN_LOLLIPOP) {
                return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (MaterialShapeDrawable) this.rippleDrawable.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    MaterialShapeDrawable getMaterialShapeDrawable() {
        return getMaterialShapeDrawable(false);
    }

    void setCheckable(boolean checkable) {
        this.checkable = checkable;
    }

    boolean isCheckable() {
        return this.checkable;
    }

    private MaterialShapeDrawable getSurfaceColorStrokeDrawable() {
        return getMaterialShapeDrawable(true);
    }

    private void updateButtonShape(ShapeAppearanceModel shapeAppearanceModel) {
        if (IS_LOLLIPOP && !this.backgroundOverwritten) {
            int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
            int paddingTop = this.materialButton.getPaddingTop();
            int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
            int paddingBottom = this.materialButton.getPaddingBottom();
            updateBackground();
            ViewCompat.setPaddingRelative(this.materialButton, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (getMaterialShapeDrawable() != null) {
            getMaterialShapeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getSurfaceColorStrokeDrawable() != null) {
            getSurfaceColorStrokeDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
        if (getMaskDrawable() != null) {
            getMaskDrawable().setShapeAppearanceModel(shapeAppearanceModel);
        }
    }

    public Shapeable getMaskDrawable() {
        LayerDrawable layerDrawable = this.rippleDrawable;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.rippleDrawable.getNumberOfLayers() > 2) {
                return (Shapeable) this.rippleDrawable.getDrawable(2);
            }
            return (Shapeable) this.rippleDrawable.getDrawable(1);
        }
        return null;
    }

    void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateButtonShape(shapeAppearanceModel);
    }

    ShapeAppearanceModel getShapeAppearanceModel() {
        return this.shapeAppearanceModel;
    }

    public void setInsetBottom(int newInsetBottom) {
        setVerticalInsets(this.insetTop, newInsetBottom);
    }

    public int getInsetBottom() {
        return this.insetBottom;
    }

    public void setInsetTop(int newInsetTop) {
        setVerticalInsets(newInsetTop, this.insetBottom);
    }

    private void setVerticalInsets(int newInsetTop, int newInsetBottom) {
        int paddingStart = ViewCompat.getPaddingStart(this.materialButton);
        int paddingTop = this.materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.materialButton);
        int paddingBottom = this.materialButton.getPaddingBottom();
        int oldInsetTop = this.insetTop;
        int oldInsetBottom = this.insetBottom;
        this.insetBottom = newInsetBottom;
        this.insetTop = newInsetTop;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        ViewCompat.setPaddingRelative(this.materialButton, paddingStart, (paddingTop + newInsetTop) - oldInsetTop, paddingEnd, (paddingBottom + newInsetBottom) - oldInsetBottom);
    }

    public int getInsetTop() {
        return this.insetTop;
    }
}
