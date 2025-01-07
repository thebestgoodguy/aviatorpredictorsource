package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;

/* loaded from: classes.dex */
final class g2 extends k0 {

    /* renamed from: a, reason: collision with root package name */
    private final k1.b f5353a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f5354b;

    public g2(k1.b bVar) {
        this.f5353a = bVar;
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        if (!this.f5354b) {
            super.a(aVar);
        } else if (aVar instanceof Closeable) {
            q0.e((Closeable) aVar);
        }
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void b(Throwable th) {
        this.f5354b = true;
        super.b(th);
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void c(boolean z4) {
        this.f5354b = true;
        super.c(z4);
    }

    @Override // io.grpc.internal.k0
    protected k1.b e() {
        return this.f5353a;
    }
}
