package c1;

import c1.c;
import c1.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class k<K, V> extends c<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private h<K, V> f1117e;

    /* renamed from: f, reason: collision with root package name */
    private Comparator<K> f1118f;

    private static class b<A, B, C> {

        /* renamed from: a, reason: collision with root package name */
        private final List<A> f1119a;

        /* renamed from: b, reason: collision with root package name */
        private final Map<B, C> f1120b;

        /* renamed from: c, reason: collision with root package name */
        private final c.a.InterfaceC0014a<A, B> f1121c;

        /* renamed from: d, reason: collision with root package name */
        private j<A, C> f1122d;

        /* renamed from: e, reason: collision with root package name */
        private j<A, C> f1123e;

        static class a implements Iterable<C0016b> {

            /* renamed from: e, reason: collision with root package name */
            private long f1124e;

            /* renamed from: f, reason: collision with root package name */
            private final int f1125f;

            /* renamed from: c1.k$b$a$a, reason: collision with other inner class name */
            class C0015a implements Iterator<C0016b> {

                /* renamed from: e, reason: collision with root package name */
                private int f1126e;

                C0015a() {
                    this.f1126e = a.this.f1125f - 1;
                }

                @Override // java.util.Iterator
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C0016b next() {
                    long j4 = a.this.f1124e & (1 << this.f1126e);
                    C0016b c0016b = new C0016b();
                    c0016b.f1128a = j4 == 0;
                    c0016b.f1129b = (int) Math.pow(2.0d, this.f1126e);
                    this.f1126e--;
                    return c0016b;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f1126e >= 0;
                }

                @Override // java.util.Iterator
                public void remove() {
                }
            }

            public a(int r7) {
                int r72 = r7 + 1;
                int floor = (int) Math.floor(Math.log(r72) / Math.log(2.0d));
                this.f1125f = floor;
                this.f1124e = (((long) Math.pow(2.0d, floor)) - 1) & r72;
            }

            @Override // java.lang.Iterable
            public Iterator<C0016b> iterator() {
                return new C0015a();
            }
        }

        /* renamed from: c1.k$b$b, reason: collision with other inner class name */
        static class C0016b {

            /* renamed from: a, reason: collision with root package name */
            public boolean f1128a;

            /* renamed from: b, reason: collision with root package name */
            public int f1129b;

            C0016b() {
            }
        }

        private b(List<A> list, Map<B, C> map, c.a.InterfaceC0014a<A, B> interfaceC0014a) {
            this.f1119a = list;
            this.f1120b = map;
            this.f1121c = interfaceC0014a;
        }

        private h<A, C> a(int r4, int r5) {
            if (r5 == 0) {
                return g.i();
            }
            if (r5 == 1) {
                A a5 = this.f1119a.get(r4);
                return new f(a5, d(a5), null, null);
            }
            int r52 = r5 / 2;
            int r02 = r4 + r52;
            h<A, C> a6 = a(r4, r52);
            h<A, C> a7 = a(r02 + 1, r52);
            A a8 = this.f1119a.get(r02);
            return new f(a8, d(a8), a6, a7);
        }

        public static <A, B, C> k<A, C> b(List<A> list, Map<B, C> map, c.a.InterfaceC0014a<A, B> interfaceC0014a, Comparator<A> comparator) {
            b bVar = new b(list, map, interfaceC0014a);
            Collections.sort(list, comparator);
            Iterator<C0016b> it = new a(list.size()).iterator();
            int size = list.size();
            while (it.hasNext()) {
                C0016b next = it.next();
                int r12 = next.f1129b;
                size -= r12;
                if (next.f1128a) {
                    bVar.c(h.a.BLACK, r12, size);
                } else {
                    bVar.c(h.a.BLACK, r12, size);
                    int r5 = next.f1129b;
                    size -= r5;
                    bVar.c(h.a.RED, r5, size);
                }
            }
            h hVar = bVar.f1122d;
            if (hVar == null) {
                hVar = g.i();
            }
            return new k<>(hVar, comparator);
        }

        private void c(h.a aVar, int r4, int r5) {
            h<A, C> a5 = a(r5 + 1, r4 - 1);
            A a6 = this.f1119a.get(r5);
            j<A, C> iVar = aVar == h.a.RED ? new i<>(a6, d(a6), null, a5) : new f<>(a6, d(a6), null, a5);
            if (this.f1122d == null) {
                this.f1122d = iVar;
            } else {
                this.f1123e.t(iVar);
            }
            this.f1123e = iVar;
        }

        private C d(A a5) {
            return this.f1120b.get(this.f1121c.a(a5));
        }
    }

    private k(h<K, V> hVar, Comparator<K> comparator) {
        this.f1117e = hVar;
        this.f1118f = comparator;
    }

    public static <A, B, C> k<A, C> w(List<A> list, Map<B, C> map, c.a.InterfaceC0014a<A, B> interfaceC0014a, Comparator<A> comparator) {
        return b.b(list, map, interfaceC0014a, comparator);
    }

    public static <A, B> k<A, B> x(Map<A, B> map, Comparator<A> comparator) {
        return b.b(new ArrayList(map.keySet()), map, c.a.d(), comparator);
    }

    private h<K, V> y(K k4) {
        h<K, V> hVar = this.f1117e;
        while (!hVar.isEmpty()) {
            int compare = this.f1118f.compare(k4, hVar.getKey());
            if (compare < 0) {
                hVar = hVar.b();
            } else {
                if (compare == 0) {
                    return hVar;
                }
                hVar = hVar.a();
            }
        }
        return null;
    }

    @Override // c1.c
    public boolean i(K k4) {
        return y(k4) != null;
    }

    @Override // c1.c
    public int indexOf(K k4) {
        h<K, V> hVar = this.f1117e;
        int r12 = 0;
        while (!hVar.isEmpty()) {
            int compare = this.f1118f.compare(k4, hVar.getKey());
            if (compare == 0) {
                return r12 + hVar.b().size();
            }
            if (compare < 0) {
                hVar = hVar.b();
            } else {
                r12 += hVar.b().size() + 1;
                hVar = hVar.a();
            }
        }
        return -1;
    }

    @Override // c1.c
    public boolean isEmpty() {
        return this.f1117e.isEmpty();
    }

    @Override // c1.c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new d(this.f1117e, null, this.f1118f, false);
    }

    @Override // c1.c
    public V p(K k4) {
        h<K, V> y4 = y(k4);
        if (y4 != null) {
            return y4.getValue();
        }
        return null;
    }

    @Override // c1.c
    public Comparator<K> q() {
        return this.f1118f;
    }

    @Override // c1.c
    public K r() {
        return this.f1117e.h().getKey();
    }

    @Override // c1.c
    public K s() {
        return this.f1117e.f().getKey();
    }

    @Override // c1.c
    public int size() {
        return this.f1117e.size();
    }

    @Override // c1.c
    public c<K, V> t(K k4, V v4) {
        return new k(this.f1117e.c(k4, v4, this.f1118f).e(null, null, h.a.BLACK, null, null), this.f1118f);
    }

    @Override // c1.c
    public Iterator<Map.Entry<K, V>> u(K k4) {
        return new d(this.f1117e, k4, this.f1118f, false);
    }

    @Override // c1.c
    public c<K, V> v(K k4) {
        return !i(k4) ? this : new k(this.f1117e.d(k4, this.f1118f).e(null, null, h.a.BLACK, null, null), this.f1118f);
    }
}
