package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class f7 {

    /* renamed from: a, reason: collision with root package name */
    private final s6 f1640a;

    f7(s6 s6Var) {
        this.f1640a = s6Var;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a5 = xf.a(bArr2, bArr);
        byte[] c5 = se.c(bArr, xf.b(bArr2));
        byte[] d5 = e7.d(e7.f1545b);
        s6 s6Var = this.f1640a;
        return s6Var.b(null, a5, "eae_prk", c5, "shared_secret", d5, s6Var.a());
    }
}
