package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.e0;
import com.google.protobuf.o0;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
abstract class g implements l1 {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2875a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f2875a = r02;
            try {
                r02[b2.b.f2809n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2875a[b2.b.f2813r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2875a[b2.b.f2802g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2875a[b2.b.f2815t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2875a[b2.b.f2808m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2875a[b2.b.f2807l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2875a[b2.b.f2803h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2875a[b2.b.f2806k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2875a[b2.b.f2804i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2875a[b2.b.f2812q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2875a[b2.b.f2816u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2875a[b2.b.f2817v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2875a[b2.b.f2818w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2875a[b2.b.f2819x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2875a[b2.b.f2810o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2875a[b2.b.f2814s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2875a[b2.b.f2805j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private static final class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f2876a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f2877b;

        /* renamed from: c, reason: collision with root package name */
        private int f2878c;

        /* renamed from: d, reason: collision with root package name */
        private final int f2879d;

        /* renamed from: e, reason: collision with root package name */
        private int f2880e;

        /* renamed from: f, reason: collision with root package name */
        private int f2881f;

        /* renamed from: g, reason: collision with root package name */
        private int f2882g;

        public b(ByteBuffer byteBuffer, boolean z4) {
            super(null);
            this.f2876a = z4;
            this.f2877b = byteBuffer.array();
            int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.f2878c = arrayOffset;
            this.f2879d = arrayOffset;
            this.f2880e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        private boolean T() {
            return this.f2878c == this.f2880e;
        }

        private byte U() {
            int r02 = this.f2878c;
            if (r02 == this.f2880e) {
                throw e0.m();
            }
            byte[] bArr = this.f2877b;
            this.f2878c = r02 + 1;
            return bArr[r02];
        }

        private Object V(b2.b bVar, Class<?> cls, r rVar) {
            switch (a.f2875a[bVar.ordinal()]) {
                case 1:
                    return Boolean.valueOf(L());
                case 2:
                    return e();
                case 3:
                    return Double.valueOf(o());
                case 4:
                    return Integer.valueOf(g());
                case 5:
                    return Integer.valueOf(H());
                case 6:
                    return Long.valueOf(n());
                case 7:
                    return Float.valueOf(u());
                case 8:
                    return Integer.valueOf(j());
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    return Long.valueOf(F());
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    return A(cls, rVar);
                case 11:
                    return Integer.valueOf(w());
                case 12:
                    return Long.valueOf(Q());
                case 13:
                    return Integer.valueOf(r());
                case 14:
                    return Long.valueOf(v());
                case 15:
                    return G();
                case 16:
                    return Integer.valueOf(i());
                case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    return Long.valueOf(l());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        private <T> T W(n1<T> n1Var, r rVar) {
            int r02 = this.f2882g;
            this.f2882g = b2.c(b2.a(this.f2881f), 4);
            try {
                T g5 = n1Var.g();
                n1Var.c(g5, this, rVar);
                n1Var.i(g5);
                if (this.f2881f == this.f2882g) {
                    return g5;
                }
                throw e0.h();
            } finally {
                this.f2882g = r02;
            }
        }

        private int X() {
            h0(4);
            return Y();
        }

        private int Y() {
            int r02 = this.f2878c;
            byte[] bArr = this.f2877b;
            this.f2878c = r02 + 4;
            return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
        }

        private long Z() {
            h0(8);
            return a0();
        }

        private long a0() {
            int r02 = this.f2878c;
            byte[] bArr = this.f2877b;
            this.f2878c = r02 + 8;
            return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
        }

        private <T> T b0(n1<T> n1Var, r rVar) {
            int e02 = e0();
            h0(e02);
            int r12 = this.f2880e;
            int r22 = this.f2878c + e02;
            this.f2880e = r22;
            try {
                T g5 = n1Var.g();
                n1Var.c(g5, this, rVar);
                n1Var.i(g5);
                if (this.f2878c == r22) {
                    return g5;
                }
                throw e0.h();
            } finally {
                this.f2880e = r12;
            }
        }

        private int e0() {
            int r02;
            int r03 = this.f2878c;
            int r12 = this.f2880e;
            if (r12 == r03) {
                throw e0.m();
            }
            byte[] bArr = this.f2877b;
            int r32 = r03 + 1;
            byte b5 = bArr[r03];
            if (b5 >= 0) {
                this.f2878c = r32;
                return b5;
            }
            if (r12 - r32 < 9) {
                return (int) g0();
            }
            int r13 = r32 + 1;
            int r04 = b5 ^ (bArr[r32] << 7);
            if (r04 < 0) {
                r02 = r04 ^ (-128);
            } else {
                int r33 = r13 + 1;
                int r05 = r04 ^ (bArr[r13] << 14);
                if (r05 >= 0) {
                    r02 = r05 ^ 16256;
                } else {
                    r13 = r33 + 1;
                    int r06 = r05 ^ (bArr[r33] << 21);
                    if (r06 < 0) {
                        r02 = r06 ^ (-2080896);
                    } else {
                        r33 = r13 + 1;
                        byte b6 = bArr[r13];
                        r02 = (r06 ^ (b6 << 28)) ^ 266354560;
                        if (b6 < 0) {
                            r13 = r33 + 1;
                            if (bArr[r33] < 0) {
                                r33 = r13 + 1;
                                if (bArr[r13] < 0) {
                                    r13 = r33 + 1;
                                    if (bArr[r33] < 0) {
                                        r33 = r13 + 1;
                                        if (bArr[r13] < 0) {
                                            r13 = r33 + 1;
                                            if (bArr[r33] < 0) {
                                                throw e0.f();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                r13 = r33;
            }
            this.f2878c = r13;
            return r02;
        }

        private long g0() {
            long j4 = 0;
            for (int r22 = 0; r22 < 64; r22 += 7) {
                j4 |= (r3 & Byte.MAX_VALUE) << r22;
                if ((U() & 128) == 0) {
                    return j4;
                }
            }
            throw e0.f();
        }

        private void h0(int r32) {
            if (r32 < 0 || r32 > this.f2880e - this.f2878c) {
                throw e0.m();
            }
        }

        private void i0(int r22) {
            if (this.f2878c != r22) {
                throw e0.m();
            }
        }

        private void j0(int r22) {
            if (b2.b(this.f2881f) != r22) {
                throw e0.e();
            }
        }

        private void k0(int r22) {
            h0(r22);
            this.f2878c += r22;
        }

        private void l0() {
            int r02 = this.f2882g;
            this.f2882g = b2.c(b2.a(this.f2881f), 4);
            while (O() != Integer.MAX_VALUE && q()) {
            }
            if (this.f2881f != this.f2882g) {
                throw e0.h();
            }
            this.f2882g = r02;
        }

        private void m0() {
            int r02 = this.f2880e;
            int r12 = this.f2878c;
            if (r02 - r12 >= 10) {
                byte[] bArr = this.f2877b;
                int r32 = 0;
                while (r32 < 10) {
                    int r4 = r12 + 1;
                    if (bArr[r12] >= 0) {
                        this.f2878c = r4;
                        return;
                    } else {
                        r32++;
                        r12 = r4;
                    }
                }
            }
            n0();
        }

        private void n0() {
            for (int r02 = 0; r02 < 10; r02++) {
                if (U() >= 0) {
                    return;
                }
            }
            throw e0.f();
        }

        private void o0(int r12) {
            h0(r12);
            if ((r12 & 3) != 0) {
                throw e0.h();
            }
        }

        private void p0(int r12) {
            h0(r12);
            if ((r12 & 7) != 0) {
                throw e0.h();
            }
        }

        @Override // com.google.protobuf.l1
        public <T> T A(Class<T> cls, r rVar) {
            j0(2);
            return (T) b0(i1.a().d(cls), rVar);
        }

        @Override // com.google.protobuf.l1
        public void B(List<Long> list) {
            int r02;
            int e02;
            int r5;
            if (list instanceof m0) {
                m0 m0Var = (m0) list;
                int b5 = b2.b(this.f2881f);
                if (b5 == 0) {
                    do {
                        m0Var.s(F());
                        if (T()) {
                            return;
                        } else {
                            r5 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r5;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    m0Var.s(f0());
                }
            } else {
                int b6 = b2.b(this.f2881f);
                if (b6 == 0) {
                    do {
                        list.add(Long.valueOf(F()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b6 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    list.add(Long.valueOf(f0()));
                }
            }
            i0(e02);
        }

        @Override // com.google.protobuf.l1
        public void C(List<Boolean> list) {
            int r02;
            int e02;
            int r5;
            if (list instanceof h) {
                h hVar = (h) list;
                int b5 = b2.b(this.f2881f);
                if (b5 == 0) {
                    do {
                        hVar.s(L());
                        if (T()) {
                            return;
                        } else {
                            r5 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r5;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    hVar.s(e0() != 0);
                }
            } else {
                int b6 = b2.b(this.f2881f);
                if (b6 == 0) {
                    do {
                        list.add(Boolean.valueOf(L()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b6 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    list.add(Boolean.valueOf(e0() != 0));
                }
            }
            i0(e02);
        }

        @Override // com.google.protobuf.l1
        public void D(List<Long> list) {
            int r02;
            int r5;
            if (!(list instanceof m0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 1) {
                    do {
                        list.add(Long.valueOf(Q()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                int e02 = e0();
                p0(e02);
                int r12 = this.f2878c + e02;
                while (this.f2878c < r12) {
                    list.add(Long.valueOf(a0()));
                }
                return;
            }
            m0 m0Var = (m0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 1) {
                do {
                    m0Var.s(Q());
                    if (T()) {
                        return;
                    } else {
                        r5 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r5;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            int e03 = e0();
            p0(e03);
            int r13 = this.f2878c + e03;
            while (this.f2878c < r13) {
                m0Var.s(a0());
            }
        }

        @Override // com.google.protobuf.l1
        public String E() {
            return c0(false);
        }

        @Override // com.google.protobuf.l1
        public long F() {
            j0(0);
            return f0();
        }

        @Override // com.google.protobuf.l1
        public String G() {
            return c0(true);
        }

        @Override // com.google.protobuf.l1
        public int H() {
            j0(5);
            return X();
        }

        @Override // com.google.protobuf.l1
        public void I(List<Long> list) {
            int r02;
            int r5;
            if (!(list instanceof m0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 1) {
                    do {
                        list.add(Long.valueOf(n()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                int e02 = e0();
                p0(e02);
                int r12 = this.f2878c + e02;
                while (this.f2878c < r12) {
                    list.add(Long.valueOf(a0()));
                }
                return;
            }
            m0 m0Var = (m0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 1) {
                do {
                    m0Var.s(n());
                    if (T()) {
                        return;
                    } else {
                        r5 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r5;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            int e03 = e0();
            p0(e03);
            int r13 = this.f2878c + e03;
            while (this.f2878c < r13) {
                m0Var.s(a0());
            }
        }

        @Override // com.google.protobuf.l1
        public void J(List<Integer> list) {
            int r02;
            int e02;
            int r4;
            if (list instanceof c0) {
                c0 c0Var = (c0) list;
                int b5 = b2.b(this.f2881f);
                if (b5 == 0) {
                    do {
                        c0Var.r(j());
                        if (T()) {
                            return;
                        } else {
                            r4 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r4;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    c0Var.r(e0());
                }
            } else {
                int b6 = b2.b(this.f2881f);
                if (b6 == 0) {
                    do {
                        list.add(Integer.valueOf(j()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b6 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    list.add(Integer.valueOf(e0()));
                }
            }
            i0(e02);
        }

        @Override // com.google.protobuf.l1
        public <T> T K(Class<T> cls, r rVar) {
            j0(3);
            return (T) W(i1.a().d(cls), rVar);
        }

        @Override // com.google.protobuf.l1
        public boolean L() {
            j0(0);
            return e0() != 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.l1
        public <T> void M(List<T> list, n1<T> n1Var, r rVar) {
            int r12;
            if (b2.b(this.f2881f) != 2) {
                throw e0.e();
            }
            int r02 = this.f2881f;
            do {
                list.add(b0(n1Var, rVar));
                if (T()) {
                    return;
                } else {
                    r12 = this.f2878c;
                }
            } while (e0() == r02);
            this.f2878c = r12;
        }

        @Override // com.google.protobuf.l1
        public void N(List<Integer> list) {
            int r02;
            int r4;
            if (!(list instanceof c0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw e0.e();
                    }
                    int e02 = this.f2878c + e0();
                    while (this.f2878c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(g()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw e0.e();
                }
                int e03 = this.f2878c + e0();
                while (this.f2878c < e03) {
                    c0Var.r(e0());
                }
                return;
            }
            do {
                c0Var.r(g());
                if (T()) {
                    return;
                } else {
                    r4 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r4;
        }

        @Override // com.google.protobuf.l1
        public int O() {
            if (T()) {
                return Integer.MAX_VALUE;
            }
            int e02 = e0();
            this.f2881f = e02;
            if (e02 == this.f2882g) {
                return Integer.MAX_VALUE;
            }
            return b2.a(e02);
        }

        @Override // com.google.protobuf.l1
        public void P(List<String> list) {
            d0(list, false);
        }

        @Override // com.google.protobuf.l1
        public long Q() {
            j0(1);
            return Z();
        }

        @Override // com.google.protobuf.l1
        public <T> T R(n1<T> n1Var, r rVar) {
            j0(2);
            return (T) b0(n1Var, rVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.l1
        public <K, V> void a(Map<K, V> map, o0.a<K, V> aVar, r rVar) {
            j0(2);
            int e02 = e0();
            h0(e02);
            int r22 = this.f2880e;
            this.f2880e = this.f2878c + e02;
            try {
                Object obj = aVar.f3033b;
                Object obj2 = aVar.f3035d;
                while (true) {
                    int O = O();
                    if (O == Integer.MAX_VALUE) {
                        map.put(obj, obj2);
                        return;
                    }
                    if (O == 1) {
                        obj = V(aVar.f3032a, null, null);
                    } else if (O != 2) {
                        try {
                            if (!q()) {
                                throw new e0("Unable to parse map entry.");
                            }
                        } catch (e0.a unused) {
                            if (!q()) {
                                throw new e0("Unable to parse map entry.");
                            }
                        }
                    } else {
                        obj2 = V(aVar.f3034c, aVar.f3035d.getClass(), rVar);
                    }
                }
            } finally {
                this.f2880e = r22;
            }
        }

        @Override // com.google.protobuf.l1
        public void b(List<Long> list) {
            int r02;
            int e02;
            int r5;
            if (list instanceof m0) {
                m0 m0Var = (m0) list;
                int b5 = b2.b(this.f2881f);
                if (b5 == 0) {
                    do {
                        m0Var.s(l());
                        if (T()) {
                            return;
                        } else {
                            r5 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r5;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    m0Var.s(f0());
                }
            } else {
                int b6 = b2.b(this.f2881f);
                if (b6 == 0) {
                    do {
                        list.add(Long.valueOf(l()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b6 != 2) {
                    throw e0.e();
                }
                e02 = this.f2878c + e0();
                while (this.f2878c < e02) {
                    list.add(Long.valueOf(f0()));
                }
            }
            i0(e02);
        }

        @Override // com.google.protobuf.l1
        public void c(List<String> list) {
            d0(list, true);
        }

        public String c0(boolean z4) {
            j0(2);
            int e02 = e0();
            if (e02 == 0) {
                return "";
            }
            h0(e02);
            if (z4) {
                byte[] bArr = this.f2877b;
                int r12 = this.f2878c;
                if (!a2.t(bArr, r12, r12 + e02)) {
                    throw e0.d();
                }
            }
            String str = new String(this.f2877b, this.f2878c, e02, d0.f2847b);
            this.f2878c += e02;
            return str;
        }

        @Override // com.google.protobuf.l1
        public <T> T d(n1<T> n1Var, r rVar) {
            j0(3);
            return (T) W(n1Var, rVar);
        }

        public void d0(List<String> list, boolean z4) {
            int r02;
            int r4;
            if (b2.b(this.f2881f) != 2) {
                throw e0.e();
            }
            if (!(list instanceof k0) || z4) {
                do {
                    list.add(c0(z4));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            k0 k0Var = (k0) list;
            do {
                k0Var.l(e());
                if (T()) {
                    return;
                } else {
                    r4 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r4;
        }

        @Override // com.google.protobuf.l1
        public j e() {
            j0(2);
            int e02 = e0();
            if (e02 == 0) {
                return j.f2914f;
            }
            h0(e02);
            j V = this.f2876a ? j.V(this.f2877b, this.f2878c, e02) : j.x(this.f2877b, this.f2878c, e02);
            this.f2878c += e02;
            return V;
        }

        @Override // com.google.protobuf.l1
        public void f(List<Integer> list) {
            int r02;
            int r4;
            if (!(list instanceof c0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw e0.e();
                    }
                    int e02 = this.f2878c + e0();
                    while (this.f2878c < e02) {
                        list.add(Integer.valueOf(k.b(e0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(r()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw e0.e();
                }
                int e03 = this.f2878c + e0();
                while (this.f2878c < e03) {
                    c0Var.r(k.b(e0()));
                }
                return;
            }
            do {
                c0Var.r(r());
                if (T()) {
                    return;
                } else {
                    r4 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r4;
        }

        public long f0() {
            long j4;
            long j5;
            long j6;
            int r02;
            int r03 = this.f2878c;
            int r12 = this.f2880e;
            if (r12 == r03) {
                throw e0.m();
            }
            byte[] bArr = this.f2877b;
            int r32 = r03 + 1;
            byte b5 = bArr[r03];
            if (b5 >= 0) {
                this.f2878c = r32;
                return b5;
            }
            if (r12 - r32 < 9) {
                return g0();
            }
            int r13 = r32 + 1;
            int r04 = b5 ^ (bArr[r32] << 7);
            if (r04 >= 0) {
                int r33 = r13 + 1;
                int r05 = r04 ^ (bArr[r13] << 14);
                if (r05 >= 0) {
                    r13 = r33;
                    j4 = r05 ^ 16256;
                } else {
                    r13 = r33 + 1;
                    int r06 = r05 ^ (bArr[r33] << 21);
                    if (r06 < 0) {
                        r02 = r06 ^ (-2080896);
                    } else {
                        long j7 = r06;
                        int r07 = r13 + 1;
                        long j8 = j7 ^ (bArr[r13] << 28);
                        if (j8 >= 0) {
                            j6 = 266354560;
                        } else {
                            r13 = r07 + 1;
                            long j9 = j8 ^ (bArr[r07] << 35);
                            if (j9 < 0) {
                                j5 = -34093383808L;
                            } else {
                                r07 = r13 + 1;
                                j8 = j9 ^ (bArr[r13] << 42);
                                if (j8 >= 0) {
                                    j6 = 4363953127296L;
                                } else {
                                    r13 = r07 + 1;
                                    j9 = j8 ^ (bArr[r07] << 49);
                                    if (j9 < 0) {
                                        j5 = -558586000294016L;
                                    } else {
                                        int r08 = r13 + 1;
                                        long j10 = (j9 ^ (bArr[r13] << 56)) ^ 71499008037633920L;
                                        if (j10 < 0) {
                                            r13 = r08 + 1;
                                            if (bArr[r08] < 0) {
                                                throw e0.f();
                                            }
                                        } else {
                                            r13 = r08;
                                        }
                                        j4 = j10;
                                    }
                                }
                            }
                            j4 = j9 ^ j5;
                        }
                        j4 = j8 ^ j6;
                        r13 = r07;
                    }
                }
                this.f2878c = r13;
                return j4;
            }
            r02 = r04 ^ (-128);
            j4 = r02;
            this.f2878c = r13;
            return j4;
        }

        @Override // com.google.protobuf.l1
        public int g() {
            j0(0);
            return e0();
        }

        @Override // com.google.protobuf.l1
        public void h(List<Float> list) {
            int r02;
            int r03;
            if (!(list instanceof y)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int r12 = this.f2878c + e02;
                    while (this.f2878c < r12) {
                        list.add(Float.valueOf(Float.intBitsToFloat(Y())));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw e0.e();
                }
                do {
                    list.add(Float.valueOf(u()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            y yVar = (y) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 2) {
                int e03 = e0();
                o0(e03);
                int r13 = this.f2878c + e03;
                while (this.f2878c < r13) {
                    yVar.r(Float.intBitsToFloat(Y()));
                }
                return;
            }
            if (b6 != 5) {
                throw e0.e();
            }
            do {
                yVar.r(u());
                if (T()) {
                    return;
                } else {
                    r03 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r03;
        }

        @Override // com.google.protobuf.l1
        public int i() {
            j0(0);
            return e0();
        }

        @Override // com.google.protobuf.l1
        public int j() {
            j0(0);
            return e0();
        }

        @Override // com.google.protobuf.l1
        public int k() {
            return this.f2881f;
        }

        @Override // com.google.protobuf.l1
        public long l() {
            j0(0);
            return f0();
        }

        @Override // com.google.protobuf.l1
        public void m(List<Integer> list) {
            int r02;
            int r03;
            if (!(list instanceof c0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int r12 = this.f2878c + e02;
                    while (this.f2878c < r12) {
                        list.add(Integer.valueOf(Y()));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw e0.e();
                }
                do {
                    list.add(Integer.valueOf(H()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 2) {
                int e03 = e0();
                o0(e03);
                int r13 = this.f2878c + e03;
                while (this.f2878c < r13) {
                    c0Var.r(Y());
                }
                return;
            }
            if (b6 != 5) {
                throw e0.e();
            }
            do {
                c0Var.r(H());
                if (T()) {
                    return;
                } else {
                    r03 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r03;
        }

        @Override // com.google.protobuf.l1
        public long n() {
            j0(1);
            return Z();
        }

        @Override // com.google.protobuf.l1
        public double o() {
            j0(1);
            return Double.longBitsToDouble(Z());
        }

        @Override // com.google.protobuf.l1
        public void p(List<Integer> list) {
            int r02;
            int r03;
            if (!(list instanceof c0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 2) {
                    int e02 = e0();
                    o0(e02);
                    int r12 = this.f2878c + e02;
                    while (this.f2878c < r12) {
                        list.add(Integer.valueOf(Y()));
                    }
                    return;
                }
                if (b5 != 5) {
                    throw e0.e();
                }
                do {
                    list.add(Integer.valueOf(w()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 2) {
                int e03 = e0();
                o0(e03);
                int r13 = this.f2878c + e03;
                while (this.f2878c < r13) {
                    c0Var.r(Y());
                }
                return;
            }
            if (b6 != 5) {
                throw e0.e();
            }
            do {
                c0Var.r(w());
                if (T()) {
                    return;
                } else {
                    r03 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r03;
        }

        @Override // com.google.protobuf.l1
        public boolean q() {
            int r02;
            int r03;
            if (T() || (r02 = this.f2881f) == this.f2882g) {
                return false;
            }
            int b5 = b2.b(r02);
            if (b5 == 0) {
                m0();
                return true;
            }
            if (b5 == 1) {
                r03 = 8;
            } else if (b5 == 2) {
                r03 = e0();
            } else {
                if (b5 == 3) {
                    l0();
                    return true;
                }
                if (b5 != 5) {
                    throw e0.e();
                }
                r03 = 4;
            }
            k0(r03);
            return true;
        }

        @Override // com.google.protobuf.l1
        public int r() {
            j0(0);
            return k.b(e0());
        }

        @Override // com.google.protobuf.l1
        public void s(List<Long> list) {
            int r02;
            int r5;
            if (!(list instanceof m0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw e0.e();
                    }
                    int e02 = this.f2878c + e0();
                    while (this.f2878c < e02) {
                        list.add(Long.valueOf(k.c(f0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(v()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            m0 m0Var = (m0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw e0.e();
                }
                int e03 = this.f2878c + e0();
                while (this.f2878c < e03) {
                    m0Var.s(k.c(f0()));
                }
                return;
            }
            do {
                m0Var.s(v());
                if (T()) {
                    return;
                } else {
                    r5 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r5;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.l1
        public <T> void t(List<T> list, n1<T> n1Var, r rVar) {
            int r12;
            if (b2.b(this.f2881f) != 3) {
                throw e0.e();
            }
            int r02 = this.f2881f;
            do {
                list.add(W(n1Var, rVar));
                if (T()) {
                    return;
                } else {
                    r12 = this.f2878c;
                }
            } while (e0() == r02);
            this.f2878c = r12;
        }

        @Override // com.google.protobuf.l1
        public float u() {
            j0(5);
            return Float.intBitsToFloat(X());
        }

        @Override // com.google.protobuf.l1
        public long v() {
            j0(0);
            return k.c(f0());
        }

        @Override // com.google.protobuf.l1
        public int w() {
            j0(5);
            return X();
        }

        @Override // com.google.protobuf.l1
        public void x(List<j> list) {
            int r02;
            if (b2.b(this.f2881f) != 2) {
                throw e0.e();
            }
            do {
                list.add(e());
                if (T()) {
                    return;
                } else {
                    r02 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r02;
        }

        @Override // com.google.protobuf.l1
        public void y(List<Integer> list) {
            int r02;
            int r4;
            if (!(list instanceof c0)) {
                int b5 = b2.b(this.f2881f);
                if (b5 != 0) {
                    if (b5 != 2) {
                        throw e0.e();
                    }
                    int e02 = this.f2878c + e0();
                    while (this.f2878c < e02) {
                        list.add(Integer.valueOf(e0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(i()));
                    if (T()) {
                        return;
                    } else {
                        r02 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r02;
                return;
            }
            c0 c0Var = (c0) list;
            int b6 = b2.b(this.f2881f);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw e0.e();
                }
                int e03 = this.f2878c + e0();
                while (this.f2878c < e03) {
                    c0Var.r(e0());
                }
                return;
            }
            do {
                c0Var.r(i());
                if (T()) {
                    return;
                } else {
                    r4 = this.f2878c;
                }
            } while (e0() == this.f2881f);
            this.f2878c = r4;
        }

        @Override // com.google.protobuf.l1
        public void z(List<Double> list) {
            int r02;
            int r5;
            if (!(list instanceof o)) {
                int b5 = b2.b(this.f2881f);
                if (b5 == 1) {
                    do {
                        list.add(Double.valueOf(o()));
                        if (T()) {
                            return;
                        } else {
                            r02 = this.f2878c;
                        }
                    } while (e0() == this.f2881f);
                    this.f2878c = r02;
                    return;
                }
                if (b5 != 2) {
                    throw e0.e();
                }
                int e02 = e0();
                p0(e02);
                int r12 = this.f2878c + e02;
                while (this.f2878c < r12) {
                    list.add(Double.valueOf(Double.longBitsToDouble(a0())));
                }
                return;
            }
            o oVar = (o) list;
            int b6 = b2.b(this.f2881f);
            if (b6 == 1) {
                do {
                    oVar.r(o());
                    if (T()) {
                        return;
                    } else {
                        r5 = this.f2878c;
                    }
                } while (e0() == this.f2881f);
                this.f2878c = r5;
                return;
            }
            if (b6 != 2) {
                throw e0.e();
            }
            int e03 = e0();
            p0(e03);
            int r13 = this.f2878c + e03;
            while (this.f2878c < r13) {
                oVar.r(Double.longBitsToDouble(a0()));
            }
        }
    }

    private g() {
    }

    /* synthetic */ g(a aVar) {
        this();
    }

    public static g S(ByteBuffer byteBuffer, boolean z4) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z4);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
