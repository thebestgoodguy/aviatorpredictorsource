package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class x1 {

    /* renamed from: a, reason: collision with root package name */
    private static final u1 f2315a;

    static {
        if (s1.C() && s1.D()) {
            int r02 = tq.f2176a;
        }
        f2315a = new v1();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int r7, int r8) {
        byte b5 = bArr[r7 - 1];
        int r82 = r8 - r7;
        if (r82 != 0) {
            if (r82 == 1) {
                byte b6 = bArr[r7];
                if (b5 <= -12 && b6 <= -65) {
                    return b5 ^ (b6 << 8);
                }
            } else {
                if (r82 != 2) {
                    throw new AssertionError();
                }
                byte b7 = bArr[r7];
                byte b8 = bArr[r7 + 1];
                if (b5 <= -12 && b7 <= -65 && b8 <= -65) {
                    return ((b7 << 8) ^ b5) ^ (b8 << 16);
                }
            }
        } else if (b5 <= -12) {
            return b5;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00fe, code lost:
    
        return r9 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int b(java.lang.CharSequence r7, byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.x1.b(java.lang.CharSequence, byte[], int, int):int");
    }

    static int c(CharSequence charSequence) {
        int length = charSequence.length();
        int r12 = 0;
        int r22 = 0;
        while (r22 < length && charSequence.charAt(r22) < 128) {
            r22++;
        }
        int r32 = length;
        while (true) {
            if (r22 >= length) {
                break;
            }
            char charAt = charSequence.charAt(r22);
            if (charAt < 2048) {
                r32 += (127 - charAt) >>> 31;
                r22++;
            } else {
                int length2 = charSequence.length();
                while (r22 < length2) {
                    char charAt2 = charSequence.charAt(r22);
                    if (charAt2 < 2048) {
                        r12 += (127 - charAt2) >>> 31;
                    } else {
                        r12 += 2;
                        if (charAt2 >= 55296 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, r22) < 65536) {
                                throw new w1(r22, length2);
                            }
                            r22++;
                        }
                    }
                    r22++;
                }
                r32 += r12;
            }
        }
        if (r32 >= length) {
            return r32;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r32 + 4294967296L));
    }

    static String d(byte[] bArr, int r11, int r12) {
        int length = bArr.length;
        if ((r11 | r12 | ((length - r11) - r12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(r11), Integer.valueOf(r12)));
        }
        int r02 = r11 + r12;
        char[] cArr = new char[r12];
        int r13 = 0;
        while (r11 < r02) {
            byte b5 = bArr[r11];
            if (!t1.d(b5)) {
                break;
            }
            r11++;
            cArr[r13] = (char) b5;
            r13++;
        }
        while (r11 < r02) {
            int r32 = r11 + 1;
            byte b6 = bArr[r11];
            if (t1.d(b6)) {
                int r4 = r13 + 1;
                cArr[r13] = (char) b6;
                r11 = r32;
                while (true) {
                    r13 = r4;
                    if (r11 < r02) {
                        byte b7 = bArr[r11];
                        if (!t1.d(b7)) {
                            break;
                        }
                        r11++;
                        r4 = r13 + 1;
                        cArr[r13] = (char) b7;
                    }
                }
            } else if (b6 < -32) {
                if (r32 >= r02) {
                    throw h.d();
                }
                t1.c(b6, bArr[r32], cArr, r13);
                r11 = r32 + 1;
                r13++;
            } else if (b6 < -16) {
                if (r32 >= r02 - 1) {
                    throw h.d();
                }
                int r42 = r32 + 1;
                t1.b(b6, bArr[r32], bArr[r42], cArr, r13);
                r11 = r42 + 1;
                r13++;
            } else {
                if (r32 >= r02 - 2) {
                    throw h.d();
                }
                int r43 = r32 + 1;
                int r5 = r43 + 1;
                t1.a(b6, bArr[r32], bArr[r43], bArr[r5], cArr, r13);
                r13 += 2;
                r11 = r5 + 1;
            }
        }
        return new String(cArr, 0, r13);
    }

    static boolean e(byte[] bArr) {
        return f2315a.b(bArr, 0, bArr.length);
    }

    static boolean f(byte[] bArr, int r22, int r32) {
        return f2315a.b(bArr, r22, r32);
    }
}
