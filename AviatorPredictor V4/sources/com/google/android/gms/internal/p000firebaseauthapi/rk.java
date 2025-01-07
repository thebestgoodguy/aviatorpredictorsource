package com.google.android.gms.internal.p000firebaseauthapi;

import a1.v0;
import com.google.firebase.auth.q0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class rk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final pg f2094w;

    public rk(q0 q0Var, String str, String str2) {
        super(2);
        r.i(q0Var);
        r.e(str);
        this.f2094w = new pg(q0Var.a(), str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "finalizeMfaEnrollment";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.o(this.f2094w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        ((v0) this.f1475e).c(this.f1479i, yl.o(this.f1473c, this.f1480j));
        m(null);
    }
}
