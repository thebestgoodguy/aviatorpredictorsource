package k1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
class p0 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    private e1 f6210a;

    /* renamed from: b, reason: collision with root package name */
    private final t0 f6211b;

    /* renamed from: c, reason: collision with root package name */
    private Set<l1.l> f6212c;

    p0(t0 t0Var) {
        this.f6211b = t0Var;
    }

    private boolean b(l1.l lVar) {
        if (this.f6211b.h().k(lVar) || c(lVar)) {
            return true;
        }
        e1 e1Var = this.f6210a;
        return e1Var != null && e1Var.c(lVar);
    }

    private boolean c(l1.l lVar) {
        Iterator<r0> it = this.f6211b.p().iterator();
        while (it.hasNext()) {
            if (it.next().m(lVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // k1.d1
    public void a(l1.l lVar) {
        this.f6212c.remove(lVar);
    }

    @Override // k1.d1
    public void d(b4 b4Var) {
        v0 h5 = this.f6211b.h();
        Iterator<l1.l> it = h5.b(b4Var.g()).iterator();
        while (it.hasNext()) {
            this.f6212c.add(it.next());
        }
        h5.l(b4Var);
    }

    @Override // k1.d1
    public void f(l1.l lVar) {
        this.f6212c.add(lVar);
    }

    @Override // k1.d1
    public long h() {
        return -1L;
    }

    @Override // k1.d1
    public void i() {
        u0 g5 = this.f6211b.g();
        ArrayList arrayList = new ArrayList();
        for (l1.l lVar : this.f6212c) {
            if (!b(lVar)) {
                arrayList.add(lVar);
            }
        }
        g5.removeAll(arrayList);
        this.f6212c = null;
    }

    @Override // k1.d1
    public void j(e1 e1Var) {
        this.f6210a = e1Var;
    }

    @Override // k1.d1
    public void k(l1.l lVar) {
        this.f6212c.add(lVar);
    }

    @Override // k1.d1
    public void n() {
        this.f6212c = new HashSet();
    }

    @Override // k1.d1
    public void p(l1.l lVar) {
        if (b(lVar)) {
            this.f6212c.remove(lVar);
        } else {
            this.f6212c.add(lVar);
        }
    }
}
