package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class wq extends sq implements RandomAccess, l0 {

    /* renamed from: h, reason: collision with root package name */
    private static final wq f2307h;

    /* renamed from: f, reason: collision with root package name */
    private boolean[] f2308f;

    /* renamed from: g, reason: collision with root package name */
    private int f2309g;

    static {
        wq wqVar = new wq(new boolean[0], 0);
        f2307h = wqVar;
        wqVar.b();
    }

    wq() {
        this(new boolean[10], 0);
    }

    private wq(boolean[] zArr, int r22) {
        this.f2308f = zArr;
        this.f2309g = r22;
    }

    private final String q(int r4) {
        return "Index:" + r4 + ", Size:" + this.f2309g;
    }

    private final void r(int r22) {
        if (r22 < 0 || r22 >= this.f2309g) {
            throw new IndexOutOfBoundsException(q(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object obj) {
        int r02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        if (r5 < 0 || r5 > (r02 = this.f2309g)) {
            throw new IndexOutOfBoundsException(q(r5));
        }
        boolean[] zArr = this.f2308f;
        if (r02 < zArr.length) {
            System.arraycopy(zArr, r5, zArr, r5 + 1, r02 - r5);
        } else {
            boolean[] zArr2 = new boolean[((r02 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r5);
            System.arraycopy(this.f2308f, r5, zArr2, r5 + 1, this.f2309g - r5);
            this.f2308f = zArr2;
        }
        this.f2308f[r5] = booleanValue;
        this.f2309g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        p(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        f.e(collection);
        if (!(collection instanceof wq)) {
            return super.addAll(collection);
        }
        wq wqVar = (wq) collection;
        int r02 = wqVar.f2309g;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f2309g;
        if (Integer.MAX_VALUE - r22 < r02) {
            throw new OutOfMemoryError();
        }
        int r23 = r22 + r02;
        boolean[] zArr = this.f2308f;
        if (r23 > zArr.length) {
            this.f2308f = Arrays.copyOf(zArr, r23);
        }
        System.arraycopy(wqVar.f2308f, 0, this.f2308f, this.f2309g, wqVar.f2309g);
        this.f2309g = r23;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f2309g) {
            return new wq(Arrays.copyOf(this.f2308f, r32), this.f2309g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq)) {
            return super.equals(obj);
        }
        wq wqVar = (wq) obj;
        if (this.f2309g != wqVar.f2309g) {
            return false;
        }
        boolean[] zArr = wqVar.f2308f;
        for (int r12 = 0; r12 < this.f2309g; r12++) {
            if (this.f2308f[r12] != zArr[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r22) {
        r(r22);
        return Boolean.valueOf(this.f2308f[r22]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f2309g; r12++) {
            r02 = (r02 * 31) + f.a(this.f2308f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int r02 = this.f2309g;
        for (int r22 = 0; r22 < r02; r22++) {
            if (this.f2308f[r22] == booleanValue) {
                return r22;
            }
        }
        return -1;
    }

    public final void p(boolean z4) {
        i();
        int r02 = this.f2309g;
        boolean[] zArr = this.f2308f;
        if (r02 == zArr.length) {
            boolean[] zArr2 = new boolean[((r02 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r02);
            this.f2308f = zArr2;
        }
        boolean[] zArr3 = this.f2308f;
        int r12 = this.f2309g;
        this.f2309g = r12 + 1;
        zArr3[r12] = z4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        i();
        r(r5);
        boolean[] zArr = this.f2308f;
        boolean z4 = zArr[r5];
        if (r5 < this.f2309g - 1) {
            System.arraycopy(zArr, r5 + 1, zArr, r5, (r2 - r5) - 1);
        }
        this.f2309g--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2308f;
        System.arraycopy(zArr, r4, zArr, r32, this.f2309g - r4);
        this.f2309g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r32, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i();
        r(r32);
        boolean[] zArr = this.f2308f;
        boolean z4 = zArr[r32];
        zArr[r32] = booleanValue;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2309g;
    }
}
