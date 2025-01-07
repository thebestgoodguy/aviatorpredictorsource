package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class rr extends or {

    /* renamed from: h, reason: collision with root package name */
    private final OutputStream f2106h;

    rr(OutputStream outputStream, int r22) {
        super(r22);
        this.f2106h = outputStream;
    }

    private final void N() {
        this.f2106h.write(this.f2006d, 0, this.f2008f);
        this.f2008f = 0;
    }

    private final void O(int r32) {
        if (this.f2007e - this.f2008f < r32) {
            N();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void A(int r22, int r32) {
        O(20);
        L(r22 << 3);
        L(r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void B(int r22) {
        O(5);
        L(r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void C(int r22, long j4) {
        O(20);
        L(r22 << 3);
        M(j4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void D(long j4) {
        O(10);
        M(j4);
    }

    public final void P(byte[] bArr, int r5, int r6) {
        int r52 = this.f2007e;
        int r02 = this.f2008f;
        int r53 = r52 - r02;
        if (r53 >= r6) {
            System.arraycopy(bArr, 0, this.f2006d, r02, r6);
            this.f2008f += r6;
        } else {
            System.arraycopy(bArr, 0, this.f2006d, r02, r53);
            r6 -= r53;
            this.f2008f = this.f2007e;
            this.f2009g += r53;
            N();
            if (r6 <= this.f2007e) {
                System.arraycopy(bArr, r53, this.f2006d, 0, r6);
                this.f2008f = r6;
            } else {
                this.f2106h.write(bArr, r53, r6);
            }
        }
        this.f2009g += r6;
    }

    public final void Q(String str) {
        int c5;
        try {
            int length = str.length() * 3;
            int f5 = tr.f(length);
            int r22 = f5 + length;
            int r32 = this.f2007e;
            if (r22 > r32) {
                byte[] bArr = new byte[length];
                int b5 = x1.b(str, bArr, 0, length);
                B(b5);
                P(bArr, 0, b5);
                return;
            }
            if (r22 > r32 - this.f2008f) {
                N();
            }
            int f6 = tr.f(str.length());
            int r23 = this.f2008f;
            try {
                if (f6 == f5) {
                    int r12 = r23 + f6;
                    this.f2008f = r12;
                    int b6 = x1.b(str, this.f2006d, r12, this.f2007e - r12);
                    this.f2008f = r23;
                    c5 = (b6 - r23) - f6;
                    L(c5);
                    this.f2008f = b6;
                } else {
                    c5 = x1.c(str);
                    L(c5);
                    this.f2008f = x1.b(str, this.f2006d, this.f2008f, c5);
                }
                this.f2009g += c5;
            } catch (w1 e5) {
                this.f2009g -= this.f2008f - r23;
                this.f2008f = r23;
                throw e5;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new qr(e6);
            }
        } catch (w1 e7) {
            k(str, e7);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr, com.google.android.gms.internal.p000firebaseauthapi.xq
    public final void a(byte[] bArr, int r22, int r32) {
        P(bArr, 0, r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void m() {
        if (this.f2008f > 0) {
            N();
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void n(byte b5) {
        if (this.f2008f == this.f2007e) {
            N();
        }
        I(b5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void o(int r22, boolean z4) {
        O(11);
        L(r22 << 3);
        I(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void p(int r12, hr hrVar) {
        B((r12 << 3) | 2);
        B(hrVar.q());
        hrVar.w(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void r(int r22, int r32) {
        O(14);
        L((r22 << 3) | 5);
        J(r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void s(int r22) {
        O(4);
        J(r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void t(int r22, long j4) {
        O(18);
        L((r22 << 3) | 1);
        K(j4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void u(long j4) {
        O(8);
        K(j4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void v(int r22, int r32) {
        O(20);
        L(r22 << 3);
        if (r32 >= 0) {
            L(r32);
        } else {
            M(r32);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void w(int r32) {
        if (r32 >= 0) {
            B(r32);
        } else {
            D(r32);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    final void x(int r32, e0 e0Var, q0 q0Var) {
        B((r32 << 3) | 2);
        rq rqVar = (rq) e0Var;
        int b5 = rqVar.b();
        if (b5 == -1) {
            b5 = q0Var.e(rqVar);
            rqVar.c(b5);
        }
        B(b5);
        q0Var.c(e0Var, this.f2179a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void y(int r12, String str) {
        B((r12 << 3) | 2);
        Q(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void z(int r12, int r22) {
        B((r12 << 3) | r22);
    }
}
