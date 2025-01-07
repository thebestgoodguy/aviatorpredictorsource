package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class s4 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ t4 f2126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s4(t4 t4Var, Class cls) {
        super(cls);
        this.f2126b = t4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        y9 A = z9.A();
        A.p(hr.A(uf.a(((ca) e0Var).z())));
        A.q(0);
        return (z9) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return ca.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", t4.l(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", t4.l(16, 3));
        hashMap.put("AES256_GCM_SIV", t4.l(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", t4.l(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ void d(e0 e0Var) {
        wf.b(((ca) e0Var).z());
    }
}
