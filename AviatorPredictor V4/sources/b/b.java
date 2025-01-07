package b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: e, reason: collision with root package name */
    c<K, V> f586e;

    /* renamed from: f, reason: collision with root package name */
    private c<K, V> f587f;

    /* renamed from: g, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f588g = new WeakHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private int f589h = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f593h;
        }

        @Override // b.b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.f592g;
        }
    }

    /* renamed from: b.b$b, reason: collision with other inner class name */
    private static class C0007b<K, V> extends e<K, V> {
        C0007b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f592g;
        }

        @Override // b.b.e
        c<K, V> e(c<K, V> cVar) {
            return cVar.f593h;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: e, reason: collision with root package name */
        final K f590e;

        /* renamed from: f, reason: collision with root package name */
        final V f591f;

        /* renamed from: g, reason: collision with root package name */
        c<K, V> f592g;

        /* renamed from: h, reason: collision with root package name */
        c<K, V> f593h;

        c(K k4, V v4) {
            this.f590e = k4;
            this.f591f = v4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f590e.equals(cVar.f590e) && this.f591f.equals(cVar.f591f);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f590e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f591f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f590e.hashCode() ^ this.f591f.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f590e + "=" + this.f591f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e, reason: collision with root package name */
        private c<K, V> f594e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f595f = true;

        d() {
        }

        @Override // b.b.f
        public void c(c<K, V> cVar) {
            c<K, V> cVar2 = this.f594e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f593h;
                this.f594e = cVar3;
                this.f595f = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f595f) {
                this.f595f = false;
                cVar = b.this.f586e;
            } else {
                c<K, V> cVar2 = this.f594e;
                cVar = cVar2 != null ? cVar2.f592g : null;
            }
            this.f594e = cVar;
            return this.f594e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f595f) {
                return b.this.f586e != null;
            }
            c<K, V> cVar = this.f594e;
            return (cVar == null || cVar.f592g == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f597e;

        /* renamed from: f, reason: collision with root package name */
        c<K, V> f598f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f597e = cVar2;
            this.f598f = cVar;
        }

        private c<K, V> g() {
            c<K, V> cVar = this.f598f;
            c<K, V> cVar2 = this.f597e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // b.b.f
        public void c(c<K, V> cVar) {
            if (this.f597e == cVar && cVar == this.f598f) {
                this.f598f = null;
                this.f597e = null;
            }
            c<K, V> cVar2 = this.f597e;
            if (cVar2 == cVar) {
                this.f597e = d(cVar2);
            }
            if (this.f598f == cVar) {
                this.f598f = g();
            }
        }

        abstract c<K, V> d(c<K, V> cVar);

        abstract c<K, V> e(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f598f;
            this.f598f = g();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f598f != null;
        }
    }

    interface f<K, V> {
        void c(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0007b c0007b = new C0007b(this.f587f, this.f586e);
        this.f588g.put(c0007b, Boolean.FALSE);
        return c0007b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int r12 = 0;
        while (it.hasNext()) {
            r12 += it.next().hashCode();
        }
        return r12;
    }

    public Map.Entry<K, V> i() {
        return this.f586e;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f586e, this.f587f);
        this.f588g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c<K, V> p(K k4) {
        c<K, V> cVar = this.f586e;
        while (cVar != null && !cVar.f590e.equals(k4)) {
            cVar = cVar.f592g;
        }
        return cVar;
    }

    public b<K, V>.d q() {
        b<K, V>.d dVar = new d();
        this.f588g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> r() {
        return this.f587f;
    }

    protected c<K, V> s(K k4, V v4) {
        c<K, V> cVar = new c<>(k4, v4);
        this.f589h++;
        c<K, V> cVar2 = this.f587f;
        if (cVar2 == null) {
            this.f586e = cVar;
        } else {
            cVar2.f592g = cVar;
            cVar.f593h = cVar2;
        }
        this.f587f = cVar;
        return cVar;
    }

    public int size() {
        return this.f589h;
    }

    public V t(K k4) {
        c<K, V> p4 = p(k4);
        if (p4 == null) {
            return null;
        }
        this.f589h--;
        if (!this.f588g.isEmpty()) {
            Iterator<f<K, V>> it = this.f588g.keySet().iterator();
            while (it.hasNext()) {
                it.next().c(p4);
            }
        }
        c<K, V> cVar = p4.f593h;
        c<K, V> cVar2 = p4.f592g;
        if (cVar != null) {
            cVar.f592g = cVar2;
        } else {
            this.f586e = cVar2;
        }
        c<K, V> cVar3 = p4.f592g;
        if (cVar3 != null) {
            cVar3.f593h = cVar;
        } else {
            this.f587f = cVar;
        }
        p4.f592g = null;
        p4.f593h = null;
        return p4.f591f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
