package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class le implements of {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f1875d = new ke();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKeySpec f1876a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1877b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1878c;

    public le(byte[] bArr, int r4) {
        if (!u5.a(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        wf.b(bArr.length);
        this.f1876a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f1875d.get()).getBlockSize();
        this.f1878c = blockSize;
        if (r4 < 12 || r4 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f1877b = r4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.of
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        int r12 = this.f1877b;
        if (length < r12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[r12];
        System.arraycopy(bArr, 0, bArr2, 0, r12);
        int r6 = this.f1877b;
        int r02 = length - r6;
        byte[] bArr3 = new byte[r02];
        Cipher cipher = (Cipher) f1875d.get();
        byte[] bArr4 = new byte[this.f1878c];
        System.arraycopy(bArr2, 0, bArr4, 0, this.f1877b);
        cipher.init(2, this.f1876a, new IvParameterSpec(bArr4));
        if (cipher.doFinal(bArr, r6, r02, bArr3, 0) == r02) {
            return bArr3;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
