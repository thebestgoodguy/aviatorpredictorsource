package com.google.protobuf;

/* loaded from: classes.dex */
abstract class v1<T, B> {
    v1() {
    }

    abstract void a(B b5, int r22, int r32);

    abstract void b(B b5, int r22, long j4);

    abstract void c(B b5, int r22, T t4);

    abstract void d(B b5, int r22, j jVar);

    abstract void e(B b5, int r22, long j4);

    abstract B f(Object obj);

    abstract T g(Object obj);

    abstract int h(T t4);

    abstract int i(T t4);

    abstract void j(Object obj);

    abstract T k(T t4, T t5);

    final void l(B b5, l1 l1Var) {
        while (l1Var.O() != Integer.MAX_VALUE && m(b5, l1Var)) {
        }
    }

    final boolean m(B b5, l1 l1Var) {
        int k4 = l1Var.k();
        int a5 = b2.a(k4);
        int b6 = b2.b(k4);
        if (b6 == 0) {
            e(b5, a5, l1Var.F());
            return true;
        }
        if (b6 == 1) {
            b(b5, a5, l1Var.n());
            return true;
        }
        if (b6 == 2) {
            d(b5, a5, l1Var.e());
            return true;
        }
        if (b6 != 3) {
            if (b6 == 4) {
                return false;
            }
            if (b6 != 5) {
                throw e0.e();
            }
            a(b5, a5, l1Var.H());
            return true;
        }
        B n4 = n();
        int c5 = b2.c(a5, 4);
        l(n4, l1Var);
        if (c5 != l1Var.k()) {
            throw e0.b();
        }
        c(b5, a5, r(n4));
        return true;
    }

    abstract B n();

    abstract void o(Object obj, B b5);

    abstract void p(Object obj, T t4);

    abstract boolean q(l1 l1Var);

    abstract T r(B b5);

    abstract void s(T t4, c2 c2Var);

    abstract void t(T t4, c2 c2Var);
}
