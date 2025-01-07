package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class fs extends sq implements RandomAccess, l0 {

    /* renamed from: h, reason: collision with root package name */
    private static final fs f1668h;

    /* renamed from: f, reason: collision with root package name */
    private float[] f1669f;

    /* renamed from: g, reason: collision with root package name */
    private int f1670g;

    static {
        fs fsVar = new fs(new float[0], 0);
        f1668h = fsVar;
        fsVar.b();
    }

    fs() {
        this(new float[10], 0);
    }

    private fs(float[] fArr, int r22) {
        this.f1669f = fArr;
        this.f1670g = r22;
    }

    private final String q(int r4) {
        return "Index:" + r4 + ", Size:" + this.f1670g;
    }

    private final void r(int r22) {
        if (r22 < 0 || r22 >= this.f1670g) {
            throw new IndexOutOfBoundsException(q(r22));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int r5, Object obj) {
        int r02;
        float floatValue = ((Float) obj).floatValue();
        i();
        if (r5 < 0 || r5 > (r02 = this.f1670g)) {
            throw new IndexOutOfBoundsException(q(r5));
        }
        float[] fArr = this.f1669f;
        if (r02 < fArr.length) {
            System.arraycopy(fArr, r5, fArr, r5 + 1, r02 - r5);
        } else {
            float[] fArr2 = new float[((r02 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r5);
            System.arraycopy(this.f1669f, r5, fArr2, r5 + 1, this.f1670g - r5);
            this.f1669f = fArr2;
        }
        this.f1669f[r5] = floatValue;
        this.f1670g++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        p(((Float) obj).floatValue());
        return true;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        i();
        f.e(collection);
        if (!(collection instanceof fs)) {
            return super.addAll(collection);
        }
        fs fsVar = (fs) collection;
        int r02 = fsVar.f1670g;
        if (r02 == 0) {
            return false;
        }
        int r22 = this.f1670g;
        if (Integer.MAX_VALUE - r22 < r02) {
            throw new OutOfMemoryError();
        }
        int r23 = r22 + r02;
        float[] fArr = this.f1669f;
        if (r23 > fArr.length) {
            this.f1669f = Arrays.copyOf(fArr, r23);
        }
        System.arraycopy(fsVar.f1669f, 0, this.f1669f, this.f1670g, fsVar.f1670g);
        this.f1670g = r23;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.e
    public final /* bridge */ /* synthetic */ e e(int r32) {
        if (r32 >= this.f1670g) {
            return new fs(Arrays.copyOf(this.f1669f, r32), this.f1670g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs)) {
            return super.equals(obj);
        }
        fs fsVar = (fs) obj;
        if (this.f1670g != fsVar.f1670g) {
            return false;
        }
        float[] fArr = fsVar.f1669f;
        for (int r12 = 0; r12 < this.f1670g; r12++) {
            if (Float.floatToIntBits(this.f1669f[r12]) != Float.floatToIntBits(fArr[r12])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int r22) {
        r(r22);
        return Float.valueOf(this.f1669f[r22]);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f1670g; r12++) {
            r02 = (r02 * 31) + Float.floatToIntBits(this.f1669f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int r02 = this.f1670g;
        for (int r22 = 0; r22 < r02; r22++) {
            if (this.f1669f[r22] == floatValue) {
                return r22;
            }
        }
        return -1;
    }

    public final void p(float f5) {
        i();
        int r02 = this.f1670g;
        float[] fArr = this.f1669f;
        if (r02 == fArr.length) {
            float[] fArr2 = new float[((r02 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r02);
            this.f1669f = fArr2;
        }
        float[] fArr3 = this.f1669f;
        int r12 = this.f1670g;
        this.f1670g = r12 + 1;
        fArr3[r12] = f5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.sq, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int r5) {
        i();
        r(r5);
        float[] fArr = this.f1669f;
        float f5 = fArr[r5];
        if (r5 < this.f1670g - 1) {
            System.arraycopy(fArr, r5 + 1, fArr, r5, (r2 - r5) - 1);
        }
        this.f1670g--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f1669f;
        System.arraycopy(fArr, r4, fArr, r32, this.f1670g - r4);
        this.f1670g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int r32, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        i();
        r(r32);
        float[] fArr = this.f1669f;
        float f5 = fArr[r32];
        fArr[r32] = floatValue;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1670g;
    }
}
