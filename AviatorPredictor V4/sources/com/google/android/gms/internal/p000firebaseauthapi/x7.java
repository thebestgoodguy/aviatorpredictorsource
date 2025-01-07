package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class x7 extends r7 {
    x7(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r7
    public final /* bridge */ /* synthetic */ Object a(e0 e0Var) {
        ub ubVar = (ub) e0Var;
        int E = ubVar.E().E();
        SecretKeySpec secretKeySpec = new SecretKeySpec(ubVar.F().G(), "HMAC");
        int z4 = ubVar.E().z();
        int r02 = E - 2;
        if (r02 == 1) {
            return new sf(new rf("HMACSHA1", secretKeySpec), z4);
        }
        if (r02 == 2) {
            return new sf(new rf("HMACSHA384", secretKeySpec), z4);
        }
        if (r02 == 3) {
            return new sf(new rf("HMACSHA256", secretKeySpec), z4);
        }
        if (r02 == 4) {
            return new sf(new rf("HMACSHA512", secretKeySpec), z4);
        }
        if (r02 == 5) {
            return new sf(new rf("HMACSHA224", secretKeySpec), z4);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
