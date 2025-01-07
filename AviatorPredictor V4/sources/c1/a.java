package c1;

import c1.c;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a<K, V> extends c<K, V> {

    /* renamed from: e, reason: collision with root package name */
    private final K[] f1095e;

    /* renamed from: f, reason: collision with root package name */
    private final V[] f1096f;

    /* renamed from: g, reason: collision with root package name */
    private final Comparator<K> f1097g;

    /* renamed from: c1.a$a, reason: collision with other inner class name */
    class C0013a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e, reason: collision with root package name */
        int f1098e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f1099f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1100g;

        C0013a(int r22, boolean z4) {
            this.f1099f = r22;
            this.f1100g = z4;
            this.f1098e = r22;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Object obj = a.this.f1095e[this.f1098e];
            Object[] objArr = a.this.f1096f;
            int r22 = this.f1098e;
            Object obj2 = objArr[r22];
            this.f1098e = this.f1100g ? r22 - 1 : r22 + 1;
            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1100g) {
                if (this.f1098e >= 0) {
                    return true;
                }
            } else if (this.f1098e < a.this.f1095e.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
        }
    }

    public a(Comparator<K> comparator) {
        this.f1095e = (K[]) new Object[0];
        this.f1096f = (V[]) new Object[0];
        this.f1097g = comparator;
    }

    private a(Comparator<K> comparator, K[] kArr, V[] vArr) {
        this.f1095e = kArr;
        this.f1096f = vArr;
        this.f1097g = comparator;
    }

    private int A(K k4) {
        int r32 = 0;
        for (K k5 : this.f1095e) {
            if (this.f1097g.compare(k4, k5) == 0) {
                return r32;
            }
            r32++;
        }
        return -1;
    }

    private int B(K k4) {
        int r02 = 0;
        while (true) {
            K[] kArr = this.f1095e;
            if (r02 >= kArr.length || this.f1097g.compare(kArr[r02], k4) >= 0) {
                break;
            }
            r02++;
        }
        return r02;
    }

    private Iterator<Map.Entry<K, V>> C(int r22, boolean z4) {
        return new C0013a(r22, z4);
    }

    private static <T> T[] D(T[] tArr, int r4) {
        int length = tArr.length - 1;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, r4);
        System.arraycopy(tArr, r4 + 1, tArr2, r4, length - r4);
        return tArr2;
    }

    private static <T> T[] E(T[] tArr, int r4, T t4) {
        int length = tArr.length;
        T[] tArr2 = (T[]) new Object[length];
        System.arraycopy(tArr, 0, tArr2, 0, length);
        tArr2[r4] = t4;
        return tArr2;
    }

    private static <T> T[] y(T[] tArr, int r4, T t4) {
        T[] tArr2 = (T[]) new Object[tArr.length + 1];
        System.arraycopy(tArr, 0, tArr2, 0, r4);
        tArr2[r4] = t4;
        System.arraycopy(tArr, r4, tArr2, r4 + 1, (r0 - r4) - 1);
        return tArr2;
    }

    public static <A, B, C> a<A, C> z(List<A> list, Map<B, C> map, c.a.InterfaceC0014a<A, B> interfaceC0014a, Comparator<A> comparator) {
        Collections.sort(list, comparator);
        int size = list.size();
        Object[] objArr = new Object[size];
        Object[] objArr2 = new Object[size];
        int r22 = 0;
        for (A a5 : list) {
            objArr[r22] = a5;
            objArr2[r22] = map.get(interfaceC0014a.a(a5));
            r22++;
        }
        return new a<>(comparator, objArr, objArr2);
    }

    @Override // c1.c
    public boolean i(K k4) {
        return A(k4) != -1;
    }

    @Override // c1.c
    public int indexOf(K k4) {
        return A(k4);
    }

    @Override // c1.c
    public boolean isEmpty() {
        return this.f1095e.length == 0;
    }

    @Override // c1.c, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return C(0, false);
    }

    @Override // c1.c
    public V p(K k4) {
        int A = A(k4);
        if (A != -1) {
            return this.f1096f[A];
        }
        return null;
    }

    @Override // c1.c
    public Comparator<K> q() {
        return this.f1097g;
    }

    @Override // c1.c
    public K r() {
        K[] kArr = this.f1095e;
        if (kArr.length > 0) {
            return kArr[kArr.length - 1];
        }
        return null;
    }

    @Override // c1.c
    public K s() {
        K[] kArr = this.f1095e;
        if (kArr.length > 0) {
            return kArr[0];
        }
        return null;
    }

    @Override // c1.c
    public int size() {
        return this.f1095e.length;
    }

    @Override // c1.c
    public c<K, V> t(K k4, V v4) {
        int A = A(k4);
        if (A != -1) {
            K[] kArr = this.f1095e;
            if (kArr[A] == k4 && this.f1096f[A] == v4) {
                return this;
            }
            return new a(this.f1097g, E(kArr, A, k4), E(this.f1096f, A, v4));
        }
        if (this.f1095e.length <= 25) {
            int B = B(k4);
            return new a(this.f1097g, y(this.f1095e, B, k4), y(this.f1096f, B, v4));
        }
        HashMap hashMap = new HashMap(this.f1095e.length + 1);
        int r12 = 0;
        while (true) {
            K[] kArr2 = this.f1095e;
            if (r12 >= kArr2.length) {
                hashMap.put(k4, v4);
                return k.x(hashMap, this.f1097g);
            }
            hashMap.put(kArr2[r12], this.f1096f[r12]);
            r12++;
        }
    }

    @Override // c1.c
    public Iterator<Map.Entry<K, V>> u(K k4) {
        return C(B(k4), false);
    }

    @Override // c1.c
    public c<K, V> v(K k4) {
        int A = A(k4);
        if (A == -1) {
            return this;
        }
        return new a(this.f1097g, D(this.f1095e, A), D(this.f1096f, A));
    }
}
