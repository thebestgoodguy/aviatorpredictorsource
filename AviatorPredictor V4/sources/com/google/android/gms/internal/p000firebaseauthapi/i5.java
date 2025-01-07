package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
final class i5 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f1766a = d(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] r22, int r32, int r4, int r5, int r6) {
        int r02 = r22[r32] + r22[r4];
        r22[r32] = r02;
        int r03 = r02 ^ r22[r6];
        int r04 = (r03 >>> (-16)) | (r03 << 16);
        r22[r6] = r04;
        int r12 = r22[r5] + r04;
        r22[r5] = r12;
        int r05 = r22[r4] ^ r12;
        int r06 = (r05 >>> (-12)) | (r05 << 12);
        r22[r4] = r06;
        int r13 = r22[r32] + r06;
        r22[r32] = r13;
        int r33 = r22[r6] ^ r13;
        int r34 = (r33 >>> (-8)) | (r33 << 8);
        r22[r6] = r34;
        int r62 = r22[r5] + r34;
        r22[r5] = r62;
        int r35 = r22[r4] ^ r62;
        r22[r4] = (r35 >>> (-7)) | (r35 << 7);
    }

    static void b(int[] r32, int[] r4) {
        int[] r02 = f1766a;
        System.arraycopy(r02, 0, r32, 0, r02.length);
        System.arraycopy(r4, 0, r32, r02.length, 8);
    }

    static void c(int[] r16) {
        for (int r22 = 0; r22 < 10; r22++) {
            a(r16, 0, 4, 8, 12);
            a(r16, 1, 5, 9, 13);
            a(r16, 2, 6, 10, 14);
            a(r16, 3, 7, 11, 15);
            a(r16, 0, 5, 10, 15);
            a(r16, 1, 6, 11, 12);
            a(r16, 2, 7, 8, 13);
            a(r16, 3, 4, 9, 14);
        }
    }

    static int[] d(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r02 = new int[asIntBuffer.remaining()];
        asIntBuffer.get(r02);
        return r02;
    }
}
