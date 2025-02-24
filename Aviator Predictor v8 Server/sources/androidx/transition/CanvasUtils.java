package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes51.dex */
class CanvasUtils {
    private static Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static Method sReorderBarrierMethod;

    @SuppressLint({"SoonBlockedPrivateApi"})
    static void enableZ(@NonNull Canvas canvas, boolean enable) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (Build.VERSION.SDK_INT >= 29) {
                if (enable) {
                    canvas.enableZ();
                    return;
                } else {
                    canvas.disableZ();
                    return;
                }
            }
            if (Build.VERSION.SDK_INT == 28) {
                throw new IllegalStateException("This method doesn't work on Pie!");
            }
            if (!sOrderMethodsFetched) {
                try {
                    sReorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    sReorderBarrierMethod.setAccessible(true);
                    sInorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    sInorderBarrierMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                sOrderMethodsFetched = true;
            }
            if (enable) {
                try {
                    if (sReorderBarrierMethod != null) {
                        sReorderBarrierMethod.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException e2) {
                    return;
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3.getCause());
                }
            }
            if (!enable && sInorderBarrierMethod != null) {
                sInorderBarrierMethod.invoke(canvas, new Object[0]);
            }
        }
    }

    private CanvasUtils() {
    }
}
