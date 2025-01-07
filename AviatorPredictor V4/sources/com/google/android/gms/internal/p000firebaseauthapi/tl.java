package com.google.android.gms.internal.p000firebaseauthapi;

import a1.v0;
import com.google.firebase.auth.n0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class tl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final n0 f2164w;

    public tl(n0 n0Var) {
        super(2);
        this.f2164w = (n0) r.i(n0Var);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "updatePhoneNumber";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.u(new bh(this.f1474d.H0(), this.f2164w), this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        ((v0) this.f1475e).c(this.f1479i, yl.o(this.f1473c, this.f1480j));
        m(null);
    }
}
