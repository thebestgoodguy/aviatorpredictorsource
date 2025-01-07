package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class p4 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q4 f2011b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p4(q4 q4Var, Class cls) {
        super(cls);
        this.f2011b = q4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        s9 A = t9.A();
        A.p(hr.A(uf.a(((w9) e0Var).z())));
        A.q(0);
        return (t9) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return w9.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", q4.k(16, 1));
        hashMap.put("AES128_GCM_RAW", q4.k(16, 3));
        hashMap.put("AES256_GCM", q4.k(32, 1));
        hashMap.put("AES256_GCM_RAW", q4.k(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ void d(e0 e0Var) {
        wf.b(((w9) e0Var).z());
    }
}
