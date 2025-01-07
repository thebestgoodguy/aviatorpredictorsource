package b3;

import b3.b;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m extends b3.b {

    /* renamed from: a, reason: collision with root package name */
    private final b3.b f841a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.b f842b;

    private static final class a extends b.a {

        /* renamed from: a, reason: collision with root package name */
        private final b.a f843a;

        /* renamed from: b, reason: collision with root package name */
        private final u0 f844b;

        public a(b.a aVar, u0 u0Var) {
            this.f843a = aVar;
            this.f844b = u0Var;
        }

        @Override // b3.b.a
        public void a(u0 u0Var) {
            q0.l.o(u0Var, "headers");
            u0 u0Var2 = new u0();
            u0Var2.m(this.f844b);
            u0Var2.m(u0Var);
            this.f843a.a(u0Var2);
        }

        @Override // b3.b.a
        public void b(f1 f1Var) {
            this.f843a.b(f1Var);
        }
    }

    private final class b extends b.a {

        /* renamed from: a, reason: collision with root package name */
        private final b.AbstractC0010b f845a;

        /* renamed from: b, reason: collision with root package name */
        private final Executor f846b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f847c;

        /* renamed from: d, reason: collision with root package name */
        private final r f848d;

        public b(b.AbstractC0010b abstractC0010b, Executor executor, b.a aVar, r rVar) {
            this.f845a = abstractC0010b;
            this.f846b = executor;
            this.f847c = (b.a) q0.l.o(aVar, "delegate");
            this.f848d = (r) q0.l.o(rVar, "context");
        }

        @Override // b3.b.a
        public void a(u0 u0Var) {
            q0.l.o(u0Var, "headers");
            r b5 = this.f848d.b();
            try {
                m.this.f842b.a(this.f845a, this.f846b, new a(this.f847c, u0Var));
            } finally {
                this.f848d.f(b5);
            }
        }

        @Override // b3.b.a
        public void b(f1 f1Var) {
            this.f847c.b(f1Var);
        }
    }

    public m(b3.b bVar, b3.b bVar2) {
        this.f841a = (b3.b) q0.l.o(bVar, "creds1");
        this.f842b = (b3.b) q0.l.o(bVar2, "creds2");
    }

    @Override // b3.b
    public void a(b.AbstractC0010b abstractC0010b, Executor executor, b.a aVar) {
        this.f841a.a(abstractC0010b, executor, new b(abstractC0010b, executor, aVar, r.e()));
    }
}
