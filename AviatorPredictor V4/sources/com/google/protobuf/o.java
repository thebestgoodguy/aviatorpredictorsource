package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class o extends c<Double> implements d0.b, RandomAccess, g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final o f3026h;

    /* renamed from: f, reason: collision with root package name */
    private double[] f3027f;

    /* renamed from: g, reason: collision with root package name */
    private int f3028g;

    static {
        o oVar = new o(new double[0], 0);
        f3026h = oVar;
        oVar.h();
    }

    o() {
        this(new double[10], 0);
    }

    private o(double[] dArr, int r22) {
        this.f3027f = dArr;
        this.f3028g = r22;
    }

    private void s(int r5, double d5) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f3028g)) {
            throw new IndexOutOfBoundsException(w(r5));
        }
        double[] dArr = this.f3027f;
        if (r02 < dArr.length) {
            System.arraycopy(dArr, r5, dArr, r5 + 1, r02 - r5);
        } else {
            double[] dArr2 = new double[((r02 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r5);
            System.arraycopy(this.f3027f, r5, dArr2, r5 + 1, this.f3028g - r5);
            this.f3027f = dArr2;
        }
        this.f3027f[r5] = d5;
        this.f3028g++;
        ((AbstractList) this).modCount++;
    }

    private void t(int r22) {
        if (r22 < 0 || r22 >= this.f3028g) {
            throw new IndexOutOfBoundsException(w(r22));
        }
    }

    private String w(int r32) {
        return "Index:" + r32 + ", Size:" + this.f3028g;
    }

    public double A(int r4, double d5) {
        i();
        t(r4);
        double[] dArr = this.f3027f;
        double d6 = dArr[r4];
        dArr[r4] = d5;
        return d6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Double> collection) {
        i();
        d0.a(collection);
        if (!(collection instanceof o)) {
            return super.addAll(collection);
        }
        o oVar = (o) collection;
        int r02 = oVar.f3028g;
        if (r02 == 0) {
            return false;
        }
        int r32 = this.f3028g;
        if (Integer.MAX_VALUE - r32 < r02) {
            throw new OutOfMemoryError();
        }
        int r33 = r32 + r02;
        double[] dArr = this.f3027f;
        if (r33 > dArr.length) {
            this.f3027f = Arrays.copyOf(dArr, r33);
        }
        System.arraycopy(oVar.f3027f, 0, this.f3027f, this.f3028g, oVar.f3028g);
        this.f3028g = r33;
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
        if (!(obj instanceof o)) {
            return super.equals(obj);
        }
        o oVar = (o) obj;
        if (this.f3028g != oVar.f3028g) {
            return false;
        }
        double[] dArr = oVar.f3027f;
        for (int r12 = 0; r12 < this.f3028g; r12++) {
            if (Double.doubleToLongBits(this.f3027f[r12]) != Double.doubleToLongBits(dArr[r12])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f3028g; r12++) {
            r02 = (r02 * 31) + d0.f(Double.doubleToLongBits(this.f3027f[r12]));
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int r02 = 0; r02 < size; r02++) {
            if (this.f3027f[r02] == doubleValue) {
                return r02;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r32, Double d5) {
        s(r32, d5.doubleValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d5) {
        r(d5.doubleValue());
        return true;
    }

    public void r(double d5) {
        i();
        int r02 = this.f3028g;
        double[] dArr = this.f3027f;
        if (r02 == dArr.length) {
            double[] dArr2 = new double[((r02 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, r02);
            this.f3027f = dArr2;
        }
        double[] dArr3 = this.f3027f;
        int r12 = this.f3028g;
        this.f3028g = r12 + 1;
        dArr3[r12] = d5;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f3027f;
        System.arraycopy(dArr, r4, dArr, r32, this.f3028g - r4);
        this.f3028g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3028g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Double get(int r32) {
        return Double.valueOf(v(r32));
    }

    public double v(int r4) {
        t(r4);
        return this.f3027f[r4];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d0.b k(int r32) {
        if (r32 >= this.f3028g) {
            return new o(Arrays.copyOf(this.f3027f, r32), this.f3028g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Double remove(int r6) {
        i();
        t(r6);
        double[] dArr = this.f3027f;
        double d5 = dArr[r6];
        if (r6 < this.f3028g - 1) {
            System.arraycopy(dArr, r6 + 1, dArr, r6, (r3 - r6) - 1);
        }
        this.f3028g--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d5);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Double set(int r32, Double d5) {
        return Double.valueOf(A(r32, d5.doubleValue()));
    }
}
