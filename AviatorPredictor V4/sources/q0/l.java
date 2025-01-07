package q0;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class l {
    static {
        try {
            f.c();
        } catch (Throwable th) {
            Logger.getLogger(l.class.getName()).log(Level.WARNING, "Java 7 compatibility warning: See https://github.com/google/guava/issues/5269", (Throwable) new Exception("Guava will drop support for Java 7 in 2021. Please let us know if this will cause you problems: https://github.com/google/guava/issues/5269", th));
        }
    }

    private l() {
    }

    private static String a(int r4, int r5, String str) {
        if (r4 < 0) {
            return o.b("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return o.b("%s (%s) must be less than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String b(int r4, int r5, String str) {
        if (r4 < 0) {
            return o.b("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return o.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        StringBuilder sb = new StringBuilder(26);
        sb.append("negative size: ");
        sb.append(r5);
        throw new IllegalArgumentException(sb.toString());
    }

    private static String c(int r12, int r22, int r32) {
        return (r12 < 0 || r12 > r32) ? b(r12, r32, "start index") : (r22 < 0 || r22 > r32) ? b(r22, r32, "end index") : o.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(r22), Integer.valueOf(r12));
    }

    public static void d(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z4, String str, char c5) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, Character.valueOf(c5)));
        }
    }

    public static void g(boolean z4, String str, char c5, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, Character.valueOf(c5), obj));
        }
    }

    public static void h(boolean z4, String str, int r4) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, Integer.valueOf(r4)));
        }
    }

    public static void i(boolean z4, String str, long j4) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, Long.valueOf(j4)));
        }
    }

    public static void j(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, obj));
        }
    }

    public static void k(boolean z4, String str, Object obj, Object obj2) {
        if (!z4) {
            throw new IllegalArgumentException(o.b(str, obj, obj2));
        }
    }

    public static int l(int r12, int r22) {
        return m(r12, r22, "index");
    }

    public static int m(int r12, int r22, String str) {
        if (r12 < 0 || r12 >= r22) {
            throw new IndexOutOfBoundsException(a(r12, r22, str));
        }
        return r12;
    }

    public static <T> T n(T t4) {
        Objects.requireNonNull(t4);
        return t4;
    }

    public static <T> T o(T t4, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static <T> T p(T t4, String str, Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(o.b(str, obj));
    }

    public static int q(int r12, int r22) {
        return r(r12, r22, "index");
    }

    public static int r(int r12, int r22, String str) {
        if (r12 < 0 || r12 > r22) {
            throw new IndexOutOfBoundsException(b(r12, r22, str));
        }
        return r12;
    }

    public static void s(int r12, int r22, int r32) {
        if (r12 < 0 || r22 < r12 || r22 > r32) {
            throw new IndexOutOfBoundsException(c(r12, r22, r32));
        }
    }

    public static void t(boolean z4) {
        if (!z4) {
            throw new IllegalStateException();
        }
    }

    public static void u(boolean z4, Object obj) {
        if (!z4) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void v(boolean z4, String str, int r4) {
        if (!z4) {
            throw new IllegalStateException(o.b(str, Integer.valueOf(r4)));
        }
    }

    public static void w(boolean z4, String str, Object obj) {
        if (!z4) {
            throw new IllegalStateException(o.b(str, obj));
        }
    }
}
