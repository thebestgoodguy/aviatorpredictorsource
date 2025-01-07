package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class n0 extends sq implements RandomAccess {

    /* renamed from: h, reason: collision with root package name */
    private static final n0 f1948h;

    /* renamed from: f, reason: collision with root package name */
    private Object[] f1949f;

    /* renamed from: g, reason: collision with root package name */
    private int f1950g;

    static {
        n0 n0Var = new n0(new Object[0], 0);
        f1948h = n0Var;
        n0Var.b();
    }

    private n0(Object[] objArr, int r22) {
        this.f1949f = objArr;
        this.f1950g = r22;
    }

    public static n0 p() {
        return f1948h;
    }

    private final String q(int r4) {
        return "Index:" + r4 + ", Size:" + this.f1950g;
    }

    private final void r(int r22) {
        if (r22 < 0 || r22 >= this.f1950g) {
            throw new IndexOutOfBoundsException(q(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int r5, Object obj) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f1950g)) {
            throw new IndexOutOfBoundsException(q(r5));
        }
        Object[] objArr = this.f1949f;
        if (r02 < objArr.length) {
            System.arraycopy(objArr, r5, objArr, r5 + 1, r02 - r5);
        } else {
            Object[] objArr2 = new Object[((r02 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, r5);
            System.arraycopy(this.f1949f, r5, objArr2, r5 + 1, this.f1950g - r5);
            this.f1949f = objArr2;
        }
        this.f1949f[r5] = obj;
        this.f1950g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        i();
        int r02 = this.f1950g;
        Object[] objArr = this.f1949f;
        if (r02 == objArr.length) {
            this.f1949f = Arrays.copyOf(objArr, ((r02 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f1949f;
        int r12 = this.f1950g;
        this.f1950g = r12 + 1;
        objArr2[r12] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f1950g) {
            return new n0(Arrays.copyOf(this.f1949f, r32), this.f1950g);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int r22) {
        r(r22);
        return this.f1949f[r22];
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final Object remove(int r5) {
        i();
        r(r5);
        Object[] objArr = this.f1949f;
        Object obj = objArr[r5];
        if (r5 < this.f1950g - 1) {
            System.arraycopy(objArr, r5 + 1, objArr, r5, (r2 - r5) - 1);
        }
        this.f1950g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int r32, Object obj) {
        i();
        r(r32);
        Object[] objArr = this.f1949f;
        Object obj2 = objArr[r32];
        objArr[r32] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1950g;
    }
}
