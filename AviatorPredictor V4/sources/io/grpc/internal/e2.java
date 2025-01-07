package io.grpc.internal;

import java.util.IdentityHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: d, reason: collision with root package name */
    private static final e2 f5148d = new e2(new a());

    /* renamed from: a, reason: collision with root package name */
    private final IdentityHashMap<d<?>, c> f5149a = new IdentityHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private final e f5150b;

    /* renamed from: c, reason: collision with root package name */
    private ScheduledExecutorService f5151c;

    class a implements e {
        a() {
        }

        @Override // io.grpc.internal.e2.e
        public ScheduledExecutorService a() {
            return Executors.newSingleThreadScheduledExecutor(q0.i("grpc-shared-destroyer-%d", true));
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f5152e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f5153f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f5154g;

        b(c cVar, d dVar, Object obj) {
            this.f5152e = cVar;
            this.f5153f = dVar;
            this.f5154g = obj;
        }

        /* JADX WARN: Finally extract failed */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (e2.this) {
                if (this.f5152e.f5157b == 0) {
                    try {
                        this.f5153f.b(this.f5154g);
                        e2.this.f5149a.remove(this.f5153f);
                        if (e2.this.f5149a.isEmpty()) {
                            e2.this.f5151c.shutdown();
                            e2.this.f5151c = null;
                        }
                    } catch (Throwable th) {
                        e2.this.f5149a.remove(this.f5153f);
                        if (e2.this.f5149a.isEmpty()) {
                            e2.this.f5151c.shutdown();
                            e2.this.f5151c = null;
                        }
                        throw th;
                    }
                }
            }
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final Object f5156a;

        /* renamed from: b, reason: collision with root package name */
        int f5157b;

        /* renamed from: c, reason: collision with root package name */
        ScheduledFuture<?> f5158c;

        c(Object obj) {
            this.f5156a = obj;
        }
    }

    public interface d<T> {
        T a();

        void b(T t4);
    }

    interface e {
        ScheduledExecutorService a();
    }

    e2(e eVar) {
        this.f5150b = eVar;
    }

    public static <T> T d(d<T> dVar) {
        return (T) f5148d.e(dVar);
    }

    public static <T> T f(d<T> dVar, T t4) {
        return (T) f5148d.g(dVar, t4);
    }

    synchronized <T> T e(d<T> dVar) {
        c cVar;
        cVar = this.f5149a.get(dVar);
        if (cVar == null) {
            cVar = new c(dVar.a());
            this.f5149a.put(dVar, cVar);
        }
        ScheduledFuture<?> scheduledFuture = cVar.f5158c;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            cVar.f5158c = null;
        }
        cVar.f5157b++;
        return (T) cVar.f5156a;
    }

    synchronized <T> T g(d<T> dVar, T t4) {
        c cVar = this.f5149a.get(dVar);
        if (cVar == null) {
            throw new IllegalArgumentException("No cached instance found for " + dVar);
        }
        q0.l.e(t4 == cVar.f5156a, "Releasing the wrong instance");
        q0.l.u(cVar.f5157b > 0, "Refcount has already reached zero");
        int r12 = cVar.f5157b - 1;
        cVar.f5157b = r12;
        if (r12 == 0) {
            q0.l.u(cVar.f5158c == null, "Destroy task already scheduled");
            if (this.f5151c == null) {
                this.f5151c = this.f5150b.a();
            }
            cVar.f5158c = this.f5151c.schedule(new c1(new b(cVar, dVar, t4)), 1L, TimeUnit.SECONDS);
        }
        return null;
    }
}
