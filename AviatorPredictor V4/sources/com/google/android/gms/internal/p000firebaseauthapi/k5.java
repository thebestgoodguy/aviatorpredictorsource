package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class k5 {

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal f1843c = new j5();

    /* renamed from: a, reason: collision with root package name */
    private final SecretKey f1844a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1845b;

    public k5(byte[] bArr, boolean z4) {
        if (!u5.a(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        wf.b(bArr.length);
        this.f1844a = new SecretKeySpec(bArr, "AES");
        this.f1845b = z4;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z4 = this.f1845b;
        int r22 = true != z4 ? 16 : 28;
        int length = bArr2.length;
        if (length < r22) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z4 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec gCMParameterSpec = (!vf.b() || vf.a() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
        ThreadLocal threadLocal = f1843c;
        ((Cipher) threadLocal.get()).init(2, this.f1844a, gCMParameterSpec);
        boolean z5 = this.f1845b;
        int r02 = true != z5 ? 0 : 12;
        if (z5) {
            length -= 12;
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, r02, length);
    }
}
