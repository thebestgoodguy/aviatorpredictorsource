package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class y7 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z7 f2373b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y7(z7 z7Var, Class cls) {
        super(cls);
        this.f2373b = z7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        xb xbVar = (xb) e0Var;
        tb A = ub.A();
        A.r(0);
        A.q(xbVar.E());
        A.p(hr.A(uf.a(xbVar.z())));
        return (ub) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return xb.D(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", z7.m(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", z7.m(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", z7.m(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", z7.m(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", z7.m(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", z7.m(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", z7.m(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", z7.m(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", z7.m(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", z7.m(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        xb xbVar = (xb) e0Var;
        if (xbVar.z() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        z7.n(xbVar.E());
    }
}
