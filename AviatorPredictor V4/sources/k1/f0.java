package k1;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import k1.l0;

/* loaded from: classes.dex */
public final class f0 implements h1.a {

    /* renamed from: n, reason: collision with root package name */
    private static final long f6073n = TimeUnit.MINUTES.toSeconds(5);

    /* renamed from: a, reason: collision with root package name */
    private final z0 f6074a;

    /* renamed from: b, reason: collision with root package name */
    private l f6075b;

    /* renamed from: c, reason: collision with root package name */
    private w0 f6076c;

    /* renamed from: d, reason: collision with root package name */
    private k1.b f6077d;

    /* renamed from: e, reason: collision with root package name */
    private final f1 f6078e;

    /* renamed from: f, reason: collision with root package name */
    private n f6079f;

    /* renamed from: g, reason: collision with root package name */
    private final a1 f6080g;

    /* renamed from: h, reason: collision with root package name */
    private final e1 f6081h;

    /* renamed from: i, reason: collision with root package name */
    private final a4 f6082i;

    /* renamed from: j, reason: collision with root package name */
    private final k1.a f6083j;

    /* renamed from: k, reason: collision with root package name */
    private final SparseArray<b4> f6084k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<i1.c1, Integer> f6085l;

    /* renamed from: m, reason: collision with root package name */
    private final i1.d1 f6086m;

    /* JADX INFO: Access modifiers changed from: private */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        b4 f6087a;

        /* renamed from: b, reason: collision with root package name */
        int f6088b;

        private b() {
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        private final Map<l1.l, l1.s> f6089a;

        /* renamed from: b, reason: collision with root package name */
        private final Set<l1.l> f6090b;

        private c(Map<l1.l, l1.s> map, Set<l1.l> set) {
            this.f6089a = map;
            this.f6090b = set;
        }
    }

    public f0(z0 z0Var, a1 a1Var, g1.j jVar) {
        p1.b.d(z0Var.i(), "LocalStore was passed an unstarted persistence implementation", new Object[0]);
        this.f6074a = z0Var;
        this.f6080g = a1Var;
        a4 h5 = z0Var.h();
        this.f6082i = h5;
        this.f6083j = z0Var.a();
        this.f6086m = i1.d1.b(h5.j());
        this.f6078e = z0Var.g();
        e1 e1Var = new e1();
        this.f6081h = e1Var;
        this.f6084k = new SparseArray<>();
        this.f6085l = new HashMap();
        z0Var.f().j(e1Var);
        K(jVar);
    }

    private Set<l1.l> B(m1.h hVar) {
        HashSet hashSet = new HashSet();
        for (int r12 = 0; r12 < hVar.e().size(); r12++) {
            if (!hVar.e().get(r12).a().isEmpty()) {
                hashSet.add(hVar.b().h().get(r12).g());
            }
        }
        return hashSet;
    }

    private void K(g1.j jVar) {
        l c5 = this.f6074a.c(jVar);
        this.f6075b = c5;
        this.f6076c = this.f6074a.d(jVar, c5);
        k1.b b5 = this.f6074a.b(jVar);
        this.f6077d = b5;
        this.f6079f = new n(this.f6078e, this.f6076c, b5, this.f6075b);
        this.f6078e.a(this.f6075b);
        this.f6080g.e(this.f6079f, this.f6075b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c1.c L(m1.h hVar) {
        m1.g b5 = hVar.b();
        this.f6076c.l(b5, hVar.f());
        w(hVar);
        this.f6076c.c();
        this.f6077d.c(hVar.b().e());
        this.f6079f.n(B(hVar));
        return this.f6079f.d(b5.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(b bVar, i1.c1 c1Var) {
        int c5 = this.f6086m.c();
        bVar.f6088b = c5;
        b4 b4Var = new b4(c1Var, c5, this.f6074a.f().h(), b1.LISTEN);
        bVar.f6087a = b4Var;
        this.f6082i.i(b4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c1.c N(c1.c cVar, b4 b4Var) {
        c1.e<l1.l> i4 = l1.l.i();
        HashMap hashMap = new HashMap();
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            l1.l lVar = (l1.l) entry.getKey();
            l1.s sVar = (l1.s) entry.getValue();
            if (sVar.b()) {
                i4 = i4.q(lVar);
            }
            hashMap.put(lVar, sVar);
        }
        this.f6082i.f(b4Var.g());
        this.f6082i.d(i4, b4Var.g());
        c d02 = d0(hashMap);
        return this.f6079f.i(d02.f6089a, d02.f6090b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c1.c O(o1.i0 i0Var, l1.w wVar) {
        Map<Integer, o1.q0> d5 = i0Var.d();
        long h5 = this.f6074a.f().h();
        for (Map.Entry<Integer, o1.q0> entry : d5.entrySet()) {
            int intValue = entry.getKey().intValue();
            o1.q0 value = entry.getValue();
            b4 b4Var = this.f6084k.get(intValue);
            if (b4Var != null) {
                this.f6082i.g(value.d(), intValue);
                this.f6082i.d(value.b(), intValue);
                b4 j4 = b4Var.j(h5);
                if (i0Var.e().contains(Integer.valueOf(intValue))) {
                    com.google.protobuf.j jVar = com.google.protobuf.j.f2914f;
                    l1.w wVar2 = l1.w.f6583f;
                    j4 = j4.i(jVar, wVar2).h(wVar2);
                } else if (!value.e().isEmpty()) {
                    j4 = j4.i(value.e(), i0Var.c());
                }
                this.f6084k.put(intValue, j4);
                if (i0(b4Var, j4, value)) {
                    this.f6082i.a(j4);
                }
            }
        }
        Map<l1.l, l1.s> a5 = i0Var.a();
        Set<l1.l> b5 = i0Var.b();
        for (l1.l lVar : a5.keySet()) {
            if (b5.contains(lVar)) {
                this.f6074a.f().p(lVar);
            }
        }
        c d02 = d0(a5);
        Map<l1.l, l1.s> map = d02.f6089a;
        l1.w c5 = this.f6082i.c();
        if (!wVar.equals(l1.w.f6583f)) {
            p1.b.d(wVar.compareTo(c5) >= 0, "Watch stream reverted to previous snapshot?? (%s < %s)", wVar, c5);
            this.f6082i.e(wVar);
        }
        return this.f6079f.i(map, d02.f6090b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ l0.c P(l0 l0Var) {
        return l0Var.f(this.f6084k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ h1.j Q(String str) {
        return this.f6083j.c(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean R(h1.e eVar) {
        h1.e a5 = this.f6083j.a(eVar.a());
        return Boolean.valueOf(a5 != null && a5.b().compareTo(eVar.b()) >= 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            int d5 = g0Var.d();
            this.f6081h.b(g0Var.b(), d5);
            c1.e<l1.l> c5 = g0Var.c();
            Iterator<l1.l> it2 = c5.iterator();
            while (it2.hasNext()) {
                this.f6074a.f().f(it2.next());
            }
            this.f6081h.g(c5, d5);
            if (!g0Var.e()) {
                b4 b4Var = this.f6084k.get(d5);
                p1.b.d(b4Var != null, "Can't set limbo-free snapshot version for unknown target: %s", Integer.valueOf(d5));
                this.f6084k.put(d5, b4Var.h(b4Var.e()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ c1.c T(int r5) {
        m1.g k4 = this.f6076c.k(r5);
        p1.b.d(k4 != null, "Attempt to reject nonexistent batch!", new Object[0]);
        this.f6076c.e(k4);
        this.f6076c.c();
        this.f6077d.c(r5);
        this.f6079f.n(k4.f());
        return this.f6079f.d(k4.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(int r6) {
        b4 b4Var = this.f6084k.get(r6);
        p1.b.d(b4Var != null, "Tried to release nonexistent target: %s", Integer.valueOf(r6));
        Iterator<l1.l> it = this.f6081h.h(r6).iterator();
        while (it.hasNext()) {
            this.f6074a.f().f(it.next());
        }
        this.f6074a.f().d(b4Var);
        this.f6084k.remove(r6);
        this.f6085l.remove(b4Var.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(h1.e eVar) {
        this.f6083j.b(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void W(h1.j jVar, b4 b4Var, int r5, c1.e eVar) {
        if (jVar.c().compareTo(b4Var.e()) > 0) {
            b4 i4 = b4Var.i(com.google.protobuf.j.f2914f, jVar.c());
            this.f6084k.append(r5, i4);
            this.f6082i.a(i4);
            this.f6082i.f(r5);
            this.f6082i.d(eVar, r5);
        }
        this.f6083j.d(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(com.google.protobuf.j jVar) {
        this.f6076c.i(jVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.f6075b.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z() {
        this.f6076c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ m a0(Set set, List list, x0.o oVar) {
        Map<l1.l, l1.s> f5 = this.f6078e.f(set);
        HashSet hashSet = new HashSet();
        for (Map.Entry<l1.l, l1.s> entry : f5.entrySet()) {
            if (!entry.getValue().o()) {
                hashSet.add(entry.getKey());
            }
        }
        Map<l1.l, y0> k4 = this.f6079f.k(f5);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m1.f fVar = (m1.f) it.next();
            l1.t d5 = fVar.d(k4.get(fVar.g()).a());
            if (d5 != null) {
                arrayList.add(new m1.l(fVar.g(), d5, d5.j(), m1.m.a(true)));
            }
        }
        m1.g d6 = this.f6076c.d(oVar, arrayList, list);
        this.f6077d.e(d6.e(), d6.a(k4, hashSet));
        return m.a(d6.e(), k4);
    }

    private static i1.c1 b0(String str) {
        return i1.x0.b(l1.u.x("__bundle__/docs/" + str)).D();
    }

    private c d0(Map<l1.l, l1.s> map) {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        Map<l1.l, l1.s> f5 = this.f6078e.f(map.keySet());
        for (Map.Entry<l1.l, l1.s> entry : map.entrySet()) {
            l1.l key = entry.getKey();
            l1.s value = entry.getValue();
            l1.s sVar = f5.get(key);
            if (value.b() != sVar.b()) {
                hashSet.add(key);
            }
            if (value.e() && value.j().equals(l1.w.f6583f)) {
                arrayList.add(value.getKey());
            } else if (!sVar.o() || value.j().compareTo(sVar.j()) > 0 || (value.j().compareTo(sVar.j()) == 0 && sVar.c())) {
                p1.b.d(!l1.w.f6583f.equals(value.d()), "Cannot add a document when the remote version is zero", new Object[0]);
                this.f6078e.d(value, value.d());
            } else {
                p1.v.a("LocalStore", "Ignoring outdated watch update for %s.Current version: %s  Watch version: %s", key, sVar.j(), value.j());
            }
            hashMap.put(key, value);
        }
        this.f6078e.removeAll(arrayList);
        return new c(hashMap, hashSet);
    }

    private static boolean i0(b4 b4Var, b4 b4Var2, o1.q0 q0Var) {
        return b4Var.c().isEmpty() || b4Var2.e().g().i() - b4Var.e().g().i() >= f6073n || (q0Var.b().size() + q0Var.c().size()) + q0Var.d().size() > 0;
    }

    private void k0() {
        this.f6074a.k("Start IndexManager", new Runnable() { // from class: k1.w
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.Y();
            }
        });
    }

    private void l0() {
        this.f6074a.k("Start MutationQueue", new Runnable() { // from class: k1.p
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.Z();
            }
        });
    }

    private void w(m1.h hVar) {
        m1.g b5 = hVar.b();
        for (l1.l lVar : b5.f()) {
            l1.s c5 = this.f6078e.c(lVar);
            l1.w p4 = hVar.d().p(lVar);
            p1.b.d(p4 != null, "docVersions should contain every doc in the write.", new Object[0]);
            if (c5.j().compareTo(p4) < 0) {
                b5.c(c5, hVar);
                if (c5.o()) {
                    this.f6078e.d(c5, hVar.c());
                }
            }
        }
        this.f6076c.e(b5);
    }

    public l A() {
        return this.f6075b;
    }

    public l1.w C() {
        return this.f6082i.c();
    }

    public com.google.protobuf.j D() {
        return this.f6076c.b();
    }

    public n E() {
        return this.f6079f;
    }

    public h1.j F(final String str) {
        return (h1.j) this.f6074a.j("Get named query", new p1.y() { // from class: k1.r
            @Override // p1.y
            public final Object get() {
                h1.j Q;
                Q = f0.this.Q(str);
                return Q;
            }
        });
    }

    public m1.g G(int r22) {
        return this.f6076c.f(r22);
    }

    b4 H(i1.c1 c1Var) {
        Integer num = this.f6085l.get(c1Var);
        return num != null ? this.f6084k.get(num.intValue()) : this.f6082i.h(c1Var);
    }

    public c1.c<l1.l, l1.i> I(g1.j jVar) {
        List<m1.g> j4 = this.f6076c.j();
        K(jVar);
        k0();
        l0();
        List<m1.g> j5 = this.f6076c.j();
        c1.e<l1.l> i4 = l1.l.i();
        Iterator it = Arrays.asList(j4, j5).iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
                Iterator<m1.f> it3 = ((m1.g) it2.next()).h().iterator();
                while (it3.hasNext()) {
                    i4 = i4.q(it3.next().g());
                }
            }
        }
        return this.f6079f.d(i4);
    }

    public boolean J(final h1.e eVar) {
        return ((Boolean) this.f6074a.j("Has newer bundle", new p1.y() { // from class: k1.q
            @Override // p1.y
            public final Object get() {
                Boolean R;
                R = f0.this.R(eVar);
                return R;
            }
        })).booleanValue();
    }

    @Override // h1.a
    public c1.c<l1.l, l1.i> a(final c1.c<l1.l, l1.s> cVar, String str) {
        final b4 u4 = u(b0(str));
        return (c1.c) this.f6074a.j("Apply bundle documents", new p1.y() { // from class: k1.e0
            @Override // p1.y
            public final Object get() {
                c1.c N;
                N = f0.this.N(cVar, u4);
                return N;
            }
        });
    }

    @Override // h1.a
    public void b(final h1.e eVar) {
        this.f6074a.k("Save bundle", new Runnable() { // from class: k1.z
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.V(eVar);
            }
        });
    }

    @Override // h1.a
    public void c(final h1.j jVar, final c1.e<l1.l> eVar) {
        final b4 u4 = u(jVar.a().b());
        final int g5 = u4.g();
        this.f6074a.k("Saved named query", new Runnable() { // from class: k1.a0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.W(jVar, u4, g5, eVar);
            }
        });
    }

    public void c0(final List<g0> list) {
        this.f6074a.k("notifyLocalViewChanges", new Runnable() { // from class: k1.b0
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.S(list);
            }
        });
    }

    public l1.i e0(l1.l lVar) {
        return this.f6079f.c(lVar);
    }

    public c1.c<l1.l, l1.i> f0(final int r32) {
        return (c1.c) this.f6074a.j("Reject batch", new p1.y() { // from class: k1.d0
            @Override // p1.y
            public final Object get() {
                c1.c T;
                T = f0.this.T(r32);
                return T;
            }
        });
    }

    public void g0(final int r32) {
        this.f6074a.k("Release target", new Runnable() { // from class: k1.x
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.U(r32);
            }
        });
    }

    public void h0(final com.google.protobuf.j jVar) {
        this.f6074a.k("Set stream token", new Runnable() { // from class: k1.y
            @Override // java.lang.Runnable
            public final void run() {
                f0.this.X(jVar);
            }
        });
    }

    public void j0() {
        this.f6074a.e().run();
        k0();
        l0();
    }

    public m m0(final List<m1.f> list) {
        final x0.o n4 = x0.o.n();
        final HashSet hashSet = new HashSet();
        Iterator<m1.f> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().g());
        }
        return (m) this.f6074a.j("Locally write mutations", new p1.y() { // from class: k1.s
            @Override // p1.y
            public final Object get() {
                m a02;
                a02 = f0.this.a0(hashSet, list, n4);
                return a02;
            }
        });
    }

    public c1.c<l1.l, l1.i> t(final m1.h hVar) {
        return (c1.c) this.f6074a.j("Acknowledge batch", new p1.y() { // from class: k1.u
            @Override // p1.y
            public final Object get() {
                c1.c L;
                L = f0.this.L(hVar);
                return L;
            }
        });
    }

    public b4 u(final i1.c1 c1Var) {
        int r12;
        b4 h5 = this.f6082i.h(c1Var);
        if (h5 != null) {
            r12 = h5.g();
        } else {
            final b bVar = new b();
            this.f6074a.k("Allocate target", new Runnable() { // from class: k1.c0
                @Override // java.lang.Runnable
                public final void run() {
                    f0.this.M(bVar, c1Var);
                }
            });
            r12 = bVar.f6088b;
            h5 = bVar.f6087a;
        }
        if (this.f6084k.get(r12) == null) {
            this.f6084k.put(r12, h5);
            this.f6085l.put(c1Var, Integer.valueOf(r12));
        }
        return h5;
    }

    public c1.c<l1.l, l1.i> v(final o1.i0 i0Var) {
        final l1.w c5 = i0Var.c();
        return (c1.c) this.f6074a.j("Apply remote event", new p1.y() { // from class: k1.v
            @Override // p1.y
            public final Object get() {
                c1.c O;
                O = f0.this.O(i0Var, c5);
                return O;
            }
        });
    }

    public l0.c x(final l0 l0Var) {
        return (l0.c) this.f6074a.j("Collect garbage", new p1.y() { // from class: k1.t
            @Override // p1.y
            public final Object get() {
                l0.c P;
                P = f0.this.P(l0Var);
                return P;
            }
        });
    }

    public c1 y(i1.x0 x0Var, boolean z4) {
        c1.e<l1.l> eVar;
        l1.w wVar;
        b4 H = H(x0Var.D());
        l1.w wVar2 = l1.w.f6583f;
        c1.e<l1.l> i4 = l1.l.i();
        if (H != null) {
            wVar = H.a();
            eVar = this.f6082i.b(H.g());
        } else {
            eVar = i4;
            wVar = wVar2;
        }
        a1 a1Var = this.f6080g;
        if (z4) {
            wVar2 = wVar;
        }
        return new c1(a1Var.d(x0Var, wVar2, eVar), eVar);
    }

    public int z() {
        return this.f6076c.g();
    }
}
