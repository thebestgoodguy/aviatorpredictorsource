package r0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class j<E> extends g<E> implements Set<E> {

    /* renamed from: f, reason: collision with root package name */
    private transient h<E> f7401f;

    j() {
    }

    public static <E> j<E> A() {
        return t.f7424l;
    }

    public static <E> j<E> B(E e5) {
        return new v(e5);
    }

    private static boolean C(int r12, int r22) {
        return r12 < (r22 >> 1) + (r22 >> 2);
    }

    static int v(int r6) {
        int max = Math.max(r6, 2);
        if (max >= 751619276) {
            q0.l.e(max < 1073741824, "collection too large");
            return 1073741824;
        }
        int highestOneBit = Integer.highestOneBit(max - 1) << 1;
        while (highestOneBit * 0.7d < max) {
            highestOneBit <<= 1;
        }
        return highestOneBit;
    }

    private static <E> j<E> w(int r13, Object... objArr) {
        if (r13 == 0) {
            return A();
        }
        if (r13 == 1) {
            return B(objArr[0]);
        }
        int v4 = v(r13);
        Object[] objArr2 = new Object[v4];
        int r7 = v4 - 1;
        int r5 = 0;
        int r8 = 0;
        for (int r32 = 0; r32 < r13; r32++) {
            Object a5 = o.a(objArr[r32], r32);
            int hashCode = a5.hashCode();
            int a6 = f.a(hashCode);
            while (true) {
                int r11 = a6 & r7;
                Object obj = objArr2[r11];
                if (obj == null) {
                    objArr[r8] = a5;
                    objArr2[r11] = a5;
                    r5 += hashCode;
                    r8++;
                    break;
                }
                if (obj.equals(a5)) {
                    break;
                }
                a6++;
            }
        }
        Arrays.fill(objArr, r8, r13, (Object) null);
        if (r8 == 1) {
            return new v(objArr[0], r5);
        }
        if (v(r8) < v4 / 2) {
            return w(r8, objArr);
        }
        if (C(r8, objArr.length)) {
            objArr = Arrays.copyOf(objArr, r8);
        }
        return new t(objArr, r5, objArr2, r7, r8);
    }

    public static <E> j<E> x(Collection<? extends E> collection) {
        if ((collection instanceof j) && !(collection instanceof SortedSet)) {
            j<E> jVar = (j) collection;
            if (!jVar.s()) {
                return jVar;
            }
        }
        Object[] array = collection.toArray();
        return w(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof j) && z() && ((j) obj).z() && hashCode() != obj.hashCode()) {
            return false;
        }
        return u.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return u.b(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: t */
    public abstract x<E> iterator();

    public h<E> u() {
        h<E> hVar = this.f7401f;
        if (hVar != null) {
            return hVar;
        }
        h<E> y4 = y();
        this.f7401f = y4;
        return y4;
    }

    h<E> y() {
        return h.u(toArray());
    }

    boolean z() {
        return false;
    }
}
