package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class qe implements q2 {

    /* renamed from: c, reason: collision with root package name */
    private static final Collection f2057c = Arrays.asList(64);

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f2058d = new byte[16];

    /* renamed from: a, reason: collision with root package name */
    private final pf f2059a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f2060b;

    public qe(byte[] bArr) {
        if (!u5.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = f2057c;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int r02 = length >> 1;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, r02);
            this.f2060b = Arrays.copyOfRange(bArr, r02, length);
            this.f2059a = new pf(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + length + " bytes; key must have 64 bytes");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q2
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] d5;
        int length = bArr.length;
        if (length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) cf.f1455e.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f2060b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && vf.b()) {
            doFinal = new byte[0];
        }
        byte[][] bArr4 = {bArr2, doFinal};
        byte[] a5 = this.f2059a.a(f2058d, 16);
        for (int r5 = 0; r5 <= 0; r5++) {
            byte[] bArr5 = bArr4[r5];
            if (bArr5 == null) {
                bArr5 = new byte[0];
            }
            a5 = se.d(re.b(a5), this.f2059a.a(bArr5, 16));
        }
        byte[] bArr6 = bArr4[1];
        int length2 = bArr6.length;
        if (length2 >= 16) {
            int length3 = a5.length;
            if (length2 < length3) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int r52 = length2 - length3;
            d5 = Arrays.copyOf(bArr6, length2);
            for (int r32 = 0; r32 < a5.length; r32++) {
                int r11 = r52 + r32;
                d5[r11] = (byte) (d5[r11] ^ a5[r32]);
            }
        } else {
            d5 = se.d(re.a(bArr6), re.b(a5));
        }
        if (se.b(copyOfRange, this.f2059a.a(d5, 16))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
