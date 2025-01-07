package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;

/* loaded from: classes.dex */
abstract class i0 implements r {
    i0() {
    }

    @Override // io.grpc.internal.j2
    public void a(j2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.j2
    public void b() {
        e().b();
    }

    @Override // io.grpc.internal.r
    public void c(b3.u0 u0Var) {
        e().c(u0Var);
    }

    @Override // io.grpc.internal.r
    public void d(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
        e().d(f1Var, aVar, u0Var);
    }

    protected abstract r e();

    public String toString() {
        return q0.h.c(this).d("delegate", e()).toString();
    }
}
