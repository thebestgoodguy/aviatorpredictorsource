package i1;

import i1.q;

/* loaded from: classes.dex */
public class u0 extends q {
    u0(l1.r rVar, x1.x xVar) {
        super(rVar, q.b.NOT_IN, xVar);
        p1.b.d(l1.y.t(xVar), "NotInFilter expects an ArrayValue", new Object[0]);
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        x1.x f5;
        return (l1.y.p(i().f0(), l1.y.f6590b) || (f5 = iVar.f(g())) == null || l1.y.p(i().f0(), f5)) ? false : true;
    }
}
