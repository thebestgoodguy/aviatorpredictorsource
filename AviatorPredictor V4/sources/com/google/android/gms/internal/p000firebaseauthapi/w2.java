package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
class w2 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    private final q7 f2260a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f2261b;

    public w2(q7 q7Var, Class cls) {
        if (!q7Var.j().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", q7Var.toString(), cls.getName()));
        }
        this.f2260a = q7Var;
        this.f2261b = cls;
    }

    private final v2 g() {
        return new v2(this.f2260a.a());
    }

    private final Object h(e0 e0Var) {
        if (Void.class.equals(this.f2261b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f2260a.d(e0Var);
        return this.f2260a.i(e0Var, this.f2261b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u2
    public final Object a(hr hrVar) {
        try {
            return h(this.f2260a.b(hrVar));
        } catch (h e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f2260a.h().getName()), e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u2
    public final sc b(hr hrVar) {
        try {
            e0 a5 = g().a(hrVar);
            rc z4 = sc.z();
            z4.p(this.f2260a.c());
            z4.q(a5.g());
            z4.r(this.f2260a.f());
            return (sc) z4.f();
        } catch (h e5) {
            throw new GeneralSecurityException("Unexpected proto", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u2
    public final String d() {
        return this.f2260a.c();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u2
    public final Object e(e0 e0Var) {
        String concat = "Expected proto of type ".concat(this.f2260a.h().getName());
        if (this.f2260a.h().isInstance(e0Var)) {
            return h(e0Var);
        }
        throw new GeneralSecurityException(concat);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.u2
    public final e0 f(hr hrVar) {
        try {
            return g().a(hrVar);
        } catch (h e5) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.f2260a.a().e().getName()), e5);
        }
    }
}
