package com.google.android.gms.internal.p000firebaseauthapi;

import o0.i;
import w.r;

/* loaded from: classes.dex */
final class nk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final ig f1967w;

    public nk(String str, String str2, String str3) {
        super(4);
        r.f(str, "code cannot be null or empty");
        r.f(str2, "new password cannot be null or empty");
        this.f1967w = new ig(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "confirmPasswordReset";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.l(this.f1967w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(null);
    }
}
