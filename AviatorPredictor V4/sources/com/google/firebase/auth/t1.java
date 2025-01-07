package com.google.firebase.auth;

import com.google.firebase.auth.FirebaseAuth;

/* loaded from: classes.dex */
final class t1 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth.a f2574e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ FirebaseAuth f2575f;

    t1(FirebaseAuth firebaseAuth, FirebaseAuth.a aVar) {
        this.f2575f = firebaseAuth;
        this.f2574e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2574e.a(this.f2575f);
    }
}
