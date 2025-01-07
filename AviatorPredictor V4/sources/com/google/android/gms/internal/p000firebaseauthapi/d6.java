package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* loaded from: classes.dex */
final class d6 extends r7 {
    d6(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r7
    public final /* bridge */ /* synthetic */ Object a(e0 e0Var) {
        db dbVar = (db) e0Var;
        ab A = dbVar.D().A();
        kb D = A.D();
        int c5 = o6.c(D.E());
        byte[] G = dbVar.E().G();
        return new we((ECPrivateKey) ((KeyFactory) cf.f1461k.a("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, G), af.f(c5))), D.C().G(), o6.b(D.F()), o6.d(A.G()), new p6(A.z().C()));
    }
}
