package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import com.google.firebase.auth.n0;
import w.r;
import x0.e;
import z.a;

/* loaded from: classes.dex */
public final class bm {

    /* renamed from: c, reason: collision with root package name */
    private static final a f1430c = new a("FirebaseAuth", "FirebaseAuthFallback:");

    /* renamed from: a, reason: collision with root package name */
    private final ik f1431a;

    /* renamed from: b, reason: collision with root package name */
    private final xn f1432b;

    bm(e eVar) {
        r.i(eVar);
        Context m4 = eVar.m();
        r.i(m4);
        this.f1431a = new ik(new qm(eVar, pm.a(), null, null, null));
        this.f1432b = new xn(m4);
    }

    private static boolean g(long j4, boolean z4) {
        if (j4 > 0 && z4) {
            return true;
        }
        f1430c.h("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void A(oh ohVar, zl zlVar) {
        r.i(ohVar);
        r.i(ohVar.j0());
        r.i(zlVar);
        this.f1431a.a(ohVar.j0(), new am(zlVar, f1430c));
    }

    public final void B(qh qhVar, zl zlVar) {
        r.i(qhVar);
        r.e(qhVar.j0());
        r.i(zlVar);
        this.f1431a.b(new fq(qhVar.j0(), qhVar.a()), new am(zlVar, f1430c));
    }

    public final void C(sh shVar, zl zlVar) {
        r.i(shVar);
        r.e(shVar.a());
        r.e(shVar.j0());
        r.i(zlVar);
        this.f1431a.c(shVar.a(), shVar.j0(), shVar.k0(), new am(zlVar, f1430c));
    }

    public final void D(uh uhVar, zl zlVar) {
        r.i(uhVar);
        r.i(uhVar.j0());
        r.i(zlVar);
        this.f1431a.d(uhVar.j0(), new am(zlVar, f1430c));
    }

    public final void E(wh whVar, zl zlVar) {
        r.i(zlVar);
        r.i(whVar);
        this.f1431a.e(nn.a((n0) r.i(whVar.j0())), new am(zlVar, f1430c));
    }

    public final void F(yh yhVar, zl zlVar) {
        r.i(yhVar);
        r.i(zlVar);
        String m02 = yhVar.m0();
        am amVar = new am(zlVar, f1430c);
        if (this.f1432b.l(m02)) {
            if (!yhVar.p0()) {
                this.f1432b.i(amVar, m02);
                return;
            }
            this.f1432b.j(m02);
        }
        long j02 = yhVar.j0();
        boolean q02 = yhVar.q0();
        wp b5 = wp.b(yhVar.k0(), yhVar.m0(), yhVar.l0(), yhVar.n0(), yhVar.o0());
        if (g(j02, q02)) {
            b5.d(new co(this.f1432b.c()));
        }
        this.f1432b.k(m02, amVar, j02, q02);
        this.f1431a.f(b5, new un(this.f1432b, amVar, m02));
    }

    public final void a(ai aiVar, zl zlVar) {
        r.i(aiVar);
        r.i(zlVar);
        String X = aiVar.k0().X();
        am amVar = new am(zlVar, f1430c);
        if (this.f1432b.l(X)) {
            if (!aiVar.p0()) {
                this.f1432b.i(amVar, X);
                return;
            }
            this.f1432b.j(X);
        }
        long j02 = aiVar.j0();
        boolean q02 = aiVar.q0();
        yp b5 = yp.b(aiVar.m0(), aiVar.k0().e(), aiVar.k0().X(), aiVar.l0(), aiVar.n0(), aiVar.o0());
        if (g(j02, q02)) {
            b5.d(new co(this.f1432b.c()));
        }
        this.f1432b.k(X, amVar, j02, q02);
        this.f1431a.g(b5, new un(this.f1432b, amVar, X));
    }

    public final void b(ci ciVar, zl zlVar) {
        r.i(ciVar);
        r.i(zlVar);
        this.f1431a.h(ciVar.a(), ciVar.j0(), new am(zlVar, f1430c));
    }

    public final void c(ei eiVar, zl zlVar) {
        r.i(eiVar);
        r.e(eiVar.a());
        r.i(zlVar);
        this.f1431a.i(eiVar.a(), new am(zlVar, f1430c));
    }

    public final void d(gi giVar, zl zlVar) {
        r.i(giVar);
        r.e(giVar.j0());
        r.e(giVar.a());
        r.i(zlVar);
        this.f1431a.j(giVar.j0(), giVar.a(), new am(zlVar, f1430c));
    }

    public final void e(ii iiVar, zl zlVar) {
        r.i(iiVar);
        r.e(iiVar.k0());
        r.i(iiVar.j0());
        r.i(zlVar);
        this.f1431a.k(iiVar.k0(), iiVar.j0(), new am(zlVar, f1430c));
    }

    public final void f(li liVar, zl zlVar) {
        r.i(liVar);
        this.f1431a.l(yo.c(liVar.j0(), liVar.k0(), liVar.l0()), new am(zlVar, f1430c));
    }

    public final void h(ag agVar, zl zlVar) {
        r.i(agVar);
        r.e(agVar.a());
        r.i(zlVar);
        this.f1431a.w(agVar.a(), agVar.j0(), new am(zlVar, f1430c));
    }

    public final void i(cg cgVar, zl zlVar) {
        r.i(cgVar);
        r.e(cgVar.a());
        r.e(cgVar.j0());
        r.i(zlVar);
        this.f1431a.x(cgVar.a(), cgVar.j0(), new am(zlVar, f1430c));
    }

    public final void j(eg egVar, zl zlVar) {
        r.i(egVar);
        r.e(egVar.a());
        r.e(egVar.j0());
        r.i(zlVar);
        this.f1431a.y(egVar.a(), egVar.j0(), new am(zlVar, f1430c));
    }

    public final void k(gg ggVar, zl zlVar) {
        r.i(ggVar);
        r.e(ggVar.a());
        r.i(zlVar);
        this.f1431a.z(ggVar.a(), ggVar.j0(), new am(zlVar, f1430c));
    }

    public final void l(ig igVar, zl zlVar) {
        r.i(igVar);
        r.e(igVar.a());
        r.e(igVar.j0());
        r.i(zlVar);
        this.f1431a.A(igVar.a(), igVar.j0(), igVar.k0(), new am(zlVar, f1430c));
    }

    public final void m(lg lgVar, zl zlVar) {
        r.i(lgVar);
        r.e(lgVar.a());
        r.e(lgVar.j0());
        r.i(zlVar);
        this.f1431a.B(lgVar.a(), lgVar.j0(), lgVar.k0(), new am(zlVar, f1430c));
    }

    public final void n(ng ngVar, zl zlVar) {
        r.i(ngVar);
        r.e(ngVar.a());
        r.i(zlVar);
        this.f1431a.C(ngVar.a(), new am(zlVar, f1430c));
    }

    public final void o(pg pgVar, zl zlVar) {
        r.i(pgVar);
        r.i(zlVar);
        this.f1431a.D(lo.b(pgVar.k0(), (String) r.i(pgVar.j0().s0()), (String) r.i(pgVar.j0().m0()), pgVar.l0()), pgVar.k0(), new am(zlVar, f1430c));
    }

    public final void p(rg rgVar, zl zlVar) {
        r.i(rgVar);
        r.i(zlVar);
        this.f1431a.E(no.b(rgVar.k0(), (String) r.i(rgVar.j0().s0()), (String) r.i(rgVar.j0().m0())), new am(zlVar, f1430c));
    }

    public final void q(tg tgVar, zl zlVar) {
        r.i(tgVar);
        r.i(zlVar);
        r.e(tgVar.a());
        this.f1431a.F(tgVar.a(), new am(zlVar, f1430c));
    }

    public final void r(vg vgVar, zl zlVar) {
        r.i(vgVar);
        r.e(vgVar.a());
        this.f1431a.G(vgVar.a(), vgVar.j0(), new am(zlVar, f1430c));
    }

    public final void s(xg xgVar, zl zlVar) {
        r.i(xgVar);
        r.e(xgVar.j0());
        r.e(xgVar.k0());
        r.e(xgVar.a());
        r.i(zlVar);
        this.f1431a.H(xgVar.j0(), xgVar.k0(), xgVar.a(), new am(zlVar, f1430c));
    }

    public final void t(zg zgVar, zl zlVar) {
        r.i(zgVar);
        r.e(zgVar.k0());
        r.i(zgVar.j0());
        r.i(zlVar);
        this.f1431a.I(zgVar.k0(), zgVar.j0(), new am(zlVar, f1430c));
    }

    public final void u(bh bhVar, zl zlVar) {
        r.i(zlVar);
        r.i(bhVar);
        n0 n0Var = (n0) r.i(bhVar.j0());
        this.f1431a.J(r.e(bhVar.k0()), nn.a(n0Var), new am(zlVar, f1430c));
    }

    public final void v(dh dhVar, zl zlVar) {
        r.i(dhVar);
        r.e(dhVar.a());
        r.i(zlVar);
        this.f1431a.K(dhVar.a(), new am(zlVar, f1430c));
    }

    public final void w(fh fhVar, zl zlVar) {
        r.i(fhVar);
        r.e(fhVar.k0());
        r.i(zlVar);
        this.f1431a.L(fhVar.k0(), fhVar.j0(), new am(zlVar, f1430c));
    }

    public final void x(hh hhVar, zl zlVar) {
        r.i(hhVar);
        r.e(hhVar.k0());
        r.i(zlVar);
        this.f1431a.M(hhVar.k0(), hhVar.j0(), hhVar.l0(), new am(zlVar, f1430c));
    }

    public final void y(jh jhVar, zl zlVar) {
        r.i(zlVar);
        r.i(jhVar);
        pp ppVar = (pp) r.i(jhVar.j0());
        String l02 = ppVar.l0();
        am amVar = new am(zlVar, f1430c);
        if (this.f1432b.l(l02)) {
            if (!ppVar.n0()) {
                this.f1432b.i(amVar, l02);
                return;
            }
            this.f1432b.j(l02);
        }
        long j02 = ppVar.j0();
        boolean o02 = ppVar.o0();
        if (g(j02, o02)) {
            ppVar.m0(new co(this.f1432b.c()));
        }
        this.f1432b.k(l02, amVar, j02, o02);
        this.f1431a.N(ppVar, new un(this.f1432b, amVar, l02));
    }

    public final void z(mh mhVar, zl zlVar) {
        r.i(mhVar);
        r.i(zlVar);
        this.f1431a.O(mhVar.a(), new am(zlVar, f1430c));
    }
}
