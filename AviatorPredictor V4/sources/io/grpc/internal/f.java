package io.grpc.internal;

import io.grpc.internal.g;
import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;
import java.io.InputStream;

/* loaded from: classes.dex */
public class f implements y {

    /* renamed from: e, reason: collision with root package name */
    private final k1.b f5159e;

    /* renamed from: f, reason: collision with root package name */
    private final io.grpc.internal.g f5160f;

    /* renamed from: g, reason: collision with root package name */
    private final k1 f5161g;

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5162e;

        a(int r22) {
            this.f5162e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f5161g.r()) {
                return;
            }
            try {
                f.this.f5161g.d(this.f5162e);
            } catch (Throwable th) {
                f.this.f5160f.b(th);
                f.this.f5161g.close();
            }
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u1 f5164e;

        b(u1 u1Var) {
            this.f5164e = u1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f.this.f5161g.k(this.f5164e);
            } catch (Throwable th) {
                f.this.f5160f.b(th);
                f.this.f5161g.close();
            }
        }
    }

    class c implements Closeable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ u1 f5166e;

        c(u1 u1Var) {
            this.f5166e = u1Var;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5166e.close();
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f5161g.h();
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.f5161g.close();
        }
    }

    /* renamed from: io.grpc.internal.f$f, reason: collision with other inner class name */
    private class C0057f extends g implements Closeable {

        /* renamed from: h, reason: collision with root package name */
        private final Closeable f5170h;

        public C0057f(Runnable runnable, Closeable closeable) {
            super(f.this, runnable, null);
            this.f5170h = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f5170h.close();
        }
    }

    private class g implements j2.a {

        /* renamed from: e, reason: collision with root package name */
        private final Runnable f5172e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5173f;

        private g(Runnable runnable) {
            this.f5173f = false;
            this.f5172e = runnable;
        }

        /* synthetic */ g(f fVar, Runnable runnable, a aVar) {
            this(runnable);
        }

        private void a() {
            if (this.f5173f) {
                return;
            }
            this.f5172e.run();
            this.f5173f = true;
        }

        @Override // io.grpc.internal.j2.a
        public InputStream next() {
            a();
            return f.this.f5160f.f();
        }
    }

    interface h extends g.d {
    }

    f(k1.b bVar, h hVar, k1 k1Var) {
        g2 g2Var = new g2((k1.b) q0.l.o(bVar, "listener"));
        this.f5159e = g2Var;
        io.grpc.internal.g gVar = new io.grpc.internal.g(g2Var, hVar);
        this.f5160f = gVar;
        k1Var.H(gVar);
        this.f5161g = k1Var;
    }

    @Override // io.grpc.internal.y
    public void close() {
        this.f5161g.K();
        this.f5159e.a(new g(this, new e(), null));
    }

    @Override // io.grpc.internal.y
    public void d(int r4) {
        this.f5159e.a(new g(this, new a(r4), null));
    }

    @Override // io.grpc.internal.y
    public void e(int r22) {
        this.f5161g.e(r22);
    }

    @Override // io.grpc.internal.y
    public void h() {
        this.f5159e.a(new g(this, new d(), null));
    }

    @Override // io.grpc.internal.y
    public void i(b3.u uVar) {
        this.f5161g.i(uVar);
    }

    @Override // io.grpc.internal.y
    public void k(u1 u1Var) {
        this.f5159e.a(new C0057f(new b(u1Var), new c(u1Var)));
    }
}
