package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class v6 implements r2 {

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f2231e = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final mc f2232a;

    /* renamed from: b, reason: collision with root package name */
    private final t6 f2233b;

    /* renamed from: c, reason: collision with root package name */
    private final f7 f2234c;

    /* renamed from: d, reason: collision with root package name */
    private final s6 f2235d;

    private v6(mc mcVar, f7 f7Var, s6 s6Var, t6 t6Var, int r5, byte[] bArr) {
        this.f2232a = mcVar;
        this.f2234c = f7Var;
        this.f2235d = s6Var;
        this.f2233b = t6Var;
    }

    static v6 b(mc mcVar) {
        if (!mcVar.I()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        }
        if (!mcVar.D().J()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        }
        if (mcVar.E().F()) {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
        jc A = mcVar.D().A();
        f7 c5 = x6.c(A);
        s6 b5 = x6.b(A);
        t6 a5 = x6.a(A);
        int E = A.E();
        if (E - 2 == 1) {
            return new v6(mcVar, c5, b5, a5, 32, null);
        }
        throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(cc.a(E)));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length < 32) {
            throw new GeneralSecurityException("Ciphertext is too short.");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
        mc mcVar = this.f2232a;
        f7 f7Var = this.f2234c;
        s6 s6Var = this.f2235d;
        t6 t6Var = this.f2233b;
        return u6.b(copyOf, f7Var.a(copyOf, mcVar.E().G()), f7Var, s6Var, t6Var, new byte[0]).a(copyOfRange, f2231e);
    }
}
