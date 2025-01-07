package p3;

import a4.n;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f7126a;

    static {
        a aVar;
        Object newInstance;
        int a5 = a();
        if (a5 >= 65544) {
            try {
                try {
                    newInstance = r3.a.class.newInstance();
                    i.c(newInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object newInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                i.c(newInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    aVar = (a) newInstance2;
                } catch (ClassCastException e5) {
                    Throwable initCause = new ClassCastException("Instance classloader: " + newInstance2.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e5);
                    i.c(initCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause;
                }
            }
            try {
                aVar = (a) newInstance;
                f7126a = aVar;
            } catch (ClassCastException e6) {
                Throwable initCause2 = new ClassCastException("Instance classloader: " + newInstance.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e6);
                i.c(initCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw initCause2;
            }
        }
        if (a5 >= 65543) {
            try {
                Object newInstance3 = q3.a.class.newInstance();
                i.c(newInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        aVar = (a) newInstance3;
                    } catch (ClassCastException e7) {
                        Throwable initCause3 = new ClassCastException("Instance classloader: " + newInstance3.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e7);
                        i.c(initCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw initCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object newInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                i.c(newInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    aVar = (a) newInstance4;
                } catch (ClassCastException e8) {
                    Throwable initCause4 = new ClassCastException("Instance classloader: " + newInstance4.getClass().getClassLoader() + ", base type classloader: " + a.class.getClassLoader()).initCause(e8);
                    i.c(initCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw initCause4;
                }
            }
            f7126a = aVar;
        }
        aVar = new a();
        f7126a = aVar;
    }

    private static final int a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int z4 = n.z(property, '.', 0, false, 6, null);
        if (z4 < 0) {
            try {
                return Integer.parseInt(property) * 65536;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int r10 = z4 + 1;
        int z5 = n.z(property, '.', r10, false, 4, null);
        if (z5 < 0) {
            z5 = property.length();
        }
        String substring = property.substring(0, z4);
        i.c(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        String substring2 = property.substring(r10, z5);
        i.c(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(substring) * 65536) + Integer.parseInt(substring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
