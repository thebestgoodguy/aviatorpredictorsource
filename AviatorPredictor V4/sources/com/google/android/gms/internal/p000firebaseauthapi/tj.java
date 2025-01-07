package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class tj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ lo f2160a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f2161b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f2162c;

    tj(ik ikVar, lo loVar, am amVar) {
        this.f2162c = ikVar;
        this.f2160a = loVar;
        this.f2161b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        this.f2160a.c(((bp) obj).m0());
        inVar = this.f2162c.f1778a;
        inVar.d(this.f2160a, new sj(this));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2161b.h(l.a(str));
    }
}
