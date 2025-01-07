package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class ql extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final String f2066w;

    public ql(String str) {
        super(2);
        this.f2066w = r.f(str, "provider cannot be null or empty");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "unlinkFederatedCredential";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.d(new gi(this.f2066w, this.f1474d.H0()), this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        ((v0) this.f1475e).c(this.f1479i, o4);
        m(new g1(o4));
    }
}
