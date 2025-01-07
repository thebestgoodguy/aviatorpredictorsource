package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class vr extends sq implements RandomAccess, l0 {

    /* renamed from: h, reason: collision with root package name */
    private static final vr f2255h;

    /* renamed from: f, reason: collision with root package name */
    private double[] f2256f;

    /* renamed from: g, reason: collision with root package name */
    private int f2257g;

    static {
        vr vrVar = new vr(new double[0], 0);
        f2255h = vrVar;
        vrVar.b();
    }

    vr() {
        this(new double[10], 0);
    }

    private vr(double[] dArr, int r22) {
        this.f2256f = dArr;
        this.f2257g = r22;
    }

    private final String q(int r4) {
        return "Index:" + r4 + ", Size:" + this.f2257g;
    }

    private final void r(int r22) {
        if (r22 < 0 || r22 >= this.f2257g) {
            throw new IndexOutOfBoundsException(q(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object obj) {
        int r7;
        double doubleValue = ((Double) obj).doubleValue();
        i();
        if (r6 < 0 || r6 > (r7 = this.f2257g)) {
            throw new IndexOutOfBoundsException(q(r6));
        }
        double[] dArr = this.f2256f;
        if (r7 < dArr.length) {
            System.arraycopy(dArr, r6, dArr, r6 + 1, r7 - r6);
        } else {
            double[] dArr2 = new double[((r7 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r6);
            System.arraycopy(this.f2256f, r6, dArr2, r6 + 1, this.f2257g - r6);
            this.f2256f = dArr2;
        }
        this.f2256f[r6] = doubleValue;
        this.f2257g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        p(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        f.e(collection);
        if (!(collection instanceof vr)) {
            return super.addAll(collection);
        }
        vr vrVar = (vr) collection;
        int r02 = vrVar.f2257g;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f2257g;
        if (Integer.MAX_VALUE - r22 < r02) {
            throw new OutOfMemoryError();
        }
        int r23 = r22 + r02;
        double[] dArr = this.f2256f;
        if (r23 > dArr.length) {
            this.f2256f = Arrays.copyOf(dArr, r23);
        }
        System.arraycopy(vrVar.f2256f, 0, this.f2256f, this.f2257g, vrVar.f2257g);
        this.f2257g = r23;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f2257g) {
            return new vr(Arrays.copyOf(this.f2256f, r32), this.f2257g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr)) {
            return super.equals(obj);
        }
        vr vrVar = (vr) obj;
        if (this.f2257g != vrVar.f2257g) {
            return false;
        }
        double[] dArr = vrVar.f2256f;
        for (int r12 = 0; r12 < this.f2257g; r12++) {
            if (Double.doubleToLongBits(this.f2256f[r12]) != Double.doubleToLongBits(dArr[r12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r4) {
        r(r4);
        return Double.valueOf(this.f2256f[r4]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f2257g; r12++) {
            r02 = (r02 * 31) + f.c(Double.doubleToLongBits(this.f2256f[r12]));
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int r8 = this.f2257g;
        for (int r02 = 0; r02 < r8; r02++) {
            if (this.f2256f[r02] == doubleValue) {
                return r02;
            }
        }
        return -1;
    }

    public final void p(double d5) {
        i();
        int r02 = this.f2257g;
        double[] dArr = this.f2256f;
        if (r02 == dArr.length) {
            double[] dArr2 = new double[((r02 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r02);
            this.f2256f = dArr2;
        }
        double[] dArr3 = this.f2256f;
        int r12 = this.f2257g;
        this.f2257g = r12 + 1;
        dArr3[r12] = d5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r6) {
        i();
        r(r6);
        double[] dArr = this.f2256f;
        double d5 = dArr[r6];
        if (r6 < this.f2257g - 1) {
            System.arraycopy(dArr, r6 + 1, dArr, r6, (r3 - r6) - 1);
        }
        this.f2257g--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f2256f;
        System.arraycopy(dArr, r4, dArr, r32, this.f2257g - r4);
        this.f2257g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r5, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        i();
        r(r5);
        double[] dArr = this.f2256f;
        double d5 = dArr[r5];
        dArr[r5] = doubleValue;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2257g;
    }
}
