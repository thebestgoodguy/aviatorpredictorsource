package l0;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;
import s.e;
import s.f;
import s.i;
import w.r;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final e f6524a = e.e();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6525b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static Method f6526c = null;

    /* renamed from: d, reason: collision with root package name */
    private static Method f6527d = null;

    public static void a(Context context) {
        Context context2;
        r.j(context, "Context must not be null");
        f6524a.j(context, 11925000);
        synchronized (f6525b) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                context2 = DynamiteModule.c(context, DynamiteModule.f1352f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e5) {
                String valueOf = String.valueOf(e5.getMessage());
                Log.w("ProviderInstaller", valueOf.length() != 0 ? "Failed to load providerinstaller module: ".concat(valueOf) : new String("Failed to load providerinstaller module: "));
                context2 = null;
            }
            if (context2 != null) {
                c(context2, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            Context c5 = i.c(context);
            if (c5 != null) {
                try {
                    if (f6527d == null) {
                        Class cls = Long.TYPE;
                        f6527d = b(c5, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    f6527d.invoke(null, context, Long.valueOf(elapsedRealtime), Long.valueOf(elapsedRealtime2));
                } catch (Exception e6) {
                    String valueOf2 = String.valueOf(e6.getMessage());
                    Log.w("ProviderInstaller", valueOf2.length() != 0 ? "Failed to report request stats: ".concat(valueOf2) : new String("Failed to report request stats: "));
                }
            }
            if (c5 != null) {
                c(c5, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
            } else {
                Log.e("ProviderInstaller", "Failed to get remote context");
                throw new f(8);
            }
        }
    }

    private static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    private static void c(Context context, Context context2, String str) {
        try {
            if (f6526c == null) {
                f6526c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            f6526c.invoke(null, context);
        } catch (Exception e5) {
            Throwable cause = e5.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                String valueOf = String.valueOf(cause == null ? e5.getMessage() : cause.getMessage());
                Log.e("ProviderInstaller", valueOf.length() != 0 ? "Failed to install provider: ".concat(valueOf) : new String("Failed to install provider: "));
            }
            throw new f(8);
        }
    }
}
