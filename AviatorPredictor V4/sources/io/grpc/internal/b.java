package io.grpc.internal;

import b3.r0;

/* loaded from: classes.dex */
public abstract class b<T extends b3.r0<T>> extends b3.r0<T> {

    /* renamed from: a, reason: collision with root package name */
    protected int f5010a = 4194304;

    protected b() {
    }

    @Override // b3.r0
    public b3.q0 a() {
        return e().a();
    }

    protected abstract b3.r0<?> e();

    public String toString() {
        return q0.h.c(this).d("delegate", e()).toString();
    }
}
