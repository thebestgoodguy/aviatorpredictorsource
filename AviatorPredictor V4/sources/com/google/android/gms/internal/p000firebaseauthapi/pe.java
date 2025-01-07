package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class pe implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final k5 f2019a;

    public pe(byte[] bArr) {
        if (!u5.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f2019a = new k5(bArr, true);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f2019a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
