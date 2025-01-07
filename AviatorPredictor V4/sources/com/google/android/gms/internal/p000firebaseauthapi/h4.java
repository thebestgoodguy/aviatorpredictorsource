package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class h4 extends q7 {
    h4() {
        super(u8.class, new f4(m2.class));
    }

    static /* bridge */ /* synthetic */ o7 k(int r12, int r22, int r32, int r4, int r5, int r6) {
        c9 A = e9.A();
        g9 A2 = h9.A();
        A2.p(16);
        A.q((h9) A2.f());
        A.p(r12);
        e9 e9Var = (e9) A.f();
        wb A3 = xb.A();
        zb A4 = ac.A();
        A4.q(5);
        A4.p(r4);
        A3.q((ac) A4.f());
        A3.p(32);
        xb xbVar = (xb) A3.f();
        w8 z4 = x8.z();
        z4.p(e9Var);
        z4.q(xbVar);
        return new o7((x8) z4.f(), r6);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new g4(this, x8.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return u8.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        u8 u8Var = (u8) e0Var;
        wf.c(u8Var.z(), 0);
        new k4();
        k4.l(u8Var.D());
        new z7();
        z7.l(u8Var.E());
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
