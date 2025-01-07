package u;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class g0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f7623e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f7624f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h0 f7625g;

    g0(h0 h0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f7625g = h0Var;
        this.f7623e = lifecycleCallback;
        this.f7624f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r12;
        int r02;
        int r03;
        int r04;
        int r05;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        h0 h0Var = this.f7625g;
        r12 = h0Var.f7628d0;
        if (r12 > 0) {
            LifecycleCallback lifecycleCallback = this.f7623e;
            bundle = h0Var.f7629e0;
            if (bundle != null) {
                bundle3 = h0Var.f7629e0;
                bundle2 = bundle3.getBundle(this.f7624f);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        r02 = this.f7625g.f7628d0;
        if (r02 >= 2) {
            this.f7623e.j();
        }
        r03 = this.f7625g.f7628d0;
        if (r03 >= 3) {
            this.f7623e.h();
        }
        r04 = this.f7625g.f7628d0;
        if (r04 >= 4) {
            this.f7623e.k();
        }
        r05 = this.f7625g.f7628d0;
        if (r05 >= 5) {
            this.f7623e.g();
        }
    }
}
