package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class b6 implements q2 {

    /* renamed from: a, reason: collision with root package name */
    private final s3 f1418a;

    public b6(s3 s3Var) {
        this.f1418a = s3Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            Iterator it = this.f1418a.b(copyOfRange).iterator();
            while (it.hasNext()) {
                try {
                    return ((q2) ((m3) it.next()).a()).a(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e5) {
                    logger = c6.f1450a;
                    logger.logp(Level.INFO, "com.google.crypto.tink.daead.DeterministicAeadWrapper$WrappedDeterministicAead", "decryptDeterministically", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e5.toString())));
                }
            }
        }
        Iterator it2 = this.f1418a.b(p2.f2010a).iterator();
        while (it2.hasNext()) {
            try {
                return ((q2) ((m3) it2.next()).a()).a(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
