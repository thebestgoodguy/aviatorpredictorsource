package m1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l1.r;
import l1.s;
import l1.t;
import x1.x;

/* loaded from: classes.dex */
public final class l extends f {

    /* renamed from: d, reason: collision with root package name */
    private final t f6653d;

    /* renamed from: e, reason: collision with root package name */
    private final d f6654e;

    public l(l1.l lVar, t tVar, d dVar, m mVar) {
        this(lVar, tVar, dVar, mVar, new ArrayList());
    }

    public l(l1.l lVar, t tVar, d dVar, m mVar, List<e> list) {
        super(lVar, mVar, list);
        this.f6653d = tVar;
        this.f6654e = dVar;
    }

    private List<r> o() {
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().a());
        }
        return arrayList;
    }

    private Map<r, x> p() {
        HashMap hashMap = new HashMap();
        for (r rVar : this.f6654e.c()) {
            if (!rVar.q()) {
                hashMap.put(rVar, this.f6653d.h(rVar));
            }
        }
        return hashMap;
    }

    @Override // m1.f
    public d a(s sVar, d dVar, x0.o oVar) {
        n(sVar);
        if (!h().e(sVar)) {
            return dVar;
        }
        Map<r, x> l4 = l(oVar, sVar);
        Map<r, x> p4 = p();
        t k4 = sVar.k();
        k4.m(p4);
        k4.m(l4);
        sVar.l(sVar.j(), sVar.k()).u();
        if (dVar == null) {
            return null;
        }
        HashSet hashSet = new HashSet(dVar.c());
        hashSet.addAll(this.f6654e.c());
        hashSet.addAll(o());
        return d.b(hashSet);
    }

    @Override // m1.f
    public void b(s sVar, i iVar) {
        n(sVar);
        if (!h().e(sVar)) {
            sVar.n(iVar.b());
            return;
        }
        Map<r, x> m4 = m(sVar, iVar.a());
        t k4 = sVar.k();
        k4.m(p());
        k4.m(m4);
        sVar.l(iVar.b(), sVar.k()).t();
    }

    @Override // m1.f
    public d e() {
        return this.f6654e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return i(lVar) && this.f6653d.equals(lVar.f6653d) && f().equals(lVar.f());
    }

    public int hashCode() {
        return (j() * 31) + this.f6653d.hashCode();
    }

    public t q() {
        return this.f6653d;
    }

    public String toString() {
        return "PatchMutation{" + k() + ", mask=" + this.f6654e + ", value=" + this.f6653d + "}";
    }
}
