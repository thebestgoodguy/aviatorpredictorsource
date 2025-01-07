package k1;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import l1.q;

/* loaded from: classes.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    private final f1 f6180a;

    /* renamed from: b, reason: collision with root package name */
    private final w0 f6181b;

    /* renamed from: c, reason: collision with root package name */
    private final b f6182c;

    /* renamed from: d, reason: collision with root package name */
    private final l f6183d;

    n(f1 f1Var, w0 w0Var, b bVar, l lVar) {
        this.f6180a = f1Var;
        this.f6181b = w0Var;
        this.f6182c = bVar;
        this.f6183d = lVar;
    }

    private Map<l1.l, y0> a(Map<l1.l, l1.s> map, Map<l1.l, m1.k> map2, Set<l1.l> set) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (l1.s sVar : map.values()) {
            m1.k kVar = map2.get(sVar.getKey());
            if (set.contains(sVar.getKey()) && (kVar == null || (kVar.d() instanceof m1.l))) {
                hashMap.put(sVar.getKey(), sVar);
            } else if (kVar != null) {
                hashMap2.put(sVar.getKey(), kVar.d().e());
                kVar.d().a(sVar, kVar.d().e(), x0.o.n());
            }
        }
        hashMap2.putAll(m(hashMap));
        HashMap hashMap3 = new HashMap();
        for (Map.Entry<l1.l, l1.s> entry : map.entrySet()) {
            hashMap3.put(entry.getKey(), new y0(entry.getValue(), (m1.d) hashMap2.get(entry.getKey())));
        }
        return hashMap3;
    }

    private l1.s b(l1.l lVar, m1.k kVar) {
        return (kVar == null || (kVar.d() instanceof m1.l)) ? this.f6180a.c(lVar) : l1.s.q(lVar);
    }

    private c1.c<l1.l, l1.i> e(i1.x0 x0Var, q.a aVar) {
        p1.b.d(x0Var.n().q(), "Currently we only support collection group queries at the root.", new Object[0]);
        String f5 = x0Var.f();
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        Iterator<l1.u> it = this.f6183d.b(f5).iterator();
        while (it.hasNext()) {
            Iterator<Map.Entry<l1.l, l1.i>> it2 = f(x0Var.a(it.next().d(f5)), aVar).iterator();
            while (it2.hasNext()) {
                Map.Entry<l1.l, l1.i> next = it2.next();
                a5 = a5.t(next.getKey(), next.getValue());
            }
        }
        return a5;
    }

    private c1.c<l1.l, l1.i> f(i1.x0 x0Var, q.a aVar) {
        Map<l1.l, l1.s> e5 = this.f6180a.e(x0Var.n(), aVar);
        Map<l1.l, m1.k> d5 = this.f6182c.d(x0Var.n(), aVar.p());
        for (Map.Entry<l1.l, m1.k> entry : d5.entrySet()) {
            if (!e5.containsKey(entry.getKey())) {
                e5.put(entry.getKey(), l1.s.q(entry.getKey()));
            }
        }
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        for (Map.Entry<l1.l, l1.s> entry2 : e5.entrySet()) {
            m1.k kVar = d5.get(entry2.getKey());
            if (kVar != null) {
                kVar.d().a(entry2.getValue(), m1.d.f6634b, x0.o.n());
            }
            if (x0Var.v(entry2.getValue())) {
                a5 = a5.t(entry2.getKey(), entry2.getValue());
            }
        }
        return a5;
    }

    private c1.c<l1.l, l1.i> g(l1.u uVar) {
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        l1.i c5 = c(l1.l.n(uVar));
        return c5.b() ? a5.t(c5.getKey(), c5) : a5;
    }

    private void l(Map<l1.l, m1.k> map, Set<l1.l> set) {
        TreeSet treeSet = new TreeSet();
        for (l1.l lVar : set) {
            if (!map.containsKey(lVar)) {
                treeSet.add(lVar);
            }
        }
        map.putAll(this.f6182c.b(treeSet));
    }

    private Map<l1.l, m1.d> m(Map<l1.l, l1.s> map) {
        List<m1.g> h5 = this.f6181b.h(map.keySet());
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        for (m1.g gVar : h5) {
            for (l1.l lVar : gVar.f()) {
                l1.s sVar = map.get(lVar);
                if (sVar != null) {
                    hashMap.put(lVar, gVar.b(sVar, hashMap.containsKey(lVar) ? (m1.d) hashMap.get(lVar) : m1.d.f6634b));
                    int e5 = gVar.e();
                    if (!treeMap.containsKey(Integer.valueOf(e5))) {
                        treeMap.put(Integer.valueOf(e5), new HashSet());
                    }
                    ((Set) treeMap.get(Integer.valueOf(e5))).add(lVar);
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : treeMap.descendingMap().entrySet()) {
            HashMap hashMap2 = new HashMap();
            for (l1.l lVar2 : (Set) entry.getValue()) {
                if (!hashSet.contains(lVar2)) {
                    m1.f c5 = m1.f.c(map.get(lVar2), (m1.d) hashMap.get(lVar2));
                    if (c5 != null) {
                        hashMap2.put(lVar2, c5);
                    }
                    hashSet.add(lVar2);
                }
            }
            this.f6182c.e(((Integer) entry.getKey()).intValue(), hashMap2);
        }
        return hashMap;
    }

    l1.i c(l1.l lVar) {
        m1.k a5 = this.f6182c.a(lVar);
        l1.s b5 = b(lVar, a5);
        if (a5 != null) {
            a5.d().a(b5, m1.d.f6634b, x0.o.n());
        }
        return b5;
    }

    c1.c<l1.l, l1.i> d(Iterable<l1.l> iterable) {
        return i(this.f6180a.f(iterable), new HashSet());
    }

    c1.c<l1.l, l1.i> h(i1.x0 x0Var, q.a aVar) {
        return x0Var.s() ? g(x0Var.n()) : x0Var.r() ? e(x0Var, aVar) : f(x0Var, aVar);
    }

    c1.c<l1.l, l1.i> i(Map<l1.l, l1.s> map, Set<l1.l> set) {
        HashMap hashMap = new HashMap();
        l(hashMap, map.keySet());
        c1.c<l1.l, l1.i> a5 = l1.j.a();
        for (Map.Entry<l1.l, y0> entry : a(map, hashMap, set).entrySet()) {
            a5 = a5.t(entry.getKey(), entry.getValue().a());
        }
        return a5;
    }

    m j(String str, q.a aVar, int r7) {
        Map<l1.l, l1.s> b5 = this.f6180a.b(str, aVar, r7);
        Map<l1.l, m1.k> f5 = r7 - b5.size() > 0 ? this.f6182c.f(str, aVar.p(), r7 - b5.size()) : Collections.emptyMap();
        int r6 = -1;
        for (m1.k kVar : f5.values()) {
            if (!b5.containsKey(kVar.b())) {
                b5.put(kVar.b(), b(kVar.b(), kVar));
            }
            r6 = Math.max(r6, kVar.c());
        }
        l(f5, b5.keySet());
        return m.a(r6, a(b5, f5, Collections.emptySet()));
    }

    Map<l1.l, y0> k(Map<l1.l, l1.s> map) {
        HashMap hashMap = new HashMap();
        l(hashMap, map.keySet());
        return a(map, hashMap, new HashSet());
    }

    void n(Set<l1.l> set) {
        m(this.f6180a.f(set));
    }
}
