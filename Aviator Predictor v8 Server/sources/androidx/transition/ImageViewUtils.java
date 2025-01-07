package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* loaded from: classes51.dex */
class ImageViewUtils {
    private static Field sDrawMatrixField;
    private static boolean sDrawMatrixFieldFetched;
    private static boolean sTryHiddenAnimateTransform = true;

    static void animateTransform(@NonNull ImageView view, @Nullable Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = view.getDrawable();
            if (drawable != null) {
                int vwidth = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
                int vheight = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
                drawable.setBounds(0, 0, vwidth, vheight);
                view.invalidate();
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            hiddenAnimateTransform(view, matrix);
            return;
        }
        Drawable drawable2 = view.getDrawable();
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
            Matrix drawMatrix = null;
            fetchDrawMatrixField();
            if (sDrawMatrixField != null) {
                try {
                    drawMatrix = (Matrix) sDrawMatrixField.get(view);
                    if (drawMatrix == null) {
                        Matrix drawMatrix2 = new Matrix();
                        try {
                            sDrawMatrixField.set(view, drawMatrix2);
                            drawMatrix = drawMatrix2;
                        } catch (IllegalAccessException e) {
                            drawMatrix = drawMatrix2;
                        }
                    }
                } catch (IllegalAccessException e2) {
                }
            }
            if (drawMatrix != null) {
                drawMatrix.set(matrix);
            }
            view.invalidate();
        }
    }

    @RequiresApi(21)
    @SuppressLint({"NewApi"})
    private static void hiddenAnimateTransform(@NonNull ImageView view, @Nullable Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                view.animateTransform(matrix);
            } catch (NoSuchMethodError e) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }

    private static void fetchDrawMatrixField() {
        if (!sDrawMatrixFieldFetched) {
            try {
                sDrawMatrixField = ImageView.class.getDeclaredField("mDrawMatrix");
                sDrawMatrixField.setAccessible(true);
            } catch (NoSuchFieldException e) {
            }
            sDrawMatrixFieldFetched = true;
        }
    }

    private ImageViewUtils() {
    }
}
