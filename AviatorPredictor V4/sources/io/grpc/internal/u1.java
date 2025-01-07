package io.grpc.internal;

import java.io.Closeable;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface u1 extends Closeable {
    u1 J(int r12);

    int N();

    void T(ByteBuffer byteBuffer);

    int b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void d0(byte[] bArr, int r22, int r32);

    void m(int r12);

    boolean markSupported();

    void reset();

    void u(OutputStream outputStream, int r22);

    void z();
}
