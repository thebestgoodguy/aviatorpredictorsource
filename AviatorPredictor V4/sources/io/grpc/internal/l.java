package io.grpc.internal;

import b3.b;
import io.grpc.internal.m1;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class l implements t {

    /* renamed from: e, reason: collision with root package name */
    private final t f5426e;

    /* renamed from: f, reason: collision with root package name */
    private final b3.b f5427f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f5428g;

    private class a extends j0 {

        /* renamed from: a, reason: collision with root package name */
        private final v f5429a;

        /* renamed from: b, reason: collision with root package name */
        private final String f5430b;

        /* renamed from: d, reason: collision with root package name */
        private volatile b3.f1 f5432d;

        /* renamed from: e, reason: collision with root package name */
        private b3.f1 f5433e;

        /* renamed from: f, reason: collision with root package name */
        private b3.f1 f5434f;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicInteger f5431c = new AtomicInteger(-2147483647);

        /* renamed from: g, reason: collision with root package name */
        private final m1.a f5435g = new C0058a();

        /* renamed from: io.grpc.internal.l$a$a, reason: collision with other inner class name */
        class C0058a implements m1.a {
            C0058a() {
            }

            @Override // io.grpc.internal.m1.a
            public void a() {
                if (a.this.f5431c.decrementAndGet() == 0) {
                    a.this.j();
                }
            }
        }

        class b extends b.AbstractC0010b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ b3.v0 f5438a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b3.c f5439b;

            b(b3.v0 v0Var, b3.c cVar) {
                this.f5438a = v0Var;
                this.f5439b = cVar;
            }
        }

        a(v vVar, String str) {
            this.f5429a = (v) q0.l.o(vVar, "delegate");
            this.f5430b = (String) q0.l.o(str, "authority");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j() {
            synchronized (this) {
                if (this.f5431c.get() != 0) {
                    return;
                }
                b3.f1 f1Var = this.f5433e;
                b3.f1 f1Var2 = this.f5434f;
                this.f5433e = null;
                this.f5434f = null;
                if (f1Var != null) {
                    super.f(f1Var);
                }
                if (f1Var2 != null) {
                    super.a(f1Var2);
                }
            }
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void a(b3.f1 f1Var) {
            q0.l.o(f1Var, "status");
            synchronized (this) {
                if (this.f5431c.get() < 0) {
                    this.f5432d = f1Var;
                    this.f5431c.addAndGet(Integer.MAX_VALUE);
                } else if (this.f5434f != null) {
                    return;
                }
                if (this.f5431c.get() != 0) {
                    this.f5434f = f1Var;
                } else {
                    super.a(f1Var);
                }
            }
        }

        @Override // io.grpc.internal.j0
        protected v b() {
            return this.f5429a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
            b3.b c5 = cVar.c();
            if (c5 == null) {
                c5 = l.this.f5427f;
            } else if (l.this.f5427f != null) {
                c5 = new b3.m(l.this.f5427f, c5);
            }
            if (c5 == null) {
                return this.f5431c.get() >= 0 ? new f0(this.f5432d, kVarArr) : this.f5429a.c(v0Var, u0Var, cVar, kVarArr);
            }
            m1 m1Var = new m1(this.f5429a, v0Var, u0Var, cVar, this.f5435g, kVarArr);
            if (this.f5431c.incrementAndGet() > 0) {
                this.f5435g.a();
                return new f0(this.f5432d, kVarArr);
            }
            try {
                c5.a(new b(v0Var, cVar), (Executor) q0.h.a(cVar.e(), l.this.f5428g), m1Var);
            } catch (Throwable th) {
                m1Var.b(b3.f1.f764n.q("Credentials should use fail() instead of throwing exceptions").p(th));
            }
            return m1Var.d();
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.j1
        public void f(b3.f1 f1Var) {
            q0.l.o(f1Var, "status");
            synchronized (this) {
                if (this.f5431c.get() < 0) {
                    this.f5432d = f1Var;
                    this.f5431c.addAndGet(Integer.MAX_VALUE);
                    if (this.f5431c.get() != 0) {
                        this.f5433e = f1Var;
                    } else {
                        super.f(f1Var);
                    }
                }
            }
        }
    }

    l(t tVar, b3.b bVar, Executor executor) {
        this.f5426e = (t) q0.l.o(tVar, "delegate");
        this.f5427f = bVar;
        this.f5428g = (Executor) q0.l.o(executor, "appExecutor");
    }

    @Override // io.grpc.internal.t
    public ScheduledExecutorService B() {
        return this.f5426e.B();
    }

    @Override // io.grpc.internal.t
    public v V(SocketAddress socketAddress, t.a aVar, b3.f fVar) {
        return new a(this.f5426e.V(socketAddress, aVar, fVar), aVar.a());
    }

    @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5426e.close();
    }
}
