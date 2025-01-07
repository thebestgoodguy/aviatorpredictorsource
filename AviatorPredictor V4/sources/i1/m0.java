package i1;

import i1.q;

/* loaded from: classes.dex */
public class m0 extends q {
    m0(l1.r rVar, x1.x xVar) {
        super(rVar, q.b.IN, xVar);
        p1.b.d(l1.y.t(xVar), "InFilter expects an ArrayValue", new Object[0]);
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        x1.x f5 = iVar.f(g());
        return f5 != null && l1.y.p(i().f0(), f5);
    }
}
