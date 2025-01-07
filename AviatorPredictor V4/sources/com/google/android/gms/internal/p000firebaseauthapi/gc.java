package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class gc extends fb {
    gc(char c5) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CharMatcher.is('");
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        int r22 = 46;
        for (int r32 = 0; r32 < 4; r32++) {
            cArr[5 - r32] = "0123456789ABCDEF".charAt(r22 & 15);
            r22 >>= 4;
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
