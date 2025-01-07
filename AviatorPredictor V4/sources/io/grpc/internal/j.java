package io.grpc.internal;

import b3.f;
import b3.n0;
import b3.w0;
import io.grpc.internal.d2;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final b3.p0 f5389a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5390b;

    public final class b {

        /* renamed from: a, reason: collision with root package name */
        private final n0.d f5391a;

        /* renamed from: b, reason: collision with root package name */
        private b3.n0 f5392b;

        /* renamed from: c, reason: collision with root package name */
        private b3.o0 f5393c;

        b(n0.d dVar) {
            this.f5391a = dVar;
            b3.o0 d5 = j.this.f5389a.d(j.this.f5390b);
            this.f5393c = d5;
            if (d5 != null) {
                this.f5392b = d5.a(dVar);
                return;
            }
            throw new IllegalStateException("Could not find policy '" + j.this.f5390b + "'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        }

        public b3.n0 a() {
            return this.f5392b;
        }

        void b(b3.f1 f1Var) {
            a().b(f1Var);
        }

        void c() {
            a().d();
        }

        void d() {
            this.f5392b.e();
            this.f5392b = null;
        }

        b3.f1 e(n0.g gVar) {
            List<b3.x> a5 = gVar.a();
            b3.a b5 = gVar.b();
            d2.b bVar = (d2.b) gVar.c();
            if (bVar == null) {
                try {
                    j jVar = j.this;
                    bVar = new d2.b(jVar.d(jVar.f5390b, "using default policy"), null);
                } catch (f e5) {
                    this.f5391a.e(b3.p.TRANSIENT_FAILURE, new d(b3.f1.f770t.q(e5.getMessage())));
                    this.f5392b.e();
                    this.f5393c = null;
                    this.f5392b = new e();
                    return b3.f1.f756f;
                }
            }
            if (this.f5393c == null || !bVar.f5140a.b().equals(this.f5393c.b())) {
                this.f5391a.e(b3.p.CONNECTING, new c());
                this.f5392b.e();
                b3.o0 o0Var = bVar.f5140a;
                this.f5393c = o0Var;
                b3.n0 n0Var = this.f5392b;
                this.f5392b = o0Var.a(this.f5391a);
                this.f5391a.b().b(f.a.INFO, "Load balancer changed from {0} to {1}", n0Var.getClass().getSimpleName(), this.f5392b.getClass().getSimpleName());
            }
            Object obj = bVar.f5141b;
            if (obj != null) {
                this.f5391a.b().b(f.a.DEBUG, "Load-balancing config: {0}", bVar.f5141b);
            }
            b3.n0 a6 = a();
            if (!gVar.a().isEmpty() || a6.a()) {
                a6.c(n0.g.d().b(gVar.a()).c(b5).d(obj).a());
                return b3.f1.f756f;
            }
            return b3.f1.f771u.q("NameResolver returned no usable address. addrs=" + a5 + ", attrs=" + b5);
        }
    }

    private static final class c extends n0.i {
        private c() {
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return n0.e.g();
        }

        public String toString() {
            return q0.h.b(c.class).toString();
        }
    }

    private static final class d extends n0.i {

        /* renamed from: a, reason: collision with root package name */
        private final b3.f1 f5395a;

        d(b3.f1 f1Var) {
            this.f5395a = f1Var;
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return n0.e.f(this.f5395a);
        }
    }

    private static final class e extends b3.n0 {
        private e() {
        }

        @Override // b3.n0
        public void b(b3.f1 f1Var) {
        }

        @Override // b3.n0
        public void c(n0.g gVar) {
        }

        @Override // b3.n0
        public void e() {
        }
    }

    static final class f extends Exception {
        private f(String str) {
            super(str);
        }
    }

    j(b3.p0 p0Var, String str) {
        this.f5389a = (b3.p0) q0.l.o(p0Var, "registry");
        this.f5390b = (String) q0.l.o(str, "defaultPolicy");
    }

    public j(String str) {
        this(b3.p0.b(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b3.o0 d(String str, String str2) {
        b3.o0 d5 = this.f5389a.d(str);
        if (d5 != null) {
            return d5;
        }
        throw new f("Trying to load '" + str + "' because " + str2 + ", but it's unavailable");
    }

    public b e(n0.d dVar) {
        return new b(dVar);
    }

    w0.c f(Map<String, ?> map) {
        List<d2.a> A;
        if (map != null) {
            try {
                A = d2.A(d2.g(map));
            } catch (RuntimeException e5) {
                return w0.c.b(b3.f1.f758h.q("can't parse load balancer configuration").p(e5));
            }
        } else {
            A = null;
        }
        if (A == null || A.isEmpty()) {
            return null;
        }
        return d2.y(A, this.f5389a);
    }
}
