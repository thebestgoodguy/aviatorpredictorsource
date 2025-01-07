package com.google.firebase.auth;

import android.net.Uri;
import com.google.android.gms.internal.p000firebaseauthapi.bp;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z extends x.a implements x0 {
    public o0.h<Void> A0(String str) {
        return B0(str, null);
    }

    public o0.h<Void> B0(String str, e eVar) {
        return FirebaseAuth.getInstance(C0()).W(this, false).k(new g2(this, str, eVar));
    }

    public abstract x0.e C0();

    public abstract z D0();

    public abstract z E0(List list);

    public abstract bp F0();

    public abstract String G0();

    public abstract String H0();

    public abstract List I0();

    public abstract void J0(bp bpVar);

    public abstract void K0(List list);

    public abstract String R();

    public abstract String X();

    public abstract String e();

    public o0.h<Void> j0() {
        return FirebaseAuth.getInstance(C0()).U(this);
    }

    public o0.h<b0> k0(boolean z4) {
        return FirebaseAuth.getInstance(C0()).W(this, z4);
    }

    public abstract Uri l();

    public abstract a0 l0();

    public abstract g0 m0();

    public abstract String n();

    public abstract List<? extends x0> n0();

    public abstract String o0();

    public abstract boolean p0();

    public o0.h<i> q0(h hVar) {
        w.r.i(hVar);
        return FirebaseAuth.getInstance(C0()).X(this, hVar);
    }

    public o0.h<i> r0(h hVar) {
        w.r.i(hVar);
        return FirebaseAuth.getInstance(C0()).Y(this, hVar);
    }

    public o0.h<Void> s0() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C0());
        return firebaseAuth.Z(this, new c2(firebaseAuth));
    }

    public o0.h<Void> t0() {
        return FirebaseAuth.getInstance(C0()).W(this, false).k(new e2(this));
    }

    public o0.h<Void> u0(e eVar) {
        return FirebaseAuth.getInstance(C0()).W(this, false).k(new f2(this, eVar));
    }

    public o0.h<i> v0(String str) {
        w.r.e(str);
        return FirebaseAuth.getInstance(C0()).d0(this, str);
    }

    public o0.h<Void> w0(String str) {
        w.r.e(str);
        return FirebaseAuth.getInstance(C0()).e0(this, str);
    }

    public o0.h<Void> x0(String str) {
        w.r.e(str);
        return FirebaseAuth.getInstance(C0()).f0(this, str);
    }

    public o0.h<Void> y0(n0 n0Var) {
        return FirebaseAuth.getInstance(C0()).g0(this, n0Var);
    }

    public o0.h<Void> z0(y0 y0Var) {
        w.r.i(y0Var);
        return FirebaseAuth.getInstance(C0()).h0(this, y0Var);
    }
}
