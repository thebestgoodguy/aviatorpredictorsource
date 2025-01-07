package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class t1 {
    static /* bridge */ /* synthetic */ void a(byte b5, byte b6, byte b7, byte b8, char[] cArr, int r7) {
        if (e(b6) || (((b5 << 28) + (b6 + 112)) >> 30) != 0 || e(b7) || e(b8)) {
            throw h.d();
        }
        int r22 = ((b5 & 7) << 18) | ((b6 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
        cArr[r7] = (char) ((r22 >>> 10) + 55232);
        cArr[r7 + 1] = (char) ((r22 & 1023) + 56320);
    }

    static /* bridge */ /* synthetic */ void b(byte b5, byte b6, byte b7, char[] cArr, int r6) {
        if (!e(b6)) {
            if (b5 == -32) {
                if (b6 >= -96) {
                    b5 = -32;
                }
            }
            if (b5 == -19) {
                if (b6 < -96) {
                    b5 = -19;
                }
            }
            if (!e(b7)) {
                cArr[r6] = (char) (((b5 & 15) << 12) | ((b6 & 63) << 6) | (b7 & 63));
                return;
            }
        }
        throw h.d();
    }

    static /* bridge */ /* synthetic */ void c(byte b5, byte b6, char[] cArr, int r4) {
        if (b5 < -62 || e(b6)) {
            throw h.d();
        }
        cArr[r4] = (char) (((b5 & 31) << 6) | (b6 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b5) {
        return b5 >= 0;
    }

    private static boolean e(byte b5) {
        return b5 > -65;
    }
}
