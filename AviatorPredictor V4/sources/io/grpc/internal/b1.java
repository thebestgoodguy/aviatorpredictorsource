package io.grpc.internal;

import io.grpc.internal.s;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class b1 {

    /* renamed from: l, reason: collision with root package name */
    private static final long f5056l = TimeUnit.SECONDS.toNanos(10);

    /* renamed from: m, reason: collision with root package name */
    private static final long f5057m = TimeUnit.MILLISECONDS.toNanos(10);

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledExecutorService f5058a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.n f5059b;

    /* renamed from: c, reason: collision with root package name */
    private final d f5060c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5061d;

    /* renamed from: e, reason: collision with root package name */
    private e f5062e;

    /* renamed from: f, reason: collision with root package name */
    private ScheduledFuture<?> f5063f;

    /* renamed from: g, reason: collision with root package name */
    private ScheduledFuture<?> f5064g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f5065h;

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f5066i;

    /* renamed from: j, reason: collision with root package name */
    private final long f5067j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5068k;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            synchronized (b1.this) {
                e eVar = b1.this.f5062e;
                e eVar2 = e.DISCONNECTED;
                if (eVar != eVar2) {
                    b1.this.f5062e = eVar2;
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4) {
                b1.this.f5060c.a();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            synchronized (b1.this) {
                b1.this.f5064g = null;
                e eVar = b1.this.f5062e;
                e eVar2 = e.PING_SCHEDULED;
                if (eVar == eVar2) {
                    z4 = true;
                    b1.this.f5062e = e.PING_SENT;
                    b1 b1Var = b1.this;
                    b1Var.f5063f = b1Var.f5058a.schedule(b1.this.f5065h, b1.this.f5068k, TimeUnit.NANOSECONDS);
                } else {
                    if (b1.this.f5062e == e.PING_DELAYED) {
                        b1 b1Var2 = b1.this;
                        ScheduledExecutorService scheduledExecutorService = b1Var2.f5058a;
                        Runnable runnable = b1.this.f5066i;
                        long j4 = b1.this.f5067j;
                        q0.n nVar = b1.this.f5059b;
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        b1Var2.f5064g = scheduledExecutorService.schedule(runnable, j4 - nVar.d(timeUnit), timeUnit);
                        b1.this.f5062e = eVar2;
                    }
                    z4 = false;
                }
            }
            if (z4) {
                b1.this.f5060c.b();
            }
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final v f5071a;

        class a implements s.a {
            a() {
            }

            @Override // io.grpc.internal.s.a
            public void a(long j4) {
            }

            @Override // io.grpc.internal.s.a
            public void b(Throwable th) {
                c.this.f5071a.a(b3.f1.f771u.q("Keepalive failed. The connection is likely gone"));
            }
        }

        public c(v vVar) {
            this.f5071a = vVar;
        }

        @Override // io.grpc.internal.b1.d
        public void a() {
            this.f5071a.a(b3.f1.f771u.q("Keepalive failed. The connection is likely gone"));
        }

        @Override // io.grpc.internal.b1.d
        public void b() {
            this.f5071a.g(new a(), v0.c.a());
        }
    }

    public interface d {
        void a();

        void b();
    }

    private enum e {
        IDLE,
        PING_SCHEDULED,
        PING_DELAYED,
        PING_SENT,
        IDLE_AND_PING_SENT,
        DISCONNECTED
    }

    public b1(d dVar, ScheduledExecutorService scheduledExecutorService, long j4, long j5, boolean z4) {
        this(dVar, scheduledExecutorService, q0.n.c(), j4, j5, z4);
    }

    b1(d dVar, ScheduledExecutorService scheduledExecutorService, q0.n nVar, long j4, long j5, boolean z4) {
        this.f5062e = e.IDLE;
        this.f5065h = new c1(new a());
        this.f5066i = new c1(new b());
        this.f5060c = (d) q0.l.o(dVar, "keepAlivePinger");
        this.f5058a = (ScheduledExecutorService) q0.l.o(scheduledExecutorService, "scheduler");
        this.f5059b = (q0.n) q0.l.o(nVar, "stopwatch");
        this.f5067j = j4;
        this.f5068k = j5;
        this.f5061d = z4;
        nVar.f().g();
    }

    public static long l(long j4) {
        return Math.max(j4, f5056l);
    }

    public synchronized void m() {
        this.f5059b.f().g();
        e eVar = this.f5062e;
        e eVar2 = e.PING_SCHEDULED;
        if (eVar == eVar2) {
            this.f5062e = e.PING_DELAYED;
        } else if (eVar == e.PING_SENT || eVar == e.IDLE_AND_PING_SENT) {
            ScheduledFuture<?> scheduledFuture = this.f5063f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            if (this.f5062e == e.IDLE_AND_PING_SENT) {
                this.f5062e = e.IDLE;
            } else {
                this.f5062e = eVar2;
                q0.l.u(this.f5064g == null, "There should be no outstanding pingFuture");
                this.f5064g = this.f5058a.schedule(this.f5066i, this.f5067j, TimeUnit.NANOSECONDS);
            }
        }
    }

    public synchronized void n() {
        e eVar = this.f5062e;
        if (eVar == e.IDLE) {
            this.f5062e = e.PING_SCHEDULED;
            if (this.f5064g == null) {
                ScheduledExecutorService scheduledExecutorService = this.f5058a;
                Runnable runnable = this.f5066i;
                long j4 = this.f5067j;
                q0.n nVar = this.f5059b;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                this.f5064g = scheduledExecutorService.schedule(runnable, j4 - nVar.d(timeUnit), timeUnit);
            }
        } else if (eVar == e.IDLE_AND_PING_SENT) {
            this.f5062e = e.PING_SENT;
        }
    }

    public synchronized void o() {
        if (this.f5061d) {
            return;
        }
        e eVar = this.f5062e;
        if (eVar == e.PING_SCHEDULED || eVar == e.PING_DELAYED) {
            this.f5062e = e.IDLE;
        }
        if (this.f5062e == e.PING_SENT) {
            this.f5062e = e.IDLE_AND_PING_SENT;
        }
    }

    public synchronized void p() {
        if (this.f5061d) {
            n();
        }
    }

    public synchronized void q() {
        e eVar = this.f5062e;
        e eVar2 = e.DISCONNECTED;
        if (eVar != eVar2) {
            this.f5062e = eVar2;
            ScheduledFuture<?> scheduledFuture = this.f5063f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            ScheduledFuture<?> scheduledFuture2 = this.f5064g;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                this.f5064g = null;
            }
        }
    }
}
