package i1;

import i1.q;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e extends q {
    e(l1.r rVar, x1.x xVar) {
        super(rVar, q.b.ARRAY_CONTAINS_ANY, xVar);
        p1.b.d(l1.y.t(xVar), "ArrayContainsAnyFilter expects an ArrayValue", new Object[0]);
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        x1.x f5 = iVar.f(g());
        if (!l1.y.t(f5)) {
            return false;
        }
        Iterator<x1.x> it = f5.f0().k().iterator();
        while (it.hasNext()) {
            if (l1.y.p(i().f0(), it.next())) {
                return true;
            }
        }
        return false;
    }
}
