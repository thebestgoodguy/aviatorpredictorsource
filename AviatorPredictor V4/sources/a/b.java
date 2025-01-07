package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class b extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f6b = Executors.newFixedThreadPool(2, new a());

    /* renamed from: c, reason: collision with root package name */
    private volatile Handler f7c;

    class a implements ThreadFactory {

        /* renamed from: e, reason: collision with root package name */
        private final AtomicInteger f8e = new AtomicInteger(0);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f8e.getAndIncrement())));
            return thread;
        }
    }

    @Override // a.c
    public void a(Runnable runnable) {
        this.f6b.execute(runnable);
    }

    @Override // a.c
    public boolean b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // a.c
    public void c(Runnable runnable) {
        if (this.f7c == null) {
            synchronized (this.f5a) {
                if (this.f7c == null) {
                    this.f7c = new Handler(Looper.getMainLooper());
                }
            }
        }
        this.f7c.post(runnable);
    }
}
