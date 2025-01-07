package m1;

import java.util.Collections;
import java.util.List;
import l1.y;
import x1.a;
import x1.x;

/* loaded from: classes.dex */
public abstract class a implements p {

    /* renamed from: a, reason: collision with root package name */
    private final List<x> f6631a;

    /* renamed from: m1.a$a, reason: collision with other inner class name */
    public static class C0067a extends a {
        public C0067a(List<x> list) {
            super(list);
        }

        @Override // m1.a
        protected x d(x xVar) {
            a.b e5 = a.e(xVar);
            for (x xVar2 : f()) {
                int r22 = 0;
                while (r22 < e5.F()) {
                    if (y.q(e5.E(r22), xVar2)) {
                        e5.G(r22);
                    } else {
                        r22++;
                    }
                }
            }
            return x.r0().D(e5).t();
        }
    }

    public static class b extends a {
        public b(List<x> list) {
            super(list);
        }

        @Override // m1.a
        protected x d(x xVar) {
            a.b e5 = a.e(xVar);
            for (x xVar2 : f()) {
                if (!y.p(e5, xVar2)) {
                    e5.D(xVar2);
                }
            }
            return x.r0().D(e5).t();
        }
    }

    a(List<x> list) {
        this.f6631a = Collections.unmodifiableList(list);
    }

    static a.b e(x xVar) {
        return y.t(xVar) ? xVar.f0().e() : x1.a.d0();
    }

    @Override // m1.p
    public x a(x xVar, x0.o oVar) {
        return d(xVar);
    }

    @Override // m1.p
    public x b(x xVar, x xVar2) {
        return d(xVar);
    }

    @Override // m1.p
    public x c(x xVar) {
        return null;
    }

    protected abstract x d(x xVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f6631a.equals(((a) obj).f6631a);
    }

    public List<x> f() {
        return this.f6631a;
    }

    public int hashCode() {
        return (getClass().hashCode() * 31) + this.f6631a.hashCode();
    }
}
