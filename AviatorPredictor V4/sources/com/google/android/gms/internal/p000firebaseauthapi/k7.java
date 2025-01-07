package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class k7 implements m2 {

    /* renamed from: b, reason: collision with root package name */
    private static final String f1847b = "k7";

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f1848a;

    k7(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f1848a = secretKey;
        if (secretKey == null) {
            throw new InvalidKeyException("Keystore cannot load the key with ID: ".concat(String.valueOf(str)));
        }
    }

    private static void c() {
        try {
            Thread.sleep((int) (Math.random() * 100.0d));
        } catch (InterruptedException unused) {
        }
    }

    private final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(2, this.f1848a, gCMParameterSpec);
        cipher.updateAAD(bArr2);
        return cipher.doFinal(bArr, 12, length - 12);
    }

    private final byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, this.f1848a);
        cipher.updateAAD(bArr2);
        cipher.doFinal(bArr, 0, length, bArr3, 12);
        System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            return d(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w(f1847b, "encountered a potentially transient KeyStore error, will wait and retry", e5);
            c();
            return d(bArr, bArr2);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            return e(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException e5) {
            Log.w(f1847b, "encountered a potentially transient KeyStore error, will wait and retry", e5);
            c();
            return e(bArr, bArr2);
        }
    }
}
