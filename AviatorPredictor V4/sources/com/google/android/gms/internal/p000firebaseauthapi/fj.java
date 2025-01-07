package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class fj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1644a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f1645b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ am f1646c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ik f1647d;

    fj(ik ikVar, String str, String str2, am amVar) {
        this.f1647d = ikVar;
        this.f1644a = str;
        this.f1645b = str2;
        this.f1646c = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bp bpVar = (bp) obj;
        sp spVar = new sp();
        spVar.e(bpVar.m0());
        spVar.d(this.f1644a);
        spVar.g(this.f1645b);
        ik.u(this.f1647d, this.f1646c, bpVar, spVar, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1646c.h(l.a(str));
    }
}
