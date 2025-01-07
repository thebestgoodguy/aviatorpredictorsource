package k1;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t0 extends z0 {

    /* renamed from: i, reason: collision with root package name */
    private d1 f6253i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6254j;

    /* renamed from: c, reason: collision with root package name */
    private final Map<g1.j, r0> f6247c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final q0 f6249e = new q0();

    /* renamed from: f, reason: collision with root package name */
    private final v0 f6250f = new v0(this);

    /* renamed from: g, reason: collision with root package name */
    private final n0 f6251g = new n0();

    /* renamed from: h, reason: collision with root package name */
    private final u0 f6252h = new u0();

    /* renamed from: d, reason: collision with root package name */
    private final Map<g1.j, o0> f6248d = new HashMap();

    private t0() {
    }

    public static t0 n() {
        t0 t0Var = new t0();
        t0Var.s(new p0(t0Var));
        return t0Var;
    }

    private void s(d1 d1Var) {
        this.f6253i = d1Var;
    }

    @Override // k1.z0
    a a() {
        return this.f6251g;
    }

    @Override // k1.z0
    b b(g1.j jVar) {
        o0 o0Var = this.f6248d.get(jVar);
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0();
        this.f6248d.put(jVar, o0Var2);
        return o0Var2;
    }

    @Override // k1.z0
    w0 d(g1.j jVar, l lVar) {
        r0 r0Var = this.f6247c.get(jVar);
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0(this, jVar);
        this.f6247c.put(jVar, r0Var2);
        return r0Var2;
    }

    @Override // k1.z0
    x0 e() {
        return new s0();
    }

    @Override // k1.z0
    d1 f() {
        return this.f6253i;
    }

    @Override // k1.z0
    public boolean i() {
        return this.f6254j;
    }

    @Override // k1.z0
    <T> T j(String str, p1.y<T> yVar) {
        this.f6253i.n();
        try {
            return yVar.get();
        } finally {
            this.f6253i.i();
        }
    }

    @Override // k1.z0
    void k(String str, Runnable runnable) {
        this.f6253i.n();
        try {
            runnable.run();
        } finally {
            this.f6253i.i();
        }
    }

    @Override // k1.z0
    public void l() {
        p1.b.d(this.f6254j, "MemoryPersistence shutdown without start", new Object[0]);
        this.f6254j = false;
    }

    @Override // k1.z0
    public void m() {
        p1.b.d(!this.f6254j, "MemoryPersistence double-started!", new Object[0]);
        this.f6254j = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k1.z0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public q0 c(g1.j jVar) {
        return this.f6249e;
    }

    Iterable<r0> p() {
        return this.f6247c.values();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k1.z0
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public u0 g() {
        return this.f6252h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // k1.z0
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public v0 h() {
        return this.f6250f;
    }
}
