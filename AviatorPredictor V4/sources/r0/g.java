package r0;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;

/* loaded from: classes.dex */
public abstract class g<E> extends AbstractCollection<E> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f7387e = new Object[0];

    public static abstract class a<E> {
        static int a(int r12, int r22) {
            if (r22 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int r13 = r12 + (r12 >> 1) + 1;
            if (r13 < r22) {
                r13 = Integer.highestOneBit(r22 - 1) << 1;
            }
            if (r13 < 0) {
                return Integer.MAX_VALUE;
            }
            return r13;
        }
    }

    g() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    int i(Object[] objArr, int r5) {
        x<E> t4 = t();
        while (t4.hasNext()) {
            objArr[r5] = t4.next();
            r5++;
        }
        return r5;
    }

    Object[] p() {
        return null;
    }

    int q() {
        throw new UnsupportedOperationException();
    }

    int r() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    abstract boolean s();

    public abstract x<E> t();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f7387e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        q0.l.n(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] p4 = p();
            if (p4 != null) {
                return (T[]) q.a(p4, r(), q(), tArr);
            }
            tArr = (T[]) o.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        i(tArr, 0);
        return tArr;
    }
}
