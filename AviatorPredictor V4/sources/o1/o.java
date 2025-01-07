package o1;

import b3.u0;

/* loaded from: classes.dex */
public class o implements e0 {

    /* renamed from: d, reason: collision with root package name */
    private static final u0.g<String> f6868d;

    /* renamed from: e, reason: collision with root package name */
    private static final u0.g<String> f6869e;

    /* renamed from: f, reason: collision with root package name */
    private static final u0.g<String> f6870f;

    /* renamed from: a, reason: collision with root package name */
    private final r1.b<q1.k> f6871a;

    /* renamed from: b, reason: collision with root package name */
    private final r1.b<u1.i> f6872b;

    /* renamed from: c, reason: collision with root package name */
    private final x0.m f6873c;

    static {
        u0.d<String> dVar = b3.u0.f903e;
        f6868d = u0.g.e("x-firebase-client-log-type", dVar);
        f6869e = u0.g.e("x-firebase-client", dVar);
        f6870f = u0.g.e("x-firebase-gmpid", dVar);
    }

    public o(r1.b<u1.i> bVar, r1.b<q1.k> bVar2, x0.m mVar) {
        this.f6872b = bVar;
        this.f6871a = bVar2;
        this.f6873c = mVar;
    }

    private void b(b3.u0 u0Var) {
        x0.m mVar = this.f6873c;
        if (mVar == null) {
            return;
        }
        String c5 = mVar.c();
        if (c5.length() != 0) {
            u0Var.p(f6870f, c5);
        }
    }

    @Override // o1.e0
    public void a(b3.u0 u0Var) {
        if (this.f6871a.get() == null || this.f6872b.get() == null) {
            return;
        }
        int d5 = this.f6871a.get().b("fire-fst").d();
        if (d5 != 0) {
            u0Var.p(f6868d, Integer.toString(d5));
        }
        u0Var.p(f6869e, this.f6872b.get().a());
        b(u0Var);
    }
}
