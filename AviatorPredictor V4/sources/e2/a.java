package e2;

import h2.d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    private static a f3478e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f3479f;

    /* renamed from: a, reason: collision with root package name */
    private d f3480a;

    /* renamed from: b, reason: collision with root package name */
    private g2.a f3481b;

    /* renamed from: c, reason: collision with root package name */
    private FlutterJNI.c f3482c;

    /* renamed from: d, reason: collision with root package name */
    private ExecutorService f3483d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f3484a;

        /* renamed from: b, reason: collision with root package name */
        private g2.a f3485b;

        /* renamed from: c, reason: collision with root package name */
        private FlutterJNI.c f3486c;

        /* renamed from: d, reason: collision with root package name */
        private ExecutorService f3487d;

        /* renamed from: e2.a$b$a, reason: collision with other inner class name */
        private class ThreadFactoryC0034a implements ThreadFactory {

            /* renamed from: e, reason: collision with root package name */
            private int f3488e;

            private ThreadFactoryC0034a() {
                this.f3488e = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int r12 = this.f3488e;
                this.f3488e = r12 + 1;
                sb.append(r12);
                thread.setName(sb.toString());
                return thread;
            }
        }

        private void b() {
            if (this.f3486c == null) {
                this.f3486c = new FlutterJNI.c();
            }
            if (this.f3487d == null) {
                this.f3487d = Executors.newCachedThreadPool(new ThreadFactoryC0034a());
            }
            if (this.f3484a == null) {
                this.f3484a = new d(this.f3486c.a(), this.f3487d);
            }
        }

        public a a() {
            b();
            return new a(this.f3484a, this.f3485b, this.f3486c, this.f3487d);
        }
    }

    private a(d dVar, g2.a aVar, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f3480a = dVar;
        this.f3481b = aVar;
        this.f3482c = cVar;
        this.f3483d = executorService;
    }

    public static a e() {
        f3479f = true;
        if (f3478e == null) {
            f3478e = new b().a();
        }
        return f3478e;
    }

    public g2.a a() {
        return this.f3481b;
    }

    public ExecutorService b() {
        return this.f3483d;
    }

    public d c() {
        return this.f3480a;
    }

    public FlutterJNI.c d() {
        return this.f3482c;
    }
}
