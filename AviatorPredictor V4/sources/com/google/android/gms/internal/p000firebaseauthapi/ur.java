package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class ur {

    /* renamed from: a, reason: collision with root package name */
    private final tr f2222a;

    private ur(tr trVar) {
        f.f(trVar, "output");
        this.f2222a = trVar;
        trVar.f2179a = this;
    }

    public static ur l(tr trVar) {
        ur urVar = trVar.f2179a;
        return urVar != null ? urVar : new ur(trVar);
    }

    public final void A(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.r(r32, Float.floatToRawIntBits(((Float) list.get(r02)).floatValue()));
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            ((Float) list.get(r33)).floatValue();
            r5 += 4;
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.s(Float.floatToRawIntBits(((Float) list.get(r02)).floatValue()));
            r02++;
        }
    }

    public final void B(int r32, Object obj, q0 q0Var) {
        tr trVar = this.f2222a;
        trVar.z(r32, 3);
        q0Var.c((e0) obj, trVar.f2179a);
        trVar.z(r32, 4);
    }

    public final void C(int r22, int r32) {
        this.f2222a.v(r22, r32);
    }

    public final void D(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.v(r32, ((Integer) list.get(r02)).intValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += tr.G(((Integer) list.get(r33)).intValue());
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.w(((Integer) list.get(r02)).intValue());
            r02++;
        }
    }

    public final void E(int r22, long j4) {
        this.f2222a.C(r22, j4);
    }

    public final void F(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.C(r4, ((Long) list.get(r02)).longValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += tr.g(((Long) list.get(r42)).longValue());
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            this.f2222a.D(((Long) list.get(r02)).longValue());
            r02++;
        }
    }

    public final void G(int r22, Object obj, q0 q0Var) {
        this.f2222a.x(r22, (e0) obj, q0Var);
    }

    public final void H(int r22, int r32) {
        this.f2222a.r(r22, r32);
    }

    public final void I(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.r(r32, ((Integer) list.get(r02)).intValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            ((Integer) list.get(r33)).intValue();
            r5 += 4;
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.s(((Integer) list.get(r02)).intValue());
            r02++;
        }
    }

    public final void J(int r22, long j4) {
        this.f2222a.t(r22, j4);
    }

    public final void K(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.t(r4, ((Long) list.get(r02)).longValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            ((Long) list.get(r42)).longValue();
            r6 += 8;
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            this.f2222a.u(((Long) list.get(r02)).longValue());
            r02++;
        }
    }

    public final void a(int r32, int r4) {
        this.f2222a.A(r32, (r4 >> 31) ^ (r4 + r4));
    }

    public final void b(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                tr trVar = this.f2222a;
                int intValue = ((Integer) list.get(r02)).intValue();
                trVar.A(r4, (intValue >> 31) ^ (intValue + intValue));
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            int intValue2 = ((Integer) list.get(r42)).intValue();
            r6 += tr.f((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            tr trVar2 = this.f2222a;
            int intValue3 = ((Integer) list.get(r02)).intValue();
            trVar2.B((intValue3 >> 31) ^ (intValue3 + intValue3));
            r02++;
        }
    }

    public final void c(int r5, long j4) {
        this.f2222a.C(r5, (j4 >> 63) ^ (j4 + j4));
    }

    public final void d(int r7, List list, boolean z4) {
        int r12 = 0;
        if (!z4) {
            while (r12 < list.size()) {
                tr trVar = this.f2222a;
                long longValue = ((Long) list.get(r12)).longValue();
                trVar.C(r7, (longValue >> 63) ^ (longValue + longValue));
                r12++;
            }
            return;
        }
        this.f2222a.z(r7, 2);
        int r9 = 0;
        for (int r72 = 0; r72 < list.size(); r72++) {
            long longValue2 = ((Long) list.get(r72)).longValue();
            r9 += tr.g((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.f2222a.B(r9);
        while (r12 < list.size()) {
            tr trVar2 = this.f2222a;
            long longValue3 = ((Long) list.get(r12)).longValue();
            trVar2.D((longValue3 >> 63) ^ (longValue3 + longValue3));
            r12++;
        }
    }

    @Deprecated
    public final void e(int r32) {
        this.f2222a.z(r32, 3);
    }

    public final void f(int r22, String str) {
        this.f2222a.y(r22, str);
    }

    public final void g(int r5, List list) {
        int r12 = 0;
        if (!(list instanceof l)) {
            while (r12 < list.size()) {
                this.f2222a.y(r5, (String) list.get(r12));
                r12++;
            }
            return;
        }
        l lVar = (l) list;
        while (r12 < list.size()) {
            Object o4 = lVar.o(r12);
            if (o4 instanceof String) {
                this.f2222a.y(r5, (String) o4);
            } else {
                this.f2222a.p(r5, (hr) o4);
            }
            r12++;
        }
    }

    public final void h(int r22, int r32) {
        this.f2222a.A(r22, r32);
    }

    public final void i(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.A(r32, ((Integer) list.get(r02)).intValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += tr.f(((Integer) list.get(r33)).intValue());
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.B(((Integer) list.get(r02)).intValue());
            r02++;
        }
    }

    public final void j(int r22, long j4) {
        this.f2222a.C(r22, j4);
    }

    public final void k(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.C(r4, ((Long) list.get(r02)).longValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            r6 += tr.g(((Long) list.get(r42)).longValue());
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            this.f2222a.D(((Long) list.get(r02)).longValue());
            r02++;
        }
    }

    public final void m(int r22, boolean z4) {
        this.f2222a.o(r22, z4);
    }

    public final void n(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.o(r32, ((Boolean) list.get(r02)).booleanValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            ((Boolean) list.get(r33)).booleanValue();
            r5++;
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.n(((Boolean) list.get(r02)).booleanValue() ? (byte) 1 : (byte) 0);
            r02++;
        }
    }

    public final void o(int r22, hr hrVar) {
        this.f2222a.p(r22, hrVar);
    }

    public final void p(int r4, List list) {
        for (int r02 = 0; r02 < list.size(); r02++) {
            this.f2222a.p(r4, (hr) list.get(r02));
        }
    }

    public final void q(int r22, double d5) {
        this.f2222a.t(r22, Double.doubleToRawLongBits(d5));
    }

    public final void r(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.t(r4, Double.doubleToRawLongBits(((Double) list.get(r02)).doubleValue()));
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            ((Double) list.get(r42)).doubleValue();
            r6 += 8;
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            this.f2222a.u(Double.doubleToRawLongBits(((Double) list.get(r02)).doubleValue()));
            r02++;
        }
    }

    @Deprecated
    public final void s(int r32) {
        this.f2222a.z(r32, 4);
    }

    public final void t(int r22, int r32) {
        this.f2222a.v(r22, r32);
    }

    public final void u(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.v(r32, ((Integer) list.get(r02)).intValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            r5 += tr.G(((Integer) list.get(r33)).intValue());
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.w(((Integer) list.get(r02)).intValue());
            r02++;
        }
    }

    public final void v(int r22, int r32) {
        this.f2222a.r(r22, r32);
    }

    public final void w(int r32, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.r(r32, ((Integer) list.get(r02)).intValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r32, 2);
        int r5 = 0;
        for (int r33 = 0; r33 < list.size(); r33++) {
            ((Integer) list.get(r33)).intValue();
            r5 += 4;
        }
        this.f2222a.B(r5);
        while (r02 < list.size()) {
            this.f2222a.s(((Integer) list.get(r02)).intValue());
            r02++;
        }
    }

    public final void x(int r22, long j4) {
        this.f2222a.t(r22, j4);
    }

    public final void y(int r4, List list, boolean z4) {
        int r02 = 0;
        if (!z4) {
            while (r02 < list.size()) {
                this.f2222a.t(r4, ((Long) list.get(r02)).longValue());
                r02++;
            }
            return;
        }
        this.f2222a.z(r4, 2);
        int r6 = 0;
        for (int r42 = 0; r42 < list.size(); r42++) {
            ((Long) list.get(r42)).longValue();
            r6 += 8;
        }
        this.f2222a.B(r6);
        while (r02 < list.size()) {
            this.f2222a.u(((Long) list.get(r02)).longValue());
            r02++;
        }
    }

    public final void z(int r22, float f5) {
        this.f2222a.r(r22, Float.floatToRawIntBits(f5));
    }
}
