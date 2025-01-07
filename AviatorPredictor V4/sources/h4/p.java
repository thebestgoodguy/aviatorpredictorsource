package h4;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f4011a = Charset.forName("UTF-8");

    public static boolean a(byte[] bArr, int r5, byte[] bArr2, int r7, int r8) {
        for (int r12 = 0; r12 < r8; r12++) {
            if (bArr[r12 + r5] != bArr2[r12 + r7]) {
                return false;
            }
        }
        return true;
    }

    public static void b(long j4, long j5, long j6) {
        if ((j5 | j6) < 0 || j5 > j4 || j4 - j5 < j6) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6)));
        }
    }

    public static void c(Throwable th) {
        d(th);
    }

    private static <T extends Throwable> void d(Throwable th) {
        throw th;
    }
}
