package k1;

import i1.x0;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.l;
import l1.q;

/* loaded from: classes.dex */
public class a1 {

    /* renamed from: a, reason: collision with root package name */
    private n f6024a;

    /* renamed from: b, reason: collision with root package name */
    private l f6025b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6026c;

    private c1.c<l1.l, l1.i> a(Iterable<l1.i> iterable, i1.x0 x0Var, q.a aVar) {
        c1.c<l1.l, l1.i> h5 = this.f6024a.h(x0Var, aVar);
        for (l1.i iVar : iterable) {
            h5 = h5.t(iVar.getKey(), iVar);
        }
        return h5;
    }

    private c1.e<l1.i> b(i1.x0 x0Var, c1.c<l1.l, l1.i> cVar) {
        c1.e<l1.i> eVar = new c1.e<>(Collections.emptyList(), x0Var.c());
        Iterator<Map.Entry<l1.l, l1.i>> it = cVar.iterator();
        while (it.hasNext()) {
            l1.i value = it.next().getValue();
            if (x0Var.v(value)) {
                eVar = eVar.q(value);
            }
        }
        return eVar;
    }

    private c1.c<l1.l, l1.i> c(i1.x0 x0Var) {
        if (p1.v.c()) {
            p1.v.a("QueryEngine", "Using full collection scan to execute query: %s", x0Var.toString());
        }
        return this.f6024a.h(x0Var, q.a.f6557e);
    }

    private boolean f(i1.x0 x0Var, int r5, c1.e<l1.i> eVar, l1.w wVar) {
        if (!x0Var.p()) {
            return false;
        }
        if (r5 != eVar.size()) {
            return true;
        }
        l1.i i4 = x0Var.l() == x0.a.LIMIT_TO_FIRST ? eVar.i() : eVar.p();
        if (i4 == null) {
            return false;
        }
        return i4.c() || i4.j().compareTo(wVar) > 0;
    }

    private c1.c<l1.l, l1.i> g(i1.x0 x0Var) {
        if (x0Var.w()) {
            return null;
        }
        i1.c1 D = x0Var.D();
        l.a e5 = this.f6025b.e(D);
        if (e5.equals(l.a.NONE)) {
            return null;
        }
        if (!x0Var.p() || !e5.equals(l.a.PARTIAL)) {
            List<l1.l> g5 = this.f6025b.g(D);
            p1.b.d(g5 != null, "index manager must return results for partial and full indexes.", new Object[0]);
            c1.c<l1.l, l1.i> d5 = this.f6024a.d(g5);
            q.a d6 = this.f6025b.d(D);
            c1.e<l1.i> b5 = b(x0Var, d5);
            if (!f(x0Var, g5.size(), b5, d6.q())) {
                return a(b5, x0Var, d6);
            }
        }
        return g(x0Var.t(-1L));
    }

    private c1.c<l1.l, l1.i> h(i1.x0 x0Var, c1.e<l1.l> eVar, l1.w wVar) {
        if (x0Var.w() || wVar.equals(l1.w.f6583f)) {
            return null;
        }
        c1.e<l1.i> b5 = b(x0Var, this.f6024a.d(eVar));
        if (f(x0Var, eVar.size(), b5, wVar)) {
            return null;
        }
        if (p1.v.c()) {
            p1.v.a("QueryEngine", "Re-using previous result from %s to execute query: %s", wVar.toString(), x0Var.toString());
        }
        return a(b5, x0Var, q.a.i(wVar, -1));
    }

    public c1.c<l1.l, l1.i> d(i1.x0 x0Var, l1.w wVar, c1.e<l1.l> eVar) {
        p1.b.d(this.f6026c, "initialize() not called", new Object[0]);
        c1.c<l1.l, l1.i> g5 = g(x0Var);
        if (g5 != null) {
            return g5;
        }
        c1.c<l1.l, l1.i> h5 = h(x0Var, eVar, wVar);
        return h5 != null ? h5 : c(x0Var);
    }

    public void e(n nVar, l lVar) {
        this.f6024a = nVar;
        this.f6025b = lVar;
        this.f6026c = true;
    }
}
