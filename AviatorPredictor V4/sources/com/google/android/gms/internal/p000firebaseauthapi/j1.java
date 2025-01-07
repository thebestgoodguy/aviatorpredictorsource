package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: f, reason: collision with root package name */
    private static final j1 f1790f = new j1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f1791a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f1792b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f1793c;

    /* renamed from: d, reason: collision with root package name */
    private int f1794d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f1795e;

    private j1() {
        this(0, new int[8], new Object[8], true);
    }

    private j1(int r22, int[] r32, Object[] objArr, boolean z4) {
        this.f1794d = -1;
        this.f1791a = r22;
        this.f1792b = r32;
        this.f1793c = objArr;
        this.f1795e = z4;
    }

    public static j1 c() {
        return f1790f;
    }

    static j1 d(j1 j1Var, j1 j1Var2) {
        int r02 = j1Var.f1791a + j1Var2.f1791a;
        int[] copyOf = Arrays.copyOf(j1Var.f1792b, r02);
        System.arraycopy(j1Var2.f1792b, 0, copyOf, j1Var.f1791a, j1Var2.f1791a);
        Object[] copyOf2 = Arrays.copyOf(j1Var.f1793c, r02);
        System.arraycopy(j1Var2.f1793c, 0, copyOf2, j1Var.f1791a, j1Var2.f1791a);
        return new j1(r02, copyOf, copyOf2, true);
    }

    static j1 e() {
        return new j1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int f5;
        int g5;
        int r22;
        int r02 = this.f1794d;
        if (r02 != -1) {
            return r02;
        }
        int r12 = 0;
        for (int r03 = 0; r03 < this.f1791a; r03++) {
            int r23 = this.f1792b[r03];
            int r32 = r23 >>> 3;
            int r24 = r23 & 7;
            if (r24 != 0) {
                if (r24 == 1) {
                    ((Long) this.f1793c[r03]).longValue();
                    r22 = tr.f(r32 << 3) + 8;
                } else if (r24 == 2) {
                    hr hrVar = (hr) this.f1793c[r03];
                    int f6 = tr.f(r32 << 3);
                    int q4 = hrVar.q();
                    r12 += f6 + tr.f(q4) + q4;
                } else if (r24 == 3) {
                    int e5 = tr.e(r32);
                    f5 = e5 + e5;
                    g5 = ((j1) this.f1793c[r03]).a();
                } else {
                    if (r24 != 5) {
                        throw new IllegalStateException(h.a());
                    }
                    ((Integer) this.f1793c[r03]).intValue();
                    r22 = tr.f(r32 << 3) + 4;
                }
                r12 += r22;
            } else {
                long longValue = ((Long) this.f1793c[r03]).longValue();
                f5 = tr.f(r32 << 3);
                g5 = tr.g(longValue);
            }
            r22 = f5 + g5;
            r12 += r22;
        }
        this.f1794d = r12;
        return r12;
    }

    public final int b() {
        int r02 = this.f1794d;
        if (r02 != -1) {
            return r02;
        }
        int r12 = 0;
        for (int r03 = 0; r03 < this.f1791a; r03++) {
            int r22 = this.f1792b[r03];
            hr hrVar = (hr) this.f1793c[r03];
            int f5 = tr.f(8);
            int q4 = hrVar.q();
            r12 += f5 + f5 + tr.f(16) + tr.f(r22 >>> 3) + tr.f(24) + tr.f(q4) + q4;
        }
        this.f1794d = r12;
        return r12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        int r22 = this.f1791a;
        if (r22 == j1Var.f1791a) {
            int[] r32 = this.f1792b;
            int[] r4 = j1Var.f1792b;
            int r5 = 0;
            while (true) {
                if (r5 >= r22) {
                    Object[] objArr = this.f1793c;
                    Object[] objArr2 = j1Var.f1793c;
                    int r33 = this.f1791a;
                    for (int r42 = 0; r42 < r33; r42++) {
                        if (objArr[r42].equals(objArr2[r42])) {
                        }
                    }
                    return true;
                }
                if (r32[r5] != r4[r5]) {
                    break;
                }
                r5++;
            }
        }
        return false;
    }

    public final void f() {
        this.f1795e = false;
    }

    final void g(StringBuilder sb, int r5) {
        for (int r02 = 0; r02 < this.f1791a; r02++) {
            g0.b(sb, r5, String.valueOf(this.f1792b[r02] >>> 3), this.f1793c[r02]);
        }
    }

    final void h(int r4, Object obj) {
        if (!this.f1795e) {
            throw new UnsupportedOperationException();
        }
        int r02 = this.f1791a;
        int[] r12 = this.f1792b;
        if (r02 == r12.length) {
            int r03 = r02 + (r02 < 4 ? 8 : r02 >> 1);
            this.f1792b = Arrays.copyOf(r12, r03);
            this.f1793c = Arrays.copyOf(this.f1793c, r03);
        }
        int[] r04 = this.f1792b;
        int r13 = this.f1791a;
        r04[r13] = r4;
        this.f1793c[r13] = obj;
        this.f1791a = r13 + 1;
    }

    public final int hashCode() {
        int r02 = this.f1791a;
        int r12 = (r02 + 527) * 31;
        int[] r22 = this.f1792b;
        int r4 = 17;
        int r6 = 17;
        for (int r5 = 0; r5 < r02; r5++) {
            r6 = (r6 * 31) + r22[r5];
        }
        int r13 = (r12 + r6) * 31;
        Object[] objArr = this.f1793c;
        int r23 = this.f1791a;
        for (int r32 = 0; r32 < r23; r32++) {
            r4 = (r4 * 31) + objArr[r32].hashCode();
        }
        return r13 + r4;
    }

    public final void i(ur urVar) {
        if (this.f1791a != 0) {
            for (int r02 = 0; r02 < this.f1791a; r02++) {
                int r12 = this.f1792b[r02];
                Object obj = this.f1793c[r02];
                int r32 = r12 >>> 3;
                int r13 = r12 & 7;
                if (r13 == 0) {
                    urVar.E(r32, ((Long) obj).longValue());
                } else if (r13 == 1) {
                    urVar.x(r32, ((Long) obj).longValue());
                } else if (r13 == 2) {
                    urVar.o(r32, (hr) obj);
                } else if (r13 == 3) {
                    urVar.e(r32);
                    ((j1) obj).i(urVar);
                    urVar.s(r32);
                } else {
                    if (r13 != 5) {
                        throw new RuntimeException(h.a());
                    }
                    urVar.v(r32, ((Integer) obj).intValue());
                }
            }
        }
    }
}
