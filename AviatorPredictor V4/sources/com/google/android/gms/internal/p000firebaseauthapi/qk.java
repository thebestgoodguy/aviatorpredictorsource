package com.google.android.gms.internal.p000firebaseauthapi;

import a1.m;
import java.util.List;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class qk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final vg f2065w;

    public qk(String str, String str2) {
        super(3);
        r.f(str, "email cannot be null or empty");
        this.f2065w = new vg(str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.r(this.f2065w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(new m(this.f1481k.j0() == null ? i2.t() : (List) r.i(this.f1481k.j0())));
    }
}
