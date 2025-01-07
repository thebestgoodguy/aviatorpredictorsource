package b0;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f601a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f602b;

    /* renamed from: c, reason: collision with root package name */
    private static Boolean f603c;

    /* renamed from: d, reason: collision with root package name */
    private static Boolean f604d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f604d == null) {
            boolean z4 = false;
            if (j.g() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z4 = true;
            }
            f604d = Boolean.valueOf(z4);
        }
        return f604d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (f601a == null) {
            boolean z4 = false;
            if (j.d() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z4 = true;
            }
            f601a = Boolean.valueOf(z4);
        }
        return f601a.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context)) {
            if (!j.f()) {
                return true;
            }
            if (d(context) && !j.g()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f602b == null) {
            boolean z4 = false;
            if (j.e() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z4 = true;
            }
            f602b = Boolean.valueOf(z4);
        }
        return f602b.booleanValue();
    }

    public static boolean e(Context context) {
        if (f603c == null) {
            boolean z4 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z4 = false;
            }
            f603c = Boolean.valueOf(z4);
        }
        return f603c.booleanValue();
    }
}
