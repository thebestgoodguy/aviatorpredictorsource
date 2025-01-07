package b0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f605a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f606b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        return b(bArr, false);
    }

    public static String b(byte[] bArr, boolean z4) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int r22 = 0; r22 < length && (!z4 || r22 != length - 1 || (bArr[r22] & 255) != 0); r22++) {
            char[] cArr = f605a;
            sb.append(cArr[(bArr[r22] & 240) >>> 4]);
            sb.append(cArr[bArr[r22] & 15]);
        }
        return sb.toString();
    }
}
