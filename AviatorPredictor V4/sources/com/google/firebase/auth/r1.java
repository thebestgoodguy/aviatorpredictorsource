package com.google.firebase.auth;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
final class r1 implements a1.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ z f2564a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2565b;

    r1(FirebaseAuth firebaseAuth, z zVar) {
        this.f2565b = firebaseAuth;
        this.f2564a = zVar;
    }

    @Override // a1.q
    public final void a() {
        z zVar;
        z zVar2;
        FirebaseAuth firebaseAuth = this.f2565b;
        zVar = firebaseAuth.f2453f;
        if (zVar != null) {
            zVar2 = firebaseAuth.f2453f;
            if (zVar2.e().equalsIgnoreCase(this.f2564a.e())) {
                this.f2565b.K();
            }
        }
    }

    @Override // a1.r
    public final void b(Status status) {
        if (status.k0() == 17011 || status.k0() == 17021 || status.k0() == 17005) {
            this.f2565b.C();
        }
    }
}
