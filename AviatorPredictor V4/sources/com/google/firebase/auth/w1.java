package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.bp;

/* loaded from: classes.dex */
final class w1 implements a1.o0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2584a;

    w1(FirebaseAuth firebaseAuth) {
        this.f2584a = firebaseAuth;
    }

    @Override // a1.r
    public final void b(Status status) {
        int k02 = status.k0();
        if (k02 == 17011 || k02 == 17021 || k02 == 17005) {
            this.f2584a.C();
        }
    }

    @Override // a1.v0
    public final void c(bp bpVar, z zVar) {
        FirebaseAuth.O(this.f2584a, zVar, bpVar, true, true);
    }
}
