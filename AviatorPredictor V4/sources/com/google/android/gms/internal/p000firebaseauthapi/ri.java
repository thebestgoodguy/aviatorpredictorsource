package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class ri implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2090a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2091b;

    ri(ik ikVar, am amVar) {
        this.f2091b = ikVar;
        this.f2090a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vp vpVar = (vp) obj;
        this.f2091b.o(new bp(vpVar.c(), vpVar.b(), Long.valueOf(vpVar.a()), "Bearer"), null, null, Boolean.TRUE, null, this.f2090a, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2090a.h(l.a(str));
    }
}
