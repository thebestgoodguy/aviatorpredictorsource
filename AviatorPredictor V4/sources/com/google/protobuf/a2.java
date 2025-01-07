package com.google.protobuf;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class a2 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f2795a;

    private static class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static void h(byte b5, byte b6, byte b7, byte b8, char[] cArr, int r7) {
            if (m(b6) || (((b5 << 28) + (b6 + 112)) >> 30) != 0 || m(b7) || m(b8)) {
                throw e0.d();
            }
            int r4 = ((b5 & 7) << 18) | (r(b6) << 12) | (r(b7) << 6) | r(b8);
            cArr[r7] = l(r4);
            cArr[r7 + 1] = q(r4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void i(byte b5, char[] cArr, int r22) {
            cArr[r22] = (char) b5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void j(byte b5, byte b6, byte b7, char[] cArr, int r6) {
            if (m(b6) || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || m(b7)))) {
                throw e0.d();
            }
            cArr[r6] = (char) (((b5 & 15) << 12) | (r(b6) << 6) | r(b7));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void k(byte b5, byte b6, char[] cArr, int r4) {
            if (b5 < -62 || m(b6)) {
                throw e0.d();
            }
            cArr[r4] = (char) (((b5 & 31) << 6) | r(b6));
        }

        private static char l(int r12) {
            return (char) ((r12 >>> 10) + 55232);
        }

        private static boolean m(byte b5) {
            return b5 > -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean n(byte b5) {
            return b5 >= 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean o(byte b5) {
            return b5 < -16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean p(byte b5) {
            return b5 < -32;
        }

        private static char q(int r12) {
            return (char) ((r12 & 1023) + 56320);
        }

        private static int r(byte b5) {
            return b5 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        private static int j(ByteBuffer byteBuffer, int r7, int r8) {
            int l4 = r7 + a2.l(byteBuffer, r7, r8);
            while (l4 < r8) {
                int r02 = l4 + 1;
                byte b5 = byteBuffer.get(l4);
                if (b5 < 0) {
                    if (b5 >= -32) {
                        if (b5 < -16) {
                            if (r02 < r8 - 1) {
                                int r4 = r02 + 1;
                                byte b6 = byteBuffer.get(r02);
                                if (b6 > -65 || ((b5 == -32 && b6 < -96) || ((b5 == -19 && b6 >= -96) || byteBuffer.get(r4) > -65))) {
                                    return -1;
                                }
                                l4 = r4 + 1;
                            }
                        } else if (r02 < r8 - 2) {
                            int r12 = r02 + 1;
                            byte b7 = byteBuffer.get(r02);
                            if (b7 <= -65 && (((b5 << 28) + (b7 + 112)) >> 30) == 0) {
                                int r72 = r12 + 1;
                                if (byteBuffer.get(r12) <= -65) {
                                    r02 = r72 + 1;
                                    if (byteBuffer.get(r72) > -65) {
                                    }
                                }
                            }
                            return -1;
                        }
                        return a2.p(byteBuffer, b5, r02, r8 - r02);
                    }
                    if (r02 >= r8) {
                        return b5;
                    }
                    if (b5 < -62 || byteBuffer.get(r02) > -65) {
                        return -1;
                    }
                    r02++;
                }
                l4 = r02;
            }
            return 0;
        }

        final String a(ByteBuffer byteBuffer, int r32, int r4) {
            if (byteBuffer.hasArray()) {
                return b(byteBuffer.array(), byteBuffer.arrayOffset() + r32, r4);
            }
            return byteBuffer.isDirect() ? d(byteBuffer, r32, r4) : c(byteBuffer, r32, r4);
        }

        abstract String b(byte[] bArr, int r22, int r32);

        final String c(ByteBuffer byteBuffer, int r13, int r14) {
            if ((r13 | r14 | ((byteBuffer.limit() - r13) - r14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(r13), Integer.valueOf(r14)));
            }
            int r02 = r13 + r14;
            char[] cArr = new char[r14];
            int r32 = 0;
            while (r13 < r02) {
                byte b5 = byteBuffer.get(r13);
                if (!a.n(b5)) {
                    break;
                }
                r13++;
                a.i(b5, cArr, r32);
                r32++;
            }
            int r8 = r32;
            while (r13 < r02) {
                int r33 = r13 + 1;
                byte b6 = byteBuffer.get(r13);
                if (a.n(b6)) {
                    int r4 = r8 + 1;
                    a.i(b6, cArr, r8);
                    while (r33 < r02) {
                        byte b7 = byteBuffer.get(r33);
                        if (!a.n(b7)) {
                            break;
                        }
                        r33++;
                        a.i(b7, cArr, r4);
                        r4++;
                    }
                    r13 = r33;
                    r8 = r4;
                } else if (a.p(b6)) {
                    if (r33 >= r02) {
                        throw e0.d();
                    }
                    a.k(b6, byteBuffer.get(r33), cArr, r8);
                    r13 = r33 + 1;
                    r8++;
                } else if (a.o(b6)) {
                    if (r33 >= r02 - 1) {
                        throw e0.d();
                    }
                    int r42 = r33 + 1;
                    a.j(b6, byteBuffer.get(r33), byteBuffer.get(r42), cArr, r8);
                    r13 = r42 + 1;
                    r8++;
                } else {
                    if (r33 >= r02 - 2) {
                        throw e0.d();
                    }
                    int r43 = r33 + 1;
                    byte b8 = byteBuffer.get(r33);
                    int r34 = r43 + 1;
                    a.h(b6, b8, byteBuffer.get(r43), byteBuffer.get(r34), cArr, r8);
                    r13 = r34 + 1;
                    r8 = r8 + 1 + 1;
                }
            }
            return new String(cArr, 0, r8);
        }

        abstract String d(ByteBuffer byteBuffer, int r22, int r32);

        abstract int e(CharSequence charSequence, byte[] bArr, int r32, int r4);

        final boolean f(ByteBuffer byteBuffer, int r32, int r4) {
            return h(0, byteBuffer, r32, r4) == 0;
        }

        final boolean g(byte[] bArr, int r32, int r4) {
            return i(0, bArr, r32, r4) == 0;
        }

        final int h(int r22, ByteBuffer byteBuffer, int r4, int r5) {
            if (!byteBuffer.hasArray()) {
                return byteBuffer.isDirect() ? l(r22, byteBuffer, r4, r5) : k(r22, byteBuffer, r4, r5);
            }
            int arrayOffset = byteBuffer.arrayOffset();
            return i(r22, byteBuffer.array(), r4 + arrayOffset, arrayOffset + r5);
        }

        abstract int i(int r12, byte[] bArr, int r32, int r4);

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        
            if (r8.get(r9) > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:
        
            if (r8.get(r9) > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
        
            if (r8.get(r9) > (-65)) goto L53;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        final int k(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L8e
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L8e
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.protobuf.a2.a(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L65
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L63
                int r7 = com.google.protobuf.a2.a(r0, r1)
                return r7
            L63:
                r9 = r7
                goto L68
            L65:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L68:
                if (r4 != 0) goto L78
                int r7 = r9 + 1
                byte r4 = r8.get(r9)
                if (r7 < r10) goto L77
                int r7 = com.google.protobuf.a2.b(r0, r1, r4)
                return r7
            L77:
                r9 = r7
            L78:
                if (r1 > r3) goto L8d
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L8d
                if (r4 > r3) goto L8d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L8d:
                return r2
            L8e:
                int r7 = j(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.b.k(int, java.nio.ByteBuffer, int, int):int");
        }

        abstract int l(int r12, ByteBuffer byteBuffer, int r32, int r4);
    }

    static final class c extends b {
        c() {
        }

        private static int m(byte[] bArr, int r22, int r32) {
            while (r22 < r32 && bArr[r22] >= 0) {
                r22++;
            }
            if (r22 >= r32) {
                return 0;
            }
            return n(bArr, r22, r32);
        }

        private static int n(byte[] bArr, int r7, int r8) {
            while (r7 < r8) {
                int r02 = r7 + 1;
                byte b5 = bArr[r7];
                if (b5 < 0) {
                    if (b5 < -32) {
                        if (r02 >= r8) {
                            return b5;
                        }
                        if (b5 >= -62) {
                            r7 = r02 + 1;
                            if (bArr[r02] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b5 >= -16) {
                        if (r02 >= r8 - 2) {
                            return a2.q(bArr, r02, r8);
                        }
                        int r12 = r02 + 1;
                        byte b6 = bArr[r02];
                        if (b6 <= -65 && (((b5 << 28) + (b6 + 112)) >> 30) == 0) {
                            int r72 = r12 + 1;
                            if (bArr[r12] <= -65) {
                                r02 = r72 + 1;
                                if (bArr[r72] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (r02 >= r8 - 1) {
                        return a2.q(bArr, r02, r8);
                    }
                    int r4 = r02 + 1;
                    byte b7 = bArr[r02];
                    if (b7 <= -65 && ((b5 != -32 || b7 >= -96) && (b5 != -19 || b7 < -96))) {
                        r7 = r4 + 1;
                        if (bArr[r4] > -65) {
                        }
                    }
                    return -1;
                }
                r7 = r02;
            }
            return 0;
        }

        @Override // com.google.protobuf.a2.b
        String b(byte[] bArr, int r13, int r14) {
            if ((r13 | r14 | ((bArr.length - r13) - r14)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(r13), Integer.valueOf(r14)));
            }
            int r02 = r13 + r14;
            char[] cArr = new char[r14];
            int r32 = 0;
            while (r13 < r02) {
                byte b5 = bArr[r13];
                if (!a.n(b5)) {
                    break;
                }
                r13++;
                a.i(b5, cArr, r32);
                r32++;
            }
            int r8 = r32;
            while (r13 < r02) {
                int r33 = r13 + 1;
                byte b6 = bArr[r13];
                if (a.n(b6)) {
                    int r4 = r8 + 1;
                    a.i(b6, cArr, r8);
                    while (r33 < r02) {
                        byte b7 = bArr[r33];
                        if (!a.n(b7)) {
                            break;
                        }
                        r33++;
                        a.i(b7, cArr, r4);
                        r4++;
                    }
                    r13 = r33;
                    r8 = r4;
                } else if (a.p(b6)) {
                    if (r33 >= r02) {
                        throw e0.d();
                    }
                    a.k(b6, bArr[r33], cArr, r8);
                    r13 = r33 + 1;
                    r8++;
                } else if (a.o(b6)) {
                    if (r33 >= r02 - 1) {
                        throw e0.d();
                    }
                    int r42 = r33 + 1;
                    a.j(b6, bArr[r33], bArr[r42], cArr, r8);
                    r13 = r42 + 1;
                    r8++;
                } else {
                    if (r33 >= r02 - 2) {
                        throw e0.d();
                    }
                    int r43 = r33 + 1;
                    byte b8 = bArr[r33];
                    int r34 = r43 + 1;
                    a.h(b6, b8, bArr[r43], bArr[r34], cArr, r8);
                    r13 = r34 + 1;
                    r8 = r8 + 1 + 1;
                }
            }
            return new String(cArr, 0, r8);
        }

        @Override // com.google.protobuf.a2.b
        String d(ByteBuffer byteBuffer, int r22, int r32) {
            return c(byteBuffer, r22, r32);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.protobuf.a2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int e(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.c.e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
        
            if (r8[r9] > (-65)) goto L53;
         */
        @Override // com.google.protobuf.a2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int i(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L82
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L82
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.protobuf.a2.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                r4 = 0
                if (r1 != 0) goto L5d
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5b
                int r7 = com.google.protobuf.a2.a(r0, r1)
                return r7
            L5b:
                r9 = r7
                goto L60
            L5d:
                int r7 = r7 >> 16
                byte r4 = (byte) r7
            L60:
                if (r4 != 0) goto L6e
                int r7 = r9 + 1
                r4 = r8[r9]
                if (r7 < r10) goto L6d
                int r7 = com.google.protobuf.a2.b(r0, r1, r4)
                return r7
            L6d:
                r9 = r7
            L6e:
                if (r1 > r3) goto L81
                int r7 = r0 << 28
                int r1 = r1 + 112
                int r7 = r7 + r1
                int r7 = r7 >> 30
                if (r7 != 0) goto L81
                if (r4 > r3) goto L81
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L81:
                return r2
            L82:
                int r7 = m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.c.i(int, byte[], int, int):int");
        }

        @Override // com.google.protobuf.a2.b
        int l(int r12, ByteBuffer byteBuffer, int r32, int r4) {
            return k(r12, byteBuffer, r32, r4);
        }
    }

    static class d extends IllegalArgumentException {
        d(int r32, int r4) {
            super("Unpaired surrogate at index " + r32 + " of " + r4);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean m() {
            return z1.I() && z1.J();
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int n(long r8, int r10) {
            /*
                int r0 = p(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r10 <= 0) goto L1a
                long r4 = r8 + r2
                byte r1 = com.google.protobuf.z1.w(r8)
                if (r1 < 0) goto L19
                int r10 = r10 + (-1)
                r8 = r4
                goto L9
            L19:
                r8 = r4
            L1a:
                if (r10 != 0) goto L1d
                return r0
            L1d:
                int r10 = r10 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r10 != 0) goto L29
                return r1
            L29:
                int r10 = r10 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 <= r4) goto L37
                goto L39
            L37:
                r8 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r10 >= r6) goto L46
                int r8 = r(r8, r1, r10)
                return r8
            L46:
                int r10 = r10 + (-2)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 > r4) goto L63
                r9 = -96
                if (r1 != r0) goto L56
                if (r8 < r9) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r8 >= r9) goto L63
            L5c:
                long r2 = r2 + r6
                byte r8 = com.google.protobuf.z1.w(r6)
                if (r8 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r10 >= r0) goto L6c
                int r8 = r(r8, r1, r10)
                return r8
            L6c:
                int r10 = r10 + (-3)
                long r6 = r8 + r2
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 > r4) goto L8e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L8e
                long r8 = r6 + r2
                byte r0 = com.google.protobuf.z1.w(r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r8
                byte r8 = com.google.protobuf.z1.w(r8)
                if (r8 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.n(long, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x008e, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static int o(byte[] r8, long r9, int r11) {
            /*
                int r0 = q(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L7:
                r0 = 0
                r1 = 0
            L9:
                r2 = 1
                if (r11 <= 0) goto L1a
                long r4 = r9 + r2
                byte r1 = com.google.protobuf.z1.x(r8, r9)
                if (r1 < 0) goto L19
                int r11 = r11 + (-1)
                r9 = r4
                goto L9
            L19:
                r9 = r4
            L1a:
                if (r11 != 0) goto L1d
                return r0
            L1d:
                int r11 = r11 + (-1)
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L3a
                if (r11 != 0) goto L29
                return r1
            L29:
                int r11 = r11 + (-1)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 <= r4) goto L37
                goto L39
            L37:
                r9 = r2
                goto L7
            L39:
                return r5
            L3a:
                r6 = -16
                if (r1 >= r6) goto L64
                r6 = 2
                if (r11 >= r6) goto L46
                int r8 = s(r8, r1, r9, r11)
                return r8
            L46:
                int r11 = r11 + (-2)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 > r4) goto L63
                r10 = -96
                if (r1 != r0) goto L56
                if (r9 < r10) goto L63
            L56:
                r0 = -19
                if (r1 != r0) goto L5c
                if (r9 >= r10) goto L63
            L5c:
                long r2 = r2 + r6
                byte r9 = com.google.protobuf.z1.x(r8, r6)
                if (r9 <= r4) goto L37
            L63:
                return r5
            L64:
                r0 = 3
                if (r11 >= r0) goto L6c
                int r8 = s(r8, r1, r9, r11)
                return r8
            L6c:
                int r11 = r11 + (-3)
                long r6 = r9 + r2
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 > r4) goto L8e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L8e
                long r9 = r6 + r2
                byte r0 = com.google.protobuf.z1.x(r8, r6)
                if (r0 > r4) goto L8e
                long r2 = r2 + r9
                byte r9 = com.google.protobuf.z1.x(r8, r9)
                if (r9 <= r4) goto L37
            L8e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.o(byte[], long, int):int");
        }

        private static int p(long j4, int r8) {
            if (r8 < 16) {
                return 0;
            }
            int r12 = (int) ((-j4) & 7);
            int r02 = r12;
            while (r02 > 0) {
                long j5 = 1 + j4;
                if (z1.w(j4) < 0) {
                    return r12 - r02;
                }
                r02--;
                j4 = j5;
            }
            int r03 = r8 - r12;
            while (r03 >= 8 && (z1.D(j4) & (-9187201950435737472L)) == 0) {
                j4 += 8;
                r03 -= 8;
            }
            return r8 - r03;
        }

        private static int q(byte[] bArr, long j4, int r10) {
            int r02 = 0;
            if (r10 < 16) {
                return 0;
            }
            while (true) {
                int r12 = r02 + 8;
                if (r12 > r10 || (z1.E(bArr, z1.f3177h + j4) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j4 += 8;
                r02 = r12;
            }
            while (r02 < r10) {
                long j5 = 1 + j4;
                if (z1.x(bArr, j4) < 0) {
                    return r02;
                }
                r02++;
                j4 = j5;
            }
            return r10;
        }

        private static int r(long j4, int r4, int r5) {
            if (r5 == 0) {
                return a2.m(r4);
            }
            if (r5 == 1) {
                return a2.n(r4, z1.w(j4));
            }
            if (r5 == 2) {
                return a2.o(r4, z1.w(j4), z1.w(j4 + 1));
            }
            throw new AssertionError();
        }

        private static int s(byte[] bArr, int r32, long j4, int r6) {
            if (r6 == 0) {
                return a2.m(r32);
            }
            if (r6 == 1) {
                return a2.n(r32, z1.x(bArr, j4));
            }
            if (r6 == 2) {
                return a2.o(r32, z1.x(bArr, j4), z1.x(bArr, j4 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.protobuf.a2.b
        String b(byte[] bArr, int r12, int r13) {
            if ((r12 | r13 | ((bArr.length - r12) - r13)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(r12), Integer.valueOf(r13)));
            }
            int q4 = q(bArr, r12, r13) + r12;
            int r32 = r12 + r13;
            while (q4 < r32 && z1.x(bArr, q4) >= 0) {
                q4++;
            }
            if (q4 == r32) {
                return new String(bArr, r12, r13, d0.f2846a);
            }
            char[] cArr = new char[r13];
            int r4 = 0;
            while (r12 < q4) {
                a.i(z1.x(bArr, r12), cArr, r4);
                r12++;
                r4++;
            }
            int r9 = r4;
            while (q4 < r32) {
                int r122 = q4 + 1;
                byte x4 = z1.x(bArr, q4);
                if (a.n(x4)) {
                    int r02 = r9 + 1;
                    a.i(x4, cArr, r9);
                    while (r122 < r32) {
                        byte x5 = z1.x(bArr, r122);
                        if (!a.n(x5)) {
                            break;
                        }
                        r122++;
                        a.i(x5, cArr, r02);
                        r02++;
                    }
                    r9 = r02;
                    q4 = r122;
                } else if (a.p(x4)) {
                    if (r122 >= r32) {
                        throw e0.d();
                    }
                    q4 = r122 + 1;
                    a.k(x4, z1.x(bArr, r122), cArr, r9);
                    r9++;
                } else if (a.o(x4)) {
                    if (r122 >= r32 - 1) {
                        throw e0.d();
                    }
                    int r03 = r122 + 1;
                    a.j(x4, z1.x(bArr, r122), z1.x(bArr, r03), cArr, r9);
                    q4 = r03 + 1;
                    r9++;
                } else {
                    if (r122 >= r32 - 2) {
                        throw e0.d();
                    }
                    int r04 = r122 + 1;
                    byte x6 = z1.x(bArr, r122);
                    int r123 = r04 + 1;
                    byte x7 = z1.x(bArr, r04);
                    q4 = r123 + 1;
                    a.h(x4, x6, x7, z1.x(bArr, r123), cArr, r9);
                    r9 = r9 + 1 + 1;
                }
            }
            return new String(cArr, 0, r9);
        }

        @Override // com.google.protobuf.a2.b
        String d(ByteBuffer byteBuffer, int r19, int r20) {
            if ((r19 | r20 | ((byteBuffer.limit() - r19) - r20)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(r19), Integer.valueOf(r20)));
            }
            long k4 = z1.k(byteBuffer) + r19;
            long j4 = r20 + k4;
            char[] cArr = new char[r20];
            int r12 = 0;
            while (k4 < j4) {
                byte w4 = z1.w(k4);
                if (!a.n(w4)) {
                    break;
                }
                k4++;
                a.i(w4, cArr, r12);
                r12++;
            }
            while (true) {
                int r14 = r12;
                while (k4 < j4) {
                    long j5 = k4 + 1;
                    byte w5 = z1.w(k4);
                    if (a.n(w5)) {
                        int r5 = r14 + 1;
                        a.i(w5, cArr, r14);
                        while (j5 < j4) {
                            byte w6 = z1.w(j5);
                            if (!a.n(w6)) {
                                break;
                            }
                            j5++;
                            a.i(w6, cArr, r5);
                            r5++;
                        }
                        r14 = r5;
                        k4 = j5;
                    } else if (a.p(w5)) {
                        if (j5 >= j4) {
                            throw e0.d();
                        }
                        k4 = j5 + 1;
                        a.k(w5, z1.w(j5), cArr, r14);
                        r14++;
                    } else if (a.o(w5)) {
                        if (j5 >= j4 - 1) {
                            throw e0.d();
                        }
                        long j6 = j5 + 1;
                        a.j(w5, z1.w(j5), z1.w(j6), cArr, r14);
                        r14++;
                        k4 = j6 + 1;
                    } else {
                        if (j5 >= j4 - 2) {
                            throw e0.d();
                        }
                        long j7 = j5 + 1;
                        byte w7 = z1.w(j5);
                        long j8 = j7 + 1;
                        byte w8 = z1.w(j7);
                        k4 = j8 + 1;
                        a.h(w5, w7, w8, z1.w(j8), cArr, r14);
                        r12 = r14 + 1 + 1;
                    }
                }
                return new String(cArr, 0, r14);
            }
        }

        @Override // com.google.protobuf.a2.b
        int e(CharSequence charSequence, byte[] bArr, int r25, int r26) {
            char c5;
            long j4;
            long j5;
            long j6;
            int r12;
            char charAt;
            long j7 = r25;
            long j8 = r26 + j7;
            int length = charSequence.length();
            if (length > r26 || bArr.length - r26 < r25) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (r25 + r26));
            }
            int r22 = 0;
            while (true) {
                c5 = 128;
                j4 = 1;
                if (r22 >= length || (charAt = charSequence.charAt(r22)) >= 128) {
                    break;
                }
                z1.O(bArr, j7, (byte) charAt);
                r22++;
                j7 = 1 + j7;
            }
            if (r22 == length) {
                return (int) j7;
            }
            while (r22 < length) {
                char charAt2 = charSequence.charAt(r22);
                if (charAt2 >= c5 || j7 >= j8) {
                    if (charAt2 < 2048 && j7 <= j8 - 2) {
                        long j9 = j7 + j4;
                        z1.O(bArr, j7, (byte) ((charAt2 >>> 6) | 960));
                        z1.O(bArr, j9, (byte) ((charAt2 & '?') | 128));
                        j5 = j9 + j4;
                        j6 = j4;
                    } else {
                        if ((charAt2 >= 55296 && 57343 >= charAt2) || j7 > j8 - 3) {
                            if (j7 > j8 - 4) {
                                if (55296 <= charAt2 && charAt2 <= 57343 && ((r12 = r22 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(r12)))) {
                                    throw new d(r22, length);
                                }
                                throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j7);
                            }
                            int r32 = r22 + 1;
                            if (r32 != length) {
                                char charAt3 = charSequence.charAt(r32);
                                if (Character.isSurrogatePair(charAt2, charAt3)) {
                                    int codePoint = Character.toCodePoint(charAt2, charAt3);
                                    long j10 = j7 + 1;
                                    z1.O(bArr, j7, (byte) ((codePoint >>> 18) | 240));
                                    long j11 = j10 + 1;
                                    z1.O(bArr, j10, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j12 = j11 + 1;
                                    z1.O(bArr, j11, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j6 = 1;
                                    j5 = j12 + 1;
                                    z1.O(bArr, j12, (byte) ((codePoint & 63) | 128));
                                    r22 = r32;
                                } else {
                                    r22 = r32;
                                }
                            }
                            throw new d(r22 - 1, length);
                        }
                        long j13 = j7 + j4;
                        z1.O(bArr, j7, (byte) ((charAt2 >>> '\f') | 480));
                        long j14 = j13 + j4;
                        z1.O(bArr, j13, (byte) (((charAt2 >>> 6) & 63) | 128));
                        z1.O(bArr, j14, (byte) ((charAt2 & '?') | 128));
                        j5 = j14 + 1;
                        j6 = 1;
                    }
                    r22++;
                    c5 = 128;
                    long j15 = j6;
                    j7 = j5;
                    j4 = j15;
                } else {
                    long j16 = j7 + j4;
                    z1.O(bArr, j7, (byte) charAt2);
                    j6 = j4;
                    j5 = j16;
                }
                r22++;
                c5 = 128;
                long j152 = j6;
                j7 = j5;
                j4 = j152;
            }
            return (int) j7;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
        
            if (com.google.protobuf.z1.x(r13, r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.protobuf.z1.x(r13, r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.a2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int i(int r12, byte[] r13, int r14, int r15) {
            /*
                Method dump skipped, instructions count: 204
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.i(int, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0063, code lost:
        
            if (com.google.protobuf.z1.w(r2) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00a8, code lost:
        
            if (com.google.protobuf.z1.w(r2) > (-65)) goto L59;
         */
        @Override // com.google.protobuf.a2.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        int l(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.a2.e.l(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    static {
        f2795a = (!e.m() || com.google.protobuf.d.c()) ? new c() : new e();
    }

    static String g(ByteBuffer byteBuffer, int r22, int r32) {
        return f2795a.a(byteBuffer, r22, r32);
    }

    static String h(byte[] bArr, int r22, int r32) {
        return f2795a.b(bArr, r22, r32);
    }

    static int i(CharSequence charSequence, byte[] bArr, int r32, int r4) {
        return f2795a.e(charSequence, bArr, r32, r4);
    }

    static int j(CharSequence charSequence) {
        int length = charSequence.length();
        int r12 = 0;
        while (r12 < length && charSequence.charAt(r12) < 128) {
            r12++;
        }
        int r22 = length;
        while (true) {
            if (r12 < length) {
                char charAt = charSequence.charAt(r12);
                if (charAt >= 2048) {
                    r22 += k(charSequence, r12);
                    break;
                }
                r22 += (127 - charAt) >>> 31;
                r12++;
            } else {
                break;
            }
        }
        if (r22 >= length) {
            return r22;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (r22 + 4294967296L));
    }

    private static int k(CharSequence charSequence, int r5) {
        int length = charSequence.length();
        int r12 = 0;
        while (r5 < length) {
            char charAt = charSequence.charAt(r5);
            if (charAt < 2048) {
                r12 += (127 - charAt) >>> 31;
            } else {
                r12 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, r5) < 65536) {
                        throw new d(r5, length);
                    }
                    r5++;
                }
            }
            r5++;
        }
        return r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int l(ByteBuffer byteBuffer, int r7, int r8) {
        int r82 = r8 - 7;
        int r02 = r7;
        while (r02 < r82 && (byteBuffer.getLong(r02) & (-9187201950435737472L)) == 0) {
            r02 += 8;
        }
        return r02 - r7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(int r12) {
        if (r12 > -12) {
            return -1;
        }
        return r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(int r12, int r22) {
        if (r12 > -12 || r22 > -65) {
            return -1;
        }
        return r12 ^ (r22 << 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int o(int r12, int r22, int r32) {
        if (r12 > -12 || r22 > -65 || r32 > -65) {
            return -1;
        }
        return (r12 ^ (r22 << 8)) ^ (r32 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int p(ByteBuffer byteBuffer, int r32, int r4, int r5) {
        if (r5 == 0) {
            return m(r32);
        }
        if (r5 == 1) {
            return n(r32, byteBuffer.get(r4));
        }
        if (r5 == 2) {
            return o(r32, byteBuffer.get(r4), byteBuffer.get(r4 + 1));
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int q(byte[] bArr, int r4, int r5) {
        byte b5 = bArr[r4 - 1];
        int r52 = r5 - r4;
        if (r52 == 0) {
            return m(b5);
        }
        if (r52 == 1) {
            return n(b5, bArr[r4]);
        }
        if (r52 == 2) {
            return o(b5, bArr[r4], bArr[r4 + 1]);
        }
        throw new AssertionError();
    }

    static boolean r(ByteBuffer byteBuffer) {
        return f2795a.f(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public static boolean s(byte[] bArr) {
        return f2795a.g(bArr, 0, bArr.length);
    }

    public static boolean t(byte[] bArr, int r22, int r32) {
        return f2795a.g(bArr, r22, r32);
    }

    static int u(int r12, ByteBuffer byteBuffer, int r32, int r4) {
        return f2795a.h(r12, byteBuffer, r32, r4);
    }

    public static int v(int r12, byte[] bArr, int r32, int r4) {
        return f2795a.i(r12, bArr, r32, r4);
    }
}
