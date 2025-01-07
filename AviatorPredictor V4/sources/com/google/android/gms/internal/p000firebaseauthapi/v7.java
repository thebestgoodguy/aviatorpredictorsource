package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class v7 extends p7 {
    v7(w7 w7Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        o8 o8Var = (o8) e0Var;
        k8 A = l8.A();
        A.r(0);
        A.p(hr.A(uf.a(o8Var.z())));
        A.q(o8Var.D());
        return (l8) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return o8.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        n8 A = o8.A();
        A.p(32);
        q8 A2 = r8.A();
        A2.p(16);
        A.q((r8) A2.f());
        hashMap.put("AES_CMAC", new o7((o8) A.f(), 1));
        n8 A3 = o8.A();
        A3.p(32);
        q8 A4 = r8.A();
        A4.p(16);
        A3.q((r8) A4.f());
        hashMap.put("AES256_CMAC", new o7((o8) A3.f(), 1));
        n8 A5 = o8.A();
        A5.p(32);
        q8 A6 = r8.A();
        A6.p(16);
        A5.q((r8) A6.f());
        hashMap.put("AES256_CMAC_RAW", new o7((o8) A5.f(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        o8 o8Var = (o8) e0Var;
        w7.m(o8Var.D());
        w7.n(o8Var.z());
    }
}
