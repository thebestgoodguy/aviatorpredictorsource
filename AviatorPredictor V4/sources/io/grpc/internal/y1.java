package io.grpc.internal;

import b3.k;
import b3.u0;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
abstract class y1<ReqT> implements io.grpc.internal.q {
    private static Random A;

    /* renamed from: x, reason: collision with root package name */
    static final u0.g<String> f5780x;

    /* renamed from: y, reason: collision with root package name */
    static final u0.g<String> f5781y;

    /* renamed from: z, reason: collision with root package name */
    private static final b3.f1 f5782z;

    /* renamed from: a, reason: collision with root package name */
    private final b3.v0<ReqT, ?> f5783a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f5784b;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f5786d;

    /* renamed from: e, reason: collision with root package name */
    private final b3.u0 f5787e;

    /* renamed from: f, reason: collision with root package name */
    private final z1 f5788f;

    /* renamed from: g, reason: collision with root package name */
    private final s0 f5789g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5790h;

    /* renamed from: j, reason: collision with root package name */
    private final t f5792j;

    /* renamed from: k, reason: collision with root package name */
    private final long f5793k;

    /* renamed from: l, reason: collision with root package name */
    private final long f5794l;

    /* renamed from: m, reason: collision with root package name */
    private final c0 f5795m;

    /* renamed from: q, reason: collision with root package name */
    private long f5799q;

    /* renamed from: r, reason: collision with root package name */
    private io.grpc.internal.r f5800r;

    /* renamed from: s, reason: collision with root package name */
    private u f5801s;

    /* renamed from: t, reason: collision with root package name */
    private u f5802t;

    /* renamed from: u, reason: collision with root package name */
    private long f5803u;

    /* renamed from: v, reason: collision with root package name */
    private b3.f1 f5804v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f5805w;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5785c = new b3.j1(new a());

    /* renamed from: i, reason: collision with root package name */
    private final Object f5791i = new Object();

    /* renamed from: n, reason: collision with root package name */
    private final w0 f5796n = new w0();

    /* renamed from: o, reason: collision with root package name */
    private volatile z f5797o = new z(new ArrayList(8), Collections.emptyList(), null, null, false, false, false, 0);

    /* renamed from: p, reason: collision with root package name */
    private final AtomicBoolean f5798p = new AtomicBoolean();

    class a implements Thread.UncaughtExceptionHandler {
        a() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            throw b3.f1.k(th).q("Uncaught exception in the SynchronizationContext. Re-thrown.").d();
        }
    }

    private final class a0 implements io.grpc.internal.r {

        /* renamed from: a, reason: collision with root package name */
        final b0 f5807a;

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5809e;

            a(b3.u0 u0Var) {
                this.f5809e = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f5800r.c(this.f5809e);
            }
        }

        class b implements Runnable {

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a0 a0Var = a0.this;
                    y1.this.c0(y1.this.a0(a0Var.f5807a.f5831d + 1, false));
                }
            }

            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f5784b.execute(new a());
            }
        }

        class c implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5813e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ r.a f5814f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5815g;

            c(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
                this.f5813e = f1Var;
                this.f5814f = aVar;
                this.f5815g = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f5805w = true;
                y1.this.f5800r.d(this.f5813e, this.f5814f, this.f5815g);
            }
        }

        class d implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b0 f5817e;

            d(b0 b0Var) {
                this.f5817e = b0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.c0(this.f5817e);
            }
        }

        class e implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5819e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ r.a f5820f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5821g;

            e(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
                this.f5819e = f1Var;
                this.f5820f = aVar;
                this.f5821g = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f5805w = true;
                y1.this.f5800r.d(this.f5819e, this.f5820f, this.f5821g);
            }
        }

        class f implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j2.a f5823e;

            f(j2.a aVar) {
                this.f5823e = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                y1.this.f5800r.a(this.f5823e);
            }
        }

        class g implements Runnable {
            g() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (y1.this.f5805w) {
                    return;
                }
                y1.this.f5800r.b();
            }
        }

        a0(b0 b0Var) {
            this.f5807a = b0Var;
        }

        private Integer e(b3.u0 u0Var) {
            String str = (String) u0Var.g(y1.f5781y);
            if (str == null) {
                return null;
            }
            try {
                return Integer.valueOf(str);
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        private v f(b3.f1 f1Var, b3.u0 u0Var) {
            Integer e5 = e(u0Var);
            boolean z4 = !y1.this.f5789g.f5650c.contains(f1Var.m());
            return new v((z4 || ((y1.this.f5795m == null || (z4 && (e5 == null || e5.intValue() >= 0))) ? false : y1.this.f5795m.b() ^ true)) ? false : true, e5);
        }

        private x g(b3.f1 f1Var, b3.u0 u0Var) {
            y1 y1Var;
            long j4;
            long j5 = 0;
            boolean z4 = false;
            if (y1.this.f5788f == null) {
                return new x(false, 0L);
            }
            boolean contains = y1.this.f5788f.f5934f.contains(f1Var.m());
            Integer e5 = e(u0Var);
            boolean z5 = (y1.this.f5795m == null || (!contains && (e5 == null || e5.intValue() >= 0))) ? false : !y1.this.f5795m.b();
            if (y1.this.f5788f.f5929a > this.f5807a.f5831d + 1 && !z5) {
                if (e5 == null) {
                    if (contains) {
                        j5 = (long) (y1.this.f5803u * y1.A.nextDouble());
                        y1Var = y1.this;
                        j4 = Math.min((long) (y1Var.f5803u * y1.this.f5788f.f5932d), y1.this.f5788f.f5931c);
                        y1Var.f5803u = j4;
                        z4 = true;
                    }
                } else if (e5.intValue() >= 0) {
                    j5 = TimeUnit.MILLISECONDS.toNanos(e5.intValue());
                    y1Var = y1.this;
                    j4 = y1Var.f5788f.f5930b;
                    y1Var.f5803u = j4;
                    z4 = true;
                }
            }
            return new x(z4, j5);
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            z zVar = y1.this.f5797o;
            q0.l.u(zVar.f5885f != null, "Headers should be received prior to messages.");
            if (zVar.f5885f != this.f5807a) {
                return;
            }
            y1.this.f5785c.execute(new f(aVar));
        }

        @Override // io.grpc.internal.j2
        public void b() {
            if (y1.this.f()) {
                y1.this.f5785c.execute(new g());
            }
        }

        @Override // io.grpc.internal.r
        public void c(b3.u0 u0Var) {
            y1.this.Z(this.f5807a);
            if (y1.this.f5797o.f5885f == this.f5807a) {
                if (y1.this.f5795m != null) {
                    y1.this.f5795m.c();
                }
                y1.this.f5785c.execute(new a(u0Var));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
        
            if (r5.f5808b.f5788f.f5929a != 1) goto L39;
         */
        @Override // io.grpc.internal.r
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void d(b3.f1 r6, io.grpc.internal.r.a r7, b3.u0 r8) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.a0.d(b3.f1, io.grpc.internal.r$a, b3.u0):void");
        }
    }

    class b implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f5826a;

        b(String str) {
            this.f5826a = str;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.j(this.f5826a);
        }
    }

    private static final class b0 {

        /* renamed from: a, reason: collision with root package name */
        io.grpc.internal.q f5828a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5829b;

        /* renamed from: c, reason: collision with root package name */
        boolean f5830c;

        /* renamed from: d, reason: collision with root package name */
        final int f5831d;

        b0(int r12) {
            this.f5831d = r12;
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Collection f5832e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b0 f5833f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Future f5834g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Future f5835h;

        c(Collection collection, b0 b0Var, Future future, Future future2) {
            this.f5832e = collection;
            this.f5833f = b0Var;
            this.f5834g = future;
            this.f5835h = future2;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (b0 b0Var : this.f5832e) {
                if (b0Var != this.f5833f) {
                    b0Var.f5828a.c(y1.f5782z);
                }
            }
            Future future = this.f5834g;
            if (future != null) {
                future.cancel(false);
            }
            Future future2 = this.f5835h;
            if (future2 != null) {
                future2.cancel(false);
            }
            y1.this.g0();
        }
    }

    static final class c0 {

        /* renamed from: a, reason: collision with root package name */
        final int f5837a;

        /* renamed from: b, reason: collision with root package name */
        final int f5838b;

        /* renamed from: c, reason: collision with root package name */
        final int f5839c;

        /* renamed from: d, reason: collision with root package name */
        final AtomicInteger f5840d;

        c0(float f5, float f6) {
            AtomicInteger atomicInteger = new AtomicInteger();
            this.f5840d = atomicInteger;
            this.f5839c = (int) (f6 * 1000.0f);
            int r32 = (int) (f5 * 1000.0f);
            this.f5837a = r32;
            this.f5838b = r32 / 2;
            atomicInteger.set(r32);
        }

        boolean a() {
            return this.f5840d.get() > this.f5838b;
        }

        boolean b() {
            int r02;
            int r22;
            do {
                r02 = this.f5840d.get();
                if (r02 == 0) {
                    return false;
                }
                r22 = r02 - 1000;
            } while (!this.f5840d.compareAndSet(r02, Math.max(r22, 0)));
            return r22 > this.f5838b;
        }

        void c() {
            int r02;
            int r12;
            do {
                r02 = this.f5840d.get();
                r12 = this.f5837a;
                if (r02 == r12) {
                    return;
                }
            } while (!this.f5840d.compareAndSet(r02, Math.min(this.f5839c + r02, r12)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c0)) {
                return false;
            }
            c0 c0Var = (c0) obj;
            return this.f5837a == c0Var.f5837a && this.f5839c == c0Var.f5839c;
        }

        public int hashCode() {
            return q0.i.b(Integer.valueOf(this.f5837a), Integer.valueOf(this.f5839c));
        }
    }

    class d implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.n f5841a;

        d(b3.n nVar) {
            this.f5841a = nVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.b(this.f5841a);
        }
    }

    class e implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.t f5843a;

        e(b3.t tVar) {
            this.f5843a = tVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.g(this.f5843a);
        }
    }

    class f implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.v f5845a;

        f(b3.v vVar) {
            this.f5845a = vVar;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.k(this.f5845a);
        }
    }

    class g implements r {
        g() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.flush();
        }
    }

    class h implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f5848a;

        h(boolean z4) {
            this.f5848a = z4;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.q(this.f5848a);
        }
    }

    class i implements r {
        i() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.n();
        }
    }

    class j implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5851a;

        j(int r22) {
            this.f5851a = r22;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.e(this.f5851a);
        }
    }

    class k implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5853a;

        k(int r22) {
            this.f5853a = r22;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.a(this.f5853a);
        }
    }

    class l implements r {
        l() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.m();
        }
    }

    class m implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f5856a;

        m(int r22) {
            this.f5856a = r22;
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.d(this.f5856a);
        }
    }

    class n implements r {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f5858a;

        n(Object obj) {
            this.f5858a = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.h(y1.this.f5783a.j(this.f5858a));
        }
    }

    class o extends k.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.k f5860a;

        o(b3.k kVar) {
            this.f5860a = kVar;
        }

        @Override // b3.k.a
        public b3.k a(k.b bVar, b3.u0 u0Var) {
            return this.f5860a;
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y1.this.f5805w) {
                return;
            }
            y1.this.f5800r.b();
        }
    }

    class q implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f5863e;

        q(b3.f1 f1Var) {
            this.f5863e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f5805w = true;
            y1.this.f5800r.d(this.f5863e, r.a.PROCESSED, new b3.u0());
        }
    }

    private interface r {
        void a(b0 b0Var);
    }

    class s extends b3.k {

        /* renamed from: a, reason: collision with root package name */
        private final b0 f5865a;

        /* renamed from: b, reason: collision with root package name */
        long f5866b;

        s(b0 b0Var) {
            this.f5865a = b0Var;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0074 A[Catch: all -> 0x0083, TryCatch #0 {, blocks: (B:8:0x0013, B:10:0x001d, B:13:0x0024, B:15:0x0033, B:17:0x0035, B:19:0x0042, B:20:0x0044, B:21:0x006e, B:23:0x0074, B:24:0x007a, B:29:0x0047, B:31:0x006b, B:32:0x0081), top: B:7:0x0013 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
        @Override // b3.i1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void h(long r8) {
            /*
                r7 = this;
                io.grpc.internal.y1 r0 = io.grpc.internal.y1.this
                io.grpc.internal.y1$z r0 = io.grpc.internal.y1.Q(r0)
                io.grpc.internal.y1$b0 r0 = r0.f5885f
                if (r0 == 0) goto Lb
                return
            Lb:
                r0 = 0
                io.grpc.internal.y1 r1 = io.grpc.internal.y1.this
                java.lang.Object r1 = io.grpc.internal.y1.T(r1)
                monitor-enter(r1)
                io.grpc.internal.y1 r2 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1$z r2 = io.grpc.internal.y1.Q(r2)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1$b0 r2 = r2.f5885f     // Catch: java.lang.Throwable -> L83
                if (r2 != 0) goto L81
                io.grpc.internal.y1$b0 r2 = r7.f5865a     // Catch: java.lang.Throwable -> L83
                boolean r2 = r2.f5829b     // Catch: java.lang.Throwable -> L83
                if (r2 == 0) goto L24
                goto L81
            L24:
                long r2 = r7.f5866b     // Catch: java.lang.Throwable -> L83
                long r2 = r2 + r8
                r7.f5866b = r2     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1 r8 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                long r8 = io.grpc.internal.y1.K(r8)     // Catch: java.lang.Throwable -> L83
                int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
                if (r4 > 0) goto L35
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                return
            L35:
                long r8 = r7.f5866b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1 r2 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                long r2 = io.grpc.internal.y1.M(r2)     // Catch: java.lang.Throwable -> L83
                r4 = 1
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L47
                io.grpc.internal.y1$b0 r8 = r7.f5865a     // Catch: java.lang.Throwable -> L83
            L44:
                r8.f5830c = r4     // Catch: java.lang.Throwable -> L83
                goto L6e
            L47:
                io.grpc.internal.y1 r8 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1$t r8 = io.grpc.internal.y1.N(r8)     // Catch: java.lang.Throwable -> L83
                long r2 = r7.f5866b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1 r9 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                long r5 = io.grpc.internal.y1.K(r9)     // Catch: java.lang.Throwable -> L83
                long r2 = r2 - r5
                long r8 = r8.a(r2)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1 r2 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                long r5 = r7.f5866b     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1.L(r2, r5)     // Catch: java.lang.Throwable -> L83
                io.grpc.internal.y1 r2 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                long r2 = io.grpc.internal.y1.O(r2)     // Catch: java.lang.Throwable -> L83
                int r5 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r5 <= 0) goto L6e
                io.grpc.internal.y1$b0 r8 = r7.f5865a     // Catch: java.lang.Throwable -> L83
                goto L44
            L6e:
                io.grpc.internal.y1$b0 r8 = r7.f5865a     // Catch: java.lang.Throwable -> L83
                boolean r9 = r8.f5830c     // Catch: java.lang.Throwable -> L83
                if (r9 == 0) goto L7a
                io.grpc.internal.y1 r9 = io.grpc.internal.y1.this     // Catch: java.lang.Throwable -> L83
                java.lang.Runnable r0 = io.grpc.internal.y1.P(r9, r8)     // Catch: java.lang.Throwable -> L83
            L7a:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                if (r0 == 0) goto L80
                r0.run()
            L80:
                return
            L81:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                return
            L83:
                r8 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.s.h(long):void");
        }
    }

    static final class t {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicLong f5868a = new AtomicLong();

        t() {
        }

        long a(long j4) {
            return this.f5868a.addAndGet(j4);
        }
    }

    private static final class u {

        /* renamed from: a, reason: collision with root package name */
        final Object f5869a;

        /* renamed from: b, reason: collision with root package name */
        Future<?> f5870b;

        /* renamed from: c, reason: collision with root package name */
        boolean f5871c;

        u(Object obj) {
            this.f5869a = obj;
        }

        boolean a() {
            return this.f5871c;
        }

        Future<?> b() {
            this.f5871c = true;
            return this.f5870b;
        }

        void c(Future<?> future) {
            synchronized (this.f5869a) {
                if (!this.f5871c) {
                    this.f5870b = future;
                }
            }
        }
    }

    private static final class v {

        /* renamed from: a, reason: collision with root package name */
        final boolean f5872a;

        /* renamed from: b, reason: collision with root package name */
        final Integer f5873b;

        public v(boolean z4, Integer num) {
            this.f5872a = z4;
            this.f5873b = num;
        }
    }

    private final class w implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final u f5874e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar;
                y1 y1Var;
                y1 y1Var2 = y1.this;
                boolean z4 = false;
                b0 a02 = y1Var2.a0(y1Var2.f5797o.f5884e, false);
                synchronized (y1.this.f5791i) {
                    uVar = null;
                    if (w.this.f5874e.a()) {
                        z4 = true;
                    } else {
                        y1 y1Var3 = y1.this;
                        y1Var3.f5797o = y1Var3.f5797o.a(a02);
                        y1 y1Var4 = y1.this;
                        if (y1Var4.e0(y1Var4.f5797o) && (y1.this.f5795m == null || y1.this.f5795m.a())) {
                            y1Var = y1.this;
                            uVar = new u(y1Var.f5791i);
                        } else {
                            y1 y1Var5 = y1.this;
                            y1Var5.f5797o = y1Var5.f5797o.d();
                            y1Var = y1.this;
                        }
                        y1Var.f5802t = uVar;
                    }
                }
                if (z4) {
                    a02.f5828a.c(b3.f1.f757g.q("Unneeded hedging"));
                    return;
                }
                if (uVar != null) {
                    uVar.c(y1.this.f5786d.schedule(new w(uVar), y1.this.f5789g.f5649b, TimeUnit.NANOSECONDS));
                }
                y1.this.c0(a02);
            }
        }

        w(u uVar) {
            this.f5874e = uVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            y1.this.f5784b.execute(new a());
        }
    }

    private static final class x {

        /* renamed from: a, reason: collision with root package name */
        final boolean f5877a;

        /* renamed from: b, reason: collision with root package name */
        final long f5878b;

        x(boolean z4, long j4) {
            this.f5877a = z4;
            this.f5878b = j4;
        }
    }

    class y implements r {
        y() {
        }

        @Override // io.grpc.internal.y1.r
        public void a(b0 b0Var) {
            b0Var.f5828a.i(new a0(b0Var));
        }
    }

    private static final class z {

        /* renamed from: a, reason: collision with root package name */
        final boolean f5880a;

        /* renamed from: b, reason: collision with root package name */
        final List<r> f5881b;

        /* renamed from: c, reason: collision with root package name */
        final Collection<b0> f5882c;

        /* renamed from: d, reason: collision with root package name */
        final Collection<b0> f5883d;

        /* renamed from: e, reason: collision with root package name */
        final int f5884e;

        /* renamed from: f, reason: collision with root package name */
        final b0 f5885f;

        /* renamed from: g, reason: collision with root package name */
        final boolean f5886g;

        /* renamed from: h, reason: collision with root package name */
        final boolean f5887h;

        z(List<r> list, Collection<b0> collection, Collection<b0> collection2, b0 b0Var, boolean z4, boolean z5, boolean z6, int r9) {
            this.f5881b = list;
            this.f5882c = (Collection) q0.l.o(collection, "drainedSubstreams");
            this.f5885f = b0Var;
            this.f5883d = collection2;
            this.f5886g = z4;
            this.f5880a = z5;
            this.f5887h = z6;
            this.f5884e = r9;
            q0.l.u(!z5 || list == null, "passThrough should imply buffer is null");
            q0.l.u((z5 && b0Var == null) ? false : true, "passThrough should imply winningSubstream != null");
            q0.l.u(!z5 || (collection.size() == 1 && collection.contains(b0Var)) || (collection.size() == 0 && b0Var.f5829b), "passThrough should imply winningSubstream is drained");
            q0.l.u((z4 && b0Var == null) ? false : true, "cancelled should imply committed");
        }

        z a(b0 b0Var) {
            Collection unmodifiableCollection;
            q0.l.u(!this.f5887h, "hedging frozen");
            q0.l.u(this.f5885f == null, "already committed");
            if (this.f5883d == null) {
                unmodifiableCollection = Collections.singleton(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f5883d);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            return new z(this.f5881b, this.f5882c, unmodifiableCollection, this.f5885f, this.f5886g, this.f5880a, this.f5887h, this.f5884e + 1);
        }

        z b() {
            return new z(this.f5881b, this.f5882c, this.f5883d, this.f5885f, true, this.f5880a, this.f5887h, this.f5884e);
        }

        z c(b0 b0Var) {
            List<r> list;
            Collection emptyList;
            boolean z4;
            q0.l.u(this.f5885f == null, "Already committed");
            List<r> list2 = this.f5881b;
            if (this.f5882c.contains(b0Var)) {
                list = null;
                emptyList = Collections.singleton(b0Var);
                z4 = true;
            } else {
                list = list2;
                emptyList = Collections.emptyList();
                z4 = false;
            }
            return new z(list, emptyList, this.f5883d, b0Var, this.f5886g, z4, this.f5887h, this.f5884e);
        }

        z d() {
            return this.f5887h ? this : new z(this.f5881b, this.f5882c, this.f5883d, this.f5885f, this.f5886g, this.f5880a, true, this.f5884e);
        }

        z e(b0 b0Var) {
            ArrayList arrayList = new ArrayList(this.f5883d);
            arrayList.remove(b0Var);
            return new z(this.f5881b, this.f5882c, Collections.unmodifiableCollection(arrayList), this.f5885f, this.f5886g, this.f5880a, this.f5887h, this.f5884e);
        }

        z f(b0 b0Var, b0 b0Var2) {
            ArrayList arrayList = new ArrayList(this.f5883d);
            arrayList.remove(b0Var);
            arrayList.add(b0Var2);
            return new z(this.f5881b, this.f5882c, Collections.unmodifiableCollection(arrayList), this.f5885f, this.f5886g, this.f5880a, this.f5887h, this.f5884e);
        }

        z g(b0 b0Var) {
            b0Var.f5829b = true;
            if (!this.f5882c.contains(b0Var)) {
                return this;
            }
            ArrayList arrayList = new ArrayList(this.f5882c);
            arrayList.remove(b0Var);
            return new z(this.f5881b, Collections.unmodifiableCollection(arrayList), this.f5883d, this.f5885f, this.f5886g, this.f5880a, this.f5887h, this.f5884e);
        }

        z h(b0 b0Var) {
            Collection unmodifiableCollection;
            q0.l.u(!this.f5880a, "Already passThrough");
            if (b0Var.f5829b) {
                unmodifiableCollection = this.f5882c;
            } else if (this.f5882c.isEmpty()) {
                unmodifiableCollection = Collections.singletonList(b0Var);
            } else {
                ArrayList arrayList = new ArrayList(this.f5882c);
                arrayList.add(b0Var);
                unmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
            Collection collection = unmodifiableCollection;
            b0 b0Var2 = this.f5885f;
            boolean z4 = b0Var2 != null;
            List<r> list = this.f5881b;
            if (z4) {
                q0.l.u(b0Var2 == b0Var, "Another RPC attempt has already committed");
                list = null;
            }
            return new z(list, collection, this.f5883d, this.f5885f, this.f5886g, z4, this.f5887h, this.f5884e);
        }
    }

    static {
        u0.d<String> dVar = b3.u0.f903e;
        f5780x = u0.g.e("grpc-previous-rpc-attempts", dVar);
        f5781y = u0.g.e("grpc-retry-pushback-ms", dVar);
        f5782z = b3.f1.f757g.q("Stream thrown away because RetriableStream committed");
        A = new Random();
    }

    y1(b3.v0<ReqT, ?> v0Var, b3.u0 u0Var, t tVar, long j4, long j5, Executor executor, ScheduledExecutorService scheduledExecutorService, z1 z1Var, s0 s0Var, c0 c0Var) {
        this.f5783a = v0Var;
        this.f5792j = tVar;
        this.f5793k = j4;
        this.f5794l = j5;
        this.f5784b = executor;
        this.f5786d = scheduledExecutorService;
        this.f5787e = u0Var;
        this.f5788f = z1Var;
        if (z1Var != null) {
            this.f5803u = z1Var.f5930b;
        }
        this.f5789g = s0Var;
        q0.l.e(z1Var == null || s0Var == null, "Should not provide both retryPolicy and hedgingPolicy");
        this.f5790h = s0Var != null;
        this.f5795m = c0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Runnable Y(b0 b0Var) {
        Future<?> future;
        Future<?> future2;
        synchronized (this.f5791i) {
            if (this.f5797o.f5885f != null) {
                return null;
            }
            Collection<b0> collection = this.f5797o.f5882c;
            this.f5797o = this.f5797o.c(b0Var);
            this.f5792j.a(-this.f5799q);
            u uVar = this.f5801s;
            if (uVar != null) {
                Future<?> b5 = uVar.b();
                this.f5801s = null;
                future = b5;
            } else {
                future = null;
            }
            u uVar2 = this.f5802t;
            if (uVar2 != null) {
                Future<?> b6 = uVar2.b();
                this.f5802t = null;
                future2 = b6;
            } else {
                future2 = null;
            }
            return new c(collection, b0Var, future, future2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(b0 b0Var) {
        Runnable Y = Y(b0Var);
        if (Y != null) {
            Y.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b0 a0(int r4, boolean z4) {
        b0 b0Var = new b0(r4);
        b0Var.f5828a = f0(k0(this.f5787e, r4), new o(new s(b0Var)), r4, z4);
        return b0Var;
    }

    private void b0(r rVar) {
        Collection<b0> collection;
        synchronized (this.f5791i) {
            if (!this.f5797o.f5880a) {
                this.f5797o.f5881b.add(rVar);
            }
            collection = this.f5797o.f5882c;
        }
        Iterator<b0> it = collection.iterator();
        while (it.hasNext()) {
            rVar.a(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r8.f5785c.execute(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        r0 = r9.f5828a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (r8.f5797o.f5885f != r9) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        r9 = r8.f5804v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r0.c(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        r9 = io.grpc.internal.y1.f5782z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r2 = r3.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r2.hasNext() == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0084, code lost:
    
        r4 = (io.grpc.internal.y1.r) r2.next();
        r4.a(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008f, code lost:
    
        if ((r4 instanceof io.grpc.internal.y1.y) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0091, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r1 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        r4 = r8.f5797o;
        r5 = r4.f5885f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0098, code lost:
    
        if (r5 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009a, code lost:
    
        if (r5 == r9) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009f, code lost:
    
        if (r4.f5886g == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c0(io.grpc.internal.y1.b0 r9) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            r3 = r0
            r2 = 0
        L4:
            java.lang.Object r4 = r8.f5791i
            monitor-enter(r4)
            io.grpc.internal.y1$z r5 = r8.f5797o     // Catch: java.lang.Throwable -> La4
            if (r1 == 0) goto L18
            io.grpc.internal.y1$b0 r6 = r5.f5885f     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L13
            if (r6 == r9) goto L13
        L11:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            goto L34
        L13:
            boolean r6 = r5.f5886g     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L18
            goto L11
        L18:
            java.util.List<io.grpc.internal.y1$r> r6 = r5.f5881b     // Catch: java.lang.Throwable -> La4
            int r6 = r6.size()     // Catch: java.lang.Throwable -> La4
            if (r2 != r6) goto L4d
            io.grpc.internal.y1$z r0 = r5.h(r9)     // Catch: java.lang.Throwable -> La4
            r8.f5797o = r0     // Catch: java.lang.Throwable -> La4
            boolean r0 = r8.f()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L2e
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L2e:
            io.grpc.internal.y1$p r0 = new io.grpc.internal.y1$p     // Catch: java.lang.Throwable -> La4
            r0.<init>()     // Catch: java.lang.Throwable -> La4
            goto L11
        L34:
            if (r0 == 0) goto L3c
            java.util.concurrent.Executor r9 = r8.f5785c
            r9.execute(r0)
            return
        L3c:
            io.grpc.internal.q r0 = r9.f5828a
            io.grpc.internal.y1$z r1 = r8.f5797o
            io.grpc.internal.y1$b0 r1 = r1.f5885f
            if (r1 != r9) goto L47
            b3.f1 r9 = r8.f5804v
            goto L49
        L47:
            b3.f1 r9 = io.grpc.internal.y1.f5782z
        L49:
            r0.c(r9)
            return
        L4d:
            boolean r6 = r9.f5829b     // Catch: java.lang.Throwable -> La4
            if (r6 == 0) goto L53
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            return
        L53:
            int r6 = r2 + 128
            java.util.List<io.grpc.internal.y1$r> r7 = r5.f5881b     // Catch: java.lang.Throwable -> La4
            int r7 = r7.size()     // Catch: java.lang.Throwable -> La4
            int r6 = java.lang.Math.min(r6, r7)     // Catch: java.lang.Throwable -> La4
            if (r3 != 0) goto L6d
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f5881b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.<init>(r2)     // Catch: java.lang.Throwable -> La4
            goto L79
        L6d:
            r3.clear()     // Catch: java.lang.Throwable -> La4
            java.util.List<io.grpc.internal.y1$r> r5 = r5.f5881b     // Catch: java.lang.Throwable -> La4
            java.util.List r2 = r5.subList(r2, r6)     // Catch: java.lang.Throwable -> La4
            r3.addAll(r2)     // Catch: java.lang.Throwable -> La4
        L79:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            java.util.Iterator r2 = r3.iterator()
        L7e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto La1
            java.lang.Object r4 = r2.next()
            io.grpc.internal.y1$r r4 = (io.grpc.internal.y1.r) r4
            r4.a(r9)
            boolean r4 = r4 instanceof io.grpc.internal.y1.y
            if (r4 == 0) goto L92
            r1 = 1
        L92:
            if (r1 == 0) goto L7e
            io.grpc.internal.y1$z r4 = r8.f5797o
            io.grpc.internal.y1$b0 r5 = r4.f5885f
            if (r5 == 0) goto L9d
            if (r5 == r9) goto L9d
            goto La1
        L9d:
            boolean r4 = r4.f5886g
            if (r4 == 0) goto L7e
        La1:
            r2 = r6
            goto L4
        La4:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La4
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.y1.c0(io.grpc.internal.y1$b0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        Future<?> future;
        synchronized (this.f5791i) {
            u uVar = this.f5802t;
            future = null;
            if (uVar != null) {
                Future<?> b5 = uVar.b();
                this.f5802t = null;
                future = b5;
            }
            this.f5797o = this.f5797o.d();
        }
        if (future != null) {
            future.cancel(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e0(z zVar) {
        return zVar.f5885f == null && zVar.f5884e < this.f5789g.f5648a && !zVar.f5887h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(Integer num) {
        if (num == null) {
            return;
        }
        if (num.intValue() < 0) {
            d0();
            return;
        }
        synchronized (this.f5791i) {
            u uVar = this.f5802t;
            if (uVar == null) {
                return;
            }
            Future<?> b5 = uVar.b();
            u uVar2 = new u(this.f5791i);
            this.f5802t = uVar2;
            if (b5 != null) {
                b5.cancel(false);
            }
            uVar2.c(this.f5786d.schedule(new w(uVar2), num.intValue(), TimeUnit.MILLISECONDS));
        }
    }

    @Override // io.grpc.internal.q
    public final void a(int r22) {
        b0(new k(r22));
    }

    @Override // io.grpc.internal.i2
    public final void b(b3.n nVar) {
        b0(new d(nVar));
    }

    @Override // io.grpc.internal.q
    public final void c(b3.f1 f1Var) {
        b0 b0Var = new b0(0);
        b0Var.f5828a = new n1();
        Runnable Y = Y(b0Var);
        if (Y != null) {
            Y.run();
            this.f5785c.execute(new q(f1Var));
            return;
        }
        b0 b0Var2 = null;
        synchronized (this.f5791i) {
            if (this.f5797o.f5882c.contains(this.f5797o.f5885f)) {
                b0Var2 = this.f5797o.f5885f;
            } else {
                this.f5804v = f1Var;
            }
            this.f5797o = this.f5797o.b();
        }
        if (b0Var2 != null) {
            b0Var2.f5828a.c(f1Var);
        }
    }

    @Override // io.grpc.internal.i2
    public final void d(int r32) {
        z zVar = this.f5797o;
        if (zVar.f5880a) {
            zVar.f5885f.f5828a.d(r32);
        } else {
            b0(new m(r32));
        }
    }

    @Override // io.grpc.internal.q
    public final void e(int r22) {
        b0(new j(r22));
    }

    @Override // io.grpc.internal.i2
    public final boolean f() {
        Iterator<b0> it = this.f5797o.f5882c.iterator();
        while (it.hasNext()) {
            if (it.next().f5828a.f()) {
                return true;
            }
        }
        return false;
    }

    abstract io.grpc.internal.q f0(b3.u0 u0Var, k.a aVar, int r32, boolean z4);

    @Override // io.grpc.internal.i2
    public final void flush() {
        z zVar = this.f5797o;
        if (zVar.f5880a) {
            zVar.f5885f.f5828a.flush();
        } else {
            b0(new g());
        }
    }

    @Override // io.grpc.internal.q
    public final void g(b3.t tVar) {
        b0(new e(tVar));
    }

    abstract void g0();

    @Override // io.grpc.internal.i2
    public final void h(InputStream inputStream) {
        throw new IllegalStateException("RetriableStream.writeMessage() should not be called directly");
    }

    abstract b3.f1 h0();

    @Override // io.grpc.internal.q
    public final void i(io.grpc.internal.r rVar) {
        c0 c0Var;
        this.f5800r = rVar;
        b3.f1 h02 = h0();
        if (h02 != null) {
            c(h02);
            return;
        }
        synchronized (this.f5791i) {
            this.f5797o.f5881b.add(new y());
        }
        b0 a02 = a0(0, false);
        if (this.f5790h) {
            u uVar = null;
            synchronized (this.f5791i) {
                this.f5797o = this.f5797o.a(a02);
                if (e0(this.f5797o) && ((c0Var = this.f5795m) == null || c0Var.a())) {
                    uVar = new u(this.f5791i);
                    this.f5802t = uVar;
                }
            }
            if (uVar != null) {
                uVar.c(this.f5786d.schedule(new w(uVar), this.f5789g.f5649b, TimeUnit.NANOSECONDS));
            }
        }
        c0(a02);
    }

    @Override // io.grpc.internal.q
    public final void j(String str) {
        b0(new b(str));
    }

    final void j0(ReqT reqt) {
        z zVar = this.f5797o;
        if (zVar.f5880a) {
            zVar.f5885f.f5828a.h(this.f5783a.j(reqt));
        } else {
            b0(new n(reqt));
        }
    }

    @Override // io.grpc.internal.q
    public final void k(b3.v vVar) {
        b0(new f(vVar));
    }

    final b3.u0 k0(b3.u0 u0Var, int r32) {
        b3.u0 u0Var2 = new b3.u0();
        u0Var2.m(u0Var);
        if (r32 > 0) {
            u0Var2.p(f5780x, String.valueOf(r32));
        }
        return u0Var2;
    }

    @Override // io.grpc.internal.q
    public void l(w0 w0Var) {
        z zVar;
        w0 w0Var2;
        String str;
        synchronized (this.f5791i) {
            w0Var.b("closed", this.f5796n);
            zVar = this.f5797o;
        }
        if (zVar.f5885f != null) {
            w0Var2 = new w0();
            zVar.f5885f.f5828a.l(w0Var2);
            str = "committed";
        } else {
            w0Var2 = new w0();
            for (b0 b0Var : zVar.f5882c) {
                w0 w0Var3 = new w0();
                b0Var.f5828a.l(w0Var3);
                w0Var2.a(w0Var3);
            }
            str = "open";
        }
        w0Var.b(str, w0Var2);
    }

    @Override // io.grpc.internal.i2
    public void m() {
        b0(new l());
    }

    @Override // io.grpc.internal.q
    public final void n() {
        b0(new i());
    }

    @Override // io.grpc.internal.q
    public final void q(boolean z4) {
        b0(new h(z4));
    }
}
