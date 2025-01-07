package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class e7 {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1544a = c(1, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1545b = c(2, 32);

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1546c = c(2, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f1547d = c(2, 1);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1548e = c(2, 2);

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1549f = c(2, 3);

    /* renamed from: g, reason: collision with root package name */
    public static final byte[] f1550g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f1551h = "KEM".getBytes(StandardCharsets.UTF_8);

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f1552i = "HPKE".getBytes(StandardCharsets.UTF_8);

    /* renamed from: j, reason: collision with root package name */
    private static final byte[] f1553j = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    static void a(jc jcVar) {
        if (jcVar.E() == 2 || jcVar.E() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(cc.a(jcVar.E())));
        }
        String str = "UNRECOGNIZED";
        if (jcVar.D() == 2 || jcVar.D() == 1) {
            int D = jcVar.D();
            if (D == 2) {
                str = "KDF_UNKNOWN";
            } else if (D == 3) {
                str = "HKDF_SHA256";
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        }
        if (jcVar.C() == 2 || jcVar.C() == 1) {
            int C = jcVar.C();
            if (C == 2) {
                str = "AEAD_UNKNOWN";
            } else if (C == 3) {
                str = "AES_128_GCM";
            } else if (C == 4) {
                str = "AES_256_GCM";
            } else if (C == 5) {
                str = "CHACHA20_POLY1305";
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    static byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return se.c(f1552i, bArr, bArr2, bArr3);
    }

    public static byte[] c(int r32, int r4) {
        byte[] bArr = new byte[r32];
        for (int r12 = 0; r12 < r32; r12++) {
            bArr[r12] = (byte) ((r4 >> (((r32 - r12) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] d(byte[] bArr) {
        return se.c(f1551h, bArr);
    }

    static byte[] e(String str, byte[] bArr, byte[] bArr2) {
        return se.c(f1553j, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static byte[] f(String str, byte[] bArr, byte[] bArr2, int r6) {
        return se.c(c(2, r6), f1553j, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
