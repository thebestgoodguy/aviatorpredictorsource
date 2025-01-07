package com.google.android.gms.common.api.internal;

import android.app.Activity;

/* loaded from: classes.dex */
public final class h extends e0 {

    /* renamed from: j, reason: collision with root package name */
    private final e.b<u.b<?>> f1285j;

    /* renamed from: k, reason: collision with root package name */
    private final c f1286k;

    h(u.e eVar, c cVar, s.d dVar) {
        super(eVar, dVar);
        this.f1285j = new e.b<>();
        this.f1286k = cVar;
        this.f1231e.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, c cVar, u.b<?> bVar) {
        u.e c5 = LifecycleCallback.c(activity);
        h hVar = (h) c5.c("ConnectionlessLifecycleHelper", h.class);
        if (hVar == null) {
            hVar = new h(c5, cVar, s.d.m());
        }
        w.r.j(bVar, "ApiKey cannot be null");
        hVar.f1285j.add(bVar);
        cVar.c(hVar);
    }

    private final void v() {
        if (this.f1285j.isEmpty()) {
            return;
        }
        this.f1286k.c(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.e0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.e0, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f1286k.d(this);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    protected final void m(s.a aVar, int r32) {
        this.f1286k.G(aVar, r32);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    protected final void n() {
        this.f1286k.a();
    }

    final e.b<u.b<?>> t() {
        return this.f1285j;
    }
}
