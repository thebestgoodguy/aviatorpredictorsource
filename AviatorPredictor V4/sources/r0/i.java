package r0;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import r0.g;

/* loaded from: classes.dex */
public abstract class i<K, V> implements Map<K, V>, Serializable {

    /* renamed from: h, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f7393h = new Map.Entry[0];

    /* renamed from: e, reason: collision with root package name */
    private transient j<Map.Entry<K, V>> f7394e;

    /* renamed from: f, reason: collision with root package name */
    private transient j<K> f7395f;

    /* renamed from: g, reason: collision with root package name */
    private transient g<V> f7396g;

    public static class a<K, V> {

        /* renamed from: a, reason: collision with root package name */
        Comparator<? super V> f7397a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f7398b;

        /* renamed from: c, reason: collision with root package name */
        int f7399c = 0;

        /* renamed from: d, reason: collision with root package name */
        boolean f7400d = false;

        a(int r12) {
            this.f7398b = new Object[r12 * 2];
        }

        private void b(int r32) {
            int r33 = r32 * 2;
            Object[] objArr = this.f7398b;
            if (r33 > objArr.length) {
                this.f7398b = Arrays.copyOf(objArr, g.a.a(objArr.length, r33));
                this.f7400d = false;
            }
        }

        public i<K, V> a() {
            f();
            this.f7400d = true;
            return s.k(this.f7399c, this.f7398b);
        }

        public a<K, V> c(K k4, V v4) {
            b(this.f7399c + 1);
            c.a(k4, v4);
            Object[] objArr = this.f7398b;
            int r12 = this.f7399c;
            objArr[r12 * 2] = k4;
            objArr[(r12 * 2) + 1] = v4;
            this.f7399c = r12 + 1;
            return this;
        }

        public a<K, V> d(Map.Entry<? extends K, ? extends V> entry) {
            return c(entry.getKey(), entry.getValue());
        }

        public a<K, V> e(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                b(this.f7399c + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
            return this;
        }

        void f() {
            int r32;
            if (this.f7397a != null) {
                if (this.f7400d) {
                    this.f7398b = Arrays.copyOf(this.f7398b, this.f7399c * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f7399c];
                int r22 = 0;
                while (true) {
                    r32 = this.f7399c;
                    if (r22 >= r32) {
                        break;
                    }
                    Object[] objArr = this.f7398b;
                    int r5 = r22 * 2;
                    entryArr[r22] = new AbstractMap.SimpleImmutableEntry(objArr[r5], objArr[r5 + 1]);
                    r22++;
                }
                Arrays.sort(entryArr, 0, r32, p.a(this.f7397a).b(n.c()));
                for (int r12 = 0; r12 < this.f7399c; r12++) {
                    int r33 = r12 * 2;
                    this.f7398b[r33] = entryArr[r12].getKey();
                    this.f7398b[r33 + 1] = entryArr[r12].getValue();
                }
            }
        }
    }

    i() {
    }

    public static <K, V> i<K, V> a(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.e(iterable);
        return aVar.a();
    }

    public static <K, V> i<K, V> b(Map<? extends K, ? extends V> map) {
        if ((map instanceof i) && !(map instanceof SortedMap)) {
            i<K, V> iVar = (i) map;
            if (!iVar.g()) {
                return iVar;
            }
        }
        return a(map.entrySet());
    }

    public static <K, V> i<K, V> i() {
        return (i<K, V>) s.f7410l;
    }

    abstract j<Map.Entry<K, V>> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract j<K> d();

    abstract g<V> e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return n.a(this, obj);
    }

    @Override // java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public j<Map.Entry<K, V>> entrySet() {
        j<Map.Entry<K, V>> jVar = this.f7394e;
        if (jVar != null) {
            return jVar;
        }
        j<Map.Entry<K, V>> c5 = c();
        this.f7394e = c5;
        return c5;
    }

    abstract boolean g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v4) {
        V v5 = get(obj);
        return v5 != null ? v5 : v4;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public j<K> keySet() {
        j<K> jVar = this.f7395f;
        if (jVar != null) {
            return jVar;
        }
        j<K> d5 = d();
        this.f7395f = d5;
        return d5;
    }

    @Override // java.util.Map
    public int hashCode() {
        return u.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public g<V> values() {
        g<V> gVar = this.f7396g;
        if (gVar != null) {
            return gVar;
        }
        g<V> e5 = e();
        this.f7396g = e5;
        return e5;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return n.b(this);
    }
}
