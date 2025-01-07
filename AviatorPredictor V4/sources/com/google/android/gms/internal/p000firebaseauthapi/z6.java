package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class z6 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ a7 f2434b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    z6(a7 a7Var, Class cls) {
        super(cls);
        this.f2434b = a7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        byte[] a5 = uf.a(32);
        a5[0] = (byte) (a5[0] | 7);
        int r32 = a5[31] & 63;
        a5[31] = (byte) r32;
        a5[31] = (byte) (r32 | 128);
        byte[] b5 = xf.b(a5);
        oc B = pc.B();
        B.r(0);
        B.p(((fc) e0Var).C());
        B.q(hr.A(b5));
        pc pcVar = (pc) B.f();
        lc A = mc.A();
        A.r(0);
        A.q(pcVar);
        A.p(hr.A(a5));
        return (mc) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return fc.B(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", a7.l(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", a7.l(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", a7.l(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", a7.l(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", a7.l(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", a7.l(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ void d(e0 e0Var) {
        e7.a(((fc) e0Var).C());
    }
}
