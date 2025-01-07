package com.google.firebase.auth;

/* loaded from: classes.dex */
final class g2 implements o0.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2501a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f2502b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ z f2503c;

    g2(z zVar, String str, e eVar) {
        this.f2503c = zVar;
        this.f2501a = str;
        this.f2502b = eVar;
    }

    @Override // o0.a
    public final /* bridge */ /* synthetic */ Object a(o0.h hVar) {
        return FirebaseAuth.getInstance(this.f2503c.C0()).i0((String) w.r.i(((b0) hVar.m()).g()), this.f2501a, this.f2502b);
    }
}
