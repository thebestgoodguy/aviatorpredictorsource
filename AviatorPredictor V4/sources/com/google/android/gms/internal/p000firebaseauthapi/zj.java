package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class zj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2440a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2441b;

    zj(ik ikVar, am amVar) {
        this.f2441b = ikVar;
        this.f2440a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        ho hoVar = new ho(((bp) obj).m0());
        inVar = this.f2441b.f1778a;
        inVar.b(hoVar, new yj(this, this));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2440a.h(l.a(str));
    }
}
