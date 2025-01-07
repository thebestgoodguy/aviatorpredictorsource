package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import com.google.firebase.auth.n0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class ll extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final wh f1886w;

    public ll(n0 n0Var, String str) {
        super(2);
        r.i(n0Var);
        this.f1886w = new wh(n0Var, str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "signInWithPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.E(this.f1886w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        ((v0) this.f1475e).c(this.f1479i, o4);
        m(new g1(o4));
    }
}
