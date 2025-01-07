package p1;

import android.os.Handler;
import android.os.Looper;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p1.g;

/* loaded from: classes.dex */
public class g {

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<d> f6997c = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<b> f6996b = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    private final c f6995a = new c();

    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final d f6998a;

        /* renamed from: b, reason: collision with root package name */
        private final long f6999b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f7000c;

        /* renamed from: d, reason: collision with root package name */
        private ScheduledFuture f7001d;

        private b(d dVar, long j4, Runnable runnable) {
            this.f6998a = dVar;
            this.f6999b = j4;
            this.f7000c = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            g.this.w();
            if (this.f7001d != null) {
                e();
                this.f7000c.run();
            }
        }

        private void e() {
            p1.b.d(this.f7001d != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.f7001d = null;
            g.this.v(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(long j4) {
            this.f7001d = g.this.f6995a.schedule(new Runnable() { // from class: p1.h
                @Override // java.lang.Runnable
                public final void run() {
                    g.b.this.d();
                }
            }, j4, TimeUnit.MILLISECONDS);
        }

        public void c() {
            g.this.w();
            ScheduledFuture scheduledFuture = this.f7001d;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class c implements Executor {

        /* renamed from: e, reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f7003e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f7004f;

        /* renamed from: g, reason: collision with root package name */
        private final Thread f7005g;

        class a extends ScheduledThreadPoolExecutor {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f7007e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int r22, ThreadFactory threadFactory, g gVar) {
                super(r22, threadFactory);
                this.f7007e = gVar;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e5) {
                        th = e5.getCause();
                    }
                }
                if (th != null) {
                    g.this.u(th);
                }
            }
        }

        private class b implements Runnable, ThreadFactory {

            /* renamed from: e, reason: collision with root package name */
            private final CountDownLatch f7009e;

            /* renamed from: f, reason: collision with root package name */
            private Runnable f7010f;

            private b() {
                this.f7009e = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                p1.b.d(this.f7010f == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f7010f = runnable;
                this.f7009e.countDown();
                return c.this.f7005g;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f7009e.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f7010f.run();
            }
        }

        c() {
            b bVar = new b();
            Thread newThread = Executors.defaultThreadFactory().newThread(bVar);
            this.f7005g = newThread;
            newThread.setName("FirestoreWorker");
            newThread.setDaemon(true);
            newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: p1.j
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    g.c.this.p(thread, th);
                }
            });
            a aVar = new a(1, bVar, g.this);
            this.f7003e = aVar;
            aVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f7004f = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized o0.h<Void> j(final Runnable runnable) {
            if (!m()) {
                o0.h<Void> k4 = k(new Callable() { // from class: p1.k
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Void n4;
                        n4 = g.c.n(runnable);
                        return n4;
                    }
                });
                this.f7004f = true;
                return k4;
            }
            o0.i iVar = new o0.i();
            iVar.c(null);
            return iVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public <T> o0.h<T> k(final Callable<T> callable) {
            final o0.i iVar = new o0.i();
            try {
                execute(new Runnable() { // from class: p1.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.c.o(o0.i.this, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                v.d(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return iVar.a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean m() {
            return this.f7004f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ Void n(Runnable runnable) {
            runnable.run();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void o(o0.i iVar, Callable callable) {
            try {
                iVar.c(callable.call());
            } catch (Exception e5) {
                iVar.b(e5);
                throw new RuntimeException(e5);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void p(Thread thread, Throwable th) {
            g.this.u(th);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q() {
            this.f7003e.shutdownNow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture<?> schedule(Runnable runnable, long j4, TimeUnit timeUnit) {
            if (this.f7004f) {
                return null;
            }
            return this.f7003e.schedule(runnable, j4, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f7004f) {
                this.f7003e.execute(runnable);
            }
        }

        public void l(Runnable runnable) {
            try {
                this.f7003e.execute(runnable);
            } catch (RejectedExecutionException unused) {
                v.d(g.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
        }
    }

    public enum d {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public static <TResult> o0.h<TResult> g(final Executor executor, final Callable<o0.h<TResult>> callable) {
        final o0.i iVar = new o0.i();
        executor.execute(new Runnable() { // from class: p1.d
            @Override // java.lang.Runnable
            public final void run() {
                g.r(callable, executor, iVar);
            }
        });
        return iVar.a();
    }

    private b h(d dVar, long j4, Runnable runnable) {
        b bVar = new b(dVar, System.currentTimeMillis() + j4, runnable);
        bVar.f(j4);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void q(o0.i iVar, o0.h hVar) {
        if (hVar.p()) {
            iVar.c(hVar.m());
            return null;
        }
        iVar.b(hVar.l());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void r(Callable callable, Executor executor, final o0.i iVar) {
        try {
            ((o0.h) callable.call()).h(executor, new o0.a() { // from class: p1.f
                @Override // o0.a
                public final Object a(o0.h hVar) {
                    Void q4;
                    q4 = g.q(o0.i.this, hVar);
                    return q4;
                }
            });
        } catch (Exception e5) {
            iVar.b(e5);
        } catch (Throwable th) {
            iVar.b(new IllegalStateException("Unhandled throwable in callTask.", th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Void s(Runnable runnable) {
        runnable.run();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (24.2.1).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (24.2.1) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(b bVar) {
        p1.b.d(this.f6996b.remove(bVar), "Delayed task not found.", new Object[0]);
    }

    public o0.h<Void> i(final Runnable runnable) {
        return j(new Callable() { // from class: p1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void s4;
                s4 = g.s(runnable);
                return s4;
            }
        });
    }

    public <T> o0.h<T> j(Callable<T> callable) {
        return this.f6995a.k(callable);
    }

    public b k(d dVar, long j4, Runnable runnable) {
        if (this.f6997c.contains(dVar)) {
            j4 = 0;
        }
        b h5 = h(dVar, j4, runnable);
        this.f6996b.add(h5);
        return h5;
    }

    public void l(Runnable runnable) {
        i(runnable);
    }

    public void m(Runnable runnable) {
        this.f6995a.l(runnable);
    }

    public o0.h<Void> n(Runnable runnable) {
        return this.f6995a.j(runnable);
    }

    public Executor o() {
        return this.f6995a;
    }

    public boolean p() {
        return this.f6995a.m();
    }

    public void u(final Throwable th) {
        this.f6995a.q();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: p1.c
            @Override // java.lang.Runnable
            public final void run() {
                g.t(th);
            }
        });
    }

    public void w() {
        Thread currentThread = Thread.currentThread();
        if (this.f6995a.f7005g != currentThread) {
            throw p1.b.a("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f6995a.f7005g.getName(), Long.valueOf(this.f6995a.f7005g.getId()), currentThread.getName(), Long.valueOf(currentThread.getId()));
        }
    }
}
