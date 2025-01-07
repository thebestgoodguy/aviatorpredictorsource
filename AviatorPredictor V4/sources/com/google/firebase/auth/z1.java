package com.google.firebase.auth;

import com.google.firebase.auth.p0;

/* loaded from: classes.dex */
final class z1 extends p0.b {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p0.b f2605b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2606c;

    z1(FirebaseAuth firebaseAuth, p0.b bVar) {
        this.f2606c = firebaseAuth;
        this.f2605b = bVar;
    }

    @Override // com.google.firebase.auth.p0.b
    public final void a(String str) {
    }

    @Override // com.google.firebase.auth.p0.b
    public final void b(String str, p0.a aVar) {
        a1.l1 l1Var;
        p0.b bVar = this.f2605b;
        l1Var = this.f2606c.f2454g;
        bVar.c(p0.a(str, (String) w.r.i(l1Var.e())));
    }

    @Override // com.google.firebase.auth.p0.b
    public final void c(n0 n0Var) {
        this.f2605b.c(n0Var);
    }

    @Override // com.google.firebase.auth.p0.b
    public final void d(x0.k kVar) {
        this.f2605b.d(kVar);
    }
}
