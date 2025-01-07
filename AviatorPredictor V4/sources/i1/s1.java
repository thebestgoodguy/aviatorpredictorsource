package i1;

import i1.n;
import i1.q0;
import i1.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    private final x0 f4226a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4228c;

    /* renamed from: d, reason: collision with root package name */
    private l1.n f4229d;

    /* renamed from: e, reason: collision with root package name */
    private c1.e<l1.l> f4230e;

    /* renamed from: b, reason: collision with root package name */
    private u1.a f4227b = u1.a.NONE;

    /* renamed from: f, reason: collision with root package name */
    private c1.e<l1.l> f4231f = l1.l.i();

    /* renamed from: g, reason: collision with root package name */
    private c1.e<l1.l> f4232g = l1.l.i();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4233a;

        static {
            int[] r02 = new int[n.a.values().length];
            f4233a = r02;
            try {
                r02[n.a.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4233a[n.a.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4233a[n.a.METADATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4233a[n.a.REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final l1.n f4234a;

        /* renamed from: b, reason: collision with root package name */
        final o f4235b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4236c;

        /* renamed from: d, reason: collision with root package name */
        final c1.e<l1.l> f4237d;

        private b(l1.n nVar, o oVar, c1.e<l1.l> eVar, boolean z4) {
            this.f4234a = nVar;
            this.f4235b = oVar;
            this.f4237d = eVar;
            this.f4236c = z4;
        }

        /* synthetic */ b(l1.n nVar, o oVar, c1.e eVar, boolean z4, a aVar) {
            this(nVar, oVar, eVar, z4);
        }

        public boolean b() {
            return this.f4236c;
        }
    }

    public s1(x0 x0Var, c1.e<l1.l> eVar) {
        this.f4226a = x0Var;
        this.f4229d = l1.n.q(x0Var.c());
        this.f4230e = eVar;
    }

    private void e(o1.q0 q0Var) {
        if (q0Var != null) {
            Iterator<l1.l> it = q0Var.b().iterator();
            while (it.hasNext()) {
                this.f4230e = this.f4230e.q(it.next());
            }
            Iterator<l1.l> it2 = q0Var.c().iterator();
            while (it2.hasNext()) {
                l1.l next = it2.next();
                p1.b.d(this.f4230e.contains(next), "Modified document %s not found in view.", next);
            }
            Iterator<l1.l> it3 = q0Var.d().iterator();
            while (it3.hasNext()) {
                this.f4230e = this.f4230e.s(it3.next());
            }
            this.f4228c = q0Var.f();
        }
    }

    private static int f(n nVar) {
        int r02 = a.f4233a[nVar.c().ordinal()];
        int r12 = 1;
        if (r02 != 1) {
            r12 = 2;
            if (r02 != 2 && r02 != 3) {
                if (r02 == 4) {
                    return 0;
                }
                throw new IllegalArgumentException("Unknown change type: " + nVar.c());
            }
        }
        return r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ int k(n nVar, n nVar2) {
        int k4 = p1.g0.k(f(nVar), f(nVar2));
        nVar.c().compareTo(nVar2.c());
        return k4 != 0 ? k4 : this.f4226a.c().compare(nVar.b(), nVar2.b());
    }

    private boolean l(l1.l lVar) {
        l1.i r4;
        return (this.f4230e.contains(lVar) || (r4 = this.f4229d.r(lVar)) == null || r4.i()) ? false : true;
    }

    private boolean m(l1.i iVar, l1.i iVar2) {
        return iVar.i() && iVar2.g() && !iVar2.i();
    }

    private List<q0> n() {
        if (!this.f4228c) {
            return Collections.emptyList();
        }
        c1.e<l1.l> eVar = this.f4231f;
        this.f4231f = l1.l.i();
        Iterator<l1.i> it = this.f4229d.iterator();
        while (it.hasNext()) {
            l1.i next = it.next();
            if (l(next.getKey())) {
                this.f4231f = this.f4231f.q(next.getKey());
            }
        }
        ArrayList arrayList = new ArrayList(eVar.size() + this.f4231f.size());
        Iterator<l1.l> it2 = eVar.iterator();
        while (it2.hasNext()) {
            l1.l next2 = it2.next();
            if (!this.f4231f.contains(next2)) {
                arrayList.add(new q0(q0.a.REMOVED, next2));
            }
        }
        Iterator<l1.l> it3 = this.f4231f.iterator();
        while (it3.hasNext()) {
            l1.l next3 = it3.next();
            if (!eVar.contains(next3)) {
                arrayList.add(new q0(q0.a.ADDED, next3));
            }
        }
        return arrayList;
    }

    public t1 b(b bVar) {
        return c(bVar, null);
    }

    public t1 c(b bVar, o1.q0 q0Var) {
        p1.b.d(!bVar.f4236c, "Cannot apply changes that need a refill", new Object[0]);
        l1.n nVar = this.f4229d;
        this.f4229d = bVar.f4234a;
        this.f4232g = bVar.f4237d;
        List<n> b5 = bVar.f4235b.b();
        Collections.sort(b5, new Comparator() { // from class: i1.r1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int k4;
                k4 = s1.this.k((n) obj, (n) obj2);
                return k4;
            }
        });
        e(q0Var);
        List<q0> n4 = n();
        u1.a aVar = this.f4231f.size() == 0 && this.f4228c ? u1.a.SYNCED : u1.a.LOCAL;
        boolean z4 = aVar != this.f4227b;
        this.f4227b = aVar;
        u1 u1Var = null;
        if (b5.size() != 0 || z4) {
            u1Var = new u1(this.f4226a, bVar.f4234a, nVar, b5, aVar == u1.a.LOCAL, bVar.f4237d, z4, false);
        }
        return new t1(u1Var, n4);
    }

    public t1 d(v0 v0Var) {
        if (!this.f4228c || v0Var != v0.OFFLINE) {
            return new t1(null, Collections.emptyList());
        }
        this.f4228c = false;
        return b(new b(this.f4229d, new o(), this.f4232g, false, null));
    }

    public b g(c1.c<l1.l, l1.i> cVar) {
        return h(cVar, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (r18.f4226a.c().compare(r6, r4) > 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        if (r18.f4226a.c().compare(r6, r7) < 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012a, code lost:
    
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0158 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i1.s1.b h(c1.c<l1.l, l1.i> r19, i1.s1.b r20) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i1.s1.h(c1.c, i1.s1$b):i1.s1$b");
    }

    public u1.a i() {
        return this.f4227b;
    }

    c1.e<l1.l> j() {
        return this.f4230e;
    }
}
