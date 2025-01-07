package com.google.firebase.auth;

/* loaded from: classes.dex */
final class f2 implements o0.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f2499a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z f2500b;

    f2(z zVar, e eVar) {
        this.f2500b = zVar;
        this.f2499a = eVar;
    }

    @Override // o0.a
    public final /* bridge */ /* synthetic */ Object a(o0.h hVar) {
        return FirebaseAuth.getInstance(this.f2500b.C0()).b0(this.f2499a, (String) w.r.i(((b0) hVar.m()).g()));
    }
}
