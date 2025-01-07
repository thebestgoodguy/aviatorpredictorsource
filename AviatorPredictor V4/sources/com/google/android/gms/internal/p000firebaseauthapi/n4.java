package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class n4 extends q7 {
    n4() {
        super(k9.class, new l4(m2.class));
    }

    static /* bridge */ /* synthetic */ o7 k(int r12, int r22, int r32) {
        m9 A = n9.A();
        A.p(r12);
        p9 A2 = q9.A();
        A2.p(16);
        A.q((q9) A2.f());
        return new o7((n9) A.f(), r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new m4(this, n9.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return k9.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        k9 k9Var = (k9) e0Var;
        wf.c(k9Var.z(), 0);
        wf.b(k9Var.E().q());
        if (k9Var.D().z() != 12 && k9Var.D().z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
