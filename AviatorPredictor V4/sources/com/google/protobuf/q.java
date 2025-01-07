package com.google.protobuf;

/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name */
    static final Class<?> f3042a = c();

    public static r a() {
        r b5 = b("getEmptyRegistry");
        return b5 != null ? b5 : r.f3066d;
    }

    private static final r b(String str) {
        Class<?> cls = f3042a;
        if (cls == null) {
            return null;
        }
        try {
            return (r) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
