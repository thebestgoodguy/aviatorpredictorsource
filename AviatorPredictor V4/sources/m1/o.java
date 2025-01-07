package m1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l1.r;
import l1.s;
import l1.t;
import x1.x;

/* loaded from: classes.dex */
public final class o extends f {

    /* renamed from: d, reason: collision with root package name */
    private final t f6659d;

    public o(l1.l lVar, t tVar, m mVar) {
        this(lVar, tVar, mVar, new ArrayList());
    }

    public o(l1.l lVar, t tVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f6659d = tVar;
    }

    @Override // m1.f
    public d a(s sVar, d dVar, x0.o oVar) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map<r, x> l4 = l(oVar, sVar);
        t clone = this.f6659d.clone();
        clone.m(l4);
        sVar.l(sVar.j(), clone).u();
        return null;
    }

    @Override // m1.f
    public void b(s sVar, i iVar) {
        n(sVar);
        t clone = this.f6659d.clone();
        clone.m(m(sVar, iVar.a()));
        sVar.l(iVar.b(), clone).t();
    }

    @Override // m1.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        return i(oVar) && this.f6659d.equals(oVar.f6659d) && f().equals(oVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f6659d.hashCode();
    }

    public t o() {
        return this.f6659d;
    }

    public String toString() {
        return "SetMutation{" + k() + ", value=" + this.f6659d + "}";
    }
}
