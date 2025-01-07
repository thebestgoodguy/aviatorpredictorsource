package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class q4 extends q7 {
    q4() {
        super(t9.class, new o4(m2.class));
    }

    static /* bridge */ /* synthetic */ o7 k(int r12, int r22) {
        v9 A = w9.A();
        A.p(r12);
        return new o7((w9) A.f(), r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new p4(this, w9.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return t9.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        t9 t9Var = (t9) e0Var;
        wf.c(t9Var.z(), 0);
        wf.b(t9Var.D().q());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int e() {
        return 2;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 3;
    }
}
