package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import t.a;

/* loaded from: classes.dex */
public final class y<ResultT> extends u.s {

    /* renamed from: b, reason: collision with root package name */
    private final d<a.b, ResultT> f1330b;

    /* renamed from: c, reason: collision with root package name */
    private final o0.i<ResultT> f1331c;

    /* renamed from: d, reason: collision with root package name */
    private final u.k f1332d;

    public y(int r12, d<a.b, ResultT> dVar, o0.i<ResultT> iVar, u.k kVar) {
        super(r12);
        this.f1331c = iVar;
        this.f1330b = dVar;
        this.f1332d = kVar;
        if (r12 == 2 && dVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void a(Status status) {
        this.f1331c.d(this.f1332d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void b(Exception exc) {
        this.f1331c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void c(o<?> oVar) {
        try {
            this.f1330b.b(oVar.v(), this.f1331c);
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            a(a0.e(e6));
        } catch (RuntimeException e7) {
            this.f1331c.d(e7);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void d(g gVar, boolean z4) {
        gVar.d(this.f1331c, z4);
    }

    @Override // u.s
    public final boolean f(o<?> oVar) {
        return this.f1330b.c();
    }

    @Override // u.s
    public final s.c[] g(o<?> oVar) {
        return this.f1330b.e();
    }
}
