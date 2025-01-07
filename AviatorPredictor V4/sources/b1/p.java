package b1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
class p {

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final d<?> f661a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<b> f662b = new HashSet();

        /* renamed from: c, reason: collision with root package name */
        private final Set<b> f663c = new HashSet();

        b(d<?> dVar) {
            this.f661a = dVar;
        }

        void a(b bVar) {
            this.f662b.add(bVar);
        }

        void b(b bVar) {
            this.f663c.add(bVar);
        }

        d<?> c() {
            return this.f661a;
        }

        Set<b> d() {
            return this.f662b;
        }

        boolean e() {
            return this.f662b.isEmpty();
        }

        boolean f() {
            return this.f663c.isEmpty();
        }

        void g(b bVar) {
            this.f663c.remove(bVar);
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Class<?> f664a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f665b;

        private c(Class<?> cls, boolean z4) {
            this.f664a = cls;
            this.f665b = z4;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f664a.equals(this.f664a) && cVar.f665b == this.f665b;
        }

        public int hashCode() {
            return ((this.f664a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f665b).hashCode();
        }
    }

    static void a(List<d<?>> list) {
        Set<b> c5 = c(list);
        Set<b> b5 = b(c5);
        int r22 = 0;
        while (!b5.isEmpty()) {
            b next = b5.iterator().next();
            b5.remove(next);
            r22++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    b5.add(bVar);
                }
            }
        }
        if (r22 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : c5) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new r(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<d<?>> list) {
        Set<b> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator<d<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = hashMap.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().e()) {
                            if (qVar.e() && (set = (Set) hashMap.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = hashMap.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            d<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.g()) {
                c cVar = new c(cls, !next.m());
                if (!hashMap.containsKey(cVar)) {
                    hashMap.put(cVar, new HashSet());
                }
                Set set2 = (Set) hashMap.get(cVar);
                if (!set2.isEmpty() && !cVar.f665b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
