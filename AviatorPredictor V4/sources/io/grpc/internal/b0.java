package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class b0 implements q {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f5011a;

    /* renamed from: b, reason: collision with root package name */
    private r f5012b;

    /* renamed from: c, reason: collision with root package name */
    private q f5013c;

    /* renamed from: d, reason: collision with root package name */
    private b3.f1 f5014d;

    /* renamed from: f, reason: collision with root package name */
    private o f5016f;

    /* renamed from: g, reason: collision with root package name */
    private long f5017g;

    /* renamed from: h, reason: collision with root package name */
    private long f5018h;

    /* renamed from: e, reason: collision with root package name */
    private List<Runnable> f5015e = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private List<Runnable> f5019i = new ArrayList();

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5020e;

        a(int r22) {
            this.f5020e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.d(this.f5020e);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.m();
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.n f5023e;

        c(b3.n nVar) {
            this.f5023e = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.b(this.f5023e);
        }
    }

    class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f5025e;

        d(boolean z4) {
            this.f5025e = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.q(this.f5025e);
        }
    }

    class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.v f5027e;

        e(b3.v vVar) {
            this.f5027e = vVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.k(this.f5027e);
        }
    }

    class f implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5029e;

        f(int r22) {
            this.f5029e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.e(this.f5029e);
        }
    }

    class g implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f5031e;

        g(int r22) {
            this.f5031e = r22;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.a(this.f5031e);
        }
    }

    class h implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.t f5033e;

        h(b3.t tVar) {
            this.f5033e = tVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.g(this.f5033e);
        }
    }

    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.t();
        }
    }

    class j implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f5036e;

        j(String str) {
            this.f5036e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.j(this.f5036e);
        }
    }

    class k implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InputStream f5038e;

        k(InputStream inputStream) {
            this.f5038e = inputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.h(this.f5038e);
        }
    }

    class l implements Runnable {
        l() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.flush();
        }
    }

    class m implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f5041e;

        m(b3.f1 f1Var) {
            this.f5041e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.c(this.f5041e);
        }
    }

    class n implements Runnable {
        n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f5013c.n();
        }
    }

    private static class o implements r {

        /* renamed from: a, reason: collision with root package name */
        private final r f5044a;

        /* renamed from: b, reason: collision with root package name */
        private volatile boolean f5045b;

        /* renamed from: c, reason: collision with root package name */
        private List<Runnable> f5046c = new ArrayList();

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ j2.a f5047e;

            a(j2.a aVar) {
                this.f5047e = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f5044a.a(this.f5047e);
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f5044a.b();
            }
        }

        class c implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5050e;

            c(b3.u0 u0Var) {
                this.f5050e = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f5044a.c(this.f5050e);
            }
        }

        class d implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5052e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ r.a f5053f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ b3.u0 f5054g;

            d(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
                this.f5052e = f1Var;
                this.f5053f = aVar;
                this.f5054g = u0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                o.this.f5044a.d(this.f5052e, this.f5053f, this.f5054g);
            }
        }

        public o(r rVar) {
            this.f5044a = rVar;
        }

        private void f(Runnable runnable) {
            synchronized (this) {
                if (this.f5045b) {
                    runnable.run();
                } else {
                    this.f5046c.add(runnable);
                }
            }
        }

        @Override // io.grpc.internal.j2
        public void a(j2.a aVar) {
            if (this.f5045b) {
                this.f5044a.a(aVar);
            } else {
                f(new a(aVar));
            }
        }

        @Override // io.grpc.internal.j2
        public void b() {
            if (this.f5045b) {
                this.f5044a.b();
            } else {
                f(new b());
            }
        }

        @Override // io.grpc.internal.r
        public void c(b3.u0 u0Var) {
            f(new c(u0Var));
        }

        @Override // io.grpc.internal.r
        public void d(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
            f(new d(f1Var, aVar, u0Var));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g() {
            List list;
            List arrayList = new ArrayList();
            while (true) {
                synchronized (this) {
                    if (this.f5046c.isEmpty()) {
                        this.f5046c = null;
                        this.f5045b = true;
                        return;
                    } else {
                        list = this.f5046c;
                        this.f5046c = arrayList;
                    }
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                list.clear();
                arrayList = list;
            }
        }
    }

    b0() {
    }

    private void s(Runnable runnable) {
        q0.l.u(this.f5012b != null, "May only be called after start");
        synchronized (this) {
            if (this.f5011a) {
                runnable.run();
            } else {
                this.f5015e.add(runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.hasNext() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List<java.lang.Runnable> r1 = r3.f5015e     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L1d
            r0 = 0
            r3.f5015e = r0     // Catch: java.lang.Throwable -> L3b
            r0 = 1
            r3.f5011a = r0     // Catch: java.lang.Throwable -> L3b
            io.grpc.internal.b0$o r0 = r3.f5016f     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L1c
            r0.g()
        L1c:
            return
        L1d:
            java.util.List<java.lang.Runnable> r1 = r3.f5015e     // Catch: java.lang.Throwable -> L3b
            r3.f5015e = r0     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r0 = r1.iterator()
        L26:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L36
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L26
        L36:
            r1.clear()
            r0 = r1
            goto L5
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.b0.t():void");
    }

    private void u(r rVar) {
        Iterator<Runnable> it = this.f5019i.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.f5019i = null;
        this.f5013c.i(rVar);
    }

    private void w(q qVar) {
        q qVar2 = this.f5013c;
        q0.l.w(qVar2 == null, "realStream already set to %s", qVar2);
        this.f5013c = qVar;
        this.f5018h = System.nanoTime();
    }

    @Override // io.grpc.internal.q
    public void a(int r32) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        this.f5019i.add(new g(r32));
    }

    @Override // io.grpc.internal.i2
    public void b(b3.n nVar) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        q0.l.o(nVar, "compressor");
        this.f5019i.add(new c(nVar));
    }

    @Override // io.grpc.internal.q
    public void c(b3.f1 f1Var) {
        boolean z4 = true;
        q0.l.u(this.f5012b != null, "May only be called after start");
        q0.l.o(f1Var, "reason");
        synchronized (this) {
            if (this.f5013c == null) {
                w(n1.f5483a);
                this.f5014d = f1Var;
                z4 = false;
            }
        }
        if (z4) {
            s(new m(f1Var));
            return;
        }
        t();
        v(f1Var);
        this.f5012b.d(f1Var, r.a.PROCESSED, new b3.u0());
    }

    @Override // io.grpc.internal.i2
    public void d(int r32) {
        q0.l.u(this.f5012b != null, "May only be called after start");
        if (this.f5011a) {
            this.f5013c.d(r32);
        } else {
            s(new a(r32));
        }
    }

    @Override // io.grpc.internal.q
    public void e(int r32) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        this.f5019i.add(new f(r32));
    }

    @Override // io.grpc.internal.i2
    public boolean f() {
        if (this.f5011a) {
            return this.f5013c.f();
        }
        return false;
    }

    @Override // io.grpc.internal.i2
    public void flush() {
        q0.l.u(this.f5012b != null, "May only be called after start");
        if (this.f5011a) {
            this.f5013c.flush();
        } else {
            s(new l());
        }
    }

    @Override // io.grpc.internal.q
    public void g(b3.t tVar) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        this.f5019i.add(new h(tVar));
    }

    @Override // io.grpc.internal.i2
    public void h(InputStream inputStream) {
        q0.l.u(this.f5012b != null, "May only be called after start");
        q0.l.o(inputStream, "message");
        if (this.f5011a) {
            this.f5013c.h(inputStream);
        } else {
            s(new k(inputStream));
        }
    }

    @Override // io.grpc.internal.q
    public void i(r rVar) {
        b3.f1 f1Var;
        boolean z4;
        q0.l.o(rVar, "listener");
        q0.l.u(this.f5012b == null, "already started");
        synchronized (this) {
            f1Var = this.f5014d;
            z4 = this.f5011a;
            if (!z4) {
                o oVar = new o(rVar);
                this.f5016f = oVar;
                rVar = oVar;
            }
            this.f5012b = rVar;
            this.f5017g = System.nanoTime();
        }
        if (f1Var != null) {
            rVar.d(f1Var, r.a.PROCESSED, new b3.u0());
        } else if (z4) {
            u(rVar);
        }
    }

    @Override // io.grpc.internal.q
    public void j(String str) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        q0.l.o(str, "authority");
        this.f5019i.add(new j(str));
    }

    @Override // io.grpc.internal.q
    public void k(b3.v vVar) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        q0.l.o(vVar, "decompressorRegistry");
        this.f5019i.add(new e(vVar));
    }

    @Override // io.grpc.internal.q
    public void l(w0 w0Var) {
        synchronized (this) {
            if (this.f5012b == null) {
                return;
            }
            if (this.f5013c != null) {
                w0Var.b("buffered_nanos", Long.valueOf(this.f5018h - this.f5017g));
                this.f5013c.l(w0Var);
            } else {
                w0Var.b("buffered_nanos", Long.valueOf(System.nanoTime() - this.f5017g));
                w0Var.a("waiting_for_connection");
            }
        }
    }

    @Override // io.grpc.internal.i2
    public void m() {
        q0.l.u(this.f5012b == null, "May only be called before start");
        this.f5019i.add(new b());
    }

    @Override // io.grpc.internal.q
    public void n() {
        q0.l.u(this.f5012b != null, "May only be called after start");
        s(new n());
    }

    @Override // io.grpc.internal.q
    public void q(boolean z4) {
        q0.l.u(this.f5012b == null, "May only be called before start");
        this.f5019i.add(new d(z4));
    }

    protected void v(b3.f1 f1Var) {
    }

    final Runnable x(q qVar) {
        synchronized (this) {
            if (this.f5013c != null) {
                return null;
            }
            w((q) q0.l.o(qVar, "stream"));
            r rVar = this.f5012b;
            if (rVar == null) {
                this.f5015e = null;
                this.f5011a = true;
            }
            if (rVar == null) {
                return null;
            }
            u(rVar);
            return new i();
        }
    }
}
