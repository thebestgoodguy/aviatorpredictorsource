package i1;

import i1.j;
import k1.z3;
import o1.n0;

/* loaded from: classes.dex */
public class t0 extends j {

    private class b implements n0.c {
        private b() {
        }

        @Override // o1.n0.c
        public void a(v0 v0Var) {
            t0.this.p().a(v0Var);
        }

        @Override // o1.n0.c
        public c1.e<l1.l> b(int r22) {
            return t0.this.p().b(r22);
        }

        @Override // o1.n0.c
        public void c(int r22, b3.f1 f1Var) {
            t0.this.p().c(r22, f1Var);
        }

        @Override // o1.n0.c
        public void d(o1.i0 i0Var) {
            t0.this.p().d(i0Var);
        }

        @Override // o1.n0.c
        public void e(int r22, b3.f1 f1Var) {
            t0.this.p().e(r22, f1Var);
        }

        @Override // o1.n0.c
        public void f(m1.h hVar) {
            t0.this.p().f(hVar);
        }
    }

    @Override // i1.j
    protected p b(j.a aVar) {
        return new p(p());
    }

    @Override // i1.j
    protected z3 c(j.a aVar) {
        return null;
    }

    @Override // i1.j
    protected k1.k d(j.a aVar) {
        return null;
    }

    @Override // i1.j
    protected k1.f0 e(j.a aVar) {
        return new k1.f0(n(), new k1.a1(), aVar.e());
    }

    @Override // i1.j
    protected k1.z0 f(j.a aVar) {
        return k1.t0.n();
    }

    @Override // i1.j
    protected o1.n0 g(j.a aVar) {
        return new o1.n0(new b(), m(), aVar.d(), aVar.a(), i());
    }

    @Override // i1.j
    protected b1 h(j.a aVar) {
        return new b1(m(), o(), aVar.e(), aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i1.j
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public o1.j a(j.a aVar) {
        return new o1.j(aVar.b());
    }
}
