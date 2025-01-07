package i1;

import i1.q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class o0 extends q {

    /* renamed from: d, reason: collision with root package name */
    private final List<l1.l> f4175d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    o0(l1.r r2, x1.x r3) {
        /*
            r1 = this;
            i1.q$b r0 = i1.q.b.IN
            r1.<init>(r2, r0, r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f4175d = r2
            java.util.List r3 = l(r0, r3)
            r2.addAll(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.o0.<init>(l1.r, x1.x):void");
    }

    static List<l1.l> l(q.b bVar, x1.x xVar) {
        p1.b.d(bVar == q.b.IN || bVar == q.b.NOT_IN, "extractDocumentKeysFromArrayValue requires IN or NOT_IN operators", new Object[0]);
        p1.b.d(l1.y.t(xVar), "KeyFieldInFilter/KeyFieldNotInFilter expects an ArrayValue", new Object[0]);
        ArrayList arrayList = new ArrayList();
        for (x1.x xVar2 : xVar.f0().k()) {
            p1.b.d(l1.y.B(xVar2), "Comparing on key with " + bVar.toString() + ", but an array value was not a ReferenceValue", new Object[0]);
            arrayList.add(l1.l.k(xVar2.n0()));
        }
        return arrayList;
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        return this.f4175d.contains(iVar.getKey());
    }
}
