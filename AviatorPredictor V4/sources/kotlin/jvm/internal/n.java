package kotlin.jvm.internal;

import u3.o;
import u3.p;
import u3.q;
import u3.r;
import u3.s;
import u3.t;
import u3.u;
import u3.v;
import u3.w;

/* loaded from: classes.dex */
public class n {
    public static Object a(Object obj, int r32) {
        if (obj != null && !c(obj, r32)) {
            f(obj, "kotlin.jvm.functions.Function" + r32);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof f) {
            return ((f) obj).getArity();
        }
        if (obj instanceof u3.a) {
            return 0;
        }
        if (obj instanceof u3.l) {
            return 1;
        }
        if (obj instanceof p) {
            return 2;
        }
        if (obj instanceof q) {
            return 3;
        }
        if (obj instanceof r) {
            return 4;
        }
        if (obj instanceof s) {
            return 5;
        }
        if (obj instanceof t) {
            return 6;
        }
        if (obj instanceof u) {
            return 7;
        }
        if (obj instanceof v) {
            return 8;
        }
        if (obj instanceof w) {
            return 9;
        }
        if (obj instanceof u3.b) {
            return 10;
        }
        if (obj instanceof u3.c) {
            return 11;
        }
        if (obj instanceof u3.d) {
            return 12;
        }
        if (obj instanceof u3.e) {
            return 13;
        }
        if (obj instanceof u3.f) {
            return 14;
        }
        if (obj instanceof u3.g) {
            return 15;
        }
        if (obj instanceof u3.h) {
            return 16;
        }
        if (obj instanceof u3.i) {
            return 17;
        }
        if (obj instanceof u3.j) {
            return 18;
        }
        if (obj instanceof u3.k) {
            return 19;
        }
        if (obj instanceof u3.m) {
            return 20;
        }
        if (obj instanceof u3.n) {
            return 21;
        }
        return obj instanceof o ? 22 : -1;
    }

    public static boolean c(Object obj, int r22) {
        return (obj instanceof k3.c) && b(obj) == r22;
    }

    private static <T extends Throwable> T d(T t4) {
        return (T) i.h(t4, n.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
