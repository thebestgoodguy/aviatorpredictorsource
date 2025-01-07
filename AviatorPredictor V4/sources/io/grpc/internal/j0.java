package io.grpc.internal;

import io.grpc.internal.j1;
import io.grpc.internal.s;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
abstract class j0 implements v {
    j0() {
    }

    @Override // io.grpc.internal.j1
    public void a(b3.f1 f1Var) {
        b().a(f1Var);
    }

    protected abstract v b();

    @Override // io.grpc.internal.s
    public q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
        return b().c(v0Var, u0Var, cVar, kVarArr);
    }

    @Override // b3.l0
    public b3.h0 d() {
        return b().d();
    }

    @Override // io.grpc.internal.j1
    public Runnable e(j1.a aVar) {
        return b().e(aVar);
    }

    @Override // io.grpc.internal.j1
    public void f(b3.f1 f1Var) {
        b().f(f1Var);
    }

    @Override // io.grpc.internal.s
    public void g(s.a aVar, Executor executor) {
        b().g(aVar, executor);
    }

    public String toString() {
        return q0.h.c(this).d("delegate", b()).toString();
    }
}
