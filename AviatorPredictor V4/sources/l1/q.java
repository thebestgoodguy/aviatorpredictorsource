package l1;

import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import l1.q;

@AutoValue
/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static b f6555a = b.a(0, a.f6557e);

    /* renamed from: b, reason: collision with root package name */
    public static final Comparator<q> f6556b = new Comparator() { // from class: l1.o
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int i4;
            i4 = q.i((q) obj, (q) obj2);
            return i4;
        }
    };

    @AutoValue
    public static abstract class a implements Comparable<a> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f6557e = h(w.f6583f, l.h(), -1);

        /* renamed from: f, reason: collision with root package name */
        public static final Comparator<s> f6558f = new Comparator() { // from class: l1.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int r4;
                r4 = q.a.r((s) obj, (s) obj2);
                return r4;
            }
        };

        public static a h(w wVar, l lVar, int r32) {
            return new l1.b(wVar, lVar, r32);
        }

        public static a i(w wVar, int r9) {
            long i4 = wVar.g().i();
            int g5 = wVar.g().g() + 1;
            return h(new w(((double) g5) == 1.0E9d ? new x0.o(i4 + 1, 0) : new x0.o(i4, g5)), l.h(), r9);
        }

        public static a k(i iVar) {
            return h(iVar.d(), iVar.getKey(), -1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int r(s sVar, s sVar2) {
            return k(sVar).compareTo(k(sVar2));
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            int compareTo = q().compareTo(aVar.q());
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = n().compareTo(aVar.n());
            return compareTo2 != 0 ? compareTo2 : Integer.compare(p(), aVar.p());
        }

        public abstract l n();

        public abstract int p();

        public abstract w q();
    }

    @AutoValue
    public static abstract class b {
        public static b a(long j4, a aVar) {
            return new l1.c(j4, aVar);
        }

        public static b b(long j4, w wVar, l lVar, int r4) {
            return a(j4, a.h(wVar, lVar, r4));
        }

        public abstract a c();

        public abstract long d();
    }

    @AutoValue
    public static abstract class c implements Comparable<c> {

        public enum a {
            ASCENDING,
            DESCENDING,
            CONTAINS
        }

        public static c g(r rVar, a aVar) {
            return new d(rVar, aVar);
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            int compareTo = h().compareTo(cVar.h());
            return compareTo != 0 ? compareTo : i().compareTo(cVar.i());
        }

        public abstract r h();

        public abstract a i();
    }

    public static q b(int r12, String str, List<c> list, b bVar) {
        return new l1.a(r12, str, list, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int i(q qVar, q qVar2) {
        int compareTo = qVar.d().compareTo(qVar2.d());
        if (compareTo != 0) {
            return compareTo;
        }
        Iterator<c> it = qVar.h().iterator();
        Iterator<c> it2 = qVar2.h().iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo2 = it.next().compareTo(it2.next());
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return Boolean.compare(it.hasNext(), it2.hasNext());
    }

    public c c() {
        for (c cVar : h()) {
            if (cVar.i().equals(c.a.CONTAINS)) {
                return cVar;
            }
        }
        return null;
    }

    public abstract String d();

    public List<c> e() {
        ArrayList arrayList = new ArrayList();
        for (c cVar : h()) {
            if (!cVar.i().equals(c.a.CONTAINS)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public abstract int f();

    public abstract b g();

    public abstract List<c> h();
}
