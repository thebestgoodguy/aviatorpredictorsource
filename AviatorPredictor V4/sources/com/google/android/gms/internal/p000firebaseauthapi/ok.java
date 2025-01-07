package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class ok extends cn {

    /* renamed from: w, reason: collision with root package name */
    final lg f1998w;

    public ok(String str, String str2, String str3) {
        super(2);
        r.f(str, "email cannot be null or empty");
        r.f(str2, "password cannot be null or empty");
        this.f1998w = new lg(str, str2, str3);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "createUserWithEmailAndPassword";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.m(this.f1998w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        ((v0) this.f1475e).c(this.f1479i, o4);
        m(new g1(o4));
    }
}
