package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class se {
    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int r6) {
        if (r6 < 0 || byteBuffer2.remaining() < r6 || byteBuffer3.remaining() < r6 || byteBuffer.remaining() < r6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int r02 = 0; r02 < r6; r02++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final boolean b(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length == bArr2.length) {
            int r22 = 0;
            for (int r12 = 0; r12 < bArr.length; r12++) {
                r22 |= bArr[r12] ^ bArr2[r12];
            }
            if (r22 == 0) {
                return true;
            }
        }
        return false;
    }

    public static byte[] c(byte[]... bArr) {
        int r32 = 0;
        for (byte[] bArr2 : bArr) {
            int length = bArr2.length;
            if (r32 > Integer.MAX_VALUE - length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            r32 += length;
        }
        byte[] bArr3 = new byte[r32];
        int r4 = 0;
        for (byte[] bArr4 : bArr) {
            int length2 = bArr4.length;
            System.arraycopy(bArr4, 0, bArr3, r4, length2);
            r4 += length2;
        }
        return bArr3;
    }

    public static final byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length == bArr2.length) {
            return e(bArr, 0, bArr2, 0, length);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final byte[] e(byte[] bArr, int r5, byte[] bArr2, int r7, int r8) {
        if (bArr.length - r8 < r5 || bArr2.length - r8 < r7) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[r8];
        for (int r12 = 0; r12 < r8; r12++) {
            bArr3[r12] = (byte) (bArr[r12 + r5] ^ bArr2[r12 + r7]);
        }
        return bArr3;
    }
}
