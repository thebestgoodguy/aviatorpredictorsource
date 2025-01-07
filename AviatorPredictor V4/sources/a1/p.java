package a1;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.gms.internal.p000firebaseauthapi.c8;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: h, reason: collision with root package name */
    private static final z.a f101h = new z.a("TokenRefresher", "FirebaseAuth:");

    /* renamed from: a, reason: collision with root package name */
    private final x0.e f102a;

    /* renamed from: b, reason: collision with root package name */
    volatile long f103b;

    /* renamed from: c, reason: collision with root package name */
    volatile long f104c;

    /* renamed from: d, reason: collision with root package name */
    final long f105d;

    /* renamed from: e, reason: collision with root package name */
    final HandlerThread f106e;

    /* renamed from: f, reason: collision with root package name */
    final Handler f107f;

    /* renamed from: g, reason: collision with root package name */
    final Runnable f108g;

    public p(x0.e eVar) {
        f101h.g("Initializing TokenRefresher", new Object[0]);
        x0.e eVar2 = (x0.e) w.r.i(eVar);
        this.f102a = eVar2;
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.f106e = handlerThread;
        handlerThread.start();
        this.f107f = new c8(handlerThread.getLooper());
        this.f108g = new o(this, eVar2.q());
        this.f105d = 300000L;
    }

    public final void b() {
        this.f107f.removeCallbacks(this.f108g);
    }

    public final void c() {
        f101h.g("Scheduling refresh for " + (this.f103b - this.f105d), new Object[0]);
        b();
        this.f104c = Math.max((this.f103b - b0.f.b().a()) - this.f105d, 0L) / 1000;
        this.f107f.postDelayed(this.f108g, this.f104c * 1000);
    }

    final void d() {
        long j4;
        int r12 = (int) this.f104c;
        if (r12 == 30 || r12 == 60 || r12 == 120 || r12 == 240 || r12 == 480) {
            long j5 = this.f104c;
            j4 = j5 + j5;
        } else {
            j4 = r12 != 960 ? 30L : 960L;
        }
        this.f104c = j4;
        this.f103b = b0.f.b().a() + (this.f104c * 1000);
        f101h.g("Scheduling refresh for " + this.f103b, new Object[0]);
        this.f107f.postDelayed(this.f108g, this.f104c * 1000);
    }
}
