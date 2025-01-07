package io.grpc.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    private static final u1 f5691a = new c(new byte[0]);

    class a extends n0 {
        a(u1 u1Var) {
            super(u1Var);
        }

        @Override // io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    private static final class b extends InputStream implements b3.m0 {

        /* renamed from: e, reason: collision with root package name */
        private u1 f5692e;

        public b(u1 u1Var) {
            this.f5692e = (u1) q0.l.o(u1Var, "buffer");
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f5692e.b();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5692e.close();
        }

        @Override // java.io.InputStream
        public void mark(int r12) {
            this.f5692e.z();
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return this.f5692e.markSupported();
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f5692e.b() == 0) {
                return -1;
            }
            return this.f5692e.N();
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int r32, int r4) {
            if (this.f5692e.b() == 0) {
                return -1;
            }
            int min = Math.min(this.f5692e.b(), r4);
            this.f5692e.d0(bArr, r32, min);
            return min;
        }

        @Override // java.io.InputStream
        public void reset() {
            this.f5692e.reset();
        }

        @Override // java.io.InputStream
        public long skip(long j4) {
            int min = (int) Math.min(this.f5692e.b(), j4);
            this.f5692e.m(min);
            return min;
        }
    }

    private static class c extends io.grpc.internal.c {

        /* renamed from: e, reason: collision with root package name */
        int f5693e;

        /* renamed from: f, reason: collision with root package name */
        final int f5694f;

        /* renamed from: g, reason: collision with root package name */
        final byte[] f5695g;

        /* renamed from: h, reason: collision with root package name */
        int f5696h;

        c(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        c(byte[] bArr, int r6, int r7) {
            this.f5696h = -1;
            q0.l.e(r6 >= 0, "offset must be >= 0");
            q0.l.e(r7 >= 0, "length must be >= 0");
            int r72 = r7 + r6;
            q0.l.e(r72 <= bArr.length, "offset + length exceeds array boundary");
            this.f5695g = (byte[]) q0.l.o(bArr, "bytes");
            this.f5693e = r6;
            this.f5694f = r72;
        }

        @Override // io.grpc.internal.u1
        public int N() {
            a(1);
            byte[] bArr = this.f5695g;
            int r12 = this.f5693e;
            this.f5693e = r12 + 1;
            return bArr[r12] & 255;
        }

        @Override // io.grpc.internal.u1
        public void T(ByteBuffer byteBuffer) {
            q0.l.o(byteBuffer, "dest");
            int remaining = byteBuffer.remaining();
            a(remaining);
            byteBuffer.put(this.f5695g, this.f5693e, remaining);
            this.f5693e += remaining;
        }

        @Override // io.grpc.internal.u1
        public int b() {
            return this.f5694f - this.f5693e;
        }

        @Override // io.grpc.internal.u1
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public c J(int r4) {
            a(r4);
            int r02 = this.f5693e;
            this.f5693e = r02 + r4;
            return new c(this.f5695g, r02, r4);
        }

        @Override // io.grpc.internal.u1
        public void d0(byte[] bArr, int r4, int r5) {
            System.arraycopy(this.f5695g, this.f5693e, bArr, r4, r5);
            this.f5693e += r5;
        }

        @Override // io.grpc.internal.u1
        public void m(int r22) {
            a(r22);
            this.f5693e += r22;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public boolean markSupported() {
            return true;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void reset() {
            int r02 = this.f5696h;
            if (r02 == -1) {
                throw new InvalidMarkException();
            }
            this.f5693e = r02;
        }

        @Override // io.grpc.internal.u1
        public void u(OutputStream outputStream, int r4) {
            a(r4);
            outputStream.write(this.f5695g, this.f5693e, r4);
            this.f5693e += r4;
        }

        @Override // io.grpc.internal.c, io.grpc.internal.u1
        public void z() {
            this.f5696h = this.f5693e;
        }
    }

    public static u1 a() {
        return f5691a;
    }

    public static u1 b(u1 u1Var) {
        return new a(u1Var);
    }

    public static InputStream c(u1 u1Var, boolean z4) {
        if (!z4) {
            u1Var = b(u1Var);
        }
        return new b(u1Var);
    }

    public static byte[] d(u1 u1Var) {
        q0.l.o(u1Var, "buffer");
        int b5 = u1Var.b();
        byte[] bArr = new byte[b5];
        u1Var.d0(bArr, 0, b5);
        return bArr;
    }

    public static String e(u1 u1Var, Charset charset) {
        q0.l.o(charset, "charset");
        return new String(d(u1Var), charset);
    }

    public static u1 f(byte[] bArr, int r22, int r32) {
        return new c(bArr, r22, r32);
    }
}
