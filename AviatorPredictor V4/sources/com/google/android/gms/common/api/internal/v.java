package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
abstract class v<T> extends u.s {

    /* renamed from: b, reason: collision with root package name */
    protected final o0.i<T> f1328b;

    public v(int r12, o0.i<T> iVar) {
        super(r12);
        this.f1328b = iVar;
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void a(Status status) {
        this.f1328b.d(new t.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void b(Exception exc) {
        this.f1328b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a0
    public final void c(o<?> oVar) {
        try {
            h(oVar);
        } catch (DeadObjectException e5) {
            a(a0.e(e5));
            throw e5;
        } catch (RemoteException e6) {
            a(a0.e(e6));
        } catch (RuntimeException e7) {
            this.f1328b.d(e7);
        }
    }

    protected abstract void h(o<?> oVar);
}
