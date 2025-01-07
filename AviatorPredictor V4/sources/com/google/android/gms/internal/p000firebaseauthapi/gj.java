package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.n0;

/* loaded from: classes.dex */
final class gj implements hn {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hn f1680a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ hj f1681b;

    gj(hj hjVar, hn hnVar) {
        this.f1681b = hjVar;
        this.f1680a = hnVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.hn
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        lq lqVar = (lq) obj;
        if (TextUtils.isEmpty(lqVar.f())) {
            this.f1681b.f1727c.o(new bp(lqVar.e(), lqVar.b(), Long.valueOf(lqVar.a()), "Bearer"), null, "phone", Boolean.valueOf(lqVar.g()), null, this.f1681b.f1726b, this.f1680a);
        } else {
            this.f1681b.f1726b.g(new Status(17025), n0.p0(lqVar.c(), lqVar.f()));
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gn
    public final void d(String str) {
        this.f1680a.d(str);
    }
}
