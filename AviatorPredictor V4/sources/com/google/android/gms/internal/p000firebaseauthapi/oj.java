package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class oj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ pj f1997a;

    oj(pj pjVar) {
        this.f1997a = pjVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        oq oqVar = (oq) obj;
        if (TextUtils.isEmpty(oqVar.a()) || TextUtils.isEmpty(oqVar.b())) {
            this.f1997a.f2030b.h(l.a("INTERNAL_SUCCESS_SIGN_OUT"));
            return;
        }
        bp bpVar = new bp(oqVar.b(), oqVar.a(), Long.valueOf(dp.a(oqVar.a())), "Bearer");
        pj pjVar = this.f1997a;
        pjVar.f2031c.o(bpVar, null, null, Boolean.FALSE, null, pjVar.f2030b, this);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1997a.f2030b.h(l.a(str));
    }
}
