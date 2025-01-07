package i1;

import android.content.Context;
import com.google.firebase.firestore.u;
import i1.j;
import i1.p;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k1.k;
import k1.z3;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    private final m f4142a;

    /* renamed from: b, reason: collision with root package name */
    private final g1.a<g1.j> f4143b;

    /* renamed from: c, reason: collision with root package name */
    private final g1.a<String> f4144c;

    /* renamed from: d, reason: collision with root package name */
    private final p1.g f4145d;

    /* renamed from: e, reason: collision with root package name */
    private final h1.g f4146e;

    /* renamed from: f, reason: collision with root package name */
    private final o1.e0 f4147f;

    /* renamed from: g, reason: collision with root package name */
    private k1.z0 f4148g;

    /* renamed from: h, reason: collision with root package name */
    private k1.f0 f4149h;

    /* renamed from: i, reason: collision with root package name */
    private o1.n0 f4150i;

    /* renamed from: j, reason: collision with root package name */
    private b1 f4151j;

    /* renamed from: k, reason: collision with root package name */
    private p f4152k;

    /* renamed from: l, reason: collision with root package name */
    private z3 f4153l;

    /* renamed from: m, reason: collision with root package name */
    private z3 f4154m;

    public l0(final Context context, m mVar, final com.google.firebase.firestore.v vVar, g1.a<g1.j> aVar, g1.a<String> aVar2, final p1.g gVar, o1.e0 e0Var) {
        this.f4142a = mVar;
        this.f4143b = aVar;
        this.f4144c = aVar2;
        this.f4145d = gVar;
        this.f4147f = e0Var;
        this.f4146e = new h1.g(new o1.j0(mVar.a()));
        final o0.i iVar = new o0.i();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        gVar.l(new Runnable() { // from class: i1.v
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.K(iVar, context, vVar);
            }
        });
        aVar.d(new p1.u() { // from class: i1.a0
            @Override // p1.u
            public final void a(Object obj) {
                l0.this.M(atomicBoolean, iVar, gVar, (g1.j) obj);
            }
        });
        aVar2.d(new p1.u() { // from class: i1.b0
            @Override // p1.u
            public final void a(Object obj) {
                l0.N((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(com.google.firebase.firestore.j jVar) {
        this.f4152k.e(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        this.f4150i.q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D() {
        this.f4150i.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l1.i E(o0.h hVar) {
        l1.i iVar = (l1.i) hVar.m();
        if (iVar.b()) {
            return iVar;
        }
        if (iVar.e()) {
            return null;
        }
        throw new com.google.firebase.firestore.u("Failed to get document from cache. (However, this document may exist on the server. Run again without setting source to CACHE to attempt to retrieve the document from the server.)", u.a.UNAVAILABLE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l1.i F(l1.l lVar) {
        return this.f4149h.e0(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ u1 G(x0 x0Var) {
        k1.c1 y4 = this.f4149h.y(x0Var, true);
        s1 s1Var = new s1(x0Var, y4.b());
        return s1Var.b(s1Var.g(y4.a())).b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H(String str, o0.i iVar) {
        h1.j F = this.f4149h.F(str);
        if (F == null) {
            iVar.c(null);
        } else {
            c1 b5 = F.a().b();
            iVar.c(new x0(b5.n(), b5.d(), b5.h(), b5.m(), b5.j(), F.a().a(), b5.p(), b5.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I(y0 y0Var) {
        this.f4152k.d(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J(h1.f fVar, com.google.firebase.firestore.c0 c0Var) {
        this.f4151j.o(fVar, c0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K(o0.i iVar, Context context, com.google.firebase.firestore.v vVar) {
        try {
            z(context, (g1.j) o0.k.a(iVar.a()), vVar);
        } catch (InterruptedException | ExecutionException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L(g1.j jVar) {
        p1.b.d(this.f4151j != null, "SyncEngine not yet initialized", new Object[0]);
        p1.v.a("FirestoreClient", "Credential changed. Current user: %s", jVar.a());
        this.f4151j.l(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(AtomicBoolean atomicBoolean, o0.i iVar, p1.g gVar, final g1.j jVar) {
        if (!atomicBoolean.compareAndSet(false, true)) {
            gVar.l(new Runnable() { // from class: i1.g0
                @Override // java.lang.Runnable
                public final void run() {
                    l0.this.L(jVar);
                }
            });
        } else {
            p1.b.d(!iVar.a().o(), "Already fulfilled first user task", new Object[0]);
            iVar.c(jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void N(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O(com.google.firebase.firestore.j jVar) {
        this.f4152k.h(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void P(y0 y0Var) {
        this.f4152k.g(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.f4150i.N();
        this.f4148g.l();
        z3 z3Var = this.f4154m;
        if (z3Var != null) {
            z3Var.b();
        }
        z3 z3Var2 = this.f4153l;
        if (z3Var2 != null) {
            z3Var2.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ o0.h R(com.google.firebase.firestore.u0 u0Var, p1.t tVar) {
        return this.f4151j.z(this.f4145d, u0Var, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(o0.i iVar) {
        this.f4151j.s(iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T(List list, o0.i iVar) {
        this.f4151j.B(list, iVar);
    }

    private void a0() {
        if (A()) {
            throw new IllegalStateException("The client has already been terminated");
        }
    }

    private void z(Context context, g1.j jVar, com.google.firebase.firestore.v vVar) {
        p1.v.a("FirestoreClient", "Initializing. user=%s", jVar.a());
        j.a aVar = new j.a(context, this.f4145d, this.f4142a, new o1.m(this.f4142a, this.f4145d, this.f4143b, this.f4144c, context, this.f4147f), jVar, 100, vVar);
        j a1Var = vVar.c() ? new a1() : new t0();
        a1Var.q(aVar);
        this.f4148g = a1Var.n();
        this.f4154m = a1Var.k();
        this.f4149h = a1Var.m();
        this.f4150i = a1Var.o();
        this.f4151j = a1Var.p();
        this.f4152k = a1Var.j();
        k1.k l4 = a1Var.l();
        z3 z3Var = this.f4154m;
        if (z3Var != null) {
            z3Var.a();
        }
        if (l4 != null) {
            k.a f5 = l4.f();
            this.f4153l = f5;
            f5.a();
        }
    }

    public boolean A() {
        return this.f4145d.p();
    }

    public y0 U(x0 x0Var, p.a aVar, com.google.firebase.firestore.j<u1> jVar) {
        a0();
        final y0 y0Var = new y0(x0Var, aVar, jVar);
        this.f4145d.l(new Runnable() { // from class: i1.j0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.I(y0Var);
            }
        });
        return y0Var;
    }

    public void V(InputStream inputStream, final com.google.firebase.firestore.c0 c0Var) {
        a0();
        final h1.f fVar = new h1.f(this.f4146e, inputStream);
        this.f4145d.l(new Runnable() { // from class: i1.h0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.J(fVar, c0Var);
            }
        });
    }

    public void W(final com.google.firebase.firestore.j<Void> jVar) {
        if (A()) {
            return;
        }
        this.f4145d.l(new Runnable() { // from class: i1.f0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.O(jVar);
            }
        });
    }

    public void X(final y0 y0Var) {
        if (A()) {
            return;
        }
        this.f4145d.l(new Runnable() { // from class: i1.i0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.P(y0Var);
            }
        });
    }

    public o0.h<Void> Y() {
        this.f4143b.c();
        this.f4144c.c();
        return this.f4145d.n(new Runnable() { // from class: i1.s
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.Q();
            }
        });
    }

    public <TResult> o0.h<TResult> Z(final com.google.firebase.firestore.u0 u0Var, final p1.t<g1, o0.h<TResult>> tVar) {
        a0();
        return p1.g.g(this.f4145d.o(), new Callable() { // from class: i1.w
            @Override // java.util.concurrent.Callable
            public final Object call() {
                o0.h R;
                R = l0.this.R(u0Var, tVar);
                return R;
            }
        });
    }

    public o0.h<Void> b0() {
        a0();
        final o0.i iVar = new o0.i();
        this.f4145d.l(new Runnable() { // from class: i1.u
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.S(iVar);
            }
        });
        return iVar.a();
    }

    public o0.h<Void> c0(final List<m1.f> list) {
        a0();
        final o0.i iVar = new o0.i();
        this.f4145d.l(new Runnable() { // from class: i1.t
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.T(list, iVar);
            }
        });
        return iVar.a();
    }

    public void t(final com.google.firebase.firestore.j<Void> jVar) {
        a0();
        this.f4145d.l(new Runnable() { // from class: i1.e0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.B(jVar);
            }
        });
    }

    public o0.h<Void> u() {
        a0();
        return this.f4145d.i(new Runnable() { // from class: i1.c0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.C();
            }
        });
    }

    public o0.h<Void> v() {
        a0();
        return this.f4145d.i(new Runnable() { // from class: i1.d0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.D();
            }
        });
    }

    public o0.h<l1.i> w(final l1.l lVar) {
        a0();
        return this.f4145d.j(new Callable() { // from class: i1.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                l1.i F;
                F = l0.this.F(lVar);
                return F;
            }
        }).i(new o0.a() { // from class: i1.z
            @Override // o0.a
            public final Object a(o0.h hVar) {
                l1.i E;
                E = l0.E(hVar);
                return E;
            }
        });
    }

    public o0.h<u1> x(final x0 x0Var) {
        a0();
        return this.f4145d.j(new Callable() { // from class: i1.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u1 G;
                G = l0.this.G(x0Var);
                return G;
            }
        });
    }

    public o0.h<x0> y(final String str) {
        a0();
        final o0.i iVar = new o0.i();
        this.f4145d.l(new Runnable() { // from class: i1.k0
            @Override // java.lang.Runnable
            public final void run() {
                l0.this.H(str, iVar);
            }
        });
        return iVar.a();
    }
}
