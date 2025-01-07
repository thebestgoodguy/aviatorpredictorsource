package com.google.protobuf;

import com.google.protobuf.d0;
import com.google.protobuf.w;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class p1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f3038a = B();

    /* renamed from: b, reason: collision with root package name */
    private static final v1<?, ?> f3039b = C(false);

    /* renamed from: c, reason: collision with root package name */
    private static final v1<?, ?> f3040c = C(true);

    /* renamed from: d, reason: collision with root package name */
    private static final v1<?, ?> f3041d = new x1();

    static <UT, UB> UB A(int r5, List<Integer> list, d0.e eVar, UB ub, v1<UT, UB> v1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int r22 = 0;
            for (int r12 = 0; r12 < size; r12++) {
                int intValue = list.get(r12).intValue();
                if (eVar.a(intValue)) {
                    if (r12 != r22) {
                        list.set(r22, Integer.valueOf(intValue));
                    }
                    r22++;
                } else {
                    ub = (UB) L(r5, intValue, ub, v1Var);
                }
            }
            if (r22 != size) {
                list.subList(r22, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) L(r5, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static v1<?, ?> C(boolean z4) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (v1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z4));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    static <T, FT extends w.b<FT>> void E(s<FT> sVar, T t4, T t5) {
        w<FT> c5 = sVar.c(t5);
        if (c5.n()) {
            return;
        }
        sVar.d(t4).u(c5);
    }

    static <T> void F(q0 q0Var, T t4, T t5, long j4) {
        z1.V(t4, j4, q0Var.a(z1.G(t4, j4), z1.G(t5, j4)));
    }

    static <T, UT, UB> void G(v1<UT, UB> v1Var, T t4, T t5) {
        v1Var.p(t4, v1Var.k(v1Var.g(t4), v1Var.g(t5)));
    }

    public static v1<?, ?> H() {
        return f3039b;
    }

    public static v1<?, ?> I() {
        return f3040c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!a0.class.isAssignableFrom(cls) && (cls2 = f3038a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static <UT, UB> UB L(int r22, int r32, UB ub, v1<UT, UB> v1Var) {
        if (ub == null) {
            ub = v1Var.n();
        }
        v1Var.e(ub, r22, r32);
        return ub;
    }

    public static v1<?, ?> M() {
        return f3041d;
    }

    public static void N(int r12, List<Boolean> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.O(r12, list, z4);
    }

    public static void O(int r12, List<j> list, c2 c2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.L(r12, list);
    }

    public static void P(int r12, List<Double> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.H(r12, list, z4);
    }

    public static void Q(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.F(r12, list, z4);
    }

    public static void R(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.M(r12, list, z4);
    }

    public static void S(int r12, List<Long> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.A(r12, list, z4);
    }

    public static void T(int r12, List<Float> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.f(r12, list, z4);
    }

    public static void U(int r12, List<?> list, c2 c2Var, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.c(r12, list, n1Var);
    }

    public static void V(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.e(r12, list, z4);
    }

    public static void W(int r12, List<Long> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.D(r12, list, z4);
    }

    public static void X(int r12, List<?> list, c2 c2Var, n1 n1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.a(r12, list, n1Var);
    }

    public static void Y(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.B(r12, list, z4);
    }

    public static void Z(int r12, List<Long> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.J(r12, list, z4);
    }

    static int a(int r02, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? m.W(r02) + m.D(size) : size * m.e(r02, true);
    }

    public static void a0(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.y(r12, list, z4);
    }

    static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int r12, List<Long> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.i(r12, list, z4);
    }

    static int c(int r22, List<j> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int W = size * m.W(r22);
        for (int r12 = 0; r12 < list.size(); r12++) {
            W += m.i(list.get(r12));
        }
        return W;
    }

    public static void c0(int r12, List<String> list, c2 c2Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.r(r12, list);
    }

    static int d(int r12, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e5 = e(list);
        int W = m.W(r12);
        return z4 ? W + m.D(e5) : e5 + (size * W);
    }

    public static void d0(int r12, List<Integer> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.g(r12, list, z4);
    }

    static int e(List<Integer> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.m(c0Var.w(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.m(list.get(r12).intValue());
                r12++;
            }
        }
        return r22;
    }

    public static void e0(int r12, List<Long> list, c2 c2Var, boolean z4) {
        if (list == null || list.isEmpty()) {
            return;
        }
        c2Var.N(r12, list, z4);
    }

    static int f(int r12, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? m.W(r12) + m.D(size * 4) : size * m.n(r12, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int r22, List<?> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z4 ? m.W(r22) + m.D(size * 8) : size * m.p(r22, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int r4, List<v0> list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r22 = 0;
        for (int r12 = 0; r12 < size; r12++) {
            r22 += m.t(r4, list.get(r12), n1Var);
        }
        return r22;
    }

    static int k(int r12, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l4 = l(list);
        int W = m.W(r12);
        return z4 ? W + m.D(l4) : l4 + (size * W);
    }

    static int l(List<Integer> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.x(c0Var.w(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.x(list.get(r12).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int m(int r12, List<Long> list, boolean z4) {
        if (list.size() == 0) {
            return 0;
        }
        int n4 = n(list);
        return z4 ? m.W(r12) + m.D(n4) : n4 + (list.size() * m.W(r12));
    }

    static int n(List<Long> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.z(m0Var.v(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.z(list.get(r12).longValue());
                r12++;
            }
        }
        return r22;
    }

    static int o(int r12, Object obj, n1 n1Var) {
        return obj instanceof i0 ? m.B(r12, (i0) obj) : m.G(r12, (v0) obj, n1Var);
    }

    static int p(int r4, List<?> list, n1 n1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int W = m.W(r4) * size;
        for (int r12 = 0; r12 < size; r12++) {
            Object obj = list.get(r12);
            W += obj instanceof i0 ? m.C((i0) obj) : m.I((v0) obj, n1Var);
        }
        return W;
    }

    static int q(int r12, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r4 = r(list);
        int W = m.W(r12);
        return z4 ? W + m.D(r4) : r4 + (size * W);
    }

    static int r(List<Integer> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.R(c0Var.w(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.R(list.get(r12).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int s(int r12, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t4 = t(list);
        int W = m.W(r12);
        return z4 ? W + m.D(t4) : t4 + (size * W);
    }

    static int t(List<Long> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.T(m0Var.v(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.T(list.get(r12).longValue());
                r12++;
            }
        }
        return r22;
    }

    static int u(int r4, List<?> list) {
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        int W = m.W(r4) * size;
        if (list instanceof k0) {
            k0 k0Var = (k0) list;
            while (r12 < size) {
                Object j4 = k0Var.j(r12);
                W += j4 instanceof j ? m.i((j) j4) : m.V((String) j4);
                r12++;
            }
        } else {
            while (r12 < size) {
                Object obj = list.get(r12);
                W += obj instanceof j ? m.i((j) obj) : m.V((String) obj);
                r12++;
            }
        }
        return W;
    }

    static int v(int r12, List<Integer> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w4 = w(list);
        int W = m.W(r12);
        return z4 ? W + m.D(w4) : w4 + (size * W);
    }

    static int w(List<Integer> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof c0) {
            c0 c0Var = (c0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.Y(c0Var.w(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.Y(list.get(r12).intValue());
                r12++;
            }
        }
        return r22;
    }

    static int x(int r12, List<Long> list, boolean z4) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y4 = y(list);
        int W = m.W(r12);
        return z4 ? W + m.D(y4) : y4 + (size * W);
    }

    static int y(List<Long> list) {
        int r22;
        int size = list.size();
        int r12 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof m0) {
            m0 m0Var = (m0) list;
            r22 = 0;
            while (r12 < size) {
                r22 += m.a0(m0Var.v(r12));
                r12++;
            }
        } else {
            r22 = 0;
            while (r12 < size) {
                r22 += m.a0(list.get(r12).longValue());
                r12++;
            }
        }
        return r22;
    }

    static <UT, UB> UB z(int r5, List<Integer> list, d0.d<?> dVar, UB ub, v1<UT, UB> v1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int r22 = 0;
            for (int r12 = 0; r12 < size; r12++) {
                int intValue = list.get(r12).intValue();
                if (dVar.a(intValue) != null) {
                    if (r12 != r22) {
                        list.set(r22, Integer.valueOf(intValue));
                    }
                    r22++;
                } else {
                    ub = (UB) L(r5, intValue, ub, v1Var);
                }
            }
            if (r22 != size) {
                list.subList(r22, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) L(r5, intValue2, ub, v1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
