package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;

/* loaded from: classes.dex */
final class ui implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ am f2193a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ik f2194b;

    ui(ik ikVar, am amVar) {
        this.f2194b = ikVar;
        this.f2193a = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        jo joVar = (jo) obj;
        if (joVar.g()) {
            this.f2193a.f(new pi(joVar.c(), joVar.f(), null));
        } else {
            this.f2194b.o(new bp(joVar.e(), joVar.b(), Long.valueOf(joVar.a()), "Bearer"), null, null, Boolean.valueOf(joVar.h()), null, this.f2193a, this);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2193a.h(l.a(str));
    }
}
