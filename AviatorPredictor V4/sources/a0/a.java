package a0;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import b0.j;
import c0.c;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import w.o1;
import w.r;

/* loaded from: classes.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f10b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f11c;

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<ServiceConnection, ServiceConnection> f12a = new ConcurrentHashMap<>();

    private a() {
    }

    public static a a() {
        if (f11c == null) {
            synchronized (f10b) {
                if (f11c == null) {
                    f11c = new a();
                }
            }
        }
        a aVar = f11c;
        r.i(aVar);
        return aVar;
    }

    private static void d(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean e(Context context, String str, Intent intent, ServiceConnection serviceConnection, int r8, boolean z4, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).a(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!f(serviceConnection)) {
            return g(context, intent, serviceConnection, r8, executor);
        }
        ServiceConnection putIfAbsent = this.f12a.putIfAbsent(serviceConnection, serviceConnection);
        if (putIfAbsent != null && serviceConnection != putIfAbsent) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean g5 = g(context, intent, serviceConnection, r8, executor);
            if (g5) {
                return g5;
            }
            return false;
        } finally {
            this.f12a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean f(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof o1);
    }

    private static final boolean g(Context context, Intent intent, ServiceConnection serviceConnection, int r4, Executor executor) {
        return (!j.h() || executor == null) ? context.bindService(intent, serviceConnection, r4) : context.bindService(intent, r4, executor, serviceConnection);
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!f(serviceConnection) || !this.f12a.containsKey(serviceConnection)) {
            d(context, serviceConnection);
            return;
        }
        try {
            d(context, this.f12a.get(serviceConnection));
        } finally {
            this.f12a.remove(serviceConnection);
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int r13, Executor executor) {
        return e(context, str, intent, serviceConnection, r13, true, executor);
    }
}
