package w;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static int f7990a = 4225;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7991b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static n1 f7992c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f7993d = null;

    /* renamed from: e, reason: collision with root package name */
    private static boolean f7994e = false;

    public static int a() {
        return f7990a;
    }

    public static h b(Context context) {
        synchronized (f7991b) {
            if (f7992c == null) {
                f7992c = new n1(context.getApplicationContext(), f7994e ? c().getLooper() : context.getMainLooper());
            }
        }
        return f7992c;
    }

    public static HandlerThread c() {
        synchronized (f7991b) {
            HandlerThread handlerThread = f7993d;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            f7993d = handlerThread2;
            handlerThread2.start();
            return f7993d;
        }
    }

    protected abstract void d(j1 j1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int r4, ServiceConnection serviceConnection, String str3, boolean z4) {
        d(new j1(str, str2, r4, z4), serviceConnection, str3);
    }

    protected abstract boolean f(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor);
}
