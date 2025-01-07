package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Objects;

/* loaded from: classes.dex */
final class pr extends tr {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f2048d;

    /* renamed from: e, reason: collision with root package name */
    private final int f2049e;

    /* renamed from: f, reason: collision with root package name */
    private int f2050f;

    pr(byte[] bArr, int r4, int r5) {
        super(null);
        Objects.requireNonNull(bArr, "buffer");
        int length = bArr.length;
        if (((length - r5) | r5) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(r5)));
        }
        this.f2048d = bArr;
        this.f2050f = 0;
        this.f2049e = r5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void A(int r12, int r22) {
        B(r12 << 3);
        B(r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void B(int r5) {
        while ((r5 & (-128)) != 0) {
            try {
                byte[] bArr = this.f2048d;
                int r12 = this.f2050f;
                this.f2050f = r12 + 1;
                bArr[r12] = (byte) ((r5 & 127) | 128);
                r5 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), 1), e5);
            }
        }
        byte[] bArr2 = this.f2048d;
        int r13 = this.f2050f;
        this.f2050f = r13 + 1;
        bArr2[r13] = (byte) r5;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void C(int r12, long j4) {
        B(r12 << 3);
        D(j4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void D(long j4) {
        boolean z4;
        z4 = tr.f2178c;
        if (z4 && this.f2049e - this.f2050f >= 10) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.f2048d;
                int r6 = this.f2050f;
                this.f2050f = r6 + 1;
                s1.s(bArr, r6, (byte) ((((int) j4) & 127) | 128));
                j4 >>>= 7;
            }
            byte[] bArr2 = this.f2048d;
            int r12 = this.f2050f;
            this.f2050f = r12 + 1;
            s1.s(bArr2, r12, (byte) j4);
            return;
        }
        while ((j4 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f2048d;
                int r62 = this.f2050f;
                this.f2050f = r62 + 1;
                bArr3[r62] = (byte) ((((int) j4) & 127) | 128);
                j4 >>>= 7;
            } catch (IndexOutOfBoundsException e5) {
                throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), 1), e5);
            }
        }
        byte[] bArr4 = this.f2048d;
        int r13 = this.f2050f;
        this.f2050f = r13 + 1;
        bArr4[r13] = (byte) j4;
    }

    public final void I(byte[] bArr, int r5, int r6) {
        try {
            System.arraycopy(bArr, 0, this.f2048d, this.f2050f, r6);
            this.f2050f += r6;
        } catch (IndexOutOfBoundsException e5) {
            throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), Integer.valueOf(r6)), e5);
        }
    }

    public final void J(String str) {
        int r02 = this.f2050f;
        try {
            int f5 = tr.f(str.length() * 3);
            int f6 = tr.f(str.length());
            if (f6 != f5) {
                B(x1.c(str));
                byte[] bArr = this.f2048d;
                int r22 = this.f2050f;
                this.f2050f = x1.b(str, bArr, r22, this.f2049e - r22);
                return;
            }
            int r12 = r02 + f6;
            this.f2050f = r12;
            int b5 = x1.b(str, this.f2048d, r12, this.f2049e - r12);
            this.f2050f = r02;
            B((b5 - r02) - f6);
            this.f2050f = b5;
        } catch (w1 e5) {
            this.f2050f = r02;
            k(str, e5);
        } catch (IndexOutOfBoundsException e6) {
            throw new qr(e6);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr, com.google.android.gms.internal.p000firebaseauthapi.xq
    public final void a(byte[] bArr, int r22, int r32) {
        I(bArr, 0, r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void m() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void n(byte b5) {
        try {
            byte[] bArr = this.f2048d;
            int r12 = this.f2050f;
            this.f2050f = r12 + 1;
            bArr[r12] = b5;
        } catch (IndexOutOfBoundsException e5) {
            throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void o(int r12, boolean z4) {
        B(r12 << 3);
        n(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void p(int r12, hr hrVar) {
        B((r12 << 3) | 2);
        B(hrVar.q());
        hrVar.w(this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final int q() {
        return this.f2049e - this.f2050f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void r(int r12, int r22) {
        B((r12 << 3) | 5);
        s(r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void s(int r5) {
        try {
            byte[] bArr = this.f2048d;
            int r12 = this.f2050f;
            int r22 = r12 + 1;
            this.f2050f = r22;
            bArr[r12] = (byte) (r5 & 255);
            int r13 = r22 + 1;
            this.f2050f = r13;
            bArr[r22] = (byte) ((r5 >> 8) & 255);
            int r23 = r13 + 1;
            this.f2050f = r23;
            bArr[r13] = (byte) ((r5 >> 16) & 255);
            this.f2050f = r23 + 1;
            bArr[r23] = (byte) ((r5 >> 24) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void t(int r12, long j4) {
        B((r12 << 3) | 1);
        u(j4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void u(long j4) {
        try {
            byte[] bArr = this.f2048d;
            int r12 = this.f2050f;
            int r22 = r12 + 1;
            this.f2050f = r22;
            bArr[r12] = (byte) (((int) j4) & 255);
            int r13 = r22 + 1;
            this.f2050f = r13;
            bArr[r22] = (byte) (((int) (j4 >> 8)) & 255);
            int r23 = r13 + 1;
            this.f2050f = r23;
            bArr[r13] = (byte) (((int) (j4 >> 16)) & 255);
            int r14 = r23 + 1;
            this.f2050f = r14;
            bArr[r23] = (byte) (((int) (j4 >> 24)) & 255);
            int r24 = r14 + 1;
            this.f2050f = r24;
            bArr[r14] = (byte) (((int) (j4 >> 32)) & 255);
            int r15 = r24 + 1;
            this.f2050f = r15;
            bArr[r24] = (byte) (((int) (j4 >> 40)) & 255);
            int r25 = r15 + 1;
            this.f2050f = r25;
            bArr[r15] = (byte) (((int) (j4 >> 48)) & 255);
            this.f2050f = r25 + 1;
            bArr[r25] = (byte) (((int) (j4 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e5) {
            throw new qr(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f2050f), Integer.valueOf(this.f2049e), 1), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void v(int r12, int r22) {
        B(r12 << 3);
        w(r22);
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
        J(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final void z(int r12, int r22) {
        B((r12 << 3) | r22);
    }
}
