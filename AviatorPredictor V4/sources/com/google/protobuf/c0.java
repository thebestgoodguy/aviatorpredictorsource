package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class c0 extends c<Integer> implements d0.g, RandomAccess, g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final c0 f2835h;

    /* renamed from: f, reason: collision with root package name */
    private int[] f2836f;

    /* renamed from: g, reason: collision with root package name */
    private int f2837g;

    static {
        c0 c0Var = new c0(new int[0], 0);
        f2835h = c0Var;
        c0Var.h();
    }

    c0() {
        this(new int[10], 0);
    }

    private c0(int[] r12, int r22) {
        this.f2836f = r12;
        this.f2837g = r22;
    }

    private void s(int r5, int r6) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f2837g)) {
            throw new IndexOutOfBoundsException(x(r5));
        }
        int[] r12 = this.f2836f;
        if (r02 < r12.length) {
            System.arraycopy(r12, r5, r12, r5 + 1, r02 - r5);
        } else {
            int[] r03 = new int[((r02 * 3) / 2) + 1];
            System.arraycopy(r12, 0, r03, 0, r5);
            System.arraycopy(this.f2836f, r5, r03, r5 + 1, this.f2837g - r5);
            this.f2836f = r03;
        }
        this.f2836f[r5] = r6;
        this.f2837g++;
        ((AbstractList) this).modCount++;
    }

    public static c0 t() {
        return f2835h;
    }

    private void u(int r22) {
        if (r22 < 0 || r22 >= this.f2837g) {
            throw new IndexOutOfBoundsException(x(r22));
        }
    }

    private String x(int r32) {
        return "Index:" + r32 + ", Size:" + this.f2837g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Integer set(int r12, Integer num) {
        return Integer.valueOf(B(r12, num.intValue()));
    }

    public int B(int r32, int r4) {
        i();
        u(r32);
        int[] r02 = this.f2836f;
        int r12 = r02[r32];
        r02[r32] = r4;
        return r12;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Integer> collection) {
        i();
        d0.a(collection);
        if (!(collection instanceof c0)) {
            return super.addAll(collection);
        }
        c0 c0Var = (c0) collection;
        int r02 = c0Var.f2837g;
        if (r02 == 0) {
            return false;
        }
        int r32 = this.f2837g;
        if (Integer.MAX_VALUE - r32 < r02) {
            throw new OutOfMemoryError();
        }
        int r33 = r32 + r02;
        int[] r03 = this.f2836f;
        if (r33 > r03.length) {
            this.f2836f = Arrays.copyOf(r03, r33);
        }
        System.arraycopy(c0Var.f2836f, 0, this.f2836f, this.f2837g, c0Var.f2837g);
        this.f2837g = r33;
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
        if (!(obj instanceof c0)) {
            return super.equals(obj);
        }
        c0 c0Var = (c0) obj;
        if (this.f2837g != c0Var.f2837g) {
            return false;
        }
        int[] r6 = c0Var.f2836f;
        for (int r12 = 0; r12 < this.f2837g; r12++) {
            if (this.f2836f[r12] != r6[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f2837g; r12++) {
            r02 = (r02 * 31) + this.f2836f[r12];
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int r22 = 0; r22 < size; r22++) {
            if (this.f2836f[r22] == intValue) {
                return r22;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r12, Integer num) {
        s(r12, num.intValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        r(num.intValue());
        return true;
    }

    public void r(int r5) {
        i();
        int r02 = this.f2837g;
        int[] r12 = this.f2836f;
        if (r02 == r12.length) {
            int[] r22 = new int[((r02 * 3) / 2) + 1];
            System.arraycopy(r12, 0, r22, 0, r02);
            this.f2836f = r22;
        }
        int[] r03 = this.f2836f;
        int r13 = this.f2837g;
        this.f2837g = r13 + 1;
        r03[r13] = r5;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] r02 = this.f2836f;
        System.arraycopy(r02, r4, r02, r32, this.f2837g - r4);
        this.f2837g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2837g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Integer get(int r12) {
        return Integer.valueOf(w(r12));
    }

    public int w(int r22) {
        u(r22);
        return this.f2836f[r22];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public d0.g k(int r32) {
        if (r32 >= this.f2837g) {
            return new c0(Arrays.copyOf(this.f2836f, r32), this.f2837g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer remove(int r5) {
        i();
        u(r5);
        int[] r02 = this.f2836f;
        int r12 = r02[r5];
        if (r5 < this.f2837g - 1) {
            System.arraycopy(r02, r5 + 1, r02, r5, (r2 - r5) - 1);
        }
        this.f2837g--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(r12);
    }
}
