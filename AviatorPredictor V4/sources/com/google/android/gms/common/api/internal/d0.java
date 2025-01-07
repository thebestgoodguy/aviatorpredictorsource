package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiActivity;

/* loaded from: classes.dex */
final class d0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final b0 f1272e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e0 f1273f;

    d0(e0 e0Var, b0 b0Var) {
        this.f1273f = e0Var;
        this.f1272e = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1273f.f1276f) {
            s.a b5 = this.f1272e.b();
            if (b5.m0()) {
                e0 e0Var = this.f1273f;
                e0Var.f1231e.startActivityForResult(GoogleApiActivity.a(e0Var.b(), (PendingIntent) w.r.i(b5.l0()), this.f1272e.a(), false), 1);
                return;
            }
            e0 e0Var2 = this.f1273f;
            if (e0Var2.f1279i.a(e0Var2.b(), b5.j0(), null) != null) {
                e0 e0Var3 = this.f1273f;
                e0Var3.f1279i.v(e0Var3.b(), this.f1273f.f1231e, b5.j0(), 2, this.f1273f);
            } else {
                if (b5.j0() != 18) {
                    this.f1273f.l(b5, this.f1272e.a());
                    return;
                }
                e0 e0Var4 = this.f1273f;
                Dialog q4 = e0Var4.f1279i.q(e0Var4.b(), this.f1273f);
                e0 e0Var5 = this.f1273f;
                e0Var5.f1279i.r(e0Var5.b().getApplicationContext(), new c0(this, q4));
            }
        }
    }
}
