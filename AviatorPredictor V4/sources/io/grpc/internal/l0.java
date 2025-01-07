package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
abstract class l0 extends b3.q0 {

    /* renamed from: a, reason: collision with root package name */
    private final b3.q0 f5441a;

    l0(b3.q0 q0Var) {
        this.f5441a = q0Var;
    }

    @Override // b3.d
    public String b() {
        return this.f5441a.b();
    }

    @Override // b3.d
    public <RequestT, ResponseT> b3.g<RequestT, ResponseT> h(b3.v0<RequestT, ResponseT> v0Var, b3.c cVar) {
        return this.f5441a.h(v0Var, cVar);
    }

    @Override // b3.q0
    public boolean i(long j4, TimeUnit timeUnit) {
        return this.f5441a.i(j4, timeUnit);
    }

    @Override // b3.q0
    public void j() {
        this.f5441a.j();
    }

    @Override // b3.q0
    public b3.p k(boolean z4) {
        return this.f5441a.k(z4);
    }

    @Override // b3.q0
    public void l(b3.p pVar, Runnable runnable) {
        this.f5441a.l(pVar, runnable);
    }

    @Override // b3.q0
    public b3.q0 m() {
        return this.f5441a.m();
    }

    @Override // b3.q0
    public b3.q0 n() {
        return this.f5441a.n();
    }

    public String toString() {
        return q0.h.c(this).d("delegate", this.f5441a).toString();
    }
}
