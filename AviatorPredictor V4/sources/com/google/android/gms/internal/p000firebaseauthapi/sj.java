package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class sj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ tj f2136a;

    sj(tj tjVar) {
        this.f2136a = tjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        mo moVar = (mo) obj;
        bp bpVar = new bp(moVar.b(), moVar.a(), Long.valueOf(dp.a(moVar.a())), "Bearer");
        tj tjVar = this.f2136a;
        tjVar.f2162c.o(bpVar, null, null, Boolean.FALSE, null, tjVar.f2161b, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2136a.f2161b.h(l.a(str));
    }
}
