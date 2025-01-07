package e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f3435i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    private static final Object[] f3436j = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    private static Object[] f3437k;

    /* renamed from: l, reason: collision with root package name */
    private static int f3438l;

    /* renamed from: m, reason: collision with root package name */
    private static Object[] f3439m;

    /* renamed from: n, reason: collision with root package name */
    private static int f3440n;

    /* renamed from: e, reason: collision with root package name */
    private int[] f3441e;

    /* renamed from: f, reason: collision with root package name */
    Object[] f3442f;

    /* renamed from: g, reason: collision with root package name */
    int f3443g;

    /* renamed from: h, reason: collision with root package name */
    private d<E, E> f3444h;

    class a extends d<E, E> {
        a() {
        }

        @Override // e.d
        protected void a() {
            b.this.clear();
        }

        @Override // e.d
        protected Object b(int r12, int r22) {
            return b.this.f3442f[r12];
        }

        @Override // e.d
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // e.d
        protected int d() {
            return b.this.f3443g;
        }

        @Override // e.d
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // e.d
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // e.d
        protected void g(E e5, E e6) {
            b.this.add(e5);
        }

        @Override // e.d
        protected void h(int r22) {
            b.this.u(r22);
        }

        @Override // e.d
        protected E i(int r12, E e5) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int r12) {
        if (r12 == 0) {
            this.f3441e = f3435i;
            this.f3442f = f3436j;
        } else {
            i(r12);
        }
        this.f3443g = 0;
    }

    private void i(int r6) {
        if (r6 == 8) {
            synchronized (b.class) {
                Object[] objArr = f3439m;
                if (objArr != null) {
                    this.f3442f = objArr;
                    f3439m = (Object[]) objArr[0];
                    this.f3441e = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f3440n--;
                    return;
                }
            }
        } else if (r6 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f3437k;
                if (objArr2 != null) {
                    this.f3442f = objArr2;
                    f3437k = (Object[]) objArr2[0];
                    this.f3441e = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f3438l--;
                    return;
                }
            }
        }
        this.f3441e = new int[r6];
        this.f3442f = new Object[r6];
    }

    private static void q(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (b.class) {
                if (f3440n < 10) {
                    objArr[0] = f3439m;
                    objArr[1] = r7;
                    for (int r92 = r9 - 1; r92 >= 2; r92--) {
                        objArr[r92] = null;
                    }
                    f3439m = objArr;
                    f3440n++;
                }
            }
            return;
        }
        if (r7.length == 4) {
            synchronized (b.class) {
                if (f3438l < 10) {
                    objArr[0] = f3437k;
                    objArr[1] = r7;
                    for (int r93 = r9 - 1; r93 >= 2; r93--) {
                        objArr[r93] = null;
                    }
                    f3437k = objArr;
                    f3438l++;
                }
            }
        }
    }

    private d<E, E> r() {
        if (this.f3444h == null) {
            this.f3444h = new a();
        }
        return this.f3444h;
    }

    private int s(Object obj, int r6) {
        int r02 = this.f3443g;
        if (r02 == 0) {
            return -1;
        }
        int a5 = c.a(this.f3441e, r02, r6);
        if (a5 < 0 || obj.equals(this.f3442f[a5])) {
            return a5;
        }
        int r22 = a5 + 1;
        while (r22 < r02 && this.f3441e[r22] == r6) {
            if (obj.equals(this.f3442f[r22])) {
                return r22;
            }
            r22++;
        }
        for (int r12 = a5 - 1; r12 >= 0 && this.f3441e[r12] == r6; r12--) {
            if (obj.equals(this.f3442f[r12])) {
                return r12;
            }
        }
        return ~r22;
    }

    private int t() {
        int r02 = this.f3443g;
        if (r02 == 0) {
            return -1;
        }
        int a5 = c.a(this.f3441e, r02, 0);
        if (a5 < 0 || this.f3442f[a5] == null) {
            return a5;
        }
        int r22 = a5 + 1;
        while (r22 < r02 && this.f3441e[r22] == 0) {
            if (this.f3442f[r22] == null) {
                return r22;
            }
            r22++;
        }
        for (int r12 = a5 - 1; r12 >= 0 && this.f3441e[r12] == 0; r12--) {
            if (this.f3442f[r12] == null) {
                return r12;
            }
        }
        return ~r22;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e5) {
        int r22;
        int s4;
        if (e5 == null) {
            s4 = t();
            r22 = 0;
        } else {
            int hashCode = e5.hashCode();
            r22 = hashCode;
            s4 = s(e5, hashCode);
        }
        if (s4 >= 0) {
            return false;
        }
        int r12 = ~s4;
        int r32 = this.f3443g;
        int[] r4 = this.f3441e;
        if (r32 >= r4.length) {
            int r5 = 4;
            if (r32 >= 8) {
                r5 = (r32 >> 1) + r32;
            } else if (r32 >= 4) {
                r5 = 8;
            }
            Object[] objArr = this.f3442f;
            i(r5);
            int[] r52 = this.f3441e;
            if (r52.length > 0) {
                System.arraycopy(r4, 0, r52, 0, r4.length);
                System.arraycopy(objArr, 0, this.f3442f, 0, objArr.length);
            }
            q(r4, objArr, this.f3443g);
        }
        int r02 = this.f3443g;
        if (r12 < r02) {
            int[] r33 = this.f3441e;
            int r42 = r12 + 1;
            System.arraycopy(r33, r12, r33, r42, r02 - r12);
            Object[] objArr2 = this.f3442f;
            System.arraycopy(objArr2, r12, objArr2, r42, this.f3443g - r12);
        }
        this.f3441e[r12] = r22;
        this.f3442f[r12] = e5;
        this.f3443g++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        p(this.f3443g + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= add(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int r02 = this.f3443g;
        if (r02 != 0) {
            q(this.f3441e, this.f3442f, r02);
            this.f3441e = f3435i;
            this.f3442f = f3436j;
            this.f3443g = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int r12 = 0; r12 < this.f3443g; r12++) {
                try {
                    if (!set.contains(v(r12))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] r02 = this.f3441e;
        int r12 = this.f3443g;
        int r32 = 0;
        for (int r22 = 0; r22 < r12; r22++) {
            r32 += r02[r22];
        }
        return r32;
    }

    public int indexOf(Object obj) {
        return obj == null ? t() : s(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f3443g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return r().m().iterator();
    }

    public void p(int r5) {
        int[] r02 = this.f3441e;
        if (r02.length < r5) {
            Object[] objArr = this.f3442f;
            i(r5);
            int r52 = this.f3443g;
            if (r52 > 0) {
                System.arraycopy(r02, 0, this.f3441e, 0, r52);
                System.arraycopy(objArr, 0, this.f3442f, 0, this.f3443g);
            }
            q(r02, objArr, this.f3443g);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        u(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            z4 |= remove(it.next());
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z4 = false;
        for (int r02 = this.f3443g - 1; r02 >= 0; r02--) {
            if (!collection.contains(this.f3442f[r02])) {
                u(r02);
                z4 = true;
            }
        }
        return z4;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f3443g;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int r02 = this.f3443g;
        Object[] objArr = new Object[r02];
        System.arraycopy(this.f3442f, 0, objArr, 0, r02);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f3443g) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f3443g));
        }
        System.arraycopy(this.f3442f, 0, tArr, 0, this.f3443g);
        int length = tArr.length;
        int r12 = this.f3443g;
        if (length > r12) {
            tArr[r12] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3443g * 14);
        sb.append('{');
        for (int r12 = 0; r12 < this.f3443g; r12++) {
            if (r12 > 0) {
                sb.append(", ");
            }
            E v4 = v(r12);
            if (v4 != this) {
                sb.append(v4);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E u(int r9) {
        Object[] objArr = this.f3442f;
        E e5 = (E) objArr[r9];
        int r22 = this.f3443g;
        if (r22 <= 1) {
            q(this.f3441e, objArr, r22);
            this.f3441e = f3435i;
            this.f3442f = f3436j;
            this.f3443g = 0;
        } else {
            int[] r5 = this.f3441e;
            if (r5.length <= 8 || r22 >= r5.length / 3) {
                int r23 = r22 - 1;
                this.f3443g = r23;
                if (r9 < r23) {
                    int r02 = r9 + 1;
                    System.arraycopy(r5, r02, r5, r9, r23 - r9);
                    Object[] objArr2 = this.f3442f;
                    System.arraycopy(objArr2, r02, objArr2, r9, this.f3443g - r9);
                }
                this.f3442f[this.f3443g] = null;
            } else {
                i(r22 > 8 ? r22 + (r22 >> 1) : 8);
                this.f3443g--;
                if (r9 > 0) {
                    System.arraycopy(r5, 0, this.f3441e, 0, r9);
                    System.arraycopy(objArr, 0, this.f3442f, 0, r9);
                }
                int r24 = this.f3443g;
                if (r9 < r24) {
                    int r32 = r9 + 1;
                    System.arraycopy(r5, r32, this.f3441e, r9, r24 - r9);
                    System.arraycopy(objArr, r32, this.f3442f, r9, this.f3443g - r9);
                }
            }
        }
        return e5;
    }

    public E v(int r22) {
        return (E) this.f3442f[r22];
    }
}
