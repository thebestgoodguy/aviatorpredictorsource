package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class v4 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ w4 f2228b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    v4(w4 w4Var, Class cls) {
        super(cls);
        this.f2228b = w4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        la A = ma.A();
        A.q(0);
        A.p(hr.A(uf.a(32)));
        return (ma) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return pa.B(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new o7(pa.A(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new o7(pa.A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
    }
}
