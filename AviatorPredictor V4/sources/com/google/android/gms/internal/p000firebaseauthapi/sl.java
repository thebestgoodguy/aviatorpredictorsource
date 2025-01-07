package com.google.android.gms.internal.p000firebaseauthapi;

import a1.v0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class sl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final String f2138w;

    public sl(String str) {
        super(2);
        this.f2138w = r.f(str, "password cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "updatePassword";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.j(new eg(this.f1474d.H0(), this.f2138w), this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        ((v0) this.f1475e).c(this.f1479i, yl.o(this.f1473c, this.f1480j));
        m(null);
    }
}
