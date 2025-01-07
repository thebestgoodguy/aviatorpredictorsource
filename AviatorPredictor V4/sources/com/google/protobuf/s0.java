package com.google.protobuf;

/* loaded from: classes.dex */
final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private static final q0 f3075a = c();

    /* renamed from: b, reason: collision with root package name */
    private static final q0 f3076b = new r0();

    static q0 a() {
        return f3075a;
    }

    static q0 b() {
        return f3076b;
    }

    private static q0 c() {
        try {
            return (q0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
