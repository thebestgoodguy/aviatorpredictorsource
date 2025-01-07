package a4;

/* loaded from: classes.dex */
class p extends o {
    public static final String b0(String str, int r22) {
        int c5;
        kotlin.jvm.internal.i.d(str, "<this>");
        if (r22 >= 0) {
            c5 = x3.f.c(r22, str.length());
            String substring = str.substring(c5);
            kotlin.jvm.internal.i.c(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + r22 + " is less than zero.").toString());
    }
}
