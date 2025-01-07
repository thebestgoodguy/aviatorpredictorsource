package com.google.android.gms.common.api.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class f implements o0.d {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o0.i f1280a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f1281b;

    f(g gVar, o0.i iVar) {
        this.f1281b = gVar;
        this.f1280a = iVar;
    }

    @Override // o0.d
    public final void a(o0.h hVar) {
        Map map;
        map = this.f1281b.f1283b;
        map.remove(this.f1280a);
    }
}
