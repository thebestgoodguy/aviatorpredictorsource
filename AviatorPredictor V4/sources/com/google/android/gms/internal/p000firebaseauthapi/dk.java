package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import com.google.firebase.auth.y0;

/* loaded from: classes.dex */
final class dk implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ y0 f1518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ am f1519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ik f1520c;

    dk(ik ikVar, y0 y0Var, am amVar) {
        this.f1520c = ikVar;
        this.f1518a = y0Var;
        this.f1519b = amVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bp bpVar = (bp) obj;
        sp spVar = new sp();
        spVar.e(bpVar.m0());
        if (this.f1518a.k0() || this.f1518a.R() != null) {
            spVar.c(this.f1518a.R());
        }
        if (this.f1518a.l0() || this.f1518a.j0() != null) {
            spVar.h(this.f1518a.a());
        }
        ik.u(this.f1520c, this.f1519b, bpVar, spVar, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1519b.h(l.a(str));
    }
}
