package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
abstract class or extends tr {

    /* renamed from: d, reason: collision with root package name */
    final byte[] f2006d;

    /* renamed from: e, reason: collision with root package name */
    final int f2007e;

    /* renamed from: f, reason: collision with root package name */
    int f2008f;

    /* renamed from: g, reason: collision with root package name */
    int f2009g;

    or(int r22) {
        super(null);
        if (r22 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(r22, 20)];
        this.f2006d = bArr;
        this.f2007e = bArr.length;
    }

    final void I(byte b5) {
        byte[] bArr = this.f2006d;
        int r12 = this.f2008f;
        this.f2008f = r12 + 1;
        bArr[r12] = b5;
        this.f2009g++;
    }

    final void J(int r5) {
        byte[] bArr = this.f2006d;
        int r12 = this.f2008f;
        int r22 = r12 + 1;
        this.f2008f = r22;
        bArr[r12] = (byte) (r5 & 255);
        int r13 = r22 + 1;
        this.f2008f = r13;
        bArr[r22] = (byte) ((r5 >> 8) & 255);
        int r23 = r13 + 1;
        this.f2008f = r23;
        bArr[r13] = (byte) ((r5 >> 16) & 255);
        this.f2008f = r23 + 1;
        bArr[r23] = (byte) ((r5 >> 24) & 255);
        this.f2009g += 4;
    }

    final void K(long j4) {
        byte[] bArr = this.f2006d;
        int r12 = this.f2008f;
        int r22 = r12 + 1;
        this.f2008f = r22;
        bArr[r12] = (byte) (j4 & 255);
        int r13 = r22 + 1;
        this.f2008f = r13;
        bArr[r22] = (byte) ((j4 >> 8) & 255);
        int r23 = r13 + 1;
        this.f2008f = r23;
        bArr[r13] = (byte) ((j4 >> 16) & 255);
        int r14 = r23 + 1;
        this.f2008f = r14;
        bArr[r23] = (byte) (255 & (j4 >> 24));
        int r24 = r14 + 1;
        this.f2008f = r24;
        bArr[r14] = (byte) (((int) (j4 >> 32)) & 255);
        int r15 = r24 + 1;
        this.f2008f = r15;
        bArr[r24] = (byte) (((int) (j4 >> 40)) & 255);
        int r25 = r15 + 1;
        this.f2008f = r25;
        bArr[r15] = (byte) (((int) (j4 >> 48)) & 255);
        this.f2008f = r25 + 1;
        bArr[r25] = (byte) (((int) (j4 >> 56)) & 255);
        this.f2009g += 8;
    }

    final void L(int r7) {
        boolean z4;
        z4 = tr.f2178c;
        if (!z4) {
            while ((r7 & (-128)) != 0) {
                byte[] bArr = this.f2006d;
                int r12 = this.f2008f;
                this.f2008f = r12 + 1;
                bArr[r12] = (byte) ((r7 & 127) | 128);
                this.f2009g++;
                r7 >>>= 7;
            }
            byte[] bArr2 = this.f2006d;
            int r13 = this.f2008f;
            this.f2008f = r13 + 1;
            bArr2[r13] = (byte) r7;
            this.f2009g++;
            return;
        }
        long j4 = this.f2008f;
        while ((r7 & (-128)) != 0) {
            byte[] bArr3 = this.f2006d;
            int r32 = this.f2008f;
            this.f2008f = r32 + 1;
            s1.s(bArr3, r32, (byte) ((r7 & 127) | 128));
            r7 >>>= 7;
        }
        byte[] bArr4 = this.f2006d;
        int r33 = this.f2008f;
        this.f2008f = r33 + 1;
        s1.s(bArr4, r33, (byte) r7);
        this.f2009g += (int) (this.f2008f - j4);
    }

    final void M(long j4) {
        boolean z4;
        z4 = tr.f2178c;
        if (!z4) {
            while ((j4 & (-128)) != 0) {
                byte[] bArr = this.f2006d;
                int r6 = this.f2008f;
                this.f2008f = r6 + 1;
                bArr[r6] = (byte) ((((int) j4) & 127) | 128);
                this.f2009g++;
                j4 >>>= 7;
            }
            byte[] bArr2 = this.f2006d;
            int r12 = this.f2008f;
            this.f2008f = r12 + 1;
            bArr2[r12] = (byte) j4;
            this.f2009g++;
            return;
        }
        long j5 = this.f2008f;
        while ((j4 & (-128)) != 0) {
            byte[] bArr3 = this.f2006d;
            int r8 = this.f2008f;
            this.f2008f = r8 + 1;
            s1.s(bArr3, r8, (byte) ((((int) j4) & 127) | 128));
            j4 >>>= 7;
        }
        byte[] bArr4 = this.f2006d;
        int r13 = this.f2008f;
        this.f2008f = r13 + 1;
        s1.s(bArr4, r13, (byte) j4);
        this.f2009g += (int) (this.f2008f - j5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.tr
    public final int q() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }
}
