package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class si implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2134a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2135b;

    si(ik ikVar, am amVar) {
        this.f2135b = ikVar;
        this.f2134a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        jq jqVar = (jq) obj;
        if (jqVar.g()) {
            this.f2134a.f(new pi(jqVar.c(), jqVar.f(), null));
        } else {
            this.f2135b.o(new bp(jqVar.e(), jqVar.b(), Long.valueOf(jqVar.a()), "Bearer"), null, null, Boolean.FALSE, null, this.f2134a, this);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2134a.h(l.a(str));
    }
}
