package com.google.protobuf;

import com.google.protobuf.a2;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class m extends i {

    /* renamed from: c, reason: collision with root package name */
    private static final Logger f2993c = Logger.getLogger(m.class.getName());

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f2994d = z1.I();

    /* renamed from: a, reason: collision with root package name */
    n f2995a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2996b;

    private static abstract class b extends m {

        /* renamed from: e, reason: collision with root package name */
        final byte[] f2997e;

        /* renamed from: f, reason: collision with root package name */
        final int f2998f;

        /* renamed from: g, reason: collision with root package name */
        int f2999g;

        /* renamed from: h, reason: collision with root package name */
        int f3000h;

        b(int r22) {
            super();
            if (r22 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(r22, 20)];
            this.f2997e = bArr;
            this.f2998f = bArr.length;
        }

        final void c1(byte b5) {
            byte[] bArr = this.f2997e;
            int r12 = this.f2999g;
            this.f2999g = r12 + 1;
            bArr[r12] = b5;
            this.f3000h++;
        }

        final void d1(int r5) {
            byte[] bArr = this.f2997e;
            int r12 = this.f2999g;
            int r22 = r12 + 1;
            this.f2999g = r22;
            bArr[r12] = (byte) (r5 & 255);
            int r13 = r22 + 1;
            this.f2999g = r13;
            bArr[r22] = (byte) ((r5 >> 8) & 255);
            int r23 = r13 + 1;
            this.f2999g = r23;
            bArr[r13] = (byte) ((r5 >> 16) & 255);
            this.f2999g = r23 + 1;
            bArr[r23] = (byte) ((r5 >> 24) & 255);
            this.f3000h += 4;
        }

        final void e1(long j4) {
            byte[] bArr = this.f2997e;
            int r12 = this.f2999g;
            int r22 = r12 + 1;
            this.f2999g = r22;
            bArr[r12] = (byte) (j4 & 255);
            int r13 = r22 + 1;
            this.f2999g = r13;
            bArr[r22] = (byte) ((j4 >> 8) & 255);
            int r23 = r13 + 1;
            this.f2999g = r23;
            bArr[r13] = (byte) ((j4 >> 16) & 255);
            int r14 = r23 + 1;
            this.f2999g = r14;
            bArr[r23] = (byte) (255 & (j4 >> 24));
            int r24 = r14 + 1;
            this.f2999g = r24;
            bArr[r14] = (byte) (((int) (j4 >> 32)) & 255);
            int r15 = r24 + 1;
            this.f2999g = r15;
            bArr[r24] = (byte) (((int) (j4 >> 40)) & 255);
            int r25 = r15 + 1;
            this.f2999g = r25;
            bArr[r15] = (byte) (((int) (j4 >> 48)) & 255);
            this.f2999g = r25 + 1;
            bArr[r25] = (byte) (((int) (j4 >> 56)) & 255);
            this.f3000h += 8;
        }

        final void f1(int r32) {
            if (r32 >= 0) {
                h1(r32);
            } else {
                i1(r32);
            }
        }

        final void g1(int r12, int r22) {
            h1(b2.c(r12, r22));
        }

        final void h1(int r7) {
            if (!m.f2994d) {
                while ((r7 & (-128)) != 0) {
                    byte[] bArr = this.f2997e;
                    int r12 = this.f2999g;
                    this.f2999g = r12 + 1;
                    bArr[r12] = (byte) ((r7 & 127) | 128);
                    this.f3000h++;
                    r7 >>>= 7;
                }
                byte[] bArr2 = this.f2997e;
                int r13 = this.f2999g;
                this.f2999g = r13 + 1;
                bArr2[r13] = (byte) r7;
                this.f3000h++;
                return;
            }
            long j4 = this.f2999g;
            while ((r7 & (-128)) != 0) {
                byte[] bArr3 = this.f2997e;
                int r32 = this.f2999g;
                this.f2999g = r32 + 1;
                z1.O(bArr3, r32, (byte) ((r7 & 127) | 128));
                r7 >>>= 7;
            }
            byte[] bArr4 = this.f2997e;
            int r33 = this.f2999g;
            this.f2999g = r33 + 1;
            z1.O(bArr4, r33, (byte) r7);
            this.f3000h += (int) (this.f2999g - j4);
        }

        final void i1(long j4) {
            if (!m.f2994d) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.f2997e;
                    int r6 = this.f2999g;
                    this.f2999g = r6 + 1;
                    bArr[r6] = (byte) ((((int) j4) & 127) | 128);
                    this.f3000h++;
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.f2997e;
                int r12 = this.f2999g;
                this.f2999g = r12 + 1;
                bArr2[r12] = (byte) j4;
                this.f3000h++;
                return;
            }
            long j5 = this.f2999g;
            while ((j4 & (-128)) != 0) {
                byte[] bArr3 = this.f2997e;
                int r8 = this.f2999g;
                this.f2999g = r8 + 1;
                z1.O(bArr3, r8, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr4 = this.f2997e;
            int r13 = this.f2999g;
            this.f2999g = r13 + 1;
            z1.O(bArr4, r13, (byte) j4);
            this.f3000h += (int) (this.f2999g - j5);
        }

        @Override // com.google.protobuf.m
        public final int j0() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }
    }

    private static class c extends m {

        /* renamed from: e, reason: collision with root package name */
        private final byte[] f3001e;

        /* renamed from: f, reason: collision with root package name */
        private final int f3002f;

        /* renamed from: g, reason: collision with root package name */
        private final int f3003g;

        /* renamed from: h, reason: collision with root package name */
        private int f3004h;

        c(byte[] bArr, int r5, int r6) {
            super();
            Objects.requireNonNull(bArr, "buffer");
            int r22 = r5 + r6;
            if ((r5 | r6 | (bArr.length - r22)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(r5), Integer.valueOf(r6)));
            }
            this.f3001e = bArr;
            this.f3002f = r5;
            this.f3004h = r5;
            this.f3003g = r22;
        }

        @Override // com.google.protobuf.m
        public final void F0(int r22, int r32) {
            X0(r22, 0);
            G0(r32);
        }

        @Override // com.google.protobuf.m
        public final void G0(int r32) {
            if (r32 >= 0) {
                Z0(r32);
            } else {
                b1(r32);
            }
        }

        @Override // com.google.protobuf.m
        final void J0(int r22, v0 v0Var, n1 n1Var) {
            X0(r22, 2);
            Z0(((com.google.protobuf.a) v0Var).n(n1Var));
            n1Var.h(v0Var, this.f2995a);
        }

        @Override // com.google.protobuf.m
        public final void K0(v0 v0Var) {
            Z0(v0Var.b());
            v0Var.l(this);
        }

        @Override // com.google.protobuf.m
        public final void L0(int r4, v0 v0Var) {
            X0(1, 3);
            Y0(2, r4);
            e1(3, v0Var);
            X0(1, 4);
        }

        @Override // com.google.protobuf.m
        public final void M0(int r4, j jVar) {
            X0(1, 3);
            Y0(2, r4);
            p0(3, jVar);
            X0(1, 4);
        }

        @Override // com.google.protobuf.m
        public final void V0(int r22, String str) {
            X0(r22, 2);
            W0(str);
        }

        @Override // com.google.protobuf.m
        public final void W0(String str) {
            int i4;
            int r02 = this.f3004h;
            try {
                int Y = m.Y(str.length() * 3);
                int Y2 = m.Y(str.length());
                if (Y2 == Y) {
                    int r12 = r02 + Y2;
                    this.f3004h = r12;
                    i4 = a2.i(str, this.f3001e, r12, j0());
                    this.f3004h = r02;
                    Z0((i4 - r02) - Y2);
                } else {
                    Z0(a2.j(str));
                    i4 = a2.i(str, this.f3001e, this.f3004h, j0());
                }
                this.f3004h = i4;
            } catch (a2.d e5) {
                this.f3004h = r02;
                e0(str, e5);
            } catch (IndexOutOfBoundsException e6) {
                throw new d(e6);
            }
        }

        @Override // com.google.protobuf.m
        public final void X0(int r12, int r22) {
            Z0(b2.c(r12, r22));
        }

        @Override // com.google.protobuf.m
        public final void Y0(int r22, int r32) {
            X0(r22, 0);
            Z0(r32);
        }

        @Override // com.google.protobuf.m
        public final void Z0(int r5) {
            if (!m.f2994d || com.google.protobuf.d.c() || j0() < 5) {
                while ((r5 & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f3001e;
                        int r12 = this.f3004h;
                        this.f3004h = r12 + 1;
                        bArr[r12] = (byte) ((r5 & 127) | 128);
                        r5 >>>= 7;
                    } catch (IndexOutOfBoundsException e5) {
                        throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), 1), e5);
                    }
                }
                byte[] bArr2 = this.f3001e;
                int r13 = this.f3004h;
                this.f3004h = r13 + 1;
                bArr2[r13] = (byte) r5;
                return;
            }
            if ((r5 & (-128)) == 0) {
                byte[] bArr3 = this.f3001e;
                int r14 = this.f3004h;
                this.f3004h = r14 + 1;
                z1.O(bArr3, r14, (byte) r5);
                return;
            }
            byte[] bArr4 = this.f3001e;
            int r15 = this.f3004h;
            this.f3004h = r15 + 1;
            z1.O(bArr4, r15, (byte) (r5 | 128));
            int r52 = r5 >>> 7;
            if ((r52 & (-128)) == 0) {
                byte[] bArr5 = this.f3001e;
                int r16 = this.f3004h;
                this.f3004h = r16 + 1;
                z1.O(bArr5, r16, (byte) r52);
                return;
            }
            byte[] bArr6 = this.f3001e;
            int r17 = this.f3004h;
            this.f3004h = r17 + 1;
            z1.O(bArr6, r17, (byte) (r52 | 128));
            int r53 = r52 >>> 7;
            if ((r53 & (-128)) == 0) {
                byte[] bArr7 = this.f3001e;
                int r18 = this.f3004h;
                this.f3004h = r18 + 1;
                z1.O(bArr7, r18, (byte) r53);
                return;
            }
            byte[] bArr8 = this.f3001e;
            int r19 = this.f3004h;
            this.f3004h = r19 + 1;
            z1.O(bArr8, r19, (byte) (r53 | 128));
            int r54 = r53 >>> 7;
            if ((r54 & (-128)) == 0) {
                byte[] bArr9 = this.f3001e;
                int r110 = this.f3004h;
                this.f3004h = r110 + 1;
                z1.O(bArr9, r110, (byte) r54);
                return;
            }
            byte[] bArr10 = this.f3001e;
            int r111 = this.f3004h;
            this.f3004h = r111 + 1;
            z1.O(bArr10, r111, (byte) (r54 | 128));
            byte[] bArr11 = this.f3001e;
            int r112 = this.f3004h;
            this.f3004h = r112 + 1;
            z1.O(bArr11, r112, (byte) (r54 >>> 7));
        }

        @Override // com.google.protobuf.i
        public final void a(ByteBuffer byteBuffer) {
            c1(byteBuffer);
        }

        @Override // com.google.protobuf.m
        public final void a1(int r22, long j4) {
            X0(r22, 0);
            b1(j4);
        }

        @Override // com.google.protobuf.m, com.google.protobuf.i
        public final void b(byte[] bArr, int r22, int r32) {
            d1(bArr, r22, r32);
        }

        @Override // com.google.protobuf.m
        public final void b1(long j4) {
            if (m.f2994d && j0() >= 10) {
                while ((j4 & (-128)) != 0) {
                    byte[] bArr = this.f3001e;
                    int r6 = this.f3004h;
                    this.f3004h = r6 + 1;
                    z1.O(bArr, r6, (byte) ((((int) j4) & 127) | 128));
                    j4 >>>= 7;
                }
                byte[] bArr2 = this.f3001e;
                int r12 = this.f3004h;
                this.f3004h = r12 + 1;
                z1.O(bArr2, r12, (byte) j4);
                return;
            }
            while ((j4 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f3001e;
                    int r62 = this.f3004h;
                    this.f3004h = r62 + 1;
                    bArr3[r62] = (byte) ((((int) j4) & 127) | 128);
                    j4 >>>= 7;
                } catch (IndexOutOfBoundsException e5) {
                    throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), 1), e5);
                }
            }
            byte[] bArr4 = this.f3001e;
            int r13 = this.f3004h;
            this.f3004h = r13 + 1;
            bArr4[r13] = (byte) j4;
        }

        public final void c1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            try {
                byteBuffer.get(this.f3001e, this.f3004h, remaining);
                this.f3004h += remaining;
            } catch (IndexOutOfBoundsException e5) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), Integer.valueOf(remaining)), e5);
            }
        }

        @Override // com.google.protobuf.m
        public void d0() {
        }

        public final void d1(byte[] bArr, int r5, int r6) {
            try {
                System.arraycopy(bArr, r5, this.f3001e, this.f3004h, r6);
                this.f3004h += r6;
            } catch (IndexOutOfBoundsException e5) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), Integer.valueOf(r6)), e5);
            }
        }

        public final void e1(int r22, v0 v0Var) {
            X0(r22, 2);
            K0(v0Var);
        }

        @Override // com.google.protobuf.m
        public final int j0() {
            return this.f3003g - this.f3004h;
        }

        @Override // com.google.protobuf.m
        public final void k0(byte b5) {
            try {
                byte[] bArr = this.f3001e;
                int r12 = this.f3004h;
                this.f3004h = r12 + 1;
                bArr[r12] = b5;
            } catch (IndexOutOfBoundsException e5) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), 1), e5);
            }
        }

        @Override // com.google.protobuf.m
        public final void l0(int r22, boolean z4) {
            X0(r22, 0);
            k0(z4 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.m
        public final void o0(byte[] bArr, int r22, int r32) {
            Z0(r32);
            d1(bArr, r22, r32);
        }

        @Override // com.google.protobuf.m
        public final void p0(int r22, j jVar) {
            X0(r22, 2);
            q0(jVar);
        }

        @Override // com.google.protobuf.m
        public final void q0(j jVar) {
            Z0(jVar.size());
            jVar.W(this);
        }

        @Override // com.google.protobuf.m
        public final void v0(int r22, int r32) {
            X0(r22, 5);
            w0(r32);
        }

        @Override // com.google.protobuf.m
        public final void w0(int r5) {
            try {
                byte[] bArr = this.f3001e;
                int r12 = this.f3004h;
                int r22 = r12 + 1;
                this.f3004h = r22;
                bArr[r12] = (byte) (r5 & 255);
                int r13 = r22 + 1;
                this.f3004h = r13;
                bArr[r22] = (byte) ((r5 >> 8) & 255);
                int r23 = r13 + 1;
                this.f3004h = r23;
                bArr[r13] = (byte) ((r5 >> 16) & 255);
                this.f3004h = r23 + 1;
                bArr[r23] = (byte) ((r5 >> 24) & 255);
            } catch (IndexOutOfBoundsException e5) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), 1), e5);
            }
        }

        @Override // com.google.protobuf.m
        public final void x0(int r22, long j4) {
            X0(r22, 1);
            y0(j4);
        }

        @Override // com.google.protobuf.m
        public final void y0(long j4) {
            try {
                byte[] bArr = this.f3001e;
                int r12 = this.f3004h;
                int r22 = r12 + 1;
                this.f3004h = r22;
                bArr[r12] = (byte) (((int) j4) & 255);
                int r13 = r22 + 1;
                this.f3004h = r13;
                bArr[r22] = (byte) (((int) (j4 >> 8)) & 255);
                int r23 = r13 + 1;
                this.f3004h = r23;
                bArr[r13] = (byte) (((int) (j4 >> 16)) & 255);
                int r14 = r23 + 1;
                this.f3004h = r14;
                bArr[r23] = (byte) (((int) (j4 >> 24)) & 255);
                int r24 = r14 + 1;
                this.f3004h = r24;
                bArr[r14] = (byte) (((int) (j4 >> 32)) & 255);
                int r15 = r24 + 1;
                this.f3004h = r15;
                bArr[r24] = (byte) (((int) (j4 >> 40)) & 255);
                int r25 = r15 + 1;
                this.f3004h = r25;
                bArr[r15] = (byte) (((int) (j4 >> 48)) & 255);
                this.f3004h = r25 + 1;
                bArr[r25] = (byte) (((int) (j4 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e5) {
                throw new d(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3004h), Integer.valueOf(this.f3003g), 1), e5);
            }
        }
    }

    public static class d extends IOException {
        d(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }

        d(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private static final class e extends b {

        /* renamed from: i, reason: collision with root package name */
        private final OutputStream f3005i;

        e(OutputStream outputStream, int r22) {
            super(r22);
            Objects.requireNonNull(outputStream, "out");
            this.f3005i = outputStream;
        }

        private void j1() {
            this.f3005i.write(this.f2997e, 0, this.f2999g);
            this.f2999g = 0;
        }

        private void k1(int r32) {
            if (this.f2998f - this.f2999g < r32) {
                j1();
            }
        }

        @Override // com.google.protobuf.m
        public void F0(int r22, int r32) {
            k1(20);
            g1(r22, 0);
            f1(r32);
        }

        @Override // com.google.protobuf.m
        public void G0(int r32) {
            if (r32 >= 0) {
                Z0(r32);
            } else {
                b1(r32);
            }
        }

        @Override // com.google.protobuf.m
        void J0(int r22, v0 v0Var, n1 n1Var) {
            X0(r22, 2);
            o1(v0Var, n1Var);
        }

        @Override // com.google.protobuf.m
        public void K0(v0 v0Var) {
            Z0(v0Var.b());
            v0Var.l(this);
        }

        @Override // com.google.protobuf.m
        public void L0(int r4, v0 v0Var) {
            X0(1, 3);
            Y0(2, r4);
            n1(3, v0Var);
            X0(1, 4);
        }

        @Override // com.google.protobuf.m
        public void M0(int r4, j jVar) {
            X0(1, 3);
            Y0(2, r4);
            p0(3, jVar);
            X0(1, 4);
        }

        @Override // com.google.protobuf.m
        public void V0(int r22, String str) {
            X0(r22, 2);
            W0(str);
        }

        @Override // com.google.protobuf.m
        public void W0(String str) {
            int j4;
            try {
                int length = str.length() * 3;
                int Y = m.Y(length);
                int r22 = Y + length;
                int r32 = this.f2998f;
                if (r22 > r32) {
                    byte[] bArr = new byte[length];
                    int i4 = a2.i(str, bArr, 0, length);
                    Z0(i4);
                    b(bArr, 0, i4);
                    return;
                }
                if (r22 > r32 - this.f2999g) {
                    j1();
                }
                int Y2 = m.Y(str.length());
                int r23 = this.f2999g;
                try {
                    if (Y2 == Y) {
                        int r12 = r23 + Y2;
                        this.f2999g = r12;
                        int i5 = a2.i(str, this.f2997e, r12, this.f2998f - r12);
                        this.f2999g = r23;
                        j4 = (i5 - r23) - Y2;
                        h1(j4);
                        this.f2999g = i5;
                    } else {
                        j4 = a2.j(str);
                        h1(j4);
                        this.f2999g = a2.i(str, this.f2997e, this.f2999g, j4);
                    }
                    this.f3000h += j4;
                } catch (a2.d e5) {
                    this.f3000h -= this.f2999g - r23;
                    this.f2999g = r23;
                    throw e5;
                } catch (ArrayIndexOutOfBoundsException e6) {
                    throw new d(e6);
                }
            } catch (a2.d e7) {
                e0(str, e7);
            }
        }

        @Override // com.google.protobuf.m
        public void X0(int r12, int r22) {
            Z0(b2.c(r12, r22));
        }

        @Override // com.google.protobuf.m
        public void Y0(int r22, int r32) {
            k1(20);
            g1(r22, 0);
            h1(r32);
        }

        @Override // com.google.protobuf.m
        public void Z0(int r22) {
            k1(5);
            h1(r22);
        }

        @Override // com.google.protobuf.i
        public void a(ByteBuffer byteBuffer) {
            l1(byteBuffer);
        }

        @Override // com.google.protobuf.m
        public void a1(int r22, long j4) {
            k1(20);
            g1(r22, 0);
            i1(j4);
        }

        @Override // com.google.protobuf.m, com.google.protobuf.i
        public void b(byte[] bArr, int r22, int r32) {
            m1(bArr, r22, r32);
        }

        @Override // com.google.protobuf.m
        public void b1(long j4) {
            k1(10);
            i1(j4);
        }

        @Override // com.google.protobuf.m
        public void d0() {
            if (this.f2999g > 0) {
                j1();
            }
        }

        @Override // com.google.protobuf.m
        public void k0(byte b5) {
            if (this.f2999g == this.f2998f) {
                j1();
            }
            c1(b5);
        }

        @Override // com.google.protobuf.m
        public void l0(int r22, boolean z4) {
            k1(11);
            g1(r22, 0);
            c1(z4 ? (byte) 1 : (byte) 0);
        }

        public void l1(ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            int r12 = this.f2998f;
            int r22 = this.f2999g;
            if (r12 - r22 >= remaining) {
                byteBuffer.get(this.f2997e, r22, remaining);
                this.f2999g += remaining;
            } else {
                int r13 = r12 - r22;
                byteBuffer.get(this.f2997e, r22, r13);
                remaining -= r13;
                this.f2999g = this.f2998f;
                this.f3000h += r13;
                j1();
                while (true) {
                    int r14 = this.f2998f;
                    if (remaining <= r14) {
                        break;
                    }
                    byteBuffer.get(this.f2997e, 0, r14);
                    this.f3005i.write(this.f2997e, 0, this.f2998f);
                    int r15 = this.f2998f;
                    remaining -= r15;
                    this.f3000h += r15;
                }
                byteBuffer.get(this.f2997e, 0, remaining);
                this.f2999g = remaining;
            }
            this.f3000h += remaining;
        }

        public void m1(byte[] bArr, int r5, int r6) {
            int r02 = this.f2998f;
            int r12 = this.f2999g;
            if (r02 - r12 >= r6) {
                System.arraycopy(bArr, r5, this.f2997e, r12, r6);
                this.f2999g += r6;
            } else {
                int r03 = r02 - r12;
                System.arraycopy(bArr, r5, this.f2997e, r12, r03);
                int r52 = r5 + r03;
                r6 -= r03;
                this.f2999g = this.f2998f;
                this.f3000h += r03;
                j1();
                if (r6 <= this.f2998f) {
                    System.arraycopy(bArr, r52, this.f2997e, 0, r6);
                    this.f2999g = r6;
                } else {
                    this.f3005i.write(bArr, r52, r6);
                }
            }
            this.f3000h += r6;
        }

        public void n1(int r22, v0 v0Var) {
            X0(r22, 2);
            K0(v0Var);
        }

        @Override // com.google.protobuf.m
        public void o0(byte[] bArr, int r22, int r32) {
            Z0(r32);
            m1(bArr, r22, r32);
        }

        void o1(v0 v0Var, n1 n1Var) {
            Z0(((com.google.protobuf.a) v0Var).n(n1Var));
            n1Var.h(v0Var, this.f2995a);
        }

        @Override // com.google.protobuf.m
        public void p0(int r22, j jVar) {
            X0(r22, 2);
            q0(jVar);
        }

        @Override // com.google.protobuf.m
        public void q0(j jVar) {
            Z0(jVar.size());
            jVar.W(this);
        }

        @Override // com.google.protobuf.m
        public void v0(int r22, int r32) {
            k1(14);
            g1(r22, 5);
            d1(r32);
        }

        @Override // com.google.protobuf.m
        public void w0(int r22) {
            k1(4);
            d1(r22);
        }

        @Override // com.google.protobuf.m
        public void x0(int r22, long j4) {
            k1(18);
            g1(r22, 1);
            e1(j4);
        }

        @Override // com.google.protobuf.m
        public void y0(long j4) {
            k1(8);
            e1(j4);
        }
    }

    private m() {
    }

    public static int A(int r22, i0 i0Var) {
        return (W(1) * 2) + X(2, r22) + B(3, i0Var);
    }

    public static int B(int r02, i0 i0Var) {
        return W(r02) + C(i0Var);
    }

    public static int C(i0 i0Var) {
        return D(i0Var.b());
    }

    static int D(int r12) {
        return Y(r12) + r12;
    }

    public static int E(int r22, v0 v0Var) {
        return (W(1) * 2) + X(2, r22) + F(3, v0Var);
    }

    public static int F(int r02, v0 v0Var) {
        return W(r02) + H(v0Var);
    }

    static int G(int r02, v0 v0Var, n1 n1Var) {
        return W(r02) + I(v0Var, n1Var);
    }

    public static int H(v0 v0Var) {
        return D(v0Var.b());
    }

    static int I(v0 v0Var, n1 n1Var) {
        return D(((com.google.protobuf.a) v0Var).n(n1Var));
    }

    static int J(int r12) {
        if (r12 > 4096) {
            return 4096;
        }
        return r12;
    }

    public static int K(int r22, j jVar) {
        return (W(1) * 2) + X(2, r22) + h(3, jVar);
    }

    @Deprecated
    public static int L(int r02) {
        return Y(r02);
    }

    public static int M(int r02, int r12) {
        return W(r02) + N(r12);
    }

    public static int N(int r02) {
        return 4;
    }

    public static int O(int r02, long j4) {
        return W(r02) + P(j4);
    }

    public static int P(long j4) {
        return 8;
    }

    public static int Q(int r02, int r12) {
        return W(r02) + R(r12);
    }

    public static int R(int r02) {
        return Y(b0(r02));
    }

    public static int S(int r02, long j4) {
        return W(r02) + T(j4);
    }

    public static int T(long j4) {
        return a0(c0(j4));
    }

    public static int U(int r02, String str) {
        return W(r02) + V(str);
    }

    public static int V(String str) {
        int length;
        try {
            length = a2.j(str);
        } catch (a2.d unused) {
            length = str.getBytes(d0.f2847b).length;
        }
        return D(length);
    }

    public static int W(int r12) {
        return Y(b2.c(r12, 0));
    }

    public static int X(int r02, int r12) {
        return W(r02) + Y(r12);
    }

    public static int Y(int r12) {
        if ((r12 & (-128)) == 0) {
            return 1;
        }
        if ((r12 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & r12) == 0) {
            return 3;
        }
        return (r12 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int Z(int r02, long j4) {
        return W(r02) + a0(j4);
    }

    public static int a0(long j4) {
        int r02;
        if (((-128) & j4) == 0) {
            return 1;
        }
        if (j4 < 0) {
            return 10;
        }
        if (((-34359738368L) & j4) != 0) {
            r02 = 6;
            j4 >>>= 28;
        } else {
            r02 = 2;
        }
        if (((-2097152) & j4) != 0) {
            r02 += 2;
            j4 >>>= 14;
        }
        return (j4 & (-16384)) != 0 ? r02 + 1 : r02;
    }

    public static int b0(int r12) {
        return (r12 >> 31) ^ (r12 << 1);
    }

    public static long c0(long j4) {
        return (j4 >> 63) ^ (j4 << 1);
    }

    public static int e(int r02, boolean z4) {
        return W(r02) + f(z4);
    }

    public static int f(boolean z4) {
        return 1;
    }

    public static int g(byte[] bArr) {
        return D(bArr.length);
    }

    public static m g0(OutputStream outputStream, int r22) {
        return new e(outputStream, r22);
    }

    public static int h(int r02, j jVar) {
        return W(r02) + i(jVar);
    }

    public static m h0(byte[] bArr) {
        return i0(bArr, 0, bArr.length);
    }

    public static int i(j jVar) {
        return D(jVar.size());
    }

    public static m i0(byte[] bArr, int r22, int r32) {
        return new c(bArr, r22, r32);
    }

    public static int j(int r02, double d5) {
        return W(r02) + k(d5);
    }

    public static int k(double d5) {
        return 8;
    }

    public static int l(int r02, int r12) {
        return W(r02) + m(r12);
    }

    public static int m(int r02) {
        return x(r02);
    }

    public static int n(int r02, int r12) {
        return W(r02) + o(r12);
    }

    public static int o(int r02) {
        return 4;
    }

    public static int p(int r02, long j4) {
        return W(r02) + q(j4);
    }

    public static int q(long j4) {
        return 8;
    }

    public static int r(int r02, float f5) {
        return W(r02) + s(f5);
    }

    public static int s(float f5) {
        return 4;
    }

    @Deprecated
    static int t(int r02, v0 v0Var, n1 n1Var) {
        return (W(r02) * 2) + v(v0Var, n1Var);
    }

    @Deprecated
    public static int u(v0 v0Var) {
        return v0Var.b();
    }

    @Deprecated
    static int v(v0 v0Var, n1 n1Var) {
        return ((com.google.protobuf.a) v0Var).n(n1Var);
    }

    public static int w(int r02, int r12) {
        return W(r02) + x(r12);
    }

    public static int x(int r02) {
        if (r02 >= 0) {
            return Y(r02);
        }
        return 10;
    }

    public static int y(int r02, long j4) {
        return W(r02) + z(j4);
    }

    public static int z(long j4) {
        return a0(j4);
    }

    public final void A0(float f5) {
        w0(Float.floatToRawIntBits(f5));
    }

    @Deprecated
    public final void B0(int r22, v0 v0Var) {
        X0(r22, 3);
        D0(v0Var);
        X0(r22, 4);
    }

    @Deprecated
    final void C0(int r22, v0 v0Var, n1 n1Var) {
        X0(r22, 3);
        E0(v0Var, n1Var);
        X0(r22, 4);
    }

    @Deprecated
    public final void D0(v0 v0Var) {
        v0Var.l(this);
    }

    @Deprecated
    final void E0(v0 v0Var, n1 n1Var) {
        n1Var.h(v0Var, this.f2995a);
    }

    public abstract void F0(int r12, int r22);

    public abstract void G0(int r12);

    public final void H0(int r12, long j4) {
        a1(r12, j4);
    }

    public final void I0(long j4) {
        b1(j4);
    }

    abstract void J0(int r12, v0 v0Var, n1 n1Var);

    public abstract void K0(v0 v0Var);

    public abstract void L0(int r12, v0 v0Var);

    public abstract void M0(int r12, j jVar);

    public final void N0(int r12, int r22) {
        v0(r12, r22);
    }

    public final void O0(int r12) {
        w0(r12);
    }

    public final void P0(int r12, long j4) {
        x0(r12, j4);
    }

    public final void Q0(long j4) {
        y0(j4);
    }

    public final void R0(int r12, int r22) {
        Y0(r12, b0(r22));
    }

    public final void S0(int r12) {
        Z0(b0(r12));
    }

    public final void T0(int r12, long j4) {
        a1(r12, c0(j4));
    }

    public final void U0(long j4) {
        b1(c0(j4));
    }

    public abstract void V0(int r12, String str);

    public abstract void W0(String str);

    public abstract void X0(int r12, int r22);

    public abstract void Y0(int r12, int r22);

    public abstract void Z0(int r12);

    public abstract void a1(int r12, long j4);

    @Override // com.google.protobuf.i
    public abstract void b(byte[] bArr, int r22, int r32);

    public abstract void b1(long j4);

    public final void d() {
        if (j0() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void d0();

    final void e0(String str, a2.d dVar) {
        f2993c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(d0.f2847b);
        try {
            Z0(bytes.length);
            b(bytes, 0, bytes.length);
        } catch (d e5) {
            throw e5;
        } catch (IndexOutOfBoundsException e6) {
            throw new d(e6);
        }
    }

    boolean f0() {
        return this.f2996b;
    }

    public abstract int j0();

    public abstract void k0(byte b5);

    public abstract void l0(int r12, boolean z4);

    public final void m0(boolean z4) {
        k0(z4 ? (byte) 1 : (byte) 0);
    }

    public final void n0(byte[] bArr) {
        o0(bArr, 0, bArr.length);
    }

    abstract void o0(byte[] bArr, int r22, int r32);

    public abstract void p0(int r12, j jVar);

    public abstract void q0(j jVar);

    public final void r0(int r12, double d5) {
        x0(r12, Double.doubleToRawLongBits(d5));
    }

    public final void s0(double d5) {
        y0(Double.doubleToRawLongBits(d5));
    }

    public final void t0(int r12, int r22) {
        F0(r12, r22);
    }

    public final void u0(int r12) {
        G0(r12);
    }

    public abstract void v0(int r12, int r22);

    public abstract void w0(int r12);

    public abstract void x0(int r12, long j4);

    public abstract void y0(long j4);

    public final void z0(int r12, float f5) {
        v0(r12, Float.floatToRawIntBits(f5));
    }
}
