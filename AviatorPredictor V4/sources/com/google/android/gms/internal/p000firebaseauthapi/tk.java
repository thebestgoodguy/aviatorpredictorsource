package com.google.android.gms.internal.p000firebaseauthapi;

import a1.b0;
import a1.v0;
import android.text.TextUtils;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class tk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final tg f2163w;

    public tk(String str) {
        super(1);
        r.f(str, "refresh token cannot be null");
        this.f2163w = new tg(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "getAccessToken";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.q(this.f2163w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        if (TextUtils.isEmpty(this.f1479i.n0())) {
            this.f1479i.q0(this.f2163w.a());
        }
        ((v0) this.f1475e).c(this.f1479i, this.f1474d);
        m(b0.a(this.f1479i.m0()));
    }
}
