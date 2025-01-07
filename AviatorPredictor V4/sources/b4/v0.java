package b4;

import k3.m;

/* loaded from: classes.dex */
public final class v0 {
    public static final <T> void a(u0<? super T> u0Var, int r5) {
        if (q0.a()) {
            if (!(r5 != -1)) {
                throw new AssertionError();
            }
        }
        n3.d<? super T> c5 = u0Var.c();
        boolean z4 = r5 == 4;
        if (z4 || !(c5 instanceof kotlinx.coroutines.internal.f) || b(r5) != b(u0Var.f1052g)) {
            d(u0Var, c5, z4);
            return;
        }
        g0 g0Var = ((kotlinx.coroutines.internal.f) c5).f6415h;
        n3.g context = c5.getContext();
        if (g0Var.H(context)) {
            g0Var.F(context, u0Var);
        } else {
            e(u0Var);
        }
    }

    public static final boolean b(int r22) {
        return r22 == 1 || r22 == 2;
    }

    public static final boolean c(int r12) {
        return r12 == 2;
    }

    public static final <T> void d(u0<? super T> u0Var, n3.d<? super T> dVar, boolean z4) {
        Object e5;
        Object h5 = u0Var.h();
        Throwable d5 = u0Var.d(h5);
        if (d5 != null) {
            m.a aVar = k3.m.f6368e;
            e5 = k3.n.a(d5);
        } else {
            m.a aVar2 = k3.m.f6368e;
            e5 = u0Var.e(h5);
        }
        Object a5 = k3.m.a(e5);
        if (!z4) {
            dVar.resumeWith(a5);
            return;
        }
        kotlinx.coroutines.internal.f fVar = (kotlinx.coroutines.internal.f) dVar;
        n3.d<T> dVar2 = fVar.f6416i;
        Object obj = fVar.f6418k;
        n3.g context = dVar2.getContext();
        Object c5 = kotlinx.coroutines.internal.c0.c(context, obj);
        i2<?> e6 = c5 != kotlinx.coroutines.internal.c0.f6404a ? f0.e(dVar2, context, c5) : null;
        try {
            fVar.f6416i.resumeWith(a5);
            k3.s sVar = k3.s.f6374a;
        } finally {
            if (e6 == null || e6.y0()) {
                kotlinx.coroutines.internal.c0.a(context, c5);
            }
        }
    }

    private static final void e(u0<?> u0Var) {
        a1 a5 = g2.f1005a.a();
        if (a5.f0()) {
            a5.R(u0Var);
            return;
        }
        a5.X(true);
        try {
            d(u0Var, u0Var.c(), true);
            do {
            } while (a5.j0());
        } finally {
            try {
            } finally {
            }
        }
    }
}
