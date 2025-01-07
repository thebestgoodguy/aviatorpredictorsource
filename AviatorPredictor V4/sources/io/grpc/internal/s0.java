package io.grpc.internal;

import b3.f1;
import java.util.Set;

/* loaded from: classes.dex */
final class s0 {

    /* renamed from: a, reason: collision with root package name */
    final int f5648a;

    /* renamed from: b, reason: collision with root package name */
    final long f5649b;

    /* renamed from: c, reason: collision with root package name */
    final Set<f1.b> f5650c;

    s0(int r12, long j4, Set<f1.b> set) {
        this.f5648a = r12;
        this.f5649b = j4;
        this.f5650c = r0.j.x(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f5648a == s0Var.f5648a && this.f5649b == s0Var.f5649b && q0.i.a(this.f5650c, s0Var.f5650c);
    }

    public int hashCode() {
        return q0.i.b(Integer.valueOf(this.f5648a), Long.valueOf(this.f5649b), this.f5650c);
    }

    public String toString() {
        return q0.h.c(this).b("maxAttempts", this.f5648a).c("hedgingDelayNanos", this.f5649b).d("nonFatalStatusCodes", this.f5650c).toString();
    }
}
