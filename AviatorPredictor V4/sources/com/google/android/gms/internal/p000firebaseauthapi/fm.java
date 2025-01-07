package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final /* synthetic */ class fm {
    public static String a(gm gmVar, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int r12 = 0;
            while (r12 < length) {
                if (ea.a(str2.charAt(r12))) {
                    char[] charArray = str2.toCharArray();
                    while (r12 < length) {
                        char c5 = charArray[r12];
                        if (ea.a(c5)) {
                            charArray[r12] = (char) (c5 ^ ' ');
                        }
                        r12++;
                    }
                    return String.valueOf(charArray);
                }
                r12++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            gm.f1684b.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}
