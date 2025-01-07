package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class uj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2195a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2196b;

    uj(ik ikVar, am amVar) {
        this.f2196b = ikVar;
        this.f2195a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        oo ooVar = (oo) obj;
        this.f2196b.o(new bp(ooVar.b(), ooVar.a(), Long.valueOf(dp.a(ooVar.a())), "Bearer"), null, null, Boolean.FALSE, null, this.f2195a, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2195a.h(l.a(str));
    }
}
