package com.google.android.gms.common.api.internal;

import t.a;

/* loaded from: classes.dex */
final class m implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ n f1293e;

    m(n nVar) {
        this.f1293e = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        o oVar = this.f1293e.f1294a;
        fVar = oVar.f1296b;
        fVar2 = oVar.f1296b;
        fVar.l(fVar2.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
