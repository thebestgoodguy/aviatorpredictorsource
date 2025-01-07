package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class y extends c<Float> implements d0.f, RandomAccess, g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final y f3136h;

    /* renamed from: f, reason: collision with root package name */
    private float[] f3137f;

    /* renamed from: g, reason: collision with root package name */
    private int f3138g;

    static {
        y yVar = new y(new float[0], 0);
        f3136h = yVar;
        yVar.h();
    }

    y() {
        this(new float[10], 0);
    }

    private y(float[] fArr, int r22) {
        this.f3137f = fArr;
        this.f3138g = r22;
    }

    private void s(int r5, float f5) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f3138g)) {
            throw new IndexOutOfBoundsException(w(r5));
        }
        float[] fArr = this.f3137f;
        if (r02 < fArr.length) {
            System.arraycopy(fArr, r5, fArr, r5 + 1, r02 - r5);
        } else {
            float[] fArr2 = new float[((r02 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r5);
            System.arraycopy(this.f3137f, r5, fArr2, r5 + 1, this.f3138g - r5);
            this.f3137f = fArr2;
        }
        this.f3137f[r5] = f5;
        this.f3138g++;
        ((AbstractList) this).modCount++;
    }

    private void t(int r22) {
        if (r22 < 0 || r22 >= this.f3138g) {
            throw new IndexOutOfBoundsException(w(r22));
        }
    }

    private String w(int r32) {
        return "Index:" + r32 + ", Size:" + this.f3138g;
    }

    public float A(int r32, float f5) {
        i();
        t(r32);
        float[] fArr = this.f3137f;
        float f6 = fArr[r32];
        fArr[r32] = f5;
        return f6;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Float> collection) {
        i();
        d0.a(collection);
        if (!(collection instanceof y)) {
            return super.addAll(collection);
        }
        y yVar = (y) collection;
        int r02 = yVar.f3138g;
        if (r02 == 0) {
            return false;
        }
        int r32 = this.f3138g;
        if (Integer.MAX_VALUE - r32 < r02) {
            throw new OutOfMemoryError();
        }
        int r33 = r32 + r02;
        float[] fArr = this.f3137f;
        if (r33 > fArr.length) {
            this.f3137f = Arrays.copyOf(fArr, r33);
        }
        System.arraycopy(yVar.f3137f, 0, this.f3137f, this.f3138g, yVar.f3138g);
        this.f3138g = r33;
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
        if (!(obj instanceof y)) {
            return super.equals(obj);
        }
        y yVar = (y) obj;
        if (this.f3138g != yVar.f3138g) {
            return false;
        }
        float[] fArr = yVar.f3137f;
        for (int r12 = 0; r12 < this.f3138g; r12++) {
            if (Float.floatToIntBits(this.f3137f[r12]) != Float.floatToIntBits(fArr[r12])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f3138g; r12++) {
            r02 = (r02 * 31) + Float.floatToIntBits(this.f3137f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float floatValue = ((Float) obj).floatValue();
        int size = size();
        for (int r22 = 0; r22 < size; r22++) {
            if (this.f3137f[r22] == floatValue) {
                return r22;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r12, Float f5) {
        s(r12, f5.floatValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f5) {
        r(f5.floatValue());
        return true;
    }

    public void r(float f5) {
        i();
        int r02 = this.f3138g;
        float[] fArr = this.f3137f;
        if (r02 == fArr.length) {
            float[] fArr2 = new float[((r02 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, r02);
            this.f3137f = fArr2;
        }
        float[] fArr3 = this.f3137f;
        int r12 = this.f3138g;
        this.f3138g = r12 + 1;
        fArr3[r12] = f5;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f3137f;
        System.arraycopy(fArr, r4, fArr, r32, this.f3138g - r4);
        this.f3138g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3138g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Float get(int r12) {
        return Float.valueOf(v(r12));
    }

    public float v(int r22) {
        t(r22);
        return this.f3137f[r22];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d0.f k(int r32) {
        if (r32 >= this.f3138g) {
            return new y(Arrays.copyOf(this.f3137f, r32), this.f3138g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Float remove(int r5) {
        i();
        t(r5);
        float[] fArr = this.f3137f;
        float f5 = fArr[r5];
        if (r5 < this.f3138g - 1) {
            System.arraycopy(fArr, r5 + 1, fArr, r5, (r2 - r5) - 1);
        }
        this.f3138g--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f5);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Float set(int r12, Float f5) {
        return Float.valueOf(A(r12, f5.floatValue()));
    }
}
