package io.grpc.internal;

import b3.d0;
import b3.e0;
import b3.f;
import b3.g;
import b3.j1;
import b3.k;
import b3.n0;
import b3.w0;
import io.grpc.internal.i1;
import io.grpc.internal.j;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.m;
import io.grpc.internal.p;
import io.grpc.internal.x0;
import io.grpc.internal.y1;
import java.lang.Thread;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class f1 extends b3.q0 implements b3.g0<Object> {

    /* renamed from: n0, reason: collision with root package name */
    static final Logger f5179n0 = Logger.getLogger(f1.class.getName());

    /* renamed from: o0, reason: collision with root package name */
    static final Pattern f5180o0 = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    /* renamed from: p0, reason: collision with root package name */
    static final b3.f1 f5181p0;

    /* renamed from: q0, reason: collision with root package name */
    static final b3.f1 f5182q0;

    /* renamed from: r0, reason: collision with root package name */
    static final b3.f1 f5183r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final i1 f5184s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final b3.e0 f5185t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final b3.g<Object, Object> f5186u0;
    private final b3.d A;
    private final String B;
    private b3.w0 C;
    private boolean D;
    private u E;
    private volatile n0.i F;
    private boolean G;
    private final Set<x0> H;
    private Collection<w.g<?, ?>> I;
    private final Object J;
    private final Set<p1> K;
    private final io.grpc.internal.a0 L;
    private final a0 M;
    private final AtomicBoolean N;
    private boolean O;
    private boolean P;
    private volatile boolean Q;
    private final CountDownLatch R;
    private final m.b S;
    private final io.grpc.internal.m T;
    private final io.grpc.internal.o U;
    private final b3.f V;
    private final b3.c0 W;
    private final w X;
    private x Y;
    private i1 Z;

    /* renamed from: a, reason: collision with root package name */
    private final b3.h0 f5187a;

    /* renamed from: a0, reason: collision with root package name */
    private final i1 f5188a0;

    /* renamed from: b, reason: collision with root package name */
    private final String f5189b;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f5190b0;

    /* renamed from: c, reason: collision with root package name */
    private final String f5191c;

    /* renamed from: c0, reason: collision with root package name */
    private final boolean f5192c0;

    /* renamed from: d, reason: collision with root package name */
    private final b3.y0 f5193d;

    /* renamed from: d0, reason: collision with root package name */
    private final y1.t f5194d0;

    /* renamed from: e, reason: collision with root package name */
    private final w0.d f5195e;

    /* renamed from: e0, reason: collision with root package name */
    private final long f5196e0;

    /* renamed from: f, reason: collision with root package name */
    private final w0.b f5197f;

    /* renamed from: f0, reason: collision with root package name */
    private final long f5198f0;

    /* renamed from: g, reason: collision with root package name */
    private final io.grpc.internal.j f5199g;

    /* renamed from: g0, reason: collision with root package name */
    private final boolean f5200g0;

    /* renamed from: h, reason: collision with root package name */
    private final io.grpc.internal.t f5201h;

    /* renamed from: h0, reason: collision with root package name */
    private final j1.a f5202h0;

    /* renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.t f5203i;

    /* renamed from: i0, reason: collision with root package name */
    final v0<Object> f5204i0;

    /* renamed from: j, reason: collision with root package name */
    private final io.grpc.internal.t f5205j;

    /* renamed from: j0, reason: collision with root package name */
    private j1.c f5206j0;

    /* renamed from: k, reason: collision with root package name */
    private final y f5207k;

    /* renamed from: k0, reason: collision with root package name */
    private io.grpc.internal.k f5208k0;

    /* renamed from: l, reason: collision with root package name */
    private final Executor f5209l;

    /* renamed from: l0, reason: collision with root package name */
    private final p.e f5210l0;

    /* renamed from: m, reason: collision with root package name */
    private final o1<? extends Executor> f5211m;

    /* renamed from: m0, reason: collision with root package name */
    private final x1 f5212m0;

    /* renamed from: n, reason: collision with root package name */
    private final o1<? extends Executor> f5213n;

    /* renamed from: o, reason: collision with root package name */
    private final r f5214o;

    /* renamed from: p, reason: collision with root package name */
    private final r f5215p;

    /* renamed from: q, reason: collision with root package name */
    private final k2 f5216q;

    /* renamed from: r, reason: collision with root package name */
    private final int f5217r;

    /* renamed from: s, reason: collision with root package name */
    final b3.j1 f5218s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f5219t;

    /* renamed from: u, reason: collision with root package name */
    private final b3.v f5220u;

    /* renamed from: v, reason: collision with root package name */
    private final b3.o f5221v;

    /* renamed from: w, reason: collision with root package name */
    private final q0.p<q0.n> f5222w;

    /* renamed from: x, reason: collision with root package name */
    private final long f5223x;

    /* renamed from: y, reason: collision with root package name */
    private final io.grpc.internal.w f5224y;

    /* renamed from: z, reason: collision with root package name */
    private final k.a f5225z;

    class a extends b3.e0 {
        a() {
        }

        @Override // b3.e0
        public e0.b a(n0.f fVar) {
            throw new IllegalStateException("Resolution is pending");
        }
    }

    private final class a0 {

        /* renamed from: a, reason: collision with root package name */
        final Object f5226a;

        /* renamed from: b, reason: collision with root package name */
        Collection<io.grpc.internal.q> f5227b;

        /* renamed from: c, reason: collision with root package name */
        b3.f1 f5228c;

        private a0() {
            this.f5226a = new Object();
            this.f5227b = new HashSet();
        }

        /* synthetic */ a0(f1 f1Var, a aVar) {
            this();
        }

        b3.f1 a(y1<?> y1Var) {
            synchronized (this.f5226a) {
                b3.f1 f1Var = this.f5228c;
                if (f1Var != null) {
                    return f1Var;
                }
                this.f5227b.add(y1Var);
                return null;
            }
        }

        void b(b3.f1 f1Var) {
            synchronized (this.f5226a) {
                if (this.f5228c != null) {
                    return;
                }
                this.f5228c = f1Var;
                boolean isEmpty = this.f5227b.isEmpty();
                if (isEmpty) {
                    f1.this.L.f(f1Var);
                }
            }
        }

        void c(b3.f1 f1Var) {
            ArrayList arrayList;
            b(f1Var);
            synchronized (this.f5226a) {
                arrayList = new ArrayList(this.f5227b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.grpc.internal.q) it.next()).c(f1Var);
            }
            f1.this.L.a(f1Var);
        }

        void d(y1<?> y1Var) {
            b3.f1 f1Var;
            synchronized (this.f5226a) {
                this.f5227b.remove(y1Var);
                if (this.f5227b.isEmpty()) {
                    f1Var = this.f5228c;
                    this.f5227b = new HashSet();
                } else {
                    f1Var = null;
                }
            }
            if (f1Var != null) {
                f1.this.L.f(f1Var);
            }
        }
    }

    final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.A0(true);
        }
    }

    final class c implements m.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f5231a;

        c(k2 k2Var) {
            this.f5231a = k2Var;
        }

        @Override // io.grpc.internal.m.b
        public io.grpc.internal.m a() {
            return new io.grpc.internal.m(this.f5231a);
        }
    }

    final class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f5233e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b3.p f5234f;

        d(Runnable runnable, b3.p pVar) {
            this.f5233e = runnable;
            this.f5234f = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.f5224y.c(this.f5233e, f1.this.f5209l, this.f5234f);
        }
    }

    final class e extends n0.i {

        /* renamed from: a, reason: collision with root package name */
        private final n0.e f5236a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f5237b;

        e(Throwable th) {
            this.f5237b = th;
            this.f5236a = n0.e.e(b3.f1.f770t.q("Panic! This is a bug!").p(th));
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return this.f5236a;
        }

        public String toString() {
            return q0.h.b(e.class).d("panicPickResult", this.f5236a).toString();
        }
    }

    final class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f1.this.N.get() || f1.this.E == null) {
                return;
            }
            f1.this.A0(false);
            f1.this.C0();
        }
    }

    final class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.D0();
            if (f1.this.F != null) {
                f1.this.F.b();
            }
            if (f1.this.E != null) {
                f1.this.E.f5264a.c();
            }
        }
    }

    final class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.V.a(f.a.INFO, "Entering SHUTDOWN state");
            f1.this.f5224y.b(b3.p.SHUTDOWN);
        }
    }

    final class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f1.this.O) {
                return;
            }
            f1.this.O = true;
            f1.this.H0();
        }
    }

    class j implements Thread.UncaughtExceptionHandler {
        j() {
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            f1.f5179n0.log(Level.SEVERE, "[" + f1.this.d() + "] Uncaught exception in the SynchronizationContext. Panic!", th);
            f1.this.J0(th);
        }
    }

    class k implements Executor {
        k() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f1.this.f5215p.a().execute(runnable);
        }
    }

    class l extends m0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f5245b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(b3.w0 w0Var, String str) {
            super(w0Var);
            this.f5245b = str;
        }

        @Override // b3.w0
        public String a() {
            return this.f5245b;
        }
    }

    class m extends b3.g<Object, Object> {
        m() {
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

    private final class n implements p.e {

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.D0();
            }
        }

        final class b<ReqT> extends y1<ReqT> {
            final /* synthetic */ b3.v0 B;
            final /* synthetic */ b3.u0 C;
            final /* synthetic */ b3.c D;
            final /* synthetic */ z1 E;
            final /* synthetic */ s0 F;
            final /* synthetic */ y1.c0 G;
            final /* synthetic */ b3.r H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(b3.v0 v0Var, b3.u0 u0Var, b3.c cVar, z1 z1Var, s0 s0Var, y1.c0 c0Var, b3.r rVar) {
                super(v0Var, u0Var, f1.this.f5194d0, f1.this.f5196e0, f1.this.f5198f0, f1.this.E0(cVar), f1.this.f5203i.B(), z1Var, s0Var, c0Var);
                this.B = v0Var;
                this.C = u0Var;
                this.D = cVar;
                this.E = z1Var;
                this.F = s0Var;
                this.G = c0Var;
                this.H = rVar;
            }

            @Override // io.grpc.internal.y1
            io.grpc.internal.q f0(b3.u0 u0Var, k.a aVar, int r5, boolean z4) {
                b3.c q4 = this.D.q(aVar);
                b3.k[] f5 = q0.f(q4, u0Var, r5, z4);
                io.grpc.internal.s c5 = n.this.c(new s1(this.B, u0Var, q4));
                b3.r b5 = this.H.b();
                try {
                    return c5.c(this.B, u0Var, q4, f5);
                } finally {
                    this.H.f(b5);
                }
            }

            @Override // io.grpc.internal.y1
            void g0() {
                f1.this.M.d(this);
            }

            @Override // io.grpc.internal.y1
            b3.f1 h0() {
                return f1.this.M.a(this);
            }
        }

        private n() {
        }

        /* synthetic */ n(f1 f1Var, a aVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public io.grpc.internal.s c(n0.f fVar) {
            n0.i iVar = f1.this.F;
            if (!f1.this.N.get()) {
                if (iVar == null) {
                    f1.this.f5218s.execute(new a());
                } else {
                    io.grpc.internal.s j4 = q0.j(iVar.a(fVar), fVar.a().j());
                    if (j4 != null) {
                        return j4;
                    }
                }
            }
            return f1.this.L;
        }

        @Override // io.grpc.internal.p.e
        public io.grpc.internal.q a(b3.v0<?, ?> v0Var, b3.c cVar, b3.u0 u0Var, b3.r rVar) {
            if (f1.this.f5200g0) {
                y1.c0 g5 = f1.this.Z.g();
                i1.b bVar = (i1.b) cVar.h(i1.b.f5381g);
                return new b(v0Var, u0Var, cVar, bVar == null ? null : bVar.f5386e, bVar == null ? null : bVar.f5387f, g5, rVar);
            }
            io.grpc.internal.s c5 = c(new s1(v0Var, u0Var, cVar));
            b3.r b5 = rVar.b();
            try {
                return c5.c(v0Var, u0Var, cVar, q0.f(cVar, u0Var, 0, false));
            } finally {
                rVar.f(b5);
            }
        }
    }

    static final class o<ReqT, RespT> extends b3.z<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        private final b3.e0 f5248a;

        /* renamed from: b, reason: collision with root package name */
        private final b3.d f5249b;

        /* renamed from: c, reason: collision with root package name */
        private final Executor f5250c;

        /* renamed from: d, reason: collision with root package name */
        private final b3.v0<ReqT, RespT> f5251d;

        /* renamed from: e, reason: collision with root package name */
        private final b3.r f5252e;

        /* renamed from: f, reason: collision with root package name */
        private b3.c f5253f;

        /* renamed from: g, reason: collision with root package name */
        private b3.g<ReqT, RespT> f5254g;

        class a extends io.grpc.internal.x {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g.a f5255f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5256g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g.a aVar, b3.f1 f1Var) {
                super(o.this.f5252e);
                this.f5255f = aVar;
                this.f5256g = f1Var;
            }

            @Override // io.grpc.internal.x
            public void a() {
                this.f5255f.a(this.f5256g, new b3.u0());
            }
        }

        o(b3.e0 e0Var, b3.d dVar, Executor executor, b3.v0<ReqT, RespT> v0Var, b3.c cVar) {
            this.f5248a = e0Var;
            this.f5249b = dVar;
            this.f5251d = v0Var;
            executor = cVar.e() != null ? cVar.e() : executor;
            this.f5250c = executor;
            this.f5253f = cVar.m(executor);
            this.f5252e = b3.r.e();
        }

        private void h(g.a<RespT> aVar, b3.f1 f1Var) {
            this.f5250c.execute(new a(aVar, f1Var));
        }

        @Override // b3.z, b3.z0, b3.g
        public void a(String str, Throwable th) {
            b3.g<ReqT, RespT> gVar = this.f5254g;
            if (gVar != null) {
                gVar.a(str, th);
            }
        }

        @Override // b3.z, b3.g
        public void e(g.a<RespT> aVar, b3.u0 u0Var) {
            e0.b a5 = this.f5248a.a(new s1(this.f5251d, u0Var, this.f5253f));
            b3.f1 c5 = a5.c();
            if (!c5.o()) {
                h(aVar, c5);
                this.f5254g = f1.f5186u0;
                return;
            }
            b3.h b5 = a5.b();
            i1.b f5 = ((i1) a5.a()).f(this.f5251d);
            if (f5 != null) {
                this.f5253f = this.f5253f.p(i1.b.f5381g, f5);
            }
            this.f5254g = b5 != null ? b5.a(this.f5251d, this.f5253f, this.f5249b) : this.f5249b.h(this.f5251d, this.f5253f);
            this.f5254g.e(aVar, u0Var);
        }

        @Override // b3.z, b3.z0
        protected b3.g<ReqT, RespT> f() {
            return this.f5254g;
        }
    }

    class p implements Runnable {
        p() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f1.this.f5206j0 = null;
            f1.this.L0();
        }
    }

    private final class q implements j1.a {
        private q() {
        }

        /* synthetic */ q(f1 f1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.j1.a
        public void a() {
            q0.l.u(f1.this.N.get(), "Channel must have been shut down");
            f1.this.P = true;
            f1.this.O0(false);
            f1.this.H0();
            f1.this.I0();
        }

        @Override // io.grpc.internal.j1.a
        public void b() {
        }

        @Override // io.grpc.internal.j1.a
        public void c(b3.f1 f1Var) {
            q0.l.u(f1.this.N.get(), "Channel must have been shut down");
        }

        @Override // io.grpc.internal.j1.a
        public void d(boolean z4) {
            f1 f1Var = f1.this;
            f1Var.f5204i0.e(f1Var.L, z4);
        }
    }

    private static final class r {

        /* renamed from: a, reason: collision with root package name */
        private final o1<? extends Executor> f5260a;

        /* renamed from: b, reason: collision with root package name */
        private Executor f5261b;

        r(o1<? extends Executor> o1Var) {
            this.f5260a = (o1) q0.l.o(o1Var, "executorPool");
        }

        synchronized Executor a() {
            if (this.f5261b == null) {
                this.f5261b = (Executor) q0.l.p(this.f5260a.a(), "%s.getObject()", this.f5261b);
            }
            return this.f5261b;
        }

        synchronized void b() {
            Executor executor = this.f5261b;
            if (executor != null) {
                this.f5261b = this.f5260a.b(executor);
            }
        }
    }

    private final class s extends v0<Object> {
        private s() {
        }

        /* synthetic */ s(f1 f1Var, a aVar) {
            this();
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            f1.this.D0();
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            if (f1.this.N.get()) {
                return;
            }
            f1.this.M0();
        }
    }

    private class t implements Runnable {
        private t() {
        }

        /* synthetic */ t(f1 f1Var, a aVar) {
            this();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f1.this.E == null) {
                return;
            }
            f1.this.C0();
        }
    }

    private final class u extends n0.d {

        /* renamed from: a, reason: collision with root package name */
        j.b f5264a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5265b;

        /* renamed from: c, reason: collision with root package name */
        boolean f5266c;

        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.K0();
            }
        }

        final class b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ n0.i f5269e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ b3.p f5270f;

            b(n0.i iVar, b3.p pVar) {
                this.f5269e = iVar;
                this.f5270f = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                u uVar = u.this;
                if (uVar != f1.this.E) {
                    return;
                }
                f1.this.Q0(this.f5269e);
                if (this.f5270f != b3.p.SHUTDOWN) {
                    f1.this.V.b(f.a.INFO, "Entering {0} state with picker: {1}", this.f5270f, this.f5269e);
                    f1.this.f5224y.b(this.f5270f);
                }
            }
        }

        private u() {
        }

        /* synthetic */ u(f1 f1Var, a aVar) {
            this();
        }

        @Override // b3.n0.d
        public b3.f b() {
            return f1.this.V;
        }

        @Override // b3.n0.d
        public b3.j1 c() {
            return f1.this.f5218s;
        }

        @Override // b3.n0.d
        public void d() {
            f1.this.f5218s.d();
            this.f5265b = true;
            f1.this.f5218s.execute(new a());
        }

        @Override // b3.n0.d
        public void e(b3.p pVar, n0.i iVar) {
            f1.this.f5218s.d();
            q0.l.o(pVar, "newState");
            q0.l.o(iVar, "newPicker");
            f1.this.f5218s.execute(new b(iVar, pVar));
        }

        @Override // b3.n0.d
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public io.grpc.internal.e a(n0.b bVar) {
            f1.this.f5218s.d();
            q0.l.u(!f1.this.P, "Channel is being terminated");
            return f1.this.new z(bVar, this);
        }
    }

    private final class v extends w0.e {

        /* renamed from: a, reason: collision with root package name */
        final u f5272a;

        /* renamed from: b, reason: collision with root package name */
        final b3.w0 f5273b;

        final class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5275e;

            a(b3.f1 f1Var) {
                this.f5275e = f1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                v.this.e(this.f5275e);
            }
        }

        final class b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ w0.g f5277e;

            b(w0.g gVar) {
                this.f5277e = gVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 576
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.f1.v.b.run():void");
            }
        }

        v(u uVar, b3.w0 w0Var) {
            this.f5272a = (u) q0.l.o(uVar, "helperImpl");
            this.f5273b = (b3.w0) q0.l.o(w0Var, "resolver");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e(b3.f1 f1Var) {
            f1.f5179n0.log(Level.WARNING, "[{0}] Failed to resolve name. status={1}", new Object[]{f1.this.d(), f1Var});
            f1.this.X.m();
            x xVar = f1.this.Y;
            x xVar2 = x.ERROR;
            if (xVar != xVar2) {
                f1.this.V.b(f.a.WARNING, "Failed to resolve name: {0}", f1Var);
                f1.this.Y = xVar2;
            }
            if (this.f5272a != f1.this.E) {
                return;
            }
            this.f5272a.f5264a.b(f1Var);
            f();
        }

        private void f() {
            if (f1.this.f5206j0 == null || !f1.this.f5206j0.b()) {
                if (f1.this.f5208k0 == null) {
                    f1 f1Var = f1.this;
                    f1Var.f5208k0 = f1Var.f5225z.get();
                }
                long a5 = f1.this.f5208k0.a();
                f1.this.V.b(f.a.DEBUG, "Scheduling DNS resolution backoff for {0} ns", Long.valueOf(a5));
                f1 f1Var2 = f1.this;
                f1Var2.f5206j0 = f1Var2.f5218s.c(f1Var2.new p(), a5, TimeUnit.NANOSECONDS, f1.this.f5203i.B());
            }
        }

        @Override // b3.w0.e, b3.w0.f
        public void b(b3.f1 f1Var) {
            q0.l.e(!f1Var.o(), "the error status must not be OK");
            f1.this.f5218s.execute(new a(f1Var));
        }

        @Override // b3.w0.e
        public void c(w0.g gVar) {
            f1.this.f5218s.execute(new b(gVar));
        }
    }

    private class w extends b3.d {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicReference<b3.e0> f5279a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5280b;

        /* renamed from: c, reason: collision with root package name */
        private final b3.d f5281c;

        class a extends b3.d {
            a() {
            }

            @Override // b3.d
            public String b() {
                return w.this.f5280b;
            }

            @Override // b3.d
            public <RequestT, ResponseT> b3.g<RequestT, ResponseT> h(b3.v0<RequestT, ResponseT> v0Var, b3.c cVar) {
                return new io.grpc.internal.p(v0Var, f1.this.E0(cVar), cVar, f1.this.f5210l0, f1.this.Q ? null : f1.this.f5203i.B(), f1.this.T, null).B(f1.this.f5219t).A(f1.this.f5220u).z(f1.this.f5221v);
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (f1.this.I == null) {
                    if (w.this.f5279a.get() == f1.f5185t0) {
                        w.this.f5279a.set(null);
                    }
                    f1.this.M.b(f1.f5182q0);
                }
            }
        }

        final class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f5279a.get() == f1.f5185t0) {
                    w.this.f5279a.set(null);
                }
                if (f1.this.I != null) {
                    Iterator it = f1.this.I.iterator();
                    while (it.hasNext()) {
                        ((g) it.next()).a("Channel is forcefully shutdown", null);
                    }
                }
                f1.this.M.c(f1.f5181p0);
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f1.this.D0();
            }
        }

        /* JADX INFO: Add missing generic type declarations: [ReqT, RespT] */
        class e<ReqT, RespT> extends b3.g<ReqT, RespT> {
            e() {
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
            public void d(ReqT reqt) {
            }

            @Override // b3.g
            public void e(g.a<RespT> aVar, b3.u0 u0Var) {
                aVar.a(f1.f5182q0, new b3.u0());
            }
        }

        class f implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f5288e;

            f(g gVar) {
                this.f5288e = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (w.this.f5279a.get() != f1.f5185t0) {
                    this.f5288e.p();
                    return;
                }
                if (f1.this.I == null) {
                    f1.this.I = new LinkedHashSet();
                    f1 f1Var = f1.this;
                    f1Var.f5204i0.e(f1Var.J, true);
                }
                f1.this.I.add(this.f5288e);
            }
        }

        private final class g<ReqT, RespT> extends io.grpc.internal.z<ReqT, RespT> {

            /* renamed from: l, reason: collision with root package name */
            final b3.r f5290l;

            /* renamed from: m, reason: collision with root package name */
            final b3.v0<ReqT, RespT> f5291m;

            /* renamed from: n, reason: collision with root package name */
            final b3.c f5292n;

            class a implements Runnable {
                a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    b3.r b5 = g.this.f5290l.b();
                    try {
                        g gVar = g.this;
                        b3.g<ReqT, RespT> l4 = w.this.l(gVar.f5291m, gVar.f5292n);
                        g.this.f5290l.f(b5);
                        g.this.n(l4);
                        g gVar2 = g.this;
                        f1.this.f5218s.execute(new b());
                    } catch (Throwable th) {
                        g.this.f5290l.f(b5);
                        throw th;
                    }
                }
            }

            final class b implements Runnable {
                b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (f1.this.I != null) {
                        f1.this.I.remove(g.this);
                        if (f1.this.I.isEmpty()) {
                            f1 f1Var = f1.this;
                            f1Var.f5204i0.e(f1Var.J, false);
                            f1.this.I = null;
                            if (f1.this.N.get()) {
                                f1.this.M.b(f1.f5182q0);
                            }
                        }
                    }
                }
            }

            g(b3.r rVar, b3.v0<ReqT, RespT> v0Var, b3.c cVar) {
                super(f1.this.E0(cVar), f1.this.f5207k, cVar.d());
                this.f5290l = rVar;
                this.f5291m = v0Var;
                this.f5292n = cVar;
            }

            @Override // io.grpc.internal.z
            protected void i() {
                super.i();
                f1.this.f5218s.execute(new b());
            }

            void p() {
                f1.this.E0(this.f5292n).execute(new a());
            }
        }

        private w(String str) {
            this.f5279a = new AtomicReference<>(f1.f5185t0);
            this.f5281c = new a();
            this.f5280b = (String) q0.l.o(str, "authority");
        }

        /* synthetic */ w(f1 f1Var, String str, a aVar) {
            this(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <ReqT, RespT> b3.g<ReqT, RespT> l(b3.v0<ReqT, RespT> v0Var, b3.c cVar) {
            b3.e0 e0Var = this.f5279a.get();
            if (e0Var != null) {
                if (!(e0Var instanceof i1.c)) {
                    return new o(e0Var, this.f5281c, f1.this.f5209l, v0Var, cVar);
                }
                i1.b f5 = ((i1.c) e0Var).f5388b.f(v0Var);
                if (f5 != null) {
                    cVar = cVar.p(i1.b.f5381g, f5);
                }
            }
            return this.f5281c.h(v0Var, cVar);
        }

        @Override // b3.d
        public String b() {
            return this.f5280b;
        }

        @Override // b3.d
        public <ReqT, RespT> b3.g<ReqT, RespT> h(b3.v0<ReqT, RespT> v0Var, b3.c cVar) {
            if (this.f5279a.get() != f1.f5185t0) {
                return l(v0Var, cVar);
            }
            f1.this.f5218s.execute(new d());
            if (this.f5279a.get() != f1.f5185t0) {
                return l(v0Var, cVar);
            }
            if (f1.this.N.get()) {
                return new e();
            }
            g gVar = new g(b3.r.e(), v0Var, cVar);
            f1.this.f5218s.execute(new f(gVar));
            return gVar;
        }

        void m() {
            if (this.f5279a.get() == f1.f5185t0) {
                p(null);
            }
        }

        void n() {
            f1.this.f5218s.execute(new b());
        }

        void o() {
            f1.this.f5218s.execute(new c());
        }

        void p(b3.e0 e0Var) {
            b3.e0 e0Var2 = this.f5279a.get();
            this.f5279a.set(e0Var);
            if (e0Var2 != f1.f5185t0 || f1.this.I == null) {
                return;
            }
            Iterator it = f1.this.I.iterator();
            while (it.hasNext()) {
                ((g) it.next()).p();
            }
        }
    }

    enum x {
        NO_RESOLUTION,
        SUCCESS,
        ERROR
    }

    private static final class y implements ScheduledExecutorService {

        /* renamed from: e, reason: collision with root package name */
        final ScheduledExecutorService f5300e;

        private y(ScheduledExecutorService scheduledExecutorService) {
            this.f5300e = (ScheduledExecutorService) q0.l.o(scheduledExecutorService, "delegate");
        }

        /* synthetic */ y(ScheduledExecutorService scheduledExecutorService, a aVar) {
            this(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean awaitTermination(long j4, TimeUnit timeUnit) {
            return this.f5300e.awaitTermination(j4, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f5300e.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
            return this.f5300e.invokeAll(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) {
            return this.f5300e.invokeAll(collection, j4, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
            return (T) this.f5300e.invokeAny(collection);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j4, TimeUnit timeUnit) {
            return (T) this.f5300e.invokeAny(collection, j4, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isShutdown() {
            return this.f5300e.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public boolean isTerminated() {
            return this.f5300e.isTerminated();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
            return this.f5300e.schedule(runnable, j4, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j4, TimeUnit timeUnit) {
            return this.f5300e.schedule(callable, j4, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
            return this.f5300e.scheduleAtFixedRate(runnable, j4, j5, timeUnit);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j4, long j5, TimeUnit timeUnit) {
            return this.f5300e.scheduleWithFixedDelay(runnable, j4, j5, timeUnit);
        }

        @Override // java.util.concurrent.ExecutorService
        public void shutdown() {
            throw new UnsupportedOperationException("Restricted: shutdown() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public List<Runnable> shutdownNow() {
            throw new UnsupportedOperationException("Restricted: shutdownNow() is not allowed");
        }

        @Override // java.util.concurrent.ExecutorService
        public Future<?> submit(Runnable runnable) {
            return this.f5300e.submit(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Runnable runnable, T t4) {
            return this.f5300e.submit(runnable, t4);
        }

        @Override // java.util.concurrent.ExecutorService
        public <T> Future<T> submit(Callable<T> callable) {
            return this.f5300e.submit(callable);
        }
    }

    private final class z extends io.grpc.internal.e {

        /* renamed from: a, reason: collision with root package name */
        final n0.b f5301a;

        /* renamed from: b, reason: collision with root package name */
        final u f5302b;

        /* renamed from: c, reason: collision with root package name */
        final b3.h0 f5303c;

        /* renamed from: d, reason: collision with root package name */
        final io.grpc.internal.n f5304d;

        /* renamed from: e, reason: collision with root package name */
        final io.grpc.internal.o f5305e;

        /* renamed from: f, reason: collision with root package name */
        List<b3.x> f5306f;

        /* renamed from: g, reason: collision with root package name */
        x0 f5307g;

        /* renamed from: h, reason: collision with root package name */
        boolean f5308h;

        /* renamed from: i, reason: collision with root package name */
        boolean f5309i;

        /* renamed from: j, reason: collision with root package name */
        j1.c f5310j;

        final class a extends x0.j {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ n0.j f5312a;

            a(n0.j jVar) {
                this.f5312a = jVar;
            }

            @Override // io.grpc.internal.x0.j
            void a(x0 x0Var) {
                f1.this.f5204i0.e(x0Var, true);
            }

            @Override // io.grpc.internal.x0.j
            void b(x0 x0Var) {
                f1.this.f5204i0.e(x0Var, false);
            }

            @Override // io.grpc.internal.x0.j
            void c(x0 x0Var, b3.q qVar) {
                q0.l.u(this.f5312a != null, "listener is null");
                this.f5312a.a(qVar);
                if (qVar.c() == b3.p.TRANSIENT_FAILURE || qVar.c() == b3.p.IDLE) {
                    u uVar = z.this.f5302b;
                    if (uVar.f5266c || uVar.f5265b) {
                        return;
                    }
                    f1.f5179n0.log(Level.WARNING, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases");
                    f1.this.K0();
                    z.this.f5302b.f5265b = true;
                }
            }

            @Override // io.grpc.internal.x0.j
            void d(x0 x0Var) {
                f1.this.H.remove(x0Var);
                f1.this.W.k(x0Var);
                f1.this.I0();
            }
        }

        final class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                z.this.f5307g.f(f1.f5183r0);
            }
        }

        z(n0.b bVar, u uVar) {
            this.f5306f = bVar.a();
            if (f1.this.f5191c != null) {
                bVar = bVar.d().e(i(bVar.a())).b();
            }
            this.f5301a = (n0.b) q0.l.o(bVar, "args");
            this.f5302b = (u) q0.l.o(uVar, "helper");
            b3.h0 b5 = b3.h0.b("Subchannel", f1.this.b());
            this.f5303c = b5;
            io.grpc.internal.o oVar = new io.grpc.internal.o(b5, f1.this.f5217r, f1.this.f5216q.a(), "Subchannel for " + bVar.a());
            this.f5305e = oVar;
            this.f5304d = new io.grpc.internal.n(oVar, f1.this.f5216q);
        }

        private List<b3.x> i(List<b3.x> list) {
            ArrayList arrayList = new ArrayList();
            for (b3.x xVar : list) {
                arrayList.add(new b3.x(xVar.a(), xVar.b().d().c(b3.x.f971d).a()));
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // b3.n0.h
        public List<b3.x> b() {
            f1.this.f5218s.d();
            q0.l.u(this.f5308h, "not started");
            return this.f5306f;
        }

        @Override // b3.n0.h
        public b3.a c() {
            return this.f5301a.b();
        }

        @Override // b3.n0.h
        public Object d() {
            q0.l.u(this.f5308h, "Subchannel is not started");
            return this.f5307g;
        }

        @Override // b3.n0.h
        public void e() {
            f1.this.f5218s.d();
            q0.l.u(this.f5308h, "not started");
            this.f5307g.b();
        }

        @Override // b3.n0.h
        public void f() {
            j1.c cVar;
            f1.this.f5218s.d();
            if (this.f5307g == null) {
                this.f5309i = true;
                return;
            }
            if (!this.f5309i) {
                this.f5309i = true;
            } else {
                if (!f1.this.P || (cVar = this.f5310j) == null) {
                    return;
                }
                cVar.a();
                this.f5310j = null;
            }
            if (f1.this.P) {
                this.f5307g.f(f1.f5182q0);
            } else {
                this.f5310j = f1.this.f5218s.c(new c1(new b()), 5L, TimeUnit.SECONDS, f1.this.f5203i.B());
            }
        }

        @Override // b3.n0.h
        public void g(n0.j jVar) {
            f1.this.f5218s.d();
            q0.l.u(!this.f5308h, "already started");
            q0.l.u(!this.f5309i, "already shutdown");
            q0.l.u(!f1.this.P, "Channel is being terminated");
            this.f5308h = true;
            x0 x0Var = new x0(this.f5301a.a(), f1.this.b(), f1.this.B, f1.this.f5225z, f1.this.f5203i, f1.this.f5203i.B(), f1.this.f5222w, f1.this.f5218s, new a(jVar), f1.this.W, f1.this.S.a(), this.f5305e, this.f5303c, this.f5304d);
            f1.this.U.e(new d0.a().b("Child Subchannel started").c(d0.b.CT_INFO).e(f1.this.f5216q.a()).d(x0Var).a());
            this.f5307g = x0Var;
            f1.this.W.e(x0Var);
            f1.this.H.add(x0Var);
        }

        @Override // b3.n0.h
        public void h(List<b3.x> list) {
            f1.this.f5218s.d();
            this.f5306f = list;
            if (f1.this.f5191c != null) {
                list = i(list);
            }
            this.f5307g.U(list);
        }

        public String toString() {
            return this.f5303c.toString();
        }
    }

    static {
        b3.f1 f1Var = b3.f1.f771u;
        f5181p0 = f1Var.q("Channel shutdownNow invoked");
        f5182q0 = f1Var.q("Channel shutdown invoked");
        f5183r0 = f1Var.q("Subchannel shutdown invoked");
        f5184s0 = i1.a();
        f5185t0 = new a();
        f5186u0 = new m();
    }

    f1(g1 g1Var, io.grpc.internal.t tVar, k.a aVar, o1<? extends Executor> o1Var, q0.p<q0.n> pVar, List<b3.h> list, k2 k2Var) {
        a aVar2;
        b3.j1 j1Var = new b3.j1(new j());
        this.f5218s = j1Var;
        this.f5224y = new io.grpc.internal.w();
        this.H = new HashSet(16, 0.75f);
        this.J = new Object();
        this.K = new HashSet(1, 0.75f);
        a aVar3 = null;
        this.M = new a0(this, aVar3);
        this.N = new AtomicBoolean(false);
        this.R = new CountDownLatch(1);
        this.Y = x.NO_RESOLUTION;
        this.Z = f5184s0;
        this.f5190b0 = false;
        this.f5194d0 = new y1.t();
        q qVar = new q(this, aVar3);
        this.f5202h0 = qVar;
        this.f5204i0 = new s(this, aVar3);
        this.f5210l0 = new n(this, aVar3);
        String str = (String) q0.l.o(g1Var.f5332f, "target");
        this.f5189b = str;
        b3.h0 b5 = b3.h0.b("Channel", str);
        this.f5187a = b5;
        this.f5216q = (k2) q0.l.o(k2Var, "timeProvider");
        o1<? extends Executor> o1Var2 = (o1) q0.l.o(g1Var.f5327a, "executorPool");
        this.f5211m = o1Var2;
        Executor executor = (Executor) q0.l.o(o1Var2.a(), "executor");
        this.f5209l = executor;
        this.f5201h = tVar;
        io.grpc.internal.l lVar = new io.grpc.internal.l(tVar, g1Var.f5333g, executor);
        this.f5203i = lVar;
        this.f5205j = new io.grpc.internal.l(tVar, null, executor);
        y yVar = new y(lVar.B(), aVar3);
        this.f5207k = yVar;
        this.f5217r = g1Var.f5348v;
        io.grpc.internal.o oVar = new io.grpc.internal.o(b5, g1Var.f5348v, k2Var.a(), "Channel for '" + str + "'");
        this.U = oVar;
        io.grpc.internal.n nVar = new io.grpc.internal.n(oVar, k2Var);
        this.V = nVar;
        b3.c1 c1Var = g1Var.f5351y;
        c1Var = c1Var == null ? q0.f5578p : c1Var;
        boolean z4 = g1Var.f5346t;
        this.f5200g0 = z4;
        io.grpc.internal.j jVar = new io.grpc.internal.j(g1Var.f5337k);
        this.f5199g = jVar;
        this.f5215p = new r((o1) q0.l.o(g1Var.f5328b, "offloadExecutorPool"));
        this.f5193d = g1Var.f5330d;
        a2 a2Var = new a2(z4, g1Var.f5342p, g1Var.f5343q, jVar);
        w0.b a5 = w0.b.f().c(g1Var.e()).e(c1Var).h(j1Var).f(yVar).g(a2Var).b(nVar).d(new k()).a();
        this.f5197f = a5;
        String str2 = g1Var.f5336j;
        this.f5191c = str2;
        w0.d dVar = g1Var.f5331e;
        this.f5195e = dVar;
        this.C = G0(str, str2, dVar, a5);
        this.f5213n = (o1) q0.l.o(o1Var, "balancerRpcExecutorPool");
        this.f5214o = new r(o1Var);
        io.grpc.internal.a0 a0Var = new io.grpc.internal.a0(executor, j1Var);
        this.L = a0Var;
        a0Var.e(qVar);
        this.f5225z = aVar;
        Map<String, ?> map = g1Var.f5349w;
        if (map != null) {
            w0.c a6 = a2Var.a(map);
            q0.l.w(a6.d() == null, "Default config is invalid: %s", a6.d());
            i1 i1Var = (i1) a6.c();
            this.f5188a0 = i1Var;
            this.Z = i1Var;
            aVar2 = null;
        } else {
            aVar2 = null;
            this.f5188a0 = null;
        }
        boolean z5 = g1Var.f5350x;
        this.f5192c0 = z5;
        w wVar = new w(this, this.C.a(), aVar2);
        this.X = wVar;
        this.A = b3.j.a(wVar, list);
        this.f5222w = (q0.p) q0.l.o(pVar, "stopwatchSupplier");
        long j4 = g1Var.f5341o;
        if (j4 != -1) {
            q0.l.i(j4 >= g1.J, "invalid idleTimeoutMillis %s", j4);
            j4 = g1Var.f5341o;
        }
        this.f5223x = j4;
        this.f5212m0 = new x1(new t(this, null), j1Var, lVar.B(), pVar.get());
        this.f5219t = g1Var.f5338l;
        this.f5220u = (b3.v) q0.l.o(g1Var.f5339m, "decompressorRegistry");
        this.f5221v = (b3.o) q0.l.o(g1Var.f5340n, "compressorRegistry");
        this.B = g1Var.f5335i;
        this.f5198f0 = g1Var.f5344r;
        this.f5196e0 = g1Var.f5345s;
        c cVar = new c(k2Var);
        this.S = cVar;
        this.T = cVar.a();
        b3.c0 c0Var = (b3.c0) q0.l.n(g1Var.f5347u);
        this.W = c0Var;
        c0Var.d(this);
        if (z5) {
            return;
        }
        if (this.f5188a0 != null) {
            nVar.a(f.a.INFO, "Service config look-up disabled, using default service config");
        }
        this.f5190b0 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(boolean z4) {
        this.f5212m0.i(z4);
    }

    private void B0() {
        this.f5218s.d();
        j1.c cVar = this.f5206j0;
        if (cVar != null) {
            cVar.a();
            this.f5206j0 = null;
            this.f5208k0 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        O0(true);
        this.L.r(null);
        this.V.a(f.a.INFO, "Entering IDLE state");
        this.f5224y.b(b3.p.IDLE);
        if (this.f5204i0.a(this.J, this.L)) {
            D0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Executor E0(b3.c cVar) {
        Executor e5 = cVar.e();
        return e5 == null ? this.f5209l : e5;
    }

    private static b3.w0 F0(String str, w0.d dVar, w0.b bVar) {
        URI r22;
        b3.w0 b5;
        StringBuilder sb = new StringBuilder();
        try {
            r22 = new URI(str);
        } catch (URISyntaxException e5) {
            sb.append(e5.getMessage());
            r22 = null;
        }
        if (r22 != null && (b5 = dVar.b(r22, bVar)) != null) {
            return b5;
        }
        String str2 = "";
        if (!f5180o0.matcher(str).matches()) {
            try {
                b3.w0 b6 = dVar.b(new URI(dVar.a(), "", "/" + str, null), bVar);
                if (b6 != null) {
                    return b6;
                }
            } catch (URISyntaxException e6) {
                throw new IllegalArgumentException(e6);
            }
        }
        Object[] objArr = new Object[2];
        objArr[0] = str;
        if (sb.length() > 0) {
            str2 = " (" + ((Object) sb) + ")";
        }
        objArr[1] = str2;
        throw new IllegalArgumentException(String.format("cannot find a NameResolver for %s%s", objArr));
    }

    static b3.w0 G0(String str, String str2, w0.d dVar, w0.b bVar) {
        b3.w0 F0 = F0(str, dVar, bVar);
        return str2 == null ? F0 : new l(F0, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H0() {
        if (this.O) {
            Iterator<x0> it = this.H.iterator();
            while (it.hasNext()) {
                it.next().a(f5181p0);
            }
            Iterator<p1> it2 = this.K.iterator();
            while (it2.hasNext()) {
                it2.next().o().a(f5181p0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I0() {
        if (!this.Q && this.N.get() && this.H.isEmpty() && this.K.isEmpty()) {
            this.V.a(f.a.INFO, "Terminated");
            this.W.j(this);
            this.f5211m.b(this.f5209l);
            this.f5214o.b();
            this.f5215p.b();
            this.f5203i.close();
            this.Q = true;
            this.R.countDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K0() {
        this.f5218s.d();
        B0();
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L0() {
        this.f5218s.d();
        if (this.D) {
            this.C.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M0() {
        long j4 = this.f5223x;
        if (j4 == -1) {
            return;
        }
        this.f5212m0.k(j4, TimeUnit.MILLISECONDS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O0(boolean z4) {
        this.f5218s.d();
        if (z4) {
            q0.l.u(this.D, "nameResolver is not started");
            q0.l.u(this.E != null, "lbHelper is null");
        }
        if (this.C != null) {
            B0();
            this.C.c();
            this.D = false;
            if (z4) {
                this.C = G0(this.f5189b, this.f5191c, this.f5195e, this.f5197f);
            } else {
                this.C = null;
            }
        }
        u uVar = this.E;
        if (uVar != null) {
            uVar.f5264a.d();
            this.E = null;
        }
        this.F = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q0(n0.i iVar) {
        this.F = iVar;
        this.L.r(iVar);
    }

    void D0() {
        this.f5218s.d();
        if (this.N.get() || this.G) {
            return;
        }
        if (this.f5204i0.d()) {
            A0(false);
        } else {
            M0();
        }
        if (this.E != null) {
            return;
        }
        this.V.a(f.a.INFO, "Exiting idle mode");
        u uVar = new u(this, null);
        uVar.f5264a = this.f5199g.e(uVar);
        this.E = uVar;
        this.C.d(new v(uVar, this.C));
        this.D = true;
    }

    void J0(Throwable th) {
        if (this.G) {
            return;
        }
        this.G = true;
        A0(true);
        O0(false);
        Q0(new e(th));
        this.V.a(f.a.ERROR, "PANIC! Entering TRANSIENT_FAILURE");
        this.f5224y.b(b3.p.TRANSIENT_FAILURE);
    }

    @Override // b3.q0
    /* renamed from: N0, reason: merged with bridge method [inline-methods] */
    public f1 m() {
        this.V.a(f.a.DEBUG, "shutdown() called");
        if (!this.N.compareAndSet(false, true)) {
            return this;
        }
        this.f5218s.execute(new h());
        this.X.n();
        this.f5218s.execute(new b());
        return this;
    }

    @Override // b3.q0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public f1 n() {
        this.V.a(f.a.DEBUG, "shutdownNow() called");
        m();
        this.X.o();
        this.f5218s.execute(new i());
        return this;
    }

    @Override // b3.d
    public String b() {
        return this.A.b();
    }

    @Override // b3.l0
    public b3.h0 d() {
        return this.f5187a;
    }

    @Override // b3.d
    public <ReqT, RespT> b3.g<ReqT, RespT> h(b3.v0<ReqT, RespT> v0Var, b3.c cVar) {
        return this.A.h(v0Var, cVar);
    }

    @Override // b3.q0
    public boolean i(long j4, TimeUnit timeUnit) {
        return this.R.await(j4, timeUnit);
    }

    @Override // b3.q0
    public void j() {
        this.f5218s.execute(new f());
    }

    @Override // b3.q0
    public b3.p k(boolean z4) {
        b3.p a5 = this.f5224y.a();
        if (z4 && a5 == b3.p.IDLE) {
            this.f5218s.execute(new g());
        }
        return a5;
    }

    @Override // b3.q0
    public void l(b3.p pVar, Runnable runnable) {
        this.f5218s.execute(new d(runnable, pVar));
    }

    public String toString() {
        return q0.h.c(this).c("logId", this.f5187a.d()).d("target", this.f5189b).toString();
    }
}
