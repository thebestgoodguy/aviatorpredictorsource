package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class e0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: f, reason: collision with root package name */
    protected volatile boolean f1276f;

    /* renamed from: g, reason: collision with root package name */
    protected final AtomicReference<b0> f1277g;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f1278h;

    /* renamed from: i, reason: collision with root package name */
    protected final s.d f1279i;

    e0(u.e eVar, s.d dVar) {
        super(eVar);
        this.f1277g = new AtomicReference<>(null);
        this.f1278h = new g0.f(Looper.getMainLooper());
        this.f1279i = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(s.a aVar, int r4) {
        this.f1277g.set(null);
        m(aVar, r4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f1277g.set(null);
        n();
    }

    private static final int p(b0 b0Var) {
        if (b0Var == null) {
            return -1;
        }
        return b0Var.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int r32, int r4, Intent intent) {
        b0 b0Var = this.f1277g.get();
        if (r32 != 1) {
            if (r32 == 2) {
                int f5 = this.f1279i.f(b());
                if (f5 == 0) {
                    o();
                    return;
                } else {
                    if (b0Var == null) {
                        return;
                    }
                    if (b0Var.b().j0() == 18 && f5 == 18) {
                        return;
                    }
                }
            }
        } else if (r4 == -1) {
            o();
            return;
        } else if (r4 == 0) {
            if (b0Var == null) {
                return;
            }
            l(new s.a(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, b0Var.b().toString()), p(b0Var));
            return;
        }
        if (b0Var != null) {
            l(b0Var.b(), b0Var.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f1277g.set(bundle.getBoolean("resolving_error", false) ? new b0(new s.a(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        b0 b0Var = this.f1277g.get();
        if (b0Var == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", b0Var.a());
        bundle.putInt("failed_status", b0Var.b().j0());
        bundle.putParcelable("failed_resolution", b0Var.b().l0());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f1276f = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f1276f = false;
    }

    protected abstract void m(s.a aVar, int r22);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new s.a(13, null), p(this.f1277g.get()));
    }

    public final void s(s.a aVar, int r32) {
        b0 b0Var = new b0(aVar, r32);
        if (this.f1277g.compareAndSet(null, b0Var)) {
            this.f1278h.post(new d0(this, b0Var));
        }
    }
}
