package io.grpc.internal;

import b3.u0;
import io.grpc.internal.d;
import io.grpc.internal.l1;
import io.grpc.internal.r;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class a extends d implements q, l1.d {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f4955g = Logger.getLogger(a.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final n2 f4956a;

    /* renamed from: b, reason: collision with root package name */
    private final o0 f4957b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4958c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4959d;

    /* renamed from: e, reason: collision with root package name */
    private b3.u0 f4960e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f4961f;

    /* renamed from: io.grpc.internal.a$a, reason: collision with other inner class name */
    private class C0054a implements o0 {

        /* renamed from: a, reason: collision with root package name */
        private b3.u0 f4962a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4963b;

        /* renamed from: c, reason: collision with root package name */
        private final h2 f4964c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f4965d;

        public C0054a(b3.u0 u0Var, h2 h2Var) {
            this.f4962a = (b3.u0) q0.l.o(u0Var, "headers");
            this.f4964c = (h2) q0.l.o(h2Var, "statsTraceCtx");
        }

        @Override // io.grpc.internal.o0
        public void a(int r12) {
        }

        @Override // io.grpc.internal.o0
        public o0 b(b3.n nVar) {
            return this;
        }

        @Override // io.grpc.internal.o0
        public boolean c() {
            return this.f4963b;
        }

        @Override // io.grpc.internal.o0
        public void close() {
            this.f4963b = true;
            q0.l.u(this.f4965d != null, "Lack of request message. GET request is only supported for unary requests");
            a.this.v().d(this.f4962a, this.f4965d);
            this.f4965d = null;
            this.f4962a = null;
        }

        @Override // io.grpc.internal.o0
        public void d(InputStream inputStream) {
            q0.l.u(this.f4965d == null, "writePayload should not be called multiple times");
            try {
                this.f4965d = s0.b.d(inputStream);
                this.f4964c.i(0);
                h2 h2Var = this.f4964c;
                byte[] bArr = this.f4965d;
                h2Var.j(0, bArr.length, bArr.length);
                this.f4964c.k(this.f4965d.length);
                this.f4964c.l(this.f4965d.length);
            } catch (IOException e5) {
                throw new RuntimeException(e5);
            }
        }

        @Override // io.grpc.internal.o0
        public void flush() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public interface b {
        void c(b3.f1 f1Var);

        void d(b3.u0 u0Var, byte[] bArr);

        void e(o2 o2Var, boolean z4, boolean z5, int r4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class c extends d.a {

        /* renamed from: i, reason: collision with root package name */
        private final h2 f4967i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f4968j;

        /* renamed from: k, reason: collision with root package name */
        private r f4969k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f4970l;

        /* renamed from: m, reason: collision with root package name */
        private b3.v f4971m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f4972n;

        /* renamed from: o, reason: collision with root package name */
        private Runnable f4973o;

        /* renamed from: p, reason: collision with root package name */
        private volatile boolean f4974p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f4975q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f4976r;

        /* renamed from: io.grpc.internal.a$c$a, reason: collision with other inner class name */
        class RunnableC0055a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f4977e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ r.a f4978f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.u0 f4979g;

            RunnableC0055a(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
                this.f4977e = f1Var;
                this.f4978f = aVar;
                this.f4979g = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C(this.f4977e, this.f4978f, this.f4979g);
            }
        }

        protected c(int r12, h2 h2Var, n2 n2Var) {
            super(r12, h2Var, n2Var);
            this.f4971m = b3.v.c();
            this.f4972n = false;
            this.f4967i = (h2) q0.l.o(h2Var, "statsTraceCtx");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
            if (this.f4968j) {
                return;
            }
            this.f4968j = true;
            this.f4967i.m(f1Var);
            n().d(f1Var, aVar, u0Var);
            if (l() != null) {
                l().f(f1Var.o());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void I(b3.v vVar) {
            q0.l.u(this.f4969k == null, "Already called start");
            this.f4971m = (b3.v) q0.l.o(vVar, "decompressorRegistry");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J(boolean z4) {
            this.f4970l = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L() {
            this.f4974p = true;
        }

        protected void D(u1 u1Var) {
            q0.l.o(u1Var, "frame");
            try {
                if (!this.f4975q) {
                    k(u1Var);
                } else {
                    a.f4955g.log(Level.INFO, "Received data on closed stream");
                    u1Var.close();
                }
            } catch (Throwable th) {
                if (1 != 0) {
                    u1Var.close();
                }
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected void E(b3.u0 r6) {
            /*
                r5 = this;
                boolean r0 = r5.f4975q
                r1 = 1
                r0 = r0 ^ r1
                java.lang.String r2 = "Received headers on closed stream"
                q0.l.u(r0, r2)
                io.grpc.internal.h2 r0 = r5.f4967i
                r0.a()
                b3.u0$g<java.lang.String> r0 = io.grpc.internal.q0.f5568f
                java.lang.Object r0 = r6.g(r0)
                java.lang.String r0 = (java.lang.String) r0
                boolean r2 = r5.f4970l
                r3 = 0
                if (r2 == 0) goto L4f
                if (r0 == 0) goto L4f
                java.lang.String r2 = "gzip"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 == 0) goto L2f
                io.grpc.internal.r0 r0 = new io.grpc.internal.r0
                r0.<init>()
                r5.w(r0)
                r0 = 1
                goto L50
            L2f:
                java.lang.String r2 = "identity"
                boolean r2 = r0.equalsIgnoreCase(r2)
                if (r2 != 0) goto L4f
                b3.f1 r6 = b3.f1.f770t
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r3] = r0
                java.lang.String r0 = "Can't find full stream decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                b3.f1 r6 = r6.q(r0)
                b3.h1 r6 = r6.d()
                r5.b(r6)
                return
            L4f:
                r0 = 0
            L50:
                b3.u0$g<java.lang.String> r2 = io.grpc.internal.q0.f5566d
                java.lang.Object r2 = r6.g(r2)
                java.lang.String r2 = (java.lang.String) r2
                if (r2 == 0) goto L99
                b3.v r4 = r5.f4971m
                b3.u r4 = r4.e(r2)
                if (r4 != 0) goto L7a
                b3.f1 r6 = b3.f1.f770t
                java.lang.Object[] r0 = new java.lang.Object[r1]
                r0[r3] = r2
                java.lang.String r1 = "Can't find decompressor for %s"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                b3.f1 r6 = r6.q(r0)
                b3.h1 r6 = r6.d()
                r5.b(r6)
                return
            L7a:
                b3.l r1 = b3.l.b.f836a
                if (r4 == r1) goto L99
                if (r0 == 0) goto L96
                b3.f1 r6 = b3.f1.f770t
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.String r1 = "Full stream and gRPC message encoding cannot both be set"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                b3.f1 r6 = r6.q(r0)
                b3.h1 r6 = r6.d()
                r5.b(r6)
                return
            L96:
                r5.v(r4)
            L99:
                io.grpc.internal.r r0 = r5.n()
                r0.c(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.a.c.E(b3.u0):void");
        }

        protected void F(b3.u0 u0Var, b3.f1 f1Var) {
            q0.l.o(f1Var, "status");
            q0.l.o(u0Var, "trailers");
            if (this.f4975q) {
                a.f4955g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{f1Var, u0Var});
            } else {
                this.f4967i.b(u0Var);
                N(f1Var, false, u0Var);
            }
        }

        protected final boolean G() {
            return this.f4974p;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.internal.d.a
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public final r n() {
            return this.f4969k;
        }

        public final void K(r rVar) {
            q0.l.u(this.f4969k == null, "Already called setListener");
            this.f4969k = (r) q0.l.o(rVar, "listener");
        }

        public final void M(b3.f1 f1Var, r.a aVar, boolean z4, b3.u0 u0Var) {
            q0.l.o(f1Var, "status");
            q0.l.o(u0Var, "trailers");
            if (!this.f4975q || z4) {
                this.f4975q = true;
                this.f4976r = f1Var.o();
                s();
                if (this.f4972n) {
                    this.f4973o = null;
                    C(f1Var, aVar, u0Var);
                } else {
                    this.f4973o = new RunnableC0055a(f1Var, aVar, u0Var);
                    j(z4);
                }
            }
        }

        public final void N(b3.f1 f1Var, boolean z4, b3.u0 u0Var) {
            M(f1Var, r.a.PROCESSED, z4, u0Var);
        }

        public void c(boolean z4) {
            q0.l.u(this.f4975q, "status should have been reported on deframer closed");
            this.f4972n = true;
            if (this.f4976r && z4) {
                N(b3.f1.f770t.q("Encountered end-of-stream mid-frame"), true, new b3.u0());
            }
            Runnable runnable = this.f4973o;
            if (runnable != null) {
                runnable.run();
                this.f4973o = null;
            }
        }
    }

    protected a(p2 p2Var, h2 h2Var, n2 n2Var, b3.u0 u0Var, b3.c cVar, boolean z4) {
        q0.l.o(u0Var, "headers");
        this.f4956a = (n2) q0.l.o(n2Var, "transportTracer");
        this.f4958c = q0.n(cVar);
        this.f4959d = z4;
        if (z4) {
            this.f4957b = new C0054a(u0Var, h2Var);
        } else {
            this.f4957b = new l1(this, p2Var, h2Var);
            this.f4960e = u0Var;
        }
    }

    @Override // io.grpc.internal.q
    public void a(int r22) {
        this.f4957b.a(r22);
    }

    @Override // io.grpc.internal.q
    public final void c(b3.f1 f1Var) {
        q0.l.e(!f1Var.o(), "Should not cancel with OK status");
        this.f4961f = true;
        v().c(f1Var);
    }

    @Override // io.grpc.internal.q
    public void e(int r22) {
        u().x(r22);
    }

    @Override // io.grpc.internal.d, io.grpc.internal.i2
    public final boolean f() {
        return super.f() && !this.f4961f;
    }

    @Override // io.grpc.internal.q
    public void g(b3.t tVar) {
        b3.u0 u0Var = this.f4960e;
        u0.g<Long> gVar = q0.f5565c;
        u0Var.e(gVar);
        this.f4960e.p(gVar, Long.valueOf(Math.max(0L, tVar.r(TimeUnit.NANOSECONDS))));
    }

    @Override // io.grpc.internal.q
    public final void i(r rVar) {
        u().K(rVar);
        if (this.f4959d) {
            return;
        }
        v().d(this.f4960e, null);
        this.f4960e = null;
    }

    @Override // io.grpc.internal.q
    public final void k(b3.v vVar) {
        u().I(vVar);
    }

    @Override // io.grpc.internal.q
    public final void l(w0 w0Var) {
        w0Var.b("remote_addr", p().b(b3.a0.f688a));
    }

    @Override // io.grpc.internal.q
    public final void n() {
        if (u().G()) {
            return;
        }
        u().L();
        r();
    }

    @Override // io.grpc.internal.l1.d
    public final void o(o2 o2Var, boolean z4, boolean z5, int r6) {
        q0.l.e(o2Var != null || z4, "null frame before EOS");
        v().e(o2Var, z4, z5, r6);
    }

    @Override // io.grpc.internal.q
    public final void q(boolean z4) {
        u().J(z4);
    }

    @Override // io.grpc.internal.d
    protected final o0 s() {
        return this.f4957b;
    }

    protected abstract b v();

    protected n2 x() {
        return this.f4956a;
    }

    public final boolean y() {
        return this.f4958c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.d
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public abstract c u();
}
