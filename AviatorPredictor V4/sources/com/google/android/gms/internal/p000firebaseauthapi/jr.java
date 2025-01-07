package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class jr extends lr {

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f1832f;

    /* renamed from: g, reason: collision with root package name */
    private int f1833g;

    /* renamed from: h, reason: collision with root package name */
    private int f1834h;

    /* renamed from: i, reason: collision with root package name */
    private int f1835i;

    /* renamed from: j, reason: collision with root package name */
    private int f1836j;

    /* renamed from: k, reason: collision with root package name */
    private int f1837k;

    /* synthetic */ jr(byte[] bArr, int r22, int r32, boolean z4, ir irVar) {
        super(null);
        this.f1837k = Integer.MAX_VALUE;
        this.f1832f = bArr;
        this.f1833g = r32;
        this.f1835i = 0;
    }

    private final void v() {
        int r02 = this.f1833g + this.f1834h;
        this.f1833g = r02;
        int r12 = this.f1837k;
        if (r02 <= r12) {
            this.f1834h = 0;
            return;
        }
        int r13 = r02 - r12;
        this.f1834h = r13;
        this.f1833g = r02 - r13;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final int a() {
        return this.f1835i;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final int b(int r22) {
        if (r22 < 0) {
            throw h.f();
        }
        int r23 = r22 + this.f1835i;
        if (r23 < 0) {
            throw h.g();
        }
        int r02 = this.f1837k;
        if (r23 > r02) {
            throw h.i();
        }
        this.f1837k = r23;
        v();
        return r02;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final int c() {
        if (i()) {
            this.f1836j = 0;
            return 0;
        }
        int q4 = q();
        this.f1836j = q4;
        if ((q4 >>> 3) != 0) {
            return q4;
        }
        throw h.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final hr d() {
        int q4 = q();
        if (q4 > 0) {
            int r12 = this.f1833g;
            int r22 = this.f1835i;
            if (q4 <= r12 - r22) {
                hr B = hr.B(this.f1832f, r22, q4);
                this.f1835i += q4;
                return B;
            }
        }
        if (q4 == 0) {
            return hr.f1739f;
        }
        if (q4 > 0) {
            int r13 = this.f1833g;
            int r23 = this.f1835i;
            if (q4 <= r13 - r23) {
                int r02 = q4 + r23;
                this.f1835i = r02;
                return hr.D(Arrays.copyOfRange(this.f1832f, r23, r02));
            }
        }
        if (q4 <= 0) {
            throw h.f();
        }
        throw h.i();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final String e() {
        int q4 = q();
        if (q4 > 0) {
            int r12 = this.f1833g;
            int r22 = this.f1835i;
            if (q4 <= r12 - r22) {
                String str = new String(this.f1832f, r22, q4, f.f1632b);
                this.f1835i += q4;
                return str;
            }
        }
        if (q4 == 0) {
            return "";
        }
        if (q4 < 0) {
            throw h.f();
        }
        throw h.i();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final String f() {
        int q4 = q();
        if (q4 > 0) {
            int r12 = this.f1833g;
            int r22 = this.f1835i;
            if (q4 <= r12 - r22) {
                String d5 = x1.d(this.f1832f, r22, q4);
                this.f1835i += q4;
                return d5;
            }
        }
        if (q4 == 0) {
            return "";
        }
        if (q4 <= 0) {
            throw h.f();
        }
        throw h.i();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final void g(int r22) {
        if (this.f1836j != r22) {
            throw h.b();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final void h(int r12) {
        this.f1837k = r12;
        v();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final boolean i() {
        return this.f1835i == this.f1833g;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final boolean j() {
        return s() != 0;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.lr
    public final boolean k(int r6) {
        int c5;
        int r02 = r6 & 7;
        int r12 = 0;
        if (r02 == 0) {
            if (this.f1833g - this.f1835i < 10) {
                while (r12 < 10) {
                    if (o() < 0) {
                        r12++;
                    }
                }
                throw h.e();
            }
            while (r12 < 10) {
                byte[] bArr = this.f1832f;
                int r32 = this.f1835i;
                this.f1835i = r32 + 1;
                if (bArr[r32] < 0) {
                    r12++;
                }
            }
            throw h.e();
            return true;
        }
        if (r02 == 1) {
            u(8);
            return true;
        }
        if (r02 == 2) {
            u(q());
            return true;
        }
        if (r02 != 3) {
            if (r02 == 4) {
                return false;
            }
            if (r02 != 5) {
                throw h.a();
            }
            u(4);
            return true;
        }
        do {
            c5 = c();
            if (c5 == 0) {
                break;
            }
        } while (k(c5));
        g(((r6 >>> 3) << 3) | 4);
        return true;
    }

    public final byte o() {
        int r02 = this.f1835i;
        if (r02 == this.f1833g) {
            throw h.i();
        }
        byte[] bArr = this.f1832f;
        this.f1835i = r02 + 1;
        return bArr[r02];
    }

    public final int p() {
        int r02 = this.f1835i;
        if (this.f1833g - r02 < 4) {
            throw h.i();
        }
        byte[] bArr = this.f1832f;
        this.f1835i = r02 + 4;
        return ((bArr[r02 + 3] & 255) << 24) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int q() {
        /*
            r5 = this;
            int r0 = r5.f1835i
            int r1 = r5.f1833g
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f1832f
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f1835i = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f1835i = r1
            return r0
        L6c:
            long r0 = r5.t()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.jr.q():int");
    }

    public final long r() {
        int r02 = this.f1835i;
        if (this.f1833g - r02 < 8) {
            throw h.i();
        }
        byte[] bArr = this.f1832f;
        this.f1835i = r02 + 8;
        return ((bArr[r02 + 7] & 255) << 56) | (bArr[r02] & 255) | ((bArr[r02 + 1] & 255) << 8) | ((bArr[r02 + 2] & 255) << 16) | ((bArr[r02 + 3] & 255) << 24) | ((bArr[r02 + 4] & 255) << 32) | ((bArr[r02 + 5] & 255) << 40) | ((bArr[r02 + 6] & 255) << 48);
    }

    public final long s() {
        long j4;
        long j5;
        long j6;
        long j7;
        int r02;
        int r03 = this.f1835i;
        int r12 = this.f1833g;
        if (r12 != r03) {
            byte[] bArr = this.f1832f;
            int r32 = r03 + 1;
            byte b5 = bArr[r03];
            if (b5 >= 0) {
                this.f1835i = r32;
                return b5;
            }
            if (r12 - r32 >= 9) {
                int r13 = r32 + 1;
                int r04 = b5 ^ (bArr[r32] << 7);
                if (r04 >= 0) {
                    int r33 = r13 + 1;
                    int r05 = r04 ^ (bArr[r13] << 14);
                    if (r05 >= 0) {
                        j4 = r05 ^ 16256;
                    } else {
                        r13 = r33 + 1;
                        int r06 = r05 ^ (bArr[r33] << 21);
                        if (r06 < 0) {
                            r02 = r06 ^ (-2080896);
                        } else {
                            r33 = r13 + 1;
                            long j8 = (bArr[r13] << 28) ^ r06;
                            if (j8 < 0) {
                                int r6 = r33 + 1;
                                long j9 = j8 ^ (bArr[r33] << 35);
                                if (j9 < 0) {
                                    j6 = -34093383808L;
                                } else {
                                    r33 = r6 + 1;
                                    j8 = j9 ^ (bArr[r6] << 42);
                                    if (j8 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        r6 = r33 + 1;
                                        j9 = j8 ^ (bArr[r33] << 49);
                                        if (j9 < 0) {
                                            j6 = -558586000294016L;
                                        } else {
                                            r33 = r6 + 1;
                                            j4 = (j9 ^ (bArr[r6] << 56)) ^ 71499008037633920L;
                                            if (j4 < 0) {
                                                r6 = r33 + 1;
                                                if (bArr[r33] >= 0) {
                                                    j5 = j4;
                                                    r13 = r6;
                                                    this.f1835i = r13;
                                                    return j5;
                                                }
                                            }
                                        }
                                    }
                                }
                                j5 = j6 ^ j9;
                                r13 = r6;
                                this.f1835i = r13;
                                return j5;
                            }
                            j7 = 266354560;
                            j4 = j8 ^ j7;
                        }
                    }
                    r13 = r33;
                    j5 = j4;
                    this.f1835i = r13;
                    return j5;
                }
                r02 = r04 ^ (-128);
                j5 = r02;
                this.f1835i = r13;
                return j5;
            }
        }
        return t();
    }

    final long t() {
        long j4 = 0;
        for (int r22 = 0; r22 < 64; r22 += 7) {
            j4 |= (r3 & Byte.MAX_VALUE) << r22;
            if ((o() & 128) == 0) {
                return j4;
            }
        }
        throw h.e();
    }

    public final void u(int r32) {
        if (r32 >= 0) {
            int r02 = this.f1833g;
            int r12 = this.f1835i;
            if (r32 <= r02 - r12) {
                this.f1835i = r12 + r32;
                return;
            }
        }
        if (r32 >= 0) {
            throw h.i();
        }
        throw h.f();
    }
}
