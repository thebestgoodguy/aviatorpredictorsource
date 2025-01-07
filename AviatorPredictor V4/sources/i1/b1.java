package i1;

import b3.f1;
import com.google.firebase.firestore.u;
import i1.q0;
import i1.s1;
import i1.u1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import k1.b4;
import o1.n0;

/* loaded from: classes.dex */
public class b1 implements n0.c {

    /* renamed from: o, reason: collision with root package name */
    private static final String f4040o = "b1";

    /* renamed from: a, reason: collision with root package name */
    private final k1.f0 f4041a;

    /* renamed from: b, reason: collision with root package name */
    private final o1.n0 f4042b;

    /* renamed from: e, reason: collision with root package name */
    private final int f4045e;

    /* renamed from: m, reason: collision with root package name */
    private g1.j f4053m;

    /* renamed from: n, reason: collision with root package name */
    private c f4054n;

    /* renamed from: c, reason: collision with root package name */
    private final Map<x0, z0> f4043c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, List<x0>> f4044d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final LinkedHashSet<l1.l> f4046f = new LinkedHashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private final Map<l1.l, Integer> f4047g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    private final Map<Integer, b> f4048h = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    private final k1.e1 f4049i = new k1.e1();

    /* renamed from: j, reason: collision with root package name */
    private final Map<g1.j, Map<Integer, o0.i<Void>>> f4050j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private final d1 f4052l = d1.a();

    /* renamed from: k, reason: collision with root package name */
    private final Map<Integer, List<o0.i<Void>>> f4051k = new HashMap();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4055a;

        static {
            int[] r02 = new int[q0.a.values().length];
            f4055a = r02;
            try {
                r02[q0.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4055a[q0.a.REMOVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private final l1.l f4056a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4057b;

        b(l1.l lVar) {
            this.f4056a = lVar;
        }
    }

    interface c {
        void a(v0 v0Var);

        void b(x0 x0Var, b3.f1 f1Var);

        void c(List<u1> list);
    }

    public b1(k1.f0 f0Var, o1.n0 n0Var, g1.j jVar, int r4) {
        this.f4041a = f0Var;
        this.f4042b = n0Var;
        this.f4045e = r4;
        this.f4053m = jVar;
    }

    private void A(List<q0> list, int r7) {
        for (q0 q0Var : list) {
            int r12 = a.f4055a[q0Var.b().ordinal()];
            if (r12 == 1) {
                this.f4049i.a(q0Var.a(), r7);
                y(q0Var);
            } else {
                if (r12 != 2) {
                    throw p1.b.a("Unknown limbo change type: %s", q0Var.b());
                }
                p1.v.a(f4040o, "Document no longer in limbo: %s", q0Var.a());
                l1.l a5 = q0Var.a();
                this.f4049i.f(a5, r7);
                if (!this.f4049i.c(a5)) {
                    u(a5);
                }
            }
        }
    }

    private void g(int r4, o0.i<Void> iVar) {
        Map<Integer, o0.i<Void>> map = this.f4050j.get(this.f4053m);
        if (map == null) {
            map = new HashMap<>();
            this.f4050j.put(this.f4053m, map);
        }
        map.put(Integer.valueOf(r4), iVar);
    }

    private void h(String str) {
        p1.b.d(this.f4054n != null, "Trying to call %s before setting callback", str);
    }

    private void i(c1.c<l1.l, l1.i> cVar, o1.i0 i0Var) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Map.Entry<x0, z0>> it = this.f4043c.entrySet().iterator();
        while (it.hasNext()) {
            z0 value = it.next().getValue();
            s1 c5 = value.c();
            s1.b g5 = c5.g(cVar);
            if (g5.b()) {
                g5 = c5.h(this.f4041a.y(value.a(), false).a(), g5);
            }
            t1 c6 = value.c().c(g5, i0Var == null ? null : i0Var.d().get(Integer.valueOf(value.b())));
            A(c6.a(), value.b());
            if (c6.b() != null) {
                arrayList.add(c6.b());
                arrayList2.add(k1.g0.a(value.b(), c6.b()));
            }
        }
        this.f4054n.c(arrayList);
        this.f4041a.c0(arrayList2);
    }

    private boolean j(b3.f1 f1Var) {
        f1.b m4 = f1Var.m();
        return (m4 == f1.b.FAILED_PRECONDITION && (f1Var.n() != null ? f1Var.n() : "").contains("requires an index")) || m4 == f1.b.PERMISSION_DENIED;
    }

    private void k() {
        Iterator<Map.Entry<Integer, List<o0.i<Void>>>> it = this.f4051k.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<o0.i<Void>> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                it2.next().b(new com.google.firebase.firestore.u("'waitForPendingWrites' task is cancelled due to User change.", u.a.CANCELLED));
            }
        }
        this.f4051k.clear();
    }

    private u1 m(x0 x0Var, int r7) {
        o1.q0 q0Var;
        k1.c1 y4 = this.f4041a.y(x0Var, true);
        u1.a aVar = u1.a.NONE;
        if (this.f4044d.get(Integer.valueOf(r7)) != null) {
            q0Var = o1.q0.a(this.f4043c.get(this.f4044d.get(Integer.valueOf(r7)).get(0)).c().i() == u1.a.SYNCED);
        } else {
            q0Var = null;
        }
        s1 s1Var = new s1(x0Var, y4.b());
        t1 c5 = s1Var.c(s1Var.g(y4.a()), q0Var);
        A(c5.a(), r7);
        this.f4043c.put(x0Var, new z0(x0Var, r7, s1Var));
        if (!this.f4044d.containsKey(Integer.valueOf(r7))) {
            this.f4044d.put(Integer.valueOf(r7), new ArrayList(1));
        }
        this.f4044d.get(Integer.valueOf(r7)).add(x0Var);
        return c5.b();
    }

    private void p(b3.f1 f1Var, String str, Object... objArr) {
        if (j(f1Var)) {
            p1.v.d("Firestore", "%s: %s", String.format(str, objArr), f1Var);
        }
    }

    private void q(int r32, b3.f1 f1Var) {
        Integer valueOf;
        o0.i<Void> iVar;
        Map<Integer, o0.i<Void>> map = this.f4050j.get(this.f4053m);
        if (map == null || (iVar = map.get((valueOf = Integer.valueOf(r32)))) == null) {
            return;
        }
        if (f1Var != null) {
            iVar.b(p1.g0.r(f1Var));
        } else {
            iVar.c(null);
        }
        map.remove(valueOf);
    }

    private void r() {
        while (!this.f4046f.isEmpty() && this.f4047g.size() < this.f4045e) {
            Iterator<l1.l> it = this.f4046f.iterator();
            l1.l next = it.next();
            it.remove();
            int c5 = this.f4052l.c();
            this.f4048h.put(Integer.valueOf(c5), new b(next));
            this.f4047g.put(next, Integer.valueOf(c5));
            this.f4042b.F(new b4(x0.b(next.t()).D(), c5, -1L, k1.b1.LIMBO_RESOLUTION));
        }
    }

    private void t(int r5, b3.f1 f1Var) {
        for (x0 x0Var : this.f4044d.get(Integer.valueOf(r5))) {
            this.f4043c.remove(x0Var);
            if (!f1Var.o()) {
                this.f4054n.b(x0Var, f1Var);
                p(f1Var, "Listen for %s failed", x0Var);
            }
        }
        this.f4044d.remove(Integer.valueOf(r5));
        c1.e<l1.l> d5 = this.f4049i.d(r5);
        this.f4049i.h(r5);
        Iterator<l1.l> it = d5.iterator();
        while (it.hasNext()) {
            l1.l next = it.next();
            if (!this.f4049i.c(next)) {
                u(next);
            }
        }
    }

    private void u(l1.l lVar) {
        this.f4046f.remove(lVar);
        Integer num = this.f4047g.get(lVar);
        if (num != null) {
            this.f4042b.R(num.intValue());
            this.f4047g.remove(lVar);
            this.f4048h.remove(num);
            r();
        }
    }

    private void v(int r4) {
        if (this.f4051k.containsKey(Integer.valueOf(r4))) {
            Iterator<o0.i<Void>> it = this.f4051k.get(Integer.valueOf(r4)).iterator();
            while (it.hasNext()) {
                it.next().c(null);
            }
            this.f4051k.remove(Integer.valueOf(r4));
        }
    }

    private void y(q0 q0Var) {
        l1.l a5 = q0Var.a();
        if (this.f4047g.containsKey(a5) || this.f4046f.contains(a5)) {
            return;
        }
        p1.v.a(f4040o, "New document in limbo: %s", a5);
        this.f4046f.add(a5);
        r();
    }

    public void B(List<m1.f> list, o0.i<Void> iVar) {
        h("writeMutations");
        k1.m m02 = this.f4041a.m0(list);
        g(m02.b(), iVar);
        i(m02.c(), null);
        this.f4042b.t();
    }

    @Override // o1.n0.c
    public void a(v0 v0Var) {
        h("handleOnlineStateChange");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<x0, z0>> it = this.f4043c.entrySet().iterator();
        while (it.hasNext()) {
            t1 d5 = it.next().getValue().c().d(v0Var);
            p1.b.d(d5.a().isEmpty(), "OnlineState should not affect limbo documents.", new Object[0]);
            if (d5.b() != null) {
                arrayList.add(d5.b());
            }
        }
        this.f4054n.c(arrayList);
        this.f4054n.a(v0Var);
    }

    @Override // o1.n0.c
    public c1.e<l1.l> b(int r4) {
        b bVar = this.f4048h.get(Integer.valueOf(r4));
        if (bVar != null && bVar.f4057b) {
            return l1.l.i().q(bVar.f4056a);
        }
        c1.e<l1.l> i4 = l1.l.i();
        if (this.f4044d.containsKey(Integer.valueOf(r4))) {
            for (x0 x0Var : this.f4044d.get(Integer.valueOf(r4))) {
                if (this.f4043c.containsKey(x0Var)) {
                    i4 = i4.t(this.f4043c.get(x0Var).c().j());
                }
            }
        }
        return i4;
    }

    @Override // o1.n0.c
    public void c(int r5, b3.f1 f1Var) {
        h("handleRejectedWrite");
        c1.c<l1.l, l1.i> f02 = this.f4041a.f0(r5);
        if (!f02.isEmpty()) {
            p(f1Var, "Write failed at %s", f02.s().t());
        }
        q(r5, f1Var);
        v(r5);
        i(f02, null);
    }

    @Override // o1.n0.c
    public void d(o1.i0 i0Var) {
        h("handleRemoteEvent");
        for (Map.Entry<Integer, o1.q0> entry : i0Var.d().entrySet()) {
            Integer key = entry.getKey();
            o1.q0 value = entry.getValue();
            b bVar = this.f4048h.get(key);
            if (bVar != null) {
                p1.b.d((value.b().size() + value.c().size()) + value.d().size() <= 1, "Limbo resolution for single document contains multiple changes.", new Object[0]);
                if (value.b().size() > 0) {
                    bVar.f4057b = true;
                } else if (value.c().size() > 0) {
                    p1.b.d(bVar.f4057b, "Received change for limbo target document without add.", new Object[0]);
                } else if (value.d().size() > 0) {
                    p1.b.d(bVar.f4057b, "Received remove for limbo target document without add.", new Object[0]);
                    bVar.f4057b = false;
                }
            }
        }
        i(this.f4041a.v(i0Var), i0Var);
    }

    @Override // o1.n0.c
    public void e(int r8, b3.f1 f1Var) {
        h("handleRejectedListen");
        b bVar = this.f4048h.get(Integer.valueOf(r8));
        l1.l lVar = bVar != null ? bVar.f4056a : null;
        if (lVar == null) {
            this.f4041a.g0(r8);
            t(r8, f1Var);
            return;
        }
        this.f4047g.remove(lVar);
        this.f4048h.remove(Integer.valueOf(r8));
        r();
        l1.w wVar = l1.w.f6583f;
        d(new o1.i0(wVar, Collections.emptyMap(), Collections.emptySet(), Collections.singletonMap(lVar, l1.s.r(lVar, wVar)), Collections.singleton(lVar)));
    }

    @Override // o1.n0.c
    public void f(m1.h hVar) {
        h("handleSuccessfulWrite");
        q(hVar.b().e(), null);
        v(hVar.b().e());
        i(this.f4041a.t(hVar), null);
    }

    public void l(g1.j jVar) {
        boolean z4 = !this.f4053m.equals(jVar);
        this.f4053m = jVar;
        if (z4) {
            k();
            i(this.f4041a.I(jVar), null);
        }
        this.f4042b.u();
    }

    public int n(x0 x0Var) {
        h("listen");
        p1.b.d(!this.f4043c.containsKey(x0Var), "We already listen to query: %s", x0Var);
        b4 u4 = this.f4041a.u(x0Var.D());
        this.f4042b.F(u4);
        this.f4054n.c(Collections.singletonList(m(x0Var, u4.g())));
        return u4.g();
    }

    public void o(h1.f fVar, com.google.firebase.firestore.c0 c0Var) {
        try {
            try {
                h1.e d5 = fVar.d();
                if (this.f4041a.J(d5)) {
                    c0Var.t(com.google.firebase.firestore.d0.b(d5));
                    try {
                        fVar.b();
                        return;
                    } catch (IOException e5) {
                        p1.v.d("SyncEngine", "Exception while closing bundle", e5);
                        return;
                    }
                }
                c0Var.u(com.google.firebase.firestore.d0.a(d5));
                h1.d dVar = new h1.d(this.f4041a, d5);
                long j4 = 0;
                while (true) {
                    h1.c f5 = fVar.f();
                    if (f5 == null) {
                        i(dVar.b(), null);
                        this.f4041a.b(d5);
                        c0Var.t(com.google.firebase.firestore.d0.b(d5));
                        try {
                            fVar.b();
                            return;
                        } catch (IOException e6) {
                            p1.v.d("SyncEngine", "Exception while closing bundle", e6);
                            return;
                        }
                    }
                    long e7 = fVar.e();
                    com.google.firebase.firestore.d0 a5 = dVar.a(f5, e7 - j4);
                    if (a5 != null) {
                        c0Var.u(a5);
                    }
                    j4 = e7;
                }
            } catch (Exception e8) {
                p1.v.d("Firestore", "Loading bundle failed : %s", e8);
                c0Var.s(new com.google.firebase.firestore.u("Bundle failed to load", u.a.INVALID_ARGUMENT, e8));
                try {
                    fVar.b();
                } catch (IOException e9) {
                    p1.v.d("SyncEngine", "Exception while closing bundle", e9);
                }
            }
        } catch (Throwable th) {
            try {
                fVar.b();
            } catch (IOException e10) {
                p1.v.d("SyncEngine", "Exception while closing bundle", e10);
            }
            throw th;
        }
    }

    public void s(o0.i<Void> iVar) {
        if (!this.f4042b.n()) {
            p1.v.a(f4040o, "The network is disabled. The task returned by 'awaitPendingWrites()' will not complete until the network is enabled.", new Object[0]);
        }
        int z4 = this.f4041a.z();
        if (z4 == -1) {
            iVar.c(null);
            return;
        }
        if (!this.f4051k.containsKey(Integer.valueOf(z4))) {
            this.f4051k.put(Integer.valueOf(z4), new ArrayList());
        }
        this.f4051k.get(Integer.valueOf(z4)).add(iVar);
    }

    public void w(c cVar) {
        this.f4054n = cVar;
    }

    void x(x0 x0Var) {
        h("stopListening");
        z0 z0Var = this.f4043c.get(x0Var);
        p1.b.d(z0Var != null, "Trying to stop listening to a query not found", new Object[0]);
        this.f4043c.remove(x0Var);
        int b5 = z0Var.b();
        List<x0> list = this.f4044d.get(Integer.valueOf(b5));
        list.remove(x0Var);
        if (list.isEmpty()) {
            this.f4041a.g0(b5);
            this.f4042b.R(b5);
            t(b5, b3.f1.f756f);
        }
    }

    public <TResult> o0.h<TResult> z(p1.g gVar, com.google.firebase.firestore.u0 u0Var, p1.t<g1, o0.h<TResult>> tVar) {
        return new k1(gVar, this.f4042b, u0Var, tVar).i();
    }
}
