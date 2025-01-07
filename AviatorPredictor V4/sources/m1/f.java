package m1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import l1.r;
import l1.s;
import l1.t;
import x1.x;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private final l1.l f6638a;

    /* renamed from: b, reason: collision with root package name */
    private final m f6639b;

    /* renamed from: c, reason: collision with root package name */
    private final List<e> f6640c;

    f(l1.l lVar, m mVar) {
        this(lVar, mVar, new ArrayList());
    }

    f(l1.l lVar, m mVar, List<e> list) {
        this.f6638a = lVar;
        this.f6639b = mVar;
        this.f6640c = list;
    }

    public static f c(s sVar, d dVar) {
        if (!sVar.i()) {
            return null;
        }
        if (dVar != null && dVar.c().isEmpty()) {
            return null;
        }
        if (dVar == null) {
            return sVar.e() ? new c(sVar.getKey(), m.f6655c) : new o(sVar.getKey(), sVar.k(), m.f6655c);
        }
        t k4 = sVar.k();
        t tVar = new t();
        HashSet hashSet = new HashSet();
        for (r rVar : dVar.c()) {
            if (!hashSet.contains(rVar)) {
                if (k4.h(rVar) == null && rVar.s() > 1) {
                    rVar = rVar.u();
                }
                tVar.l(rVar, k4.h(rVar));
                hashSet.add(rVar);
            }
        }
        return new l(sVar.getKey(), tVar, d.b(hashSet), m.f6655c);
    }

    public abstract d a(s sVar, d dVar, x0.o oVar);

    public abstract void b(s sVar, i iVar);

    public t d(l1.i iVar) {
        t tVar = null;
        for (e eVar : this.f6640c) {
            x c5 = eVar.b().c(iVar.f(eVar.a()));
            if (c5 != null) {
                if (tVar == null) {
                    tVar = new t();
                }
                tVar.l(eVar.a(), c5);
            }
        }
        return tVar;
    }

    public abstract d e();

    public List<e> f() {
        return this.f6640c;
    }

    public l1.l g() {
        return this.f6638a;
    }

    public m h() {
        return this.f6639b;
    }

    boolean i(f fVar) {
        return this.f6638a.equals(fVar.f6638a) && this.f6639b.equals(fVar.f6639b);
    }

    int j() {
        return (g().hashCode() * 31) + this.f6639b.hashCode();
    }

    String k() {
        return "key=" + this.f6638a + ", precondition=" + this.f6639b;
    }

    protected Map<r, x> l(x0.o oVar, s sVar) {
        HashMap hashMap = new HashMap(this.f6640c.size());
        for (e eVar : this.f6640c) {
            hashMap.put(eVar.a(), eVar.b().a(sVar.f(eVar.a()), oVar));
        }
        return hashMap;
    }

    protected Map<r, x> m(s sVar, List<x> list) {
        HashMap hashMap = new HashMap(this.f6640c.size());
        p1.b.d(this.f6640c.size() == list.size(), "server transform count (%d) should match field transform count (%d)", Integer.valueOf(list.size()), Integer.valueOf(this.f6640c.size()));
        for (int r4 = 0; r4 < list.size(); r4++) {
            e eVar = this.f6640c.get(r4);
            hashMap.put(eVar.a(), eVar.b().b(sVar.f(eVar.a()), list.get(r4)));
        }
        return hashMap;
    }

    void n(s sVar) {
        p1.b.d(sVar.getKey().equals(g()), "Can only apply a mutation to a document with the same key", new Object[0]);
    }
}
