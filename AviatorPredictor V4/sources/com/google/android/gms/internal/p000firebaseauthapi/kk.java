package com.google.android.gms.internal.p000firebaseauthapi;

import o0.i;
import w.r;

/* loaded from: classes.dex */
final class kk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final ag f1857w;

    public kk(String str, String str2) {
        super(7);
        r.f(str, "code cannot be null or empty");
        this.f1857w = new ag(str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "applyActionCode";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.h(this.f1857w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(null);
    }
}
