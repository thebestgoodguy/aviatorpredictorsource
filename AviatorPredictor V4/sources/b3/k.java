package b3;

/* loaded from: classes.dex */
public abstract class k extends i1 {

    public static abstract class a {
        public k a(b bVar, u0 u0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final c f826a;

        /* renamed from: b, reason: collision with root package name */
        private final int f827b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f828c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private c f829a = c.f699k;

            /* renamed from: b, reason: collision with root package name */
            private int f830b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f831c;

            a() {
            }

            public b a() {
                return new b(this.f829a, this.f830b, this.f831c);
            }

            public a b(c cVar) {
                this.f829a = (c) q0.l.o(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z4) {
                this.f831c = z4;
                return this;
            }

            public a d(int r12) {
                this.f830b = r12;
                return this;
            }
        }

        b(c cVar, int r32, boolean z4) {
            this.f826a = (c) q0.l.o(cVar, "callOptions");
            this.f827b = r32;
            this.f828c = z4;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return q0.h.c(this).d("callOptions", this.f826a).b("previousAttempts", this.f827b).e("isTransparentRetry", this.f828c).toString();
        }
    }

    public void j() {
    }

    public void k(u0 u0Var) {
    }

    public void l() {
    }

    public void m(b3.a aVar, u0 u0Var) {
    }
}
