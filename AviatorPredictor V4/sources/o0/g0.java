package o0;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class g0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ f0 f6708e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Callable f6709f;

    g0(f0 f0Var, Callable callable) {
        this.f6708e = f0Var;
        this.f6709f = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f6708e.r(this.f6709f.call());
        } catch (Exception e5) {
            this.f6708e.q(e5);
        } catch (Throwable th) {
            this.f6708e.q(new RuntimeException(th));
        }
    }
}
