package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class oe implements m2 {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f1990e = new me();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f1991f = new ne();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f1992a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f1993b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f1994c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1995d;

    public oe(byte[] bArr, int r5) {
        if (!u5.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (r5 != 12 && r5 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f1995d = r5;
        wf.b(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1994c = secretKeySpec;
        Cipher cipher = (Cipher) f1990e.get();
        cipher.init(1, secretKeySpec);
        byte[] c5 = c(cipher.doFinal(new byte[16]));
        this.f1992a = c5;
        this.f1993b = c(c5);
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int r22 = 0;
        while (r22 < 15) {
            byte b5 = bArr[r22];
            int r4 = r22 + 1;
            bArr2[r22] = (byte) (((b5 + b5) ^ ((bArr[r4] & 255) >>> 7)) & 255);
            r22 = r4;
        }
        byte b6 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b6 + b6));
        return bArr2;
    }

    private final byte[] d(Cipher cipher, int r8, byte[] bArr, int r10, int r11) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) r8;
        if (r11 == 0) {
            return cipher.doFinal(e(bArr3, this.f1992a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int r12 = 0;
        int r22 = 0;
        while (r11 - r22 > 16) {
            for (int r32 = 0; r32 < 16; r32++) {
                doFinal[r32] = (byte) (doFinal[r32] ^ bArr[(r10 + r22) + r32]);
            }
            doFinal = cipher.doFinal(doFinal);
            r22 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, r22 + r10, r10 + r11);
        if (copyOfRange.length == 16) {
            bArr2 = e(copyOfRange, this.f1992a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f1993b, 16);
            while (true) {
                length = copyOfRange.length;
                if (r12 >= length) {
                    break;
                }
                copyOf[r12] = (byte) (copyOf[r12] ^ copyOfRange[r12]);
                r12++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(e(doFinal, bArr2));
    }

    private static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int r22 = 0; r22 < length; r22++) {
            bArr3[r22] = (byte) (bArr[r22] ^ bArr2[r22]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int r12 = (length - this.f1995d) - 16;
        if (r12 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f1990e.get();
        cipher.init(1, this.f1994c);
        byte[] d5 = d(cipher, 0, bArr, 0, this.f1995d);
        byte[] d6 = d(cipher, 1, bArr2, 0, 0);
        byte[] d7 = d(cipher, 2, bArr, this.f1995d, r12);
        int r02 = length - 16;
        byte b5 = 0;
        for (int r32 = 0; r32 < 16; r32++) {
            b5 = (byte) (b5 | (((bArr[r02 + r32] ^ d6[r32]) ^ d5[r32]) ^ d7[r32]));
        }
        if (b5 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f1991f.get();
        cipher2.init(1, this.f1994c, new IvParameterSpec(d5));
        return cipher2.doFinal(bArr, this.f1995d, r12);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.m2
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        throw null;
    }
}
