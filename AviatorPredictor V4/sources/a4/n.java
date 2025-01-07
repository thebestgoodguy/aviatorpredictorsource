package a4;

import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends m {

    static final class a extends kotlin.jvm.internal.j implements u3.p<CharSequence, Integer, k3.l<? extends Integer, ? extends Integer>> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List<String> f170e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f171f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, boolean z4) {
            super(2);
            this.f170e = list;
            this.f171f = z4;
        }

        public final k3.l<Integer, Integer> a(CharSequence charSequence, int r5) {
            kotlin.jvm.internal.i.d(charSequence, "$this$$receiver");
            k3.l s4 = n.s(charSequence, this.f170e, r5, this.f171f, false);
            if (s4 == null) {
                return null;
            }
            return k3.p.a(s4.c(), Integer.valueOf(((String) s4.d()).length()));
        }

        @Override // u3.p
        public /* bridge */ /* synthetic */ k3.l<? extends Integer, ? extends Integer> invoke(CharSequence charSequence, Integer num) {
            return a(charSequence, num.intValue());
        }
    }

    static final class b extends kotlin.jvm.internal.j implements u3.l<x3.c, String> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CharSequence f172e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence) {
            super(1);
            this.f172e = charSequence;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(x3.c cVar) {
            kotlin.jvm.internal.i.d(cVar, "it");
            return n.P(this.f172e, cVar);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, String str, int r32, boolean z4, int r5, Object obj) {
        if ((r5 & 2) != 0) {
            r32 = 0;
        }
        if ((r5 & 4) != 0) {
            z4 = false;
        }
        return w(charSequence, str, r32, z4);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int r10, boolean z4) {
        int a5;
        boolean z5;
        char g5;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cArr, "chars");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            g5 = l3.e.g(cArr);
            return ((String) charSequence).indexOf(g5, r10);
        }
        a5 = x3.f.a(r10, 0);
        int u4 = u(charSequence);
        if (a5 > u4) {
            return -1;
        }
        while (true) {
            int r32 = a5 + 1;
            char charAt = charSequence.charAt(a5);
            int length = cArr.length;
            int r6 = 0;
            while (true) {
                if (r6 >= length) {
                    z5 = false;
                    break;
                }
                char c5 = cArr[r6];
                r6++;
                if (a4.b.d(c5, charAt, z4)) {
                    z5 = true;
                    break;
                }
            }
            if (z5) {
                return a5;
            }
            if (a5 == u4) {
                return -1;
            }
            a5 = r32;
        }
    }

    public static final int C(CharSequence charSequence, char c5, int r4, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? G(charSequence, new char[]{c5}, r4, z4) : ((String) charSequence).lastIndexOf(c5, r4);
    }

    public static final int D(CharSequence charSequence, String str, int r8, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(str, "string");
        return (z4 || !(charSequence instanceof String)) ? x(charSequence, str, r8, 0, z4, true) : ((String) charSequence).lastIndexOf(str, r8);
    }

    public static /* synthetic */ int E(CharSequence charSequence, char c5, int r22, boolean z4, int r4, Object obj) {
        if ((r4 & 2) != 0) {
            r22 = u(charSequence);
        }
        if ((r4 & 4) != 0) {
            z4 = false;
        }
        return C(charSequence, c5, r22, z4);
    }

    public static /* synthetic */ int F(CharSequence charSequence, String str, int r22, boolean z4, int r4, Object obj) {
        if ((r4 & 2) != 0) {
            r22 = u(charSequence);
        }
        if ((r4 & 4) != 0) {
            z4 = false;
        }
        return D(charSequence, str, r22, z4);
    }

    public static final int G(CharSequence charSequence, char[] cArr, int r9, boolean z4) {
        int c5;
        char g5;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cArr, "chars");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            g5 = l3.e.g(cArr);
            return ((String) charSequence).lastIndexOf(g5, r9);
        }
        c5 = x3.f.c(r9, u(charSequence));
        if (c5 < 0) {
            return -1;
        }
        while (true) {
            int r12 = c5 - 1;
            char charAt = charSequence.charAt(c5);
            int length = cArr.length;
            boolean z5 = false;
            int r5 = 0;
            while (true) {
                if (r5 >= length) {
                    break;
                }
                char c6 = cArr[r5];
                r5++;
                if (a4.b.d(c6, charAt, z4)) {
                    z5 = true;
                    break;
                }
            }
            if (z5) {
                return c5;
            }
            if (r12 < 0) {
                return -1;
            }
            c5 = r12;
        }
    }

    public static final z3.b<String> H(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return O(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> I(CharSequence charSequence) {
        List<String> e5;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        e5 = z3.h.e(H(charSequence));
        return e5;
    }

    private static final z3.b<x3.c> J(CharSequence charSequence, String[] strArr, int r4, boolean z4, int r6) {
        List a5;
        M(r6);
        a5 = l3.d.a(strArr);
        return new c(charSequence, r4, r6, new a(a5, z4));
    }

    static /* synthetic */ z3.b K(CharSequence charSequence, String[] strArr, int r32, boolean z4, int r5, int r6, Object obj) {
        if ((r6 & 2) != 0) {
            r32 = 0;
        }
        if ((r6 & 4) != 0) {
            z4 = false;
        }
        if ((r6 & 8) != 0) {
            r5 = 0;
        }
        return J(charSequence, strArr, r32, z4, r5);
    }

    public static final boolean L(CharSequence charSequence, int r5, CharSequence charSequence2, int r7, int r8, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(charSequence2, "other");
        if (r7 < 0 || r5 < 0 || r5 > charSequence.length() - r8 || r7 > charSequence2.length() - r8) {
            return false;
        }
        int r12 = 0;
        while (r12 < r8) {
            int r22 = r12 + 1;
            if (!a4.b.d(charSequence.charAt(r5 + r12), charSequence2.charAt(r12 + r7), z4)) {
                return false;
            }
            r12 = r22;
        }
        return true;
    }

    public static final void M(int r12) {
        if (!(r12 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.i.i("Limit must be non-negative, but was ", Integer.valueOf(r12)).toString());
        }
    }

    public static final z3.b<String> N(CharSequence charSequence, String[] strArr, boolean z4, int r11) {
        z3.b<String> c5;
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(strArr, "delimiters");
        c5 = z3.h.c(K(charSequence, strArr, 0, z4, r11, 2, null), new b(charSequence));
        return c5;
    }

    public static /* synthetic */ z3.b O(CharSequence charSequence, String[] strArr, boolean z4, int r4, int r5, Object obj) {
        if ((r5 & 2) != 0) {
            z4 = false;
        }
        if ((r5 & 4) != 0) {
            r4 = 0;
        }
        return N(charSequence, strArr, z4, r4);
    }

    public static final String P(CharSequence charSequence, x3.c cVar) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(cVar, "range");
        return charSequence.subSequence(cVar.u().intValue(), cVar.t().intValue() + 1).toString();
    }

    public static final String Q(String str, char c5, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int z4 = z(str, c5, 0, false, 6, null);
        if (z4 == -1) {
            return str2;
        }
        String substring = str.substring(z4 + 1, str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String R(String str, String str2, String str3) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "delimiter");
        kotlin.jvm.internal.i.d(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(A + str2.length(), str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String S(String str, char c5, String str2, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            str2 = str;
        }
        return Q(str, c5, str2);
    }

    public static /* synthetic */ String T(String str, String str2, String str3, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            str3 = str;
        }
        return R(str, str2, str3);
    }

    public static final String U(String str, char c5, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int E = E(str, c5, 0, false, 6, null);
        if (E == -1) {
            return str2;
        }
        String substring = str.substring(E + 1, str.length());
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String V(String str, char c5, String str2, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            str2 = str;
        }
        return U(str, c5, str2);
    }

    public static final String W(String str, char c5, String str2) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "missingDelimiterValue");
        int z4 = z(str, c5, 0, false, 6, null);
        if (z4 == -1) {
            return str2;
        }
        String substring = str.substring(0, z4);
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String X(String str, String str2, String str3) {
        kotlin.jvm.internal.i.d(str, "<this>");
        kotlin.jvm.internal.i.d(str2, "delimiter");
        kotlin.jvm.internal.i.d(str3, "missingDelimiterValue");
        int A = A(str, str2, 0, false, 6, null);
        if (A == -1) {
            return str3;
        }
        String substring = str.substring(0, A);
        kotlin.jvm.internal.i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String Y(String str, char c5, String str2, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            str2 = str;
        }
        return W(str, c5, str2);
    }

    public static /* synthetic */ String Z(String str, String str2, String str3, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            str3 = str;
        }
        return X(str, str2, str3);
    }

    public static CharSequence a0(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int r22 = 0;
        boolean z4 = false;
        while (r22 <= length) {
            boolean c5 = a4.a.c(charSequence.charAt(!z4 ? r22 : length));
            if (z4) {
                if (!c5) {
                    break;
                }
                length--;
            } else if (c5) {
                r22++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(r22, length + 1);
    }

    public static final boolean q(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (A(charSequence, (String) charSequence2, 0, z4, 2, null) >= 0) {
                return true;
            }
        } else if (y(charSequence, charSequence2, 0, charSequence.length(), z4, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean r(CharSequence charSequence, CharSequence charSequence2, boolean z4, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            z4 = false;
        }
        return q(charSequence, charSequence2, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0093, code lost:
    
        return k3.p.a(java.lang.Integer.valueOf(r13), r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final k3.l<java.lang.Integer, java.lang.String> s(java.lang.CharSequence r11, java.util.Collection<java.lang.String> r12, int r13, boolean r14, boolean r15) {
        /*
            r0 = 0
            if (r14 != 0) goto L2d
            int r1 = r12.size()
            r2 = 1
            if (r1 != r2) goto L2d
            java.lang.Object r12 = l3.g.n(r12)
            java.lang.String r12 = (java.lang.String) r12
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r11
            r2 = r12
            r3 = r13
            if (r15 != 0) goto L1d
            int r11 = a4.d.A(r1, r2, r3, r4, r5, r6)
            goto L21
        L1d:
            int r11 = a4.d.F(r1, r2, r3, r4, r5, r6)
        L21:
            if (r11 >= 0) goto L24
            goto L2c
        L24:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            k3.l r0 = k3.p.a(r11, r12)
        L2c:
            return r0
        L2d:
            r1 = 0
            if (r15 != 0) goto L3e
            x3.c r15 = new x3.c
            int r13 = x3.d.a(r13, r1)
            int r1 = r11.length()
            r15.<init>(r13, r1)
            goto L4a
        L3e:
            int r15 = u(r11)
            int r13 = x3.d.c(r13, r15)
            x3.a r15 = x3.d.f(r13, r1)
        L4a:
            boolean r13 = r11 instanceof java.lang.String
            if (r13 == 0) goto L99
            int r13 = r15.i()
            int r1 = r15.p()
            int r15 = r15.q()
            if (r15 <= 0) goto L5e
            if (r13 <= r1) goto L62
        L5e:
            if (r15 >= 0) goto Lda
            if (r1 > r13) goto Lda
        L62:
            int r8 = r13 + r15
            java.util.Iterator r9 = r12.iterator()
        L68:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r10 = r9.next()
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r11
            java.lang.String r4 = (java.lang.String) r4
            int r6 = r2.length()
            r5 = r13
            r7 = r14
            boolean r2 = a4.m.m(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L68
            goto L87
        L86:
            r10 = r0
        L87:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L94
        L8b:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            k3.l r11 = k3.p.a(r11, r10)
            return r11
        L94:
            if (r13 != r1) goto L97
            goto Lda
        L97:
            r13 = r8
            goto L62
        L99:
            int r13 = r15.i()
            int r1 = r15.p()
            int r15 = r15.q()
            if (r15 <= 0) goto La9
            if (r13 <= r1) goto Lad
        La9:
            if (r15 >= 0) goto Lda
            if (r1 > r13) goto Lda
        Lad:
            int r8 = r13 + r15
            java.util.Iterator r9 = r12.iterator()
        Lb3:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lcf
            java.lang.Object r10 = r9.next()
            r2 = r10
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            int r6 = r2.length()
            r4 = r11
            r5 = r13
            r7 = r14
            boolean r2 = L(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto Lb3
            goto Ld0
        Lcf:
            r10 = r0
        Ld0:
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto Ld5
            goto L8b
        Ld5:
            if (r13 != r1) goto Ld8
            goto Lda
        Ld8:
            r13 = r8
            goto Lad
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.n.s(java.lang.CharSequence, java.util.Collection, int, boolean, boolean):k3.l");
    }

    public static final x3.c t(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return new x3.c(0, charSequence.length() - 1);
    }

    public static final int u(CharSequence charSequence) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int v(CharSequence charSequence, char c5, int r4, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        return (z4 || !(charSequence instanceof String)) ? B(charSequence, new char[]{c5}, r4, z4) : ((String) charSequence).indexOf(c5, r4);
    }

    public static final int w(CharSequence charSequence, String str, int r10, boolean z4) {
        kotlin.jvm.internal.i.d(charSequence, "<this>");
        kotlin.jvm.internal.i.d(str, "string");
        return (z4 || !(charSequence instanceof String)) ? y(charSequence, str, r10, charSequence.length(), z4, false, 16, null) : ((String) charSequence).indexOf(str, r10);
    }

    private static final int x(CharSequence charSequence, CharSequence charSequence2, int r9, int r10, boolean z4, boolean z5) {
        int c5;
        int a5;
        x3.a f5;
        int a6;
        int c6;
        if (z5) {
            c5 = x3.f.c(r9, u(charSequence));
            a5 = x3.f.a(r10, 0);
            f5 = x3.f.f(c5, a5);
        } else {
            a6 = x3.f.a(r9, 0);
            c6 = x3.f.c(r10, charSequence.length());
            f5 = new x3.c(a6, c6);
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i4 = f5.i();
            int p4 = f5.p();
            int q4 = f5.q();
            if ((q4 <= 0 || i4 > p4) && (q4 >= 0 || p4 > i4)) {
                return -1;
            }
            while (true) {
                int r6 = i4 + q4;
                if (m.m((String) charSequence2, 0, (String) charSequence, i4, charSequence2.length(), z4)) {
                    return i4;
                }
                if (i4 == p4) {
                    return -1;
                }
                i4 = r6;
            }
        } else {
            int i5 = f5.i();
            int p5 = f5.p();
            int q5 = f5.q();
            if ((q5 <= 0 || i5 > p5) && (q5 >= 0 || p5 > i5)) {
                return -1;
            }
            while (true) {
                int r62 = i5 + q5;
                if (L(charSequence2, 0, charSequence, i5, charSequence2.length(), z4)) {
                    return i5;
                }
                if (i5 == p5) {
                    return -1;
                }
                i5 = r62;
            }
        }
    }

    static /* synthetic */ int y(CharSequence charSequence, CharSequence charSequence2, int r8, int r9, boolean z4, boolean z5, int r12, Object obj) {
        return x(charSequence, charSequence2, r8, r9, z4, (r12 & 16) != 0 ? false : z5);
    }

    public static /* synthetic */ int z(CharSequence charSequence, char c5, int r32, boolean z4, int r5, Object obj) {
        if ((r5 & 2) != 0) {
            r32 = 0;
        }
        if ((r5 & 4) != 0) {
            z4 = false;
        }
        return v(charSequence, c5, r32, z4);
    }
}
