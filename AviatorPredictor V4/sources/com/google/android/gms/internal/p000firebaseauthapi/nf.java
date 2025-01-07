package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class nf {
    public static String a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b5 : bArr) {
            int r32 = b5 & 255;
            sb.append("0123456789abcdef".charAt(r32 >> 4));
            sb.append("0123456789abcdef".charAt(r32 & 15));
        }
        return sb.toString();
    }
}
