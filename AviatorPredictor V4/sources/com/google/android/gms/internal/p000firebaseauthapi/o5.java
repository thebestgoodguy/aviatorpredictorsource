package com.google.android.gms.internal.p000firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
abstract class o5 {

    /* renamed from: a, reason: collision with root package name */
    private final m5 f1986a;

    /* renamed from: b, reason: collision with root package name */
    private final m5 f1987b;

    public o5(byte[] bArr) {
        if (!u5.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f1986a = a(bArr, 1);
        this.f1987b = a(bArr, 0);
    }

    abstract m5 a(byte[] bArr, int r22);

    public final byte[] b(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int position = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(position);
        byteBuffer.limit(byteBuffer.limit() - 16);
        try {
            byte[] bArr4 = new byte[32];
            this.f1987b.c(bArr, 0).get(bArr4);
            int remaining = byteBuffer.remaining();
            int r5 = remaining % 16;
            int r6 = r5 == 0 ? remaining : (remaining + 16) - r5;
            ByteBuffer order = ByteBuffer.allocate(r6 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr2);
            order.position(0);
            order.put(byteBuffer);
            order.position(r6);
            order.putLong(0L);
            order.putLong(remaining);
            if (!se.b(r5.a(bArr4, order.array()), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(position);
            return this.f1986a.d(bArr, byteBuffer);
        } catch (GeneralSecurityException e5) {
            throw new AEADBadTagException(e5.toString());
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return b(ByteBuffer.wrap(bArr2), bArr, bArr3);
    }
}
