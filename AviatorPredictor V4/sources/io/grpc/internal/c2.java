package io.grpc.internal;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c2 implements Executor, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final Logger f5121h = Logger.getLogger(c2.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private static final b f5122i = c();

    /* renamed from: e, reason: collision with root package name */
    private Executor f5123e;

    /* renamed from: f, reason: collision with root package name */
    private final Queue<Runnable> f5124f = new ConcurrentLinkedQueue();

    /* renamed from: g, reason: collision with root package name */
    private volatile int f5125g = 0;

    private static abstract class b {
        private b() {
        }

        public abstract boolean a(c2 c2Var, int r22, int r32);

        public abstract void b(c2 c2Var, int r22);
    }

    private static final class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicIntegerFieldUpdater<c2> f5126a;

        private c(AtomicIntegerFieldUpdater<c2> atomicIntegerFieldUpdater) {
            super();
            this.f5126a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int r32, int r4) {
            return this.f5126a.compareAndSet(c2Var, r32, r4);
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int r32) {
            this.f5126a.set(c2Var, r32);
        }
    }

    private static final class d extends b {
        private d() {
            super();
        }

        @Override // io.grpc.internal.c2.b
        public boolean a(c2 c2Var, int r32, int r4) {
            synchronized (c2Var) {
                if (c2Var.f5125g != r32) {
                    return false;
                }
                c2Var.f5125g = r4;
                return true;
            }
        }

        @Override // io.grpc.internal.c2.b
        public void b(c2 c2Var, int r22) {
            synchronized (c2Var) {
                c2Var.f5125g = r22;
            }
        }
    }

    public c2(Executor executor) {
        q0.l.o(executor, "'executor' must not be null.");
        this.f5123e = executor;
    }

    private static b c() {
        try {
            return new c(AtomicIntegerFieldUpdater.newUpdater(c2.class, "g"));
        } catch (Throwable th) {
            f5121h.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            return new d();
        }
    }

    private void d(Runnable runnable) {
        if (f5122i.a(this, 0, -1)) {
            try {
                this.f5123e.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.f5124f.remove(runnable);
                }
                f5122i.b(this, 0);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f5124f.add((Runnable) q0.l.o(runnable, "'r' must not be null."));
        d(runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable poll;
        try {
            Executor executor = this.f5123e;
            while (executor == this.f5123e && (poll = this.f5124f.poll()) != null) {
                try {
                    poll.run();
                } catch (RuntimeException e5) {
                    f5121h.log(Level.SEVERE, "Exception while executing runnable " + poll, (Throwable) e5);
                }
            }
            f5122i.b(this, 0);
            if (this.f5124f.isEmpty()) {
                return;
            }
            d(null);
        } catch (Throwable th) {
            f5122i.b(this, 0);
            throw th;
        }
    }
}
