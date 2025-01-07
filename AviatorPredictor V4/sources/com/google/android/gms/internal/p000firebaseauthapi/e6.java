package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class e6 extends p7 {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ f6 f1543b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e6(f6 f6Var, Class cls) {
        super(cls);
        this.f1543b = f6Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* bridge */ /* synthetic */ e0 a(e0 e0Var) {
        xa xaVar = (xa) e0Var;
        ECParameterSpec f5 = af.f(o6.c(xaVar.C().D().E()));
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) cf.f1460j.a("EC");
        keyPairGenerator.initialize(f5);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
        ECPoint w4 = eCPublicKey.getW();
        gb B = hb.B();
        B.q(0);
        B.p(xaVar.C());
        B.r(hr.A(w4.getAffineX().toByteArray()));
        B.s(hr.A(w4.getAffineY().toByteArray()));
        hb hbVar = (hb) B.f();
        cb A = db.A();
        A.r(0);
        A.q(hbVar);
        A.p(hr.A(eCPrivateKey.getS().toByteArray()));
        return (db) A.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ e0 b(hr hrVar) {
        return xa.B(hrVar, yr.a());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final Map c() {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        byte[] bArr8;
        byte[] bArr9;
        HashMap hashMap = new HashMap();
        c3 a5 = d3.a("AES128_GCM");
        bArr = f6.f1639e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", f6.m(4, 5, 3, a5, bArr, 1));
        c3 a6 = d3.a("AES128_GCM");
        bArr2 = f6.f1639e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", f6.m(4, 5, 3, a6, bArr2, 3));
        c3 a7 = d3.a("AES128_GCM");
        bArr3 = f6.f1639e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", f6.m(4, 5, 4, a7, bArr3, 1));
        c3 a8 = d3.a("AES128_GCM");
        bArr4 = f6.f1639e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", f6.m(4, 5, 4, a8, bArr4, 3));
        c3 a9 = d3.a("AES128_GCM");
        bArr5 = f6.f1639e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", f6.m(4, 5, 4, a9, bArr5, 3));
        c3 a10 = d3.a("AES128_CTR_HMAC_SHA256");
        bArr6 = f6.f1639e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", f6.m(4, 5, 3, a10, bArr6, 1));
        c3 a11 = d3.a("AES128_CTR_HMAC_SHA256");
        bArr7 = f6.f1639e;
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", f6.m(4, 5, 3, a11, bArr7, 3));
        c3 a12 = d3.a("AES128_CTR_HMAC_SHA256");
        bArr8 = f6.f1639e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", f6.m(4, 5, 4, a12, bArr8, 1));
        c3 a13 = d3.a("AES128_CTR_HMAC_SHA256");
        bArr9 = f6.f1639e;
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", f6.m(4, 5, 4, a13, bArr9, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.p7
    public final /* synthetic */ void d(e0 e0Var) {
        o6.a(((xa) e0Var).C());
    }
}
