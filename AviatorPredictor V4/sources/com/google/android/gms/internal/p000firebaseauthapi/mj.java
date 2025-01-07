package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import java.util.List;

/* loaded from: classes.dex */
final class mj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f1930a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bp f1931b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ nj f1932c;

    mj(nj njVar, hn hnVar, bp bpVar) {
        this.f1932c = njVar;
        this.f1930a = hnVar;
        this.f1931b = bpVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List j02 = ((so) obj).j0();
        if (j02 == null || j02.isEmpty()) {
            this.f1930a.d("No users.");
            return;
        }
        uo uoVar = (uo) j02.get(0);
        sp spVar = new sp();
        spVar.e(this.f1931b.m0());
        spVar.b(this.f1932c.f1964a);
        nj njVar = this.f1932c;
        ik.v(njVar.f1966c, njVar.f1965b, this.f1931b, uoVar, spVar, this.f1930a);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1932c.f1965b.h(l.a(str));
    }
}
