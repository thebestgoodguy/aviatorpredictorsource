package a4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends k {
    public static Integer f(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return g(str, 10);
    }

    public static final Integer g(String str, int r11) {
        boolean z4;
        int r22;
        kotlin.jvm.internal.i.d(str, "<this>");
        a.a(r11);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int r23 = 0;
        char charAt = str.charAt(0);
        int r5 = -2147483647;
        int r6 = 1;
        if (kotlin.jvm.internal.i.e(charAt, 48) >= 0) {
            z4 = false;
            r6 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (charAt == '-') {
                r5 = Integer.MIN_VALUE;
                z4 = true;
            } else {
                if (charAt != '+') {
                    return null;
                }
                z4 = false;
            }
        }
        int r7 = -59652323;
        while (r6 < length) {
            int r8 = r6 + 1;
            int b5 = a.b(str.charAt(r6), r11);
            if (b5 < 0) {
                return null;
            }
            if ((r23 < r7 && (r7 != -59652323 || r23 < (r7 = r5 / r11))) || (r22 = r23 * r11) < r5 + b5) {
                return null;
            }
            r23 = r22 - b5;
            r6 = r8;
        }
        return z4 ? Integer.valueOf(r23) : Integer.valueOf(-r23);
    }

    public static Long h(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return i(str, 10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Long i(java.lang.String r18, int r19) {
        /*
            r0 = r18
            r1 = r19
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.i.d(r0, r2)
            a4.a.a(r19)
            int r2 = r18.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.i.e(r5, r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 1
            if (r6 >= 0) goto L39
            if (r2 != r9) goto L2a
            return r3
        L2a:
            r6 = 45
            if (r5 != r6) goto L32
            r7 = -9223372036854775808
            r4 = 1
            goto L3a
        L32:
            r6 = 43
            if (r5 != r6) goto L38
            r4 = 1
            goto L39
        L38:
            return r3
        L39:
            r9 = 0
        L3a:
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            r10 = 0
            r12 = r5
        L42:
            if (r4 >= r2) goto L74
            int r14 = r4 + 1
            char r4 = r0.charAt(r4)
            int r4 = a4.a.b(r4, r1)
            if (r4 >= 0) goto L51
            return r3
        L51:
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L61
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 != 0) goto L60
            long r12 = (long) r1
            long r12 = r7 / r12
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 >= 0) goto L61
        L60:
            return r3
        L61:
            long r5 = (long) r1
            long r10 = r10 * r5
            long r4 = (long) r4
            long r16 = r7 + r4
            int r6 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r6 >= 0) goto L6c
            return r3
        L6c:
            long r10 = r10 - r4
            r4 = r14
            r5 = -256204778801521550(0xfc71c71c71c71c72, double:-2.772000429909333E291)
            goto L42
        L74:
            if (r9 == 0) goto L7b
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            goto L80
        L7b:
            long r0 = -r10
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.l.i(java.lang.String, int):java.lang.Long");
    }
}
