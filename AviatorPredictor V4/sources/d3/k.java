package d3;

import io.grpc.internal.u1;
import java.io.EOFException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
class k extends io.grpc.internal.c {

    /* renamed from: e, reason: collision with root package name */
    private final h4.c f3378e;

    k(h4.c cVar) {
        this.f3378e = cVar;
    }

    private void d() {
    }

    @Override // io.grpc.internal.u1
    public u1 J(int r5) {
        h4.c cVar = new h4.c();
        cVar.w(this.f3378e, r5);
        return new k(cVar);
    }

    @Override // io.grpc.internal.u1
    public int N() {
        try {
            d();
            return this.f3378e.g0() & 255;
        } catch (EOFException e5) {
            throw new IndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // io.grpc.internal.u1
    public void T(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.u1
    public int b() {
        return (int) this.f3378e.i0();
    }

    @Override // io.grpc.internal.c, io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3378e.d();
    }

    @Override // io.grpc.internal.u1
    public void d0(byte[] bArr, int r4, int r5) {
        while (r5 > 0) {
            int s4 = this.f3378e.s(bArr, r4, r5);
            if (s4 == -1) {
                throw new IndexOutOfBoundsException("EOF trying to read " + r5 + " bytes");
            }
            r5 -= s4;
            r4 += s4;
        }
    }

    @Override // io.grpc.internal.u1
    public void m(int r4) {
        try {
            this.f3378e.A(r4);
        } catch (EOFException e5) {
            throw new IndexOutOfBoundsException(e5.getMessage());
        }
    }

    @Override // io.grpc.internal.u1
    public void u(OutputStream outputStream, int r5) {
        this.f3378e.t0(outputStream, r5);
    }
}
