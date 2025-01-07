package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class m0 extends c<Long> implements d0.h, RandomAccess, g1 {

    /* renamed from: h, reason: collision with root package name */
    private static final m0 f3006h;

    /* renamed from: f, reason: collision with root package name */
    private long[] f3007f;

    /* renamed from: g, reason: collision with root package name */
    private int f3008g;

    static {
        m0 m0Var = new m0(new long[0], 0);
        f3006h = m0Var;
        m0Var.h();
    }

    m0() {
        this(new long[10], 0);
    }

    private m0(long[] jArr, int r22) {
        this.f3007f = jArr;
        this.f3008g = r22;
    }

    private void r(int r5, long j4) {
        int r02;
        i();
        if (r5 < 0 || r5 > (r02 = this.f3008g)) {
            throw new IndexOutOfBoundsException(w(r5));
        }
        long[] jArr = this.f3007f;
        if (r02 < jArr.length) {
            System.arraycopy(jArr, r5, jArr, r5 + 1, r02 - r5);
        } else {
            long[] jArr2 = new long[((r02 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r5);
            System.arraycopy(this.f3007f, r5, jArr2, r5 + 1, this.f3008g - r5);
            this.f3007f = jArr2;
        }
        this.f3007f[r5] = j4;
        this.f3008g++;
        ((AbstractList) this).modCount++;
    }

    private void t(int r22) {
        if (r22 < 0 || r22 >= this.f3008g) {
            throw new IndexOutOfBoundsException(w(r22));
        }
    }

    private String w(int r32) {
        return "Index:" + r32 + ", Size:" + this.f3008g;
    }

    public long A(int r4, long j4) {
        i();
        t(r4);
        long[] jArr = this.f3007f;
        long j5 = jArr[r4];
        jArr[r4] = j4;
        return j5;
    }

    @Override // com.google.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends Long> collection) {
        i();
        d0.a(collection);
        if (!(collection instanceof m0)) {
            return super.addAll(collection);
        }
        m0 m0Var = (m0) collection;
        int r02 = m0Var.f3008g;
        if (r02 == 0) {
            return false;
        }
        int r32 = this.f3008g;
        if (Integer.MAX_VALUE - r32 < r02) {
            throw new OutOfMemoryError();
        }
        int r33 = r32 + r02;
        long[] jArr = this.f3007f;
        if (r33 > jArr.length) {
            this.f3007f = Arrays.copyOf(jArr, r33);
        }
        System.arraycopy(m0Var.f3007f, 0, this.f3007f, this.f3008g, m0Var.f3008g);
        this.f3008g = r33;
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
        if (!(obj instanceof m0)) {
            return super.equals(obj);
        }
        m0 m0Var = (m0) obj;
        if (this.f3008g != m0Var.f3008g) {
            return false;
        }
        long[] jArr = m0Var.f3007f;
        for (int r12 = 0; r12 < this.f3008g; r12++) {
            if (this.f3007f[r12] != jArr[r12]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int r02 = 1;
        for (int r12 = 0; r12 < this.f3008g; r12++) {
            r02 = (r02 * 31) + d0.f(this.f3007f[r12]);
        }
        return r02;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int r02 = 0; r02 < size; r02++) {
            if (this.f3007f[r02] == longValue) {
                return r02;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void add(int r32, Long l4) {
        r(r32, l4.longValue());
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l4) {
        s(l4.longValue());
        return true;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int r32, int r4) {
        i();
        if (r4 < r32) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f3007f;
        System.arraycopy(jArr, r4, jArr, r32, this.f3008g - r4);
        this.f3008g -= r4 - r32;
        ((AbstractList) this).modCount++;
    }

    public void s(long j4) {
        i();
        int r02 = this.f3008g;
        long[] jArr = this.f3007f;
        if (r02 == jArr.length) {
            long[] jArr2 = new long[((r02 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, r02);
            this.f3007f = jArr2;
        }
        long[] jArr3 = this.f3007f;
        int r12 = this.f3008g;
        this.f3008g = r12 + 1;
        jArr3[r12] = j4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3008g;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public Long get(int r32) {
        return Long.valueOf(v(r32));
    }

    public long v(int r4) {
        t(r4);
        return this.f3007f[r4];
    }

    @Override // com.google.protobuf.d0.i
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public d0.h k(int r32) {
        if (r32 >= this.f3008g) {
            return new m0(Arrays.copyOf(this.f3007f, r32), this.f3008g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.c, java.util.AbstractList, java.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Long remove(int r6) {
        i();
        t(r6);
        long[] jArr = this.f3007f;
        long j4 = jArr[r6];
        if (r6 < this.f3008g - 1) {
            System.arraycopy(jArr, r6 + 1, jArr, r6, (r3 - r6) - 1);
        }
        this.f3008g--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Long set(int r32, Long l4) {
        return Long.valueOf(A(r32, l4.longValue()));
    }
}
