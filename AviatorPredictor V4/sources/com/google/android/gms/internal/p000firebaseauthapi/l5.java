package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class l5 extends m5 {
    public l5(byte[] bArr, int r22) {
        super(bArr, r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final int a() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m5
    public final int[] b(int[] r5, int r6) {
        int length = r5.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] r02 = new int[16];
        i5.b(r02, this.f1920a);
        r02[12] = r6;
        System.arraycopy(r5, 0, r02, 13, 3);
        return r02;
    }
}
