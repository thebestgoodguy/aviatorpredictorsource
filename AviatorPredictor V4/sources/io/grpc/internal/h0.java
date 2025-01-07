package io.grpc.internal;

import java.io.InputStream;

/* loaded from: classes.dex */
abstract class h0 implements q {
    h0() {
    }

    @Override // io.grpc.internal.q
    public void a(int r22) {
        o().a(r22);
    }

    @Override // io.grpc.internal.i2
    public void b(b3.n nVar) {
        o().b(nVar);
    }

    @Override // io.grpc.internal.q
    public void c(b3.f1 f1Var) {
        o().c(f1Var);
    }

    @Override // io.grpc.internal.i2
    public void d(int r22) {
        o().d(r22);
    }

    @Override // io.grpc.internal.q
    public void e(int r22) {
        o().e(r22);
    }

    @Override // io.grpc.internal.i2
    public boolean f() {
        return o().f();
    }

    @Override // io.grpc.internal.i2
    public void flush() {
        o().flush();
    }

    @Override // io.grpc.internal.q
    public void g(b3.t tVar) {
        o().g(tVar);
    }

    @Override // io.grpc.internal.i2
    public void h(InputStream inputStream) {
        o().h(inputStream);
    }

    @Override // io.grpc.internal.q
    public void i(r rVar) {
        o().i(rVar);
    }

    @Override // io.grpc.internal.q
    public void j(String str) {
        o().j(str);
    }

    @Override // io.grpc.internal.q
    public void k(b3.v vVar) {
        o().k(vVar);
    }

    @Override // io.grpc.internal.q
    public void l(w0 w0Var) {
        o().l(w0Var);
    }

    @Override // io.grpc.internal.i2
    public void m() {
        o().m();
    }

    @Override // io.grpc.internal.q
    public void n() {
        o().n();
    }

    protected abstract q o();

    @Override // io.grpc.internal.q
    public void q(boolean z4) {
        o().q(z4);
    }

    public String toString() {
        return q0.h.c(this).d("delegate", o()).toString();
    }
}
