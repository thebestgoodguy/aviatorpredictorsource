package com.google.android.gms.internal.p000firebaseauthapi;

import a1.d1;
import com.google.android.gms.common.api.Status;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class wl extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final gg f2288w;

    public wl(String str, String str2) {
        super(4);
        r.f(str, "code cannot be null or empty");
        this.f2288w = new gg(str, str2);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "verifyPasswordResetCode";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.k(this.f2288w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        if (new d1(this.f1482l).a() != 0) {
            l(new Status(17499));
        } else {
            m(this.f1482l.k0());
        }
    }
}
