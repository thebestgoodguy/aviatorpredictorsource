package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class d7 extends q7 {
    public d7() {
        super(pc.class, new c7(s2.class));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return pc.E(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        pc pcVar = (pc) e0Var;
        wf.c(pcVar.z(), 0);
        if (!pcVar.J()) {
            throw new GeneralSecurityException("Missing HPKE key params.");
        }
        e7.a(pcVar.A());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 5;
    }
}
