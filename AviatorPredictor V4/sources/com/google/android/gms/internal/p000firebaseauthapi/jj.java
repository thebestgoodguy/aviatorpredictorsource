package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class jj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cq f1806a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1807b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1808c;

    jj(ik ikVar, cq cqVar, am amVar) {
        this.f1808c = ikVar;
        this.f1806a = cqVar;
        this.f1807b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        this.f1806a.l0(true);
        this.f1806a.k0(((bp) obj).m0());
        inVar = this.f1808c.f1778a;
        inVar.p(this.f1806a, new ij(this, this));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1807b.h(l.a(str));
    }
}
