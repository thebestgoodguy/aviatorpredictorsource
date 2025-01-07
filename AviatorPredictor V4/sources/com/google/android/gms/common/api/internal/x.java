package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.b;
import t.a;

/* loaded from: classes.dex */
public final class x<A extends b<? extends t.k, a.b>> extends a0 {

    /* renamed from: b, reason: collision with root package name */
    protected final A f1329b;

    public x(int r12, A a5) {
        super(r12);
        this.f1329b = (A) w.r.j(a5, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void a(Status status) {
        try {
            this.f1329b.p(status);
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void b(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(simpleName.length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.f1329b.p(new Status(10, sb.toString()));
        } catch (IllegalStateException e5) {
            Log.w("ApiCallRunner", "Exception reporting failure", e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void c(o<?> oVar) {
        try {
            this.f1329b.n(oVar.v());
        } catch (RuntimeException e5) {
            b(e5);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void d(g gVar, boolean z4) {
        gVar.c(this.f1329b, z4);
    }
}
