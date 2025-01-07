package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
final class g implements k1.b {

    /* renamed from: a, reason: collision with root package name */
    private final d f5316a;

    /* renamed from: b, reason: collision with root package name */
    private final k1.b f5317b;

    /* renamed from: c, reason: collision with root package name */
    private final Queue<InputStream> f5318c = new ArrayDeque();

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5319e;

        a(int r22) {
            this.f5319e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f5317b.d(this.f5319e);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5321e;

        b(boolean z4) {
            this.f5321e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f5317b.c(this.f5321e);
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Throwable f5323e;

        c(Throwable th) {
            this.f5323e = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            g.this.f5317b.b(this.f5323e);
        }
    }

    public interface d {
        void e(Runnable runnable);
    }

    public g(k1.b bVar, d dVar) {
        this.f5317b = (k1.b) q0.l.o(bVar, "listener");
        this.f5316a = (d) q0.l.o(dVar, "transportExecutor");
    }

    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                this.f5318c.add(next);
            }
        }
    }

    @Override // io.grpc.internal.k1.b
    public void b(Throwable th) {
        this.f5316a.e(new c(th));
    }

    @Override // io.grpc.internal.k1.b
    public void c(boolean z4) {
        this.f5316a.e(new b(z4));
    }

    @Override // io.grpc.internal.k1.b
    public void d(int r32) {
        this.f5316a.e(new a(r32));
    }

    public InputStream f() {
        return this.f5318c.poll();
    }
}
