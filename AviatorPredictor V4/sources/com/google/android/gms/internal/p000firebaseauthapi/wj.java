package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class wj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f2284a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bp f2285b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xj f2286c;

    wj(xj xjVar, hn hnVar, bp bpVar) {
        this.f2286c = xjVar;
        this.f2284a = hnVar;
        this.f2285b = bpVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List j02 = ((so) obj).j0();
        if (j02 == null || j02.isEmpty()) {
            this.f2284a.d("No users");
        } else {
            this.f2286c.f2338a.i(this.f2285b, (uo) j02.get(0));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2284a.d(str);
    }
}
