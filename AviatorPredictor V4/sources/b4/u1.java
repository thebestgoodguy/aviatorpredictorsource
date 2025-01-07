package b4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final /* synthetic */ class u1 {
    public static final x a(p1 p1Var) {
        return new s1(p1Var);
    }

    public static /* synthetic */ x b(p1 p1Var, int r12, Object obj) {
        if ((r12 & 1) != 0) {
            p1Var = null;
        }
        return t1.a(p1Var);
    }

    public static final void c(n3.g gVar, CancellationException cancellationException) {
        p1 p1Var = (p1) gVar.get(p1.f1038a);
        if (p1Var == null) {
            return;
        }
        p1Var.r(cancellationException);
    }

    public static final void d(p1 p1Var) {
        if (!p1Var.e()) {
            throw p1Var.l();
        }
    }

    public static final void e(n3.g gVar) {
        p1 p1Var = (p1) gVar.get(p1.f1038a);
        if (p1Var == null) {
            return;
        }
        t1.d(p1Var);
    }
}
