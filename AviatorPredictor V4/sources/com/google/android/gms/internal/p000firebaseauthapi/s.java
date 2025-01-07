package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class s extends sq implements RandomAccess, l0 {

    /* renamed from: h, reason: collision with root package name */
    private static final s f2107h;

    /* renamed from: f, reason: collision with root package name */
    private long[] f2108f;

    /* renamed from: g, reason: collision with root package name */
    private int f2109g;

    static {
        s sVar = new s(new long[0], 0);
        f2107h = sVar;
        sVar.b();
    }

    s() {
        this(new long[10], 0);
    }

    private s(long[] jArr, int r22) {
        this.f2108f = jArr;
        this.f2109g = r22;
    }

    private final String r(int r4) {
        return "Index:" + r4 + ", Size:" + this.f2109g;
    }

    private final void s(int r22) {
        if (r22 < 0 || r22 >= this.f2109g) {
            throw new IndexOutOfBoundsException(r(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r6, Object obj) {
        int r7;
        long longValue = ((Long) obj).longValue();
        i();
        if (r6 < 0 || r6 > (r7 = this.f2109g)) {
            throw new IndexOutOfBoundsException(r(r6));
        }
        long[] jArr = this.f2108f;
        if (r7 < jArr.length) {
            System.arraycopy(jArr, r6, jArr, r6 + 1, r7 - r6);
        } else {
            long[] jArr2 = new long[((r7 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r6);
            System.arraycopy(this.f2108f, r6, jArr2, r6 + 1, this.f2109g - r6);
            this.f2108f = jArr2;
        }
        this.f2108f[r6] = longValue;
        this.f2109g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        q(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        f.e(collection);
        if (!(collection instanceof s)) {
            return super.addAll(collection);
        }
        s sVar = (s) collection;
        int r02 = sVar.f2109g;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f2109g;
        if (Integer.MAX_VALUE - r22 < r02) {
            throw new OutOfMemoryError();
        }
        int r23 = r22 + r02;
        long[] jArr = this.f2108f;
        if (r23 > jArr.length) {
            this.f2108f = Arrays.copyOf(jArr, r23);
        }
        System.arraycopy(sVar.f2108f, 0, this.f2108f, this.f2109g, sVar.f2109g);
        this.f2109g = r23;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f2109g) {
            return new s(Arrays.copyOf(this.f2108f, r32), this.f2109g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return super.equals(obj);
        }
        s sVar = (s) obj;
        if (this.f2109g != sVar.f2109g) {
            return false;
        }
        long[] jArr = sVar.f2108f;
        for (int r12 = 0; r12 < this.f2109g; r12++) {
            if (this.f2108f[r12] != jArr[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r4) {
        s(r4);
        return Long.valueOf(this.f2108f[r4]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f2109g; r12++) {
            r02 = (r02 * 31) + f.c(this.f2108f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int r8 = this.f2109g;
        for (int r02 = 0; r02 < r8; r02++) {
            if (this.f2108f[r02] == longValue) {
                return r02;
            }
        }
        return -1;
    }

    public final long p(int r4) {
        s(r4);
        return this.f2108f[r4];
    }

    public final void q(long j4) {
        i();
        int r02 = this.f2109g;
        long[] jArr = this.f2108f;
        if (r02 == jArr.length) {
            long[] jArr2 = new long[((r02 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r02);
            this.f2108f = jArr2;
        }
        long[] jArr3 = this.f2108f;
        int r12 = this.f2109g;
        this.f2109g = r12 + 1;
        jArr3[r12] = j4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r6) {
        i();
        s(r6);
        long[] jArr = this.f2108f;
        long j4 = jArr[r6];
        if (r6 < this.f2109g - 1) {
            System.arraycopy(jArr, r6 + 1, jArr, r6, (r3 - r6) - 1);
        }
        this.f2109g--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f2108f;
        System.arraycopy(jArr, r4, jArr, r32, this.f2109g - r4);
        this.f2109g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r5, Object obj) {
        long longValue = ((Long) obj).longValue();
        i();
        s(r5);
        long[] jArr = this.f2108f;
        long j4 = jArr[r5];
        jArr[r5] = longValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2109g;
    }
}
