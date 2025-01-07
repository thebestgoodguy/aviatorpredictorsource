package b4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class h {
    public static final p1 a(m0 m0Var, n3.g gVar, o0 o0Var, u3.p<? super m0, ? super n3.d<? super k3.s>, ? extends Object> pVar) {
        n3.g c5 = f0.c(m0Var, gVar);
        a y1Var = o0Var.h() ? new y1(c5, pVar) : new e2(c5, true);
        y1Var.w0(o0Var, y1Var, pVar);
        return y1Var;
    }

    public static /* synthetic */ p1 b(m0 m0Var, n3.g gVar, o0 o0Var, u3.p pVar, int r4, Object obj) {
        if ((r4 & 1) != 0) {
            gVar = n3.h.f6694e;
        }
        if ((r4 & 2) != 0) {
            o0Var = o0.DEFAULT;
        }
        return g.a(m0Var, gVar, o0Var, pVar);
    }
}
