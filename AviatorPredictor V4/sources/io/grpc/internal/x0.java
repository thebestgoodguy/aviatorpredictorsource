package io.grpc.internal;

import b3.f;
import b3.j1;
import io.grpc.internal.j1;
import io.grpc.internal.k;
import io.grpc.internal.r;
import io.grpc.internal.t;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class x0 implements b3.g0<Object>, m2 {

    /* renamed from: a, reason: collision with root package name */
    private final b3.h0 f5710a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5711b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5712c;

    /* renamed from: d, reason: collision with root package name */
    private final k.a f5713d;

    /* renamed from: e, reason: collision with root package name */
    private final j f5714e;

    /* renamed from: f, reason: collision with root package name */
    private final t f5715f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f5716g;

    /* renamed from: h, reason: collision with root package name */
    private final b3.c0 f5717h;

    /* renamed from: i, reason: collision with root package name */
    private final io.grpc.internal.m f5718i;

    /* renamed from: j, reason: collision with root package name */
    private final o f5719j;

    /* renamed from: k, reason: collision with root package name */
    private final b3.f f5720k;

    /* renamed from: l, reason: collision with root package name */
    private final b3.j1 f5721l;

    /* renamed from: m, reason: collision with root package name */
    private final k f5722m;

    /* renamed from: n, reason: collision with root package name */
    private volatile List<b3.x> f5723n;

    /* renamed from: o, reason: collision with root package name */
    private io.grpc.internal.k f5724o;

    /* renamed from: p, reason: collision with root package name */
    private final q0.n f5725p;

    /* renamed from: q, reason: collision with root package name */
    private j1.c f5726q;

    /* renamed from: r, reason: collision with root package name */
    private j1.c f5727r;

    /* renamed from: s, reason: collision with root package name */
    private j1 f5728s;

    /* renamed from: v, reason: collision with root package name */
    private v f5731v;

    /* renamed from: w, reason: collision with root package name */
    private volatile j1 f5732w;

    /* renamed from: y, reason: collision with root package name */
    private b3.f1 f5734y;

    /* renamed from: t, reason: collision with root package name */
    private final Collection<v> f5729t = new ArrayList();

    /* renamed from: u, reason: collision with root package name */
    private final v0<v> f5730u = new a();

    /* renamed from: x, reason: collision with root package name */
    private volatile b3.q f5733x = b3.q.a(b3.p.IDLE);

    class a extends v0<v> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            x0.this.f5714e.a(x0.this);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            x0.this.f5714e.b(x0.this);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f5726q = null;
            x0.this.f5720k.a(f.a.INFO, "CONNECTING after backoff");
            x0.this.N(b3.p.CONNECTING);
            x0.this.T();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (x0.this.f5733x.c() == b3.p.IDLE) {
                x0.this.f5720k.a(f.a.INFO, "CONNECTING as requested");
                x0.this.N(b3.p.CONNECTING);
                x0.this.T();
            }
        }
    }

    class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f5738e;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                j1 j1Var = x0.this.f5728s;
                x0.this.f5727r = null;
                x0.this.f5728s = null;
                j1Var.f(b3.f1.f771u.q("InternalSubchannel closed transport due to address change"));
            }
        }

        d(List list) {
            this.f5738e = list;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0094  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r7 = this;
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                java.net.SocketAddress r0 = r0.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                java.util.List r2 = r7.f5738e
                r1.h(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                java.util.List r2 = r7.f5738e
                io.grpc.internal.x0.J(r1, r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                b3.q r1 = io.grpc.internal.x0.i(r1)
                b3.p r1 = r1.c()
                b3.p r2 = b3.p.READY
                r3 = 0
                if (r1 == r2) goto L39
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                b3.q r1 = io.grpc.internal.x0.i(r1)
                b3.p r1 = r1.c()
                b3.p r4 = b3.p.CONNECTING
                if (r1 != r4) goto L91
            L39:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                boolean r0 = r1.g(r0)
                if (r0 != 0) goto L91
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                b3.q r0 = io.grpc.internal.x0.i(r0)
                b3.p r0 = r0.c()
                if (r0 != r2) goto L6d
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r0 = io.grpc.internal.x0.j(r0)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.k(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r1 = io.grpc.internal.x0.I(r1)
                r1.f()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                b3.p r2 = b3.p.IDLE
                io.grpc.internal.x0.E(r1, r2)
                goto L92
            L6d:
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.v r0 = io.grpc.internal.x0.l(r0)
                b3.f1 r1 = b3.f1.f771u
                java.lang.String r2 = "InternalSubchannel closed pending transport due to address change"
                b3.f1 r1 = r1.q(r2)
                r0.f(r1)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.m(r0, r3)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0$k r0 = io.grpc.internal.x0.I(r0)
                r0.f()
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                io.grpc.internal.x0.F(r0)
            L91:
                r0 = r3
            L92:
                if (r0 == 0) goto Le1
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                b3.j1$c r1 = io.grpc.internal.x0.n(r1)
                if (r1 == 0) goto Lc0
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.j1 r1 = io.grpc.internal.x0.p(r1)
                b3.f1 r2 = b3.f1.f771u
                java.lang.String r4 = "InternalSubchannel closed transport early due to address change"
                b3.f1 r2 = r2.q(r4)
                r1.f(r2)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                b3.j1$c r1 = io.grpc.internal.x0.n(r1)
                r1.a()
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.o(r1, r3)
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r3)
            Lc0:
                io.grpc.internal.x0 r1 = io.grpc.internal.x0.this
                io.grpc.internal.x0.q(r1, r0)
                io.grpc.internal.x0 r0 = io.grpc.internal.x0.this
                b3.j1 r1 = io.grpc.internal.x0.s(r0)
                io.grpc.internal.x0$d$a r2 = new io.grpc.internal.x0$d$a
                r2.<init>()
                r3 = 5
                java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
                io.grpc.internal.x0 r6 = io.grpc.internal.x0.this
                java.util.concurrent.ScheduledExecutorService r6 = io.grpc.internal.x0.r(r6)
                b3.j1$c r1 = r1.c(r2, r3, r5, r6)
                io.grpc.internal.x0.o(r0, r1)
            Le1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.x0.d.run():void");
        }
    }

    class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f5741e;

        e(b3.f1 f1Var) {
            this.f5741e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            b3.p c5 = x0.this.f5733x.c();
            b3.p pVar = b3.p.SHUTDOWN;
            if (c5 == pVar) {
                return;
            }
            x0.this.f5734y = this.f5741e;
            j1 j1Var = x0.this.f5732w;
            v vVar = x0.this.f5731v;
            x0.this.f5732w = null;
            x0.this.f5731v = null;
            x0.this.N(pVar);
            x0.this.f5722m.f();
            if (x0.this.f5729t.isEmpty()) {
                x0.this.P();
            }
            x0.this.K();
            if (x0.this.f5727r != null) {
                x0.this.f5727r.a();
                x0.this.f5728s.f(this.f5741e);
                x0.this.f5727r = null;
                x0.this.f5728s = null;
            }
            if (j1Var != null) {
                j1Var.f(this.f5741e);
            }
            if (vVar != null) {
                vVar.f(this.f5741e);
            }
        }
    }

    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f5720k.a(f.a.INFO, "Terminated");
            x0.this.f5714e.d(x0.this);
        }
    }

    class g implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ v f5744e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f5745f;

        g(v vVar, boolean z4) {
            this.f5744e = vVar;
            this.f5745f = z4;
        }

        @Override // java.lang.Runnable
        public void run() {
            x0.this.f5730u.e(this.f5744e, this.f5745f);
        }
    }

    class h implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f5747e;

        h(b3.f1 f1Var) {
            this.f5747e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = new ArrayList(x0.this.f5729t).iterator();
            while (it.hasNext()) {
                ((j1) it.next()).a(this.f5747e);
            }
        }
    }

    static final class i extends j0 {

        /* renamed from: a, reason: collision with root package name */
        private final v f5749a;

        /* renamed from: b, reason: collision with root package name */
        private final io.grpc.internal.m f5750b;

        class a extends h0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f5751a;

            /* renamed from: io.grpc.internal.x0$i$a$a, reason: collision with other inner class name */
            class C0060a extends i0 {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ r f5753a;

                C0060a(r rVar) {
                    this.f5753a = rVar;
                }

                @Override // io.grpc.internal.i0, io.grpc.internal.r
                public void d(b3.f1 f1Var, r.a aVar, b3.u0 u0Var) {
                    i.this.f5750b.a(f1Var.o());
                    super.d(f1Var, aVar, u0Var);
                }

                @Override // io.grpc.internal.i0
                protected r e() {
                    return this.f5753a;
                }
            }

            a(q qVar) {
                this.f5751a = qVar;
            }

            @Override // io.grpc.internal.h0, io.grpc.internal.q
            public void i(r rVar) {
                i.this.f5750b.b();
                super.i(new C0060a(rVar));
            }

            @Override // io.grpc.internal.h0
            protected q o() {
                return this.f5751a;
            }
        }

        private i(v vVar, io.grpc.internal.m mVar) {
            this.f5749a = vVar;
            this.f5750b = mVar;
        }

        /* synthetic */ i(v vVar, io.grpc.internal.m mVar, a aVar) {
            this(vVar, mVar);
        }

        @Override // io.grpc.internal.j0
        protected v b() {
            return this.f5749a;
        }

        @Override // io.grpc.internal.j0, io.grpc.internal.s
        public q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
            return new a(super.c(v0Var, u0Var, cVar, kVarArr));
        }
    }

    static abstract class j {
        j() {
        }

        abstract void a(x0 x0Var);

        abstract void b(x0 x0Var);

        abstract void c(x0 x0Var, b3.q qVar);

        abstract void d(x0 x0Var);
    }

    static final class k {

        /* renamed from: a, reason: collision with root package name */
        private List<b3.x> f5755a;

        /* renamed from: b, reason: collision with root package name */
        private int f5756b;

        /* renamed from: c, reason: collision with root package name */
        private int f5757c;

        public k(List<b3.x> list) {
            this.f5755a = list;
        }

        public SocketAddress a() {
            return this.f5755a.get(this.f5756b).a().get(this.f5757c);
        }

        public b3.a b() {
            return this.f5755a.get(this.f5756b).b();
        }

        public void c() {
            b3.x xVar = this.f5755a.get(this.f5756b);
            int r12 = this.f5757c + 1;
            this.f5757c = r12;
            if (r12 >= xVar.a().size()) {
                this.f5756b++;
                this.f5757c = 0;
            }
        }

        public boolean d() {
            return this.f5756b == 0 && this.f5757c == 0;
        }

        public boolean e() {
            return this.f5756b < this.f5755a.size();
        }

        public void f() {
            this.f5756b = 0;
            this.f5757c = 0;
        }

        public boolean g(SocketAddress socketAddress) {
            for (int r12 = 0; r12 < this.f5755a.size(); r12++) {
                int indexOf = this.f5755a.get(r12).a().indexOf(socketAddress);
                if (indexOf != -1) {
                    this.f5756b = r12;
                    this.f5757c = indexOf;
                    return true;
                }
            }
            return false;
        }

        public void h(List<b3.x> list) {
            this.f5755a = list;
            f();
        }
    }

    private class l implements j1.a {

        /* renamed from: a, reason: collision with root package name */
        final v f5758a;

        /* renamed from: b, reason: collision with root package name */
        final SocketAddress f5759b;

        /* renamed from: c, reason: collision with root package name */
        boolean f5760c = false;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f5724o = null;
                if (x0.this.f5734y != null) {
                    q0.l.u(x0.this.f5732w == null, "Unexpected non-null activeTransport");
                    l lVar = l.this;
                    lVar.f5758a.f(x0.this.f5734y);
                    return;
                }
                v vVar = x0.this.f5731v;
                l lVar2 = l.this;
                v vVar2 = lVar2.f5758a;
                if (vVar == vVar2) {
                    x0.this.f5732w = vVar2;
                    x0.this.f5731v = null;
                    x0.this.N(b3.p.READY);
                }
            }
        }

        class b implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ b3.f1 f5763e;

            b(b3.f1 f1Var) {
                this.f5763e = f1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (x0.this.f5733x.c() == b3.p.SHUTDOWN) {
                    return;
                }
                j1 j1Var = x0.this.f5732w;
                l lVar = l.this;
                if (j1Var == lVar.f5758a) {
                    x0.this.f5732w = null;
                    x0.this.f5722m.f();
                    x0.this.N(b3.p.IDLE);
                    return;
                }
                v vVar = x0.this.f5731v;
                l lVar2 = l.this;
                if (vVar == lVar2.f5758a) {
                    q0.l.w(x0.this.f5733x.c() == b3.p.CONNECTING, "Expected state is CONNECTING, actual state is %s", x0.this.f5733x.c());
                    x0.this.f5722m.c();
                    if (x0.this.f5722m.e()) {
                        x0.this.T();
                        return;
                    }
                    x0.this.f5731v = null;
                    x0.this.f5722m.f();
                    x0.this.S(this.f5763e);
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                x0.this.f5729t.remove(l.this.f5758a);
                if (x0.this.f5733x.c() == b3.p.SHUTDOWN && x0.this.f5729t.isEmpty()) {
                    x0.this.P();
                }
            }
        }

        l(v vVar, SocketAddress socketAddress) {
            this.f5758a = vVar;
            this.f5759b = socketAddress;
        }

        @Override // io.grpc.internal.j1.a
        public void a() {
            q0.l.u(this.f5760c, "transportShutdown() must be called before transportTerminated().");
            x0.this.f5720k.b(f.a.INFO, "{0} Terminated", this.f5758a.d());
            x0.this.f5717h.i(this.f5758a);
            x0.this.Q(this.f5758a, false);
            x0.this.f5721l.execute(new c());
        }

        @Override // io.grpc.internal.j1.a
        public void b() {
            x0.this.f5720k.a(f.a.INFO, "READY");
            x0.this.f5721l.execute(new a());
        }

        @Override // io.grpc.internal.j1.a
        public void c(b3.f1 f1Var) {
            x0.this.f5720k.b(f.a.INFO, "{0} SHUTDOWN with {1}", this.f5758a.d(), x0.this.R(f1Var));
            this.f5760c = true;
            x0.this.f5721l.execute(new b(f1Var));
        }

        @Override // io.grpc.internal.j1.a
        public void d(boolean z4) {
            x0.this.Q(this.f5758a, z4);
        }
    }

    static final class m extends b3.f {

        /* renamed from: a, reason: collision with root package name */
        b3.h0 f5766a;

        m() {
        }

        @Override // b3.f
        public void a(f.a aVar, String str) {
            n.d(this.f5766a, aVar, str);
        }

        @Override // b3.f
        public void b(f.a aVar, String str, Object... objArr) {
            n.e(this.f5766a, aVar, str, objArr);
        }
    }

    x0(List<b3.x> list, String str, String str2, k.a aVar, t tVar, ScheduledExecutorService scheduledExecutorService, q0.p<q0.n> pVar, b3.j1 j1Var, j jVar, b3.c0 c0Var, io.grpc.internal.m mVar, o oVar, b3.h0 h0Var, b3.f fVar) {
        q0.l.o(list, "addressGroups");
        q0.l.e(!list.isEmpty(), "addressGroups is empty");
        L(list, "addressGroups contains null entry");
        List<b3.x> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f5723n = unmodifiableList;
        this.f5722m = new k(unmodifiableList);
        this.f5711b = str;
        this.f5712c = str2;
        this.f5713d = aVar;
        this.f5715f = tVar;
        this.f5716g = scheduledExecutorService;
        this.f5725p = pVar.get();
        this.f5721l = j1Var;
        this.f5714e = jVar;
        this.f5717h = c0Var;
        this.f5718i = mVar;
        this.f5719j = (o) q0.l.o(oVar, "channelTracer");
        this.f5710a = (b3.h0) q0.l.o(h0Var, "logId");
        this.f5720k = (b3.f) q0.l.o(fVar, "channelLogger");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        this.f5721l.d();
        j1.c cVar = this.f5726q;
        if (cVar != null) {
            cVar.a();
            this.f5726q = null;
            this.f5724o = null;
        }
    }

    private static void L(List<?> list, String str) {
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            q0.l.o(it.next(), str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(b3.p pVar) {
        this.f5721l.d();
        O(b3.q.a(pVar));
    }

    private void O(b3.q qVar) {
        this.f5721l.d();
        if (this.f5733x.c() != qVar.c()) {
            q0.l.u(this.f5733x.c() != b3.p.SHUTDOWN, "Cannot transition out of SHUTDOWN to " + qVar);
            this.f5733x = qVar;
            this.f5714e.c(this, qVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        this.f5721l.execute(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q(v vVar, boolean z4) {
        this.f5721l.execute(new g(vVar, z4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String R(b3.f1 f1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(f1Var.m());
        if (f1Var.n() != null) {
            sb.append("(");
            sb.append(f1Var.n());
            sb.append(")");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(b3.f1 f1Var) {
        this.f5721l.d();
        O(b3.q.b(f1Var));
        if (this.f5724o == null) {
            this.f5724o = this.f5713d.get();
        }
        long a5 = this.f5724o.a();
        q0.n nVar = this.f5725p;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long d5 = a5 - nVar.d(timeUnit);
        this.f5720k.b(f.a.INFO, "TRANSIENT_FAILURE ({0}). Will reconnect after {1} ns", R(f1Var), Long.valueOf(d5));
        q0.l.u(this.f5726q == null, "previous reconnectTask is not done");
        this.f5726q = this.f5721l.c(new b(), d5, timeUnit, this.f5716g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        SocketAddress socketAddress;
        b3.b0 b0Var;
        this.f5721l.d();
        q0.l.u(this.f5726q == null, "Should have no reconnectTask scheduled");
        if (this.f5722m.d()) {
            this.f5725p.f().g();
        }
        SocketAddress a5 = this.f5722m.a();
        a aVar = null;
        if (a5 instanceof b3.b0) {
            b0Var = (b3.b0) a5;
            socketAddress = b0Var.c();
        } else {
            socketAddress = a5;
            b0Var = null;
        }
        b3.a b5 = this.f5722m.b();
        String str = (String) b5.b(b3.x.f971d);
        t.a aVar2 = new t.a();
        if (str == null) {
            str = this.f5711b;
        }
        t.a g5 = aVar2.e(str).f(b5).h(this.f5712c).g(b0Var);
        m mVar = new m();
        mVar.f5766a = d();
        i iVar = new i(this.f5715f.V(socketAddress, g5, mVar), this.f5718i, aVar);
        mVar.f5766a = iVar.d();
        this.f5717h.c(iVar);
        this.f5731v = iVar;
        this.f5729t.add(iVar);
        Runnable e5 = iVar.e(new l(iVar, socketAddress));
        if (e5 != null) {
            this.f5721l.b(e5);
        }
        this.f5720k.b(f.a.INFO, "Started transport {0}", mVar.f5766a);
    }

    b3.p M() {
        return this.f5733x.c();
    }

    public void U(List<b3.x> list) {
        q0.l.o(list, "newAddressGroups");
        L(list, "newAddressGroups contains null entry");
        q0.l.e(!list.isEmpty(), "newAddressGroups is empty");
        this.f5721l.execute(new d(Collections.unmodifiableList(new ArrayList(list))));
    }

    void a(b3.f1 f1Var) {
        f(f1Var);
        this.f5721l.execute(new h(f1Var));
    }

    @Override // io.grpc.internal.m2
    public s b() {
        j1 j1Var = this.f5732w;
        if (j1Var != null) {
            return j1Var;
        }
        this.f5721l.execute(new c());
        return null;
    }

    @Override // b3.l0
    public b3.h0 d() {
        return this.f5710a;
    }

    public void f(b3.f1 f1Var) {
        this.f5721l.execute(new e(f1Var));
    }

    public String toString() {
        return q0.h.c(this).c("logId", this.f5710a.d()).d("addressGroups", this.f5723n).toString();
    }
}
