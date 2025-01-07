package b4;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class w extends g1 {

    /* renamed from: g, reason: collision with root package name */
    public static final w f1055g = new w();

    /* renamed from: h, reason: collision with root package name */
    private static final int f1056h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f1057i;
    private static volatile Executor pool;

    static {
        String str;
        Integer f5;
        int intValue;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            intValue = -1;
        } else {
            f5 = a4.l.f(str);
            if (f5 == null || f5.intValue() < 1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            intValue = f5.intValue();
        }
        f1056h = intValue;
    }

    private w() {
    }

    private final ExecutorService R() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(f0(), new ThreadFactory() { // from class: b4.v
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread S;
                S = w.S(atomicInteger, runnable);
                return S;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread S(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, kotlin.jvm.internal.i.i("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.concurrent.ExecutorService X() {
        /*
            r6 = this;
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = r6.R()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = r6.R()
            return r0
        L1b:
            boolean r2 = b4.w.f1057i
            r3 = 0
            if (r2 != 0) goto L4b
            int r2 = b4.w.f1056h
            if (r2 >= 0) goto L4b
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch: java.lang.Throwable -> L39
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L39
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 != 0) goto L3d
            goto L4b
        L3d:
            b4.w r4 = b4.w.f1055g
            boolean r4 = r4.i0(r1, r2)
            if (r4 == 0) goto L46
            goto L47
        L46:
            r2 = r0
        L47:
            if (r2 != 0) goto L4a
            goto L4b
        L4a:
            return r2
        L4b:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L70
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L70
            r4[r3] = r5     // Catch: java.lang.Throwable -> L70
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch: java.lang.Throwable -> L70
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L70
            b4.w r4 = b4.w.f1055g     // Catch: java.lang.Throwable -> L70
            int r4 = r4.f0()     // Catch: java.lang.Throwable -> L70
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L70
            r2[r3] = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L70
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L70
            if (r2 == 0) goto L71
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L70
            r0 = r1
            goto L71
        L70:
        L71:
            if (r0 != 0) goto L77
            java.util.concurrent.ExecutorService r0 = r6.R()
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b4.w.X():java.util.concurrent.ExecutorService");
    }

    private final synchronized Executor c0() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = X();
            pool = executor;
        }
        return executor;
    }

    private final int f0() {
        int a5;
        Integer valueOf = Integer.valueOf(f1056h);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        a5 = x3.f.a(Runtime.getRuntime().availableProcessors() - 1, 1);
        return a5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0() {
    }

    @Override // b4.g0
    public void F(n3.g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = c0();
            }
            c.a();
            executor.execute(runnable);
        } catch (RejectedExecutionException unused) {
            c.a();
            s0.f1047k.q0(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    public final boolean i0(Class<?> cls, ExecutorService executorService) {
        executorService.submit(new Runnable() { // from class: b4.u
            @Override // java.lang.Runnable
            public final void run() {
                w.j0();
            }
        });
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // b4.g0
    public String toString() {
        return "CommonPool";
    }
}
