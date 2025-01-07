package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class y5 extends q7 {
    y5() {
        super(ga.class, new w5(q2.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new x5(this, ja.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return ga.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        ga gaVar = (ga) e0Var;
        wf.c(gaVar.z(), 0);
        if (gaVar.D().q() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + gaVar.D().q() + ". Valid keys must have 64 bytes.");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
