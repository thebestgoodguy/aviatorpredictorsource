package l1;

import i1.c1;
import i1.q;
import i1.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.q;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    private final String f6585a;

    /* renamed from: b, reason: collision with root package name */
    private i1.q f6586b;

    /* renamed from: c, reason: collision with root package name */
    private final List<i1.q> f6587c;

    /* renamed from: d, reason: collision with root package name */
    private final List<w0> f6588d;

    public x(c1 c1Var) {
        this.f6585a = c1Var.d() != null ? c1Var.d() : c1Var.n().n();
        this.f6588d = c1Var.m();
        this.f6586b = null;
        this.f6587c = new ArrayList();
        Iterator<i1.r> it = c1Var.h().iterator();
        while (it.hasNext()) {
            i1.q qVar = (i1.q) it.next();
            if (qVar.j()) {
                i1.q qVar2 = this.f6586b;
                p1.b.d(qVar2 == null || qVar2.g().equals(qVar.g()), "Only a single inequality is supported", new Object[0]);
                this.f6586b = qVar;
            } else {
                this.f6587c.add(qVar);
            }
        }
    }

    private boolean a(q.c cVar) {
        Iterator<i1.q> it = this.f6587c.iterator();
        while (it.hasNext()) {
            if (b(it.next(), cVar)) {
                return true;
            }
        }
        return false;
    }

    private boolean b(i1.q qVar, q.c cVar) {
        if (qVar == null || !qVar.g().equals(cVar.h())) {
            return false;
        }
        return cVar.i().equals(q.c.a.CONTAINS) == (qVar.h().equals(q.b.ARRAY_CONTAINS) || qVar.h().equals(q.b.ARRAY_CONTAINS_ANY));
    }

    private boolean c(w0 w0Var, q.c cVar) {
        if (w0Var.c().equals(cVar.h())) {
            return (cVar.i().equals(q.c.a.ASCENDING) && w0Var.b().equals(w0.a.ASCENDING)) || (cVar.i().equals(q.c.a.DESCENDING) && w0Var.b().equals(w0.a.DESCENDING));
        }
        return false;
    }

    public boolean d(q qVar) {
        p1.b.d(qVar.d().equals(this.f6585a), "Collection IDs do not match", new Object[0]);
        q.c c5 = qVar.c();
        if (c5 != null && !a(c5)) {
            return false;
        }
        Iterator<w0> it = this.f6588d.iterator();
        List<q.c> e5 = qVar.e();
        int r22 = 0;
        while (r22 < e5.size() && a(e5.get(r22))) {
            r22++;
        }
        if (r22 == e5.size()) {
            return true;
        }
        if (this.f6586b != null) {
            q.c cVar = e5.get(r22);
            if (!b(this.f6586b, cVar) || !c(it.next(), cVar)) {
                return false;
            }
            r22++;
        }
        while (r22 < e5.size()) {
            q.c cVar2 = e5.get(r22);
            if (!it.hasNext() || !c(it.next(), cVar2)) {
                return false;
            }
            r22++;
        }
        return true;
    }
}
