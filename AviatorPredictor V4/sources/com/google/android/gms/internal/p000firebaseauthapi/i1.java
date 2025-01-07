package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
abstract class i1 {
    i1() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int r22, int r32);

    abstract void i(Object obj, int r22, long j4);

    abstract void j(Object obj, int r22, Object obj2);

    abstract void k(Object obj, int r22, hr hrVar);

    abstract void l(Object obj, int r22, long j4);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    final boolean p(Object obj, p0 p0Var) {
        int e5 = p0Var.e();
        int r12 = e5 >>> 3;
        int r02 = e5 & 7;
        if (r02 == 0) {
            l(obj, r12, p0Var.t());
            return true;
        }
        if (r02 == 1) {
            i(obj, r12, p0Var.h());
            return true;
        }
        if (r02 == 2) {
            k(obj, r12, p0Var.n());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw h.a();
            }
            h(obj, r12, p0Var.v());
            return true;
        }
        Object f5 = f();
        int r32 = 4 | (r12 << 3);
        while (p0Var.c() != Integer.MAX_VALUE && p(f5, p0Var)) {
        }
        if (r32 != p0Var.e()) {
            throw h.b();
        }
        g(f5);
        j(obj, r12, f5);
        return true;
    }

    abstract boolean q(p0 p0Var);

    abstract void r(Object obj, ur urVar);
}
