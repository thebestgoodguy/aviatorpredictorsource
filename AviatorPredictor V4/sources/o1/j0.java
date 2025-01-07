package o1;

import b3.f1;
import com.google.protobuf.t1;
import i1.c1;
import i1.l;
import i1.q;
import i1.w0;
import i1.x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.b1;
import k1.b4;
import m1.a;
import o1.s0;
import x1.d;
import x1.g;
import x1.h;
import x1.k;
import x1.m;
import x1.q;
import x1.s;
import x1.t;
import x1.u;
import x1.v;
import x1.y;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final l1.f f6820a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6821b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6822a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6823b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f6824c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f6825d;

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f6826e;

        /* renamed from: f, reason: collision with root package name */
        static final /* synthetic */ int[] f6827f;

        /* renamed from: g, reason: collision with root package name */
        static final /* synthetic */ int[] f6828g;

        /* renamed from: h, reason: collision with root package name */
        static final /* synthetic */ int[] f6829h;

        /* renamed from: i, reason: collision with root package name */
        static final /* synthetic */ int[] f6830i;

        /* renamed from: j, reason: collision with root package name */
        static final /* synthetic */ int[] f6831j;

        /* renamed from: k, reason: collision with root package name */
        static final /* synthetic */ int[] f6832k;

        /* renamed from: l, reason: collision with root package name */
        static final /* synthetic */ int[] f6833l;

        /* renamed from: m, reason: collision with root package name */
        static final /* synthetic */ int[] f6834m;

        static {
            int[] r02 = new int[q.c.values().length];
            f6834m = r02;
            try {
                r02[q.c.TARGET_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6834m[q.c.DOCUMENT_CHANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6834m[q.c.DOCUMENT_DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6834m[q.c.DOCUMENT_REMOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6834m[q.c.FILTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6834m[q.c.RESPONSETYPE_NOT_SET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] r6 = new int[v.c.values().length];
            f6833l = r6;
            try {
                r6[v.c.NO_CHANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6833l[v.c.ADD.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6833l[v.c.REMOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6833l[v.c.CURRENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6833l[v.c.RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6833l[v.c.UNRECOGNIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            int[] r62 = new int[t.e.values().length];
            f6832k = r62;
            try {
                r62[t.e.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6832k[t.e.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            int[] r63 = new int[t.f.b.values().length];
            f6831j = r63;
            try {
                r63[t.f.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6831j[t.f.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6831j[t.f.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f6831j[t.f.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f6831j[t.f.b.GREATER_THAN_OR_EQUAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f6831j[t.f.b.GREATER_THAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f6831j[t.f.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f6831j[t.f.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f6831j[t.f.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f6831j[t.f.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused24) {
            }
            int[] r10 = new int[q.b.values().length];
            f6830i = r10;
            try {
                r10[q.b.LESS_THAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f6830i[q.b.LESS_THAN_OR_EQUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f6830i[q.b.EQUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f6830i[q.b.NOT_EQUAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f6830i[q.b.GREATER_THAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f6830i[q.b.GREATER_THAN_OR_EQUAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f6830i[q.b.ARRAY_CONTAINS.ordinal()] = 7;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f6830i[q.b.IN.ordinal()] = 8;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f6830i[q.b.ARRAY_CONTAINS_ANY.ordinal()] = 9;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f6830i[q.b.NOT_IN.ordinal()] = 10;
            } catch (NoSuchFieldError unused34) {
            }
            int[] r4 = new int[t.k.b.values().length];
            f6829h = r4;
            try {
                r4[t.k.b.IS_NAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f6829h[t.k.b.IS_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f6829h[t.k.b.IS_NOT_NAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f6829h[t.k.b.IS_NOT_NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused38) {
            }
            int[] r42 = new int[t.h.b.values().length];
            f6828g = r42;
            try {
                r42[t.h.b.COMPOSITE_FILTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f6828g[t.h.b.FIELD_FILTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f6828g[t.h.b.UNARY_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused41) {
            }
            int[] r43 = new int[t.d.b.values().length];
            f6827f = r43;
            try {
                r43[t.d.b.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f6827f[t.d.b.OPERATOR_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused43) {
            }
            int[] r44 = new int[l.a.values().length];
            f6826e = r44;
            try {
                r44[l.a.AND.ordinal()] = 1;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f6826e[l.a.OR.ordinal()] = 2;
            } catch (NoSuchFieldError unused45) {
            }
            int[] r45 = new int[b1.values().length];
            f6825d = r45;
            try {
                r45[b1.LISTEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f6825d[b1.EXISTENCE_FILTER_MISMATCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f6825d[b1.LIMBO_RESOLUTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused48) {
            }
            int[] r46 = new int[m.c.EnumC0105c.values().length];
            f6824c = r46;
            try {
                r46[m.c.EnumC0105c.SET_TO_SERVER_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f6824c[m.c.EnumC0105c.APPEND_MISSING_ELEMENTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f6824c[m.c.EnumC0105c.REMOVE_ALL_FROM_ARRAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f6824c[m.c.EnumC0105c.INCREMENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused52) {
            }
            int[] r32 = new int[s.c.values().length];
            f6823b = r32;
            try {
                r32[s.c.UPDATE_TIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f6823b[s.c.EXISTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f6823b[s.c.CONDITIONTYPE_NOT_SET.ordinal()] = 3;
            } catch (NoSuchFieldError unused55) {
            }
            int[] r33 = new int[y.c.values().length];
            f6822a = r33;
            try {
                r33[y.c.UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f6822a[y.c.DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f6822a[y.c.VERIFY.ordinal()] = 3;
            } catch (NoSuchFieldError unused58) {
            }
        }
    }

    public j0(l1.f fVar) {
        this.f6820a = fVar;
        this.f6821b = Y(fVar).h();
    }

    private x1.k E(m1.d dVar) {
        k.b a02 = x1.k.a0();
        Iterator<l1.r> it = dVar.c().iterator();
        while (it.hasNext()) {
            a02.B(it.next().h());
        }
        return a02.t();
    }

    private t.f.b G(q.b bVar) {
        switch (a.f6830i[bVar.ordinal()]) {
            case 1:
                return t.f.b.LESS_THAN;
            case 2:
                return t.f.b.LESS_THAN_OR_EQUAL;
            case 3:
                return t.f.b.EQUAL;
            case 4:
                return t.f.b.NOT_EQUAL;
            case 5:
                return t.f.b.GREATER_THAN;
            case 6:
                return t.f.b.GREATER_THAN_OR_EQUAL;
            case 7:
                return t.f.b.ARRAY_CONTAINS;
            case 8:
                return t.f.b.IN;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return t.f.b.ARRAY_CONTAINS_ANY;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return t.f.b.NOT_IN;
            default:
                throw p1.b.a("Unknown operator %d", bVar);
        }
    }

    private t.g H(l1.r rVar) {
        return t.g.X().B(rVar.h()).t();
    }

    private m.c I(m1.e eVar) {
        m.c.a E;
        m1.p b5 = eVar.b();
        if (b5 instanceof m1.n) {
            E = m.c.f0().D(eVar.a().h()).G(m.c.b.REQUEST_TIME);
        } else if (b5 instanceof a.b) {
            E = m.c.f0().D(eVar.a().h()).B(x1.a.d0().B(((a.b) b5).f()));
        } else if (b5 instanceof a.C0067a) {
            E = m.c.f0().D(eVar.a().h()).F(x1.a.d0().B(((a.C0067a) b5).f()));
        } else {
            if (!(b5 instanceof m1.j)) {
                throw p1.b.a("Unknown transform: %s", b5);
            }
            E = m.c.f0().D(eVar.a().h()).E(((m1.j) b5).d());
        }
        return E.t();
    }

    private t.h K(List<i1.r> list) {
        return J(new i1.l(list, l.a.AND));
    }

    private String M(b1 b1Var) {
        int r02 = a.f6825d[b1Var.ordinal()];
        if (r02 == 1) {
            return null;
        }
        if (r02 == 2) {
            return "existence-filter-mismatch";
        }
        if (r02 == 3) {
            return "limbo-document";
        }
        throw p1.b.a("Unrecognized query purpose: %s", b1Var);
    }

    private t.i P(w0 w0Var) {
        t.i.a Y = t.i.Y();
        Y.B(w0Var.b().equals(w0.a.ASCENDING) ? t.e.ASCENDING : t.e.DESCENDING);
        Y.D(H(w0Var.c()));
        return Y.t();
    }

    private x1.s Q(m1.m mVar) {
        s.b B;
        p1.b.d(!mVar.d(), "Can't serialize an empty precondition", new Object[0]);
        s.b a02 = x1.s.a0();
        if (mVar.c() != null) {
            B = a02.D(X(mVar.c()));
        } else {
            if (mVar.b() == null) {
                throw p1.b.a("Unknown Precondition", new Object[0]);
            }
            B = a02.B(mVar.b().booleanValue());
        }
        return B.t();
    }

    private String R(l1.u uVar) {
        return T(this.f6820a, uVar);
    }

    private String T(l1.f fVar, l1.u uVar) {
        return Y(fVar).d("documents").g(uVar).h();
    }

    private static l1.u Y(l1.f fVar) {
        return l1.u.w(Arrays.asList("projects", fVar.k(), "databases", fVar.i()));
    }

    private static l1.u Z(l1.u uVar) {
        p1.b.d(uVar.s() > 4 && uVar.p(4).equals("documents"), "Tried to deserialize invalid key %s", uVar);
        return uVar.t(5);
    }

    private f1 a0(a2.a aVar) {
        return f1.h(aVar.U()).q(aVar.W());
    }

    private static boolean c0(l1.u uVar) {
        return uVar.s() >= 4 && uVar.p(0).equals("projects") && uVar.p(2).equals("databases");
    }

    private m1.d d(x1.k kVar) {
        int Z = kVar.Z();
        HashSet hashSet = new HashSet(Z);
        for (int r22 = 0; r22 < Z; r22++) {
            hashSet.add(l1.r.x(kVar.Y(r22)));
        }
        return m1.d.b(hashSet);
    }

    private q.b g(t.f.b bVar) {
        switch (a.f6831j[bVar.ordinal()]) {
            case 1:
                return q.b.LESS_THAN;
            case 2:
                return q.b.LESS_THAN_OR_EQUAL;
            case 3:
                return q.b.EQUAL;
            case 4:
                return q.b.NOT_EQUAL;
            case 5:
                return q.b.GREATER_THAN_OR_EQUAL;
            case 6:
                return q.b.GREATER_THAN;
            case 7:
                return q.b.ARRAY_CONTAINS;
            case 8:
                return q.b.IN;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return q.b.ARRAY_CONTAINS_ANY;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return q.b.NOT_IN;
            default:
                throw p1.b.a("Unhandled FieldFilter.operator %d", bVar);
        }
    }

    private m1.e h(m.c cVar) {
        int r02 = a.f6824c[cVar.e0().ordinal()];
        if (r02 == 1) {
            p1.b.d(cVar.d0() == m.c.b.REQUEST_TIME, "Unknown transform setToServerValue: %s", cVar.d0());
            return new m1.e(l1.r.x(cVar.a0()), m1.n.d());
        }
        if (r02 == 2) {
            return new m1.e(l1.r.x(cVar.a0()), new a.b(cVar.Z().k()));
        }
        if (r02 == 3) {
            return new m1.e(l1.r.x(cVar.a0()), new a.C0067a(cVar.c0().k()));
        }
        if (r02 == 4) {
            return new m1.e(l1.r.x(cVar.a0()), new m1.j(cVar.b0()));
        }
        throw p1.b.a("Unknown FieldTransform proto: %s", cVar);
    }

    private List<i1.r> j(t.h hVar) {
        i1.r i4 = i(hVar);
        if (i4 instanceof i1.l) {
            i1.l lVar = (i1.l) i4;
            if (lVar.l()) {
                return lVar.b();
            }
        }
        return Collections.singletonList(i4);
    }

    private l1.s k(x1.d dVar) {
        p1.b.d(dVar.Y().equals(d.c.FOUND), "Tried to deserialize a found document from a missing document.", new Object[0]);
        l1.l l4 = l(dVar.V().a0());
        l1.t g5 = l1.t.g(dVar.V().Y());
        l1.w y4 = y(dVar.V().b0());
        p1.b.d(!y4.equals(l1.w.f6583f), "Got a document response with no snapshot version", new Object[0]);
        return l1.s.p(l4, y4, g5);
    }

    private l1.s n(x1.d dVar) {
        p1.b.d(dVar.Y().equals(d.c.MISSING), "Tried to deserialize a missing document from a found document.", new Object[0]);
        l1.l l4 = l(dVar.W());
        l1.w y4 = y(dVar.X());
        p1.b.d(!y4.equals(l1.w.f6583f), "Got a no document response with no snapshot version", new Object[0]);
        return l1.s.r(l4, y4);
    }

    private w0 q(t.i iVar) {
        w0.a aVar;
        l1.r x4 = l1.r.x(iVar.X().W());
        int r12 = a.f6832k[iVar.W().ordinal()];
        if (r12 == 1) {
            aVar = w0.a.ASCENDING;
        } else {
            if (r12 != 2) {
                throw p1.b.a("Unrecognized direction %d", iVar.W());
            }
            aVar = w0.a.DESCENDING;
        }
        return w0.d(aVar, x4);
    }

    private m1.m r(x1.s sVar) {
        int r02 = a.f6823b[sVar.W().ordinal()];
        if (r02 == 1) {
            return m1.m.f(y(sVar.Z()));
        }
        if (r02 == 2) {
            return m1.m.a(sVar.Y());
        }
        if (r02 == 3) {
            return m1.m.f6655c;
        }
        throw p1.b.a("Unknown precondition", new Object[0]);
    }

    private l1.u s(String str) {
        l1.u v4 = v(str);
        return v4.s() == 4 ? l1.u.f6582f : Z(v4);
    }

    private l1.u v(String str) {
        l1.u x4 = l1.u.x(str);
        p1.b.d(c0(x4), "Tried to deserialize invalid key %s", x4);
        return x4;
    }

    private i1.r x(t.k kVar) {
        q.b bVar;
        x1.x xVar;
        l1.r x4 = l1.r.x(kVar.X().W());
        int r12 = a.f6829h[kVar.Y().ordinal()];
        if (r12 != 1) {
            if (r12 == 2) {
                bVar = q.b.EQUAL;
            } else if (r12 == 3) {
                bVar = q.b.NOT_EQUAL;
            } else {
                if (r12 != 4) {
                    throw p1.b.a("Unrecognized UnaryFilter.operator %d", kVar.Y());
                }
                bVar = q.b.NOT_EQUAL;
            }
            xVar = l1.y.f6590b;
            return i1.q.f(x4, bVar, xVar);
        }
        bVar = q.b.EQUAL;
        xVar = l1.y.f6589a;
        return i1.q.f(x4, bVar, xVar);
    }

    public s0 A(x1.q qVar) {
        s0.e eVar;
        s0 dVar;
        int r02 = a.f6834m[qVar.Z().ordinal()];
        f1 f1Var = null;
        if (r02 == 1) {
            x1.v a02 = qVar.a0();
            int r03 = a.f6833l[a02.Y().ordinal()];
            if (r03 == 1) {
                eVar = s0.e.NoChange;
            } else if (r03 == 2) {
                eVar = s0.e.Added;
            } else if (r03 == 3) {
                eVar = s0.e.Removed;
                f1Var = a0(a02.U());
            } else if (r03 == 4) {
                eVar = s0.e.Current;
            } else {
                if (r03 != 5) {
                    throw new IllegalArgumentException("Unknown target change type");
                }
                eVar = s0.e.Reset;
            }
            dVar = new s0.d(eVar, a02.a0(), a02.X(), f1Var);
        } else if (r02 == 2) {
            x1.i V = qVar.V();
            List<Integer> X = V.X();
            List<Integer> W = V.W();
            l1.l l4 = l(V.V().a0());
            l1.w y4 = y(V.V().b0());
            p1.b.d(!y4.equals(l1.w.f6583f), "Got a document change without an update time", new Object[0]);
            l1.s p4 = l1.s.p(l4, y4, l1.t.g(V.V().Y()));
            dVar = new s0.b(X, W, p4.getKey(), p4);
        } else {
            if (r02 == 3) {
                x1.j W2 = qVar.W();
                List<Integer> X2 = W2.X();
                l1.s r4 = l1.s.r(l(W2.V()), y(W2.W()));
                return new s0.b(Collections.emptyList(), X2, r4.getKey(), r4);
            }
            if (r02 != 4) {
                if (r02 != 5) {
                    throw new IllegalArgumentException("Unknown change type set");
                }
                x1.n Y = qVar.Y();
                return new s0.c(Y.W(), new n(Y.U()));
            }
            x1.l X3 = qVar.X();
            dVar = new s0.b(Collections.emptyList(), X3.W(), l(X3.V()), null);
        }
        return dVar;
    }

    t.h B(i1.l lVar) {
        Object t4;
        ArrayList arrayList = new ArrayList(lVar.b().size());
        Iterator<i1.r> it = lVar.b().iterator();
        while (it.hasNext()) {
            arrayList.add(J(it.next()));
        }
        if (arrayList.size() == 1) {
            t4 = arrayList.get(0);
        } else {
            t.d.a b02 = t.d.b0();
            b02.D(C(lVar.h()));
            b02.B(arrayList);
            t4 = t.h.c0().B(b02).t();
        }
        return (t.h) t4;
    }

    t.d.b C(l.a aVar) {
        int r22 = a.f6826e[aVar.ordinal()];
        if (r22 == 1) {
            return t.d.b.AND;
        }
        if (r22 == 2) {
            return t.d.b.OPERATOR_UNSPECIFIED;
        }
        throw p1.b.a("Unrecognized composite filter type.", new Object[0]);
    }

    public x1.h D(l1.l lVar, l1.t tVar) {
        h.b e02 = x1.h.e0();
        e02.D(L(lVar));
        e02.B(tVar.k());
        return e02.t();
    }

    public u.c F(c1 c1Var) {
        u.c.a a02 = u.c.a0();
        a02.B(R(c1Var.n()));
        return a02.t();
    }

    t.h J(i1.r rVar) {
        if (rVar instanceof i1.q) {
            return W((i1.q) rVar);
        }
        if (rVar instanceof i1.l) {
            return B((i1.l) rVar);
        }
        throw p1.b.a("Unrecognized filter type %s", rVar.toString());
    }

    public String L(l1.l lVar) {
        return T(this.f6820a, lVar.t());
    }

    public Map<String, String> N(b4 b4Var) {
        String M = M(b4Var.b());
        if (M == null) {
            return null;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("goog-listen-tags", M);
        return hashMap;
    }

    public x1.y O(m1.f fVar) {
        y.b o02 = x1.y.o0();
        if (fVar instanceof m1.o) {
            o02.F(D(fVar.g(), ((m1.o) fVar).o()));
        } else if (fVar instanceof m1.l) {
            o02.F(D(fVar.g(), ((m1.l) fVar).q()));
            o02.G(E(fVar.e()));
        } else if (fVar instanceof m1.c) {
            o02.E(L(fVar.g()));
        } else {
            if (!(fVar instanceof m1.q)) {
                throw p1.b.a("unknown mutation type %s", fVar.getClass());
            }
            o02.H(L(fVar.g()));
        }
        Iterator<m1.e> it = fVar.f().iterator();
        while (it.hasNext()) {
            o02.B(I(it.next()));
        }
        if (!fVar.h().d()) {
            o02.D(Q(fVar.h()));
        }
        return o02.t();
    }

    public u.d S(c1 c1Var) {
        u.d.a Z = u.d.Z();
        t.b r02 = x1.t.r0();
        l1.u n4 = c1Var.n();
        if (c1Var.d() != null) {
            p1.b.d(n4.s() % 2 == 0, "Collection Group queries should be within a document path or root.", new Object[0]);
            Z.B(R(n4));
            t.c.a Y = t.c.Y();
            Y.D(c1Var.d());
            Y.B(true);
            r02.B(Y);
        } else {
            p1.b.d(n4.s() % 2 != 0, "Document queries with filters are not supported.", new Object[0]);
            Z.B(R(n4.u()));
            t.c.a Y2 = t.c.Y();
            Y2.D(n4.n());
            r02.B(Y2);
        }
        if (c1Var.h().size() > 0) {
            r02.H(K(c1Var.h()));
        }
        Iterator<w0> it = c1Var.m().iterator();
        while (it.hasNext()) {
            r02.D(P(it.next()));
        }
        if (c1Var.r()) {
            r02.F(com.google.protobuf.b0.X().B((int) c1Var.j()));
        }
        if (c1Var.p() != null) {
            g.b a02 = x1.g.a0();
            a02.B(c1Var.p().b());
            a02.D(c1Var.p().c());
            r02.G(a02);
        }
        if (c1Var.f() != null) {
            g.b a03 = x1.g.a0();
            a03.B(c1Var.f().b());
            a03.D(!c1Var.f().c());
            r02.E(a03);
        }
        Z.D(r02);
        return Z.t();
    }

    public x1.u U(b4 b4Var) {
        u.b Z = x1.u.Z();
        c1 f5 = b4Var.f();
        if (f5.s()) {
            Z.B(F(f5));
        } else {
            Z.D(S(f5));
        }
        Z.G(b4Var.g());
        if (!b4Var.c().isEmpty() || b4Var.e().compareTo(l1.w.f6583f) <= 0) {
            Z.F(b4Var.c());
        } else {
            Z.E(V(b4Var.e().g()));
        }
        return Z.t();
    }

    public t1 V(x0.o oVar) {
        t1.b Z = t1.Z();
        Z.D(oVar.i());
        Z.B(oVar.g());
        return Z.t();
    }

    t.h W(i1.q qVar) {
        t.k.b bVar;
        t.h.a E;
        q.b h5 = qVar.h();
        q.b bVar2 = q.b.EQUAL;
        if (h5 == bVar2 || qVar.h() == q.b.NOT_EQUAL) {
            t.k.a Z = t.k.Z();
            Z.B(H(qVar.g()));
            if (l1.y.y(qVar.i())) {
                bVar = qVar.h() == bVar2 ? t.k.b.IS_NAN : t.k.b.IS_NOT_NAN;
            } else if (l1.y.z(qVar.i())) {
                bVar = qVar.h() == bVar2 ? t.k.b.IS_NULL : t.k.b.IS_NOT_NULL;
            }
            Z.D(bVar);
            E = t.h.c0().E(Z);
            return E.t();
        }
        t.f.a b02 = t.f.b0();
        b02.B(H(qVar.g()));
        b02.D(G(qVar.h()));
        b02.E(qVar.i());
        E = t.h.c0().D(b02);
        return E.t();
    }

    public t1 X(l1.w wVar) {
        return V(wVar.g());
    }

    public String a() {
        return this.f6821b;
    }

    i1.l b(t.d dVar) {
        ArrayList arrayList = new ArrayList();
        Iterator<t.h> it = dVar.Z().iterator();
        while (it.hasNext()) {
            arrayList.add(i(it.next()));
        }
        return new i1.l(arrayList, c(dVar.a0()));
    }

    public boolean b0(l1.u uVar) {
        return c0(uVar) && uVar.p(1).equals(this.f6820a.k()) && uVar.p(3).equals(this.f6820a.i());
    }

    l.a c(t.d.b bVar) {
        int r22 = a.f6827f[bVar.ordinal()];
        if (r22 == 1) {
            return l.a.AND;
        }
        if (r22 == 2) {
            return l.a.OR;
        }
        throw p1.b.a("Only AND and OR composite filter types are supported.", new Object[0]);
    }

    public c1 e(u.c cVar) {
        int Z = cVar.Z();
        p1.b.d(Z == 1, "DocumentsTarget contained other than 1 document %d", Integer.valueOf(Z));
        return x0.b(s(cVar.Y(0))).D();
    }

    i1.q f(t.f fVar) {
        return i1.q.f(l1.r.x(fVar.Y().W()), g(fVar.Z()), fVar.a0());
    }

    i1.r i(t.h hVar) {
        int r02 = a.f6828g[hVar.a0().ordinal()];
        if (r02 == 1) {
            return b(hVar.X());
        }
        if (r02 == 2) {
            return f(hVar.Z());
        }
        if (r02 == 3) {
            return x(hVar.b0());
        }
        throw p1.b.a("Unrecognized Filter.filterType %d", hVar.a0());
    }

    public l1.l l(String str) {
        l1.u v4 = v(str);
        p1.b.d(v4.p(1).equals(this.f6820a.k()), "Tried to deserialize key from different project.", new Object[0]);
        p1.b.d(v4.p(3).equals(this.f6820a.i()), "Tried to deserialize key from different database.", new Object[0]);
        return l1.l.n(Z(v4));
    }

    public l1.s m(x1.d dVar) {
        if (dVar.Y().equals(d.c.FOUND)) {
            return k(dVar);
        }
        if (dVar.Y().equals(d.c.MISSING)) {
            return n(dVar);
        }
        throw new IllegalArgumentException("Unknown result case: " + dVar.Y());
    }

    public m1.f o(x1.y yVar) {
        m1.m r4 = yVar.k0() ? r(yVar.c0()) : m1.m.f6655c;
        ArrayList arrayList = new ArrayList();
        Iterator<m.c> it = yVar.i0().iterator();
        while (it.hasNext()) {
            arrayList.add(h(it.next()));
        }
        int r02 = a.f6822a[yVar.e0().ordinal()];
        if (r02 == 1) {
            return yVar.n0() ? new m1.l(l(yVar.g0().a0()), l1.t.g(yVar.g0().Y()), d(yVar.h0()), r4, arrayList) : new m1.o(l(yVar.g0().a0()), l1.t.g(yVar.g0().Y()), r4, arrayList);
        }
        if (r02 == 2) {
            return new m1.c(l(yVar.d0()), r4);
        }
        if (r02 == 3) {
            return new m1.q(l(yVar.j0()), r4);
        }
        throw p1.b.a("Unknown mutation operation: %d", yVar.e0());
    }

    public m1.i p(x1.b0 b0Var, l1.w wVar) {
        l1.w y4 = y(b0Var.W());
        if (!l1.w.f6583f.equals(y4)) {
            wVar = y4;
        }
        int V = b0Var.V();
        ArrayList arrayList = new ArrayList(V);
        for (int r22 = 0; r22 < V; r22++) {
            arrayList.add(b0Var.U(r22));
        }
        return new m1.i(wVar, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i1.c1 t(java.lang.String r14, x1.t r15) {
        /*
            r13 = this;
            l1.u r14 = r13.s(r14)
            int r0 = r15.h0()
            r1 = 0
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L30
            if (r0 != r3) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "StructuredQuery.from with more than one collection is not supported."
            p1.b.d(r0, r5, r4)
            x1.t$c r0 = r15.g0(r2)
            boolean r4 = r0.W()
            java.lang.String r0 = r0.X()
            if (r4 == 0) goto L2a
            r5 = r14
            r6 = r0
            goto L32
        L2a:
            l1.e r14 = r14.d(r0)
            l1.u r14 = (l1.u) r14
        L30:
            r5 = r14
            r6 = r1
        L32:
            boolean r14 = r15.q0()
            if (r14 == 0) goto L41
            x1.t$h r14 = r15.m0()
            java.util.List r14 = r13.j(r14)
            goto L45
        L41:
            java.util.List r14 = java.util.Collections.emptyList()
        L45:
            r7 = r14
            int r14 = r15.k0()
            if (r14 <= 0) goto L63
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r14)
        L51:
            if (r2 >= r14) goto L61
            x1.t$i r4 = r15.j0(r2)
            i1.w0 r4 = r13.q(r4)
            r0.add(r4)
            int r2 = r2 + 1
            goto L51
        L61:
            r8 = r0
            goto L68
        L63:
            java.util.List r14 = java.util.Collections.emptyList()
            r8 = r14
        L68:
            r9 = -1
            boolean r14 = r15.o0()
            if (r14 == 0) goto L79
            com.google.protobuf.b0 r14 = r15.i0()
            int r14 = r14.W()
            long r9 = (long) r14
        L79:
            boolean r14 = r15.p0()
            if (r14 == 0) goto L96
            i1.i r14 = new i1.i
            x1.g r0 = r15.l0()
            java.util.List r0 = r0.k()
            x1.g r2 = r15.l0()
            boolean r2 = r2.Y()
            r14.<init>(r0, r2)
            r11 = r14
            goto L97
        L96:
            r11 = r1
        L97:
            boolean r14 = r15.n0()
            if (r14 == 0) goto Lb3
            i1.i r1 = new i1.i
            x1.g r14 = r15.f0()
            java.util.List r14 = r14.k()
            x1.g r15 = r15.f0()
            boolean r15 = r15.Y()
            r15 = r15 ^ r3
            r1.<init>(r14, r15)
        Lb3:
            r12 = r1
            i1.c1 r14 = new i1.c1
            r4 = r14
            r4.<init>(r5, r6, r7, r8, r9, r11, r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.j0.t(java.lang.String, x1.t):i1.c1");
    }

    public c1 u(u.d dVar) {
        return t(dVar.X(), dVar.Y());
    }

    public x0.o w(t1 t1Var) {
        return new x0.o(t1Var.Y(), t1Var.X());
    }

    public l1.w y(t1 t1Var) {
        return (t1Var.Y() == 0 && t1Var.X() == 0) ? l1.w.f6583f : new l1.w(w(t1Var));
    }

    public l1.w z(x1.q qVar) {
        if (qVar.Z() == q.c.TARGET_CHANGE && qVar.a0().Z() == 0) {
            return y(qVar.a0().W());
        }
        return l1.w.f6583f;
    }
}
