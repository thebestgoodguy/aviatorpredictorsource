package b3;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class j1 implements Executor {

    /* renamed from: e, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f815e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<Runnable> f816f = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<Thread> f817g = new AtomicReference<>();

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f818e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Runnable f819f;

        a(b bVar, Runnable runnable) {
            this.f818e = bVar;
            this.f819f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            j1.this.execute(this.f818e);
        }

        public String toString() {
            return this.f819f.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    private static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final Runnable f821e;

        /* renamed from: f, reason: collision with root package name */
        boolean f822f;

        /* renamed from: g, reason: collision with root package name */
        boolean f823g;

        b(Runnable runnable) {
            this.f821e = (Runnable) q0.l.o(runnable, "task");
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f822f) {
                return;
            }
            this.f823g = true;
            this.f821e.run();
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final b f824a;

        /* renamed from: b, reason: collision with root package name */
        private final ScheduledFuture<?> f825b;

        private c(b bVar, ScheduledFuture<?> scheduledFuture) {
            this.f824a = (b) q0.l.o(bVar, "runnable");
            this.f825b = (ScheduledFuture) q0.l.o(scheduledFuture, "future");
        }

        /* synthetic */ c(b bVar, ScheduledFuture scheduledFuture, a aVar) {
            this(bVar, scheduledFuture);
        }

        public void a() {
            this.f824a.f822f = true;
            this.f825b.cancel(false);
        }

        public boolean b() {
            b bVar = this.f824a;
            return (bVar.f823g || bVar.f822f) ? false : true;
        }
    }

    public j1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f815e = (Thread.UncaughtExceptionHandler) q0.l.o(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public final void a() {
        while (this.f817g.compareAndSet(null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable poll = this.f816f.poll();
                    if (poll == null) {
                        break;
                    }
                    try {
                        poll.run();
                    } catch (Throwable th) {
                        this.f815e.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f817g.set(null);
                    throw th2;
                }
            }
            this.f817g.set(null);
            if (this.f816f.isEmpty()) {
                return;
            }
        }
    }

    public final void b(Runnable runnable) {
        this.f816f.add((Runnable) q0.l.o(runnable, "runnable is null"));
    }

    public final c c(Runnable runnable, long j4, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        b bVar = new b(runnable);
        return new c(bVar, scheduledExecutorService.schedule(new a(bVar, runnable), j4, timeUnit), null);
    }

    public void d() {
        q0.l.u(Thread.currentThread() == this.f817g.get(), "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable);
        a();
    }
}
