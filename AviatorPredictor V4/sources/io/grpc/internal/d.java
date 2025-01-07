package io.grpc.internal;

import b3.l;
import io.grpc.internal.f;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class d implements i2 {

    public static abstract class a implements f.h, k1.b {

        /* renamed from: a, reason: collision with root package name */
        private y f5127a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f5128b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final h2 f5129c;

        /* renamed from: d, reason: collision with root package name */
        private final n2 f5130d;

        /* renamed from: e, reason: collision with root package name */
        private final k1 f5131e;

        /* renamed from: f, reason: collision with root package name */
        private int f5132f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f5133g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f5134h;

        /* renamed from: io.grpc.internal.d$a$a, reason: collision with other inner class name */
        class RunnableC0056a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j3.b f5135e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f5136f;

            RunnableC0056a(j3.b bVar, int r32) {
                this.f5135e = bVar;
                this.f5136f = r32;
            }

            @Override // java.lang.Runnable
            public void run() {
                j3.c.f("AbstractStream.request");
                j3.c.d(this.f5135e);
                try {
                    a.this.f5127a.d(this.f5136f);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        protected a(int r8, h2 h2Var, n2 n2Var) {
            this.f5129c = (h2) q0.l.o(h2Var, "statsTraceCtx");
            this.f5130d = (n2) q0.l.o(n2Var, "transportTracer");
            k1 k1Var = new k1(this, l.b.f836a, r8, h2Var, n2Var);
            this.f5131e = k1Var;
            this.f5127a = k1Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean m() {
            boolean z4;
            synchronized (this.f5128b) {
                z4 = this.f5133g && this.f5132f < 32768 && !this.f5134h;
            }
            return z4;
        }

        private void o() {
            boolean m4;
            synchronized (this.f5128b) {
                m4 = m();
            }
            if (m4) {
                n().b();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(int r32) {
            synchronized (this.f5128b) {
                this.f5132f += r32;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void u(int r32) {
            e(new RunnableC0056a(j3.c.e(), r32));
        }

        @Override // io.grpc.internal.k1.b
        public void a(j2.a aVar) {
            n().a(aVar);
        }

        protected final void j(boolean z4) {
            if (z4) {
                this.f5127a.close();
            } else {
                this.f5127a.h();
            }
        }

        protected final void k(u1 u1Var) {
            try {
                this.f5127a.k(u1Var);
            } catch (Throwable th) {
                b(th);
            }
        }

        protected n2 l() {
            return this.f5130d;
        }

        protected abstract j2 n();

        public final void q(int r7) {
            boolean z4;
            synchronized (this.f5128b) {
                q0.l.u(this.f5133g, "onStreamAllocated was not called, but it seems the stream is active");
                int r12 = this.f5132f;
                z4 = true;
                boolean z5 = r12 < 32768;
                int r13 = r12 - r7;
                this.f5132f = r13;
                boolean z6 = r13 < 32768;
                if (z5 || !z6) {
                    z4 = false;
                }
            }
            if (z4) {
                o();
            }
        }

        protected void r() {
            q0.l.t(n() != null);
            synchronized (this.f5128b) {
                q0.l.u(this.f5133g ? false : true, "Already allocated");
                this.f5133g = true;
            }
            o();
        }

        protected final void s() {
            synchronized (this.f5128b) {
                this.f5134h = true;
            }
        }

        final void t() {
            this.f5131e.H(this);
            this.f5127a = this.f5131e;
        }

        protected final void v(b3.u uVar) {
            this.f5127a.i(uVar);
        }

        protected void w(r0 r0Var) {
            this.f5131e.F(r0Var);
            this.f5127a = new f(this, this, this.f5131e);
        }

        final void x(int r22) {
            this.f5127a.e(r22);
        }
    }

    @Override // io.grpc.internal.i2
    public final void b(b3.n nVar) {
        s().b((b3.n) q0.l.o(nVar, "compressor"));
    }

    @Override // io.grpc.internal.i2
    public final void d(int r22) {
        u().u(r22);
    }

    @Override // io.grpc.internal.i2
    public boolean f() {
        return u().m();
    }

    @Override // io.grpc.internal.i2
    public final void flush() {
        if (s().c()) {
            return;
        }
        s().flush();
    }

    @Override // io.grpc.internal.i2
    public final void h(InputStream inputStream) {
        q0.l.o(inputStream, "message");
        try {
            if (!s().c()) {
                s().d(inputStream);
            }
        } finally {
            q0.e(inputStream);
        }
    }

    @Override // io.grpc.internal.i2
    public void m() {
        u().t();
    }

    protected final void r() {
        s().close();
    }

    protected abstract o0 s();

    protected final void t(int r22) {
        u().p(r22);
    }

    protected abstract a u();
}
