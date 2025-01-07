package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class t7 {
    public static int a() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int r32 = 0;
        while (r32 == 0) {
            secureRandom.nextBytes(bArr);
            r32 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return r32;
    }
}
