package c3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import b3.g;
import b3.p;
import b3.q0;
import b3.r0;
import b3.v0;
import b3.y;
import d3.e;
import java.util.concurrent.TimeUnit;
import q0.l;

/* loaded from: classes.dex */
public final class a extends y<a> {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f1165c = j();

    /* renamed from: a, reason: collision with root package name */
    private final r0<?> f1166a;

    /* renamed from: b, reason: collision with root package name */
    private Context f1167b;

    static final class b extends q0 {

        /* renamed from: a, reason: collision with root package name */
        private final q0 f1168a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f1169b;

        /* renamed from: c, reason: collision with root package name */
        private final ConnectivityManager f1170c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f1171d = new Object();

        /* renamed from: e, reason: collision with root package name */
        private Runnable f1172e;

        /* renamed from: c3.a$b$a, reason: collision with other inner class name */
        class RunnableC0019a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f1173e;

            RunnableC0019a(c cVar) {
                this.f1173e = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1170c.unregisterNetworkCallback(this.f1173e);
            }
        }

        /* renamed from: c3.a$b$b, reason: collision with other inner class name */
        class RunnableC0020b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ d f1175e;

            RunnableC0020b(d dVar) {
                this.f1175e = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1169b.unregisterReceiver(this.f1175e);
            }
        }

        private class c extends ConnectivityManager.NetworkCallback {
            private c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.f1168a.j();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z4) {
                if (z4) {
                    return;
                }
                b.this.f1168a.j();
            }
        }

        private class d extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            private boolean f1178a;

            private d() {
                this.f1178a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z4 = this.f1178a;
                boolean z5 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f1178a = z5;
                if (!z5 || z4) {
                    return;
                }
                b.this.f1168a.j();
            }
        }

        b(q0 q0Var, Context context) {
            this.f1168a = q0Var;
            this.f1169b = context;
            if (context == null) {
                this.f1170c = null;
                return;
            }
            this.f1170c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                r();
            } catch (SecurityException e5) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e5);
            }
        }

        private void r() {
            Runnable runnableC0020b;
            if (Build.VERSION.SDK_INT < 24 || this.f1170c == null) {
                d dVar = new d();
                this.f1169b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                runnableC0020b = new RunnableC0020b(dVar);
            } else {
                c cVar = new c();
                this.f1170c.registerDefaultNetworkCallback(cVar);
                runnableC0020b = new RunnableC0019a(cVar);
            }
            this.f1172e = runnableC0020b;
        }

        private void s() {
            synchronized (this.f1171d) {
                Runnable runnable = this.f1172e;
                if (runnable != null) {
                    runnable.run();
                    this.f1172e = null;
                }
            }
        }

        @Override // b3.d
        public String b() {
            return this.f1168a.b();
        }

        @Override // b3.d
        public <RequestT, ResponseT> g<RequestT, ResponseT> h(v0<RequestT, ResponseT> v0Var, b3.c cVar) {
            return this.f1168a.h(v0Var, cVar);
        }

        @Override // b3.q0
        public boolean i(long j4, TimeUnit timeUnit) {
            return this.f1168a.i(j4, timeUnit);
        }

        @Override // b3.q0
        public void j() {
            this.f1168a.j();
        }

        @Override // b3.q0
        public p k(boolean z4) {
            return this.f1168a.k(z4);
        }

        @Override // b3.q0
        public void l(p pVar, Runnable runnable) {
            this.f1168a.l(pVar, runnable);
        }

        @Override // b3.q0
        public q0 m() {
            s();
            return this.f1168a.m();
        }

        @Override // b3.q0
        public q0 n() {
            s();
            return this.f1168a.n();
        }
    }

    private a(r0<?> r0Var) {
        this.f1166a = (r0) l.o(r0Var, "delegateBuilder");
    }

    private static Class<?> j() {
        try {
            int r12 = e.f3250w;
            return e.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static a k(r0<?> r0Var) {
        return new a(r0Var);
    }

    @Override // b3.r0
    public q0 a() {
        return new b(this.f1166a.a(), this.f1167b);
    }

    @Override // b3.y
    protected r0<?> e() {
        return this.f1166a;
    }

    public a i(Context context) {
        this.f1167b = context;
        return this;
    }
}
