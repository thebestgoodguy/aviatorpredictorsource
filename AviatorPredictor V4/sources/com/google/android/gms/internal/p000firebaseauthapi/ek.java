package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class ek implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1560a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1561b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1562c;

    ek(ik ikVar, String str, am amVar) {
        this.f1562c = ikVar;
        this.f1560a = str;
        this.f1561b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bp bpVar = (bp) obj;
        sp spVar = new sp();
        spVar.e(bpVar.m0());
        spVar.d(this.f1560a);
        ik.u(this.f1562c, this.f1561b, bpVar, spVar, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1561b.h(l.a(str));
    }
}
