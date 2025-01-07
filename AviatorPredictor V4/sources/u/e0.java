package u;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;

/* loaded from: classes.dex */
final class e0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f7602e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f7603f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ f0 f7604g;

    e0(f0 f0Var, LifecycleCallback lifecycleCallback, String str) {
        this.f7604g = f0Var;
        this.f7602e = lifecycleCallback;
        this.f7603f = str;
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
        f0 f0Var = this.f7604g;
        r12 = f0Var.f7609f;
        if (r12 > 0) {
            LifecycleCallback lifecycleCallback = this.f7602e;
            bundle = f0Var.f7610g;
            if (bundle != null) {
                bundle3 = f0Var.f7610g;
                bundle2 = bundle3.getBundle(this.f7603f);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        r02 = this.f7604g.f7609f;
        if (r02 >= 2) {
            this.f7602e.j();
        }
        r03 = this.f7604g.f7609f;
        if (r03 >= 3) {
            this.f7602e.h();
        }
        r04 = this.f7604g.f7609f;
        if (r04 >= 4) {
            this.f7602e.k();
        }
        r05 = this.f7604g.f7609f;
        if (r05 >= 5) {
            this.f7602e.g();
        }
    }
}
