package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.bp;

/* loaded from: classes.dex */
final class c2 implements a1.o0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2470a;

    c2(FirebaseAuth firebaseAuth) {
        this.f2470a = firebaseAuth;
    }

    @Override // a1.r
    public final void b(Status status) {
        if (status.k0() == 17011 || status.k0() == 17021 || status.k0() == 17005 || status.k0() == 17091) {
            this.f2470a.C();
        }
    }

    @Override // a1.v0
    public final void c(bp bpVar, z zVar) {
        w.r.i(bpVar);
        w.r.i(zVar);
        zVar.J0(bpVar);
        FirebaseAuth.O(this.f2470a, zVar, bpVar, true, true);
    }
}
