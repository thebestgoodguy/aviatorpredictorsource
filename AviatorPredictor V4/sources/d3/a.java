package d3;

import d3.b;
import io.grpc.internal.c2;
import java.io.IOException;
import java.net.Socket;

/* loaded from: classes.dex */
final class a implements h4.m {

    /* renamed from: g, reason: collision with root package name */
    private final c2 f3219g;

    /* renamed from: h, reason: collision with root package name */
    private final b.a f3220h;

    /* renamed from: l, reason: collision with root package name */
    private h4.m f3224l;

    /* renamed from: m, reason: collision with root package name */
    private Socket f3225m;

    /* renamed from: e, reason: collision with root package name */
    private final Object f3217e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final h4.c f3218f = new h4.c();

    /* renamed from: i, reason: collision with root package name */
    private boolean f3221i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f3222j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3223k = false;

    /* renamed from: d3.a$a, reason: collision with other inner class name */
    class C0028a extends d {

        /* renamed from: f, reason: collision with root package name */
        final j3.b f3226f;

        C0028a() {
            super(a.this, null);
            this.f3226f = j3.c.e();
        }

        @Override // d3.a.d
        public void a() {
            j3.c.f("WriteRunnable.runWrite");
            j3.c.d(this.f3226f);
            h4.c cVar = new h4.c();
            try {
                synchronized (a.this.f3217e) {
                    cVar.w(a.this.f3218f, a.this.f3218f.h());
                    a.this.f3221i = false;
                }
                a.this.f3224l.w(cVar, cVar.i0());
            } finally {
                j3.c.h("WriteRunnable.runWrite");
            }
        }
    }

    class b extends d {

        /* renamed from: f, reason: collision with root package name */
        final j3.b f3228f;

        b() {
            super(a.this, null);
            this.f3228f = j3.c.e();
        }

        @Override // d3.a.d
        public void a() {
            j3.c.f("WriteRunnable.runFlush");
            j3.c.d(this.f3228f);
            h4.c cVar = new h4.c();
            try {
                synchronized (a.this.f3217e) {
                    cVar.w(a.this.f3218f, a.this.f3218f.i0());
                    a.this.f3222j = false;
                }
                a.this.f3224l.w(cVar, cVar.i0());
                a.this.f3224l.flush();
            } finally {
                j3.c.h("WriteRunnable.runFlush");
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.f3218f.close();
            try {
                if (a.this.f3224l != null) {
                    a.this.f3224l.close();
                }
            } catch (IOException e5) {
                a.this.f3220h.b(e5);
            }
            try {
                if (a.this.f3225m != null) {
                    a.this.f3225m.close();
                }
            } catch (IOException e6) {
                a.this.f3220h.b(e6);
            }
        }
    }

    private abstract class d implements Runnable {
        private d() {
        }

        /* synthetic */ d(a aVar, C0028a c0028a) {
            this();
        }

        public abstract void a();

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (a.this.f3224l == null) {
                    throw new IOException("Unable to perform write due to unavailable sink.");
                }
                a();
            } catch (Exception e5) {
                a.this.f3220h.b(e5);
            }
        }
    }

    private a(c2 c2Var, b.a aVar) {
        this.f3219g = (c2) q0.l.o(c2Var, "executor");
        this.f3220h = (b.a) q0.l.o(aVar, "exceptionHandler");
    }

    static a r(c2 c2Var, b.a aVar) {
        return new a(c2Var, aVar);
    }

    @Override // h4.m, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3223k) {
            return;
        }
        this.f3223k = true;
        this.f3219g.execute(new c());
    }

    @Override // h4.m, java.io.Flushable
    public void flush() {
        if (this.f3223k) {
            throw new IOException("closed");
        }
        j3.c.f("AsyncSink.flush");
        try {
            synchronized (this.f3217e) {
                if (this.f3222j) {
                    return;
                }
                this.f3222j = true;
                this.f3219g.execute(new b());
            }
        } finally {
            j3.c.h("AsyncSink.flush");
        }
    }

    void n(h4.m mVar, Socket socket) {
        q0.l.u(this.f3224l == null, "AsyncSink's becomeConnected should only be called once.");
        this.f3224l = (h4.m) q0.l.o(mVar, "sink");
        this.f3225m = (Socket) q0.l.o(socket, "socket");
    }

    @Override // h4.m
    public void w(h4.c cVar, long j4) {
        q0.l.o(cVar, "source");
        if (this.f3223k) {
            throw new IOException("closed");
        }
        j3.c.f("AsyncSink.write");
        try {
            synchronized (this.f3217e) {
                this.f3218f.w(cVar, j4);
                if (!this.f3221i && !this.f3222j && this.f3218f.h() > 0) {
                    this.f3221i = true;
                    this.f3219g.execute(new C0028a());
                }
            }
        } finally {
            j3.c.h("AsyncSink.write");
        }
    }
}
