package i1;

import i1.q;

/* loaded from: classes.dex */
public class n0 extends q {

    /* renamed from: d, reason: collision with root package name */
    private final l1.l f4170d;

    n0(l1.r rVar, q.b bVar, x1.x xVar) {
        super(rVar, bVar, xVar);
        p1.b.d(l1.y.B(xVar), "KeyFieldFilter expects a ReferenceValue", new Object[0]);
        this.f4170d = l1.l.k(i().n0());
    }

    @Override // i1.q, i1.r
    public boolean e(l1.i iVar) {
        return k(iVar.getKey().compareTo(this.f4170d));
    }
}
