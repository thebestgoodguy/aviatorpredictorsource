package l1;

import com.google.protobuf.e1;
import com.google.protobuf.t1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p1.g0;
import x1.x;

/* loaded from: classes.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public static final x1.x f6589a = x1.x.r0().H(Double.NaN).t();

    /* renamed from: b, reason: collision with root package name */
    public static final x1.x f6590b;

    /* renamed from: c, reason: collision with root package name */
    public static final x1.x f6591c;

    /* renamed from: d, reason: collision with root package name */
    private static final x1.x f6592d;

    /* renamed from: e, reason: collision with root package name */
    public static final x1.x f6593e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6594a;

        static {
            int[] r02 = new int[x.c.values().length];
            f6594a = r02;
            try {
                r02[x.c.NULL_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6594a[x.c.BOOLEAN_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6594a[x.c.INTEGER_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6594a[x.c.DOUBLE_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6594a[x.c.TIMESTAMP_VALUE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6594a[x.c.STRING_VALUE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6594a[x.c.BYTES_VALUE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6594a[x.c.REFERENCE_VALUE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6594a[x.c.GEO_POINT_VALUE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6594a[x.c.ARRAY_VALUE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6594a[x.c.MAP_VALUE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        x1.x t4 = x1.x.r0().O(e1.NULL_VALUE).t();
        f6590b = t4;
        f6591c = t4;
        x1.x t5 = x1.x.r0().Q("__max__").t();
        f6592d = t5;
        f6593e = x1.x.r0().L(x1.r.d0().E("__type__", t5)).t();
    }

    public static boolean A(x1.x xVar) {
        return v(xVar) || u(xVar);
    }

    public static boolean B(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.REFERENCE_VALUE;
    }

    public static int C(x1.x xVar, boolean z4, x1.x xVar2, boolean z5) {
        int i4 = i(xVar, xVar2);
        if (i4 != 0) {
            return i4;
        }
        if (!z4 || z5) {
            return (z4 || !z5) ? 0 : 1;
        }
        return -1;
    }

    private static boolean D(x1.x xVar, x1.x xVar2) {
        x.c q02 = xVar.q0();
        x.c cVar = x.c.INTEGER_VALUE;
        if (q02 == cVar && xVar2.q0() == cVar) {
            return xVar.l0() == xVar2.l0();
        }
        x.c q03 = xVar.q0();
        x.c cVar2 = x.c.DOUBLE_VALUE;
        return q03 == cVar2 && xVar2.q0() == cVar2 && Double.doubleToLongBits(xVar.j0()) == Double.doubleToLongBits(xVar2.j0());
    }

    private static boolean E(x1.x xVar, x1.x xVar2) {
        x1.r m02 = xVar.m0();
        x1.r m03 = xVar2.m0();
        if (m02.W() != m03.W()) {
            return false;
        }
        for (Map.Entry<String, x1.x> entry : m02.X().entrySet()) {
            if (!q(entry.getValue(), m03.X().get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static x1.x F(f fVar, l lVar) {
        return x1.x.r0().P(String.format("projects/%s/databases/%s/documents/%s", fVar.k(), fVar.i(), lVar.toString())).t();
    }

    public static int G(x1.x xVar) {
        switch (a.f6594a[xVar.q0().ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return 8;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return 9;
            case 11:
                if (v.c(xVar)) {
                    return 4;
                }
                return x(xVar) ? Integer.MAX_VALUE : 10;
            default:
                throw p1.b.a("Invalid value type: " + xVar.q0(), new Object[0]);
        }
    }

    public static int H(x1.x xVar, boolean z4, x1.x xVar2, boolean z5) {
        int i4 = i(xVar, xVar2);
        if (i4 != 0) {
            return i4;
        }
        if (!z4 || z5) {
            return (z4 || !z5) ? 0 : -1;
        }
        return 1;
    }

    private static boolean a(x1.x xVar, x1.x xVar2) {
        x1.a f02 = xVar.f0();
        x1.a f03 = xVar2.f0();
        if (f02.c0() != f03.c0()) {
            return false;
        }
        for (int r02 = 0; r02 < f02.c0(); r02++) {
            if (!q(f02.b0(r02), f03.b0(r02))) {
                return false;
            }
        }
        return true;
    }

    public static String b(x1.x xVar) {
        StringBuilder sb = new StringBuilder();
        h(sb, xVar);
        return sb.toString();
    }

    private static void c(StringBuilder sb, x1.a aVar) {
        sb.append("[");
        for (int r02 = 0; r02 < aVar.c0(); r02++) {
            h(sb, aVar.b0(r02));
            if (r02 != aVar.c0() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
    }

    private static void d(StringBuilder sb, b2.a aVar) {
        sb.append(String.format("geo(%s,%s)", Double.valueOf(aVar.X()), Double.valueOf(aVar.Y())));
    }

    private static void e(StringBuilder sb, x1.r rVar) {
        ArrayList<String> arrayList = new ArrayList(rVar.X().keySet());
        Collections.sort(arrayList);
        sb.append("{");
        boolean z4 = true;
        for (String str : arrayList) {
            if (z4) {
                z4 = false;
            } else {
                sb.append(",");
            }
            sb.append(str);
            sb.append(":");
            h(sb, rVar.Z(str));
        }
        sb.append("}");
    }

    private static void f(StringBuilder sb, x1.x xVar) {
        p1.b.d(B(xVar), "Value should be a ReferenceValue", new Object[0]);
        sb.append(l.k(xVar.n0()));
    }

    private static void g(StringBuilder sb, t1 t1Var) {
        sb.append(String.format("time(%s,%s)", Long.valueOf(t1Var.Y()), Integer.valueOf(t1Var.X())));
    }

    private static void h(StringBuilder sb, x1.x xVar) {
        String str;
        switch (a.f6594a[xVar.q0().ordinal()]) {
            case 1:
                str = "null";
                break;
            case 2:
                sb.append(xVar.g0());
                return;
            case 3:
                sb.append(xVar.l0());
                return;
            case 4:
                sb.append(xVar.j0());
                return;
            case 5:
                g(sb, xVar.p0());
                return;
            case 6:
                str = xVar.o0();
                break;
            case 7:
                str = g0.y(xVar.h0());
                break;
            case 8:
                f(sb, xVar);
                return;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                d(sb, xVar.k0());
                return;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                c(sb, xVar.f0());
                return;
            case 11:
                e(sb, xVar.m0());
                return;
            default:
                throw p1.b.a("Invalid value type: " + xVar.q0(), new Object[0]);
        }
        sb.append(str);
    }

    public static int i(x1.x xVar, x1.x xVar2) {
        int G = G(xVar);
        int G2 = G(xVar2);
        if (G != G2) {
            return g0.k(G, G2);
        }
        if (G != Integer.MAX_VALUE) {
            switch (G) {
                case 0:
                    break;
                case 1:
                    return g0.g(xVar.g0(), xVar2.g0());
                case 2:
                    return m(xVar, xVar2);
                case 3:
                    return o(xVar.p0(), xVar2.p0());
                case 4:
                    return o(v.a(xVar), v.a(xVar2));
                case 5:
                    return xVar.o0().compareTo(xVar2.o0());
                case 6:
                    return g0.i(xVar.h0(), xVar2.h0());
                case 7:
                    return n(xVar.n0(), xVar2.n0());
                case 8:
                    return k(xVar.k0(), xVar2.k0());
                case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    return j(xVar.f0(), xVar2.f0());
                case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    return l(xVar.m0(), xVar2.m0());
                default:
                    throw p1.b.a("Invalid value type: " + G, new Object[0]);
            }
        }
        return 0;
    }

    private static int j(x1.a aVar, x1.a aVar2) {
        int min = Math.min(aVar.c0(), aVar2.c0());
        for (int r12 = 0; r12 < min; r12++) {
            int i4 = i(aVar.b0(r12), aVar2.b0(r12));
            if (i4 != 0) {
                return i4;
            }
        }
        return g0.k(aVar.c0(), aVar2.c0());
    }

    private static int k(b2.a aVar, b2.a aVar2) {
        int j4 = g0.j(aVar.X(), aVar2.X());
        return j4 == 0 ? g0.j(aVar.Y(), aVar2.Y()) : j4;
    }

    private static int l(x1.r rVar, x1.r rVar2) {
        Iterator it = new TreeMap(rVar.X()).entrySet().iterator();
        Iterator it2 = new TreeMap(rVar2.X()).entrySet().iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Map.Entry entry2 = (Map.Entry) it2.next();
            int compareTo = ((String) entry.getKey()).compareTo((String) entry2.getKey());
            if (compareTo != 0) {
                return compareTo;
            }
            int i4 = i((x1.x) entry.getValue(), (x1.x) entry2.getValue());
            if (i4 != 0) {
                return i4;
            }
        }
        return g0.g(it.hasNext(), it2.hasNext());
    }

    private static int m(x1.x xVar, x1.x xVar2) {
        x.c q02 = xVar.q0();
        x.c cVar = x.c.DOUBLE_VALUE;
        if (q02 == cVar) {
            double j02 = xVar.j0();
            if (xVar2.q0() == cVar) {
                return g0.j(j02, xVar2.j0());
            }
            if (xVar2.q0() == x.c.INTEGER_VALUE) {
                return g0.m(j02, xVar2.l0());
            }
        } else {
            x.c q03 = xVar.q0();
            x.c cVar2 = x.c.INTEGER_VALUE;
            if (q03 == cVar2) {
                long l02 = xVar.l0();
                if (xVar2.q0() == cVar2) {
                    return g0.l(l02, xVar2.l0());
                }
                if (xVar2.q0() == cVar) {
                    return g0.m(xVar2.j0(), l02) * (-1);
                }
            }
        }
        throw p1.b.a("Unexpected values: %s vs %s", xVar, xVar2);
    }

    private static int n(String str, String str2) {
        String[] split = str.split("/", -1);
        String[] split2 = str2.split("/", -1);
        int min = Math.min(split.length, split2.length);
        for (int r12 = 0; r12 < min; r12++) {
            int compareTo = split[r12].compareTo(split2[r12]);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return g0.k(split.length, split2.length);
    }

    private static int o(t1 t1Var, t1 t1Var2) {
        int l4 = g0.l(t1Var.Y(), t1Var2.Y());
        return l4 != 0 ? l4 : g0.k(t1Var.X(), t1Var2.X());
    }

    public static boolean p(x1.b bVar, x1.x xVar) {
        Iterator<x1.x> it = bVar.k().iterator();
        while (it.hasNext()) {
            if (q(it.next(), xVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean q(x1.x xVar, x1.x xVar2) {
        int G;
        if (xVar == xVar2) {
            return true;
        }
        if (xVar == null || xVar2 == null || (G = G(xVar)) != G(xVar2)) {
            return false;
        }
        if (G == 2) {
            return D(xVar, xVar2);
        }
        if (G == 4) {
            return v.a(xVar).equals(v.a(xVar2));
        }
        if (G != Integer.MAX_VALUE) {
            return G != 9 ? G != 10 ? xVar.equals(xVar2) : E(xVar, xVar2) : a(xVar, xVar2);
        }
        return true;
    }

    public static x1.x r(x.c cVar) {
        switch (a.f6594a[cVar.ordinal()]) {
            case 1:
                return f6590b;
            case 2:
                return x1.x.r0().F(false).t();
            case 3:
            case 4:
                return x1.x.r0().H(Double.NaN).t();
            case 5:
                return x1.x.r0().R(t1.Z().D(Long.MIN_VALUE)).t();
            case 6:
                return x1.x.r0().Q("").t();
            case 7:
                return x1.x.r0().G(com.google.protobuf.j.f2914f).t();
            case 8:
                return F(f.f6540g, l.h());
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return x1.x.r0().I(b2.a.Z().B(-90.0d).D(-180.0d)).t();
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return x1.x.r0().E(x1.a.a0()).t();
            case 11:
                return x1.x.r0().N(x1.r.V()).t();
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
    }

    public static x1.x s(x.c cVar) {
        x.c cVar2;
        switch (a.f6594a[cVar.ordinal()]) {
            case 1:
                cVar2 = x.c.BOOLEAN_VALUE;
                break;
            case 2:
                cVar2 = x.c.INTEGER_VALUE;
                break;
            case 3:
            case 4:
                cVar2 = x.c.TIMESTAMP_VALUE;
                break;
            case 5:
                cVar2 = x.c.STRING_VALUE;
                break;
            case 6:
                cVar2 = x.c.BYTES_VALUE;
                break;
            case 7:
                cVar2 = x.c.REFERENCE_VALUE;
                break;
            case 8:
                cVar2 = x.c.GEO_POINT_VALUE;
                break;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                cVar2 = x.c.ARRAY_VALUE;
                break;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                cVar2 = x.c.MAP_VALUE;
                break;
            case 11:
                return f6593e;
            default:
                throw new IllegalArgumentException("Unknown value type: " + cVar);
        }
        return r(cVar2);
    }

    public static boolean t(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.ARRAY_VALUE;
    }

    public static boolean u(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.DOUBLE_VALUE;
    }

    public static boolean v(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.INTEGER_VALUE;
    }

    public static boolean w(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.MAP_VALUE;
    }

    public static boolean x(x1.x xVar) {
        return f6592d.equals(xVar.m0().X().get("__type__"));
    }

    public static boolean y(x1.x xVar) {
        return xVar != null && Double.isNaN(xVar.j0());
    }

    public static boolean z(x1.x xVar) {
        return xVar != null && xVar.q0() == x.c.NULL_VALUE;
    }
}
