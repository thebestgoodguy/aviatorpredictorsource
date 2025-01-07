package com.google.protobuf;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import java.util.Objects;

/* loaded from: classes.dex */
final class f {

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2861a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f2861a = r02;
            try {
                r02[b2.b.f2802g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2861a[b2.b.f2803h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2861a[b2.b.f2804i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2861a[b2.b.f2805j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2861a[b2.b.f2806k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2861a[b2.b.f2814s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2861a[b2.b.f2807l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2861a[b2.b.f2817v.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2861a[b2.b.f2808m.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2861a[b2.b.f2816u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2861a[b2.b.f2809n.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2861a[b2.b.f2818w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2861a[b2.b.f2819x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2861a[b2.b.f2815t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2861a[b2.b.f2813r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2861a[b2.b.f2810o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2861a[b2.b.f2811p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2861a[b2.b.f2812q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2862a;

        /* renamed from: b, reason: collision with root package name */
        public long f2863b;

        /* renamed from: c, reason: collision with root package name */
        public Object f2864c;

        /* renamed from: d, reason: collision with root package name */
        public final r f2865d;

        b(r rVar) {
            Objects.requireNonNull(rVar);
            this.f2865d = rVar;
        }
    }

    static int A(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, r4, bVar);
        while (true) {
            c0Var.r(k.b(bVar.f2862a));
            if (I >= r5) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    static int B(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int L = L(bArr, r4, bVar);
        while (true) {
            m0Var.s(k.c(bVar.f2863b));
            if (L >= r5) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    static int C(byte[] bArr, int r4, b bVar) {
        int I = I(bArr, r4, bVar);
        int r02 = bVar.f2862a;
        if (r02 < 0) {
            throw e0.g();
        }
        if (r02 == 0) {
            bVar.f2864c = "";
            return I;
        }
        bVar.f2864c = new String(bArr, I, r02, d0.f2847b);
        return I + r02;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x002e -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int D(int r4, byte[] r5, int r6, int r7, com.google.protobuf.d0.i<?> r8, com.google.protobuf.f.b r9) {
        /*
            int r6 = I(r5, r6, r9)
            int r0 = r9.f2862a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r8.add(r1)
            goto L1b
        L10:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f2847b
            r2.<init>(r5, r6, r0, r3)
        L17:
            r8.add(r2)
            int r6 = r6 + r0
        L1b:
            if (r6 >= r7) goto L3e
            int r0 = I(r5, r6, r9)
            int r2 = r9.f2862a
            if (r4 == r2) goto L26
            goto L3e
        L26:
            int r6 = I(r5, r0, r9)
            int r0 = r9.f2862a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.protobuf.d0.f2847b
            r2.<init>(r5, r6, r0, r3)
            goto L17
        L39:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.protobuf.e0 r4 = com.google.protobuf.e0.g()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.D(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0036 -> B:5:0x000c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int E(int r5, byte[] r6, int r7, int r8, com.google.protobuf.d0.i<?> r9, com.google.protobuf.f.b r10) {
        /*
            int r7 = I(r6, r7, r10)
            int r0 = r10.f2862a
            if (r0 < 0) goto L59
            java.lang.String r1 = ""
            if (r0 != 0) goto L10
        Lc:
            r9.add(r1)
            goto L23
        L10:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L54
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f2847b
            r3.<init>(r6, r7, r0, r4)
        L1f:
            r9.add(r3)
            r7 = r2
        L23:
            if (r7 >= r8) goto L53
            int r0 = I(r6, r7, r10)
            int r2 = r10.f2862a
            if (r5 == r2) goto L2e
            goto L53
        L2e:
            int r7 = I(r6, r0, r10)
            int r0 = r10.f2862a
            if (r0 < 0) goto L4e
            if (r0 != 0) goto L39
            goto Lc
        L39:
            int r2 = r7 + r0
            boolean r3 = com.google.protobuf.a2.t(r6, r7, r2)
            if (r3 == 0) goto L49
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.protobuf.d0.f2847b
            r3.<init>(r6, r7, r0, r4)
            goto L1f
        L49:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L4e:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        L53:
            return r7
        L54:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.d()
            throw r5
        L59:
            com.google.protobuf.e0 r5 = com.google.protobuf.e0.g()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.E(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    static int F(byte[] bArr, int r22, b bVar) {
        int I = I(bArr, r22, bVar);
        int r02 = bVar.f2862a;
        if (r02 < 0) {
            throw e0.g();
        }
        if (r02 == 0) {
            bVar.f2864c = "";
            return I;
        }
        bVar.f2864c = a2.h(bArr, I, r02);
        return I + r02;
    }

    static int G(int r9, byte[] bArr, int r11, int r12, w1 w1Var, b bVar) {
        if (b2.a(r9) == 0) {
            throw e0.c();
        }
        int b5 = b2.b(r9);
        if (b5 == 0) {
            int L = L(bArr, r11, bVar);
            w1Var.m(r9, Long.valueOf(bVar.f2863b));
            return L;
        }
        if (b5 == 1) {
            w1Var.m(r9, Long.valueOf(j(bArr, r11)));
            return r11 + 8;
        }
        if (b5 == 2) {
            int I = I(bArr, r11, bVar);
            int r122 = bVar.f2862a;
            if (r122 < 0) {
                throw e0.g();
            }
            if (r122 > bArr.length - I) {
                throw e0.m();
            }
            w1Var.m(r9, r122 == 0 ? j.f2914f : j.x(bArr, I, r122));
            return I + r122;
        }
        if (b5 != 3) {
            if (b5 != 5) {
                throw e0.c();
            }
            w1Var.m(r9, Integer.valueOf(h(bArr, r11)));
            return r11 + 4;
        }
        w1 j4 = w1.j();
        int r7 = (r9 & (-8)) | 4;
        int r02 = 0;
        while (true) {
            if (r11 >= r12) {
                break;
            }
            int I2 = I(bArr, r11, bVar);
            int r112 = bVar.f2862a;
            r02 = r112;
            if (r112 == r7) {
                r11 = I2;
                break;
            }
            int G = G(r02, bArr, I2, r12, j4, bVar);
            r02 = r112;
            r11 = G;
        }
        if (r11 > r12 || r02 != r7) {
            throw e0.h();
        }
        w1Var.m(r9, j4);
        return r11;
    }

    static int H(int r12, byte[] bArr, int r32, b bVar) {
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
                                bVar.f2862a = r15;
                                return r03;
                            }
                            r33 = r03;
                        }
                    }
                }
            }
            bVar.f2862a = r14 | r22;
            return r33;
        }
        r23 = b5 << 7;
        bVar.f2862a = r13 | r23;
        return r02;
    }

    static int I(byte[] bArr, int r22, b bVar) {
        int r02 = r22 + 1;
        byte b5 = bArr[r22];
        if (b5 < 0) {
            return H(b5, bArr, r02, bVar);
        }
        bVar.f2862a = b5;
        return r02;
    }

    static int J(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, r4, bVar);
        while (true) {
            c0Var.r(bVar.f2862a);
            if (I >= r5) {
                break;
            }
            int I2 = I(bArr, I, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            I = I(bArr, I2, bVar);
        }
        return I;
    }

    static int K(long j4, byte[] bArr, int r10, b bVar) {
        int r02 = r10 + 1;
        byte b5 = bArr[r10];
        long j5 = (j4 & 127) | ((b5 & Byte.MAX_VALUE) << 7);
        int r12 = 7;
        while (b5 < 0) {
            int r102 = r02 + 1;
            byte b6 = bArr[r02];
            r12 += 7;
            j5 |= (b6 & Byte.MAX_VALUE) << r12;
            r02 = r102;
            b5 = b6;
        }
        bVar.f2863b = j5;
        return r02;
    }

    static int L(byte[] bArr, int r6, b bVar) {
        int r02 = r6 + 1;
        long j4 = bArr[r6];
        if (j4 < 0) {
            return K(j4, bArr, r02, bVar);
        }
        bVar.f2863b = j4;
        return r02;
    }

    static int M(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int L = L(bArr, r4, bVar);
        while (true) {
            m0Var.s(bVar.f2863b);
            if (L >= r5) {
                break;
            }
            int I = I(bArr, L, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            L = L(bArr, I, bVar);
        }
        return L;
    }

    static int N(int r22, byte[] bArr, int r4, int r5, b bVar) {
        if (b2.a(r22) == 0) {
            throw e0.c();
        }
        int b5 = b2.b(r22);
        if (b5 == 0) {
            return L(bArr, r4, bVar);
        }
        if (b5 == 1) {
            return r4 + 8;
        }
        if (b5 == 2) {
            return I(bArr, r4, bVar) + bVar.f2862a;
        }
        if (b5 != 3) {
            if (b5 == 5) {
                return r4 + 4;
            }
            throw e0.c();
        }
        int r23 = (r22 & (-8)) | 4;
        int r02 = 0;
        while (r4 < r5) {
            r4 = I(bArr, r4, bVar);
            r02 = bVar.f2862a;
            if (r02 == r23) {
                break;
            }
            r4 = N(r02, bArr, r4, r5, bVar);
        }
        if (r4 > r5 || r02 != r23) {
            throw e0.h();
        }
        return r4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r12.f2863b == 0) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0012, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002c, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0013, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000e, code lost:
    
        if (r12.f2863b != 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0010, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        r11.s(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
    
        if (r9 >= r10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        r0 = I(r8, r9, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r7 == r12.f2862a) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r9 = L(r8, r0, r12);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0029 -> B:3:0x0010). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int a(int r7, byte[] r8, int r9, int r10, com.google.protobuf.d0.i<?> r11, com.google.protobuf.f.b r12) {
        /*
            com.google.protobuf.h r11 = (com.google.protobuf.h) r11
            int r9 = L(r8, r9, r12)
            long r0 = r12.f2863b
            r2 = 1
            r3 = 0
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
        L10:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            r11.s(r0)
            if (r9 >= r10) goto L2c
            int r0 = I(r8, r9, r12)
            int r1 = r12.f2862a
            if (r7 == r1) goto L21
            goto L2c
        L21:
            int r9 = L(r8, r0, r12)
            long r0 = r12.f2863b
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L12
            goto L10
        L2c:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.a(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    static int b(byte[] bArr, int r32, b bVar) {
        int I = I(bArr, r32, bVar);
        int r02 = bVar.f2862a;
        if (r02 < 0) {
            throw e0.g();
        }
        if (r02 > bArr.length - I) {
            throw e0.m();
        }
        if (r02 == 0) {
            bVar.f2864c = j.f2914f;
            return I;
        }
        bVar.f2864c = j.x(bArr, I, r02);
        return I + r02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r2 == r7.f2862a) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        r4 = I(r3, r0, r7);
        r0 = r7.f2862a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        if (r0 < 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r0 > (r3.length - r4)) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r0 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0014, code lost:
    
        r6.add(com.google.protobuf.j.x(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        throw com.google.protobuf.e0.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003f, code lost:
    
        throw com.google.protobuf.e0.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x001c, code lost:
    
        r6.add(com.google.protobuf.j.x(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000c, code lost:
    
        if (r0 == 0) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        r6.add(com.google.protobuf.j.f2914f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r4 >= r5) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0 = I(r3, r4, r7);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0033 -> B:6:0x000e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int c(int r2, byte[] r3, int r4, int r5, com.google.protobuf.d0.i<?> r6, com.google.protobuf.f.b r7) {
        /*
            int r4 = I(r3, r4, r7)
            int r0 = r7.f2862a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto L14
        Le:
            com.google.protobuf.j r0 = com.google.protobuf.j.f2914f
            r6.add(r0)
            goto L1c
        L14:
            com.google.protobuf.j r1 = com.google.protobuf.j.x(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L1c:
            if (r4 >= r5) goto L40
            int r0 = I(r3, r4, r7)
            int r1 = r7.f2862a
            if (r2 == r1) goto L27
            goto L40
        L27:
            int r4 = I(r3, r0, r7)
            int r0 = r7.f2862a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto L14
            goto Le
        L36:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L3b:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        L40:
            return r4
        L41:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.m()
            throw r2
        L46:
            com.google.protobuf.e0 r2 = com.google.protobuf.e0.g()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.c(int, byte[], int, int, com.google.protobuf.d0$i, com.google.protobuf.f$b):int");
    }

    static double d(byte[] bArr, int r12) {
        return Double.longBitsToDouble(j(bArr, r12));
    }

    static int e(int r32, byte[] bArr, int r5, int r6, d0.i<?> iVar, b bVar) {
        o oVar = (o) iVar;
        oVar.r(d(bArr, r5));
        int r52 = r5 + 8;
        while (r52 < r6) {
            int I = I(bArr, r52, bVar);
            if (r32 != bVar.f2862a) {
                break;
            }
            oVar.r(d(bArr, I));
            r52 = I + 8;
        }
        return r52;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int f(int r7, byte[] r8, int r9, int r10, com.google.protobuf.a0.c<?, ?> r11, com.google.protobuf.a0.e<?, ?> r12, com.google.protobuf.v1<com.google.protobuf.w1, com.google.protobuf.w1> r13, com.google.protobuf.f.b r14) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.f.f(int, byte[], int, int, com.google.protobuf.a0$c, com.google.protobuf.a0$e, com.google.protobuf.v1, com.google.protobuf.f$b):int");
    }

    static int g(int r8, byte[] bArr, int r10, int r11, Object obj, v0 v0Var, v1<w1, w1> v1Var, b bVar) {
        a0.e a5 = bVar.f2865d.a(v0Var, r8 >>> 3);
        if (a5 == null) {
            return G(r8, bArr, r10, r11, y0.w(obj), bVar);
        }
        a0.c cVar = (a0.c) obj;
        cVar.T();
        return f(r8, bArr, r10, r11, cVar, a5, v1Var, bVar);
    }

    static int h(byte[] bArr, int r32) {
        return ((bArr[r32 + 3] & 255) << 24) | (bArr[r32] & 255) | ((bArr[r32 + 1] & 255) << 8) | ((bArr[r32 + 2] & 255) << 16);
    }

    static int i(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        c0Var.r(h(bArr, r4));
        int r42 = r4 + 4;
        while (r42 < r5) {
            int I = I(bArr, r42, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            c0Var.r(h(bArr, I));
            r42 = I + 4;
        }
        return r42;
    }

    static long j(byte[] bArr, int r8) {
        return ((bArr[r8 + 7] & 255) << 56) | (bArr[r8] & 255) | ((bArr[r8 + 1] & 255) << 8) | ((bArr[r8 + 2] & 255) << 16) | ((bArr[r8 + 3] & 255) << 24) | ((bArr[r8 + 4] & 255) << 32) | ((bArr[r8 + 5] & 255) << 40) | ((bArr[r8 + 6] & 255) << 48);
    }

    static int k(int r32, byte[] bArr, int r5, int r6, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        m0Var.s(j(bArr, r5));
        int r52 = r5 + 8;
        while (r52 < r6) {
            int I = I(bArr, r52, bVar);
            if (r32 != bVar.f2862a) {
                break;
            }
            m0Var.s(j(bArr, I));
            r52 = I + 8;
        }
        return r52;
    }

    static float l(byte[] bArr, int r12) {
        return Float.intBitsToFloat(h(bArr, r12));
    }

    static int m(int r22, byte[] bArr, int r4, int r5, d0.i<?> iVar, b bVar) {
        y yVar = (y) iVar;
        yVar.r(l(bArr, r4));
        int r42 = r4 + 4;
        while (r42 < r5) {
            int I = I(bArr, r42, bVar);
            if (r22 != bVar.f2862a) {
                break;
            }
            yVar.r(l(bArr, I));
            r42 = I + 4;
        }
        return r42;
    }

    static int n(n1 n1Var, byte[] bArr, int r10, int r11, int r12, b bVar) {
        y0 y0Var = (y0) n1Var;
        Object g5 = y0Var.g();
        int d02 = y0Var.d0(g5, bArr, r10, r11, r12, bVar);
        y0Var.i(g5);
        bVar.f2864c = g5;
        return d02;
    }

    static int o(n1 n1Var, int r8, byte[] bArr, int r10, int r11, d0.i<?> iVar, b bVar) {
        int r02 = (r8 & (-8)) | 4;
        int n4 = n(n1Var, bArr, r10, r11, r02, bVar);
        while (true) {
            iVar.add(bVar.f2864c);
            if (n4 >= r11) {
                break;
            }
            int I = I(bArr, n4, bVar);
            if (r8 != bVar.f2862a) {
                break;
            }
            n4 = n(n1Var, bArr, I, r11, r02, bVar);
        }
        return n4;
    }

    static int p(n1 n1Var, byte[] bArr, int r8, int r9, b bVar) {
        int r02 = r8 + 1;
        int r82 = bArr[r8];
        if (r82 < 0) {
            r02 = H(r82, bArr, r02, bVar);
            r82 = bVar.f2862a;
        }
        int r32 = r02;
        if (r82 < 0 || r82 > r9 - r32) {
            throw e0.m();
        }
        Object g5 = n1Var.g();
        int r83 = r82 + r32;
        n1Var.e(g5, bArr, r32, r83, bVar);
        n1Var.i(g5);
        bVar.f2864c = g5;
        return r83;
    }

    static int q(n1<?> n1Var, int r32, byte[] bArr, int r5, int r6, d0.i<?> iVar, b bVar) {
        int p4 = p(n1Var, bArr, r5, r6, bVar);
        while (true) {
            iVar.add(bVar.f2864c);
            if (p4 >= r6) {
                break;
            }
            int I = I(bArr, p4, bVar);
            if (r32 != bVar.f2862a) {
                break;
            }
            p4 = p(n1Var, bArr, I, r6, bVar);
        }
        return p4;
    }

    static int r(byte[] bArr, int r7, d0.i<?> iVar, b bVar) {
        h hVar = (h) iVar;
        int I = I(bArr, r7, bVar);
        int r02 = bVar.f2862a + I;
        while (I < r02) {
            I = L(bArr, I, bVar);
            hVar.s(bVar.f2863b != 0);
        }
        if (I == r02) {
            return I;
        }
        throw e0.m();
    }

    static int s(byte[] bArr, int r32, d0.i<?> iVar, b bVar) {
        o oVar = (o) iVar;
        int I = I(bArr, r32, bVar);
        int r5 = bVar.f2862a + I;
        while (I < r5) {
            oVar.r(d(bArr, I));
            I += 8;
        }
        if (I == r5) {
            return I;
        }
        throw e0.m();
    }

    static int t(byte[] bArr, int r22, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, r22, bVar);
        int r4 = bVar.f2862a + I;
        while (I < r4) {
            c0Var.r(h(bArr, I));
            I += 4;
        }
        if (I == r4) {
            return I;
        }
        throw e0.m();
    }

    static int u(byte[] bArr, int r32, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, r32, bVar);
        int r5 = bVar.f2862a + I;
        while (I < r5) {
            m0Var.s(j(bArr, I));
            I += 8;
        }
        if (I == r5) {
            return I;
        }
        throw e0.m();
    }

    static int v(byte[] bArr, int r22, d0.i<?> iVar, b bVar) {
        y yVar = (y) iVar;
        int I = I(bArr, r22, bVar);
        int r4 = bVar.f2862a + I;
        while (I < r4) {
            yVar.r(l(bArr, I));
            I += 4;
        }
        if (I == r4) {
            return I;
        }
        throw e0.m();
    }

    static int w(byte[] bArr, int r32, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, r32, bVar);
        int r02 = bVar.f2862a + I;
        while (I < r02) {
            I = I(bArr, I, bVar);
            c0Var.r(k.b(bVar.f2862a));
        }
        if (I == r02) {
            return I;
        }
        throw e0.m();
    }

    static int x(byte[] bArr, int r4, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, r4, bVar);
        int r02 = bVar.f2862a + I;
        while (I < r02) {
            I = L(bArr, I, bVar);
            m0Var.s(k.c(bVar.f2863b));
        }
        if (I == r02) {
            return I;
        }
        throw e0.m();
    }

    static int y(byte[] bArr, int r32, d0.i<?> iVar, b bVar) {
        c0 c0Var = (c0) iVar;
        int I = I(bArr, r32, bVar);
        int r02 = bVar.f2862a + I;
        while (I < r02) {
            I = I(bArr, I, bVar);
            c0Var.r(bVar.f2862a);
        }
        if (I == r02) {
            return I;
        }
        throw e0.m();
    }

    static int z(byte[] bArr, int r4, d0.i<?> iVar, b bVar) {
        m0 m0Var = (m0) iVar;
        int I = I(bArr, r4, bVar);
        int r02 = bVar.f2862a + I;
        while (I < r02) {
            I = L(bArr, I, bVar);
            m0Var.s(bVar.f2863b);
        }
        if (I == r02) {
            return I;
        }
        throw e0.m();
    }
}
