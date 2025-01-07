package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class h5 extends q7 {
    h5() {
        super(fe.class, new f5(m2.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new g5(this, je.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return fe.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        fe feVar = (fe) e0Var;
        wf.c(feVar.z(), 0);
        if (feVar.D().q() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
