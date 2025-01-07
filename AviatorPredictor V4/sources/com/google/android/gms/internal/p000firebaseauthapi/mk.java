package com.google.android.gms.internal.p000firebaseauthapi;

import a1.d1;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class mk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final gg f1933w;

    public mk(String str, String str2) {
        super(4);
        r.f(str, "code cannot be null or empty");
        this.f1933w = new gg(str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "checkActionCode";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.k(this.f1933w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(new d1(this.f1482l));
    }
}
