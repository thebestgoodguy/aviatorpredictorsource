package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class k4 extends q7 {
    k4() {
        super(a9.class, new i4(of.class));
    }

    public static final void l(a9 a9Var) {
        wf.c(a9Var.z(), 0);
        wf.b(a9Var.F().q());
        m(a9Var.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h9 h9Var) {
        if (h9Var.z() < 12 || h9Var.z() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new j4(this, e9.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return a9.D(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        l((a9) e0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
