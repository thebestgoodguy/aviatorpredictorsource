package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class w7 extends q7 {
    w7() {
        super(l8.class, new u7(j3.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(r8 r8Var) {
        if (r8Var.z() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (r8Var.z() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(int r12) {
        if (r12 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new v7(this, o8.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return l8.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        l8 l8Var = (l8) e0Var;
        wf.c(l8Var.z(), 0);
        n(l8Var.E().q());
        m(l8Var.D());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
