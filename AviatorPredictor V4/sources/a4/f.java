package a4;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f extends e {

    static final class a extends kotlin.jvm.internal.j implements u3.l<String, String> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f168e = new a();

        a() {
            super(1);
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            kotlin.jvm.internal.i.d(str, "line");
            return str;
        }
    }

    static final class b extends kotlin.jvm.internal.j implements u3.l<String, String> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f169e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f169e = str;
        }

        @Override // u3.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str) {
            kotlin.jvm.internal.i.d(str, "line");
            return kotlin.jvm.internal.i.i(this.f169e, str);
        }
    }

    private static final u3.l<String, String> b(String str) {
        return str.length() == 0 ? a.f168e : new b(str);
    }

    private static final int c(String str) {
        int length = str.length();
        int r12 = 0;
        while (true) {
            if (r12 >= length) {
                r12 = -1;
                break;
            }
            int r32 = r12 + 1;
            if (!a4.a.c(str.charAt(r12))) {
                break;
            }
            r12 = r32;
        }
        return r12 == -1 ? str.length() : r12;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String d(java.lang.String r14, java.lang.String r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.i.d(r14, r0)
            java.lang.String r0 = "newIndent"
            kotlin.jvm.internal.i.d(r15, r0)
            java.util.List r0 = a4.n.I(r14)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r0.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()
            r4 = r3
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = a4.d.l(r4)
            r4 = r4 ^ 1
            if (r4 == 0) goto L17
            r1.add(r3)
            goto L17
        L30:
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = l3.g.g(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L3f
        L57:
            java.lang.Comparable r1 = l3.g.m(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 != 0) goto L62
            r1 = 0
            goto L66
        L62:
            int r1 = r1.intValue()
        L66:
            int r14 = r14.length()
            int r3 = r15.length()
            int r4 = r0.size()
            int r3 = r3 * r4
            int r14 = r14 + r3
            u3.l r15 = b(r15)
            int r3 = l3.g.c(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
        L86:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbb
            java.lang.Object r5 = r0.next()
            int r6 = r2 + 1
            if (r2 >= 0) goto L97
            l3.g.f()
        L97:
            java.lang.String r5 = (java.lang.String) r5
            if (r2 == 0) goto L9d
            if (r2 != r3) goto La5
        L9d:
            boolean r2 = a4.d.l(r5)
            if (r2 == 0) goto La5
            r5 = 0
            goto Lb3
        La5:
            java.lang.String r2 = a4.p.b0(r5, r1)
            if (r2 != 0) goto Lac
            goto Lb3
        Lac:
            java.lang.Object r2 = r15.invoke(r2)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        Lb3:
            if (r5 != 0) goto Lb6
            goto Lb9
        Lb6:
            r4.add(r5)
        Lb9:
            r2 = r6
            goto L86
        Lbb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r14)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 124(0x7c, float:1.74E-43)
            r13 = 0
            java.lang.String r6 = "\n"
            java.lang.Appendable r14 = l3.g.j(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.StringBuilder r14 = (java.lang.StringBuilder) r14
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "mapIndexedNotNull { inde…\"\\n\")\n        .toString()"
            kotlin.jvm.internal.i.c(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.f.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String e(String str) {
        kotlin.jvm.internal.i.d(str, "<this>");
        return d(str, "");
    }
}
