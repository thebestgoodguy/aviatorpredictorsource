package q2;

import r2.r;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a<String> f7202a;

    public e(f2.a aVar) {
        this.f7202a = new r2.a<>(aVar, "flutter/lifecycle", r.f7473b);
    }

    public void a() {
        e2.b.e("LifecycleChannel", "Sending AppLifecycleState.detached message.");
        this.f7202a.c("AppLifecycleState.detached");
    }

    public void b() {
        e2.b.e("LifecycleChannel", "Sending AppLifecycleState.inactive message.");
        this.f7202a.c("AppLifecycleState.inactive");
    }

    public void c() {
        e2.b.e("LifecycleChannel", "Sending AppLifecycleState.paused message.");
        this.f7202a.c("AppLifecycleState.paused");
    }

    public void d() {
        e2.b.e("LifecycleChannel", "Sending AppLifecycleState.resumed message.");
        this.f7202a.c("AppLifecycleState.resumed");
    }
}
