package com.google.protobuf;

import com.google.protobuf.j;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class m1 extends j {

    /* renamed from: n, reason: collision with root package name */
    static final int[] f3009n = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private final int f3010i;

    /* renamed from: j, reason: collision with root package name */
    private final j f3011j;

    /* renamed from: k, reason: collision with root package name */
    private final j f3012k;

    /* renamed from: l, reason: collision with root package name */
    private final int f3013l;

    /* renamed from: m, reason: collision with root package name */
    private final int f3014m;

    class a extends j.c {

        /* renamed from: e, reason: collision with root package name */
        final c f3015e;

        /* renamed from: f, reason: collision with root package name */
        j.g f3016f = d();

        a() {
            this.f3015e = new c(m1.this, null);
        }

        private j.g d() {
            if (this.f3015e.hasNext()) {
                return this.f3015e.next().iterator();
            }
            return null;
        }

        @Override // com.google.protobuf.j.g
        public byte b() {
            j.g gVar = this.f3016f;
            if (gVar == null) {
                throw new NoSuchElementException();
            }
            byte b5 = gVar.b();
            if (!this.f3016f.hasNext()) {
                this.f3016f = d();
            }
            return b5;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3016f != null;
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayDeque<j> f3018a;

        private b() {
            this.f3018a = new ArrayDeque<>();
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public j b(j jVar, j jVar2) {
            c(jVar);
            c(jVar2);
            j pop = this.f3018a.pop();
            while (!this.f3018a.isEmpty()) {
                pop = new m1(this.f3018a.pop(), pop, null);
            }
            return pop;
        }

        private void c(j jVar) {
            if (jVar.D()) {
                e(jVar);
                return;
            }
            if (jVar instanceof m1) {
                m1 m1Var = (m1) jVar;
                c(m1Var.f3011j);
                c(m1Var.f3012k);
            } else {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found " + jVar.getClass());
            }
        }

        private int d(int r22) {
            int binarySearch = Arrays.binarySearch(m1.f3009n, r22);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(j jVar) {
            a aVar;
            int d5 = d(jVar.size());
            int d02 = m1.d0(d5 + 1);
            if (this.f3018a.isEmpty() || this.f3018a.peek().size() >= d02) {
                this.f3018a.push(jVar);
                return;
            }
            int d03 = m1.d0(d5);
            j pop = this.f3018a.pop();
            while (true) {
                aVar = null;
                if (this.f3018a.isEmpty() || this.f3018a.peek().size() >= d03) {
                    break;
                } else {
                    pop = new m1(this.f3018a.pop(), pop, aVar);
                }
            }
            m1 m1Var = new m1(pop, jVar, aVar);
            while (!this.f3018a.isEmpty()) {
                if (this.f3018a.peek().size() >= m1.d0(d(m1Var.size()) + 1)) {
                    break;
                } else {
                    m1Var = new m1(this.f3018a.pop(), m1Var, aVar);
                }
            }
            this.f3018a.push(m1Var);
        }
    }

    private static final class c implements Iterator<j.i> {

        /* renamed from: e, reason: collision with root package name */
        private final ArrayDeque<m1> f3019e;

        /* renamed from: f, reason: collision with root package name */
        private j.i f3020f;

        private c(j jVar) {
            j.i iVar;
            if (jVar instanceof m1) {
                m1 m1Var = (m1) jVar;
                ArrayDeque<m1> arrayDeque = new ArrayDeque<>(m1Var.B());
                this.f3019e = arrayDeque;
                arrayDeque.push(m1Var);
                iVar = c(m1Var.f3011j);
            } else {
                this.f3019e = null;
                iVar = (j.i) jVar;
            }
            this.f3020f = iVar;
        }

        /* synthetic */ c(j jVar, a aVar) {
            this(jVar);
        }

        private j.i c(j jVar) {
            while (jVar instanceof m1) {
                m1 m1Var = (m1) jVar;
                this.f3019e.push(m1Var);
                jVar = m1Var.f3011j;
            }
            return (j.i) jVar;
        }

        private j.i d() {
            j.i c5;
            do {
                ArrayDeque<m1> arrayDeque = this.f3019e;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    return null;
                }
                c5 = c(this.f3019e.pop().f3012k);
            } while (c5.isEmpty());
            return c5;
        }

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public j.i next() {
            j.i iVar = this.f3020f;
            if (iVar == null) {
                throw new NoSuchElementException();
            }
            this.f3020f = d();
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3020f != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private m1(j jVar, j jVar2) {
        this.f3011j = jVar;
        this.f3012k = jVar2;
        int size = jVar.size();
        this.f3013l = size;
        this.f3010i = size + jVar2.size();
        this.f3014m = Math.max(jVar.B(), jVar2.B()) + 1;
    }

    /* synthetic */ m1(j jVar, j jVar2, a aVar) {
        this(jVar, jVar2);
    }

    static j a0(j jVar, j jVar2) {
        if (jVar2.size() == 0) {
            return jVar;
        }
        if (jVar.size() == 0) {
            return jVar2;
        }
        int size = jVar.size() + jVar2.size();
        if (size < 128) {
            return b0(jVar, jVar2);
        }
        if (jVar instanceof m1) {
            m1 m1Var = (m1) jVar;
            if (m1Var.f3012k.size() + jVar2.size() < 128) {
                return new m1(m1Var.f3011j, b0(m1Var.f3012k, jVar2));
            }
            if (m1Var.f3011j.B() > m1Var.f3012k.B() && m1Var.B() > jVar2.B()) {
                return new m1(m1Var.f3011j, new m1(m1Var.f3012k, jVar2));
            }
        }
        return size >= d0(Math.max(jVar.B(), jVar2.B()) + 1) ? new m1(jVar, jVar2) : new b(null).b(jVar, jVar2);
    }

    private static j b0(j jVar, j jVar2) {
        int size = jVar.size();
        int size2 = jVar2.size();
        byte[] bArr = new byte[size + size2];
        jVar.z(bArr, 0, 0, size);
        jVar2.z(bArr, 0, size, size2);
        return j.U(bArr);
    }

    private boolean c0(j jVar) {
        a aVar = null;
        c cVar = new c(this, aVar);
        j.i next = cVar.next();
        c cVar2 = new c(jVar, aVar);
        j.i next2 = cVar2.next();
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        while (true) {
            int size = next.size() - r4;
            int size2 = next2.size() - r5;
            int min = Math.min(size, size2);
            if (!(r4 == 0 ? next.X(next2, r5, min) : next2.X(next, r4, min))) {
                return false;
            }
            r6 += min;
            int r10 = this.f3010i;
            if (r6 >= r10) {
                if (r6 == r10) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                r4 = 0;
                next = cVar.next();
            } else {
                r4 += min;
                next = next;
            }
            if (min == size2) {
                next2 = cVar2.next();
                r5 = 0;
            } else {
                r5 += min;
            }
        }
    }

    static int d0(int r22) {
        int[] r02 = f3009n;
        if (r22 >= r02.length) {
            return Integer.MAX_VALUE;
        }
        return r02[r22];
    }

    @Override // com.google.protobuf.j
    protected void A(byte[] bArr, int r4, int r5, int r6) {
        j jVar;
        int r02 = r4 + r6;
        int r12 = this.f3013l;
        if (r02 <= r12) {
            jVar = this.f3011j;
        } else {
            if (r4 < r12) {
                int r13 = r12 - r4;
                this.f3011j.A(bArr, r4, r5, r13);
                this.f3012k.A(bArr, 0, r5 + r13, r6 - r13);
                return;
            }
            jVar = this.f3012k;
            r4 -= r12;
        }
        jVar.A(bArr, r4, r5, r6);
    }

    @Override // com.google.protobuf.j
    protected int B() {
        return this.f3014m;
    }

    @Override // com.google.protobuf.j
    byte C(int r32) {
        int r02 = this.f3013l;
        return r32 < r02 ? this.f3011j.C(r32) : this.f3012k.C(r32 - r02);
    }

    @Override // com.google.protobuf.j
    protected boolean D() {
        return this.f3010i >= d0(this.f3014m);
    }

    @Override // com.google.protobuf.j
    public boolean E() {
        int J = this.f3011j.J(0, 0, this.f3013l);
        j jVar = this.f3012k;
        return jVar.J(J, 0, jVar.size()) == 0;
    }

    @Override // com.google.protobuf.j, java.lang.Iterable
    /* renamed from: F */
    public j.g iterator() {
        return new a();
    }

    @Override // com.google.protobuf.j
    public k H() {
        return k.h(Z(), true);
    }

    @Override // com.google.protobuf.j
    protected int I(int r32, int r4, int r5) {
        int r02 = r4 + r5;
        int r12 = this.f3013l;
        if (r02 <= r12) {
            return this.f3011j.I(r32, r4, r5);
        }
        if (r4 >= r12) {
            return this.f3012k.I(r32, r4 - r12, r5);
        }
        int r13 = r12 - r4;
        return this.f3012k.I(this.f3011j.I(r32, r4, r13), 0, r5 - r13);
    }

    @Override // com.google.protobuf.j
    protected int J(int r32, int r4, int r5) {
        int r02 = r4 + r5;
        int r12 = this.f3013l;
        if (r02 <= r12) {
            return this.f3011j.J(r32, r4, r5);
        }
        if (r4 >= r12) {
            return this.f3012k.J(r32, r4 - r12, r5);
        }
        int r13 = r12 - r4;
        return this.f3012k.J(this.f3011j.J(r32, r4, r13), 0, r5 - r13);
    }

    @Override // com.google.protobuf.j
    public j M(int r4, int r5) {
        int t4 = j.t(r4, r5, this.f3010i);
        if (t4 == 0) {
            return j.f2914f;
        }
        if (t4 == this.f3010i) {
            return this;
        }
        int r02 = this.f3013l;
        return r5 <= r02 ? this.f3011j.M(r4, r5) : r4 >= r02 ? this.f3012k.M(r4 - r02, r5 - r02) : new m1(this.f3011j.L(r4), this.f3012k.M(0, r5 - this.f3013l));
    }

    @Override // com.google.protobuf.j
    protected String Q(Charset charset) {
        return new String(N(), charset);
    }

    @Override // com.google.protobuf.j
    void W(i iVar) {
        this.f3011j.W(iVar);
        this.f3012k.W(iVar);
    }

    public List<ByteBuffer> Z() {
        ArrayList arrayList = new ArrayList();
        c cVar = new c(this, null);
        while (cVar.hasNext()) {
            arrayList.add(cVar.next().p());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.j
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f3010i != jVar.size()) {
            return false;
        }
        if (this.f3010i == 0) {
            return true;
        }
        int K = K();
        int K2 = jVar.K();
        if (K == 0 || K2 == 0 || K == K2) {
            return c0(jVar);
        }
        return false;
    }

    @Override // com.google.protobuf.j
    public ByteBuffer p() {
        return ByteBuffer.wrap(N()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.j
    public byte r(int r22) {
        j.s(r22, this.f3010i);
        return C(r22);
    }

    @Override // com.google.protobuf.j
    public int size() {
        return this.f3010i;
    }
}
