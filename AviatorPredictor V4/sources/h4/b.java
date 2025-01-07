package h4;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f3973a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f3974b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    public static String a(byte[] bArr) {
        return b(bArr, f3973a);
    }

    private static String b(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int r4 = 0;
        for (int r32 = 0; r32 < length; r32 += 3) {
            int r5 = r4 + 1;
            bArr3[r4] = bArr2[(bArr[r32] & 255) >> 2];
            int r42 = r5 + 1;
            int r7 = r32 + 1;
            bArr3[r5] = bArr2[((bArr[r32] & 3) << 4) | ((bArr[r7] & 255) >> 4)];
            int r52 = r42 + 1;
            int r6 = (bArr[r7] & 15) << 2;
            int r72 = r32 + 2;
            bArr3[r42] = bArr2[r6 | ((bArr[r72] & 255) >> 6)];
            r4 = r52 + 1;
            bArr3[r52] = bArr2[bArr[r72] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int r33 = r4 + 1;
            bArr3[r4] = bArr2[(bArr[length] & 255) >> 2];
            int r12 = r33 + 1;
            bArr3[r33] = bArr2[(bArr[length] & 3) << 4];
            bArr3[r12] = 61;
            bArr3[r12 + 1] = 61;
        } else if (length2 == 2) {
            int r34 = r4 + 1;
            bArr3[r4] = bArr2[(bArr[length] & 255) >> 2];
            int r43 = r34 + 1;
            int r73 = (bArr[length] & 3) << 4;
            int r22 = length + 1;
            bArr3[r34] = bArr2[((bArr[r22] & 255) >> 4) | r73];
            bArr3[r43] = bArr2[(bArr[r22] & 15) << 2];
            bArr3[r43 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }
}
