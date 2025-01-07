package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p5 extends m5 {
    public p5(byte[] bArr, int r22) {
        super(bArr, r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    final int a() {
        return 24;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    final int[] b(int[] r12, int r13) {
        int length = r12.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] r4 = new int[16];
        int[] r02 = new int[16];
        i5.b(r02, this.f1920a);
        r02[12] = r12[0];
        r02[13] = r12[1];
        r02[14] = r12[2];
        r02[15] = r12[3];
        i5.c(r02);
        r02[4] = r02[12];
        r02[5] = r02[13];
        r02[6] = r02[14];
        r02[7] = r02[15];
        i5.b(r4, Arrays.copyOf(r02, 8));
        r4[12] = r13;
        r4[13] = 0;
        r4[14] = r12[4];
        r4[15] = r12[5];
        return r4;
    }
}
