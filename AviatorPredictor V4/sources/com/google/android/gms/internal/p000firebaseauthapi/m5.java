package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class m5 {

    /* renamed from: a, reason: collision with root package name */
    int[] f1920a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1921b;

    public m5(byte[] bArr, int r4) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f1920a = i5.d(bArr);
        this.f1921b = r4;
    }

    abstract int a();

    abstract int[] b(int[] r12, int r22);

    final ByteBuffer c(byte[] bArr, int r6) {
        int[] b5 = b(i5.d(bArr), r6);
        int[] r62 = (int[]) b5.clone();
        i5.c(r62);
        for (int r12 = 0; r12 < 16; r12++) {
            b5[r12] = b5[r12] + r62[r12];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b5, 0, 16);
        return order;
    }

    public final byte[] d(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        if (bArr.length != a()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + a());
        }
        int remaining = byteBuffer.remaining();
        int r22 = (remaining / 64) + 1;
        for (int r32 = 0; r32 < r22; r32++) {
            ByteBuffer c5 = c(bArr, this.f1921b + r32);
            if (r32 == r22 - 1) {
                se.a(allocate, byteBuffer, c5, remaining % 64);
            } else {
                se.a(allocate, byteBuffer, c5, 64);
            }
        }
        return allocate.array();
    }
}
