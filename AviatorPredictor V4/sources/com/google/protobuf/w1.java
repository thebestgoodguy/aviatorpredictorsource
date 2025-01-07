package com.google.protobuf;

import com.google.protobuf.c2;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class w1 {

    /* renamed from: f, reason: collision with root package name */
    private static final w1 f3089f = new w1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f3090a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f3091b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f3092c;

    /* renamed from: d, reason: collision with root package name */
    private int f3093d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3094e;

    private w1() {
        this(0, new int[8], new Object[8], true);
    }

    private w1(int r22, int[] r32, Object[] objArr, boolean z4) {
        this.f3093d = -1;
        this.f3090a = r22;
        this.f3091b = r32;
        this.f3092c = objArr;
        this.f3094e = z4;
    }

    private void b() {
        int r02 = this.f3090a;
        int[] r12 = this.f3091b;
        if (r02 == r12.length) {
            int r03 = r02 + (r02 < 4 ? 8 : r02 >> 1);
            this.f3091b = Arrays.copyOf(r12, r03);
            this.f3092c = Arrays.copyOf(this.f3092c, r03);
        }
    }

    public static w1 c() {
        return f3089f;
    }

    private static int f(int[] r32, int r4) {
        int r02 = 17;
        for (int r12 = 0; r12 < r4; r12++) {
            r02 = (r02 * 31) + r32[r12];
        }
        return r02;
    }

    private static int g(Object[] objArr, int r4) {
        int r02 = 17;
        for (int r12 = 0; r12 < r4; r12++) {
            r02 = (r02 * 31) + objArr[r12].hashCode();
        }
        return r02;
    }

    static w1 i(w1 w1Var, w1 w1Var2) {
        int r02 = w1Var.f3090a + w1Var2.f3090a;
        int[] copyOf = Arrays.copyOf(w1Var.f3091b, r02);
        System.arraycopy(w1Var2.f3091b, 0, copyOf, w1Var.f3090a, w1Var2.f3090a);
        Object[] copyOf2 = Arrays.copyOf(w1Var.f3092c, r02);
        System.arraycopy(w1Var2.f3092c, 0, copyOf2, w1Var.f3090a, w1Var2.f3090a);
        return new w1(r02, copyOf, copyOf2, true);
    }

    static w1 j() {
        return new w1();
    }

    private static boolean k(Object[] objArr, Object[] objArr2, int r6) {
        for (int r12 = 0; r12 < r6; r12++) {
            if (!objArr[r12].equals(objArr2[r12])) {
                return false;
            }
        }
        return true;
    }

    private static boolean n(int[] r4, int[] r5, int r6) {
        for (int r12 = 0; r12 < r6; r12++) {
            if (r4[r12] != r5[r12]) {
                return false;
            }
        }
        return true;
    }

    private static void p(int r22, Object obj, c2 c2Var) {
        int a5 = b2.a(r22);
        int b5 = b2.b(r22);
        if (b5 == 0) {
            c2Var.h(a5, ((Long) obj).longValue());
            return;
        }
        if (b5 == 1) {
            c2Var.k(a5, ((Long) obj).longValue());
            return;
        }
        if (b5 == 2) {
            c2Var.v(a5, (j) obj);
            return;
        }
        if (b5 != 3) {
            if (b5 != 5) {
                throw new RuntimeException(e0.e());
            }
            c2Var.E(a5, ((Integer) obj).intValue());
        } else if (c2Var.n() == c2.a.ASCENDING) {
            c2Var.t(a5);
            ((w1) obj).q(c2Var);
            c2Var.u(a5);
        } else {
            c2Var.u(a5);
            ((w1) obj).q(c2Var);
            c2Var.t(a5);
        }
    }

    void a() {
        if (!this.f3094e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int Z;
        int r02 = this.f3093d;
        if (r02 != -1) {
            return r02;
        }
        int r12 = 0;
        for (int r03 = 0; r03 < this.f3090a; r03++) {
            int r22 = this.f3091b[r03];
            int a5 = b2.a(r22);
            int b5 = b2.b(r22);
            if (b5 == 0) {
                Z = m.Z(a5, ((Long) this.f3092c[r03]).longValue());
            } else if (b5 == 1) {
                Z = m.p(a5, ((Long) this.f3092c[r03]).longValue());
            } else if (b5 == 2) {
                Z = m.h(a5, (j) this.f3092c[r03]);
            } else if (b5 == 3) {
                Z = (m.W(a5) * 2) + ((w1) this.f3092c[r03]).d();
            } else {
                if (b5 != 5) {
                    throw new IllegalStateException(e0.e());
                }
                Z = m.n(a5, ((Integer) this.f3092c[r03]).intValue());
            }
            r12 += Z;
        }
        this.f3093d = r12;
        return r12;
    }

    public int e() {
        int r02 = this.f3093d;
        if (r02 != -1) {
            return r02;
        }
        int r12 = 0;
        for (int r03 = 0; r03 < this.f3090a; r03++) {
            r12 += m.K(b2.a(this.f3091b[r03]), (j) this.f3092c[r03]);
        }
        this.f3093d = r12;
        return r12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        int r22 = this.f3090a;
        return r22 == w1Var.f3090a && n(this.f3091b, w1Var.f3091b, r22) && k(this.f3092c, w1Var.f3092c, this.f3090a);
    }

    public void h() {
        this.f3094e = false;
    }

    public int hashCode() {
        int r02 = this.f3090a;
        return ((((527 + r02) * 31) + f(this.f3091b, r02)) * 31) + g(this.f3092c, this.f3090a);
    }

    final void l(StringBuilder sb, int r5) {
        for (int r02 = 0; r02 < this.f3090a; r02++) {
            x0.c(sb, r5, String.valueOf(b2.a(this.f3091b[r02])), this.f3092c[r02]);
        }
    }

    void m(int r32, Object obj) {
        a();
        b();
        int[] r02 = this.f3091b;
        int r12 = this.f3090a;
        r02[r12] = r32;
        this.f3092c[r12] = obj;
        this.f3090a = r12 + 1;
    }

    void o(c2 c2Var) {
        if (c2Var.n() == c2.a.DESCENDING) {
            for (int r02 = this.f3090a - 1; r02 >= 0; r02--) {
                c2Var.m(b2.a(this.f3091b[r02]), this.f3092c[r02]);
            }
            return;
        }
        for (int r03 = 0; r03 < this.f3090a; r03++) {
            c2Var.m(b2.a(this.f3091b[r03]), this.f3092c[r03]);
        }
    }

    public void q(c2 c2Var) {
        if (this.f3090a == 0) {
            return;
        }
        if (c2Var.n() == c2.a.ASCENDING) {
            for (int r02 = 0; r02 < this.f3090a; r02++) {
                p(this.f3091b[r02], this.f3092c[r02], c2Var);
            }
            return;
        }
        for (int r03 = this.f3090a - 1; r03 >= 0; r03--) {
            p(this.f3091b[r03], this.f3092c[r03], c2Var);
        }
    }
}
