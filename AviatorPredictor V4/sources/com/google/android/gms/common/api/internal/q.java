package com.google.android.gms.common.api.internal;

import android.util.Log;
import java.util.Map;
import t.a;

/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ s.a f1310e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ r f1311f;

    q(r rVar, s.a aVar) {
        this.f1311f = rVar;
        this.f1310e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        u.b bVar;
        a.f fVar;
        a.f fVar2;
        a.f fVar3;
        a.f fVar4;
        r rVar = this.f1311f;
        map = rVar.f1317f.f1257l;
        bVar = rVar.f1313b;
        o oVar = (o) map.get(bVar);
        if (oVar == null) {
            return;
        }
        if (!this.f1310e.n0()) {
            oVar.H(this.f1310e, null);
            return;
        }
        this.f1311f.f1316e = true;
        fVar = this.f1311f.f1312a;
        if (fVar.m()) {
            this.f1311f.h();
            return;
        }
        try {
            r rVar2 = this.f1311f;
            fVar3 = rVar2.f1312a;
            fVar4 = rVar2.f1312a;
            fVar3.f(null, fVar4.i());
        } catch (SecurityException e5) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
            fVar2 = this.f1311f.f1312a;
            fVar2.l("Failed to get service from broker.");
            oVar.H(new s.a(10), null);
        }
    }
}
