package m1;

import l1.y;
import x1.x;

/* loaded from: classes.dex */
public class j implements p {

    /* renamed from: a, reason: collision with root package name */
    private x f6652a;

    public j(x xVar) {
        p1.b.d(y.A(xVar), "NumericIncrementTransformOperation expects a NumberValue operand", new Object[0]);
        this.f6652a = xVar;
    }

    private double e() {
        if (y.u(this.f6652a)) {
            return this.f6652a.j0();
        }
        if (y.v(this.f6652a)) {
            return this.f6652a.l0();
        }
        throw p1.b.a("Expected 'operand' to be of Number type, but was " + this.f6652a.getClass().getCanonicalName(), new Object[0]);
    }

    private long f() {
        if (y.u(this.f6652a)) {
            return (long) this.f6652a.j0();
        }
        if (y.v(this.f6652a)) {
            return this.f6652a.l0();
        }
        throw p1.b.a("Expected 'operand' to be of Number type, but was " + this.f6652a.getClass().getCanonicalName(), new Object[0]);
    }

    private long g(long j4, long j5) {
        long j6 = j4 + j5;
        return ((j4 ^ j6) & (j5 ^ j6)) >= 0 ? j6 : j6 >= 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    @Override // m1.p
    public x a(x xVar, x0.o oVar) {
        double j02;
        x.b H;
        x c5 = c(xVar);
        if (y.v(c5) && y.v(this.f6652a)) {
            H = x.r0().J(g(c5.l0(), f()));
        } else {
            if (y.v(c5)) {
                j02 = c5.l0();
            } else {
                p1.b.d(y.u(c5), "Expected NumberValue to be of type DoubleValue, but was ", xVar.getClass().getCanonicalName());
                j02 = c5.j0();
            }
            H = x.r0().H(j02 + e());
        }
        return H.t();
    }

    @Override // m1.p
    public x b(x xVar, x xVar2) {
        return xVar2;
    }

    @Override // m1.p
    public x c(x xVar) {
        return y.A(xVar) ? xVar : x.r0().J(0L).t();
    }

    public x d() {
        return this.f6652a;
    }
}
