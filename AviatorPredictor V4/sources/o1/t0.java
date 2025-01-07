package o1;

import i1.c1;
import i1.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import k1.b1;
import k1.b4;
import o1.s0;

/* loaded from: classes.dex */
public class t0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f6924a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, r0> f6925b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private Map<l1.l, l1.s> f6926c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<l1.l, Set<Integer>> f6927d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private Set<Integer> f6928e = new HashSet();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6929a;

        static {
            int[] r02 = new int[s0.e.values().length];
            f6929a = r02;
            try {
                r02[s0.e.NoChange.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6929a[s0.e.Added.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6929a[s0.e.Removed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6929a[s0.e.Current.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6929a[s0.e.Reset.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public interface b {
        b4 a(int r12);

        c1.e<l1.l> b(int r12);
    }

    public t0(b bVar) {
        this.f6924a = bVar;
    }

    private void a(int r4, l1.s sVar) {
        if (j(r4)) {
            d(r4).a(sVar.getKey(), p(r4, sVar.getKey()) ? n.a.MODIFIED : n.a.ADDED);
            this.f6926c.put(sVar.getKey(), sVar);
            c(sVar.getKey()).add(Integer.valueOf(r4));
        }
    }

    private Set<Integer> c(l1.l lVar) {
        Set<Integer> set = this.f6927d.get(lVar);
        if (set != null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        this.f6927d.put(lVar, hashSet);
        return hashSet;
    }

    private r0 d(int r32) {
        r0 r0Var = this.f6925b.get(Integer.valueOf(r32));
        if (r0Var != null) {
            return r0Var;
        }
        r0 r0Var2 = new r0();
        this.f6925b.put(Integer.valueOf(r32), r0Var2);
        return r0Var2;
    }

    private int e(int r32) {
        q0 j4 = d(r32).j();
        return (this.f6924a.b(r32).size() + j4.b().size()) - j4.d().size();
    }

    private Collection<Integer> f(s0.d dVar) {
        List<Integer> d5 = dVar.d();
        if (!d5.isEmpty()) {
            return d5;
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num : this.f6925b.keySet()) {
            if (j(num.intValue())) {
                arrayList.add(num);
            }
        }
        return arrayList;
    }

    private boolean j(int r12) {
        return k(r12) != null;
    }

    private b4 k(int r32) {
        r0 r0Var = this.f6925b.get(Integer.valueOf(r32));
        if (r0Var == null || !r0Var.e()) {
            return this.f6924a.a(r32);
        }
        return null;
    }

    private void m(int r32, l1.l lVar, l1.s sVar) {
        if (j(r32)) {
            r0 d5 = d(r32);
            if (p(r32, lVar)) {
                d5.a(lVar, n.a.REMOVED);
            } else {
                d5.i(lVar);
            }
            c(lVar).add(Integer.valueOf(r32));
            if (sVar != null) {
                this.f6926c.put(lVar, sVar);
            }
        }
    }

    private void o(int r4) {
        p1.b.d((this.f6925b.get(Integer.valueOf(r4)) == null || this.f6925b.get(Integer.valueOf(r4)).e()) ? false : true, "Should only reset active targets", new Object[0]);
        this.f6925b.put(Integer.valueOf(r4), new r0());
        Iterator<l1.l> it = this.f6924a.b(r4).iterator();
        while (it.hasNext()) {
            m(r4, it.next(), null);
        }
    }

    private boolean p(int r22, l1.l lVar) {
        return this.f6924a.b(r22).contains(lVar);
    }

    public i0 b(l1.w wVar) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<Integer, r0> entry : this.f6925b.entrySet()) {
            int intValue = entry.getKey().intValue();
            r0 value = entry.getValue();
            b4 k4 = k(intValue);
            if (k4 != null) {
                if (value.d() && k4.f().s()) {
                    l1.l n4 = l1.l.n(k4.f().n());
                    if (this.f6926c.get(n4) == null && !p(intValue, n4)) {
                        m(intValue, n4, l1.s.r(n4, wVar));
                    }
                }
                if (value.c()) {
                    hashMap.put(Integer.valueOf(intValue), value.j());
                    value.b();
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<l1.l, Set<Integer>> entry2 : this.f6927d.entrySet()) {
            l1.l key = entry2.getKey();
            boolean z4 = true;
            Iterator<Integer> it = entry2.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                b4 k5 = k(it.next().intValue());
                if (k5 != null && !k5.b().equals(b1.LIMBO_RESOLUTION)) {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                hashSet.add(key);
            }
        }
        Iterator<l1.s> it2 = this.f6926c.values().iterator();
        while (it2.hasNext()) {
            it2.next().v(wVar);
        }
        i0 i0Var = new i0(wVar, Collections.unmodifiableMap(hashMap), Collections.unmodifiableSet(this.f6928e), Collections.unmodifiableMap(this.f6926c), Collections.unmodifiableSet(hashSet));
        this.f6926c = new HashMap();
        this.f6927d = new HashMap();
        this.f6928e = new HashSet();
        return i0Var;
    }

    public void g(s0.b bVar) {
        l1.s b5 = bVar.b();
        l1.l a5 = bVar.a();
        Iterator<Integer> it = bVar.d().iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            if (b5 == null || !b5.b()) {
                m(intValue, a5, b5);
            } else {
                a(intValue, b5);
            }
        }
        Iterator<Integer> it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            m(it2.next().intValue(), a5, bVar.b());
        }
    }

    public void h(s0.c cVar) {
        int b5 = cVar.b();
        int a5 = cVar.a().a();
        b4 k4 = k(b5);
        if (k4 != null) {
            c1 f5 = k4.f();
            if (!f5.s()) {
                if (e(b5) != a5) {
                    o(b5);
                    this.f6928e.add(Integer.valueOf(b5));
                    return;
                }
                return;
            }
            if (a5 != 0) {
                p1.b.d(a5 == 1, "Single document existence filter with count: %d", Integer.valueOf(a5));
            } else {
                l1.l n4 = l1.l.n(f5.n());
                m(b5, n4, l1.s.r(n4, l1.w.f6583f));
            }
        }
    }

    public void i(s0.d dVar) {
        Iterator<Integer> it = f(dVar).iterator();
        while (it.hasNext()) {
            int intValue = it.next().intValue();
            r0 d5 = d(intValue);
            int r32 = a.f6929a[dVar.b().ordinal()];
            if (r32 != 1) {
                if (r32 == 2) {
                    d5.h();
                    if (!d5.e()) {
                        d5.b();
                    }
                } else if (r32 == 3) {
                    d5.h();
                    if (!d5.e()) {
                        n(intValue);
                    }
                    p1.b.d(dVar.a() == null, "WatchChangeAggregator does not handle errored targets", new Object[0]);
                } else if (r32 != 4) {
                    if (r32 != 5) {
                        throw p1.b.a("Unknown target watch change state: %s", dVar.b());
                    }
                    if (j(intValue)) {
                        o(intValue);
                    }
                } else if (j(intValue)) {
                    d5.f();
                }
                d5.k(dVar.c());
            } else if (j(intValue)) {
                d5.k(dVar.c());
            }
        }
    }

    void l(int r12) {
        d(r12).g();
    }

    void n(int r22) {
        this.f6925b.remove(Integer.valueOf(r22));
    }
}
