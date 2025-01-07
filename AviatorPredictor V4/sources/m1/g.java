package m1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.y0;
import l1.s;
import l1.w;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f6641a;

    /* renamed from: b, reason: collision with root package name */
    private final x0.o f6642b;

    /* renamed from: c, reason: collision with root package name */
    private final List<f> f6643c;

    /* renamed from: d, reason: collision with root package name */
    private final List<f> f6644d;

    public g(int r4, x0.o oVar, List<f> list, List<f> list2) {
        p1.b.d(!list2.isEmpty(), "Cannot create an empty mutation batch", new Object[0]);
        this.f6641a = r4;
        this.f6642b = oVar;
        this.f6643c = list;
        this.f6644d = list2;
    }

    public Map<l1.l, f> a(Map<l1.l, y0> map, Set<l1.l> set) {
        HashMap hashMap = new HashMap();
        for (l1.l lVar : f()) {
            s sVar = (s) map.get(lVar).a();
            d b5 = b(sVar, map.get(lVar).b());
            if (set.contains(lVar)) {
                b5 = null;
            }
            f c5 = f.c(sVar, b5);
            if (c5 != null) {
                hashMap.put(lVar, c5);
            }
            if (!sVar.o()) {
                sVar.m(w.f6583f);
            }
        }
        return hashMap;
    }

    public d b(s sVar, d dVar) {
        for (int r12 = 0; r12 < this.f6643c.size(); r12++) {
            f fVar = this.f6643c.get(r12);
            if (fVar.g().equals(sVar.getKey())) {
                dVar = fVar.a(sVar, dVar, this.f6642b);
            }
        }
        for (int r02 = 0; r02 < this.f6644d.size(); r02++) {
            f fVar2 = this.f6644d.get(r02);
            if (fVar2.g().equals(sVar.getKey())) {
                dVar = fVar2.a(sVar, dVar, this.f6642b);
            }
        }
        return dVar;
    }

    public void c(s sVar, h hVar) {
        int size = this.f6644d.size();
        List<i> e5 = hVar.e();
        p1.b.d(e5.size() == size, "Mismatch between mutations length (%d) and results length (%d)", Integer.valueOf(size), Integer.valueOf(e5.size()));
        for (int r32 = 0; r32 < size; r32++) {
            f fVar = this.f6644d.get(r32);
            if (fVar.g().equals(sVar.getKey())) {
                fVar.b(sVar, e5.get(r32));
            }
        }
    }

    public List<f> d() {
        return this.f6643c;
    }

    public int e() {
        return this.f6641a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.f6641a == gVar.f6641a && this.f6642b.equals(gVar.f6642b) && this.f6643c.equals(gVar.f6643c) && this.f6644d.equals(gVar.f6644d);
    }

    public Set<l1.l> f() {
        HashSet hashSet = new HashSet();
        Iterator<f> it = this.f6644d.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        return hashSet;
    }

    public x0.o g() {
        return this.f6642b;
    }

    public List<f> h() {
        return this.f6644d;
    }

    public int hashCode() {
        return (((((this.f6641a * 31) + this.f6642b.hashCode()) * 31) + this.f6643c.hashCode()) * 31) + this.f6644d.hashCode();
    }

    public String toString() {
        return "MutationBatch(batchId=" + this.f6641a + ", localWriteTime=" + this.f6642b + ", baseMutations=" + this.f6643c + ", mutations=" + this.f6644d + ')';
    }
}
