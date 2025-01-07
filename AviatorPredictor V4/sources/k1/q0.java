package k1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import k1.l;
import l1.q;

/* loaded from: classes.dex */
class q0 implements l {

    /* renamed from: a, reason: collision with root package name */
    private final a f6220a = new a();

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, HashSet<l1.u>> f6221a = new HashMap<>();

        a() {
        }

        boolean a(l1.u uVar) {
            p1.b.d(uVar.s() % 2 == 1, "Expected a collection path.", new Object[0]);
            String n4 = uVar.n();
            l1.u u4 = uVar.u();
            HashSet<l1.u> hashSet = this.f6221a.get(n4);
            if (hashSet == null) {
                hashSet = new HashSet<>();
                this.f6221a.put(n4, hashSet);
            }
            return hashSet.add(u4);
        }

        List<l1.u> b(String str) {
            HashSet<l1.u> hashSet = this.f6221a.get(str);
            return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
        }
    }

    @Override // k1.l
    public void a() {
    }

    @Override // k1.l
    public List<l1.u> b(String str) {
        return this.f6220a.b(str);
    }

    @Override // k1.l
    public q.a c(String str) {
        return q.a.f6557e;
    }

    @Override // k1.l
    public q.a d(i1.c1 c1Var) {
        return q.a.f6557e;
    }

    @Override // k1.l
    public l.a e(i1.c1 c1Var) {
        return l.a.NONE;
    }

    @Override // k1.l
    public void f(c1.c<l1.l, l1.i> cVar) {
    }

    @Override // k1.l
    public List<l1.l> g(i1.c1 c1Var) {
        return null;
    }

    @Override // k1.l
    public void h(String str, q.a aVar) {
    }

    @Override // k1.l
    public String i() {
        return null;
    }

    @Override // k1.l
    public void j(l1.u uVar) {
        this.f6220a.a(uVar);
    }
}
