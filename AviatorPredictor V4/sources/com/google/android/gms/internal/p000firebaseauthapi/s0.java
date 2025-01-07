package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f2110a;

    /* renamed from: b, reason: collision with root package name */
    private static final i1 f2111b;

    /* renamed from: c, reason: collision with root package name */
    private static final i1 f2112c;

    /* renamed from: d, reason: collision with root package name */
    private static final i1 f2113d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f2110a = cls;
        f2111b = C(false);
        f2112c = C(true);
        f2113d = new k1();
    }

    static int A(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (tr.f(r02 << 3) + 1);
    }

    public static void B(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.k(r12, list, z4);
    }

    private static i1 C(boolean z4) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (i1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused2) {
            return null;
        }
    }

    static int D(List list) {
        return list.size();
    }

    static int E(int r22, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e5 = size * tr.e(r22);
        for (int r12 = 0; r12 < list.size(); r12++) {
            e5 += tr.E((hr) list.get(r12));
        }
        return e5;
    }

    static int F(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * tr.e(r02));
    }

    static int G(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ls) {
            ls lsVar = (ls) list;
            r22 = 0;
            while (r12 < size) {
                r22 += tr.G(lsVar.p(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += tr.G(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int H(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (tr.f(r02 << 3) + 4);
    }

    static int I(List list) {
        return list.size() * 4;
    }

    static int J(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (tr.f(r02 << 3) + 8);
    }

    static int K(List list) {
        return list.size() * 8;
    }

    static int L(int r4, List list, q0 q0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += tr.F(r4, (e0) list.get(r12), q0Var);
        }
        return r22;
    }

    static int M(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * tr.e(r02));
    }

    static int N(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ls) {
            ls lsVar = (ls) list;
            r22 = 0;
            while (r12 < size) {
                r22 += tr.G(lsVar.p(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += tr.G(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int O(int r02, List list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * tr.e(r02));
    }

    static int P(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            r22 = 0;
            while (r12 < size) {
                r22 += tr.g(sVar.p(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += tr.g(((Long) list.get(r12)).longValue());
                r12++;
            }
        }
        return r22;
    }

    static int Q(int r12, Object obj, q0 q0Var) {
        if (!(obj instanceof j)) {
            return tr.f(r12 << 3) + tr.b((e0) obj, q0Var);
        }
        int f5 = tr.f(r12 << 3);
        int a5 = ((j) obj).a();
        return f5 + tr.f(a5) + a5;
    }

    static int R(int r4, List list, q0 q0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e5 = tr.e(r4) * size;
        for (int r12 = 0; r12 < size; r12++) {
            Object obj = list.get(r12);
            e5 += obj instanceof j ? tr.H((j) obj) : tr.b((e0) obj, q0Var);
        }
        return e5;
    }

    static int S(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * tr.e(r02));
    }

    static int T(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ls) {
            ls lsVar = (ls) list;
            r22 = 0;
            while (r12 < size) {
                int p4 = lsVar.p(r12);
                r22 += tr.f((p4 >> 31) ^ (p4 + p4));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                int intValue = ((Integer) list.get(r12)).intValue();
                r22 += tr.f((intValue >> 31) ^ (intValue + intValue));
                r12++;
            }
        }
        return r22;
    }

    static int U(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * tr.e(r02));
    }

    static int V(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            r22 = 0;
            while (r12 < size) {
                long p4 = sVar.p(r12);
                r22 += tr.g((p4 >> 63) ^ (p4 + p4));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                long longValue = ((Long) list.get(r12)).longValue();
                r22 += tr.g((longValue >> 63) ^ (longValue + longValue));
                r12++;
            }
        }
        return r22;
    }

    static int W(int r4, List list) {
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        int e5 = tr.e(r4) * size;
        if (list instanceof l) {
            l lVar = (l) list;
            while (r12 < size) {
                Object o4 = lVar.o(r12);
                e5 += o4 instanceof hr ? tr.E((hr) o4) : tr.d((String) o4);
                r12++;
            }
        } else {
            while (r12 < size) {
                Object obj = list.get(r12);
                e5 += obj instanceof hr ? tr.E((hr) obj) : tr.d((String) obj);
                r12++;
            }
        }
        return e5;
    }

    static int X(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * tr.e(r02));
    }

    static int Y(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ls) {
            ls lsVar = (ls) list;
            r22 = 0;
            while (r12 < size) {
                r22 += tr.f(lsVar.p(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += tr.f(((Integer) list.get(r12)).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int Z(int r02, List list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * tr.e(r02));
    }

    public static i1 a() {
        return f2112c;
    }

    static int a0(List list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s) {
            s sVar = (s) list;
            r22 = 0;
            while (r12 < size) {
                r22 += tr.g(sVar.p(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += tr.g(((Long) list.get(r12)).longValue());
                r12++;
            }
        }
        return r22;
    }

    public static i1 b() {
        return f2113d;
    }

    public static i1 b0() {
        return f2111b;
    }

    static Object c(int r5, List list, d dVar, Object obj, i1 i1Var) {
        if (dVar == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int r22 = 0;
            for (int r12 = 0; r12 < size; r12++) {
                int intValue = ((Integer) list.get(r12)).intValue();
                if (dVar.a()) {
                    if (r12 != r22) {
                        list.set(r22, Integer.valueOf(intValue));
                    }
                    r22++;
                } else {
                    obj = d(r5, intValue, obj, i1Var);
                }
            }
            if (r22 != size) {
                list.subList(r22, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!dVar.a()) {
                    obj = d(r5, intValue2, obj, i1Var);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object d(int r22, int r32, Object obj, i1 i1Var) {
        if (obj == null) {
            obj = i1Var.f();
        }
        i1Var.l(obj, r22, r32);
        return obj;
    }

    static void e(zr zrVar, Object obj, Object obj2) {
        zrVar.a(obj2);
        throw null;
    }

    static void f(i1 i1Var, Object obj, Object obj2) {
        i1Var.o(obj, i1Var.e(i1Var.d(obj), i1Var.d(obj2)));
    }

    public static void g(Class cls) {
        Class cls2;
        if (!ks.class.isAssignableFrom(cls) && (cls2 = f2110a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean h(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void i(y yVar, Object obj, Object obj2, long j4) {
        s1.x(obj, j4, y.c(s1.k(obj, j4), s1.k(obj2, j4)));
    }

    public static void j(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.n(r12, list, z4);
    }

    public static void k(int r12, List list, ur urVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.p(r12, list);
    }

    public static void l(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.r(r12, list, z4);
    }

    public static void m(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.u(r12, list, z4);
    }

    public static void n(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.w(r12, list, z4);
    }

    public static void o(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.y(r12, list, z4);
    }

    public static void p(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.A(r12, list, z4);
    }

    public static void q(int r22, List list, ur urVar, q0 q0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int r02 = 0; r02 < list.size(); r02++) {
            urVar.B(r22, list.get(r02), q0Var);
        }
    }

    public static void r(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.D(r12, list, z4);
    }

    public static void s(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.F(r12, list, z4);
    }

    public static void t(int r22, List list, ur urVar, q0 q0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int r02 = 0; r02 < list.size(); r02++) {
            urVar.G(r22, list.get(r02), q0Var);
        }
    }

    public static void u(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.I(r12, list, z4);
    }

    public static void v(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.K(r12, list, z4);
    }

    public static void w(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.b(r12, list, z4);
    }

    public static void x(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.d(r12, list, z4);
    }

    public static void y(int r12, List list, ur urVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.g(r12, list);
    }

    public static void z(int r12, List list, ur urVar, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        urVar.i(r12, list, z4);
    }
}
