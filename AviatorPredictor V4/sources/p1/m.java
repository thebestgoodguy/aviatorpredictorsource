package p1;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public class m implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private Semaphore f7033e = new Semaphore(0);

    /* renamed from: f, reason: collision with root package name */
    private int f7034f = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Runnable runnable) {
        runnable.run();
        this.f7033e.release();
    }

    public void b() {
        try {
            this.f7033e.acquire(this.f7034f);
            this.f7034f = 0;
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            b.a("Interrupted while waiting for background task", e5);
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.f7034f++;
        p.f7052c.execute(new Runnable() { // from class: p1.l
            @Override // java.lang.Runnable
            public final void run() {
                m.this.c(runnable);
            }
        });
    }
}
