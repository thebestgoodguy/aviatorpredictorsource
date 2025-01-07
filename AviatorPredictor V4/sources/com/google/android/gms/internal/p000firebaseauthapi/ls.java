package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class ls extends sq implements RandomAccess, l0 {

    /* renamed from: h, reason: collision with root package name */
    private static final ls f1907h;

    /* renamed from: f, reason: collision with root package name */
    private int[] f1908f;

    /* renamed from: g, reason: collision with root package name */
    private int f1909g;

    static {
        ls lsVar = new ls(new int[0], 0);
        f1907h = lsVar;
        lsVar.b();
    }

    ls() {
        this(new int[10], 0);
    }

    private ls(int[] r12, int r22) {
        this.f1908f = r12;
        this.f1909g = r22;
    }

    private final String r(int r4) {
        return "Index:" + r4 + ", Size:" + this.f1909g;
    }

    private final void s(int r22) {
        if (r22 < 0 || r22 >= this.f1909g) {
            throw new IndexOutOfBoundsException(r(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object obj) {
        int r02;
        int intValue = ((Integer) obj).intValue();
        i();
        if (r5 < 0 || r5 > (r02 = this.f1909g)) {
            throw new IndexOutOfBoundsException(r(r5));
        }
        int[] r12 = this.f1908f;
        if (r02 < r12.length) {
            System.arraycopy(r12, r5, r12, r5 + 1, r02 - r5);
        } else {
            int[] r03 = new int[((r02 * 3) / 2) + 1];
            System.arraycopy(r12, 0, r03, 0, r5);
            System.arraycopy(this.f1908f, r5, r03, r5 + 1, this.f1909g - r5);
            this.f1908f = r03;
        }
        this.f1908f[r5] = intValue;
        this.f1909g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        q(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        f.e(collection);
        if (!(collection instanceof ls)) {
            return super.addAll(collection);
        }
        ls lsVar = (ls) collection;
        int r02 = lsVar.f1909g;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f1909g;
        if (Integer.MAX_VALUE - r22 < r02) {
            throw new OutOfMemoryError();
        }
        int r23 = r22 + r02;
        int[] r03 = this.f1908f;
        if (r23 > r03.length) {
            this.f1908f = Arrays.copyOf(r03, r23);
        }
        System.arraycopy(lsVar.f1908f, 0, this.f1908f, this.f1909g, lsVar.f1909g);
        this.f1909g = r23;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f1909g) {
            return new ls(Arrays.copyOf(this.f1908f, r32), this.f1909g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return super.equals(obj);
        }
        ls lsVar = (ls) obj;
        if (this.f1909g != lsVar.f1909g) {
            return false;
        }
        int[] r6 = lsVar.f1908f;
        for (int r12 = 0; r12 < this.f1909g; r12++) {
            if (this.f1908f[r12] != r6[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r22) {
        s(r22);
        return Integer.valueOf(this.f1908f[r22]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f1909g; r12++) {
            r02 = (r02 * 31) + this.f1908f[r12];
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int r02 = this.f1909g;
        for (int r22 = 0; r22 < r02; r22++) {
            if (this.f1908f[r22] == intValue) {
                return r22;
            }
        }
        return -1;
    }

    public final int p(int r22) {
        s(r22);
        return this.f1908f[r22];
    }

    public final void q(int r5) {
        i();
        int r02 = this.f1909g;
        int[] r12 = this.f1908f;
        if (r02 == r12.length) {
            int[] r22 = new int[((r02 * 3) / 2) + 1];
            System.arraycopy(r12, 0, r22, 0, r02);
            this.f1908f = r22;
        }
        int[] r03 = this.f1908f;
        int r13 = this.f1909g;
        this.f1909g = r13 + 1;
        r03[r13] = r5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        i();
        s(r5);
        int[] r02 = this.f1908f;
        int r12 = r02[r5];
        if (r5 < this.f1909g - 1) {
            System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
        }
        this.f1909g--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r12);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] r02 = this.f1908f;
        System.arraycopy(r02, r4, r02, r32, this.f1909g - r4);
        this.f1909g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r32, Object obj) {
        int intValue = ((Integer) obj).intValue();
        i();
        s(r32);
        int[] r02 = this.f1908f;
        int r12 = r02[r32];
        r02[r32] = intValue;
        return Integer.valueOf(r12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1909g;
    }
}
