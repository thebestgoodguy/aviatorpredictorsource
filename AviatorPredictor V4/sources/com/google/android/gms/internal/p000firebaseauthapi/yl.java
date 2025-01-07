package com.google.android.gms.internal.p000firebaseauthapi;

import a1.e0;
import a1.i1;
import a1.m1;
import a1.o0;
import a1.o1;
import a1.q;
import a1.v0;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.j;
import com.google.firebase.auth.n0;
import com.google.firebase.auth.p0;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.s0;
import com.google.firebase.auth.y0;
import com.google.firebase.auth.z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import o0.h;
import o0.k;
import w.r;
import x0.e;

/* loaded from: classes.dex */
public final class yl extends fn {
    public yl(e eVar) {
        this.f1652a = new bm(eVar);
        this.f1653b = Executors.newCachedThreadPool();
    }

    static m1 o(e eVar, uo uoVar) {
        r.i(eVar);
        r.i(uoVar);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i1(uoVar, "firebase"));
        List A0 = uoVar.A0();
        if (A0 != null && !A0.isEmpty()) {
            for (int r22 = 0; r22 < A0.size(); r22++) {
                arrayList.add(new i1((hp) A0.get(r22)));
            }
        }
        m1 m1Var = new m1(eVar, arrayList);
        m1Var.S0(new o1(uoVar.k0(), uoVar.j0()));
        m1Var.R0(uoVar.C0());
        m1Var.Q0(uoVar.m0());
        m1Var.K0(e0.b(uoVar.z0()));
        return m1Var;
    }

    public final h A(e eVar, z zVar, com.google.firebase.auth.h hVar, String str, o0 o0Var) {
        yk ykVar = new yk(hVar, str);
        ykVar.f(eVar);
        ykVar.g(zVar);
        ykVar.d(o0Var);
        ykVar.e(o0Var);
        return a(ykVar);
    }

    public final h B(e eVar, z zVar, j jVar, o0 o0Var) {
        zk zkVar = new zk(jVar);
        zkVar.f(eVar);
        zkVar.g(zVar);
        zkVar.d(o0Var);
        zkVar.e(o0Var);
        return a(zkVar);
    }

    public final h C(e eVar, z zVar, String str, String str2, String str3, o0 o0Var) {
        al alVar = new al(str, str2, str3);
        alVar.f(eVar);
        alVar.g(zVar);
        alVar.d(o0Var);
        alVar.e(o0Var);
        return a(alVar);
    }

    public final h D(e eVar, z zVar, n0 n0Var, String str, o0 o0Var) {
        rn.c();
        bl blVar = new bl(n0Var, str);
        blVar.f(eVar);
        blVar.g(zVar);
        blVar.d(o0Var);
        blVar.e(o0Var);
        return a(blVar);
    }

    public final h E(e eVar, z zVar, o0 o0Var) {
        cl clVar = new cl();
        clVar.f(eVar);
        clVar.g(zVar);
        clVar.d(o0Var);
        clVar.e(o0Var);
        return a(clVar);
    }

    public final h F(e eVar, com.google.firebase.auth.e eVar2, String str) {
        dl dlVar = new dl(str, eVar2);
        dlVar.f(eVar);
        return a(dlVar);
    }

    public final h G(e eVar, String str, com.google.firebase.auth.e eVar2, String str2) {
        eVar2.w0(1);
        el elVar = new el(str, eVar2, str2, "sendPasswordResetEmail");
        elVar.f(eVar);
        return a(elVar);
    }

    public final h H(e eVar, String str, com.google.firebase.auth.e eVar2, String str2) {
        eVar2.w0(6);
        el elVar = new el(str, eVar2, str2, "sendSignInLinkToEmail");
        elVar.f(eVar);
        return a(elVar);
    }

    public final h I(e eVar, v0 v0Var, String str) {
        fl flVar = new fl(str);
        flVar.f(eVar);
        flVar.d(v0Var);
        return a(flVar);
    }

    public final h J(e eVar, com.google.firebase.auth.h hVar, String str, v0 v0Var) {
        gl glVar = new gl(hVar, str);
        glVar.f(eVar);
        glVar.d(v0Var);
        return a(glVar);
    }

    public final h K(e eVar, String str, String str2, v0 v0Var) {
        il ilVar = new il(str, str2);
        ilVar.f(eVar);
        ilVar.d(v0Var);
        return a(ilVar);
    }

    public final h b(e eVar, String str, String str2, String str3, v0 v0Var) {
        jl jlVar = new jl(str, str2, str3);
        jlVar.f(eVar);
        jlVar.d(v0Var);
        return a(jlVar);
    }

    public final h c(e eVar, j jVar, v0 v0Var) {
        kl klVar = new kl(jVar);
        klVar.f(eVar);
        klVar.d(v0Var);
        return a(klVar);
    }

    public final h d(e eVar, n0 n0Var, String str, v0 v0Var) {
        rn.c();
        ll llVar = new ll(n0Var, str);
        llVar.f(eVar);
        llVar.d(v0Var);
        return a(llVar);
    }

    public final h e(a1.j jVar, String str, String str2, long j4, boolean z4, boolean z5, String str3, String str4, boolean z6, p0.b bVar, Executor executor, Activity activity) {
        ml mlVar = new ml(jVar, str, str2, j4, z4, z5, str3, str4, z6);
        mlVar.h(bVar, activity, executor, str);
        return a(mlVar);
    }

    public final h f(a1.j jVar, s0 s0Var, String str, long j4, boolean z4, boolean z5, String str2, String str3, boolean z6, p0.b bVar, Executor executor, Activity activity) {
        nl nlVar = new nl(s0Var, r.e(jVar.m0()), str, j4, z4, z5, str2, str3, z6);
        nlVar.h(bVar, activity, executor, s0Var.e());
        return a(nlVar);
    }

    public final h g(e eVar, z zVar, String str, o0 o0Var) {
        ol olVar = new ol(zVar.H0(), str);
        olVar.f(eVar);
        olVar.g(zVar);
        olVar.d(o0Var);
        olVar.e(o0Var);
        return a(olVar);
    }

    public final h h(e eVar, z zVar, String str, o0 o0Var) {
        r.i(eVar);
        r.e(str);
        r.i(zVar);
        r.i(o0Var);
        List I0 = zVar.I0();
        if ((I0 != null && !I0.contains(str)) || zVar.p0()) {
            return k.c(cm.a(new Status(17016, str)));
        }
        if (((str.hashCode() == 1216985755 && str.equals("password")) ? (char) 0 : (char) 65535) != 0) {
            ql qlVar = new ql(str);
            qlVar.f(eVar);
            qlVar.g(zVar);
            qlVar.d(o0Var);
            qlVar.e(o0Var);
            return a(qlVar);
        }
        pl plVar = new pl();
        plVar.f(eVar);
        plVar.g(zVar);
        plVar.d(o0Var);
        plVar.e(o0Var);
        return a(plVar);
    }

    public final h i(e eVar, z zVar, String str, o0 o0Var) {
        rl rlVar = new rl(str);
        rlVar.f(eVar);
        rlVar.g(zVar);
        rlVar.d(o0Var);
        rlVar.e(o0Var);
        return a(rlVar);
    }

    public final h j(e eVar, z zVar, String str, o0 o0Var) {
        sl slVar = new sl(str);
        slVar.f(eVar);
        slVar.g(zVar);
        slVar.d(o0Var);
        slVar.e(o0Var);
        return a(slVar);
    }

    public final h k(e eVar, z zVar, n0 n0Var, o0 o0Var) {
        rn.c();
        tl tlVar = new tl(n0Var);
        tlVar.f(eVar);
        tlVar.g(zVar);
        tlVar.d(o0Var);
        tlVar.e(o0Var);
        return a(tlVar);
    }

    public final h l(e eVar, z zVar, y0 y0Var, o0 o0Var) {
        ul ulVar = new ul(y0Var);
        ulVar.f(eVar);
        ulVar.g(zVar);
        ulVar.d(o0Var);
        ulVar.e(o0Var);
        return a(ulVar);
    }

    public final h m(String str, String str2, com.google.firebase.auth.e eVar) {
        eVar.w0(7);
        return a(new vl(str, str2, eVar));
    }

    public final h n(e eVar, String str, String str2) {
        wl wlVar = new wl(str, str2);
        wlVar.f(eVar);
        return a(wlVar);
    }

    public final void p(e eVar, pp ppVar, p0.b bVar, Activity activity, Executor executor) {
        xl xlVar = new xl(ppVar);
        xlVar.f(eVar);
        xlVar.h(bVar, activity, executor, ppVar.l0());
        a(xlVar);
    }

    public final h q(e eVar, String str, String str2) {
        kk kkVar = new kk(str, str2);
        kkVar.f(eVar);
        return a(kkVar);
    }

    public final h r(e eVar, String str, String str2) {
        mk mkVar = new mk(str, str2);
        mkVar.f(eVar);
        return a(mkVar);
    }

    public final h s(e eVar, String str, String str2, String str3) {
        nk nkVar = new nk(str, str2, str3);
        nkVar.f(eVar);
        return a(nkVar);
    }

    public final h t(e eVar, String str, String str2, String str3, v0 v0Var) {
        ok okVar = new ok(str, str2, str3);
        okVar.f(eVar);
        okVar.d(v0Var);
        return a(okVar);
    }

    public final h u(z zVar, q qVar) {
        pk pkVar = new pk();
        pkVar.g(zVar);
        pkVar.d(qVar);
        pkVar.e(qVar);
        return a(pkVar);
    }

    public final h v(e eVar, String str, String str2) {
        qk qkVar = new qk(str, str2);
        qkVar.f(eVar);
        return a(qkVar);
    }

    public final h w(e eVar, q0 q0Var, z zVar, String str, v0 v0Var) {
        rn.c();
        rk rkVar = new rk(q0Var, zVar.H0(), str);
        rkVar.f(eVar);
        rkVar.d(v0Var);
        return a(rkVar);
    }

    public final h x(e eVar, z zVar, q0 q0Var, String str, v0 v0Var) {
        rn.c();
        sk skVar = new sk(q0Var, str);
        skVar.f(eVar);
        skVar.d(v0Var);
        if (zVar != null) {
            skVar.g(zVar);
        }
        return a(skVar);
    }

    public final h y(e eVar, z zVar, String str, o0 o0Var) {
        tk tkVar = new tk(str);
        tkVar.f(eVar);
        tkVar.g(zVar);
        tkVar.d(o0Var);
        tkVar.e(o0Var);
        return a(tkVar);
    }

    public final h z(e eVar, z zVar, com.google.firebase.auth.h hVar, o0 o0Var) {
        r.i(eVar);
        r.i(hVar);
        r.i(zVar);
        r.i(o0Var);
        List I0 = zVar.I0();
        if (I0 != null && I0.contains(hVar.j0())) {
            return k.c(cm.a(new Status(17015)));
        }
        if (hVar instanceof j) {
            j jVar = (j) hVar;
            if (jVar.r0()) {
                xk xkVar = new xk(jVar);
                xkVar.f(eVar);
                xkVar.g(zVar);
                xkVar.d(o0Var);
                xkVar.e(o0Var);
                return a(xkVar);
            }
            uk ukVar = new uk(jVar);
            ukVar.f(eVar);
            ukVar.g(zVar);
            ukVar.d(o0Var);
            ukVar.e(o0Var);
            return a(ukVar);
        }
        if (hVar instanceof n0) {
            rn.c();
            wk wkVar = new wk((n0) hVar);
            wkVar.f(eVar);
            wkVar.g(zVar);
            wkVar.d(o0Var);
            wkVar.e(o0Var);
            return a(wkVar);
        }
        r.i(eVar);
        r.i(hVar);
        r.i(zVar);
        r.i(o0Var);
        vk vkVar = new vk(hVar);
        vkVar.f(eVar);
        vkVar.g(zVar);
        vkVar.d(o0Var);
        vkVar.e(o0Var);
        return a(vkVar);
    }
}
