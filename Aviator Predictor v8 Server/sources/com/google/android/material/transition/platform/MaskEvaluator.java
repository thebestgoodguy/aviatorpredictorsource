package com.google.android.material.transition.platform;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider;
import com.google.android.material.transition.platform.MaterialContainerTransform;

/* loaded from: classes37.dex */
class MaskEvaluator {
    private ShapeAppearanceModel currentShapeAppearanceModel;
    private final Path path = new Path();
    private final Path startPath = new Path();
    private final Path endPath = new Path();
    private final ShapeAppearancePathProvider pathProvider = ShapeAppearancePathProvider.getInstance();

    MaskEvaluator() {
    }

    void evaluate(float progress, ShapeAppearanceModel startShapeAppearanceModel, ShapeAppearanceModel endShapeAppearanceModel, RectF currentStartBounds, RectF currentStartBoundsMasked, RectF currentEndBoundsMasked, MaterialContainerTransform.ProgressThresholds shapeMaskThresholds) {
        float shapeStartFraction = shapeMaskThresholds.getStart();
        float shapeEndFraction = shapeMaskThresholds.getEnd();
        ShapeAppearanceModel lerp = TransitionUtils.lerp(startShapeAppearanceModel, endShapeAppearanceModel, currentStartBounds, currentEndBoundsMasked, shapeStartFraction, shapeEndFraction, progress);
        this.currentShapeAppearanceModel = lerp;
        this.pathProvider.calculatePath(lerp, 1.0f, currentStartBoundsMasked, this.startPath);
        this.pathProvider.calculatePath(this.currentShapeAppearanceModel, 1.0f, currentEndBoundsMasked, this.endPath);
        if (Build.VERSION.SDK_INT >= 23) {
            this.path.op(this.startPath, this.endPath, Path.Op.UNION);
        }
    }

    void clip(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.path);
        } else {
            canvas.clipPath(this.startPath);
            canvas.clipPath(this.endPath, Region.Op.UNION);
        }
    }

    Path getPath() {
        return this.path;
    }

    ShapeAppearanceModel getCurrentShapeAppearanceModel() {
        return this.currentShapeAppearanceModel;
    }
}
