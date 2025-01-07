package com.google.android.gms.internal.p000firebaseauthapi;

import com.google.firebase.auth.p0;

/* loaded from: classes.dex */
final class ym implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ an f2389e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ zm f2390f;

    ym(zm zmVar, an anVar) {
        this.f2390f = zmVar;
        this.f2389e = anVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2390f.f2443a.f1477g) {
            if (!this.f2390f.f2443a.f1477g.isEmpty()) {
                this.f2389e.a((p0.b) this.f2390f.f2443a.f1477g.get(0), new Object[0]);
            }
        }
    }
}
