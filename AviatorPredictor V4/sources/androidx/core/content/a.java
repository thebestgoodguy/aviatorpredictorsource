package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f206a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f207b = new Object();

    /* renamed from: androidx.core.content.a$a, reason: collision with other inner class name */
    static class C0003a {
        static void a(Context context, Intent[] intentArr, Bundle bundle) {
            context.startActivities(intentArr, bundle);
        }

        static void b(Context context, Intent intent, Bundle bundle) {
            context.startActivity(intent, bundle);
        }
    }

    static class b {
        static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        static File b(Context context) {
            return context.getDataDir();
        }

        static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    static class c {
        static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static Context a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(context);
        }
        return null;
    }

    public static Executor b(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : i.b.a(new Handler(context.getMainLooper()));
    }

    public static void c(Context context, Intent intent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            C0003a.b(context, intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
