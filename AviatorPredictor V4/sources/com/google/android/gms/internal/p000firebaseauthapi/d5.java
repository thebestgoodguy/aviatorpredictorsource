package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class d5 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e5 f1511b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d5(e5 e5Var, Class cls) {
        super(cls);
        this.f1511b = e5Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        td A = ud.A();
        A.p((xd) e0Var);
        A.q(0);
        return (ud) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return xd.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        xd xdVar = (xd) e0Var;
        if (xdVar.D().isEmpty() || !xdVar.E()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
