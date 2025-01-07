package k1;

import i1.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l1.q;
import n1.a;
import n1.b;
import n1.c;
import n1.d;
import n1.e;
import v1.a;
import w1.a;
import x1.h;
import x1.m;
import x1.u;
import x1.y;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final o1.j0 f6201a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6202a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6203b;

        static {
            int[] r02 = new int[c.EnumC0070c.values().length];
            f6203b = r02;
            try {
                r02[c.EnumC0070c.DOCUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6203b[c.EnumC0070c.QUERY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] r22 = new int[a.c.values().length];
            f6202a = r22;
            try {
                r22[a.c.DOCUMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6202a[a.c.NO_DOCUMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6202a[a.c.UNKNOWN_DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public o(o1.j0 j0Var) {
        this.f6201a = j0Var;
    }

    private l1.s b(x1.h hVar, boolean z4) {
        l1.s p4 = l1.s.p(this.f6201a.l(hVar.a0()), this.f6201a.y(hVar.b0()), l1.t.g(hVar.Y()));
        return z4 ? p4.t() : p4;
    }

    private l1.s g(n1.b bVar, boolean z4) {
        l1.s r4 = l1.s.r(this.f6201a.l(bVar.X()), this.f6201a.y(bVar.Y()));
        return z4 ? r4.t() : r4;
    }

    private l1.s i(n1.d dVar) {
        return l1.s.s(this.f6201a.l(dVar.X()), this.f6201a.y(dVar.Y()));
    }

    private x1.h k(l1.i iVar) {
        h.b e02 = x1.h.e0();
        e02.D(this.f6201a.L(iVar.getKey()));
        e02.B(iVar.k().k());
        e02.E(this.f6201a.V(iVar.j().g()));
        return e02.t();
    }

    private n1.b o(l1.i iVar) {
        b.C0069b Z = n1.b.Z();
        Z.B(this.f6201a.L(iVar.getKey()));
        Z.D(this.f6201a.V(iVar.j().g()));
        return Z.t();
    }

    private n1.d q(l1.i iVar) {
        d.b Z = n1.d.Z();
        Z.B(this.f6201a.L(iVar.getKey()));
        Z.D(this.f6201a.V(iVar.j().g()));
        return Z.t();
    }

    public h1.i a(w1.a aVar) {
        return new h1.i(this.f6201a.t(aVar.Y(), aVar.Z()), aVar.X().equals(a.c.FIRST) ? x0.a.LIMIT_TO_FIRST : x0.a.LIMIT_TO_LAST);
    }

    public List<q.c> c(v1.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (a.c cVar : aVar.U()) {
            arrayList.add(q.c.g(l1.r.x(cVar.U()), cVar.W().equals(a.c.EnumC0098c.ARRAY_CONFIG) ? q.c.a.CONTAINS : cVar.V().equals(a.c.b.ASCENDING) ? q.c.a.ASCENDING : q.c.a.DESCENDING));
        }
        return arrayList;
    }

    l1.s d(n1.a aVar) {
        int r02 = a.f6202a[aVar.Z().ordinal()];
        if (r02 == 1) {
            return b(aVar.Y(), aVar.a0());
        }
        if (r02 == 2) {
            return g(aVar.b0(), aVar.a0());
        }
        if (r02 == 3) {
            return i(aVar.c0());
        }
        throw p1.b.a("Unknown MaybeDocument %s", aVar);
    }

    public m1.f e(x1.y yVar) {
        return this.f6201a.o(yVar);
    }

    m1.g f(n1.e eVar) {
        int e02 = eVar.e0();
        x0.o w4 = this.f6201a.w(eVar.f0());
        int d02 = eVar.d0();
        ArrayList arrayList = new ArrayList(d02);
        for (int r5 = 0; r5 < d02; r5++) {
            arrayList.add(this.f6201a.o(eVar.c0(r5)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.h0());
        int r52 = 0;
        while (r52 < eVar.h0()) {
            x1.y g02 = eVar.g0(r52);
            int r7 = r52 + 1;
            if (r7 < eVar.h0() && eVar.g0(r7).l0()) {
                p1.b.d(eVar.g0(r52).m0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                y.b p02 = x1.y.p0(g02);
                Iterator<m.c> it = eVar.g0(r7).f0().V().iterator();
                while (it.hasNext()) {
                    p02.B(it.next());
                }
                arrayList2.add(this.f6201a.o(p02.t()));
                r52 = r7;
            } else {
                arrayList2.add(this.f6201a.o(g02));
            }
            r52++;
        }
        return new m1.g(e02, w4, arrayList, arrayList2);
    }

    b4 h(n1.c cVar) {
        i1.c1 e5;
        int j02 = cVar.j0();
        l1.w y4 = this.f6201a.y(cVar.i0());
        l1.w y5 = this.f6201a.y(cVar.e0());
        com.google.protobuf.j h02 = cVar.h0();
        long f02 = cVar.f0();
        int r02 = a.f6203b[cVar.k0().ordinal()];
        if (r02 == 1) {
            e5 = this.f6201a.e(cVar.d0());
        } else {
            if (r02 != 2) {
                throw p1.b.a("Unknown targetType %d", cVar.k0());
            }
            e5 = this.f6201a.u(cVar.g0());
        }
        return new b4(e5, j02, f02, b1.LISTEN, y4, y5, h02);
    }

    public w1.a j(h1.i iVar) {
        u.d S = this.f6201a.S(iVar.b());
        a.b a02 = w1.a.a0();
        a02.B(iVar.a().equals(x0.a.LIMIT_TO_FIRST) ? a.c.FIRST : a.c.LAST);
        a02.D(S.X());
        a02.E(S.Y());
        return a02.t();
    }

    n1.a l(l1.i iVar) {
        a.b d02 = n1.a.d0();
        if (iVar.e()) {
            d02.E(o(iVar));
        } else if (iVar.b()) {
            d02.B(k(iVar));
        } else {
            if (!iVar.h()) {
                throw p1.b.a("Cannot encode invalid document %s", iVar);
            }
            d02.F(q(iVar));
        }
        d02.D(iVar.g());
        return d02.t();
    }

    public x1.y m(m1.f fVar) {
        return this.f6201a.O(fVar);
    }

    n1.e n(m1.g gVar) {
        e.b i02 = n1.e.i0();
        i02.E(gVar.e());
        i02.F(this.f6201a.V(gVar.g()));
        Iterator<m1.f> it = gVar.d().iterator();
        while (it.hasNext()) {
            i02.B(this.f6201a.O(it.next()));
        }
        Iterator<m1.f> it2 = gVar.h().iterator();
        while (it2.hasNext()) {
            i02.D(this.f6201a.O(it2.next()));
        }
        return i02.t();
    }

    n1.c p(b4 b4Var) {
        b1 b1Var = b1.LISTEN;
        p1.b.d(b1Var.equals(b4Var.b()), "Only queries with purpose %s may be stored, got %s", b1Var, b4Var.b());
        c.b l02 = n1.c.l0();
        l02.J(b4Var.g()).F(b4Var.d()).E(this.f6201a.X(b4Var.a())).I(this.f6201a.X(b4Var.e())).H(b4Var.c());
        i1.c1 f5 = b4Var.f();
        if (f5.s()) {
            l02.D(this.f6201a.F(f5));
        } else {
            l02.G(this.f6201a.S(f5));
        }
        return l02.t();
    }
}
