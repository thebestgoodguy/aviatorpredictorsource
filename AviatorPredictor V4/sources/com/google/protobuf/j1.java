package com.google.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class j1<E> extends c<E> implements RandomAccess {

    /* renamed from: h, reason: collision with root package name */
    private static final j1<Object> f2929h;

    /* renamed from: f, reason: collision with root package name */
    private E[] f2930f;

    /* renamed from: g, reason: collision with root package name */
    private int f2931g;

    static {
        j1<Object> j1Var = new j1<>(new Object[0], 0);
        f2929h = j1Var;
        j1Var.h();
    }

    private j1(E[] eArr, int r22) {
        this.f2930f = eArr;
        this.f2931g = r22;
    }

    private static <E> E[] p(int r02) {
        return (E[]) new Object[r02];
    }

    public static <E> j1<E> q() {
        return (j1<E>) f2929h;
    }

    private void r(int r22) {
        if (r22 < 0 || r22 >= this.f2931g) {
            throw new IndexOutOfBoundsException(s(r22));
        }
    }

    private String s(int r32) {
        return "Index:" + r32 + ", Size:" + this.f2931g;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r5, E e5) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f2931g)) {
            throw new IndexOutOfBoundsException(s(r5));
        }
        E[] eArr = this.f2930f;
        if (r02 < eArr.length) {
            System.arraycopy(eArr, r5, eArr, r5 + 1, r02 - r5);
        } else {
            E[] eArr2 = (E[]) p(((r02 * 3) / 2) + 1);
            System.arraycopy(this.f2930f, 0, eArr2, 0, r5);
            System.arraycopy(this.f2930f, r5, eArr2, r5 + 1, this.f2931g - r5);
            this.f2930f = eArr2;
        }
        this.f2930f[r5] = e5;
        this.f2931g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        i();
        int r02 = this.f2931g;
        E[] eArr = this.f2930f;
        if (r02 == eArr.length) {
            this.f2930f = (E[]) Arrays.copyOf(eArr, ((r02 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f2930f;
        int r12 = this.f2931g;
        this.f2931g = r12 + 1;
        eArr2[r12] = e5;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r22) {
        r(r22);
        return this.f2930f[r22];
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    public E remove(int r5) {
        i();
        r(r5);
        E[] eArr = this.f2930f;
        E e5 = eArr[r5];
        if (r5 < this.f2931g - 1) {
            System.arraycopy(eArr, r5 + 1, eArr, r5, (r2 - r5) - 1);
        }
        this.f2931g--;
        ((AbstractList) this).modCount++;
        return e5;
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r32, E e5) {
        i();
        r(r32);
        E[] eArr = this.f2930f;
        E e6 = eArr[r32];
        eArr[r32] = e5;
        ((AbstractList) this).modCount++;
        return e6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2931g;
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public j1<E> k(int r32) {
        if (r32 >= this.f2931g) {
            return new j1<>(Arrays.copyOf(this.f2930f, r32), this.f2931g);
        }
        throw new IllegalArgumentException();
    }
}
