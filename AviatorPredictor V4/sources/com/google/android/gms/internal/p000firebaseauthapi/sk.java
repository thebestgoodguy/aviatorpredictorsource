package com.google.android.gms.internal.p000firebaseauthapi;

import a1.g1;
import a1.m1;
import a1.v0;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.q0;
import com.google.firebase.auth.z;
import o0.i;
import w.r;

/* loaded from: classes.dex */
final class sk extends cn {

    /* renamed from: w, reason: collision with root package name */
    private final rg f2137w;

    public sk(q0 q0Var, String str) {
        super(2);
        r.i(q0Var);
        r.e(str);
        this.f2137w = new rg(q0Var.a(), str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final String a() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.en
    public final void b(i iVar, bm bmVar) {
        this.f1492v = new bn(this, iVar);
        bmVar.p(this.f2137w, this.f1472b);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.cn
    public final void c() {
        m1 o4 = yl.o(this.f1473c, this.f1480j);
        z zVar = this.f1474d;
        if (zVar != null && !zVar.e().equalsIgnoreCase(o4.e())) {
            l(new Status(17024));
        } else {
            ((v0) this.f1475e).c(this.f1479i, o4);
            m(new g1(o4));
        }
    }
}
