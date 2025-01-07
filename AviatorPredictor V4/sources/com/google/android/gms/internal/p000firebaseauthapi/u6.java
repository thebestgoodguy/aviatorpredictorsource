package com.google.android.gms.internal.p000firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class u6 {

    /* renamed from: g, reason: collision with root package name */
    private static final byte[] f2181g = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final t6 f2182a;

    /* renamed from: b, reason: collision with root package name */
    private final BigInteger f2183b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f2184c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f2185d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f2186e;

    /* renamed from: f, reason: collision with root package name */
    private BigInteger f2187f = BigInteger.ZERO;

    private u6(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, t6 t6Var) {
        this.f2186e = bArr;
        this.f2184c = bArr2;
        this.f2185d = bArr3;
        this.f2183b = bigInteger;
        this.f2182a = t6Var;
    }

    static u6 b(byte[] bArr, byte[] bArr2, f7 f7Var, s6 s6Var, t6 t6Var, byte[] bArr3) {
        byte[] bArr4 = e7.f1546c;
        if (!Arrays.equals(bArr4, bArr4)) {
            throw new GeneralSecurityException("Could not determine HPKE KEM ID");
        }
        byte[] b5 = e7.b(e7.f1545b, bArr4, t6Var.b());
        byte[] bArr5 = e7.f1550g;
        byte[] bArr6 = f2181g;
        byte[] c5 = se.c(e7.f1544a, s6Var.d(bArr5, bArr6, "psk_id_hash", b5), s6Var.d(bArr5, bArr3, "info_hash", b5));
        byte[] d5 = s6Var.d(bArr2, bArr6, "secret", b5);
        byte[] c6 = s6Var.c(d5, c5, "key", b5, t6Var.a());
        byte[] c7 = s6Var.c(d5, c5, "base_nonce", b5, 12);
        BigInteger bigInteger = BigInteger.ONE;
        return new u6(bArr, c6, c7, bigInteger.shiftLeft(96).subtract(bigInteger), t6Var);
    }

    private final synchronized byte[] c() {
        byte[] d5;
        byte[] bArr = this.f2185d;
        byte[] byteArray = this.f2187f.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            }
            if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else {
                if (byteArray[0] != 0) {
                    throw new GeneralSecurityException("integer too large");
                }
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            }
        }
        d5 = se.d(bArr, byteArray);
        if (this.f2187f.compareTo(this.f2183b) >= 0) {
            throw new GeneralSecurityException("message limit reached");
        }
        this.f2187f = this.f2187f.add(BigInteger.ONE);
        return d5;
    }

    final byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f2182a.c(this.f2184c, c(), bArr, bArr2);
    }
}
