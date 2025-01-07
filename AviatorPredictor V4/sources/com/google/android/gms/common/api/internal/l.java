package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class l implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f1291e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ o f1292f;

    l(o oVar, int r22) {
        this.f1292f = oVar;
        this.f1291e = r22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1292f.k(this.f1291e);
    }
}
