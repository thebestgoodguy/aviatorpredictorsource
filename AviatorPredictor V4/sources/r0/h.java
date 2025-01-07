package r0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class h<E> extends g<E> implements List<E>, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final y<Object> f7388f = new a(r.f7407i, 0);

    static class a<E> extends r0.a<E> {

        /* renamed from: g, reason: collision with root package name */
        private final h<E> f7389g;

        a(h<E> hVar, int r32) {
            super(hVar.size(), r32);
            this.f7389g = hVar;
        }

        @Override // r0.a
        protected E c(int r22) {
            return this.f7389g.get(r22);
        }
    }

    class b extends h<E> {

        /* renamed from: g, reason: collision with root package name */
        final transient int f7390g;

        /* renamed from: h, reason: collision with root package name */
        final transient int f7391h;

        b(int r22, int r32) {
            this.f7390g = r22;
            this.f7391h = r32;
        }

        @Override // r0.h, java.util.List
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public h<E> subList(int r32, int r4) {
            q0.l.s(r32, r4, this.f7391h);
            h hVar = h.this;
            int r12 = this.f7390g;
            return hVar.subList(r32 + r12, r4 + r12);
        }

        @Override // java.util.List
        public E get(int r32) {
            q0.l.l(r32, this.f7391h);
            return h.this.get(r32 + this.f7390g);
        }

        @Override // r0.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // r0.h, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // r0.h, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int r12) {
            return super.listIterator(r12);
        }

        @Override // r0.g
        Object[] p() {
            return h.this.p();
        }

        @Override // r0.g
        int q() {
            return h.this.r() + this.f7390g + this.f7391h;
        }

        @Override // r0.g
        int r() {
            return h.this.r() + this.f7390g;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f7391h;
        }
    }

    h() {
    }

    public static <E> h<E> A(E e5) {
        return w(e5);
    }

    static <E> h<E> u(Object[] objArr) {
        return v(objArr, objArr.length);
    }

    static <E> h<E> v(Object[] objArr, int r22) {
        return r22 == 0 ? z() : new r(objArr, r22);
    }

    private static <E> h<E> w(Object... objArr) {
        return u(o.b(objArr));
    }

    public static <E> h<E> z() {
        return (h<E>) r.f7407i;
    }

    @Override // java.util.List
    /* renamed from: B */
    public h<E> subList(int r32, int r4) {
        q0.l.s(r32, r4, size());
        int r02 = r4 - r32;
        return r02 == size() ? this : r02 == 0 ? z() : C(r32, r4);
    }

    h<E> C(int r22, int r32) {
        return new b(r22, r32 - r22);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int r12, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int r12, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // r0.g, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return l.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int r12 = 1;
        for (int r22 = 0; r22 < size; r22++) {
            r12 = ~(~((r12 * 31) + get(r22).hashCode()));
        }
        return r12;
    }

    @Override // r0.g
    int i(Object[] objArr, int r6) {
        int size = size();
        for (int r12 = 0; r12 < size; r12++) {
            objArr[r6 + r12] = get(r12);
        }
        return r6 + size;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return l.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return l.d(this, obj);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int r12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int r12, E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public x<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public y<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public y<E> listIterator(int r22) {
        q0.l.q(r22, size());
        return isEmpty() ? (y<E>) f7388f : new a(this, r22);
    }
}
