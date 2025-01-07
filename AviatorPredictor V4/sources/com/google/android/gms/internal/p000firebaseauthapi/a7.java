package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a7 extends s7 {
    public a7() {
        super(mc.class, pc.class, new y6(r2.class));
    }

    static /* bridge */ /* synthetic */ o7 l(int r02, int r12, int r22, int r32) {
        ic z4 = jc.z();
        z4.r(3);
        z4.q(3);
        z4.p(r22);
        jc jcVar = (jc) z4.f();
        ec z5 = fc.z();
        z5.p(jcVar);
        return new o7((fc) z5.f(), r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new z6(this, fc.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return mc.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        mc mcVar = (mc) e0Var;
        if (mcVar.E().F()) {
            throw new GeneralSecurityException("Private key is empty.");
        }
        if (!mcVar.I()) {
            throw new GeneralSecurityException("Missing public key.");
        }
        wf.c(mcVar.z(), 0);
        e7.a(mcVar.D().A());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s7
    public final /* synthetic */ e0 k(e0 e0Var) {
        return ((mc) e0Var).D();
    }
}
