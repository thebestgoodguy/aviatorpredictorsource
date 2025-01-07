package b4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class h1 extends g1 {

    /* renamed from: g, reason: collision with root package name */
    private final Executor f1008g;

    public h1(Executor executor) {
        this.f1008g = executor;
        kotlinx.coroutines.internal.d.a(M());
    }

    private final void K(n3.g gVar, RejectedExecutionException rejectedExecutionException) {
        t1.c(gVar, f1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // b4.g0
    public void F(n3.g gVar, Runnable runnable) {
        try {
            Executor M = M();
            c.a();
            M.execute(runnable);
        } catch (RejectedExecutionException e5) {
            c.a();
            K(gVar, e5);
            x0.b().F(gVar, runnable);
        }
    }

    public Executor M() {
        return this.f1008g;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor M = M();
        ExecutorService executorService = M instanceof ExecutorService ? (ExecutorService) M : null;
        if (executorService == null) {
            return;
        }
        executorService.shutdown();
    }

    public boolean equals(Object obj) {
        return (obj instanceof h1) && ((h1) obj).M() == M();
    }

    public int hashCode() {
        return System.identityHashCode(M());
    }

    @Override // b4.g0
    public String toString() {
        return M().toString();
    }
}
