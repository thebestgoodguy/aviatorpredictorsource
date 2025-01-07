package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class rj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2092a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2093b;

    rj(ik ikVar, am amVar) {
        this.f2093b = ikVar;
        this.f2092a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        gq gqVar = (gq) obj;
        this.f2093b.o(new bp(gqVar.l0(), gqVar.k0(), Long.valueOf(gqVar.j0()), "Bearer"), null, null, Boolean.valueOf(gqVar.m0()), null, this.f2092a, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2092a.h(l.a(str));
    }
}
