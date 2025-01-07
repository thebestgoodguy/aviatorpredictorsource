package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* loaded from: classes.dex */
final class z2 implements a3 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s7 f2428a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q7 f2429b;

    z2(s7 s7Var, q7 q7Var) {
        this.f2428a = s7Var;
        this.f2429b = q7Var;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final u2 a(Class cls) {
        try {
            return new v3(this.f2428a, this.f2429b, cls);
        } catch (IllegalArgumentException e5) {
            throw new GeneralSecurityException("Primitive type not supported", e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final u2 b() {
        s7 s7Var = this.f2428a;
        return new v3(s7Var, this.f2429b, s7Var.g());
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Class c() {
        return this.f2428a.getClass();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Set d() {
        return this.f2428a.j();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.a3
    public final Class e() {
        return this.f2429b.getClass();
    }
}
