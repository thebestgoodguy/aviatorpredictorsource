package io.grpc.internal;

import b3.f1;
import java.util.Set;

/* loaded from: classes.dex */
final class z1 {

    /* renamed from: a, reason: collision with root package name */
    final int f5929a;

    /* renamed from: b, reason: collision with root package name */
    final long f5930b;

    /* renamed from: c, reason: collision with root package name */
    final long f5931c;

    /* renamed from: d, reason: collision with root package name */
    final double f5932d;

    /* renamed from: e, reason: collision with root package name */
    final Long f5933e;

    /* renamed from: f, reason: collision with root package name */
    final Set<f1.b> f5934f;

    z1(int r12, long j4, long j5, double d5, Long l4, Set<f1.b> set) {
        this.f5929a = r12;
        this.f5930b = j4;
        this.f5931c = j5;
        this.f5932d = d5;
        this.f5933e = l4;
        this.f5934f = r0.j.x(set);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f5929a == z1Var.f5929a && this.f5930b == z1Var.f5930b && this.f5931c == z1Var.f5931c && Double.compare(this.f5932d, z1Var.f5932d) == 0 && q0.i.a(this.f5933e, z1Var.f5933e) && q0.i.a(this.f5934f, z1Var.f5934f);
    }

    public int hashCode() {
        return q0.i.b(Integer.valueOf(this.f5929a), Long.valueOf(this.f5930b), Long.valueOf(this.f5931c), Double.valueOf(this.f5932d), this.f5933e, this.f5934f);
    }

    public String toString() {
        return q0.h.c(this).b("maxAttempts", this.f5929a).c("initialBackoffNanos", this.f5930b).c("maxBackoffNanos", this.f5931c).a("backoffMultiplier", this.f5932d).d("perAttemptRecvTimeoutNanos", this.f5933e).d("retryableStatusCodes", this.f5934f).toString();
    }
}
