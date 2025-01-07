package i1;

import com.google.firebase.firestore.u;
import p1.g;

/* loaded from: classes.dex */
public class k1<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private p1.g f4129a;

    /* renamed from: b, reason: collision with root package name */
    private o1.n0 f4130b;

    /* renamed from: c, reason: collision with root package name */
    private p1.t<g1, o0.h<TResult>> f4131c;

    /* renamed from: d, reason: collision with root package name */
    private int f4132d;

    /* renamed from: e, reason: collision with root package name */
    private p1.r f4133e;

    /* renamed from: f, reason: collision with root package name */
    private o0.i<TResult> f4134f = new o0.i<>();

    public k1(p1.g gVar, o1.n0 n0Var, com.google.firebase.firestore.u0 u0Var, p1.t<g1, o0.h<TResult>> tVar) {
        this.f4129a = gVar;
        this.f4130b = n0Var;
        this.f4131c = tVar;
        this.f4132d = u0Var.a();
        this.f4133e = new p1.r(gVar, g.d.RETRY_TRANSACTION);
    }

    private void d(o0.h hVar) {
        if (this.f4132d <= 0 || !e(hVar.l())) {
            this.f4134f.b(hVar.l());
        } else {
            j();
        }
    }

    private static boolean e(Exception exc) {
        if (!(exc instanceof com.google.firebase.firestore.u)) {
            return false;
        }
        com.google.firebase.firestore.u uVar = (com.google.firebase.firestore.u) exc;
        u.a a5 = uVar.a();
        return a5 == u.a.ABORTED || a5 == u.a.FAILED_PRECONDITION || !o1.m.j(uVar.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void f(o0.h hVar, o0.h hVar2) {
        if (hVar2.p()) {
            this.f4134f.c(hVar.m());
        } else {
            d(hVar2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(g1 g1Var, final o0.h hVar) {
        if (hVar.p()) {
            g1Var.c().b(this.f4129a.o(), new o0.d() { // from class: i1.j1
                @Override // o0.d
                public final void a(o0.h hVar2) {
                    k1.this.f(hVar, hVar2);
                }
            });
        } else {
            d(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        final g1 p4 = this.f4130b.p();
        this.f4131c.d(p4).b(this.f4129a.o(), new o0.d() { // from class: i1.i1
            @Override // o0.d
            public final void a(o0.h hVar) {
                k1.this.g(p4, hVar);
            }
        });
    }

    private void j() {
        this.f4132d--;
        this.f4133e.b(new Runnable() { // from class: i1.h1
            @Override // java.lang.Runnable
            public final void run() {
                k1.this.h();
            }
        });
    }

    public o0.h<TResult> i() {
        j();
        return this.f4134f.a();
    }
}
