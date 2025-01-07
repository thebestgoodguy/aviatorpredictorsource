package k1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class v0 implements a4 {

    /* renamed from: c, reason: collision with root package name */
    private int f6292c;

    /* renamed from: f, reason: collision with root package name */
    private final t0 f6295f;

    /* renamed from: a, reason: collision with root package name */
    private final Map<i1.c1, b4> f6290a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final e1 f6291b = new e1();

    /* renamed from: d, reason: collision with root package name */
    private l1.w f6293d = l1.w.f6583f;

    /* renamed from: e, reason: collision with root package name */
    private long f6294e = 0;

    v0(t0 t0Var) {
        this.f6295f = t0Var;
    }

    @Override // k1.a4
    public void a(b4 b4Var) {
        i(b4Var);
    }

    @Override // k1.a4
    public c1.e<l1.l> b(int r22) {
        return this.f6291b.d(r22);
    }

    @Override // k1.a4
    public l1.w c() {
        return this.f6293d;
    }

    @Override // k1.a4
    public void d(c1.e<l1.l> eVar, int r32) {
        this.f6291b.b(eVar, r32);
        d1 f5 = this.f6295f.f();
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            f5.a(it.next());
        }
    }

    @Override // k1.a4
    public void e(l1.w wVar) {
        this.f6293d = wVar;
    }

    @Override // k1.a4
    public void f(int r22) {
        this.f6291b.h(r22);
    }

    @Override // k1.a4
    public void g(c1.e<l1.l> eVar, int r32) {
        this.f6291b.g(eVar, r32);
        d1 f5 = this.f6295f.f();
        Iterator<l1.l> it = eVar.iterator();
        while (it.hasNext()) {
            f5.f(it.next());
        }
    }

    @Override // k1.a4
    public b4 h(i1.c1 c1Var) {
        return this.f6290a.get(c1Var);
    }

    @Override // k1.a4
    public void i(b4 b4Var) {
        this.f6290a.put(b4Var.f(), b4Var);
        int g5 = b4Var.g();
        if (g5 > this.f6292c) {
            this.f6292c = g5;
        }
        if (b4Var.d() > this.f6294e) {
            this.f6294e = b4Var.d();
        }
    }

    @Override // k1.a4
    public int j() {
        return this.f6292c;
    }

    public boolean k(l1.l lVar) {
        return this.f6291b.c(lVar);
    }

    public void l(b4 b4Var) {
        this.f6290a.remove(b4Var.f());
        this.f6291b.h(b4Var.g());
    }
}
