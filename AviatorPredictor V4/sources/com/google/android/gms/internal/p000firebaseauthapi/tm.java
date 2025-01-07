package com.google.android.gms.internal.p000firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.List;
import u.e;

/* loaded from: classes.dex */
final class tm extends LifecycleCallback {

    /* renamed from: f, reason: collision with root package name */
    private final List f2165f;

    private tm(e eVar, List list) {
        super(eVar);
        this.f1231e.a("PhoneAuthActivityStopCallback", this);
        this.f2165f = list;
    }

    public static void l(Activity activity, List list) {
        e c5 = LifecycleCallback.c(activity);
        if (((tm) c5.c("PhoneAuthActivityStopCallback", tm.class)) == null) {
            new tm(c5, list);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        synchronized (this.f2165f) {
            this.f2165f.clear();
        }
    }
}
