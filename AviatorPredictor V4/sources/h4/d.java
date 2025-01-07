package h4;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface d extends m, WritableByteChannel {
    d E(int r12);

    d I(int r12);

    d U(String str);

    d Z(int r12);

    @Override // h4.m, java.io.Flushable
    void flush();

    d j(byte[] bArr);
}
