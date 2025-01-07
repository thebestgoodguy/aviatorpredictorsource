package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class gs implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final gs f1690a = new gs();

    private gs() {
    }

    public static gs c() {
        return f1690a;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.c0
    public final a0 a(Class cls) {
        if (!ks.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (a0) ks.u(cls.asSubclass(ks.class)).r(3, null, null);
        } catch (Exception e5) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.c0
    public final boolean b(Class cls) {
        return ks.class.isAssignableFrom(cls);
    }
}
