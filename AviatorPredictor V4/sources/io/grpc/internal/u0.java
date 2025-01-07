package io.grpc.internal;

import io.grpc.internal.s;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f5679g = Logger.getLogger(u0.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final long f5680a;

    /* renamed from: b, reason: collision with root package name */
    private final q0.n f5681b;

    /* renamed from: c, reason: collision with root package name */
    private Map<s.a, Executor> f5682c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f5683d;

    /* renamed from: e, reason: collision with root package name */
    private Throwable f5684e;

    /* renamed from: f, reason: collision with root package name */
    private long f5685f;

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s.a f5686e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f5687f;

        a(s.a aVar, long j4) {
            this.f5686e = aVar;
            this.f5687f = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5686e.a(this.f5687f);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ s.a f5688e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Throwable f5689f;

        b(s.a aVar, Throwable th) {
            this.f5688e = aVar;
            this.f5689f = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5688e.b(this.f5689f);
        }
    }

    public u0(long j4, q0.n nVar) {
        this.f5680a = j4;
        this.f5681b = nVar;
    }

    private static Runnable b(s.a aVar, long j4) {
        return new a(aVar, j4);
    }

    private static Runnable c(s.a aVar, Throwable th) {
        return new b(aVar, th);
    }

    private static void e(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (Throwable th) {
            f5679g.log(Level.SEVERE, "Failed to execute PingCallback", th);
        }
    }

    public static void g(s.a aVar, Executor executor, Throwable th) {
        e(executor, c(aVar, th));
    }

    public void a(s.a aVar, Executor executor) {
        synchronized (this) {
            if (!this.f5683d) {
                this.f5682c.put(aVar, executor);
            } else {
                Throwable th = this.f5684e;
                e(executor, th != null ? c(aVar, th) : b(aVar, this.f5685f));
            }
        }
    }

    public boolean d() {
        synchronized (this) {
            if (this.f5683d) {
                return false;
            }
            this.f5683d = true;
            long d5 = this.f5681b.d(TimeUnit.NANOSECONDS);
            this.f5685f = d5;
            Map<s.a, Executor> map = this.f5682c;
            this.f5682c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                e(entry.getValue(), b(entry.getKey(), d5));
            }
            return true;
        }
    }

    public void f(Throwable th) {
        synchronized (this) {
            if (this.f5683d) {
                return;
            }
            this.f5683d = true;
            this.f5684e = th;
            Map<s.a, Executor> map = this.f5682c;
            this.f5682c = null;
            for (Map.Entry<s.a, Executor> entry : map.entrySet()) {
                g(entry.getKey(), entry.getValue(), th);
            }
        }
    }

    public long h() {
        return this.f5680a;
    }
}
