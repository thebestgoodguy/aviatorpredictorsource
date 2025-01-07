package com.google.android.gms.common.api.internal;

import android.app.Dialog;

/* loaded from: classes.dex */
final class c0 extends u.q {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f1263a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d0 f1264b;

    c0(d0 d0Var, Dialog dialog) {
        this.f1264b = d0Var;
        this.f1263a = dialog;
    }

    @Override // u.q
    public final void a() {
        this.f1264b.f1273f.o();
        if (this.f1263a.isShowing()) {
            this.f1263a.dismiss();
        }
    }
}
