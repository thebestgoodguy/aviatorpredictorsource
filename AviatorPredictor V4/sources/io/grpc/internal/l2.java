package io.grpc.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5459a = Logger.getLogger(l2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f5460b = "-bin".getBytes(q0.b.f7136a);

    private l2() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int r22 = length; r22 < bArr.length; r22++) {
            if (bArr[r22] != bArr2[r22 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b5 : bArr) {
            if (b5 < 32 || b5 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int r11) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int r22 = 0; r22 < r11; r22++) {
            arrayList.add(bArr[r22]);
        }
        while (r11 < bArr.length) {
            byte[] bArr2 = bArr[r11];
            byte[] bArr3 = bArr[r11 + 1];
            if (a(bArr2, f5460b)) {
                int r5 = 0;
                for (int r4 = 0; r4 <= bArr3.length; r4++) {
                    if (r4 == bArr3.length || bArr3[r4] == 44) {
                        byte[] b5 = s0.a.a().b(new String(bArr3, r5, r4 - r5, q0.b.f7136a));
                        arrayList.add(bArr2);
                        arrayList.add(b5);
                        r5 = r4 + 1;
                    }
                }
            } else {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            }
            r11 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0][]);
    }

    public static byte[][] d(b3.u0 u0Var) {
        byte[][] d5 = b3.i0.d(u0Var);
        if (d5 == null) {
            return new byte[0][];
        }
        int r22 = 0;
        for (int r12 = 0; r12 < d5.length; r12 += 2) {
            byte[] bArr = d5[r12];
            byte[] bArr2 = d5[r12 + 1];
            if (a(bArr, f5460b)) {
                d5[r22] = bArr;
                d5[r22 + 1] = b3.i0.f811b.e(bArr2).getBytes(q0.b.f7136a);
            } else if (b(bArr2)) {
                d5[r22] = bArr;
                d5[r22 + 1] = bArr2;
            } else {
                String str = new String(bArr, q0.b.f7136a);
                f5459a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            r22 += 2;
        }
        return r22 == d5.length ? d5 : (byte[][]) Arrays.copyOfRange(d5, 0, r22);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int r12 = 0; r12 < bArr.length; r12 += 2) {
            byte[] bArr2 = bArr[r12];
            int r32 = r12 + 1;
            byte[] bArr3 = bArr[r32];
            if (a(bArr2, f5460b)) {
                for (byte b5 : bArr3) {
                    if (b5 == 44) {
                        return c(bArr, r12);
                    }
                }
                bArr[r32] = s0.a.a().b(new String(bArr3, q0.b.f7136a));
            }
        }
        return bArr;
    }
}
