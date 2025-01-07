package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import com.google.firebase.auth.j;

/* loaded from: classes.dex */
final class ti implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ j f2157a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f2158b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f2159c;

    ti(ik ikVar, j jVar, am amVar) {
        this.f2159c = ikVar;
        this.f2157a = jVar;
        this.f2158b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.f2159c.n(new io(this.f2157a, ((bp) obj).m0()), this.f2158b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2158b.h(l.a(str));
    }
}
