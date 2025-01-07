package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
final class q6 implements t6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f2053a;

    q6(int r4) {
        if (r4 == 16 || r4 == 32) {
            this.f2053a = r4;
            return;
        }
        throw new InvalidAlgorithmParameterException("Unsupported key length: " + r4);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final int a() {
        return this.f2053a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final byte[] b() {
        int r02 = this.f2053a;
        if (r02 == 16) {
            return e7.f1547d;
        }
        if (r02 == 32) {
            return e7.f1548e;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.t6
    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        if (length == this.f2053a) {
            return new k5(bArr, false).a(bArr2, bArr3, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + length);
    }
}
