package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class kj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f1855a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f1856b;

    kj(ik ikVar, am amVar) {
        this.f1856b = ikVar;
        this.f1855a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bp bpVar = (bp) obj;
        sp spVar = new sp();
        spVar.e(bpVar.m0());
        spVar.d(null);
        spVar.g(null);
        ik.u(this.f1856b, this.f1855a, bpVar, spVar, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1855a.h(l.a(str));
    }
}
