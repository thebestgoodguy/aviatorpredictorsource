package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class h extends c<Boolean> implements d0.a, RandomAccess, g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final h f2897h;

    /* renamed from: f, reason: collision with root package name */
    private boolean[] f2898f;

    /* renamed from: g, reason: collision with root package name */
    private int f2899g;

    static {
        h hVar = new h(new boolean[0], 0);
        f2897h = hVar;
        hVar.h();
    }

    h() {
        this(new boolean[10], 0);
    }

    private h(boolean[] zArr, int r22) {
        this.f2898f = zArr;
        this.f2899g = r22;
    }

    private void r(int r5, boolean z4) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f2899g)) {
            throw new IndexOutOfBoundsException(w(r5));
        }
        boolean[] zArr = this.f2898f;
        if (r02 < zArr.length) {
            System.arraycopy(zArr, r5, zArr, r5 + 1, r02 - r5);
        } else {
            boolean[] zArr2 = new boolean[((r02 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r5);
            System.arraycopy(this.f2898f, r5, zArr2, r5 + 1, this.f2899g - r5);
            this.f2898f = zArr2;
        }
        this.f2898f[r5] = z4;
        this.f2899g++;
        ((AbstractList) this).modCount++;
    }

    private void t(int r22) {
        if (r22 < 0 || r22 >= this.f2899g) {
            throw new IndexOutOfBoundsException(w(r22));
        }
    }

    private String w(int r32) {
        return "Index:" + r32 + ", Size:" + this.f2899g;
    }

    public boolean A(int r32, boolean z4) {
        i();
        t(r32);
        boolean[] zArr = this.f2898f;
        boolean z5 = zArr[r32];
        zArr[r32] = z4;
        return z5;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Boolean> collection) {
        i();
        d0.a(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int r02 = hVar.f2899g;
        if (r02 == 0) {
            return false;
        }
        int r32 = this.f2899g;
        if (Integer.MAX_VALUE - r32 < r02) {
            throw new OutOfMemoryError();
        }
        int r33 = r32 + r02;
        boolean[] zArr = this.f2898f;
        if (r33 > zArr.length) {
            this.f2898f = Arrays.copyOf(zArr, r33);
        }
        System.arraycopy(hVar.f2898f, 0, this.f2898f, this.f2899g, hVar.f2899g);
        this.f2899g = r33;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f2899g != hVar.f2899g) {
            return false;
        }
        boolean[] zArr = hVar.f2898f;
        for (int r12 = 0; r12 < this.f2899g; r12++) {
            if (this.f2898f[r12] != zArr[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f2899g; r12++) {
            r02 = (r02 * 31) + d0.c(this.f2898f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int r22 = 0; r22 < size; r22++) {
            if (this.f2898f[r22] == booleanValue) {
                return r22;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r12, Boolean bool) {
        r(r12, bool.booleanValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        s(bool.booleanValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f2898f;
        System.arraycopy(zArr, r4, zArr, r32, this.f2899g - r4);
        this.f2899g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    public void s(boolean z4) {
        i();
        int r02 = this.f2899g;
        boolean[] zArr = this.f2898f;
        if (r02 == zArr.length) {
            boolean[] zArr2 = new boolean[((r02 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, r02);
            this.f2898f = zArr2;
        }
        boolean[] zArr3 = this.f2898f;
        int r12 = this.f2899g;
        this.f2899g = r12 + 1;
        zArr3[r12] = z4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2899g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Boolean get(int r12) {
        return Boolean.valueOf(v(r12));
    }

    public boolean v(int r22) {
        t(r22);
        return this.f2898f[r22];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d0.a k(int r32) {
        if (r32 >= this.f2899g) {
            return new h(Arrays.copyOf(this.f2898f, r32), this.f2899g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int r5) {
        i();
        t(r5);
        boolean[] zArr = this.f2898f;
        boolean z4 = zArr[r5];
        if (r5 < this.f2899g - 1) {
            System.arraycopy(zArr, r5 + 1, zArr, r5, (r2 - r5) - 1);
        }
        this.f2899g--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z4);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Boolean set(int r12, Boolean bool) {
        return Boolean.valueOf(A(r12, bool.booleanValue()));
    }
}
