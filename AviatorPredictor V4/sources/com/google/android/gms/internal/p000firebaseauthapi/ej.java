package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class ej implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f1558a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f1559b;

    ej(ik ikVar, am amVar) {
        this.f1559b = ikVar;
        this.f1558a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        lq lqVar = (lq) obj;
        this.f1559b.o(new bp(lqVar.e(), lqVar.b(), Long.valueOf(lqVar.a()), "Bearer"), null, null, Boolean.valueOf(lqVar.g()), null, this.f1558a, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1558a.h(l.a(str));
    }
}
