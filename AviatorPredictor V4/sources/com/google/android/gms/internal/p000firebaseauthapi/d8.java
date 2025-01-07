package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class d8 implements j3 {

    /* renamed from: a, reason: collision with root package name */
    private final s3 f1512a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1513b = {0};

    /* synthetic */ d8(s3 s3Var, b8 b8Var) {
        this.f1512a = s3Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j3
    public final void a(byte[] bArr, byte[] bArr2) {
        Logger logger;
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (m3 m3Var : this.f1512a.b(copyOf)) {
            try {
                if (m3Var.c() == 4) {
                    ((j3) m3Var.a()).a(copyOfRange, se.c(bArr2, this.f1513b));
                    return;
                } else {
                    ((j3) m3Var.a()).a(copyOfRange, bArr2);
                    return;
                }
            } catch (GeneralSecurityException e5) {
                logger = e8.f1554a;
                logger.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e5.toString()));
            }
        }
        Iterator it = this.f1512a.b(p2.f2010a).iterator();
        while (it.hasNext()) {
            try {
                ((j3) ((m3) it.next()).a()).a(bArr, bArr2);
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
