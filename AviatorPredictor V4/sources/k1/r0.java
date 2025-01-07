package k1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class r0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    private final List<m1.g> f6228a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private c1.e<e> f6229b = new c1.e<>(Collections.emptyList(), e.f6062c);

    /* renamed from: c, reason: collision with root package name */
    private int f6230c = 1;

    /* renamed from: d, reason: collision with root package name */
    private com.google.protobuf.j f6231d = o1.v0.f6954v;

    /* renamed from: e, reason: collision with root package name */
    private final t0 f6232e;

    /* renamed from: f, reason: collision with root package name */
    private final q0 f6233f;

    r0(t0 t0Var, g1.j jVar) {
        this.f6232e = t0Var;
        this.f6233f = t0Var.c(jVar);
    }

    private int n(int r32) {
        if (this.f6228a.isEmpty()) {
            return 0;
        }
        return r32 - this.f6228a.get(0).e();
    }

    private int o(int r4, String str) {
        int n4 = n(r4);
        p1.b.d(n4 >= 0 && n4 < this.f6228a.size(), "Batches must exist to be %s", str);
        return n4;
    }

    private List<m1.g> q(c1.e<Integer> eVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = eVar.iterator();
        while (it.hasNext()) {
            m1.g k4 = k(it.next().intValue());
            if (k4 != null) {
                arrayList.add(k4);
            }
        }
        return arrayList;
    }

    @Override // k1.w0
    public void a() {
        if (p()) {
            this.f6230c = 1;
        }
    }

    @Override // k1.w0
    public com.google.protobuf.j b() {
        return this.f6231d;
    }

    @Override // k1.w0
    public void c() {
        if (this.f6228a.isEmpty()) {
            p1.b.d(this.f6229b.isEmpty(), "Document leak -- detected dangling mutation references when queue is empty.", new Object[0]);
        }
    }

    @Override // k1.w0
    public m1.g d(x0.o oVar, List<m1.f> list, List<m1.f> list2) {
        p1.b.d(!list2.isEmpty(), "Mutation batches should not be empty", new Object[0]);
        int r02 = this.f6230c;
        this.f6230c = r02 + 1;
        int size = this.f6228a.size();
        if (size > 0) {
            p1.b.d(this.f6228a.get(size - 1).e() < r02, "Mutation batchIds must be monotonically increasing order", new Object[0]);
        }
        m1.g gVar = new m1.g(r02, oVar, list, list2);
        this.f6228a.add(gVar);
        for (m1.f fVar : list2) {
            this.f6229b = this.f6229b.q(new e(fVar.g(), r02));
            this.f6233f.j(fVar.g().r());
        }
        return gVar;
    }

    @Override // k1.w0
    public void e(m1.g gVar) {
        p1.b.d(o(gVar.e(), "removed") == 0, "Can only remove the first entry of the mutation queue", new Object[0]);
        this.f6228a.remove(0);
        c1.e<e> eVar = this.f6229b;
        Iterator<m1.f> it = gVar.h().iterator();
        while (it.hasNext()) {
            l1.l g5 = it.next().g();
            this.f6232e.f().k(g5);
            eVar = eVar.s(new e(g5, gVar.e()));
        }
        this.f6229b = eVar;
    }

    @Override // k1.w0
    public m1.g f(int r22) {
        int n4 = n(r22 + 1);
        if (n4 < 0) {
            n4 = 0;
        }
        if (this.f6228a.size() > n4) {
            return this.f6228a.get(n4);
        }
        return null;
    }

    @Override // k1.w0
    public int g() {
        if (this.f6228a.isEmpty()) {
            return -1;
        }
        return this.f6230c - 1;
    }

    @Override // k1.w0
    public List<m1.g> h(Iterable<l1.l> iterable) {
        c1.e<Integer> eVar = new c1.e<>(Collections.emptyList(), p1.g0.f());
        for (l1.l lVar : iterable) {
            Iterator<e> r4 = this.f6229b.r(new e(lVar, 0));
            while (r4.hasNext()) {
                e next = r4.next();
                if (!lVar.equals(next.d())) {
                    break;
                }
                eVar = eVar.q(Integer.valueOf(next.c()));
            }
        }
        return q(eVar);
    }

    @Override // k1.w0
    public void i(com.google.protobuf.j jVar) {
        this.f6231d = (com.google.protobuf.j) p1.x.b(jVar);
    }

    @Override // k1.w0
    public List<m1.g> j() {
        return Collections.unmodifiableList(this.f6228a);
    }

    @Override // k1.w0
    public m1.g k(int r4) {
        int n4 = n(r4);
        if (n4 < 0 || n4 >= this.f6228a.size()) {
            return null;
        }
        m1.g gVar = this.f6228a.get(n4);
        p1.b.d(gVar.e() == r4, "If found batch must match", new Object[0]);
        return gVar;
    }

    @Override // k1.w0
    public void l(m1.g gVar, com.google.protobuf.j jVar) {
        int e5 = gVar.e();
        int o4 = o(e5, "acknowledged");
        p1.b.d(o4 == 0, "Can only acknowledge the first batch in the mutation queue", new Object[0]);
        m1.g gVar2 = this.f6228a.get(o4);
        p1.b.d(e5 == gVar2.e(), "Queue ordering failure: expected batch %d, got batch %d", Integer.valueOf(e5), Integer.valueOf(gVar2.e()));
        this.f6231d = (com.google.protobuf.j) p1.x.b(jVar);
    }

    boolean m(l1.l lVar) {
        Iterator<e> r4 = this.f6229b.r(new e(lVar, 0));
        if (r4.hasNext()) {
            return r4.next().d().equals(lVar);
        }
        return false;
    }

    public boolean p() {
        return this.f6228a.isEmpty();
    }
}
