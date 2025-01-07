package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class fk implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1648a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1649b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1650c;

    fk(ik ikVar, String str, am amVar) {
        this.f1650c = ikVar;
        this.f1648a = str;
        this.f1649b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bp bpVar = (bp) obj;
        String m02 = bpVar.m0();
        sp spVar = new sp();
        spVar.e(m02);
        spVar.g(this.f1648a);
        ik.u(this.f1650c, this.f1649b, bpVar, spVar, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1649b.h(l.a(str));
    }
}
