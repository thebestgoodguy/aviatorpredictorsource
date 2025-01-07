package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class ck implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f1468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f1469b;

    ck(ik ikVar, am amVar) {
        this.f1469b = ikVar;
        this.f1468a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        vp vpVar = (vp) obj;
        this.f1469b.o(new bp(vpVar.c(), vpVar.b(), Long.valueOf(vpVar.a()), "Bearer"), null, null, Boolean.TRUE, null, this.f1468a, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1468a.h(l.a(str));
    }
}
