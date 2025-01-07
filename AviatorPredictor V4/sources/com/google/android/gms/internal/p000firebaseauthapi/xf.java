package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.InvalidKeyException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class xf {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        int r7 = copyOf[31] & Byte.MAX_VALUE;
        copyOf[31] = (byte) r7;
        copyOf[31] = (byte) (r7 | 64);
        int r72 = ue.f2190b;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, 32);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int r6 = 0; r6 < 7; r6++) {
            byte[][] bArr3 = ue.f2189a;
            if (se.b(bArr3[r6], copyOf2)) {
                throw new InvalidKeyException("Banned public key: ".concat(nf.a(bArr3[r6])));
            }
        }
        long[] k4 = mf.k(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        System.arraycopy(k4, 0, jArr2, 0, 10);
        int r11 = 0;
        for (int r5 = 32; r11 < r5; r5 = 32) {
            int r52 = copyOf[(32 - r11) - 1] & 255;
            int r73 = 0;
            while (r73 < 8) {
                int r10 = (r52 >> (7 - r73)) & 1;
                ue.a(jArr4, jArr2, r10);
                ue.a(jArr5, jArr3, r10);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int r16 = r52;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int r19 = r11;
                long[] jArr13 = new long[19];
                int r20 = r73;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                mf.i(jArr4, jArr4, jArr5);
                mf.h(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                mf.i(jArr2, jArr2, jArr3);
                mf.h(jArr3, copyOf4, jArr3);
                mf.b(jArr14, jArr2, jArr5);
                mf.b(jArr15, jArr4, jArr3);
                mf.e(jArr14);
                mf.d(jArr14);
                mf.e(jArr15);
                mf.d(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                mf.i(jArr14, jArr14, jArr15);
                mf.h(jArr15, copyOf4, jArr15);
                mf.g(jArr18, jArr14);
                mf.g(jArr17, jArr15);
                mf.b(jArr15, jArr17, k4);
                mf.e(jArr15);
                mf.d(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                mf.g(jArr12, jArr4);
                mf.g(jArr13, jArr5);
                mf.b(jArr8, jArr12, jArr13);
                mf.e(jArr8);
                mf.d(jArr8);
                mf.h(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                mf.f(jArr10, jArr13, 121665L);
                mf.d(jArr10);
                mf.i(jArr10, jArr10, jArr12);
                mf.b(jArr16, jArr13, jArr10);
                mf.e(jArr16);
                mf.d(jArr16);
                ue.a(jArr8, jArr6, r10);
                ue.a(jArr16, jArr7, r10);
                r73 = r20 + 1;
                jArr9 = jArr5;
                jArr2 = jArr6;
                r52 = r16;
                jArr = jArr11;
                r11 = r19;
                jArr6 = jArr19;
                jArr5 = jArr16;
                copyOf = bArr4;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr21;
            }
            r11++;
            copyOf = copyOf;
        }
        long[] jArr22 = jArr;
        long[] jArr23 = new long[10];
        long[] jArr24 = new long[10];
        long[] jArr25 = new long[10];
        long[] jArr26 = new long[10];
        long[] jArr27 = new long[10];
        long[] jArr28 = new long[10];
        long[] jArr29 = new long[10];
        long[] jArr30 = new long[10];
        long[] jArr31 = new long[10];
        long[] jArr32 = new long[10];
        long[] jArr33 = jArr2;
        long[] jArr34 = new long[10];
        mf.g(jArr24, jArr5);
        mf.g(jArr34, jArr24);
        mf.g(jArr32, jArr34);
        mf.a(jArr25, jArr32, jArr5);
        mf.a(jArr26, jArr25, jArr24);
        mf.g(jArr32, jArr26);
        mf.a(jArr27, jArr32, jArr25);
        mf.g(jArr32, jArr27);
        mf.g(jArr34, jArr32);
        mf.g(jArr32, jArr34);
        mf.g(jArr34, jArr32);
        mf.g(jArr32, jArr34);
        mf.a(jArr28, jArr32, jArr27);
        mf.g(jArr32, jArr28);
        mf.g(jArr34, jArr32);
        for (int r22 = 2; r22 < 10; r22 += 2) {
            mf.g(jArr32, jArr34);
            mf.g(jArr34, jArr32);
        }
        mf.a(jArr29, jArr34, jArr28);
        mf.g(jArr32, jArr29);
        mf.g(jArr34, jArr32);
        for (int r23 = 2; r23 < 20; r23 += 2) {
            mf.g(jArr32, jArr34);
            mf.g(jArr34, jArr32);
        }
        mf.a(jArr32, jArr34, jArr29);
        mf.g(jArr34, jArr32);
        mf.g(jArr32, jArr34);
        for (int r24 = 2; r24 < 10; r24 += 2) {
            mf.g(jArr34, jArr32);
            mf.g(jArr32, jArr34);
        }
        mf.a(jArr30, jArr32, jArr28);
        mf.g(jArr32, jArr30);
        mf.g(jArr34, jArr32);
        for (int r25 = 2; r25 < 50; r25 += 2) {
            mf.g(jArr32, jArr34);
            mf.g(jArr34, jArr32);
        }
        mf.a(jArr31, jArr34, jArr30);
        mf.g(jArr34, jArr31);
        mf.g(jArr32, jArr34);
        for (int r26 = 2; r26 < 100; r26 += 2) {
            mf.g(jArr34, jArr32);
            mf.g(jArr32, jArr34);
        }
        mf.a(jArr34, jArr32, jArr31);
        mf.g(jArr32, jArr34);
        mf.g(jArr34, jArr32);
        for (int r02 = 2; r02 < 50; r02 += 2) {
            mf.g(jArr32, jArr34);
            mf.g(jArr34, jArr32);
        }
        mf.a(jArr32, jArr34, jArr30);
        mf.g(jArr34, jArr32);
        mf.g(jArr32, jArr34);
        mf.g(jArr34, jArr32);
        mf.g(jArr32, jArr34);
        mf.g(jArr34, jArr32);
        mf.a(jArr23, jArr34, jArr26);
        mf.a(jArr22, jArr4, jArr23);
        long[] jArr35 = new long[10];
        long[] jArr36 = new long[10];
        long[] jArr37 = new long[11];
        long[] jArr38 = new long[11];
        long[] jArr39 = new long[11];
        mf.a(jArr35, k4, jArr22);
        mf.i(jArr36, k4, jArr22);
        long[] jArr40 = new long[10];
        jArr40[0] = 486662;
        mf.i(jArr38, jArr36, jArr40);
        mf.a(jArr38, jArr38, jArr3);
        mf.i(jArr38, jArr38, jArr33);
        mf.a(jArr38, jArr38, jArr35);
        mf.a(jArr38, jArr38, jArr33);
        mf.f(jArr37, jArr38, 4L);
        mf.d(jArr37);
        mf.a(jArr38, jArr35, jArr3);
        mf.h(jArr38, jArr38, jArr3);
        mf.a(jArr39, jArr36, jArr33);
        mf.i(jArr38, jArr38, jArr39);
        mf.g(jArr38, jArr38);
        if (se.b(mf.j(jArr37), mf.j(jArr38))) {
            return mf.j(jArr22);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(nf.a(bArr2)));
    }

    public static byte[] b(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return a(bArr, bArr2);
    }
}
