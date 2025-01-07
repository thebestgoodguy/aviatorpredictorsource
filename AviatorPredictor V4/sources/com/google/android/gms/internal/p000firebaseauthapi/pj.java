package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class pj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f2029a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f2030b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f2031c;

    pj(ik ikVar, String str, am amVar) {
        this.f2031c = ikVar;
        this.f2029a = str;
        this.f2030b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        in inVar;
        nq nqVar = new nq(((bp) obj).m0(), this.f2029a);
        inVar = this.f2031c.f1778a;
        inVar.t(nqVar, new oj(this));
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2030b.h(l.a(str));
    }
}
