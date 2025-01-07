package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class vq {
    static int a(byte[] bArr, int r32, uq uqVar) {
        int j4 = j(bArr, r32, uqVar);
        int r02 = uqVar.f2218a;
        if (r02 < 0) {
            throw h.f();
        }
        if (r02 > bArr.length - j4) {
            throw h.i();
        }
        if (r02 == 0) {
            uqVar.f2220c = hr.f1739f;
            return j4;
        }
        uqVar.f2220c = hr.B(bArr, j4, r02);
        return j4 + r02;
    }

    static int b(byte[] bArr, int r32) {
        return ((bArr[r32 + 3] & 255) << 24) | (bArr[r32] & 255) | ((bArr[r32 + 1] & 255) << 8) | ((bArr[r32 + 2] & 255) << 16);
    }

    static int c(q0 q0Var, byte[] bArr, int r10, int r11, int r12, uq uqVar) {
        h0 h0Var = (h0) q0Var;
        Object d5 = h0Var.d();
        int I = h0Var.I(d5, bArr, r10, r11, r12, uqVar);
        h0Var.b(d5);
        uqVar.f2220c = d5;
        return I;
    }

    static int d(q0 q0Var, byte[] bArr, int r8, int r9, uq uqVar) {
        int r02 = r8 + 1;
        int r82 = bArr[r8];
        if (r82 < 0) {
            r02 = k(r82, bArr, r02, uqVar);
            r82 = uqVar.f2218a;
        }
        int r32 = r02;
        if (r82 < 0 || r82 > r9 - r32) {
            throw h.i();
        }
        Object d5 = q0Var.d();
        int r83 = r82 + r32;
        q0Var.g(d5, bArr, r32, r83, uqVar);
        q0Var.b(d5);
        uqVar.f2220c = d5;
        return r83;
    }

    static int e(q0 q0Var, int r32, byte[] bArr, int r5, int r6, e eVar, uq uqVar) {
        int d5 = d(q0Var, bArr, r5, r6, uqVar);
        while (true) {
            eVar.add(uqVar.f2220c);
            if (d5 >= r6) {
                break;
            }
            int j4 = j(bArr, d5, uqVar);
            if (r32 != uqVar.f2218a) {
                break;
            }
            d5 = d(q0Var, bArr, j4, r6, uqVar);
        }
        return d5;
    }

    static int f(byte[] bArr, int r32, e eVar, uq uqVar) {
        ls lsVar = (ls) eVar;
        int j4 = j(bArr, r32, uqVar);
        int r02 = uqVar.f2218a + j4;
        while (j4 < r02) {
            j4 = j(bArr, j4, uqVar);
            lsVar.q(uqVar.f2218a);
        }
        if (j4 == r02) {
            return j4;
        }
        throw h.i();
    }

    static int g(byte[] bArr, int r4, uq uqVar) {
        int j4 = j(bArr, r4, uqVar);
        int r02 = uqVar.f2218a;
        if (r02 < 0) {
            throw h.f();
        }
        if (r02 == 0) {
            uqVar.f2220c = "";
            return j4;
        }
        uqVar.f2220c = new String(bArr, j4, r02, f.f1632b);
        return j4 + r02;
    }

    static int h(byte[] bArr, int r22, uq uqVar) {
        int j4 = j(bArr, r22, uqVar);
        int r02 = uqVar.f2218a;
        if (r02 < 0) {
            throw h.f();
        }
        if (r02 == 0) {
            uqVar.f2220c = "";
            return j4;
        }
        uqVar.f2220c = x1.d(bArr, j4, r02);
        return j4 + r02;
    }

    static int i(int r9, byte[] bArr, int r11, int r12, j1 j1Var, uq uqVar) {
        if ((r9 >>> 3) == 0) {
            throw h.c();
        }
        int r02 = r9 & 7;
        if (r02 == 0) {
            int m4 = m(bArr, r11, uqVar);
            j1Var.h(r9, Long.valueOf(uqVar.f2219b));
            return m4;
        }
        if (r02 == 1) {
            j1Var.h(r9, Long.valueOf(n(bArr, r11)));
            return r11 + 8;
        }
        if (r02 == 2) {
            int j4 = j(bArr, r11, uqVar);
            int r122 = uqVar.f2218a;
            if (r122 < 0) {
                throw h.f();
            }
            if (r122 > bArr.length - j4) {
                throw h.i();
            }
            j1Var.h(r9, r122 == 0 ? hr.f1739f : hr.B(bArr, j4, r122));
            return j4 + r122;
        }
        if (r02 != 3) {
            if (r02 != 5) {
                throw h.c();
            }
            j1Var.h(r9, Integer.valueOf(b(bArr, r11)));
            return r11 + 4;
        }
        int r03 = (r9 & (-8)) | 4;
        j1 e5 = j1.e();
        int r13 = 0;
        while (true) {
            if (r11 >= r12) {
                break;
            }
            int j5 = j(bArr, r11, uqVar);
            int r112 = uqVar.f2218a;
            r13 = r112;
            if (r112 == r03) {
                r11 = j5;
                break;
            }
            int i4 = i(r13, bArr, j5, r12, e5, uqVar);
            r13 = r112;
            r11 = i4;
        }
        if (r11 > r12 || r13 != r03) {
            throw h.g();
        }
        j1Var.h(r9, e5);
        return r11;
    }

    static int j(byte[] bArr, int r22, uq uqVar) {
        int r02 = r22 + 1;
        byte b5 = bArr[r22];
        if (b5 < 0) {
            return k(b5, bArr, r02, uqVar);
        }
        uqVar.f2218a = b5;
        return r02;
    }

    static int k(int r12, byte[] bArr, int r32, uq uqVar) {
        int r22;
        int r23;
        int r13 = r12 & 127;
        int r02 = r32 + 1;
        byte b5 = bArr[r32];
        if (b5 < 0) {
            int r14 = r13 | ((b5 & Byte.MAX_VALUE) << 7);
            int r33 = r02 + 1;
            byte b6 = bArr[r02];
            if (b6 >= 0) {
                r22 = b6 << 14;
            } else {
                r13 = r14 | ((b6 & Byte.MAX_VALUE) << 14);
                r02 = r33 + 1;
                byte b7 = bArr[r33];
                if (b7 >= 0) {
                    r23 = b7 << 21;
                } else {
                    r14 = r13 | ((b7 & Byte.MAX_VALUE) << 21);
                    r33 = r02 + 1;
                    byte b8 = bArr[r02];
                    if (b8 >= 0) {
                        r22 = b8 << 28;
                    } else {
                        int r15 = r14 | ((b8 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int r03 = r33 + 1;
                            if (bArr[r33] >= 0) {
                                uqVar.f2218a = r15;
                                return r03;
                            }
                            r33 = r03;
                        }
                    }
                }
            }
            uqVar.f2218a = r14 | r22;
            return r33;
        }
        r23 = b5 << 7;
        uqVar.f2218a = r13 | r23;
        return r02;
    }

    static int l(int r22, byte[] bArr, int r4, int r5, e eVar, uq uqVar) {
        ls lsVar = (ls) eVar;
        int j4 = j(bArr, r4, uqVar);
        while (true) {
            lsVar.q(uqVar.f2218a);
            if (j4 >= r5) {
                break;
            }
            int j5 = j(bArr, j4, uqVar);
            if (r22 != uqVar.f2218a) {
                break;
            }
            j4 = j(bArr, j5, uqVar);
        }
        return j4;
    }

    static int m(byte[] bArr, int r10, uq uqVar) {
        int r02 = r10 + 1;
        long j4 = bArr[r10];
        if (j4 >= 0) {
            uqVar.f2219b = j4;
            return r02;
        }
        int r102 = r02 + 1;
        byte b5 = bArr[r02];
        long j5 = (j4 & 127) | ((b5 & Byte.MAX_VALUE) << 7);
        int r32 = 7;
        while (b5 < 0) {
            int r03 = r102 + 1;
            r32 += 7;
            j5 |= (r10 & Byte.MAX_VALUE) << r32;
            b5 = bArr[r102];
            r102 = r03;
        }
        uqVar.f2219b = j5;
        return r102;
    }

    static long n(byte[] bArr, int r8) {
        return ((bArr[r8 + 7] & 255) << 56) | (bArr[r8] & 255) | ((bArr[r8 + 1] & 255) << 8) | ((bArr[r8 + 2] & 255) << 16) | ((bArr[r8 + 3] & 255) << 24) | ((bArr[r8 + 4] & 255) << 32) | ((bArr[r8 + 5] & 255) << 40) | ((bArr[r8 + 6] & 255) << 48);
    }
}
