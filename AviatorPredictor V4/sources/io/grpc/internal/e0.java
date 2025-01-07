package io.grpc.internal;

import io.grpc.internal.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e0 implements k {

    /* renamed from: a, reason: collision with root package name */
    private Random f5142a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private long f5143b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c, reason: collision with root package name */
    private long f5144c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d, reason: collision with root package name */
    private double f5145d = 1.6d;

    /* renamed from: e, reason: collision with root package name */
    private double f5146e = 0.2d;

    /* renamed from: f, reason: collision with root package name */
    private long f5147f = this.f5143b;

    public static final class a implements k.a {
        @Override // io.grpc.internal.k.a
        public k get() {
            return new e0();
        }
    }

    private long b(double d5, double d6) {
        q0.l.d(d6 >= d5);
        return (long) ((this.f5142a.nextDouble() * (d6 - d5)) + d5);
    }

    @Override // io.grpc.internal.k
    public long a() {
        long j4 = this.f5147f;
        double d5 = j4;
        this.f5147f = Math.min((long) (this.f5145d * d5), this.f5144c);
        double d6 = this.f5146e;
        return j4 + b((-d6) * d5, d6 * d5);
    }
}
