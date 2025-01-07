package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class c1 implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f5119f = Logger.getLogger(c1.class.getName());

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f5120e;

    public c1(Runnable runnable) {
        this.f5120e = (Runnable) q0.l.o(runnable, "task");
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f5120e.run();
        } catch (Throwable th) {
            f5119f.log(Level.SEVERE, "Exception while executing runnable " + this.f5120e, th);
            q0.q.f(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f5120e + ")";
    }
}
