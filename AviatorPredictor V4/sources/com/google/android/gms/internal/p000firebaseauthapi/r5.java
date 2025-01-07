package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class r5 {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        long b5 = b(bArr, 0, 0);
        long b6 = b(bArr, 3, 2) & 67108611;
        long b7 = b(bArr, 6, 4) & 67092735;
        long b8 = b(bArr, 9, 6) & 66076671;
        long b9 = b(bArr, 12, 8) & 1048575;
        long j4 = b6 * 5;
        long j5 = b7 * 5;
        long j6 = b8 * 5;
        long j7 = b9 * 5;
        int r9 = 17;
        byte[] bArr3 = new byte[17];
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int r10 = 0;
        while (true) {
            int length = bArr2.length;
            if (r10 >= length) {
                long j13 = j8 + (j9 >> 26);
                long j14 = j13 & 67108863;
                long j15 = j10 + (j13 >> 26);
                long j16 = j15 & 67108863;
                long j17 = j11 + (j15 >> 26);
                long j18 = j17 & 67108863;
                long j19 = j12 + ((j17 >> 26) * 5);
                long j20 = j19 & 67108863;
                long j21 = (j9 & 67108863) + (j19 >> 26);
                long j22 = j20 + 5;
                long j23 = (j22 >> 26) + j21;
                long j24 = j14 + (j23 >> 26);
                long j25 = j16 + (j24 >> 26);
                long j26 = (j18 + (j25 >> 26)) - 67108864;
                long j27 = j26 >> 63;
                long j28 = ~j27;
                long j29 = (j21 & j27) | (j23 & 67108863 & j28);
                long j30 = (j14 & j27) | (j24 & 67108863 & j28);
                long j31 = (j16 & j27) | (j25 & 67108863 & j28);
                long c5 = (((j20 & j27) | (j22 & 67108863 & j28) | (j29 << 26)) & 4294967295L) + c(bArr, 16);
                long c6 = (((j29 >> 6) | (j30 << 20)) & 4294967295L) + c(bArr, 20) + (c5 >> 32);
                long c7 = (((j30 >> 12) | (j31 << 14)) & 4294967295L) + c(bArr, 24) + (c6 >> 32);
                long c8 = c(bArr, 28);
                byte[] bArr4 = new byte[16];
                d(bArr4, c5 & 4294967295L, 0);
                d(bArr4, c6 & 4294967295L, 4);
                d(bArr4, c7 & 4294967295L, 8);
                d(bArr4, ((((((j26 & j28) | (j18 & j27)) << 8) | (j31 >> 18)) & 4294967295L) + c8 + (c7 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int min = Math.min(16, length - r10);
            System.arraycopy(bArr2, r10, bArr3, 0, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, r9, (byte) 0);
            }
            long b10 = j12 + b(bArr3, 0, 0);
            long b11 = j9 + b(bArr3, 3, 2);
            long b12 = j8 + b(bArr3, 6, 4);
            long b13 = j10 + b(bArr3, 9, 6);
            long b14 = j11 + (b(bArr3, 12, 8) | (bArr3[16] << 24));
            long j32 = (b10 * b5) + (b11 * j7) + (b12 * j6) + (b13 * j5) + (b14 * j4);
            long j33 = (b10 * b6) + (b11 * b5) + (b12 * j7) + (b13 * j6) + (b14 * j5) + (j32 >> 26);
            long j34 = (b10 * b7) + (b11 * b6) + (b12 * b5) + (b13 * j7) + (b14 * j6) + (j33 >> 26);
            long j35 = (b10 * b8) + (b11 * b7) + (b12 * b6) + (b13 * b5) + (b14 * j7) + (j34 >> 26);
            long j36 = (b10 * b9) + (b11 * b8) + (b12 * b7) + (b13 * b6) + (b14 * b5) + (j35 >> 26);
            j11 = j36 & 67108863;
            long j37 = (j32 & 67108863) + ((j36 >> 26) * 5);
            j12 = j37 & 67108863;
            j9 = (j33 & 67108863) + (j37 >> 26);
            r10 += 16;
            j10 = j35 & 67108863;
            j8 = j34 & 67108863;
            r9 = 17;
        }
    }

    private static long b(byte[] bArr, int r32, int r4) {
        return (c(bArr, r32) >> r4) & 67108863;
    }

    private static long c(byte[] bArr, int r32) {
        return (((bArr[r32 + 3] & 255) << 24) | (bArr[r32] & 255) | ((bArr[r32 + 1] & 255) << 8) | ((bArr[r32 + 2] & 255) << 16)) & 4294967295L;
    }

    private static void d(byte[] bArr, long j4, int r7) {
        int r02 = 0;
        while (r02 < 4) {
            bArr[r7 + r02] = (byte) (255 & j4);
            r02++;
            j4 >>= 8;
        }
    }
}
