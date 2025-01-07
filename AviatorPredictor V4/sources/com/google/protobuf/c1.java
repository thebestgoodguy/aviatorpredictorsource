package com.google.protobuf;

/* loaded from: classes.dex */
final class c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final a1 f2838a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final a1 f2839b = new b1();

    static a1 a() {
        return f2838a;
    }

    static a1 b() {
        return f2839b;
    }

    private static a1 c() {
        try {
            return (a1) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
