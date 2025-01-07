package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class y2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q7 f2371a;

    y2(q7 q7Var) {
        this.f2371a = q7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final u2 a(Class cls) {
        try {
            return new w2(this.f2371a, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final u2 b() {
        q7 q7Var = this.f2371a;
        return new w2(q7Var, q7Var.g());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Class c() {
        return this.f2371a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Set d() {
        return this.f2371a.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Class e() {
        return null;
    }
}
