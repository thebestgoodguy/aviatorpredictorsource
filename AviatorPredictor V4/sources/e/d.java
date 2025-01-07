package e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
abstract class d<K, V> {

    /* renamed from: a, reason: collision with root package name */
    d<K, V>.b f3449a;

    /* renamed from: b, reason: collision with root package name */
    d<K, V>.c f3450b;

    /* renamed from: c, reason: collision with root package name */
    d<K, V>.e f3451c;

    final class a<T> implements Iterator<T> {

        /* renamed from: e, reason: collision with root package name */
        final int f3452e;

        /* renamed from: f, reason: collision with root package name */
        int f3453f;

        /* renamed from: g, reason: collision with root package name */
        int f3454g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3455h = false;

        a(int r32) {
            this.f3452e = r32;
            this.f3453f = d.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3454g < this.f3453f;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t4 = (T) d.this.b(this.f3454g, this.f3452e);
            this.f3454g++;
            this.f3455h = true;
            return t4;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3455h) {
                throw new IllegalStateException();
            }
            int r02 = this.f3454g - 1;
            this.f3454g = r02;
            this.f3453f--;
            this.f3455h = false;
            d.this.h(r02);
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d5 = d.this.d();
            for (Map.Entry<K, V> entry : collection) {
                d.this.g(entry.getKey(), entry.getValue());
            }
            return d5 != d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e5 = d.this.e(entry.getKey());
            if (e5 < 0) {
                return false;
            }
            return e.c.b(d.this.b(e5, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int r32 = 0;
            for (int d5 = d.this.d() - 1; d5 >= 0; d5--) {
                Object b5 = d.this.b(d5, 0);
                Object b6 = d.this.b(d5, 1);
                r32 += (b5 == null ? 0 : b5.hashCode()) ^ (b6 == null ? 0 : b6.hashCode());
            }
            return r32;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C0032d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return d.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return d.j(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return d.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int r22 = 0;
            for (int d5 = d.this.d() - 1; d5 >= 0; d5--) {
                Object b5 = d.this.b(d5, 0);
                r22 += b5 == null ? 0 : b5.hashCode();
            }
            return r22;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e5 = d.this.e(obj);
            if (e5 < 0) {
                return false;
            }
            d.this.h(e5);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return d.o(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return d.p(d.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return d.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d.this.r(tArr, 0);
        }
    }

    /* renamed from: e.d$d, reason: collision with other inner class name */
    final class C0032d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: e, reason: collision with root package name */
        int f3459e;

        /* renamed from: g, reason: collision with root package name */
        boolean f3461g = false;

        /* renamed from: f, reason: collision with root package name */
        int f3460f = -1;

        C0032d() {
            this.f3459e = d.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f3460f++;
            this.f3461g = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f3461g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e.c.b(entry.getKey(), d.this.b(this.f3460f, 0)) && e.c.b(entry.getValue(), d.this.b(this.f3460f, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f3461g) {
                return (K) d.this.b(this.f3460f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f3461g) {
                return (V) d.this.b(this.f3460f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3460f < this.f3459e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f3461g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b5 = d.this.b(this.f3460f, 0);
            Object b6 = d.this.b(this.f3460f, 1);
            return (b5 == null ? 0 : b5.hashCode()) ^ (b6 != null ? b6.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f3461g) {
                throw new IllegalStateException();
            }
            d.this.h(this.f3460f);
            this.f3460f--;
            this.f3459e--;
            this.f3461g = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            if (this.f3461g) {
                return (V) d.this.i(this.f3460f, v4);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            d.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return d.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return d.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f5 = d.this.f(obj);
            if (f5 < 0) {
                return false;
            }
            d.this.h(f5);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d5 = d.this.d();
            int r12 = 0;
            boolean z4 = false;
            while (r12 < d5) {
                if (collection.contains(d.this.b(r12, 1))) {
                    d.this.h(r12);
                    r12--;
                    d5--;
                    z4 = true;
                }
                r12++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d5 = d.this.d();
            int r12 = 0;
            boolean z4 = false;
            while (r12 < d5) {
                if (!collection.contains(d.this.b(r12, 1))) {
                    d.this.h(r12);
                    r12--;
                    d5--;
                    z4 = true;
                }
                r12++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public int size() {
            return d.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return d.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) d.this.r(tArr, 1);
        }
    }

    d() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int r12, int r22);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k4, V v4);

    protected abstract void h(int r12);

    protected abstract V i(int r12, V v4);

    public Set<Map.Entry<K, V>> l() {
        if (this.f3449a == null) {
            this.f3449a = new b();
        }
        return this.f3449a;
    }

    public Set<K> m() {
        if (this.f3450b == null) {
            this.f3450b = new c();
        }
        return this.f3450b;
    }

    public Collection<V> n() {
        if (this.f3451c == null) {
            this.f3451c = new e();
        }
        return this.f3451c;
    }

    public Object[] q(int r5) {
        int d5 = d();
        Object[] objArr = new Object[d5];
        for (int r22 = 0; r22 < d5; r22++) {
            objArr[r22] = b(r22, r5);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int r5) {
        int d5 = d();
        if (tArr.length < d5) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d5));
        }
        for (int r12 = 0; r12 < d5; r12++) {
            tArr[r12] = b(r12, r5);
        }
        if (tArr.length > d5) {
            tArr[d5] = null;
        }
        return tArr;
    }
}
