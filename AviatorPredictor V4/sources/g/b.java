package g;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class b {

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static Method f3796a;

        /* renamed from: b, reason: collision with root package name */
        private static boolean f3797b;

        public static void a(Bundle bundle, String str, IBinder iBinder) {
            if (!f3797b) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    f3796a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e5) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", e5);
                }
                f3797b = true;
            }
            Method method2 = f3796a;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e6) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", e6);
                    f3796a = null;
                }
            }
        }
    }

    public static void a(Bundle bundle, String str, IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            a.a(bundle, str, iBinder);
        }
    }
}
