package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class x5 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ y5 f2323b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    x5(y5 y5Var, Class cls) {
        super(cls);
        this.f2323b = y5Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        fa A = ga.A();
        A.p(hr.A(uf.a(((ja) e0Var).z())));
        A.q(0);
        return (ga) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return ja.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        ia A = ja.A();
        A.p(64);
        hashMap.put("AES256_SIV", new o7((ja) A.f(), 1));
        ia A2 = ja.A();
        A2.p(64);
        hashMap.put("AES256_SIV_RAW", new o7((ja) A2.f(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        ja jaVar = (ja) e0Var;
        if (jaVar.z() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + jaVar.z() + ". Valid keys must have 64 bytes.");
    }
}
