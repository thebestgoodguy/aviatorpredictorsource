package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class v3 extends w2 implements u3 {

    /* renamed from: c, reason: collision with root package name */
    private final s7 f2226c;

    /* renamed from: d, reason: collision with root package name */
    private final q7 f2227d;

    public v3(s7 s7Var, q7 q7Var, Class cls) {
        super(s7Var, cls);
        this.f2226c = s7Var;
        this.f2227d = q7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u3
    public final sc c(hr hrVar) {
        try {
            e0 b5 = this.f2226c.b(hrVar);
            this.f2226c.d(b5);
            e0 k4 = this.f2226c.k(b5);
            this.f2227d.d(k4);
            rc z4 = sc.z();
            z4.p(this.f2227d.c());
            z4.q(k4.g());
            z4.r(this.f2227d.f());
            return (sc) z4.f();
        } catch (h e5) {
            throw new GeneralSecurityException("expected serialized proto of type ", e5);
        }
    }
}
