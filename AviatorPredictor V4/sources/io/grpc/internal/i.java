package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
final class i implements d1 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicLong f5374a = new AtomicLong();

    i() {
    }

    @Override // io.grpc.internal.d1
    public void a(long j4) {
        this.f5374a.getAndAdd(j4);
    }
}
