package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class sf implements j3 {

    /* renamed from: a, reason: collision with root package name */
    private final i8 f2129a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2130b;

    public sf(i8 i8Var, int r32) {
        this.f2129a = i8Var;
        this.f2130b = r32;
        if (r32 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        i8Var.a(new byte[0], r32);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.j3
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!se.b(this.f2129a.a(bArr2, this.f2130b), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
