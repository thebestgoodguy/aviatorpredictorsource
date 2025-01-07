package o1;

import java.util.Map;
import k1.b4;
import p1.g;
import x1.p;

/* loaded from: classes.dex */
public class u0 extends c<x1.p, x1.q, a> {

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.protobuf.j f6951t = com.google.protobuf.j.f2914f;

    /* renamed from: s, reason: collision with root package name */
    private final j0 f6952s;

    interface a extends p0 {
        void e(l1.w wVar, s0 s0Var);
    }

    u0(u uVar, p1.g gVar, j0 j0Var, a aVar) {
        super(uVar, x1.o.c(), gVar, g.d.LISTEN_STREAM_CONNECTION_BACKOFF, g.d.LISTEN_STREAM_IDLE, g.d.HEALTH_CHECK_TIMEOUT, aVar);
        this.f6952s = j0Var;
    }

    public void A(b4 b4Var) {
        p1.b.d(m(), "Watching queries requires an open stream", new Object[0]);
        p.b D = x1.p.b0().E(this.f6952s.a()).D(this.f6952s.U(b4Var));
        Map<String, String> N = this.f6952s.N(b4Var);
        if (N != null) {
            D.B(N);
        }
        x(D.t());
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ void l() {
        super.l();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ boolean m() {
        return super.m();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ boolean n() {
        return super.n();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ void u() {
        super.u();
    }

    @Override // o1.c
    public /* bridge */ /* synthetic */ void v() {
        super.v();
    }

    @Override // o1.c
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void r(x1.q qVar) {
        this.f6769l.f();
        s0 A = this.f6952s.A(qVar);
        ((a) this.f6770m).e(this.f6952s.z(qVar), A);
    }

    public void z(int r4) {
        p1.b.d(m(), "Unwatching targets requires an open stream", new Object[0]);
        x(x1.p.b0().E(this.f6952s.a()).F(r4).t());
    }
}
