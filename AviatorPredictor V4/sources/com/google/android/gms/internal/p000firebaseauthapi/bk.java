package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class bk implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f1427a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f1428b;

    bk(ik ikVar, am amVar) {
        this.f1428b = ikVar;
        this.f1427a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        eq eqVar = (eq) obj;
        if (eqVar.m()) {
            this.f1427a.f(new pi(eqVar.g(), eqVar.l(), eqVar.b()));
        } else {
            ik.t(this.f1428b, eqVar, this.f1427a, this);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1427a.h(l.a(str));
    }
}
