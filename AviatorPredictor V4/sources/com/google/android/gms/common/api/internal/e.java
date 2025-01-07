package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Map;
import t.g;

/* loaded from: classes.dex */
final class e implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ BasePendingResult f1274a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g f1275b;

    e(g gVar, BasePendingResult basePendingResult) {
        this.f1275b = gVar;
        this.f1274a = basePendingResult;
    }

    @Override // t.g.a
    public final void a(Status status) {
        Map map;
        map = this.f1275b.f1282a;
        map.remove(this.f1274a);
    }
}
