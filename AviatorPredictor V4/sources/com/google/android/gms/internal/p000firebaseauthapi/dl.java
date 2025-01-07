package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.e;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class dl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final fh f1521w;

    public dl(String str, e eVar) {
        super(6);
        r.f(str, "token cannot be null or empty");
        this.f1521w = new fh(str, eVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "sendEmailVerification";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.w(this.f1521w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(null);
    }
}
