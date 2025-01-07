package io.grpc.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class h1 extends l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final ReferenceQueue<h1> f5360c = new ReferenceQueue<>();

    /* renamed from: d, reason: collision with root package name */
    private static final ConcurrentMap<a, a> f5361d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private static final Logger f5362e = Logger.getLogger(h1.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private final a f5363b;

    static final class a extends WeakReference<h1> {

        /* renamed from: f, reason: collision with root package name */
        private static final boolean f5364f = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));

        /* renamed from: g, reason: collision with root package name */
        private static final RuntimeException f5365g = e();

        /* renamed from: a, reason: collision with root package name */
        private final ReferenceQueue<h1> f5366a;

        /* renamed from: b, reason: collision with root package name */
        private final ConcurrentMap<a, a> f5367b;

        /* renamed from: c, reason: collision with root package name */
        private final String f5368c;

        /* renamed from: d, reason: collision with root package name */
        private final Reference<RuntimeException> f5369d;

        /* renamed from: e, reason: collision with root package name */
        private final AtomicBoolean f5370e;

        a(h1 h1Var, b3.q0 q0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
            super(h1Var, referenceQueue);
            this.f5370e = new AtomicBoolean();
            this.f5369d = new SoftReference(f5364f ? new RuntimeException("ManagedChannel allocation site") : f5365g);
            this.f5368c = q0Var.toString();
            this.f5366a = referenceQueue;
            this.f5367b = concurrentMap;
            concurrentMap.put(this, this);
            b(referenceQueue);
        }

        static int b(ReferenceQueue<h1> referenceQueue) {
            int r12 = 0;
            while (true) {
                a aVar = (a) referenceQueue.poll();
                if (aVar == null) {
                    return r12;
                }
                RuntimeException runtimeException = aVar.f5369d.get();
                aVar.c();
                if (!aVar.f5370e.get()) {
                    r12++;
                    Level level = Level.SEVERE;
                    if (h1.f5362e.isLoggable(level)) {
                        LogRecord logRecord = new LogRecord(level, "*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*" + System.getProperty("line.separator") + "    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        logRecord.setLoggerName(h1.f5362e.getName());
                        logRecord.setParameters(new Object[]{aVar.f5368c});
                        logRecord.setThrown(runtimeException);
                        h1.f5362e.log(logRecord);
                    }
                }
            }
        }

        private void c() {
            super.clear();
            this.f5367b.remove(this);
            this.f5369d.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            if (this.f5370e.getAndSet(true)) {
                return;
            }
            clear();
        }

        private static RuntimeException e() {
            RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
            runtimeException.setStackTrace(new StackTraceElement[0]);
            return runtimeException;
        }

        @Override // java.lang.ref.Reference
        public void clear() {
            c();
            b(this.f5366a);
        }
    }

    h1(b3.q0 q0Var) {
        this(q0Var, f5360c, f5361d);
    }

    h1(b3.q0 q0Var, ReferenceQueue<h1> referenceQueue, ConcurrentMap<a, a> concurrentMap) {
        super(q0Var);
        this.f5363b = new a(this, q0Var, referenceQueue, concurrentMap);
    }

    @Override // io.grpc.internal.l0, b3.q0
    public b3.q0 m() {
        this.f5363b.d();
        return super.m();
    }

    @Override // io.grpc.internal.l0, b3.q0
    public b3.q0 n() {
        this.f5363b.d();
        return super.n();
    }
}
