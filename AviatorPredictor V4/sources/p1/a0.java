package p1;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
class a0 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Executor f6982e;

    /* renamed from: f, reason: collision with root package name */
    private final Semaphore f6983f;

    a0(int r22, Executor executor) {
        this.f6983f = new Semaphore(r22);
        this.f6982e = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Runnable runnable) {
        runnable.run();
        this.f6983f.release();
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (this.f6983f.tryAcquire()) {
            try {
                this.f6982e.execute(new Runnable() { // from class: p1.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        a0.this.b(runnable);
                    }
                });
                return;
            } catch (RejectedExecutionException unused) {
            }
        }
        runnable.run();
    }
}
