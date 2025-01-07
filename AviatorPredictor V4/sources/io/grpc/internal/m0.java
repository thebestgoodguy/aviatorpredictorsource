package io.grpc.internal;

import b3.w0;

/* loaded from: classes.dex */
abstract class m0 extends b3.w0 {

    /* renamed from: a, reason: collision with root package name */
    private final b3.w0 f5467a;

    m0(b3.w0 w0Var) {
        q0.l.o(w0Var, "delegate can not be null");
        this.f5467a = w0Var;
    }

    @Override // b3.w0
    public void b() {
        this.f5467a.b();
    }

    @Override // b3.w0
    public void c() {
        this.f5467a.c();
    }

    @Override // b3.w0
    public void d(w0.e eVar) {
        this.f5467a.d(eVar);
    }

    @Override // b3.w0
    @Deprecated
    public void e(w0.f fVar) {
        this.f5467a.e(fVar);
    }

    public String toString() {
        return q0.h.c(this).d("delegate", this.f5467a).toString();
    }
}
