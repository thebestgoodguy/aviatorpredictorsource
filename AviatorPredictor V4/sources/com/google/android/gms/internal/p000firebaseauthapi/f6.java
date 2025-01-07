package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class f6 extends s7 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f1639e = new byte[0];

    f6() {
        super(db.class, hb.class, new d6(r2.class));
    }

    static /* bridge */ /* synthetic */ o7 m(int r4, int r5, int r6, c3 c3Var, byte[] bArr, int r9) {
        wa z4 = xa.z();
        jb z5 = kb.z();
        int r12 = 4;
        z5.q(4);
        z5.r(5);
        z5.p(hr.A(bArr));
        kb kbVar = (kb) z5.f();
        wc z6 = xc.z();
        z6.p(c3Var.b());
        z6.q(hr.A(c3Var.c()));
        int d5 = c3Var.d() - 1;
        if (d5 == 0) {
            r12 = 3;
        } else if (d5 != 1) {
            r12 = d5 != 2 ? 6 : 5;
        }
        z6.r(r12);
        xc xcVar = (xc) z6.f();
        ta z7 = ua.z();
        z7.p(xcVar);
        ua uaVar = (ua) z7.f();
        za A = ab.A();
        A.q(kbVar);
        A.p(uaVar);
        A.r(r6);
        z4.p((ab) A.f());
        return new o7((xa) z4.f(), r9);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final p7 a() {
        return new e6(this, xa.class);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* synthetic */ e0 b(hr hrVar) {
        return db.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final String c() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        db dbVar = (db) e0Var;
        if (dbVar.E().F()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        wf.c(dbVar.z(), 0);
        o6.a(dbVar.D().A());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q7
    public final int f() {
        return 4;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.s7
    public final /* synthetic */ e0 k(e0 e0Var) {
        return ((db) e0Var).D();
    }
}
