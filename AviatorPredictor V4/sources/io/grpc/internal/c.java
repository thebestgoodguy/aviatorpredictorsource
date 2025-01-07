package io.grpc.internal;

/* loaded from: classes.dex */
public abstract class c implements u1 {
    public final int G() {
        a(4);
        return (N() << 24) | (N() << 16) | (N() << 8) | N();
    }

    protected final void a(int r22) {
        if (b() < r22) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // io.grpc.internal.u1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // io.grpc.internal.u1
    public boolean markSupported() {
        return false;
    }

    @Override // io.grpc.internal.u1
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // io.grpc.internal.u1
    public void z() {
    }
}
