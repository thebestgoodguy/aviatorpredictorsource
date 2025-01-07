package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import a1.w0;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.h;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class yk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final oh f2388w;

    public yk(h hVar, String str) {
        super(2);
        r.j(hVar, "credential cannot be null");
        cq a5 = w0.a(hVar, str);
        a5.j0(false);
        this.f2388w = new oh(a5);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "reauthenticateWithCredentialWithData";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.A(this.f2388w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        if (!this.f1474d.e().equalsIgnoreCase(o4.e())) {
            l(new Status(17024));
        } else {
            ((v0) this.f1475e).c(this.f1479i, o4);
            m(new g1(o4));
        }
    }
}
