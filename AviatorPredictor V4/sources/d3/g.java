package d3;

import b3.f1;
import b3.u0;
import b3.v0;
import io.grpc.internal.a;
import io.grpc.internal.h2;
import io.grpc.internal.n2;
import io.grpc.internal.o2;
import io.grpc.internal.r;
import io.grpc.internal.t0;
import java.util.List;

/* loaded from: classes.dex */
class g extends io.grpc.internal.a {

    /* renamed from: r, reason: collision with root package name */
    private static final h4.c f3295r = new h4.c();

    /* renamed from: h, reason: collision with root package name */
    private final v0<?, ?> f3296h;

    /* renamed from: i, reason: collision with root package name */
    private final String f3297i;

    /* renamed from: j, reason: collision with root package name */
    private final h2 f3298j;

    /* renamed from: k, reason: collision with root package name */
    private String f3299k;

    /* renamed from: l, reason: collision with root package name */
    private Object f3300l;

    /* renamed from: m, reason: collision with root package name */
    private volatile int f3301m;

    /* renamed from: n, reason: collision with root package name */
    private final b f3302n;

    /* renamed from: o, reason: collision with root package name */
    private final a f3303o;

    /* renamed from: p, reason: collision with root package name */
    private final b3.a f3304p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f3305q;

    class a implements a.b {
        a() {
        }

        @Override // io.grpc.internal.a.b
        public void c(f1 f1Var) {
            j3.c.f("OkHttpClientStream$Sink.cancel");
            try {
                synchronized (g.this.f3302n.f3308z) {
                    g.this.f3302n.a0(f1Var, true, null);
                }
            } finally {
                j3.c.h("OkHttpClientStream$Sink.cancel");
            }
        }

        @Override // io.grpc.internal.a.b
        public void d(u0 u0Var, byte[] bArr) {
            j3.c.f("OkHttpClientStream$Sink.writeHeaders");
            String str = "/" + g.this.f3296h.c();
            if (bArr != null) {
                g.this.f3305q = true;
                str = str + "?" + s0.a.a().e(bArr);
            }
            try {
                synchronized (g.this.f3302n.f3308z) {
                    g.this.f3302n.e0(u0Var, str);
                }
            } finally {
                j3.c.h("OkHttpClientStream$Sink.writeHeaders");
            }
        }

        @Override // io.grpc.internal.a.b
        public void e(o2 o2Var, boolean z4, boolean z5, int r6) {
            h4.c f5;
            j3.c.f("OkHttpClientStream$Sink.writeFrame");
            if (o2Var == null) {
                f5 = g.f3295r;
            } else {
                f5 = ((n) o2Var).f();
                int i02 = (int) f5.i0();
                if (i02 > 0) {
                    g.this.t(i02);
                }
            }
            try {
                synchronized (g.this.f3302n.f3308z) {
                    g.this.f3302n.c0(f5, z4, z5);
                    g.this.x().e(r6);
                }
            } finally {
                j3.c.h("OkHttpClientStream$Sink.writeFrame");
            }
        }
    }

    class b extends t0 {
        private List<f3.d> A;
        private h4.c B;
        private boolean C;
        private boolean D;
        private boolean E;
        private int F;
        private int G;
        private final d3.b H;
        private final p I;
        private final h J;
        private boolean K;
        private final j3.d L;

        /* renamed from: y, reason: collision with root package name */
        private final int f3307y;

        /* renamed from: z, reason: collision with root package name */
        private final Object f3308z;

        public b(int r22, h2 h2Var, Object obj, d3.b bVar, p pVar, h hVar, int r8, String str) {
            super(r22, h2Var, g.this.x());
            this.B = new h4.c();
            this.C = false;
            this.D = false;
            this.E = false;
            this.K = true;
            this.f3308z = q0.l.o(obj, "lock");
            this.H = bVar;
            this.I = pVar;
            this.J = hVar;
            this.F = r8;
            this.G = r8;
            this.f3307y = r8;
            this.L = j3.c.a(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(f1 f1Var, boolean z4, u0 u0Var) {
            if (this.E) {
                return;
            }
            this.E = true;
            if (!this.K) {
                this.J.U(g.this.Q(), f1Var, r.a.PROCESSED, z4, f3.a.CANCEL, u0Var);
                return;
            }
            this.J.j0(g.this);
            this.A = null;
            this.B.d();
            this.K = false;
            if (u0Var == null) {
                u0Var = new u0();
            }
            N(f1Var, true, u0Var);
        }

        private void b0() {
            if (G()) {
                this.J.U(g.this.Q(), null, r.a.PROCESSED, false, null, null);
            } else {
                this.J.U(g.this.Q(), null, r.a.PROCESSED, false, f3.a.CANCEL, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(h4.c cVar, boolean z4, boolean z5) {
            if (this.E) {
                return;
            }
            if (!this.K) {
                q0.l.u(g.this.Q() != -1, "streamId should be set");
                this.I.c(z4, g.this.Q(), cVar, z5);
            } else {
                this.B.w(cVar, (int) cVar.i0());
                this.C |= z4;
                this.D |= z5;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(u0 u0Var, String str) {
            this.A = c.a(u0Var, str, g.this.f3299k, g.this.f3297i, g.this.f3305q, this.J.d0());
            this.J.q0(g.this);
        }

        @Override // io.grpc.internal.t0
        protected void P(f1 f1Var, boolean z4, u0 u0Var) {
            a0(f1Var, z4, u0Var);
        }

        @Override // io.grpc.internal.k1.b
        public void b(Throwable th) {
            P(f1.k(th), true, new u0());
        }

        @Override // io.grpc.internal.t0, io.grpc.internal.a.c, io.grpc.internal.k1.b
        public void c(boolean z4) {
            b0();
            super.c(z4);
        }

        @Override // io.grpc.internal.k1.b
        public void d(int r5) {
            int r02 = this.G - r5;
            this.G = r02;
            float f5 = r02;
            int r12 = this.f3307y;
            if (f5 <= r12 * 0.5f) {
                int r13 = r12 - r02;
                this.F += r13;
                this.G = r02 + r13;
                this.H.f(g.this.Q(), r13);
            }
        }

        public void d0(int r9) {
            q0.l.v(g.this.f3301m == -1, "the stream has been started with id %s", r9);
            g.this.f3301m = r9;
            g.this.f3302n.r();
            if (this.K) {
                this.H.O(g.this.f3305q, false, g.this.f3301m, 0, this.A);
                g.this.f3298j.c();
                this.A = null;
                if (this.B.i0() > 0) {
                    this.I.c(this.C, g.this.f3301m, this.B, this.D);
                }
                this.K = false;
            }
        }

        @Override // io.grpc.internal.g.d
        public void e(Runnable runnable) {
            synchronized (this.f3308z) {
                runnable.run();
            }
        }

        j3.d f0() {
            return this.L;
        }

        public void g0(h4.c cVar, boolean z4) {
            int i02 = this.F - ((int) cVar.i0());
            this.F = i02;
            if (i02 >= 0) {
                super.S(new k(cVar), z4);
            } else {
                this.H.c(g.this.Q(), f3.a.FLOW_CONTROL_ERROR);
                this.J.U(g.this.Q(), f1.f770t.q("Received data size exceeded our receiving window size"), r.a.PROCESSED, false, null, null);
            }
        }

        public void h0(List<f3.d> list, boolean z4) {
            if (z4) {
                U(q.c(list));
            } else {
                T(q.a(list));
            }
        }

        @Override // io.grpc.internal.d.a
        protected void r() {
            super.r();
            l().c();
        }
    }

    g(v0<?, ?> v0Var, u0 u0Var, d3.b bVar, h hVar, p pVar, Object obj, int r19, int r20, String str, String str2, h2 h2Var, n2 n2Var, b3.c cVar, boolean z4) {
        super(new o(), h2Var, n2Var, u0Var, cVar, z4 && v0Var.f());
        this.f3301m = -1;
        this.f3303o = new a();
        this.f3305q = false;
        this.f3298j = (h2) q0.l.o(h2Var, "statsTraceCtx");
        this.f3296h = v0Var;
        this.f3299k = str;
        this.f3297i = str2;
        this.f3304p = hVar.W();
        this.f3302n = new b(r19, h2Var, obj, bVar, pVar, hVar, r20, v0Var.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public a v() {
        return this.f3303o;
    }

    Object O() {
        return this.f3300l;
    }

    public v0.d P() {
        return this.f3296h.e();
    }

    public int Q() {
        return this.f3301m;
    }

    void R(Object obj) {
        this.f3300l = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.internal.a
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public b u() {
        return this.f3302n;
    }

    boolean T() {
        return this.f3305q;
    }

    @Override // io.grpc.internal.q
    public void j(String str) {
        this.f3299k = (String) q0.l.o(str, "authority");
    }

    @Override // io.grpc.internal.q
    public b3.a p() {
        return this.f3304p;
    }
}
