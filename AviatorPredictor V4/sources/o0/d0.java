package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class d0 implements Executor {
    d0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
