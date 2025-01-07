package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class x1 {

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f5767a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5768b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f5769c;

    /* renamed from: d, reason: collision with root package name */
    private final q0.n f5770d;

    /* renamed from: e, reason: collision with root package name */
    private long f5771e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5772f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f5773g;

    private final class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!x1.this.f5772f) {
                x1.this.f5773g = null;
                return;
            }
            long j4 = x1.this.j();
            if (x1.this.f5771e - j4 > 0) {
                x1 x1Var = x1.this;
                x1Var.f5773g = x1Var.f5767a.schedule(new c(), x1.this.f5771e - j4, TimeUnit.NANOSECONDS);
            } else {
                x1.this.f5772f = false;
                x1.this.f5773g = null;
                x1.this.f5769c.run();
            }
        }
    }

    private final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x1.this.f5768b.execute(new b());
        }
    }

    x1(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, q0.n nVar) {
        this.f5769c = runnable;
        this.f5768b = executor;
        this.f5767a = scheduledExecutorService;
        this.f5770d = nVar;
        nVar.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long j() {
        return this.f5770d.d(TimeUnit.NANOSECONDS);
    }

    void i(boolean z4) {
        ScheduledFuture<?> scheduledFuture;
        this.f5772f = false;
        if (!z4 || (scheduledFuture = this.f5773g) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.f5773g = null;
    }

    void k(long j4, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j4);
        long j5 = j() + nanos;
        this.f5772f = true;
        if (j5 - this.f5771e < 0 || this.f5773g == null) {
            ScheduledFuture<?> scheduledFuture = this.f5773g;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f5773g = this.f5767a.schedule(new c(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f5771e = j5;
    }
}
