package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class d4 implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final s3 f1510a;

    /* synthetic */ d4(s3 s3Var, c4 c4Var) {
        this.f1510a = s3Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = this.f1510a.b(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((m2) ((m3) it.next()).a()).a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e5) {
                    logger = e4.f1542a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e5.toString())));
                }
            }
        }
        Iterator it2 = this.f1510a.b(p2.f2010a).iterator();
        while (it2.hasNext()) {
            try {
                return ((m2) ((m3) it2.next()).a()).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
