package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f2932f = 100;

    /* renamed from: a, reason: collision with root package name */
    int f2933a;

    /* renamed from: b, reason: collision with root package name */
    int f2934b;

    /* renamed from: c, reason: collision with root package name */
    int f2935c;

    /* renamed from: d, reason: collision with root package name */
    l f2936d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2937e;

    private static final class b extends k {

        /* renamed from: g, reason: collision with root package name */
        private final byte[] f2938g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f2939h;

        /* renamed from: i, reason: collision with root package name */
        private int f2940i;

        /* renamed from: j, reason: collision with root package name */
        private int f2941j;

        /* renamed from: k, reason: collision with root package name */
        private int f2942k;

        /* renamed from: l, reason: collision with root package name */
        private int f2943l;

        /* renamed from: m, reason: collision with root package name */
        private int f2944m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f2945n;

        /* renamed from: o, reason: collision with root package name */
        private int f2946o;

        private b(byte[] bArr, int r32, int r4, boolean z4) {
            super();
            this.f2946o = Integer.MAX_VALUE;
            this.f2938g = bArr;
            this.f2940i = r4 + r32;
            this.f2942k = r32;
            this.f2943l = r32;
            this.f2939h = z4;
        }

        private void P() {
            int r02 = this.f2940i + this.f2941j;
            this.f2940i = r02;
            int r12 = r02 - this.f2943l;
            int r22 = this.f2946o;
            if (r12 <= r22) {
                this.f2941j = 0;
                return;
            }
            int r13 = r12 - r22;
            this.f2941j = r13;
            this.f2940i = r02 - r13;
        }

        private void S() {
            if (this.f2940i - this.f2942k >= 10) {
                T();
            } else {
                U();
            }
        }

        private void T() {
            for (int r02 = 0; r02 < 10; r02++) {
                byte[] bArr = this.f2938g;
                int r22 = this.f2942k;
                this.f2942k = r22 + 1;
                if (bArr[r22] >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void U() {
            for (int r02 = 0; r02 < 10; r02++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        @Override // com.google.protobuf.k
        public long A() {
            return k.c(N());
        }

        @Override // com.google.protobuf.k
        public String B() {
            int M = M();
            if (M > 0) {
                int r12 = this.f2940i;
                int r22 = this.f2942k;
                if (M <= r12 - r22) {
                    String str = new String(this.f2938g, r22, M, d0.f2847b);
                    this.f2942k += M;
                    return str;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M < 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.k
        public String C() {
            int M = M();
            if (M > 0) {
                int r12 = this.f2940i;
                int r22 = this.f2942k;
                if (M <= r12 - r22) {
                    String h5 = a2.h(this.f2938g, r22, M);
                    this.f2942k += M;
                    return h5;
                }
            }
            if (M == 0) {
                return "";
            }
            if (M <= 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.k
        public int D() {
            if (e()) {
                this.f2944m = 0;
                return 0;
            }
            int M = M();
            this.f2944m = M;
            if (b2.a(M) != 0) {
                return this.f2944m;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.k
        public int E() {
            return M();
        }

        @Override // com.google.protobuf.k
        public long F() {
            return N();
        }

        @Override // com.google.protobuf.k
        public boolean H(int r5) {
            int b5 = b2.b(r5);
            if (b5 == 0) {
                S();
                return true;
            }
            if (b5 == 1) {
                R(8);
                return true;
            }
            if (b5 == 2) {
                R(M());
                return true;
            }
            if (b5 == 3) {
                Q();
                a(b2.c(b2.a(r5), 4));
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            R(4);
            return true;
        }

        public byte I() {
            int r02 = this.f2942k;
            if (r02 == this.f2940i) {
                throw e0.m();
            }
            byte[] bArr = this.f2938g;
            this.f2942k = r02 + 1;
            return bArr[r02];
        }

        public byte[] J(int r32) {
            if (r32 > 0) {
                int r02 = this.f2940i;
                int r12 = this.f2942k;
                if (r32 <= r02 - r12) {
                    int r33 = r32 + r12;
                    this.f2942k = r33;
                    return Arrays.copyOfRange(this.f2938g, r12, r33);
                }
            }
            if (r32 > 0) {
                throw e0.m();
            }
            if (r32 == 0) {
                return d0.f2849d;
            }
            throw e0.g();
        }

        public int K() {
            int r02 = this.f2942k;
            if (this.f2940i - r02 < 4) {
                throw e0.m();
            }
            byte[] bArr = this.f2938g;
            this.f2942k = r02 + 4;
            return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
        }

        public long L() {
            int r02 = this.f2942k;
            if (this.f2940i - r02 < 8) {
                throw e0.m();
            }
            byte[] bArr = this.f2938g;
            this.f2942k = r02 + 8;
            return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int M() {
            /*
                r5 = this;
                int r0 = r5.f2942k
                int r1 = r5.f2940i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2938g
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2942k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.O()
                int r1 = (int) r0
                return r1
            L70:
                r5.f2942k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.b.M():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long N() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.b.N():long");
        }

        long O() {
            long j4 = 0;
            for (int r22 = 0; r22 < 64; r22 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << r22;
                if ((I() & 128) == 0) {
                    return j4;
                }
            }
            throw e0.f();
        }

        public void Q() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void R(int r32) {
            if (r32 >= 0) {
                int r02 = this.f2940i;
                int r12 = this.f2942k;
                if (r32 <= r02 - r12) {
                    this.f2942k = r12 + r32;
                    return;
                }
            }
            if (r32 >= 0) {
                throw e0.m();
            }
            throw e0.g();
        }

        @Override // com.google.protobuf.k
        public void a(int r22) {
            if (this.f2944m != r22) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.k
        public int d() {
            return this.f2942k - this.f2943l;
        }

        @Override // com.google.protobuf.k
        public boolean e() {
            return this.f2942k == this.f2940i;
        }

        @Override // com.google.protobuf.k
        public void m(int r12) {
            this.f2946o = r12;
            P();
        }

        @Override // com.google.protobuf.k
        public int n(int r22) {
            if (r22 < 0) {
                throw e0.g();
            }
            int d5 = r22 + d();
            if (d5 < 0) {
                throw e0.h();
            }
            int r02 = this.f2946o;
            if (d5 > r02) {
                throw e0.m();
            }
            this.f2946o = d5;
            P();
            return r02;
        }

        @Override // com.google.protobuf.k
        public boolean o() {
            return N() != 0;
        }

        @Override // com.google.protobuf.k
        public j p() {
            int M = M();
            if (M > 0) {
                int r12 = this.f2940i;
                int r22 = this.f2942k;
                if (M <= r12 - r22) {
                    j V = (this.f2939h && this.f2945n) ? j.V(this.f2938g, r22, M) : j.x(this.f2938g, r22, M);
                    this.f2942k += M;
                    return V;
                }
            }
            return M == 0 ? j.f2914f : j.U(J(M));
        }

        @Override // com.google.protobuf.k
        public double q() {
            return Double.longBitsToDouble(L());
        }

        @Override // com.google.protobuf.k
        public int r() {
            return M();
        }

        @Override // com.google.protobuf.k
        public int s() {
            return K();
        }

        @Override // com.google.protobuf.k
        public long t() {
            return L();
        }

        @Override // com.google.protobuf.k
        public float u() {
            return Float.intBitsToFloat(K());
        }

        @Override // com.google.protobuf.k
        public int v() {
            return M();
        }

        @Override // com.google.protobuf.k
        public long w() {
            return N();
        }

        @Override // com.google.protobuf.k
        public int x() {
            return K();
        }

        @Override // com.google.protobuf.k
        public long y() {
            return L();
        }

        @Override // com.google.protobuf.k
        public int z() {
            return k.b(M());
        }
    }

    private static final class c extends k {

        /* renamed from: g, reason: collision with root package name */
        private final Iterable<ByteBuffer> f2947g;

        /* renamed from: h, reason: collision with root package name */
        private final Iterator<ByteBuffer> f2948h;

        /* renamed from: i, reason: collision with root package name */
        private ByteBuffer f2949i;

        /* renamed from: j, reason: collision with root package name */
        private final boolean f2950j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f2951k;

        /* renamed from: l, reason: collision with root package name */
        private int f2952l;

        /* renamed from: m, reason: collision with root package name */
        private int f2953m;

        /* renamed from: n, reason: collision with root package name */
        private int f2954n;

        /* renamed from: o, reason: collision with root package name */
        private int f2955o;

        /* renamed from: p, reason: collision with root package name */
        private int f2956p;

        /* renamed from: q, reason: collision with root package name */
        private int f2957q;

        /* renamed from: r, reason: collision with root package name */
        private long f2958r;

        /* renamed from: s, reason: collision with root package name */
        private long f2959s;

        /* renamed from: t, reason: collision with root package name */
        private long f2960t;

        /* renamed from: u, reason: collision with root package name */
        private long f2961u;

        private c(Iterable<ByteBuffer> iterable, int r32, boolean z4) {
            super();
            this.f2954n = Integer.MAX_VALUE;
            this.f2952l = r32;
            this.f2947g = iterable;
            this.f2948h = iterable.iterator();
            this.f2950j = z4;
            this.f2956p = 0;
            this.f2957q = 0;
            if (r32 != 0) {
                X();
                return;
            }
            this.f2949i = d0.f2850e;
            this.f2958r = 0L;
            this.f2959s = 0L;
            this.f2961u = 0L;
            this.f2960t = 0L;
        }

        private long I() {
            return this.f2961u - this.f2958r;
        }

        private void J() {
            if (!this.f2948h.hasNext()) {
                throw e0.m();
            }
            X();
        }

        private void L(byte[] bArr, int r13, int r14) {
            if (r14 < 0 || r14 > S()) {
                if (r14 > 0) {
                    throw e0.m();
                }
                if (r14 != 0) {
                    throw e0.g();
                }
                return;
            }
            int r02 = r14;
            while (r02 > 0) {
                if (I() == 0) {
                    J();
                }
                int min = Math.min(r02, (int) I());
                long j4 = min;
                z1.p(this.f2958r, bArr, (r14 - r02) + r13, j4);
                r02 -= min;
                this.f2958r += j4;
            }
        }

        private void R() {
            int r02 = this.f2952l + this.f2953m;
            this.f2952l = r02;
            int r12 = r02 - this.f2957q;
            int r22 = this.f2954n;
            if (r12 <= r22) {
                this.f2953m = 0;
                return;
            }
            int r13 = r12 - r22;
            this.f2953m = r13;
            this.f2952l = r02 - r13;
        }

        private int S() {
            return (int) (((this.f2952l - this.f2956p) - this.f2958r) + this.f2959s);
        }

        private void V() {
            for (int r02 = 0; r02 < 10; r02++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private ByteBuffer W(int r4, int r5) {
            int position = this.f2949i.position();
            int limit = this.f2949i.limit();
            ByteBuffer byteBuffer = this.f2949i;
            try {
                try {
                    byteBuffer.position(r4);
                    byteBuffer.limit(r5);
                    return this.f2949i.slice();
                } catch (IllegalArgumentException unused) {
                    throw e0.m();
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        private void X() {
            ByteBuffer next = this.f2948h.next();
            this.f2949i = next;
            this.f2956p += (int) (this.f2958r - this.f2959s);
            long position = next.position();
            this.f2958r = position;
            this.f2959s = position;
            this.f2961u = this.f2949i.limit();
            long k4 = z1.k(this.f2949i);
            this.f2960t = k4;
            this.f2958r += k4;
            this.f2959s += k4;
            this.f2961u += k4;
        }

        @Override // com.google.protobuf.k
        public long A() {
            return k.c(P());
        }

        @Override // com.google.protobuf.k
        public String B() {
            int O = O();
            if (O > 0) {
                long j4 = O;
                long j5 = this.f2961u;
                long j6 = this.f2958r;
                if (j4 <= j5 - j6) {
                    byte[] bArr = new byte[O];
                    z1.p(j6, bArr, 0L, j4);
                    String str = new String(bArr, d0.f2847b);
                    this.f2958r += j4;
                    return str;
                }
            }
            if (O > 0 && O <= S()) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return new String(bArr2, d0.f2847b);
            }
            if (O == 0) {
                return "";
            }
            if (O < 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.k
        public String C() {
            int O = O();
            if (O > 0) {
                long j4 = O;
                long j5 = this.f2961u;
                long j6 = this.f2958r;
                if (j4 <= j5 - j6) {
                    String g5 = a2.g(this.f2949i, (int) (j6 - this.f2959s), O);
                    this.f2958r += j4;
                    return g5;
                }
            }
            if (O >= 0 && O <= S()) {
                byte[] bArr = new byte[O];
                L(bArr, 0, O);
                return a2.h(bArr, 0, O);
            }
            if (O == 0) {
                return "";
            }
            if (O <= 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.k
        public int D() {
            if (e()) {
                this.f2955o = 0;
                return 0;
            }
            int O = O();
            this.f2955o = O;
            if (b2.a(O) != 0) {
                return this.f2955o;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.k
        public int E() {
            return O();
        }

        @Override // com.google.protobuf.k
        public long F() {
            return P();
        }

        @Override // com.google.protobuf.k
        public boolean H(int r5) {
            int b5 = b2.b(r5);
            if (b5 == 0) {
                V();
                return true;
            }
            if (b5 == 1) {
                U(8);
                return true;
            }
            if (b5 == 2) {
                U(O());
                return true;
            }
            if (b5 == 3) {
                T();
                a(b2.c(b2.a(r5), 4));
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            U(4);
            return true;
        }

        public byte K() {
            if (I() == 0) {
                J();
            }
            long j4 = this.f2958r;
            this.f2958r = 1 + j4;
            return z1.w(j4);
        }

        public int M() {
            if (I() < 4) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24);
            }
            long j4 = this.f2958r;
            this.f2958r = 4 + j4;
            return ((z1.w(j4 + 3) & 255) << 24) | (z1.w(j4) & 255) | ((z1.w(1 + j4) & 255) << 8) | ((z1.w(2 + j4) & 255) << 16);
        }

        public long N() {
            if (I() < 8) {
                return (K() & 255) | ((K() & 255) << 8) | ((K() & 255) << 16) | ((K() & 255) << 24) | ((K() & 255) << 32) | ((K() & 255) << 40) | ((K() & 255) << 48) | ((K() & 255) << 56);
            }
            this.f2958r = 8 + this.f2958r;
            return ((z1.w(r0 + 7) & 255) << 56) | (z1.w(r0) & 255) | ((z1.w(1 + r0) & 255) << 8) | ((z1.w(2 + r0) & 255) << 16) | ((z1.w(3 + r0) & 255) << 24) | ((z1.w(4 + r0) & 255) << 32) | ((z1.w(5 + r0) & 255) << 40) | ((z1.w(6 + r0) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (com.google.protobuf.z1.w(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int O() {
            /*
                r10 = this;
                long r0 = r10.f2958r
                long r2 = r10.f2961u
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L8a
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L1a
                long r4 = r10.f2958r
                long r4 = r4 + r2
                r10.f2958r = r4
                return r0
            L1a:
                long r6 = r10.f2961u
                long r8 = r10.f2958r
                long r6 = r6 - r8
                r8 = 10
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L26
                goto L8a
            L26:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L34
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L90
            L34:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L43
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L41:
                r6 = r4
                goto L90
            L43:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L53
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L90
            L53:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L41
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L90
            L8a:
                long r0 = r10.Q()
                int r1 = (int) r0
                return r1
            L90:
                r10.f2958r = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.c.O():int");
        }

        public long P() {
            long w4;
            long j4;
            long j5;
            int r02;
            long j6 = this.f2958r;
            if (this.f2961u != j6) {
                long j7 = j6 + 1;
                byte w5 = z1.w(j6);
                if (w5 >= 0) {
                    this.f2958r++;
                    return w5;
                }
                if (this.f2961u - this.f2958r >= 10) {
                    long j8 = j7 + 1;
                    int w6 = w5 ^ (z1.w(j7) << 7);
                    if (w6 >= 0) {
                        long j9 = j8 + 1;
                        int w7 = w6 ^ (z1.w(j8) << 14);
                        if (w7 >= 0) {
                            w4 = w7 ^ 16256;
                        } else {
                            j8 = j9 + 1;
                            int w8 = w7 ^ (z1.w(j9) << 21);
                            if (w8 < 0) {
                                r02 = w8 ^ (-2080896);
                            } else {
                                j9 = j8 + 1;
                                long w9 = w8 ^ (z1.w(j8) << 28);
                                if (w9 < 0) {
                                    long j10 = j9 + 1;
                                    long w10 = w9 ^ (z1.w(j9) << 35);
                                    if (w10 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        j9 = j10 + 1;
                                        w9 = w10 ^ (z1.w(j10) << 42);
                                        if (w9 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            j10 = j9 + 1;
                                            w10 = w9 ^ (z1.w(j9) << 49);
                                            if (w10 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                j9 = j10 + 1;
                                                w4 = (w10 ^ (z1.w(j10) << 56)) ^ 71499008037633920L;
                                                if (w4 < 0) {
                                                    long j11 = 1 + j9;
                                                    if (z1.w(j9) >= 0) {
                                                        j8 = j11;
                                                        this.f2958r = j8;
                                                        return w4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    w4 = w10 ^ j4;
                                    j8 = j10;
                                    this.f2958r = j8;
                                    return w4;
                                }
                                j5 = 266354560;
                                w4 = w9 ^ j5;
                            }
                        }
                        j8 = j9;
                        this.f2958r = j8;
                        return w4;
                    }
                    r02 = w6 ^ (-128);
                    w4 = r02;
                    this.f2958r = j8;
                    return w4;
                }
            }
            return Q();
        }

        long Q() {
            long j4 = 0;
            for (int r22 = 0; r22 < 64; r22 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << r22;
                if ((K() & 128) == 0) {
                    return j4;
                }
            }
            throw e0.f();
        }

        public void T() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void U(int r7) {
            if (r7 < 0 || r7 > ((this.f2952l - this.f2956p) - this.f2958r) + this.f2959s) {
                if (r7 >= 0) {
                    throw e0.m();
                }
                throw e0.g();
            }
            while (r7 > 0) {
                if (I() == 0) {
                    J();
                }
                int min = Math.min(r7, (int) I());
                r7 -= min;
                this.f2958r += min;
            }
        }

        @Override // com.google.protobuf.k
        public void a(int r22) {
            if (this.f2955o != r22) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.k
        public int d() {
            return (int) (((this.f2956p - this.f2957q) + this.f2958r) - this.f2959s);
        }

        @Override // com.google.protobuf.k
        public boolean e() {
            return (((long) this.f2956p) + this.f2958r) - this.f2959s == ((long) this.f2952l);
        }

        @Override // com.google.protobuf.k
        public void m(int r12) {
            this.f2954n = r12;
            R();
        }

        @Override // com.google.protobuf.k
        public int n(int r22) {
            if (r22 < 0) {
                throw e0.g();
            }
            int d5 = r22 + d();
            int r02 = this.f2954n;
            if (d5 > r02) {
                throw e0.m();
            }
            this.f2954n = d5;
            R();
            return r02;
        }

        @Override // com.google.protobuf.k
        public boolean o() {
            return P() != 0;
        }

        @Override // com.google.protobuf.k
        public j p() {
            int O = O();
            if (O > 0) {
                long j4 = O;
                long j5 = this.f2961u;
                long j6 = this.f2958r;
                if (j4 <= j5 - j6) {
                    if (this.f2950j && this.f2951k) {
                        int r12 = (int) (j6 - this.f2960t);
                        j T = j.T(W(r12, O + r12));
                        this.f2958r += j4;
                        return T;
                    }
                    byte[] bArr = new byte[O];
                    z1.p(j6, bArr, 0L, j4);
                    this.f2958r += j4;
                    return j.U(bArr);
                }
            }
            if (O <= 0 || O > S()) {
                if (O == 0) {
                    return j.f2914f;
                }
                if (O < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
            if (!this.f2950j || !this.f2951k) {
                byte[] bArr2 = new byte[O];
                L(bArr2, 0, O);
                return j.U(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (O > 0) {
                if (I() == 0) {
                    J();
                }
                int min = Math.min(O, (int) I());
                int r4 = (int) (this.f2958r - this.f2960t);
                arrayList.add(j.T(W(r4, r4 + min)));
                O -= min;
                this.f2958r += min;
            }
            return j.v(arrayList);
        }

        @Override // com.google.protobuf.k
        public double q() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.protobuf.k
        public int r() {
            return O();
        }

        @Override // com.google.protobuf.k
        public int s() {
            return M();
        }

        @Override // com.google.protobuf.k
        public long t() {
            return N();
        }

        @Override // com.google.protobuf.k
        public float u() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.protobuf.k
        public int v() {
            return O();
        }

        @Override // com.google.protobuf.k
        public long w() {
            return P();
        }

        @Override // com.google.protobuf.k
        public int x() {
            return M();
        }

        @Override // com.google.protobuf.k
        public long y() {
            return N();
        }

        @Override // com.google.protobuf.k
        public int z() {
            return k.b(O());
        }
    }

    private static final class d extends k {

        /* renamed from: g, reason: collision with root package name */
        private final InputStream f2962g;

        /* renamed from: h, reason: collision with root package name */
        private final byte[] f2963h;

        /* renamed from: i, reason: collision with root package name */
        private int f2964i;

        /* renamed from: j, reason: collision with root package name */
        private int f2965j;

        /* renamed from: k, reason: collision with root package name */
        private int f2966k;

        /* renamed from: l, reason: collision with root package name */
        private int f2967l;

        /* renamed from: m, reason: collision with root package name */
        private int f2968m;

        /* renamed from: n, reason: collision with root package name */
        private int f2969n;

        /* renamed from: o, reason: collision with root package name */
        private a f2970o;

        private interface a {
            void a();
        }

        private d(InputStream inputStream, int r4) {
            super();
            this.f2969n = Integer.MAX_VALUE;
            this.f2970o = null;
            d0.b(inputStream, "input");
            this.f2962g = inputStream;
            this.f2963h = new byte[r4];
            this.f2964i = 0;
            this.f2966k = 0;
            this.f2968m = 0;
        }

        private static int I(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (e0 e5) {
                e5.j();
                throw e5;
            }
        }

        private static int J(InputStream inputStream, byte[] bArr, int r22, int r32) {
            try {
                return inputStream.read(bArr, r22, r32);
            } catch (e0 e5) {
                e5.j();
                throw e5;
            }
        }

        private j K(int r6) {
            byte[] N = N(r6);
            if (N != null) {
                return j.w(N);
            }
            int r02 = this.f2966k;
            int r12 = this.f2964i;
            int r22 = r12 - r02;
            this.f2968m += r12;
            this.f2966k = 0;
            this.f2964i = 0;
            List<byte[]> O = O(r6 - r22);
            byte[] bArr = new byte[r6];
            System.arraycopy(this.f2963h, r02, bArr, 0, r22);
            for (byte[] bArr2 : O) {
                System.arraycopy(bArr2, 0, bArr, r22, bArr2.length);
                r22 += bArr2.length;
            }
            return j.U(bArr);
        }

        private byte[] M(int r5, boolean z4) {
            byte[] N = N(r5);
            if (N != null) {
                return z4 ? (byte[]) N.clone() : N;
            }
            int r6 = this.f2966k;
            int r02 = this.f2964i;
            int r12 = r02 - r6;
            this.f2968m += r02;
            this.f2966k = 0;
            this.f2964i = 0;
            List<byte[]> O = O(r5 - r12);
            byte[] bArr = new byte[r5];
            System.arraycopy(this.f2963h, r6, bArr, 0, r12);
            for (byte[] bArr2 : O) {
                System.arraycopy(bArr2, 0, bArr, r12, bArr2.length);
                r12 += bArr2.length;
            }
            return bArr;
        }

        private byte[] N(int r6) {
            if (r6 == 0) {
                return d0.f2849d;
            }
            if (r6 < 0) {
                throw e0.g();
            }
            int r02 = this.f2968m;
            int r12 = this.f2966k;
            int r22 = r02 + r12 + r6;
            if (r22 - this.f2935c > 0) {
                throw e0.l();
            }
            int r32 = this.f2969n;
            if (r22 > r32) {
                Y((r32 - r02) - r12);
                throw e0.m();
            }
            int r03 = this.f2964i - r12;
            int r13 = r6 - r03;
            if (r13 >= 4096 && r13 > I(this.f2962g)) {
                return null;
            }
            byte[] bArr = new byte[r6];
            System.arraycopy(this.f2963h, this.f2966k, bArr, 0, r03);
            this.f2968m += this.f2964i;
            this.f2966k = 0;
            this.f2964i = 0;
            while (r03 < r6) {
                int J = J(this.f2962g, bArr, r03, r6 - r03);
                if (J == -1) {
                    throw e0.m();
                }
                this.f2968m += J;
                r03 += J;
            }
            return bArr;
        }

        private List<byte[]> O(int r7) {
            ArrayList arrayList = new ArrayList();
            while (r7 > 0) {
                int min = Math.min(r7, 4096);
                byte[] bArr = new byte[min];
                int r32 = 0;
                while (r32 < min) {
                    int read = this.f2962g.read(bArr, r32, min - r32);
                    if (read == -1) {
                        throw e0.m();
                    }
                    this.f2968m += read;
                    r32 += read;
                }
                r7 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        private void U() {
            int r02 = this.f2964i + this.f2965j;
            this.f2964i = r02;
            int r12 = this.f2968m + r02;
            int r22 = this.f2969n;
            if (r12 <= r22) {
                this.f2965j = 0;
                return;
            }
            int r13 = r12 - r22;
            this.f2965j = r13;
            this.f2964i = r02 - r13;
        }

        private void V(int r32) {
            if (d0(r32)) {
                return;
            }
            if (r32 <= (this.f2935c - this.f2968m) - this.f2966k) {
                throw e0.m();
            }
            throw e0.l();
        }

        private static long W(InputStream inputStream, long j4) {
            try {
                return inputStream.skip(j4);
            } catch (e0 e5) {
                e5.j();
                throw e5;
            }
        }

        private void Z(int r9) {
            if (r9 < 0) {
                throw e0.g();
            }
            int r02 = this.f2968m;
            int r12 = this.f2966k;
            int r22 = r02 + r12 + r9;
            int r32 = this.f2969n;
            if (r22 > r32) {
                Y((r32 - r02) - r12);
                throw e0.m();
            }
            int r33 = 0;
            if (this.f2970o == null) {
                this.f2968m = r02 + r12;
                int r03 = this.f2964i - r12;
                this.f2964i = 0;
                this.f2966k = 0;
                r33 = r03;
                while (r33 < r9) {
                    try {
                        long j4 = r9 - r33;
                        long W = W(this.f2962g, j4);
                        if (W < 0 || W > j4) {
                            throw new IllegalStateException(this.f2962g.getClass() + "#skip returned invalid result: " + W + "\nThe InputStream implementation is buggy.");
                        }
                        if (W == 0) {
                            break;
                        } else {
                            r33 += (int) W;
                        }
                    } finally {
                        this.f2968m += r33;
                        U();
                    }
                }
            }
            if (r33 >= r9) {
                return;
            }
            int r04 = this.f2964i;
            int r13 = r04 - this.f2966k;
            this.f2966k = r04;
            while (true) {
                V(1);
                int r23 = r9 - r13;
                int r34 = this.f2964i;
                if (r23 <= r34) {
                    this.f2966k = r23;
                    return;
                } else {
                    r13 += r34;
                    this.f2966k = r34;
                }
            }
        }

        private void a0() {
            if (this.f2964i - this.f2966k >= 10) {
                b0();
            } else {
                c0();
            }
        }

        private void b0() {
            for (int r02 = 0; r02 < 10; r02++) {
                byte[] bArr = this.f2963h;
                int r22 = this.f2966k;
                this.f2966k = r22 + 1;
                if (bArr[r22] >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void c0() {
            for (int r02 = 0; r02 < 10; r02++) {
                if (L() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private boolean d0(int r8) {
            int r02 = this.f2966k;
            if (r02 + r8 <= this.f2964i) {
                throw new IllegalStateException("refillBuffer() called when " + r8 + " bytes were already available in buffer");
            }
            int r12 = this.f2935c;
            int r22 = this.f2968m;
            if (r8 > (r12 - r22) - r02 || r22 + r02 + r8 > this.f2969n) {
                return false;
            }
            a aVar = this.f2970o;
            if (aVar != null) {
                aVar.a();
            }
            int r03 = this.f2966k;
            if (r03 > 0) {
                int r13 = this.f2964i;
                if (r13 > r03) {
                    byte[] bArr = this.f2963h;
                    System.arraycopy(bArr, r03, bArr, 0, r13 - r03);
                }
                this.f2968m += r03;
                this.f2964i -= r03;
                this.f2966k = 0;
            }
            InputStream inputStream = this.f2962g;
            byte[] bArr2 = this.f2963h;
            int r23 = this.f2964i;
            int J = J(inputStream, bArr2, r23, Math.min(bArr2.length - r23, (this.f2935c - this.f2968m) - r23));
            if (J == 0 || J < -1 || J > this.f2963h.length) {
                throw new IllegalStateException(this.f2962g.getClass() + "#read(byte[]) returned invalid result: " + J + "\nThe InputStream implementation is buggy.");
            }
            if (J <= 0) {
                return false;
            }
            this.f2964i += J;
            U();
            if (this.f2964i >= r8) {
                return true;
            }
            return d0(r8);
        }

        @Override // com.google.protobuf.k
        public long A() {
            return k.c(S());
        }

        @Override // com.google.protobuf.k
        public String B() {
            int R = R();
            if (R > 0) {
                int r12 = this.f2964i;
                int r22 = this.f2966k;
                if (R <= r12 - r22) {
                    String str = new String(this.f2963h, r22, R, d0.f2847b);
                    this.f2966k += R;
                    return str;
                }
            }
            if (R == 0) {
                return "";
            }
            if (R > this.f2964i) {
                return new String(M(R, false), d0.f2847b);
            }
            V(R);
            String str2 = new String(this.f2963h, this.f2966k, R, d0.f2847b);
            this.f2966k += R;
            return str2;
        }

        @Override // com.google.protobuf.k
        public String C() {
            byte[] M;
            int R = R();
            int r12 = this.f2966k;
            int r22 = this.f2964i;
            if (R <= r22 - r12 && R > 0) {
                M = this.f2963h;
                this.f2966k = r12 + R;
            } else {
                if (R == 0) {
                    return "";
                }
                if (R <= r22) {
                    V(R);
                    M = this.f2963h;
                    this.f2966k = R + 0;
                } else {
                    M = M(R, false);
                }
                r12 = 0;
            }
            return a2.h(M, r12, R);
        }

        @Override // com.google.protobuf.k
        public int D() {
            if (e()) {
                this.f2967l = 0;
                return 0;
            }
            int R = R();
            this.f2967l = R;
            if (b2.a(R) != 0) {
                return this.f2967l;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.k
        public int E() {
            return R();
        }

        @Override // com.google.protobuf.k
        public long F() {
            return S();
        }

        @Override // com.google.protobuf.k
        public boolean H(int r5) {
            int b5 = b2.b(r5);
            if (b5 == 0) {
                a0();
                return true;
            }
            if (b5 == 1) {
                Y(8);
                return true;
            }
            if (b5 == 2) {
                Y(R());
                return true;
            }
            if (b5 == 3) {
                X();
                a(b2.c(b2.a(r5), 4));
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            Y(4);
            return true;
        }

        public byte L() {
            if (this.f2966k == this.f2964i) {
                V(1);
            }
            byte[] bArr = this.f2963h;
            int r12 = this.f2966k;
            this.f2966k = r12 + 1;
            return bArr[r12];
        }

        public int P() {
            int r02 = this.f2966k;
            if (this.f2964i - r02 < 4) {
                V(4);
                r02 = this.f2966k;
            }
            byte[] bArr = this.f2963h;
            this.f2966k = r02 + 4;
            return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
        }

        public long Q() {
            int r02 = this.f2966k;
            if (this.f2964i - r02 < 8) {
                V(8);
                r02 = this.f2966k;
            }
            byte[] bArr = this.f2963h;
            this.f2966k = r02 + 8;
            return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int R() {
            /*
                r5 = this;
                int r0 = r5.f2966k
                int r1 = r5.f2964i
                if (r1 != r0) goto L7
                goto L6a
            L7:
                byte[] r2 = r5.f2963h
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L12
                r5.f2966k = r3
                return r0
            L12:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L18
                goto L6a
            L18:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L24
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L70
            L24:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L31
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2f:
                r1 = r3
                goto L70
            L31:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L70
            L3f:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L70
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2f
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L70
            L6a:
                long r0 = r5.T()
                int r1 = (int) r0
                return r1
            L70:
                r5.f2966k = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.d.R():int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:39:0x00b4, code lost:
        
            if (r2[r0] < 0) goto L40;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long S() {
            /*
                Method dump skipped, instructions count: 192
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.d.S():long");
        }

        long T() {
            long j4 = 0;
            for (int r22 = 0; r22 < 64; r22 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << r22;
                if ((L() & 128) == 0) {
                    return j4;
                }
            }
            throw e0.f();
        }

        public void X() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void Y(int r32) {
            int r02 = this.f2964i;
            int r12 = this.f2966k;
            if (r32 > r02 - r12 || r32 < 0) {
                Z(r32);
            } else {
                this.f2966k = r12 + r32;
            }
        }

        @Override // com.google.protobuf.k
        public void a(int r22) {
            if (this.f2967l != r22) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.k
        public int d() {
            return this.f2968m + this.f2966k;
        }

        @Override // com.google.protobuf.k
        public boolean e() {
            return this.f2966k == this.f2964i && !d0(1);
        }

        @Override // com.google.protobuf.k
        public void m(int r12) {
            this.f2969n = r12;
            U();
        }

        @Override // com.google.protobuf.k
        public int n(int r32) {
            if (r32 < 0) {
                throw e0.g();
            }
            int r33 = r32 + this.f2968m + this.f2966k;
            int r02 = this.f2969n;
            if (r33 > r02) {
                throw e0.m();
            }
            this.f2969n = r33;
            U();
            return r02;
        }

        @Override // com.google.protobuf.k
        public boolean o() {
            return S() != 0;
        }

        @Override // com.google.protobuf.k
        public j p() {
            int R = R();
            int r12 = this.f2964i;
            int r22 = this.f2966k;
            if (R > r12 - r22 || R <= 0) {
                return R == 0 ? j.f2914f : K(R);
            }
            j x4 = j.x(this.f2963h, r22, R);
            this.f2966k += R;
            return x4;
        }

        @Override // com.google.protobuf.k
        public double q() {
            return Double.longBitsToDouble(Q());
        }

        @Override // com.google.protobuf.k
        public int r() {
            return R();
        }

        @Override // com.google.protobuf.k
        public int s() {
            return P();
        }

        @Override // com.google.protobuf.k
        public long t() {
            return Q();
        }

        @Override // com.google.protobuf.k
        public float u() {
            return Float.intBitsToFloat(P());
        }

        @Override // com.google.protobuf.k
        public int v() {
            return R();
        }

        @Override // com.google.protobuf.k
        public long w() {
            return S();
        }

        @Override // com.google.protobuf.k
        public int x() {
            return P();
        }

        @Override // com.google.protobuf.k
        public long y() {
            return Q();
        }

        @Override // com.google.protobuf.k
        public int z() {
            return k.b(R());
        }
    }

    private static final class e extends k {

        /* renamed from: g, reason: collision with root package name */
        private final ByteBuffer f2971g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f2972h;

        /* renamed from: i, reason: collision with root package name */
        private final long f2973i;

        /* renamed from: j, reason: collision with root package name */
        private long f2974j;

        /* renamed from: k, reason: collision with root package name */
        private long f2975k;

        /* renamed from: l, reason: collision with root package name */
        private long f2976l;

        /* renamed from: m, reason: collision with root package name */
        private int f2977m;

        /* renamed from: n, reason: collision with root package name */
        private int f2978n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f2979o;

        /* renamed from: p, reason: collision with root package name */
        private int f2980p;

        private e(ByteBuffer byteBuffer, boolean z4) {
            super();
            this.f2980p = Integer.MAX_VALUE;
            this.f2971g = byteBuffer;
            long k4 = z1.k(byteBuffer);
            this.f2973i = k4;
            this.f2974j = byteBuffer.limit() + k4;
            long position = k4 + byteBuffer.position();
            this.f2975k = position;
            this.f2976l = position;
            this.f2972h = z4;
        }

        private int I(long j4) {
            return (int) (j4 - this.f2973i);
        }

        static boolean J() {
            return z1.J();
        }

        private void Q() {
            long j4 = this.f2974j + this.f2977m;
            this.f2974j = j4;
            int r32 = (int) (j4 - this.f2976l);
            int r22 = this.f2980p;
            if (r32 <= r22) {
                this.f2977m = 0;
                return;
            }
            int r33 = r32 - r22;
            this.f2977m = r33;
            this.f2974j = j4 - r33;
        }

        private int R() {
            return (int) (this.f2974j - this.f2975k);
        }

        private void U() {
            if (R() >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int r02 = 0; r02 < 10; r02++) {
                long j4 = this.f2975k;
                this.f2975k = 1 + j4;
                if (z1.w(j4) >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void W() {
            for (int r02 = 0; r02 < 10; r02++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private ByteBuffer X(long j4, long j5) {
            int position = this.f2971g.position();
            int limit = this.f2971g.limit();
            ByteBuffer byteBuffer = this.f2971g;
            try {
                try {
                    byteBuffer.position(I(j4));
                    byteBuffer.limit(I(j5));
                    return this.f2971g.slice();
                } catch (IllegalArgumentException e5) {
                    e0 m4 = e0.m();
                    m4.initCause(e5);
                    throw m4;
                }
            } finally {
                byteBuffer.position(position);
                byteBuffer.limit(limit);
            }
        }

        @Override // com.google.protobuf.k
        public long A() {
            return k.c(O());
        }

        @Override // com.google.protobuf.k
        public String B() {
            int N = N();
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return "";
                }
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
            byte[] bArr = new byte[N];
            long j4 = N;
            z1.p(this.f2975k, bArr, 0L, j4);
            String str = new String(bArr, d0.f2847b);
            this.f2975k += j4;
            return str;
        }

        @Override // com.google.protobuf.k
        public String C() {
            int N = N();
            if (N > 0 && N <= R()) {
                String g5 = a2.g(this.f2971g, I(this.f2975k), N);
                this.f2975k += N;
                return g5;
            }
            if (N == 0) {
                return "";
            }
            if (N <= 0) {
                throw e0.g();
            }
            throw e0.m();
        }

        @Override // com.google.protobuf.k
        public int D() {
            if (e()) {
                this.f2978n = 0;
                return 0;
            }
            int N = N();
            this.f2978n = N;
            if (b2.a(N) != 0) {
                return this.f2978n;
            }
            throw e0.c();
        }

        @Override // com.google.protobuf.k
        public int E() {
            return N();
        }

        @Override // com.google.protobuf.k
        public long F() {
            return O();
        }

        @Override // com.google.protobuf.k
        public boolean H(int r5) {
            int b5 = b2.b(r5);
            if (b5 == 0) {
                U();
                return true;
            }
            if (b5 == 1) {
                T(8);
                return true;
            }
            if (b5 == 2) {
                T(N());
                return true;
            }
            if (b5 == 3) {
                S();
                a(b2.c(b2.a(r5), 4));
                return true;
            }
            if (b5 == 4) {
                return false;
            }
            if (b5 != 5) {
                throw e0.e();
            }
            T(4);
            return true;
        }

        public byte K() {
            long j4 = this.f2975k;
            if (j4 == this.f2974j) {
                throw e0.m();
            }
            this.f2975k = 1 + j4;
            return z1.w(j4);
        }

        public int L() {
            long j4 = this.f2975k;
            if (this.f2974j - j4 < 4) {
                throw e0.m();
            }
            this.f2975k = 4 + j4;
            return ((z1.w(j4 + 3) & 255) << 24) | (z1.w(j4) & 255) | ((z1.w(1 + j4) & 255) << 8) | ((z1.w(2 + j4) & 255) << 16);
        }

        public long M() {
            long j4 = this.f2975k;
            if (this.f2974j - j4 < 8) {
                throw e0.m();
            }
            this.f2975k = 8 + j4;
            return ((z1.w(j4 + 7) & 255) << 56) | (z1.w(j4) & 255) | ((z1.w(1 + j4) & 255) << 8) | ((z1.w(2 + j4) & 255) << 16) | ((z1.w(3 + j4) & 255) << 24) | ((z1.w(4 + j4) & 255) << 32) | ((z1.w(5 + j4) & 255) << 40) | ((z1.w(6 + j4) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
        
            if (com.google.protobuf.z1.w(r4) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int N() {
            /*
                r10 = this;
                long r0 = r10.f2975k
                long r2 = r10.f2974j
                int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r4 != 0) goto La
                goto L85
            La:
                r2 = 1
                long r4 = r0 + r2
                byte r0 = com.google.protobuf.z1.w(r0)
                if (r0 < 0) goto L17
                r10.f2975k = r4
                return r0
            L17:
                long r6 = r10.f2974j
                long r6 = r6 - r4
                r8 = 9
                int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r1 >= 0) goto L21
                goto L85
            L21:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 7
                r0 = r0 ^ r1
                if (r0 >= 0) goto L2f
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L8b
            L2f:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L3e
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L3c:
                r6 = r4
                goto L8b
            L3e:
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                int r1 = r1 << 21
                r0 = r0 ^ r1
                if (r0 >= 0) goto L4e
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L8b
            L4e:
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                int r6 = r1 << 28
                r0 = r0 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r6
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
                long r4 = r6 + r2
                byte r1 = com.google.protobuf.z1.w(r6)
                if (r1 >= 0) goto L3c
                long r6 = r4 + r2
                byte r1 = com.google.protobuf.z1.w(r4)
                if (r1 >= 0) goto L8b
            L85:
                long r0 = r10.P()
                int r1 = (int) r0
                return r1
            L8b:
                r10.f2975k = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.k.e.N():int");
        }

        public long O() {
            long w4;
            long j4;
            long j5;
            int r02;
            long j6 = this.f2975k;
            if (this.f2974j != j6) {
                long j7 = j6 + 1;
                byte w5 = z1.w(j6);
                if (w5 >= 0) {
                    this.f2975k = j7;
                    return w5;
                }
                if (this.f2974j - j7 >= 9) {
                    long j8 = j7 + 1;
                    int w6 = w5 ^ (z1.w(j7) << 7);
                    if (w6 >= 0) {
                        long j9 = j8 + 1;
                        int w7 = w6 ^ (z1.w(j8) << 14);
                        if (w7 >= 0) {
                            w4 = w7 ^ 16256;
                        } else {
                            j8 = j9 + 1;
                            int w8 = w7 ^ (z1.w(j9) << 21);
                            if (w8 < 0) {
                                r02 = w8 ^ (-2080896);
                            } else {
                                j9 = j8 + 1;
                                long w9 = w8 ^ (z1.w(j8) << 28);
                                if (w9 < 0) {
                                    long j10 = j9 + 1;
                                    long w10 = w9 ^ (z1.w(j9) << 35);
                                    if (w10 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        j9 = j10 + 1;
                                        w9 = w10 ^ (z1.w(j10) << 42);
                                        if (w9 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            j10 = j9 + 1;
                                            w10 = w9 ^ (z1.w(j9) << 49);
                                            if (w10 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                j9 = j10 + 1;
                                                w4 = (w10 ^ (z1.w(j10) << 56)) ^ 71499008037633920L;
                                                if (w4 < 0) {
                                                    long j11 = 1 + j9;
                                                    if (z1.w(j9) >= 0) {
                                                        j8 = j11;
                                                        this.f2975k = j8;
                                                        return w4;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    w4 = w10 ^ j4;
                                    j8 = j10;
                                    this.f2975k = j8;
                                    return w4;
                                }
                                j5 = 266354560;
                                w4 = w9 ^ j5;
                            }
                        }
                        j8 = j9;
                        this.f2975k = j8;
                        return w4;
                    }
                    r02 = w6 ^ (-128);
                    w4 = r02;
                    this.f2975k = j8;
                    return w4;
                }
            }
            return P();
        }

        long P() {
            long j4 = 0;
            for (int r22 = 0; r22 < 64; r22 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << r22;
                if ((K() & 128) == 0) {
                    return j4;
                }
            }
            throw e0.f();
        }

        public void S() {
            int D;
            do {
                D = D();
                if (D == 0) {
                    return;
                }
            } while (H(D));
        }

        public void T(int r5) {
            if (r5 >= 0 && r5 <= R()) {
                this.f2975k += r5;
            } else {
                if (r5 >= 0) {
                    throw e0.m();
                }
                throw e0.g();
            }
        }

        @Override // com.google.protobuf.k
        public void a(int r22) {
            if (this.f2978n != r22) {
                throw e0.b();
            }
        }

        @Override // com.google.protobuf.k
        public int d() {
            return (int) (this.f2975k - this.f2976l);
        }

        @Override // com.google.protobuf.k
        public boolean e() {
            return this.f2975k == this.f2974j;
        }

        @Override // com.google.protobuf.k
        public void m(int r12) {
            this.f2980p = r12;
            Q();
        }

        @Override // com.google.protobuf.k
        public int n(int r22) {
            if (r22 < 0) {
                throw e0.g();
            }
            int d5 = r22 + d();
            int r02 = this.f2980p;
            if (d5 > r02) {
                throw e0.m();
            }
            this.f2980p = d5;
            Q();
            return r02;
        }

        @Override // com.google.protobuf.k
        public boolean o() {
            return O() != 0;
        }

        @Override // com.google.protobuf.k
        public j p() {
            int N = N();
            if (N <= 0 || N > R()) {
                if (N == 0) {
                    return j.f2914f;
                }
                if (N < 0) {
                    throw e0.g();
                }
                throw e0.m();
            }
            if (this.f2972h && this.f2979o) {
                long j4 = this.f2975k;
                long j5 = N;
                ByteBuffer X = X(j4, j4 + j5);
                this.f2975k += j5;
                return j.T(X);
            }
            byte[] bArr = new byte[N];
            long j6 = N;
            z1.p(this.f2975k, bArr, 0L, j6);
            this.f2975k += j6;
            return j.U(bArr);
        }

        @Override // com.google.protobuf.k
        public double q() {
            return Double.longBitsToDouble(M());
        }

        @Override // com.google.protobuf.k
        public int r() {
            return N();
        }

        @Override // com.google.protobuf.k
        public int s() {
            return L();
        }

        @Override // com.google.protobuf.k
        public long t() {
            return M();
        }

        @Override // com.google.protobuf.k
        public float u() {
            return Float.intBitsToFloat(L());
        }

        @Override // com.google.protobuf.k
        public int v() {
            return N();
        }

        @Override // com.google.protobuf.k
        public long w() {
            return O();
        }

        @Override // com.google.protobuf.k
        public int x() {
            return L();
        }

        @Override // com.google.protobuf.k
        public long y() {
            return M();
        }

        @Override // com.google.protobuf.k
        public int z() {
            return k.b(N());
        }
    }

    private k() {
        this.f2934b = f2932f;
        this.f2935c = Integer.MAX_VALUE;
        this.f2937e = false;
    }

    public static int b(int r12) {
        return (-(r12 & 1)) ^ (r12 >>> 1);
    }

    public static long c(long j4) {
        return (-(j4 & 1)) ^ (j4 >>> 1);
    }

    public static k f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static k g(InputStream inputStream, int r32) {
        if (r32 > 0) {
            return inputStream == null ? j(d0.f2849d) : new d(inputStream, r32);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    static k h(Iterable<ByteBuffer> iterable, boolean z4) {
        int r12 = 0;
        int r22 = 0;
        for (ByteBuffer byteBuffer : iterable) {
            r22 += byteBuffer.remaining();
            r12 = byteBuffer.hasArray() ? r12 | 1 : byteBuffer.isDirect() ? r12 | 2 : r12 | 4;
        }
        return r12 == 2 ? new c(iterable, r22, z4) : f(new f0(iterable));
    }

    static k i(ByteBuffer byteBuffer, boolean z4) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z4);
        }
        if (byteBuffer.isDirect() && e.J()) {
            return new e(byteBuffer, z4);
        }
        int remaining = byteBuffer.remaining();
        byte[] bArr = new byte[remaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, remaining, true);
    }

    public static k j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static k k(byte[] bArr, int r22, int r32) {
        return l(bArr, r22, r32, false);
    }

    static k l(byte[] bArr, int r8, int r9, boolean z4) {
        b bVar = new b(bArr, r8, r9, z4);
        try {
            bVar.n(r9);
            return bVar;
        } catch (e0 e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    public abstract long A();

    public abstract String B();

    public abstract String C();

    public abstract int D();

    public abstract int E();

    public abstract long F();

    public final int G(int r4) {
        if (r4 >= 0) {
            int r02 = this.f2935c;
            this.f2935c = r4;
            return r02;
        }
        throw new IllegalArgumentException("Size limit cannot be negative: " + r4);
    }

    public abstract boolean H(int r12);

    public abstract void a(int r12);

    public abstract int d();

    public abstract boolean e();

    public abstract void m(int r12);

    public abstract int n(int r12);

    public abstract boolean o();

    public abstract j p();

    public abstract double q();

    public abstract int r();

    public abstract int s();

    public abstract long t();

    public abstract float u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract int z();
}
