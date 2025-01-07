package b3;

import b3.a;
import b3.n0;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a.c<e0> f742a = a.c.a("io.grpc.config-selector");

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f1 f743a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f744b;

        /* renamed from: c, reason: collision with root package name */
        public h f745c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Object f746a;

            /* renamed from: b, reason: collision with root package name */
            private h f747b;

            private a() {
            }

            public b a() {
                q0.l.u(this.f746a != null, "config is not set");
                return new b(f1.f756f, this.f746a, this.f747b);
            }

            public a b(Object obj) {
                this.f746a = q0.l.o(obj, "config");
                return this;
            }
        }

        private b(f1 f1Var, Object obj, h hVar) {
            this.f743a = (f1) q0.l.o(f1Var, "status");
            this.f744b = obj;
            this.f745c = hVar;
        }

        public static a d() {
            return new a();
        }

        public Object a() {
            return this.f744b;
        }

        public h b() {
            return this.f745c;
        }

        public f1 c() {
            return this.f743a;
        }
    }

    public abstract b a(n0.f fVar);
}
