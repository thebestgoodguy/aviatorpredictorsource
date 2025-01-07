package i1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class m1 {

    /* renamed from: a, reason: collision with root package name */
    private final q1 f4160a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<l1.r> f4161b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<m1.e> f4162c = new ArrayList<>();

    public m1(q1 q1Var) {
        this.f4160a = q1Var;
    }

    void b(l1.r rVar) {
        this.f4161b.add(rVar);
    }

    void c(l1.r rVar, m1.p pVar) {
        this.f4162c.add(new m1.e(rVar, pVar));
    }

    public boolean d(l1.r rVar) {
        Iterator<l1.r> it = this.f4161b.iterator();
        while (it.hasNext()) {
            if (rVar.r(it.next())) {
                return true;
            }
        }
        Iterator<m1.e> it2 = this.f4162c.iterator();
        while (it2.hasNext()) {
            if (rVar.r(it2.next().a())) {
                return true;
            }
        }
        return false;
    }

    public List<m1.e> e() {
        return this.f4162c;
    }

    public n1 f() {
        return new n1(this, l1.r.f6564g, false, null);
    }

    public o1 g(l1.t tVar) {
        return new o1(tVar, m1.d.b(this.f4161b), Collections.unmodifiableList(this.f4162c));
    }

    public o1 h(l1.t tVar, m1.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<m1.e> it = this.f4162c.iterator();
        while (it.hasNext()) {
            m1.e next = it.next();
            if (dVar.a(next.a())) {
                arrayList.add(next);
            }
        }
        return new o1(tVar, dVar, Collections.unmodifiableList(arrayList));
    }

    public o1 i(l1.t tVar) {
        return new o1(tVar, null, Collections.unmodifiableList(this.f4162c));
    }

    public p1 j(l1.t tVar) {
        return new p1(tVar, m1.d.b(this.f4161b), Collections.unmodifiableList(this.f4162c));
    }
}
