package b4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class s0 extends b1 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: k, reason: collision with root package name */
    public static final s0 f1047k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f1048l;

    static {
        Long l4;
        s0 s0Var = new s0();
        f1047k = s0Var;
        a1.c0(s0Var, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l4 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l4 = 1000L;
        }
        f1048l = timeUnit.toNanos(l4.longValue());
    }

    private s0() {
    }

    private final synchronized void B0() {
        if (D0()) {
            debugStatus = 3;
            w0();
            notifyAll();
        }
    }

    private final synchronized Thread C0() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final boolean D0() {
        int r02 = debugStatus;
        return r02 == 2 || r02 == 3;
    }

    private final synchronized boolean E0() {
        if (D0()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    @Override // b4.c1
    protected Thread k0() {
        Thread thread = _thread;
        return thread == null ? C0() : thread;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean t02;
        g2.f1005a.c(this);
        c.a();
        try {
            if (!E0()) {
                if (t02) {
                    return;
                } else {
                    return;
                }
            }
            long j4 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long u02 = u0();
                if (u02 == Long.MAX_VALUE) {
                    c.a();
                    long nanoTime = System.nanoTime();
                    if (j4 == Long.MAX_VALUE) {
                        j4 = f1048l + nanoTime;
                    }
                    long j5 = j4 - nanoTime;
                    if (j5 <= 0) {
                        _thread = null;
                        B0();
                        c.a();
                        if (t0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    u02 = x3.f.d(u02, j5);
                } else {
                    j4 = Long.MAX_VALUE;
                }
                if (u02 > 0) {
                    if (D0()) {
                        _thread = null;
                        B0();
                        c.a();
                        if (t0()) {
                            return;
                        }
                        k0();
                        return;
                    }
                    c.a();
                    LockSupport.parkNanos(this, u02);
                }
            }
        } finally {
            _thread = null;
            B0();
            c.a();
            if (!t0()) {
                k0();
            }
        }
    }
}
