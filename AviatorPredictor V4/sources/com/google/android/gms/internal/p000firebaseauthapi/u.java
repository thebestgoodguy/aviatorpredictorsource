package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class u implements c0 {

    /* renamed from: a, reason: collision with root package name */
    private final c0[] f2180a;

    u(c0... c0VarArr) {
        this.f2180a = c0VarArr;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.c0
    public final a0 a(Class cls) {
        c0[] c0VarArr = this.f2180a;
        for (int r12 = 0; r12 < 2; r12++) {
            c0 c0Var = c0VarArr[r12];
            if (c0Var.b(cls)) {
                return c0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.c0
    public final boolean b(Class cls) {
        c0[] c0VarArr = this.f2180a;
        for (int r22 = 0; r22 < 2; r22++) {
            if (c0VarArr[r22].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
