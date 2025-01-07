package kotlin.jvm.internal;

import java.util.Arrays;
import k3.r;

/* loaded from: classes.dex */
public class i {
    private i() {
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj == null) {
            j();
        }
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        throw ((NullPointerException) g(new NullPointerException(str + " must not be null")));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            k(str);
        }
    }

    public static int e(int r02, int r12) {
        if (r02 < r12) {
            return -1;
        }
        return r02 == r12 ? 0 : 1;
    }

    private static String f(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[4];
        return "Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str;
    }

    private static <T extends Throwable> T g(T t4) {
        return (T) h(t4, i.class.getName());
    }

    static <T extends Throwable> T h(T t4, String str) {
        StackTraceElement[] stackTrace = t4.getStackTrace();
        int length = stackTrace.length;
        int r22 = -1;
        for (int r32 = 0; r32 < length; r32++) {
            if (str.equals(stackTrace[r32].getClassName())) {
                r22 = r32;
            }
        }
        t4.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, r22 + 1, length));
        return t4;
    }

    public static String i(String str, Object obj) {
        return str + obj;
    }

    public static void j() {
        throw ((NullPointerException) g(new NullPointerException()));
    }

    private static void k(String str) {
        throw ((NullPointerException) g(new NullPointerException(f(str))));
    }

    public static void l(String str) {
        throw ((r) g(new r(str)));
    }

    public static void m(String str) {
        l("lateinit property " + str + " has not been initialized");
    }
}
