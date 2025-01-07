package h4;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class i implements e {

    /* renamed from: e, reason: collision with root package name */
    public final c f3993e = new c();

    /* renamed from: f, reason: collision with root package name */
    public final n f3994f;

    /* renamed from: g, reason: collision with root package name */
    boolean f3995g;

    i(n nVar) {
        Objects.requireNonNull(nVar, "source == null");
        this.f3994f = nVar;
    }

    @Override // h4.e
    public void A(long j4) {
        if (this.f3995g) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            c cVar = this.f3993e;
            if (cVar.f3977f == 0 && this.f3994f.o(cVar, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j4, this.f3993e.i0());
            this.f3993e.A(min);
            j4 -= min;
        }
    }

    @Override // h4.e
    public short D() {
        Q(2L);
        return this.f3993e.D();
    }

    @Override // h4.e
    public int G() {
        Q(4L);
        return this.f3993e.G();
    }

    @Override // h4.e
    public void Q(long j4) {
        if (!a(j4)) {
            throw new EOFException();
        }
    }

    @Override // h4.e
    public c W() {
        return this.f3993e;
    }

    @Override // h4.e
    public boolean Y() {
        if (this.f3995g) {
            throw new IllegalStateException("closed");
        }
        return this.f3993e.Y() && this.f3994f.o(this.f3993e, 8192L) == -1;
    }

    public boolean a(long j4) {
        c cVar;
        if (j4 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }
        if (this.f3995g) {
            throw new IllegalStateException("closed");
        }
        do {
            cVar = this.f3993e;
            if (cVar.f3977f >= j4) {
                return true;
            }
        } while (this.f3994f.o(cVar, 8192L) != -1);
        return false;
    }

    @Override // h4.e
    public byte[] b0(long j4) {
        Q(j4);
        return this.f3993e.b0(j4);
    }

    @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3995g) {
            return;
        }
        this.f3995g = true;
        this.f3994f.close();
        this.f3993e.d();
    }

    @Override // h4.e
    public byte g0() {
        Q(1L);
        return this.f3993e.g0();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3995g;
    }

    @Override // h4.n
    public long o(c cVar, long j4) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j4 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j4);
        }
        if (this.f3995g) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f3993e;
        if (cVar2.f3977f == 0 && this.f3994f.o(cVar2, 8192L) == -1) {
            return -1L;
        }
        return this.f3993e.o(cVar, Math.min(j4, this.f3993e.f3977f));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        c cVar = this.f3993e;
        if (cVar.f3977f == 0 && this.f3994f.o(cVar, 8192L) == -1) {
            return -1;
        }
        return this.f3993e.read(byteBuffer);
    }

    public String toString() {
        return "buffer(" + this.f3994f + ")";
    }

    @Override // h4.e
    public f x(long j4) {
        Q(j4);
        return this.f3993e.x(j4);
    }
}
