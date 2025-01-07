package h4;

import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes.dex */
final class h implements d {

    /* renamed from: e, reason: collision with root package name */
    public final c f3990e = new c();

    /* renamed from: f, reason: collision with root package name */
    public final m f3991f;

    /* renamed from: g, reason: collision with root package name */
    boolean f3992g;

    h(m mVar) {
        Objects.requireNonNull(mVar, "sink == null");
        this.f3991f = mVar;
    }

    @Override // h4.d
    public d E(int r22) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.E(r22);
        return a();
    }

    @Override // h4.d
    public d I(int r22) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.I(r22);
        return a();
    }

    @Override // h4.d
    public d U(String str) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.U(str);
        return a();
    }

    @Override // h4.d
    public d Z(int r22) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.Z(r22);
        return a();
    }

    public d a() {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        long h5 = this.f3990e.h();
        if (h5 > 0) {
            this.f3991f.w(this.f3990e, h5);
        }
        return this;
    }

    @Override // h4.m, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3992g) {
            return;
        }
        Throwable th = null;
        try {
            c cVar = this.f3990e;
            long j4 = cVar.f3977f;
            if (j4 > 0) {
                this.f3991f.w(cVar, j4);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f3991f.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f3992g = true;
        if (th != null) {
            p.c(th);
        }
    }

    @Override // h4.d, h4.m, java.io.Flushable
    public void flush() {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f3990e;
        long j4 = cVar.f3977f;
        if (j4 > 0) {
            this.f3991f.w(cVar, j4);
        }
        this.f3991f.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f3992g;
    }

    @Override // h4.d
    public d j(byte[] bArr) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.j(bArr);
        return a();
    }

    public String toString() {
        return "buffer(" + this.f3991f + ")";
    }

    @Override // h4.m
    public void w(c cVar, long j4) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        this.f3990e.w(cVar, j4);
        a();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (this.f3992g) {
            throw new IllegalStateException("closed");
        }
        int write = this.f3990e.write(byteBuffer);
        a();
        return write;
    }
}
