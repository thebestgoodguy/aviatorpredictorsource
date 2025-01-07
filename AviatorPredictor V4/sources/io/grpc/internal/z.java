package io.grpc.internal;

import b3.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class z<ReqT, RespT> extends b3.g<ReqT, RespT> {

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f5888j = Logger.getLogger(z.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final b3.g<Object, Object> f5889k = new h();

    /* renamed from: a, reason: collision with root package name */
    private final ScheduledFuture<?> f5890a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5891b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.r f5892c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f5893d;

    /* renamed from: e, reason: collision with root package name */
    private g.a<RespT> f5894e;

    /* renamed from: f, reason: collision with root package name */
    private b3.g<ReqT, RespT> f5895f;

    /* renamed from: g, reason: collision with root package name */
    private b3.f1 f5896g;

    /* renamed from: h, reason: collision with root package name */
    private List<Runnable> f5897h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private j<RespT> f5898i;

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ g.a f5899e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b3.u0 f5900f;

        a(g.a aVar, b3.u0 u0Var) {
            this.f5899e = aVar;
            this.f5900f = u0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f5895f.e(this.f5899e, this.f5900f);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ StringBuilder f5902e;

        b(StringBuilder sb) {
            this.f5902e = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.j(b3.f1.f760j.q(this.f5902e.toString()), true);
        }
    }

    class c extends x {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f5904f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(j jVar) {
            super(z.this.f5892c);
            this.f5904f = jVar;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f5904f.g();
        }
    }

    class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f5906e;

        d(b3.f1 f1Var) {
            this.f5906e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f5895f.a(this.f5906e.n(), this.f5906e.l());
        }
    }

    class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f5908e;

        e(Object obj) {
            this.f5908e = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            z.this.f5895f.d(this.f5908e);
        }
    }

    class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5910e;

        f(int r22) {
            this.f5910e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f5895f.c(this.f5910e);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            z.this.f5895f.b();
        }
    }

    class h extends b3.g<Object, Object> {
        h() {
        }

        @Override // b3.g
        public void a(String str, Throwable th) {
        }

        @Override // b3.g
        public void b() {
        }

        @Override // b3.g
        public void c(int r12) {
        }

        @Override // b3.g
        public void d(Object obj) {
        }

        @Override // b3.g
        public void e(g.a<Object> aVar, b3.u0 u0Var) {
        }
    }

    private final class i extends x {

        /* renamed from: f, reason: collision with root package name */
        final g.a<RespT> f5913f;

        /* renamed from: g, reason: collision with root package name */
        final b3.f1 f5914g;

        i(g.a<RespT> aVar, b3.f1 f1Var) {
            super(z.this.f5892c);
            this.f5913f = aVar;
            this.f5914g = f1Var;
        }

        @Override // io.grpc.internal.x
        public void a() {
            this.f5913f.a(this.f5914g, new b3.u0());
        }
    }

    private static final class j<RespT> extends g.a<RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final g.a<RespT> f5916a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f5917b;

        /* renamed from: c, reason: collision with root package name */
        private List<Runnable> f5918c = new ArrayList();

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5919e;

            a(b3.u0 u0Var) {
                this.f5919e = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.f5916a.b(this.f5919e);
            }
        }

        class b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Object f5921e;

            b(Object obj) {
                this.f5921e = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.f5916a.c(this.f5921e);
            }
        }

        class c implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5923e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5924f;

            c(b3.f1 f1Var, b3.u0 u0Var) {
                this.f5923e = f1Var;
                this.f5924f = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.f5916a.a(this.f5923e, this.f5924f);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j.this.f5916a.d();
            }
        }

        public j(g.a<RespT> aVar) {
            this.f5916a = aVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f5917b) {
                    runnable.run();
                } else {
                    this.f5918c.add(runnable);
                }
            }
        }

        @Override // b3.g.a
        public void a(b3.f1 f1Var, b3.u0 u0Var) {
            f(new c(f1Var, u0Var));
        }

        @Override // b3.g.a
        public void b(b3.u0 u0Var) {
            if (this.f5917b) {
                this.f5916a.b(u0Var);
            } else {
                f(new a(u0Var));
            }
        }

        @Override // b3.g.a
        public void c(RespT respt) {
            if (this.f5917b) {
                this.f5916a.c(respt);
            } else {
                f(new b(respt));
            }
        }

        @Override // b3.g.a
        public void d() {
            if (this.f5917b) {
                this.f5916a.d();
            } else {
                f(new d());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f5918c.isEmpty()) {
                        this.f5918c = null;
                        this.f5917b = true;
                        return;
                    } else {
                        list = this.f5918c;
                        this.f5918c = arrayList;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    protected z(Executor executor, ScheduledExecutorService scheduledExecutorService, b3.t tVar) {
        this.f5891b = (Executor) q0.l.o(executor, "callExecutor");
        q0.l.o(scheduledExecutorService, "scheduler");
        this.f5892c = b3.r.e();
        this.f5890a = m(scheduledExecutorService, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void j(b3.f1 f1Var, boolean z4) {
        boolean z5;
        g.a<RespT> aVar;
        synchronized (this) {
            if (this.f5895f == null) {
                o(f5889k);
                z5 = false;
                aVar = this.f5894e;
                this.f5896g = f1Var;
            } else {
                if (z4) {
                    return;
                }
                z5 = true;
                aVar = null;
            }
            if (z5) {
                k(new d(f1Var));
            } else {
                if (aVar != null) {
                    this.f5891b.execute(new i(aVar, f1Var));
                }
                l();
            }
            i();
        }
    }

    private void k(Runnable runnable) {
        synchronized (this) {
            if (this.f5893d) {
                runnable.run();
            } else {
                this.f5897h.add(runnable);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0029, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void l() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f5897h     // Catch: java.lang.Throwable -> L42
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L24
            r0 = 0
            r3.f5897h = r0     // Catch: java.lang.Throwable -> L42
            r0 = 1
            r3.f5893d = r0     // Catch: java.lang.Throwable -> L42
            io.grpc.internal.z$j<RespT> r0 = r3.f5898i     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L23
            java.util.concurrent.Executor r1 = r3.f5891b
            io.grpc.internal.z$c r2 = new io.grpc.internal.z$c
            r2.<init>(r0)
            r1.execute(r2)
        L23:
            return
        L24:
            java.util.List<java.lang.Runnable> r1 = r3.f5897h     // Catch: java.lang.Throwable -> L42
            r3.f5897h = r0     // Catch: java.lang.Throwable -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r1.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L2d
        L3d:
            r1.clear()
            r0 = r1
            goto L5
        L42:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L42
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.z.l():void");
    }

    private ScheduledFuture<?> m(ScheduledExecutorService scheduledExecutorService, b3.t tVar) {
        b3.t g5 = this.f5892c.g();
        if (tVar == null && g5 == null) {
            return null;
        }
        long min = tVar != null ? Math.min(Long.MAX_VALUE, tVar.r(TimeUnit.NANOSECONDS)) : Long.MAX_VALUE;
        if (g5 != null) {
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            if (g5.r(timeUnit) < min) {
                min = g5.r(timeUnit);
                Logger logger = f5888j;
                if (logger.isLoggable(Level.FINE)) {
                    StringBuilder sb = new StringBuilder(String.format("Call timeout set to '%d' ns, due to context deadline.", Long.valueOf(min)));
                    sb.append(tVar == null ? " Explicit call timeout was not set." : String.format(" Explicit call timeout was '%d' ns.", Long.valueOf(tVar.r(timeUnit))));
                    logger.fine(sb.toString());
                }
            }
        }
        long abs = Math.abs(min);
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        long nanos = abs / timeUnit2.toNanos(1L);
        long abs2 = Math.abs(min) % timeUnit2.toNanos(1L);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(min < 0 ? "ClientCall started after deadline exceeded. Deadline exceeded after -" : "Deadline exceeded after ");
        sb2.append(nanos);
        sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        sb2.append("s. ");
        return scheduledExecutorService.schedule(new b(sb2), min, TimeUnit.NANOSECONDS);
    }

    private void o(b3.g<ReqT, RespT> gVar) {
        b3.g<ReqT, RespT> gVar2 = this.f5895f;
        q0.l.w(gVar2 == null, "realCall already set to %s", gVar2);
        ScheduledFuture<?> scheduledFuture = this.f5890a;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f5895f = gVar;
    }

    @Override // b3.g
    public final void a(String str, Throwable th) {
        b3.f1 f1Var = b3.f1.f757g;
        if (str == null) {
            str = "Call cancelled without message";
        }
        b3.f1 q4 = f1Var.q(str);
        if (th != null) {
            q4 = q4.p(th);
        }
        j(q4, false);
    }

    @Override // b3.g
    public final void b() {
        k(new g());
    }

    @Override // b3.g
    public final void c(int r22) {
        if (this.f5893d) {
            this.f5895f.c(r22);
        } else {
            k(new f(r22));
        }
    }

    @Override // b3.g
    public final void d(ReqT reqt) {
        if (this.f5893d) {
            this.f5895f.d(reqt);
        } else {
            k(new e(reqt));
        }
    }

    @Override // b3.g
    public final void e(g.a<RespT> aVar, b3.u0 u0Var) {
        b3.f1 f1Var;
        boolean z4;
        q0.l.u(this.f5894e == null, "already started");
        synchronized (this) {
            this.f5894e = (g.a) q0.l.o(aVar, "listener");
            f1Var = this.f5896g;
            z4 = this.f5893d;
            if (!z4) {
                j<RespT> jVar = new j<>(aVar);
                this.f5898i = jVar;
                aVar = jVar;
            }
        }
        if (f1Var != null) {
            this.f5891b.execute(new i(aVar, f1Var));
        } else if (z4) {
            this.f5895f.e(aVar, u0Var);
        } else {
            k(new a(aVar, u0Var));
        }
    }

    protected void i() {
    }

    public final void n(b3.g<ReqT, RespT> gVar) {
        synchronized (this) {
            if (this.f5895f != null) {
                return;
            }
            o((b3.g) q0.l.o(gVar, "call"));
            l();
        }
    }

    public String toString() {
        return q0.h.c(this).d("realCall", this.f5895f).toString();
    }
}
