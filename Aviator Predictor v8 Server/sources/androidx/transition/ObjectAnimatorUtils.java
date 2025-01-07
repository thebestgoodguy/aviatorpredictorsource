package androidx.transition;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* loaded from: classes51.dex */
class ObjectAnimatorUtils {
    static <T> ObjectAnimator ofPointF(T target, Property<T, PointF> property, Path path) {
        return Build.VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(target, property, (TypeConverter) null, path) : ObjectAnimator.ofFloat(target, new PathProperty(property, path), 0.0f, 1.0f);
    }

    private ObjectAnimatorUtils() {
    }
}
