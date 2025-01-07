package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.e;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class vl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final li f2245w;

    public vl(String str, String str2, e eVar) {
        super(6);
        r.e(str);
        r.e(str2);
        r.i(eVar);
        this.f2245w = new li(str, str2, eVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.f(this.f2245w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(null);
    }
}
