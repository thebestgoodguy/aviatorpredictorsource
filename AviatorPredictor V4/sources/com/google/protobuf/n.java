package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.c2;
import com.google.protobuf.o0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class n implements c2 {

    /* renamed from: a, reason: collision with root package name */
    private final m f3021a;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3022a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f3022a = r02;
            try {
                r02[b2.b.f2809n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3022a[b2.b.f2808m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3022a[b2.b.f2806k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3022a[b2.b.f2816u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3022a[b2.b.f2818w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3022a[b2.b.f2814s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3022a[b2.b.f2807l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3022a[b2.b.f2804i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3022a[b2.b.f2817v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3022a[b2.b.f2819x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3022a[b2.b.f2805j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3022a[b2.b.f2810o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private n(m mVar) {
        m mVar2 = (m) d0.b(mVar, "output");
        this.f3021a = mVar2;
        mVar2.f2995a = this;
    }

    public static n P(m mVar) {
        n nVar = mVar.f2995a;
        return nVar != null ? nVar : new n(mVar);
    }

    private <V> void Q(int r32, boolean z4, V v4, o0.a<Boolean, V> aVar) {
        this.f3021a.X0(r32, 2);
        this.f3021a.Z0(o0.b(aVar, Boolean.valueOf(z4), v4));
        o0.e(this.f3021a, aVar, Boolean.valueOf(z4), v4);
    }

    private <V> void R(int r8, o0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] r12 = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int r4 = 0;
        while (it.hasNext()) {
            r12[r4] = it.next().intValue();
            r4++;
        }
        Arrays.sort(r12);
        for (int r32 = 0; r32 < size; r32++) {
            int r22 = r12[r32];
            V v4 = map.get(Integer.valueOf(r22));
            this.f3021a.X0(r8, 2);
            this.f3021a.Z0(o0.b(aVar, Integer.valueOf(r22), v4));
            o0.e(this.f3021a, aVar, Integer.valueOf(r22), v4);
        }
    }

    private <V> void S(int r9, o0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int r4 = 0;
        while (it.hasNext()) {
            jArr[r4] = it.next().longValue();
            r4++;
        }
        Arrays.sort(jArr);
        for (int r32 = 0; r32 < size; r32++) {
            long j4 = jArr[r32];
            V v4 = map.get(Long.valueOf(j4));
            this.f3021a.X0(r9, 2);
            this.f3021a.Z0(o0.b(aVar, Long.valueOf(j4), v4));
            o0.e(this.f3021a, aVar, Long.valueOf(j4), v4);
        }
    }

    private <K, V> void T(int r32, o0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f3022a[aVar.f3032a.ordinal()]) {
            case 1:
                V v4 = map.get(Boolean.FALSE);
                if (v4 != null) {
                    Q(r32, false, v4, aVar);
                }
                V v5 = map.get(Boolean.TRUE);
                if (v5 != null) {
                    Q(r32, true, v5, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(r32, aVar, map);
                return;
            case 7:
            case 8:
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                S(r32, aVar, map);
                return;
            case 12:
                U(r32, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f3032a);
        }
    }

    private <V> void U(int r8, o0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int r4 = 0;
        while (it.hasNext()) {
            strArr[r4] = it.next();
            r4++;
        }
        Arrays.sort(strArr);
        for (int r32 = 0; r32 < size; r32++) {
            String str = strArr[r32];
            V v4 = map.get(str);
            this.f3021a.X0(r8, 2);
            this.f3021a.Z0(o0.b(aVar, str, v4));
            o0.e(this.f3021a, aVar, str, v4);
        }
    }

    private void V(int r22, Object obj) {
        if (obj instanceof String) {
            this.f3021a.V0(r22, (String) obj);
        } else {
            this.f3021a.p0(r22, (j) obj);
        }
    }

    @Override // com.google.protobuf.c2
    public void A(int r4, List<Long> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.x0(r4, list.get(r02).longValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.q(list.get(r42).longValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.y0(list.get(r02).longValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void B(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.N0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.N(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.O0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void C(int r22, int r32) {
        this.f3021a.t0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public void D(int r4, List<Long> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.H0(r4, list.get(r02).longValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.z(list.get(r42).longValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.I0(list.get(r02).longValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void E(int r22, int r32) {
        this.f3021a.v0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public void F(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.t0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.m(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.u0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void G(int r22, double d5) {
        this.f3021a.r0(r22, d5);
    }

    @Override // com.google.protobuf.c2
    public void H(int r4, List<Double> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.r0(r4, list.get(r02).doubleValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.k(list.get(r42).doubleValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.s0(list.get(r02).doubleValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void I(int r22, long j4) {
        this.f3021a.P0(r22, j4);
    }

    @Override // com.google.protobuf.c2
    public void J(int r4, List<Long> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.P0(r4, list.get(r02).longValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.P(list.get(r42).longValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.Q0(list.get(r02).longValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void K(int r22, int r32) {
        this.f3021a.R0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public void L(int r4, List<j> list) {
        for (int r02 = 0; r02 < list.size(); r02++) {
            this.f3021a.p0(r4, list.get(r02));
        }
    }

    @Override // com.google.protobuf.c2
    public void M(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.v0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.o(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.w0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void N(int r4, List<Long> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.a1(r4, list.get(r02).longValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.a0(list.get(r42).longValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.b1(list.get(r02).longValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void O(int r32, List<Boolean> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.l0(r32, list.get(r02).booleanValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.f(list.get(r33).booleanValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.m0(list.get(r02).booleanValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void a(int r32, List<?> list, n1 n1Var) {
        for (int r02 = 0; r02 < list.size(); r02++) {
            b(r32, list.get(r02), n1Var);
        }
    }

    @Override // com.google.protobuf.c2
    public void b(int r22, Object obj, n1 n1Var) {
        this.f3021a.J0(r22, (v0) obj, n1Var);
    }

    @Override // com.google.protobuf.c2
    public void c(int r32, List<?> list, n1 n1Var) {
        for (int r02 = 0; r02 < list.size(); r02++) {
            o(r32, list.get(r02), n1Var);
        }
    }

    @Override // com.google.protobuf.c2
    public <K, V> void d(int r5, o0.a<K, V> aVar, Map<K, V> map) {
        if (this.f3021a.f0()) {
            T(r5, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f3021a.X0(r5, 2);
            this.f3021a.Z0(o0.b(aVar, entry.getKey(), entry.getValue()));
            o0.e(this.f3021a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.c2
    public void e(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.F0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.x(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.G0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void f(int r32, List<Float> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.z0(r32, list.get(r02).floatValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.s(list.get(r33).floatValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.A0(list.get(r02).floatValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void g(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.Y0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.Y(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.Z0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void h(int r22, long j4) {
        this.f3021a.H0(r22, j4);
    }

    @Override // com.google.protobuf.c2
    public void i(int r4, List<Long> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.T0(r4, list.get(r02).longValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += m.T(list.get(r42).longValue());
        }
        this.f3021a.Z0(r6);
        while (r02 < list.size()) {
            this.f3021a.U0(list.get(r02).longValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void j(int r22, boolean z4) {
        this.f3021a.l0(r22, z4);
    }

    @Override // com.google.protobuf.c2
    public void k(int r22, long j4) {
        this.f3021a.x0(r22, j4);
    }

    @Override // com.google.protobuf.c2
    public void l(int r22, int r32) {
        this.f3021a.Y0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public final void m(int r22, Object obj) {
        if (obj instanceof j) {
            this.f3021a.M0(r22, (j) obj);
        } else {
            this.f3021a.L0(r22, (v0) obj);
        }
    }

    @Override // com.google.protobuf.c2
    public c2.a n() {
        return c2.a.ASCENDING;
    }

    @Override // com.google.protobuf.c2
    public void o(int r22, Object obj, n1 n1Var) {
        this.f3021a.C0(r22, (v0) obj, n1Var);
    }

    @Override // com.google.protobuf.c2
    public void p(int r22, long j4) {
        this.f3021a.T0(r22, j4);
    }

    @Override // com.google.protobuf.c2
    public void q(int r22, float f5) {
        this.f3021a.z0(r22, f5);
    }

    @Override // com.google.protobuf.c2
    public void r(int r4, List<String> list) {
        int r12 = 0;
        if (!(list instanceof k0)) {
            while (r12 < list.size()) {
                this.f3021a.V0(r4, list.get(r12));
                r12++;
            }
        } else {
            k0 k0Var = (k0) list;
            while (r12 < list.size()) {
                V(r4, k0Var.j(r12));
                r12++;
            }
        }
    }

    @Override // com.google.protobuf.c2
    public void s(int r22, int r32) {
        this.f3021a.N0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public void t(int r32) {
        this.f3021a.X0(r32, 3);
    }

    @Override // com.google.protobuf.c2
    public void u(int r32) {
        this.f3021a.X0(r32, 4);
    }

    @Override // com.google.protobuf.c2
    public void v(int r22, j jVar) {
        this.f3021a.p0(r22, jVar);
    }

    @Override // com.google.protobuf.c2
    public void w(int r22, String str) {
        this.f3021a.V0(r22, str);
    }

    @Override // com.google.protobuf.c2
    public void x(int r22, int r32) {
        this.f3021a.F0(r22, r32);
    }

    @Override // com.google.protobuf.c2
    public void y(int r32, List<Integer> list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f3021a.R0(r32, list.get(r02).intValue());
                r02++;
            }
            return;
        }
        this.f3021a.X0(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += m.R(list.get(r33).intValue());
        }
        this.f3021a.Z0(r5);
        while (r02 < list.size()) {
            this.f3021a.S0(list.get(r02).intValue());
            r02++;
        }
    }

    @Override // com.google.protobuf.c2
    public void z(int r22, long j4) {
        this.f3021a.a1(r22, j4);
    }
}
