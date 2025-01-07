package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class v1 extends u1 {
    v1() {
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u1
    final int a(int r7, byte[] bArr, int r9, int r10) {
        while (r9 < r10 && bArr[r9] >= 0) {
            r9++;
        }
        if (r9 >= r10) {
            return 0;
        }
        while (r9 < r10) {
            int r12 = r9 + 1;
            byte b5 = bArr[r9];
            if (b5 < 0) {
                if (b5 < -32) {
                    if (r12 >= r10) {
                        return b5;
                    }
                    if (b5 >= -62) {
                        r9 = r12 + 1;
                        if (bArr[r12] > -65) {
                        }
                    }
                    return -1;
                }
                if (b5 >= -16) {
                    if (r12 >= r10 - 2) {
                        return x1.a(bArr, r12, r10);
                    }
                    int r22 = r12 + 1;
                    byte b6 = bArr[r12];
                    if (b6 <= -65 && (((b5 << 28) + (b6 + 112)) >> 30) == 0) {
                        int r92 = r22 + 1;
                        if (bArr[r22] <= -65) {
                            r12 = r92 + 1;
                            if (bArr[r92] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (r12 >= r10 - 1) {
                    return x1.a(bArr, r12, r10);
                }
                int r4 = r12 + 1;
                byte b7 = bArr[r12];
                if (b7 <= -65 && ((b5 != -32 || b7 >= -96) && (b5 != -19 || b7 < -96))) {
                    r9 = r4 + 1;
                    if (bArr[r4] > -65) {
                    }
                }
                return -1;
            }
            r9 = r12;
        }
        return 0;
    }
}
