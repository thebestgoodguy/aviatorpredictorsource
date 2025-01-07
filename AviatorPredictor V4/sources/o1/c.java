package o1;

import b3.f1;
import b3.u0;
import java.net.ConnectException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o1.c;
import o1.p0;
import p1.g;

/* loaded from: classes.dex */
abstract class c<ReqT, RespT, CallbackT extends p0> {

    /* renamed from: n, reason: collision with root package name */
    private static final long f6753n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f6754o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f6755p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f6756q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f6757r;

    /* renamed from: a, reason: collision with root package name */
    private g.b f6758a;

    /* renamed from: b, reason: collision with root package name */
    private g.b f6759b;

    /* renamed from: c, reason: collision with root package name */
    private final u f6760c;

    /* renamed from: d, reason: collision with root package name */
    private final b3.v0<ReqT, RespT> f6761d;

    /* renamed from: f, reason: collision with root package name */
    private final p1.g f6763f;

    /* renamed from: g, reason: collision with root package name */
    private final g.d f6764g;

    /* renamed from: h, reason: collision with root package name */
    private final g.d f6765h;

    /* renamed from: k, reason: collision with root package name */
    private b3.g<ReqT, RespT> f6768k;

    /* renamed from: l, reason: collision with root package name */
    final p1.r f6769l;

    /* renamed from: m, reason: collision with root package name */
    final CallbackT f6770m;

    /* renamed from: i, reason: collision with root package name */
    private o0 f6766i = o0.Initial;

    /* renamed from: j, reason: collision with root package name */
    private long f6767j = 0;

    /* renamed from: e, reason: collision with root package name */
    private final c<ReqT, RespT, CallbackT>.b f6762e = new b();

    class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f6771a;

        a(long j4) {
            this.f6771a = j4;
        }

        void a(Runnable runnable) {
            c.this.f6763f.w();
            if (c.this.f6767j == this.f6771a) {
                runnable.run();
            } else {
                p1.v.a(c.this.getClass().getSimpleName(), "stream callback skipped by CloseGuardedRunner.", new Object[0]);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.j();
        }
    }

    /* renamed from: o1.c$c, reason: collision with other inner class name */
    class C0072c implements f0<RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final c<ReqT, RespT, CallbackT>.a f6774a;

        C0072c(c<ReqT, RespT, CallbackT>.a aVar) {
            this.f6774a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(f1 f1Var) {
            if (f1Var.o()) {
                p1.v.a(c.this.getClass().getSimpleName(), "(%x) Stream closed.", Integer.valueOf(System.identityHashCode(c.this)));
            } else {
                p1.v.d(c.this.getClass().getSimpleName(), "(%x) Stream closed with status: %s.", Integer.valueOf(System.identityHashCode(c.this)), f1Var);
            }
            c.this.k(f1Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(b3.u0 u0Var) {
            if (p1.v.c()) {
                HashMap hashMap = new HashMap();
                for (String str : u0Var.j()) {
                    if (m.f6842e.contains(str.toLowerCase(Locale.ENGLISH))) {
                        hashMap.put(str, (String) u0Var.g(u0.g.e(str, b3.u0.f903e)));
                    }
                }
                if (hashMap.isEmpty()) {
                    return;
                }
                p1.v.a(c.this.getClass().getSimpleName(), "(%x) Stream received headers: %s", Integer.valueOf(System.identityHashCode(c.this)), hashMap);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(Object obj) {
            if (p1.v.c()) {
                p1.v.a(c.this.getClass().getSimpleName(), "(%x) Stream received: %s", Integer.valueOf(System.identityHashCode(c.this)), obj);
            }
            c.this.r(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l() {
            p1.v.a(c.this.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(c.this)));
            c.this.s();
        }

        @Override // o1.f0
        public void a() {
            this.f6774a.a(new Runnable() { // from class: o1.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0072c.this.l();
                }
            });
        }

        @Override // o1.f0
        public void b(final f1 f1Var) {
            this.f6774a.a(new Runnable() { // from class: o1.f
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0072c.this.i(f1Var);
                }
            });
        }

        @Override // o1.f0
        public void c(final RespT respt) {
            this.f6774a.a(new Runnable() { // from class: o1.g
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0072c.this.k(respt);
                }
            });
        }

        @Override // o1.f0
        public void d(final b3.u0 u0Var) {
            this.f6774a.a(new Runnable() { // from class: o1.e
                @Override // java.lang.Runnable
                public final void run() {
                    c.C0072c.this.j(u0Var);
                }
            });
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f6753n = timeUnit.toMillis(1L);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        f6754o = timeUnit2.toMillis(1L);
        f6755p = timeUnit2.toMillis(1L);
        f6756q = timeUnit.toMillis(10L);
        f6757r = timeUnit.toMillis(10L);
    }

    c(u uVar, b3.v0<ReqT, RespT> v0Var, p1.g gVar, g.d dVar, g.d dVar2, g.d dVar3, CallbackT callbackt) {
        this.f6760c = uVar;
        this.f6761d = v0Var;
        this.f6763f = gVar;
        this.f6764g = dVar2;
        this.f6765h = dVar3;
        this.f6770m = callbackt;
        this.f6769l = new p1.r(gVar, dVar, f6753n, 1.5d, f6754o);
    }

    private void g() {
        g.b bVar = this.f6758a;
        if (bVar != null) {
            bVar.c();
            this.f6758a = null;
        }
    }

    private void h() {
        g.b bVar = this.f6759b;
        if (bVar != null) {
            bVar.c();
            this.f6759b = null;
        }
    }

    private void i(o0 o0Var, f1 f1Var) {
        p1.b.d(n(), "Only started streams should be closed.", new Object[0]);
        o0 o0Var2 = o0.Error;
        p1.b.d(o0Var == o0Var2 || f1Var.o(), "Can't provide an error when not in an error state.", new Object[0]);
        this.f6763f.w();
        if (m.h(f1Var)) {
            p1.g0.o(new IllegalStateException("The Cloud Firestore client failed to establish a secure connection. This is likely a problem with your app, rather than with Cloud Firestore itself. See https://bit.ly/2XFpdma for instructions on how to enable TLS on Android 4.x devices.", f1Var.l()));
        }
        h();
        g();
        this.f6769l.c();
        this.f6767j++;
        f1.b m4 = f1Var.m();
        if (m4 == f1.b.OK) {
            this.f6769l.f();
        } else if (m4 == f1.b.RESOURCE_EXHAUSTED) {
            p1.v.a(getClass().getSimpleName(), "(%x) Using maximum backoff delay to prevent overloading the backend.", Integer.valueOf(System.identityHashCode(this)));
            this.f6769l.g();
        } else if (m4 == f1.b.UNAUTHENTICATED && this.f6766i != o0.Healthy) {
            this.f6760c.h();
        } else if (m4 == f1.b.UNAVAILABLE && ((f1Var.l() instanceof UnknownHostException) || (f1Var.l() instanceof ConnectException))) {
            this.f6769l.h(f6757r);
        }
        if (o0Var != o0Var2) {
            p1.v.a(getClass().getSimpleName(), "(%x) Performing stream teardown", Integer.valueOf(System.identityHashCode(this)));
            w();
        }
        if (this.f6768k != null) {
            if (f1Var.o()) {
                p1.v.a(getClass().getSimpleName(), "(%x) Closing stream client-side", Integer.valueOf(System.identityHashCode(this)));
                this.f6768k.b();
            }
            this.f6768k = null;
        }
        this.f6766i = o0Var;
        this.f6770m.b(f1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (m()) {
            i(o0.Initial, f1.f756f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o() {
        if (m()) {
            this.f6766i = o0.Healthy;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p() {
        o0 o0Var = this.f6766i;
        p1.b.d(o0Var == o0.Backoff, "State should still be backoff but was %s", o0Var);
        this.f6766i = o0.Initial;
        u();
        p1.b.d(n(), "Stream should have started", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        this.f6766i = o0.Open;
        this.f6770m.a();
        if (this.f6758a == null) {
            this.f6758a = this.f6763f.k(this.f6765h, f6756q, new Runnable() { // from class: o1.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.o();
                }
            });
        }
    }

    private void t() {
        p1.b.d(this.f6766i == o0.Error, "Should only perform backoff in an error state", new Object[0]);
        this.f6766i = o0.Backoff;
        this.f6769l.b(new Runnable() { // from class: o1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.p();
            }
        });
    }

    void k(f1 f1Var) {
        p1.b.d(n(), "Can't handle server close on non-started stream!", new Object[0]);
        i(o0.Error, f1Var);
    }

    public void l() {
        p1.b.d(!n(), "Can only inhibit backoff after in a stopped state", new Object[0]);
        this.f6763f.w();
        this.f6766i = o0.Initial;
        this.f6769l.f();
    }

    public boolean m() {
        this.f6763f.w();
        o0 o0Var = this.f6766i;
        return o0Var == o0.Open || o0Var == o0.Healthy;
    }

    public boolean n() {
        this.f6763f.w();
        o0 o0Var = this.f6766i;
        return o0Var == o0.Starting || o0Var == o0.Backoff || m();
    }

    void q() {
        if (m() && this.f6759b == null) {
            this.f6759b = this.f6763f.k(this.f6764g, f6755p, this.f6762e);
        }
    }

    public abstract void r(RespT respt);

    public void u() {
        this.f6763f.w();
        p1.b.d(this.f6768k == null, "Last call still set", new Object[0]);
        p1.b.d(this.f6759b == null, "Idle timer still set", new Object[0]);
        o0 o0Var = this.f6766i;
        if (o0Var == o0.Error) {
            t();
            return;
        }
        p1.b.d(o0Var == o0.Initial, "Already started", new Object[0]);
        this.f6768k = this.f6760c.m(this.f6761d, new C0072c(new a(this.f6767j)));
        this.f6766i = o0.Starting;
    }

    public void v() {
        if (n()) {
            i(o0.Initial, f1.f756f);
        }
    }

    protected void w() {
    }

    protected void x(ReqT reqt) {
        this.f6763f.w();
        p1.v.a(getClass().getSimpleName(), "(%x) Stream sending: %s", Integer.valueOf(System.identityHashCode(this)), reqt);
        h();
        this.f6768k.d(reqt);
    }
}
