package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class bf implements m2 {

    /* renamed from: a, reason: collision with root package name */
    private final of f1421a;

    /* renamed from: b, reason: collision with root package name */
    private final j3 f1422b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1423c;

    public bf(of ofVar, j3 j3Var, int r32) {
        this.f1421a = ofVar;
        this.f1422b = j3Var;
        this.f1423c = r32;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int r12 = this.f1423c;
        if (length < r12) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, length - r12);
        this.f1422b.a(Arrays.copyOfRange(bArr, length - this.f1423c, length), se.c(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8)));
        return this.f1421a.a(copyOfRange);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
