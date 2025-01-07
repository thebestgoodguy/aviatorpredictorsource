package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class m4 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ n4 f1919b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m4(n4 n4Var, Class cls) {
        super(cls);
        this.f1919b = n4Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        n9 n9Var = (n9) e0Var;
        j9 A = k9.A();
        A.p(hr.A(uf.a(n9Var.z())));
        A.q(n9Var.D());
        A.r(0);
        return (k9) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return n9.C(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", n4.k(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", n4.k(16, 16, 3));
        hashMap.put("AES256_EAX", n4.k(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", n4.k(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
        n9 n9Var = (n9) e0Var;
        wf.b(n9Var.z());
        if (n9Var.D().z() != 12 && n9Var.D().z() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
