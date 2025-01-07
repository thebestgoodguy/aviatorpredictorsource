package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class w6 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    private final pc f2263a;

    /* renamed from: b, reason: collision with root package name */
    private final t6 f2264b;

    /* renamed from: c, reason: collision with root package name */
    private final f7 f2265c;

    /* renamed from: d, reason: collision with root package name */
    private final s6 f2266d;

    private w6(pc pcVar, f7 f7Var, s6 s6Var, t6 t6Var, byte[] bArr) {
        this.f2263a = pcVar;
        this.f2265c = f7Var;
        this.f2266d = s6Var;
        this.f2264b = t6Var;
    }

    static w6 a(pc pcVar) {
        if (pcVar.F().F()) {
            throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
        }
        jc A = pcVar.A();
        return new w6(pcVar, x6.c(A), x6.b(A), x6.a(A), null);
    }
}
