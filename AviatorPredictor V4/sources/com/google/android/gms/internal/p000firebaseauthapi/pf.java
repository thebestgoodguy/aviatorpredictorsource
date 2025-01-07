package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class pf implements i8 {

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f2020a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f2021b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2022c;

    public pf(byte[] bArr) {
        wf.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f2020a = secretKeySpec;
        Cipher b5 = b();
        b5.init(1, secretKeySpec);
        byte[] b6 = re.b(b5.doFinal(new byte[16]));
        this.f2021b = b6;
        this.f2022c = re.b(b6);
    }

    private static Cipher b() {
        if (u5.a(1)) {
            return (Cipher) cf.f1455e.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i8
    public final byte[] a(byte[] bArr, int r10) {
        if (r10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher b5 = b();
        b5.init(1, this.f2020a);
        int length = bArr.length;
        int max = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] e5 = max * 16 == length ? se.e(bArr, (max - 1) * 16, this.f2021b, 0, 16) : se.d(re.a(Arrays.copyOfRange(bArr, (max - 1) * 16, length)), this.f2022c);
        byte[] bArr2 = new byte[16];
        for (int r6 = 0; r6 < max - 1; r6++) {
            bArr2 = b5.doFinal(se.e(bArr2, 0, bArr, r6 * 16, 16));
        }
        return Arrays.copyOf(b5.doFinal(se.d(e5, bArr2)), r10);
    }
}
