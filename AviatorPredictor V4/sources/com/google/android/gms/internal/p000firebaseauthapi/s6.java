package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class s6 {

    /* renamed from: a, reason: collision with root package name */
    private final String f2127a = "HmacSha256";

    s6(String str) {
    }

    private final byte[] e(byte[] bArr, byte[] bArr2, int r10) {
        Mac mac = (Mac) cf.f1456f.a(this.f2127a);
        if (r10 > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[r10];
        mac.init(new SecretKeySpec(bArr, this.f2127a));
        byte[] bArr4 = new byte[0];
        int r32 = 1;
        int r4 = 0;
        while (true) {
            mac.update(bArr4);
            mac.update(bArr2);
            mac.update((byte) r32);
            bArr4 = mac.doFinal();
            int length = bArr4.length;
            int r6 = r4 + length;
            if (r6 >= r10) {
                System.arraycopy(bArr4, 0, bArr3, r4, r10 - r4);
                return bArr3;
            }
            System.arraycopy(bArr4, 0, bArr3, r4, length);
            r32++;
            r4 = r6;
        }
    }

    private final byte[] f(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) cf.f1456f.a(this.f2127a);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.f2127a));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.f2127a));
        }
        return mac.doFinal(bArr);
    }

    final int a() {
        return Mac.getInstance(this.f2127a).getMacLength();
    }

    public final byte[] b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int r7) {
        return e(f(e7.e("eae_prk", bArr2, bArr4), null), e7.f("shared_secret", bArr3, bArr4, r7), r7);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int r5) {
        return e(bArr, e7.f(str, bArr2, bArr3, r5), r5);
    }

    public final byte[] d(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return f(e7.e(str, bArr2, bArr3), bArr);
    }
}
