package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class g4 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h4 f1672b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g4(h4 h4Var, Class cls) {
        super(cls);
        this.f1672b = h4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        x8 x8Var = (x8) e0Var;
        new k4();
        a9 g5 = j4.g(x8Var.C());
        e0 a5 = new z7().a().a(x8Var.D());
        t8 A = u8.A();
        A.p(g5);
        A.q((ub) a5);
        A.r(0);
        return (u8) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return x8.B(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", h4.k(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", h4.k(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", h4.k(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", h4.k(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        x8 x8Var = (x8) e0Var;
        ((j4) new k4().a()).d(x8Var.C());
        new z7().a().d(x8Var.D());
        wf.b(x8Var.C().z());
    }
}
