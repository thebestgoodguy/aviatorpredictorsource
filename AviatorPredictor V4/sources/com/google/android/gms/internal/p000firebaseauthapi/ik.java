package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.e;
import com.google.firebase.auth.j;
import com.google.firebase.auth.n1;
import com.google.firebase.auth.y0;
import w.r;

/* loaded from: classes.dex */
public final class ik {

    /* renamed from: a, reason: collision with root package name */
    private final in f1778a;

    public ik(in inVar) {
        this.f1778a = (in) r.i(inVar);
    }

    private final void m(String str, hn hnVar) {
        r.i(hnVar);
        r.e(str);
        bp l02 = bp.l0(str);
        if (l02.r0()) {
            hnVar.a(l02);
        } else {
            this.f1778a.f(new qo(l02.n0()), new hk(this, hnVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(io ioVar, am amVar) {
        r.i(ioVar);
        r.i(amVar);
        this.f1778a.c(ioVar, new ui(this, amVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(bp bpVar, String str, String str2, Boolean bool, n1 n1Var, am amVar, gn gnVar) {
        r.i(bpVar);
        r.i(gnVar);
        r.i(amVar);
        this.f1778a.g(new ro(bpVar.m0()), new xi(this, gnVar, str2, str, bool, n1Var, amVar, bpVar));
    }

    private final void p(yo yoVar, am amVar) {
        r.i(yoVar);
        r.i(amVar);
        this.f1778a.h(yoVar, new ak(this, amVar));
    }

    static /* bridge */ /* synthetic */ void t(ik ikVar, eq eqVar, am amVar, gn gnVar) {
        if (!eqVar.p()) {
            ikVar.o(new bp(eqVar.j(), eqVar.f(), Long.valueOf(eqVar.a()), "Bearer"), eqVar.i(), eqVar.h(), Boolean.valueOf(eqVar.o()), eqVar.b(), amVar, gnVar);
            return;
        }
        amVar.e(new ni(eqVar.n() ? new Status(17012) : l.a(eqVar.e()), eqVar.b(), eqVar.c(), eqVar.k()));
    }

    static /* bridge */ /* synthetic */ void u(ik ikVar, am amVar, bp bpVar, sp spVar, gn gnVar) {
        r.i(amVar);
        r.i(bpVar);
        r.i(spVar);
        r.i(gnVar);
        ikVar.f1778a.g(new ro(bpVar.m0()), new vi(ikVar, gnVar, amVar, bpVar, spVar));
    }

    static /* bridge */ /* synthetic */ void v(ik ikVar, am amVar, bp bpVar, uo uoVar, sp spVar, gn gnVar) {
        r.i(amVar);
        r.i(bpVar);
        r.i(uoVar);
        r.i(spVar);
        r.i(gnVar);
        ikVar.f1778a.l(spVar, new wi(ikVar, spVar, uoVar, amVar, bpVar, gnVar));
    }

    public final void A(String str, String str2, String str3, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        this.f1778a.i(new mp(str, str2, str3), new cj(this, amVar));
    }

    public final void B(String str, String str2, String str3, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        this.f1778a.m(new up(str, str2, null, str3), new ri(this, amVar));
    }

    public final void C(String str, am amVar) {
        r.e(str);
        r.i(amVar);
        m(str, new zj(this, amVar));
    }

    public final void D(lo loVar, String str, am amVar) {
        r.i(loVar);
        r.i(amVar);
        m(str, new tj(this, loVar, amVar));
    }

    public final void E(no noVar, am amVar) {
        r.i(noVar);
        r.i(amVar);
        this.f1778a.e(noVar, new uj(this, amVar));
    }

    public final void F(String str, am amVar) {
        r.e(str);
        r.i(amVar);
        this.f1778a.f(new qo(str), new bj(this, amVar));
    }

    public final void G(String str, String str2, am amVar) {
        r.e(str);
        r.i(amVar);
        this.f1778a.a(new eo(str, str2), new yi(this, amVar));
    }

    public final void H(String str, String str2, String str3, am amVar) {
        r.e(str);
        r.e(str2);
        r.e(str3);
        r.i(amVar);
        m(str3, new fj(this, str, str2, amVar));
    }

    public final void I(String str, cq cqVar, am amVar) {
        r.e(str);
        r.i(cqVar);
        r.i(amVar);
        m(str, new jj(this, cqVar, amVar));
    }

    public final void J(String str, kq kqVar, am amVar) {
        r.e(str);
        r.i(kqVar);
        r.i(amVar);
        m(str, new hj(this, kqVar, amVar));
    }

    public final void K(String str, am amVar) {
        r.e(str);
        r.i(amVar);
        m(str, new xj(this, amVar));
    }

    public final void L(String str, e eVar, am amVar) {
        r.e(str);
        r.i(amVar);
        yo yoVar = new yo(4);
        yoVar.g(str);
        if (eVar != null) {
            yoVar.d(eVar);
        }
        p(yoVar, amVar);
    }

    public final void M(String str, e eVar, String str2, am amVar) {
        r.e(str);
        r.i(amVar);
        yo yoVar = new yo(eVar.q0());
        yoVar.e(str);
        yoVar.d(eVar);
        yoVar.f(str2);
        this.f1778a.h(yoVar, new zi(this, amVar));
    }

    public final void N(pp ppVar, am amVar) {
        r.e(ppVar.l0());
        r.i(amVar);
        this.f1778a.k(ppVar, new dj(this, amVar));
    }

    public final void O(String str, am amVar) {
        r.i(amVar);
        this.f1778a.m(new up(str), new ck(this, amVar));
    }

    public final void a(cq cqVar, am amVar) {
        r.i(cqVar);
        r.i(amVar);
        cqVar.l0(true);
        this.f1778a.p(cqVar, new bk(this, amVar));
    }

    public final void b(fq fqVar, am amVar) {
        r.i(fqVar);
        r.i(amVar);
        this.f1778a.q(fqVar, new rj(this, amVar));
    }

    public final void c(String str, String str2, String str3, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        this.f1778a.r(new iq(str, str2, str3), new si(this, amVar));
    }

    public final void d(j jVar, am amVar) {
        r.i(jVar);
        r.i(amVar);
        if (jVar.s0()) {
            m(jVar.n0(), new ti(this, jVar, amVar));
        } else {
            n(new io(jVar, null), amVar);
        }
    }

    public final void e(kq kqVar, am amVar) {
        r.i(kqVar);
        r.i(amVar);
        this.f1778a.s(kqVar, new ej(this, amVar));
    }

    public final void f(wp wpVar, am amVar) {
        r.i(wpVar);
        r.i(amVar);
        this.f1778a.n(wpVar, new qj(this, amVar));
    }

    public final void g(yp ypVar, am amVar) {
        r.i(ypVar);
        r.i(amVar);
        this.f1778a.o(ypVar, new vj(this, amVar));
    }

    public final void h(String str, String str2, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        m(str, new pj(this, str2, amVar));
    }

    public final void i(String str, am amVar) {
        r.e(str);
        r.i(amVar);
        m(str, new kj(this, amVar));
    }

    public final void j(String str, String str2, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        m(str2, new nj(this, str, amVar));
    }

    public final void k(String str, y0 y0Var, am amVar) {
        r.e(str);
        r.i(y0Var);
        r.i(amVar);
        m(str, new dk(this, y0Var, amVar));
    }

    public final void l(yo yoVar, am amVar) {
        p(yoVar, amVar);
    }

    public final void w(String str, String str2, am amVar) {
        r.e(str);
        r.i(amVar);
        sp spVar = new sp();
        spVar.f(str);
        spVar.i(str2);
        this.f1778a.l(spVar, new gk(this, amVar));
    }

    public final void x(String str, String str2, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        m(str, new ek(this, str2, amVar));
    }

    public final void y(String str, String str2, am amVar) {
        r.e(str);
        r.e(str2);
        r.i(amVar);
        m(str, new fk(this, str2, amVar));
    }

    public final void z(String str, String str2, am amVar) {
        r.e(str);
        r.i(amVar);
        this.f1778a.i(new mp(str, null, str2), new aj(this, amVar));
    }
}
