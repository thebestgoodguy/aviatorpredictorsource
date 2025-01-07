package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.a;

/* loaded from: classes.dex */
final class j implements a.InterfaceC0021a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f1289a;

    j(c cVar) {
        this.f1289a = cVar;
    }

    @Override // com.google.android.gms.common.api.internal.a.InterfaceC0021a
    public final void a(boolean z4) {
        c cVar = this.f1289a;
        cVar.f1261p.sendMessage(cVar.f1261p.obtainMessage(1, Boolean.valueOf(z4)));
    }
}
