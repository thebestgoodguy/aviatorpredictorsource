package io.grpc.internal;

import io.grpc.internal.p;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class p1 extends b3.q0 implements b3.g0<Object> {

    /* renamed from: k, reason: collision with root package name */
    private static final Logger f5552k = Logger.getLogger(p1.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private x0 f5553a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.h0 f5554b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5555c;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f5556d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5557e;

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f5558f;

    /* renamed from: g, reason: collision with root package name */
    private final CountDownLatch f5559g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f5560h;

    /* renamed from: i, reason: collision with root package name */
    private final m f5561i;

    /* renamed from: j, reason: collision with root package name */
    private final p.e f5562j;

    @Override // b3.d
    public String b() {
        return this.f5555c;
    }

    @Override // b3.l0
    public b3.h0 d() {
        return this.f5554b;
    }

    @Override // b3.d
    public <RequestT, ResponseT> b3.g<RequestT, ResponseT> h(b3.v0<RequestT, ResponseT> v0Var, b3.c cVar) {
        return new p(v0Var, cVar.e() == null ? this.f5557e : cVar.e(), cVar, this.f5562j, this.f5558f, this.f5561i, null);
    }

    @Override // b3.q0
    public boolean i(long j4, TimeUnit timeUnit) {
        return this.f5559g.await(j4, timeUnit);
    }

    @Override // b3.q0
    public b3.p k(boolean z4) {
        x0 x0Var = this.f5553a;
        return x0Var == null ? b3.p.IDLE : x0Var.M();
    }

    @Override // b3.q0
    public b3.q0 m() {
        this.f5560h = true;
        this.f5556d.f(b3.f1.f771u.q("OobChannel.shutdown() called"));
        return this;
    }

    @Override // b3.q0
    public b3.q0 n() {
        this.f5560h = true;
        this.f5556d.a(b3.f1.f771u.q("OobChannel.shutdownNow() called"));
        return this;
    }

    x0 o() {
        return this.f5553a;
    }

    public String toString() {
        return q0.h.c(this).c("logId", this.f5554b.d()).d("authority", this.f5555c).toString();
    }
}
