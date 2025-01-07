package com.google.android.gms.internal.p000firebaseauthapi;

import a1.v0;
import com.google.firebase.auth.y0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class ul extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final y0 f2198w;

    public ul(y0 y0Var) {
        super(2);
        this.f2198w = (y0) r.j(y0Var, "request cannot be null");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.e(new ii(this.f2198w, this.f1474d.H0()), this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        ((v0) this.f1475e).c(this.f1479i, yl.o(this.f1473c, this.f1480j));
        m(null);
    }
}
