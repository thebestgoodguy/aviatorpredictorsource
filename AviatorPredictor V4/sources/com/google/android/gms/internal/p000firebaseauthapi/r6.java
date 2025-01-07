package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class r6 implements t6 {
    r6() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final int a() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final byte[] b() {
        return e7.f1549f;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            return new n5(bArr).c(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
    }
}
