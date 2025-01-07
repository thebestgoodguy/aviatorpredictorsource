package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class s1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.b f2570e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2571f;

    s1(FirebaseAuth firebaseAuth, FirebaseAuth.b bVar) {
        this.f2571f = firebaseAuth;
        this.f2570e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2570e.a(this.f2571f);
    }
}
