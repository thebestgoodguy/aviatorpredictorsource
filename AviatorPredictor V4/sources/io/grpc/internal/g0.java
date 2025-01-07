package io.grpc.internal;

import io.grpc.internal.r;

/* loaded from: classes.dex */
class g0 implements s {

    /* renamed from: a, reason: collision with root package name */
    final b3.f1 f5325a;

    /* renamed from: b, reason: collision with root package name */
    private final r.a f5326b;

    g0(b3.f1 f1Var, r.a aVar) {
        q0.l.e(!f1Var.o(), "error must not be OK");
        this.f5325a = f1Var;
        this.f5326b = aVar;
    }

    @Override // io.grpc.internal.s
    public q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
        return new f0(this.f5325a, this.f5326b, kVarArr);
    }

    @Override // b3.l0
    public b3.h0 d() {
        throw new UnsupportedOperationException("Not a real transport");
    }
}
