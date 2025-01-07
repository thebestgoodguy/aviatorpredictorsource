package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class n0 implements u1 {

    /* renamed from: e, reason: collision with root package name */
    private final u1 f5482e;

    protected n0(u1 u1Var) {
        this.f5482e = (u1) q0.l.o(u1Var, "buf");
    }

    @Override // io.grpc.internal.u1
    public u1 J(int r22) {
        return this.f5482e.J(r22);
    }

    @Override // io.grpc.internal.u1
    public int N() {
        return this.f5482e.N();
    }

    @Override // io.grpc.internal.u1
    public void T(ByteBuffer byteBuffer) {
        this.f5482e.T(byteBuffer);
    }

    @Override // io.grpc.internal.u1
    public int b() {
        return this.f5482e.b();
    }

    @Override // io.grpc.internal.u1
    public void d0(byte[] bArr, int r32, int r4) {
        this.f5482e.d0(bArr, r32, r4);
    }

    @Override // io.grpc.internal.u1
    public void m(int r22) {
        this.f5482e.m(r22);
    }

    @Override // io.grpc.internal.u1
    public boolean markSupported() {
        return this.f5482e.markSupported();
    }

    @Override // io.grpc.internal.u1
    public void reset() {
        this.f5482e.reset();
    }

    public String toString() {
        return q0.h.c(this).d("delegate", this.f5482e).toString();
    }

    @Override // io.grpc.internal.u1
    public void u(OutputStream outputStream, int r32) {
        this.f5482e.u(outputStream, r32);
    }

    @Override // io.grpc.internal.u1
    public void z() {
        this.f5482e.z();
    }
}
