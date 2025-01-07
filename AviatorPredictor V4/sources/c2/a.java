package c2;

import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class a {
    public static String a(String str, String str2) {
        try {
            return "Basic " + h4.f.p((str + ":" + str2).getBytes("ISO-8859-1")).d();
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
