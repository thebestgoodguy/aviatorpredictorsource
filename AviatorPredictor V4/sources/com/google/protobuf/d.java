package com.google.protobuf;

/* loaded from: classes.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f2843a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f2844b = a("libcore.io.Memory");

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f2845c;

    static {
        f2845c = (f2843a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static Class<?> b() {
        return f2844b;
    }

    static boolean c() {
        return f2843a || !(f2844b == null || f2845c);
    }
}
