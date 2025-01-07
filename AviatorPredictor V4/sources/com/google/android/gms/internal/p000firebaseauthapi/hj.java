package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class hj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ kq f1725a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1726b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1727c;

    hj(ik ikVar, kq kqVar, am amVar) {
        this.f1727c = ikVar;
        this.f1725a = kqVar;
        this.f1726b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        this.f1725a.d(((bp) obj).m0());
        inVar = this.f1727c.f1778a;
        inVar.s(this.f1725a, new gj(this, this));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1726b.h(l.a(str));
    }
}
