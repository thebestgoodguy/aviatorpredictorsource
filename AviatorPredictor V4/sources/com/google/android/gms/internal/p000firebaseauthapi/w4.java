package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class w4 extends q7 {
    w4() {
        super(ma.class, new u4(m2.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new v4(this, pa.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return ma.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        ma maVar = (ma) e0Var;
        wf.c(maVar.z(), 0);
        if (maVar.D().q() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
