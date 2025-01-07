package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class xj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2338a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2339b;

    xj(ik ikVar, am amVar) {
        this.f2339b = ikVar;
        this.f2338a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        bp bpVar = (bp) obj;
        ro roVar = new ro(bpVar.m0());
        inVar = this.f2339b.f1778a;
        inVar.g(roVar, new wj(this, this, bpVar));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2338a.h(l.a(str));
    }
}
