package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.List;

/* loaded from: classes.dex */
final class vi implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ gn f2238a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f2239b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bp f2240c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ sp f2241d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ik f2242e;

    vi(ik ikVar, gn gnVar, am amVar, bp bpVar, sp spVar) {
        this.f2242e = ikVar;
        this.f2238a = gnVar;
        this.f2239b = amVar;
        this.f2240c = bpVar;
        this.f2241d = spVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        List j02 = ((so) obj).j0();
        if (j02 == null || j02.isEmpty()) {
            this.f2238a.d("No users");
        } else {
            ik.v(this.f2242e, this.f2239b, this.f2240c, (uo) j02.get(0), this.f2241d, this.f2238a);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f2238a.d(str);
    }
}
