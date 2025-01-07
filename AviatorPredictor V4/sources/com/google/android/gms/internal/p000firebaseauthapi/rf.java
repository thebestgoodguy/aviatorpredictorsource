package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class rf implements i8 {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f2084a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2085b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f2086c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2087d;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public rf(String str, Key key) {
        char c5;
        int r6;
        qf qfVar = new qf(this);
        this.f2084a = qfVar;
        if (!u5.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f2085b = str;
        this.f2086c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c5 = 0;
                    break;
                }
                c5 = 65535;
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    c5 = 1;
                    break;
                }
                c5 = 65535;
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c5 = 2;
                    break;
                }
                c5 = 65535;
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c5 = 3;
                    break;
                }
                c5 = 65535;
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c5 = 4;
                    break;
                }
                c5 = 65535;
                break;
            default:
                c5 = 65535;
                break;
        }
        if (c5 == 0) {
            r6 = 20;
        } else if (c5 == 1) {
            r6 = 28;
        } else if (c5 == 2) {
            r6 = 32;
        } else if (c5 == 3) {
            r6 = 48;
        } else {
            if (c5 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            r6 = 64;
        }
        this.f2087d = r6;
        qfVar.get();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.i8
    public final byte[] a(byte[] bArr, int r32) {
        if (r32 > this.f2087d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f2084a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f2084a.get()).doFinal(), r32);
    }
}
