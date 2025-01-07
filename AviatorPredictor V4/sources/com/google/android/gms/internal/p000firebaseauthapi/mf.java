package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Arrays;

/* loaded from: classes.dex */
final class mf {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1925a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f1926b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f1927c = {67108863, 33554431};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f1928d = {26, 25};

    static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        b(jArr4, jArr2, jArr3);
        c(jArr4, jArr);
    }

    static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        jArr[1] = (jArr2[0] * jArr3[1]) + (jArr2[1] * jArr3[0]);
        long j4 = jArr2[1];
        jArr[2] = ((j4 + j4) * jArr3[1]) + (jArr2[0] * jArr3[2]) + (jArr2[2] * jArr3[0]);
        jArr[3] = (jArr2[1] * jArr3[2]) + (jArr2[2] * jArr3[1]) + (jArr2[0] * jArr3[3]) + (jArr2[3] * jArr3[0]);
        long j5 = jArr2[2];
        long j6 = jArr3[2];
        long j7 = (jArr2[1] * jArr3[3]) + (jArr2[3] * jArr3[1]);
        jArr[4] = (j5 * j6) + j7 + j7 + (jArr2[0] * jArr3[4]) + (jArr2[4] * jArr3[0]);
        jArr[5] = (jArr2[2] * jArr3[3]) + (jArr2[3] * jArr3[2]) + (jArr2[1] * jArr3[4]) + (jArr2[4] * jArr3[1]) + (jArr2[0] * jArr3[5]) + (jArr2[5] * jArr3[0]);
        long j8 = (jArr2[3] * jArr3[3]) + (jArr2[1] * jArr3[5]) + (jArr2[5] * jArr3[1]);
        jArr[6] = j8 + j8 + (jArr2[2] * jArr3[4]) + (jArr2[4] * jArr3[2]) + (jArr2[0] * jArr3[6]) + (jArr2[6] * jArr3[0]);
        jArr[7] = (jArr2[3] * jArr3[4]) + (jArr2[4] * jArr3[3]) + (jArr2[2] * jArr3[5]) + (jArr2[5] * jArr3[2]) + (jArr2[1] * jArr3[6]) + (jArr2[6] * jArr3[1]) + (jArr2[0] * jArr3[7]) + (jArr2[7] * jArr3[0]);
        long j9 = jArr2[4];
        long j10 = jArr3[4];
        long j11 = (jArr2[3] * jArr3[5]) + (jArr2[5] * jArr3[3]) + (jArr2[1] * jArr3[7]) + (jArr2[7] * jArr3[1]);
        jArr[8] = (j9 * j10) + j11 + j11 + (jArr2[2] * jArr3[6]) + (jArr2[6] * jArr3[2]) + (jArr2[0] * jArr3[8]) + (jArr2[8] * jArr3[0]);
        jArr[9] = (jArr2[4] * jArr3[5]) + (jArr2[5] * jArr3[4]) + (jArr2[3] * jArr3[6]) + (jArr2[6] * jArr3[3]) + (jArr2[2] * jArr3[7]) + (jArr2[7] * jArr3[2]) + (jArr2[1] * jArr3[8]) + (jArr2[8] * jArr3[1]) + (jArr2[0] * jArr3[9]) + (jArr2[9] * jArr3[0]);
        long j12 = (jArr2[5] * jArr3[5]) + (jArr2[3] * jArr3[7]) + (jArr2[7] * jArr3[3]) + (jArr2[1] * jArr3[9]) + (jArr2[9] * jArr3[1]);
        jArr[10] = j12 + j12 + (jArr2[4] * jArr3[6]) + (jArr2[6] * jArr3[4]) + (jArr2[2] * jArr3[8]) + (jArr2[8] * jArr3[2]);
        jArr[11] = (jArr2[5] * jArr3[6]) + (jArr2[6] * jArr3[5]) + (jArr2[4] * jArr3[7]) + (jArr2[7] * jArr3[4]) + (jArr2[3] * jArr3[8]) + (jArr2[8] * jArr3[3]) + (jArr2[2] * jArr3[9]) + (jArr2[9] * jArr3[2]);
        long j13 = jArr2[6];
        long j14 = jArr3[6];
        long j15 = (jArr2[5] * jArr3[7]) + (jArr2[7] * jArr3[5]) + (jArr2[3] * jArr3[9]) + (jArr2[9] * jArr3[3]);
        jArr[12] = (j13 * j14) + j15 + j15 + (jArr2[4] * jArr3[8]) + (jArr2[8] * jArr3[4]);
        jArr[13] = (jArr2[6] * jArr3[7]) + (jArr2[7] * jArr3[6]) + (jArr2[5] * jArr3[8]) + (jArr2[8] * jArr3[5]) + (jArr2[4] * jArr3[9]) + (jArr2[9] * jArr3[4]);
        long j16 = (jArr2[7] * jArr3[7]) + (jArr2[5] * jArr3[9]) + (jArr2[9] * jArr3[5]);
        jArr[14] = j16 + j16 + (jArr2[6] * jArr3[8]) + (jArr2[8] * jArr3[6]);
        jArr[15] = (jArr2[7] * jArr3[8]) + (jArr2[8] * jArr3[7]) + (jArr2[6] * jArr3[9]) + (jArr2[9] * jArr3[6]);
        long j17 = jArr2[8] * jArr3[8];
        long j18 = (jArr2[7] * jArr3[9]) + (jArr2[9] * jArr3[7]);
        jArr[16] = j17 + j18 + j18;
        jArr[17] = (jArr2[8] * jArr3[9]) + (jArr2[9] * jArr3[8]);
        long j19 = jArr2[9];
        jArr[18] = (j19 + j19) * jArr3[9];
    }

    static void c(long[] jArr, long[] jArr2) {
        e(jArr);
        d(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    static void d(long[] jArr) {
        jArr[10] = 0;
        int r4 = 0;
        while (r4 < 10) {
            long j4 = jArr[r4];
            long j5 = j4 / 67108864;
            jArr[r4] = j4 - (j5 << 26);
            int r5 = r4 + 1;
            long j6 = jArr[r5] + j5;
            jArr[r5] = j6;
            long j7 = j6 / 33554432;
            jArr[r5] = j6 - (j7 << 25);
            r4 += 2;
            jArr[r4] = jArr[r4] + j7;
        }
        long j8 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j8;
        long j9 = jArr[10];
        long j10 = j8 + j9 + j9;
        jArr[0] = j10;
        jArr[0] = j10 + jArr[10];
        jArr[10] = 0;
        long j11 = jArr[0];
        long j12 = j11 / 67108864;
        jArr[0] = j11 - (j12 << 26);
        jArr[1] = jArr[1] + j12;
    }

    static void e(long[] jArr) {
        long j4 = jArr[8] + (jArr[18] << 4);
        jArr[8] = j4;
        long j5 = jArr[18];
        long j6 = j4 + j5 + j5;
        jArr[8] = j6;
        jArr[8] = j6 + jArr[18];
        long j7 = jArr[7] + (jArr[17] << 4);
        jArr[7] = j7;
        long j8 = jArr[17];
        long j9 = j7 + j8 + j8;
        jArr[7] = j9;
        jArr[7] = j9 + jArr[17];
        long j10 = jArr[6] + (jArr[16] << 4);
        jArr[6] = j10;
        long j11 = jArr[16];
        long j12 = j10 + j11 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + jArr[16];
        long j13 = jArr[5] + (jArr[15] << 4);
        jArr[5] = j13;
        long j14 = jArr[15];
        long j15 = j13 + j14 + j14;
        jArr[5] = j15;
        jArr[5] = j15 + jArr[15];
        long j16 = jArr[4] + (jArr[14] << 4);
        jArr[4] = j16;
        long j17 = jArr[14];
        long j18 = j16 + j17 + j17;
        jArr[4] = j18;
        jArr[4] = j18 + jArr[14];
        long j19 = jArr[3] + (jArr[13] << 4);
        jArr[3] = j19;
        long j20 = jArr[13];
        long j21 = j19 + j20 + j20;
        jArr[3] = j21;
        jArr[3] = j21 + jArr[13];
        long j22 = jArr[2] + (jArr[12] << 4);
        jArr[2] = j22;
        long j23 = jArr[12];
        long j24 = j22 + j23 + j23;
        jArr[2] = j24;
        jArr[2] = j24 + jArr[12];
        long j25 = jArr[1] + (jArr[11] << 4);
        jArr[1] = j25;
        long j26 = jArr[11];
        long j27 = j25 + j26 + j26;
        jArr[1] = j27;
        jArr[1] = j27 + jArr[11];
        long j28 = jArr[0] + (jArr[10] << 4);
        jArr[0] = j28;
        long j29 = jArr[10];
        long j30 = j28 + j29 + j29;
        jArr[0] = j30;
        jArr[0] = j30 + jArr[10];
    }

    static void f(long[] jArr, long[] jArr2, long j4) {
        for (int r02 = 0; r02 < 10; r02++) {
            jArr[r02] = jArr2[r02] * j4;
        }
    }

    static void g(long[] jArr, long[] jArr2) {
        long j4 = jArr2[0];
        long j5 = jArr2[0];
        long j6 = jArr2[1];
        long j7 = (j6 * j6) + (jArr2[0] * jArr2[2]);
        long j8 = (jArr2[1] * jArr2[2]) + (jArr2[0] * jArr2[3]);
        long j9 = jArr2[2];
        long j10 = jArr2[1];
        long j11 = jArr2[3];
        long j12 = jArr2[0];
        long j13 = (jArr2[2] * jArr2[3]) + (jArr2[1] * jArr2[4]) + (jArr2[0] * jArr2[5]);
        long j14 = jArr2[3];
        long j15 = jArr2[2];
        long j16 = jArr2[4];
        long j17 = jArr2[0];
        long j18 = jArr2[6];
        long j19 = jArr2[1];
        long j20 = (j14 * j14) + (j15 * j16) + (j17 * j18) + ((j19 + j19) * jArr2[5]);
        long j21 = (jArr2[3] * jArr2[4]) + (jArr2[2] * jArr2[5]) + (jArr2[1] * jArr2[6]) + (jArr2[0] * jArr2[7]);
        long j22 = jArr2[4];
        long j23 = jArr2[2];
        long j24 = jArr2[6];
        long j25 = jArr2[0];
        long j26 = jArr2[8];
        long j27 = (jArr2[1] * jArr2[7]) + (jArr2[3] * jArr2[5]);
        long j28 = (j23 * j24) + (j25 * j26) + j27 + j27;
        long j29 = (jArr2[4] * jArr2[5]) + (jArr2[3] * jArr2[6]) + (jArr2[2] * jArr2[7]) + (jArr2[1] * jArr2[8]) + (jArr2[0] * jArr2[9]);
        long j30 = jArr2[5];
        long j31 = jArr2[4];
        long j32 = jArr2[6];
        long j33 = jArr2[2];
        long j34 = jArr2[8];
        long j35 = (jArr2[3] * jArr2[7]) + (jArr2[1] * jArr2[9]);
        long j36 = (j30 * j30) + (j31 * j32) + (j33 * j34) + j35 + j35;
        long j37 = (jArr2[5] * jArr2[6]) + (jArr2[4] * jArr2[7]) + (jArr2[3] * jArr2[8]) + (jArr2[2] * jArr2[9]);
        long j38 = jArr2[6];
        long j39 = jArr2[4];
        long j40 = jArr2[8];
        long j41 = (jArr2[5] * jArr2[7]) + (jArr2[3] * jArr2[9]);
        long j42 = (j39 * j40) + j41 + j41;
        long j43 = (jArr2[6] * jArr2[7]) + (jArr2[5] * jArr2[8]) + (jArr2[4] * jArr2[9]);
        long j44 = jArr2[7];
        long j45 = jArr2[6];
        long j46 = jArr2[8];
        long j47 = jArr2[5];
        long j48 = (j44 * j44) + (j45 * j46) + ((j47 + j47) * jArr2[9]);
        long j49 = (jArr2[7] * jArr2[8]) + (jArr2[6] * jArr2[9]);
        long j50 = jArr2[8];
        long j51 = jArr2[8];
        long j52 = jArr2[9];
        c(new long[]{j4 * j4, (j5 + j5) * jArr2[1], j7 + j7, j8 + j8, (j9 * j9) + (j10 * 4 * j11) + ((j12 + j12) * jArr2[4]), j13 + j13, j20 + j20, j21 + j21, (j22 * j22) + j28 + j28, j29 + j29, j36 + j36, j37 + j37, (j38 * j38) + j42 + j42, j43 + j43, j48 + j48, j49 + j49, (j50 * j50) + (jArr2[7] * 4 * jArr2[9]), (j51 + j51) * jArr2[9], (j52 + j52) * j52}, jArr);
    }

    static void h(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int r02 = 0; r02 < 10; r02++) {
            jArr[r02] = jArr2[r02] - jArr3[r02];
        }
    }

    static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int r02 = 0; r02 < 10; r02++) {
            jArr[r02] = jArr2[r02] + jArr3[r02];
        }
    }

    static byte[] j(long[] jArr) {
        long[] copyOf = Arrays.copyOf(jArr, 10);
        for (int r32 = 0; r32 < 2; r32++) {
            int r7 = 0;
            while (r7 < 9) {
                long j4 = copyOf[r7];
                int r11 = -((int) (((j4 >> 31) & j4) >> f1928d[r7 & 1]));
                copyOf[r7] = j4 + (r11 << r10);
                r7++;
                copyOf[r7] = copyOf[r7] - r11;
            }
            long j5 = copyOf[9];
            int r4 = -((int) (((j5 >> 31) & j5) >> 25));
            copyOf[9] = j5 + (r4 << 25);
            copyOf[0] = copyOf[0] - (r4 * 19);
        }
        long j6 = copyOf[0];
        copyOf[0] = j6 + (r3 << 26);
        copyOf[1] = copyOf[1] - (-((int) (((j6 >> 31) & j6) >> 26)));
        for (int r33 = 0; r33 < 2; r33++) {
            int r9 = 0;
            while (r9 < 9) {
                long j7 = copyOf[r9];
                int r13 = f1928d[r9 & 1];
                copyOf[r9] = f1927c[r12] & j7;
                r9++;
                copyOf[r9] = copyOf[r9] + ((int) (j7 >> r13));
            }
        }
        copyOf[9] = 33554431 & copyOf[9];
        copyOf[0] = copyOf[0] + (((int) (r9 >> 25)) * 19);
        int r34 = ~((((int) r11) - 67108845) >> 31);
        for (int r42 = 1; r42 < 10; r42++) {
            int r6 = ~(((int) copyOf[r42]) ^ f1927c[r42 & 1]);
            int r62 = r6 & (r6 << 16);
            int r63 = r62 & (r62 << 8);
            int r64 = r63 & (r63 << 4);
            int r65 = r64 & (r64 << 2);
            r34 &= (r65 & (r65 + r65)) >> 31;
        }
        copyOf[0] = copyOf[0] - (67108845 & r34);
        long j8 = 33554431 & r34;
        copyOf[1] = copyOf[1] - j8;
        for (int r66 = 2; r66 < 10; r66 += 2) {
            copyOf[r66] = copyOf[r66] - (67108863 & r34);
            int r92 = r66 + 1;
            copyOf[r92] = copyOf[r92] - j8;
        }
        for (int r35 = 0; r35 < 10; r35++) {
            copyOf[r35] = copyOf[r35] << f1926b[r35];
        }
        byte[] bArr = new byte[32];
        for (int r22 = 0; r22 < 10; r22++) {
            int[] r43 = f1925a;
            int r5 = r43[r22];
            byte b5 = bArr[r5];
            long j9 = copyOf[r22];
            bArr[r5] = (byte) (b5 | (j9 & 255));
            bArr[r43[r22] + 1] = (byte) (bArr[r5] | ((j9 >> 8) & 255));
            bArr[r43[r22] + 2] = (byte) (bArr[r5] | ((j9 >> 16) & 255));
            bArr[r43[r22] + 3] = (byte) (bArr[r4] | ((j9 >> 24) & 255));
        }
        return bArr;
    }

    static long[] k(byte[] bArr) {
        long[] jArr = new long[10];
        for (int r22 = 0; r22 < 10; r22++) {
            int r32 = f1925a[r22];
            jArr[r22] = (((((bArr[r32] & 255) | ((bArr[r32 + 1] & 255) << 8)) | ((bArr[r32 + 2] & 255) << 16)) | ((bArr[r32 + 3] & 255) << 24)) >> f1926b[r22]) & f1927c[r22 & 1];
        }
        return jArr;
    }
}
