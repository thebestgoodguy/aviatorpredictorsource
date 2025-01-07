package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class g5 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ h5 f1673b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g5(h5 h5Var, Class cls) {
        super(cls);
        this.f1673b = h5Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        ee A = fe.A();
        A.q(0);
        A.p(hr.A(uf.a(32)));
        return (fe) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return je.B(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new o7(je.A(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new o7(je.A(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ void d(e0 e0Var) {
    }
}
