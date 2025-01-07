package o0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class e0 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Handler f6701e = new j0.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f6701e.post(runnable);
    }
}
