package w;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c<T extends IInterface> {

    /* renamed from: a, reason: collision with root package name */
    private int f7911a;

    /* renamed from: b, reason: collision with root package name */
    private long f7912b;

    /* renamed from: c, reason: collision with root package name */
    private long f7913c;

    /* renamed from: d, reason: collision with root package name */
    private int f7914d;

    /* renamed from: e, reason: collision with root package name */
    private long f7915e;

    /* renamed from: g, reason: collision with root package name */
    q1 f7917g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f7918h;

    /* renamed from: i, reason: collision with root package name */
    private final Looper f7919i;

    /* renamed from: j, reason: collision with root package name */
    private final h f7920j;

    /* renamed from: k, reason: collision with root package name */
    private final s.e f7921k;

    /* renamed from: l, reason: collision with root package name */
    final Handler f7922l;

    /* renamed from: o, reason: collision with root package name */
    private m f7925o;

    /* renamed from: p, reason: collision with root package name */
    protected InterfaceC0100c f7926p;

    /* renamed from: q, reason: collision with root package name */
    private T f7927q;

    /* renamed from: s, reason: collision with root package name */
    private c1 f7929s;

    /* renamed from: u, reason: collision with root package name */
    private final a f7931u;

    /* renamed from: v, reason: collision with root package name */
    private final b f7932v;

    /* renamed from: w, reason: collision with root package name */
    private final int f7933w;

    /* renamed from: x, reason: collision with root package name */
    private final String f7934x;

    /* renamed from: y, reason: collision with root package name */
    private volatile String f7935y;
    private static final s.c[] E = new s.c[0];
    public static final String[] D = {"service_esmobile", "service_googleme"};

    /* renamed from: f, reason: collision with root package name */
    private volatile String f7916f = null;

    /* renamed from: m, reason: collision with root package name */
    private final Object f7923m = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final Object f7924n = new Object();

    /* renamed from: r, reason: collision with root package name */
    private final ArrayList<a1<?>> f7928r = new ArrayList<>();

    /* renamed from: t, reason: collision with root package name */
    private int f7930t = 1;

    /* renamed from: z, reason: collision with root package name */
    private s.a f7936z = null;
    private boolean A = false;
    private volatile f1 B = null;
    protected AtomicInteger C = new AtomicInteger(0);

    public interface a {
        void f(int r12);

        void h(Bundle bundle);
    }

    public interface b {
        void a(s.a aVar);
    }

    /* renamed from: w.c$c, reason: collision with other inner class name */
    public interface InterfaceC0100c {
        void c(s.a aVar);
    }

    protected class d implements InterfaceC0100c {
        public d() {
        }

        @Override // w.c.InterfaceC0100c
        public final void c(s.a aVar) {
            if (aVar.n0()) {
                c cVar = c.this;
                cVar.f(null, cVar.B());
            } else if (c.this.f7932v != null) {
                c.this.f7932v.a(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, h hVar, s.e eVar, int r7, a aVar, b bVar, String str) {
        r.j(context, "Context must not be null");
        this.f7918h = context;
        r.j(looper, "Looper must not be null");
        this.f7919i = looper;
        r.j(hVar, "Supervisor must not be null");
        this.f7920j = hVar;
        r.j(eVar, "API availability must not be null");
        this.f7921k = eVar;
        this.f7922l = new z0(this, looper);
        this.f7933w = r7;
        this.f7931u = aVar;
        this.f7932v = bVar;
        this.f7934x = str;
    }

    static /* bridge */ /* synthetic */ void a0(c cVar, f1 f1Var) {
        cVar.B = f1Var;
        if (cVar.Q()) {
            w.e eVar = f1Var.f7989h;
            s.b().c(eVar == null ? null : eVar.o0());
        }
    }

    static /* bridge */ /* synthetic */ void b0(c cVar, int r32) {
        int r02;
        int r33;
        synchronized (cVar.f7923m) {
            r02 = cVar.f7930t;
        }
        if (r02 == 3) {
            cVar.A = true;
            r33 = 5;
        } else {
            r33 = 4;
        }
        Handler handler = cVar.f7922l;
        handler.sendMessage(handler.obtainMessage(r33, cVar.C.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(c cVar, int r32, int r4, IInterface iInterface) {
        synchronized (cVar.f7923m) {
            if (cVar.f7930t != r32) {
                return false;
            }
            cVar.g0(r4, iInterface);
            return true;
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(c cVar) {
        if (cVar.A || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int r13, T t4) {
        q1 q1Var;
        r.a((r13 == 4) == (t4 != null));
        synchronized (this.f7923m) {
            this.f7930t = r13;
            this.f7927q = t4;
            if (r13 == 1) {
                c1 c1Var = this.f7929s;
                if (c1Var != null) {
                    h hVar = this.f7920j;
                    String c5 = this.f7917g.c();
                    r.i(c5);
                    hVar.e(c5, this.f7917g.b(), this.f7917g.a(), c1Var, V(), this.f7917g.d());
                    this.f7929s = null;
                }
            } else if (r13 == 2 || r13 == 3) {
                c1 c1Var2 = this.f7929s;
                if (c1Var2 != null && (q1Var = this.f7917g) != null) {
                    String c6 = q1Var.c();
                    String b5 = q1Var.b();
                    StringBuilder sb = new StringBuilder(String.valueOf(c6).length() + 70 + String.valueOf(b5).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(c6);
                    sb.append(" on ");
                    sb.append(b5);
                    Log.e("GmsClient", sb.toString());
                    h hVar2 = this.f7920j;
                    String c7 = this.f7917g.c();
                    r.i(c7);
                    hVar2.e(c7, this.f7917g.b(), this.f7917g.a(), c1Var2, V(), this.f7917g.d());
                    this.C.incrementAndGet();
                }
                c1 c1Var3 = new c1(this, this.C.get());
                this.f7929s = c1Var3;
                q1 q1Var2 = (this.f7930t != 3 || A() == null) ? new q1(F(), E(), false, h.a(), H()) : new q1(x().getPackageName(), A(), true, h.a(), false);
                this.f7917g = q1Var2;
                if (q1Var2.d() && p() < 17895000) {
                    String valueOf = String.valueOf(this.f7917g.c());
                    throw new IllegalStateException(valueOf.length() != 0 ? "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf) : new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: "));
                }
                h hVar3 = this.f7920j;
                String c8 = this.f7917g.c();
                r.i(c8);
                if (!hVar3.f(new j1(c8, this.f7917g.b(), this.f7917g.a(), this.f7917g.d()), c1Var3, V(), v())) {
                    String c9 = this.f7917g.c();
                    String b6 = this.f7917g.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(c9).length() + 34 + String.valueOf(b6).length());
                    sb2.append("unable to connect to service: ");
                    sb2.append(c9);
                    sb2.append(" on ");
                    sb2.append(b6);
                    Log.w("GmsClient", sb2.toString());
                    c0(16, null, this.C.get());
                }
            } else if (r13 == 4) {
                r.i(t4);
                J(t4);
            }
        }
    }

    protected String A() {
        return null;
    }

    protected Set<Scope> B() {
        return Collections.emptySet();
    }

    public final T C() {
        T t4;
        synchronized (this.f7923m) {
            if (this.f7930t == 5) {
                throw new DeadObjectException();
            }
            q();
            t4 = this.f7927q;
            r.j(t4, "Client is connected but service is null");
        }
        return t4;
    }

    protected abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public w.e G() {
        f1 f1Var = this.B;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f7989h;
    }

    protected boolean H() {
        return p() >= 211700000;
    }

    public boolean I() {
        return this.B != null;
    }

    protected void J(T t4) {
        this.f7913c = System.currentTimeMillis();
    }

    protected void K(s.a aVar) {
        this.f7914d = aVar.j0();
        this.f7915e = System.currentTimeMillis();
    }

    protected void L(int r32) {
        this.f7911a = r32;
        this.f7912b = System.currentTimeMillis();
    }

    protected void M(int r32, IBinder iBinder, Bundle bundle, int r6) {
        Handler handler = this.f7922l;
        handler.sendMessage(handler.obtainMessage(1, r6, -1, new d1(this, r32, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.f7935y = str;
    }

    public void P(int r4) {
        Handler handler = this.f7922l;
        handler.sendMessage(handler.obtainMessage(6, this.C.get(), r4));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.f7934x;
        return str == null ? this.f7918h.getClass().getName() : str;
    }

    public void a(e eVar) {
        eVar.a();
    }

    public boolean b() {
        boolean z4;
        synchronized (this.f7923m) {
            int r12 = this.f7930t;
            z4 = true;
            if (r12 != 2 && r12 != 3) {
                z4 = false;
            }
        }
        return z4;
    }

    public final s.c[] c() {
        f1 f1Var = this.B;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f7987f;
    }

    protected final void c0(int r32, Bundle bundle, int r5) {
        Handler handler = this.f7922l;
        handler.sendMessage(handler.obtainMessage(7, r5, -1, new e1(this, r32, null)));
    }

    public boolean d() {
        boolean z4;
        synchronized (this.f7923m) {
            z4 = this.f7930t == 4;
        }
        return z4;
    }

    public String e() {
        q1 q1Var;
        if (!d() || (q1Var = this.f7917g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return q1Var.b();
    }

    public void f(j jVar, Set<Scope> set) {
        Bundle z4 = z();
        f fVar = new f(this.f7933w, this.f7935y);
        fVar.f7973h = this.f7918h.getPackageName();
        fVar.f7976k = z4;
        if (set != null) {
            fVar.f7975j = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (m()) {
            Account t4 = t();
            if (t4 == null) {
                t4 = new Account("<<default account>>", "com.google");
            }
            fVar.f7977l = t4;
            if (jVar != null) {
                fVar.f7974i = jVar.asBinder();
            }
        } else if (N()) {
            fVar.f7977l = t();
        }
        fVar.f7978m = E;
        fVar.f7979n = u();
        if (Q()) {
            fVar.f7982q = true;
        }
        try {
            synchronized (this.f7924n) {
                m mVar = this.f7925o;
                if (mVar != null) {
                    mVar.n(new b1(this, this.C.get()), fVar);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e5) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e5);
            P(3);
        } catch (RemoteException e6) {
            e = e6;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        } catch (SecurityException e7) {
            throw e7;
        } catch (RuntimeException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.C.get());
        }
    }

    public void g(InterfaceC0100c interfaceC0100c) {
        r.j(interfaceC0100c, "Connection progress callbacks cannot be null.");
        this.f7926p = interfaceC0100c;
        g0(2, null);
    }

    public String h() {
        return this.f7916f;
    }

    public void k() {
        this.C.incrementAndGet();
        synchronized (this.f7928r) {
            int size = this.f7928r.size();
            for (int r22 = 0; r22 < size; r22++) {
                this.f7928r.get(r22).d();
            }
            this.f7928r.clear();
        }
        synchronized (this.f7924n) {
            this.f7925o = null;
        }
        g0(1, null);
    }

    public void l(String str) {
        this.f7916f = str;
        k();
    }

    public boolean m() {
        return false;
    }

    public boolean o() {
        return true;
    }

    public int p() {
        return s.e.f7489a;
    }

    protected final void q() {
        if (!d()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract T r(IBinder iBinder);

    protected boolean s() {
        return false;
    }

    public Account t() {
        return null;
    }

    public s.c[] u() {
        return E;
    }

    protected Executor v() {
        return null;
    }

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f7918h;
    }

    public int y() {
        return this.f7933w;
    }

    protected Bundle z() {
        return new Bundle();
    }
}
