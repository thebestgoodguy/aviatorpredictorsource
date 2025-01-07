package com.google.protobuf;

/* loaded from: classes.dex */
class z implements u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final z f3165a = new z();

    private z() {
    }

    public static z c() {
        return f3165a;
    }

    @Override // com.google.protobuf.u0
    public boolean a(Class<?> cls) {
        return a0.class.isAssignableFrom(cls);
    }

    @Override // com.google.protobuf.u0
    public t0 b(Class<?> cls) {
        if (!a0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (t0) a0.B(cls.asSubclass(a0.class)).r();
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e5);
        }
    }
}
