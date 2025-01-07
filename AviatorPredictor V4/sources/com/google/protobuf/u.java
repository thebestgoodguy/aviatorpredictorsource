package com.google.protobuf;

/* loaded from: classes.dex */
final class u {

    /* renamed from: a, reason: collision with root package name */
    private static final s<?> f3080a = new t();

    /* renamed from: b, reason: collision with root package name */
    private static final s<?> f3081b = c();

    static s<?> a() {
        s<?> sVar = f3081b;
        if (sVar != null) {
            return sVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static s<?> b() {
        return f3080a;
    }

    private static s<?> c() {
        try {
            return (s) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
