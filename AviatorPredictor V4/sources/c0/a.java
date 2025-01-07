package c0;

import android.content.Context;
import b0.j;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f1090a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f1091b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f1090a;
            if (context2 != null && (bool2 = f1091b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            f1091b = null;
            if (!j.g()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f1091b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                f1090a = applicationContext;
                return f1091b.booleanValue();
            }
            bool = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f1091b = bool;
            f1090a = applicationContext;
            return f1091b.booleanValue();
        }
    }
}
