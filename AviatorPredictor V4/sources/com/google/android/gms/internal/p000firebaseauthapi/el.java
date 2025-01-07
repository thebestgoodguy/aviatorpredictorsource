package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.e;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class el extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final hh f1563w;

    /* renamed from: x, reason: collision with root package name */
    private final String f1564x;

    public el(String str, e eVar, String str2, String str3) {
        super(4);
        r.f(str, "email cannot be null or empty");
        this.f1563w = new hh(str, eVar, str2);
        this.f1564x = str3;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return this.f1564x;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.x(this.f1563w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m(null);
    }
}
