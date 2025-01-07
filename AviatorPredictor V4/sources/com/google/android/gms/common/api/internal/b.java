package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import t.a;
import t.a.b;
import t.k;

/* loaded from: classes.dex */
public abstract class b<R extends t.k, A extends a.b> extends BasePendingResult<R> {

    /* renamed from: q, reason: collision with root package name */
    private final a.c<A> f1238q;

    /* renamed from: r, reason: collision with root package name */
    private final t.a<?> f1239r;

    protected b(t.a<?> aVar, t.f fVar) {
        super((t.f) w.r.j(fVar, "GoogleApiClient must not be null"));
        w.r.j(aVar, "Api must not be null");
        this.f1238q = (a.c<A>) aVar.b();
        this.f1239r = aVar;
    }

    private void o(RemoteException remoteException) {
        p(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void l(A a5);

    protected void m(R r4) {
    }

    public final void n(A a5) {
        try {
            l(a5);
        } catch (DeadObjectException e5) {
            o(e5);
            throw e5;
        } catch (RemoteException e6) {
            o(e6);
        }
    }

    public final void p(Status status) {
        w.r.b(!status.n0(), "Failed result must not be success");
        R c5 = c(status);
        f(c5);
        m(c5);
    }
}
