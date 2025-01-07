package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class bs {

    /* renamed from: a, reason: collision with root package name */
    private static final zr f1444a = new as();

    /* renamed from: b, reason: collision with root package name */
    private static final zr f1445b;

    static {
        zr zrVar;
        try {
            zrVar = (zr) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zrVar = null;
        }
        f1445b = zrVar;
    }

    static zr a() {
        zr zrVar = f1445b;
        if (zrVar != null) {
            return zrVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zr b() {
        return f1444a;
    }
}
