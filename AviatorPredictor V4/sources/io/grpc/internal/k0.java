package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;

/* loaded from: classes.dex */
abstract class k0 implements k1.b {
    k0() {
    }

    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.k1.b
    public void b(Throwable th) {
        e().b(th);
    }

    @Override // io.grpc.internal.k1.b
    public void c(boolean z4) {
        e().c(z4);
    }

    @Override // io.grpc.internal.k1.b
    public void d(int r22) {
        e().d(r22);
    }

    protected abstract k1.b e();
}
