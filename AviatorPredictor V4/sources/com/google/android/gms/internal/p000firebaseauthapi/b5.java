package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class b5 implements m2 {

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f1415c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final xc f1416a;

    /* renamed from: b, reason: collision with root package name */
    private final m2 f1417b;

    public b5(xc xcVar, m2 m2Var) {
        this.f1416a = xcVar;
        this.f1417b = m2Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int r22 = wrap.getInt();
            if (r22 <= 0 || r22 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[r22];
            wrap.get(bArr3, 0, r22);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((m2) x3.j(this.f1416a.D(), this.f1417b.a(bArr3, f1415c), m2.class)).a(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e5) {
            throw new GeneralSecurityException("invalid ciphertext", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
