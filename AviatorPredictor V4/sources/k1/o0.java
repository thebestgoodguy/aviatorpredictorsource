package k1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class o0 implements b {

    /* renamed from: a, reason: collision with root package name */
    private final TreeMap<l1.l, m1.k> f6204a = new TreeMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, Set<l1.l>> f6205b = new HashMap();

    private void g(int r4, m1.f fVar) {
        m1.k kVar = this.f6204a.get(fVar.g());
        if (kVar != null) {
            this.f6205b.get(Integer.valueOf(kVar.c())).remove(fVar.g());
        }
        this.f6204a.put(fVar.g(), m1.k.a(r4, fVar));
        if (this.f6205b.get(Integer.valueOf(r4)) == null) {
            this.f6205b.put(Integer.valueOf(r4), new HashSet());
        }
        this.f6205b.get(Integer.valueOf(r4)).add(fVar.g());
    }

    @Override // k1.b
    public m1.k a(l1.l lVar) {
        return this.f6204a.get(lVar);
    }

    @Override // k1.b
    public Map<l1.l, m1.k> b(SortedSet<l1.l> sortedSet) {
        HashMap hashMap = new HashMap();
        for (l1.l lVar : sortedSet) {
            m1.k kVar = this.f6204a.get(lVar);
            if (kVar != null) {
                hashMap.put(lVar, kVar);
            }
        }
        return hashMap;
    }

    @Override // k1.b
    public void c(int r32) {
        if (this.f6205b.containsKey(Integer.valueOf(r32))) {
            Set<l1.l> set = this.f6205b.get(Integer.valueOf(r32));
            this.f6205b.remove(Integer.valueOf(r32));
            Iterator<l1.l> it = set.iterator();
            while (it.hasNext()) {
                this.f6204a.remove(it.next());
            }
        }
    }

    @Override // k1.b
    public Map<l1.l, m1.k> d(l1.u uVar, int r8) {
        HashMap hashMap = new HashMap();
        int s4 = uVar.s() + 1;
        for (m1.k kVar : this.f6204a.tailMap(l1.l.n(uVar.d(""))).values()) {
            l1.l b5 = kVar.b();
            if (!uVar.r(b5.t())) {
                break;
            }
            if (b5.t().s() == s4 && kVar.c() > r8) {
                hashMap.put(kVar.b(), kVar);
            }
        }
        return hashMap;
    }

    @Override // k1.b
    public void e(int r5, Map<l1.l, m1.f> map) {
        for (Map.Entry<l1.l, m1.f> entry : map.entrySet()) {
            g(r5, (m1.f) p1.x.d(entry.getValue(), "null value for key: %s", entry.getKey()));
        }
    }

    @Override // k1.b
    public Map<l1.l, m1.k> f(String str, int r7, int r8) {
        TreeMap treeMap = new TreeMap();
        for (m1.k kVar : this.f6204a.values()) {
            if (kVar.b().q().equals(str) && kVar.c() > r7) {
                Map map = (Map) treeMap.get(Integer.valueOf(kVar.c()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(kVar.c()), map);
                }
                map.put(kVar.b(), kVar);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll((Map) it.next());
            if (hashMap.size() >= r8) {
                break;
            }
        }
        return hashMap;
    }
}
