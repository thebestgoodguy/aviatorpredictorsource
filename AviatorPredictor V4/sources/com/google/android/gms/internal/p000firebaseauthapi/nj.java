package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class nj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1964a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1965b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1966c;

    nj(ik ikVar, String str, am amVar) {
        this.f1966c = ikVar;
        this.f1964a = str;
        this.f1965b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        bp bpVar = (bp) obj;
        ro roVar = new ro(bpVar.m0());
        inVar = this.f1966c.f1778a;
        inVar.g(roVar, new mj(this, this, bpVar));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1965b.h(l.a(str));
    }
}
