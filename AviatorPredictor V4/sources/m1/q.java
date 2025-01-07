package m1;

import l1.s;

/* loaded from: classes.dex */
public final class q extends f {
    public q(l1.l lVar, m mVar) {
        super(lVar, mVar);
    }

    @Override // m1.f
    public d a(s sVar, d dVar, x0.o oVar) {
        throw p1.b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // m1.f
    public void b(s sVar, i iVar) {
        throw p1.b.a("VerifyMutation should only be used in Transactions.", new Object[0]);
    }

    @Override // m1.f
    public d e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        return i((q) obj);
    }

    public int hashCode() {
        return j();
    }

    public String toString() {
        return "VerifyMutation{" + k() + "}";
    }
}
