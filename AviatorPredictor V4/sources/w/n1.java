package w;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class n1 extends h {

    /* renamed from: f, reason: collision with root package name */
    private final HashMap<j1, k1> f8023f = new HashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private final Context f8024g;

    /* renamed from: h, reason: collision with root package name */
    private volatile Handler f8025h;

    /* renamed from: i, reason: collision with root package name */
    private final m1 f8026i;

    /* renamed from: j, reason: collision with root package name */
    private final a0.a f8027j;

    /* renamed from: k, reason: collision with root package name */
    private final long f8028k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8029l;

    n1(Context context, Looper looper) {
        m1 m1Var = new m1(this, null);
        this.f8026i = m1Var;
        this.f8024g = context.getApplicationContext();
        this.f8025h = new h0.e(looper, m1Var);
        this.f8027j = a0.a.a();
        this.f8028k = 5000L;
        this.f8029l = 300000L;
    }

    @Override // w.h
    protected final void d(j1 j1Var, ServiceConnection serviceConnection, String str) {
        r.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8023f) {
            k1 k1Var = this.f8023f.get(j1Var);
            if (k1Var == null) {
                String obj = j1Var.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            if (!k1Var.h(serviceConnection)) {
                String obj2 = j1Var.toString();
                StringBuilder sb2 = new StringBuilder(obj2.length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(obj2);
                throw new IllegalStateException(sb2.toString());
            }
            k1Var.f(serviceConnection, str);
            if (k1Var.i()) {
                this.f8025h.sendMessageDelayed(this.f8025h.obtainMessage(0, j1Var), this.f8028k);
            }
        }
    }

    @Override // w.h
    protected final boolean f(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j4;
        r.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f8023f) {
            k1 k1Var = this.f8023f.get(j1Var);
            if (k1Var == null) {
                k1Var = new k1(this, j1Var);
                k1Var.d(serviceConnection, serviceConnection, str);
                k1Var.e(str, executor);
                this.f8023f.put(j1Var, k1Var);
            } else {
                this.f8025h.removeMessages(0, j1Var);
                if (k1Var.h(serviceConnection)) {
                    String obj = j1Var.toString();
                    StringBuilder sb = new StringBuilder(obj.length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
                k1Var.d(serviceConnection, serviceConnection, str);
                int a5 = k1Var.a();
                if (a5 == 1) {
                    serviceConnection.onServiceConnected(k1Var.b(), k1Var.c());
                } else if (a5 == 2) {
                    k1Var.e(str, executor);
                }
            }
            j4 = k1Var.j();
        }
        return j4;
    }
}
