package r2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class r implements h<String> {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f7472a = Charset.forName("UTF8");

    /* renamed from: b, reason: collision with root package name */
    public static final r f7473b = new r();

    private r() {
    }

    @Override // r2.h
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String a(ByteBuffer byteBuffer) {
        byte[] bArr;
        int r5;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            r5 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            r5 = 0;
        }
        return new String(bArr, r5, remaining, f7472a);
    }

    @Override // r2.h
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer b(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f7472a);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
