package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import com.google.firebase.auth.j;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class uk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final j f2197w;

    public uk(j jVar) {
        super(2);
        this.f2197w = (j) r.j(jVar, "credential cannot be null");
        r.f(jVar.o0(), "email cannot be null");
        r.f(jVar.p0(), "password cannot be null");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.s(new xg(this.f2197w.o0(), r.e(this.f2197w.p0()), this.f1474d.H0()), this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        ((v0) this.f1475e).c(this.f1479i, o4);
        m(new g1(o4));
    }
}
