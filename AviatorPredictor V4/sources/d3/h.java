package d3;

import b3.a0;
import b3.b0;
import b3.c0;
import b3.d1;
import b3.f1;
import b3.g1;
import b3.h0;
import b3.v0;
import c2.c;
import c2.e;
import d3.b;
import d3.g;
import d3.i;
import f3.b;
import io.grpc.internal.b1;
import io.grpc.internal.c2;
import io.grpc.internal.e2;
import io.grpc.internal.h2;
import io.grpc.internal.j1;
import io.grpc.internal.n2;
import io.grpc.internal.p0;
import io.grpc.internal.q0;
import io.grpc.internal.r;
import io.grpc.internal.s;
import io.grpc.internal.u0;
import io.grpc.internal.v;
import io.grpc.internal.v0;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
class h implements v, b.a {
    private static final Map<f3.a, f1> X = Q();
    private static final Logger Y = Logger.getLogger(h.class.getName());
    private static final g[] Z = new g[0];
    private final SocketFactory A;
    private SSLSocketFactory B;
    private HostnameVerifier C;
    private Socket D;
    private final e3.b G;
    private f3.c H;
    private ScheduledExecutorService I;
    private b1 J;
    private boolean K;
    private long L;
    private long M;
    private boolean N;
    private final Runnable O;
    private final int P;
    private final boolean Q;
    private final n2 R;
    private c0.b T;
    final b0 U;
    Runnable V;
    v0.d<Void> W;

    /* renamed from: a, reason: collision with root package name */
    private final InetSocketAddress f3309a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3310b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3311c;

    /* renamed from: e, reason: collision with root package name */
    private final q0.p<q0.n> f3313e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3314f;

    /* renamed from: g, reason: collision with root package name */
    private j1.a f3315g;

    /* renamed from: h, reason: collision with root package name */
    private f3.b f3316h;

    /* renamed from: i, reason: collision with root package name */
    private i f3317i;

    /* renamed from: j, reason: collision with root package name */
    private d3.b f3318j;

    /* renamed from: k, reason: collision with root package name */
    private p f3319k;

    /* renamed from: m, reason: collision with root package name */
    private final h0 f3321m;

    /* renamed from: p, reason: collision with root package name */
    private final Executor f3324p;

    /* renamed from: q, reason: collision with root package name */
    private final c2 f3325q;

    /* renamed from: r, reason: collision with root package name */
    private final int f3326r;

    /* renamed from: s, reason: collision with root package name */
    private int f3327s;

    /* renamed from: t, reason: collision with root package name */
    private f f3328t;

    /* renamed from: u, reason: collision with root package name */
    private b3.a f3329u;

    /* renamed from: v, reason: collision with root package name */
    private f1 f3330v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f3331w;

    /* renamed from: x, reason: collision with root package name */
    private u0 f3332x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f3333y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f3334z;

    /* renamed from: d, reason: collision with root package name */
    private final Random f3312d = new Random();

    /* renamed from: l, reason: collision with root package name */
    private final Object f3320l = new Object();

    /* renamed from: o, reason: collision with root package name */
    private final Map<Integer, g> f3323o = new HashMap();
    private int E = 0;
    private final Deque<g> F = new LinkedList();
    private final v0<g> S = new a();

    /* renamed from: n, reason: collision with root package name */
    private int f3322n = 3;

    class a extends v0<g> {
        a() {
        }

        @Override // io.grpc.internal.v0
        protected void b() {
            h.this.f3315g.d(true);
        }

        @Override // io.grpc.internal.v0
        protected void c() {
            h.this.f3315g.d(false);
        }
    }

    class b implements n2.c {
        b() {
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable = h.this.V;
            if (runnable != null) {
                runnable.run();
            }
            h hVar = h.this;
            hVar.f3328t = hVar.new f(hVar.f3316h, h.this.f3317i);
            h.this.f3324p.execute(h.this.f3328t);
            synchronized (h.this.f3320l) {
                h.this.E = Integer.MAX_VALUE;
                h.this.n0();
            }
            v0.d<Void> dVar = h.this.W;
            throw null;
        }
    }

    class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f3338e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d3.a f3339f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f3.j f3340g;

        class a implements h4.n {
            a() {
            }

            @Override // h4.n, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // h4.n
            public long o(h4.c cVar, long j4) {
                return -1L;
            }
        }

        d(CountDownLatch countDownLatch, d3.a aVar, f3.j jVar) {
            this.f3338e = countDownLatch;
            this.f3339f = aVar;
            this.f3340g = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            f fVar;
            Socket S;
            try {
                this.f3338e.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            h4.e b5 = h4.g.b(new a());
            SSLSession sSLSession = null;
            try {
                try {
                    h hVar2 = h.this;
                    b0 b0Var = hVar2.U;
                    if (b0Var == null) {
                        S = hVar2.A.createSocket(h.this.f3309a.getAddress(), h.this.f3309a.getPort());
                    } else {
                        if (!(b0Var.b() instanceof InetSocketAddress)) {
                            throw f1.f770t.q("Unsupported SocketAddress implementation " + h.this.U.b().getClass()).c();
                        }
                        h hVar3 = h.this;
                        S = hVar3.S(hVar3.U.c(), (InetSocketAddress) h.this.U.b(), h.this.U.d(), h.this.U.a());
                    }
                    Socket socket = S;
                    Socket socket2 = socket;
                    if (h.this.B != null) {
                        SSLSocket b6 = m.b(h.this.B, h.this.C, socket, h.this.X(), h.this.Y(), h.this.G);
                        sSLSession = b6.getSession();
                        socket2 = b6;
                    }
                    socket2.setTcpNoDelay(true);
                    h4.e b7 = h4.g.b(h4.g.g(socket2));
                    this.f3339f.n(h4.g.e(socket2), socket2);
                    h hVar4 = h.this;
                    hVar4.f3329u = hVar4.f3329u.d().d(a0.f688a, socket2.getRemoteSocketAddress()).d(a0.f689b, socket2.getLocalSocketAddress()).d(a0.f690c, sSLSession).d(p0.f5550a, sSLSession == null ? d1.NONE : d1.PRIVACY_AND_INTEGRITY).a();
                    h hVar5 = h.this;
                    hVar5.f3328t = new f(hVar5, this.f3340g.b(b7, true));
                    synchronized (h.this.f3320l) {
                        h.this.D = (Socket) q0.l.o(socket2, "socket");
                        if (sSLSession != null) {
                            h.this.T = new c0.b(new c0.c(sSLSession));
                        }
                    }
                } catch (g1 e5) {
                    h.this.m0(0, f3.a.INTERNAL_ERROR, e5.a());
                    hVar = h.this;
                    fVar = new f(hVar, this.f3340g.b(b5, true));
                    hVar.f3328t = fVar;
                } catch (Exception e6) {
                    h.this.b(e6);
                    hVar = h.this;
                    fVar = new f(hVar, this.f3340g.b(b5, true));
                    hVar.f3328t = fVar;
                }
            } catch (Throwable th) {
                h hVar6 = h.this;
                hVar6.f3328t = new f(hVar6, this.f3340g.b(b5, true));
                throw th;
            }
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.f3324p.execute(h.this.f3328t);
            synchronized (h.this.f3320l) {
                h.this.E = Integer.MAX_VALUE;
                h.this.n0();
            }
        }
    }

    class f implements b.a, Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final i f3344e;

        /* renamed from: f, reason: collision with root package name */
        f3.b f3345f;

        /* renamed from: g, reason: collision with root package name */
        boolean f3346g;

        f(h hVar, f3.b bVar) {
            this(bVar, new i(Level.FINE, (Class<?>) h.class));
        }

        f(f3.b bVar, i iVar) {
            this.f3346g = true;
            this.f3345f = bVar;
            this.f3344e = iVar;
        }

        private int a(List<f3.d> list) {
            long j4 = 0;
            for (int r22 = 0; r22 < list.size(); r22++) {
                f3.d dVar = list.get(r22);
                j4 += dVar.f3720a.s() + 32 + dVar.f3721b.s();
            }
            return (int) Math.min(j4, 2147483647L);
        }

        @Override // f3.b.a
        public void c(int r10, f3.a aVar) {
            this.f3344e.h(i.a.INBOUND, r10, aVar);
            f1 e5 = h.r0(aVar).e("Rst Stream");
            boolean z4 = e5.m() == f1.b.CANCELLED || e5.m() == f1.b.DEADLINE_EXCEEDED;
            synchronized (h.this.f3320l) {
                g gVar = (g) h.this.f3323o.get(Integer.valueOf(r10));
                if (gVar != null) {
                    j3.c.c("OkHttpClientTransport$ClientFrameHandler.rstStream", gVar.u().f0());
                    h.this.U(r10, e5, aVar == f3.a.REFUSED_STREAM ? r.a.REFUSED : r.a.PROCESSED, z4, null, null);
                }
            }
        }

        @Override // f3.b.a
        public void f(int r8, long j4) {
            this.f3344e.k(i.a.INBOUND, r8, j4);
            if (j4 == 0) {
                if (r8 == 0) {
                    h.this.h0(f3.a.PROTOCOL_ERROR, "Received 0 flow control window increment.");
                    return;
                } else {
                    h.this.U(r8, f1.f770t.q("Received 0 flow control window increment."), r.a.PROCESSED, false, f3.a.PROTOCOL_ERROR, null);
                    return;
                }
            }
            boolean z4 = false;
            synchronized (h.this.f3320l) {
                if (r8 == 0) {
                    h.this.f3319k.g(null, (int) j4);
                    return;
                }
                g gVar = (g) h.this.f3323o.get(Integer.valueOf(r8));
                if (gVar != null) {
                    h.this.f3319k.g(gVar, (int) j4);
                } else if (!h.this.e0(r8)) {
                    z4 = true;
                }
                if (z4) {
                    h.this.h0(f3.a.PROTOCOL_ERROR, "Received window_update for unknown stream: " + r8);
                }
            }
        }

        @Override // f3.b.a
        public void g(boolean z4, int r11, int r12) {
            u0 u0Var;
            long j4 = (r11 << 32) | (r12 & 4294967295L);
            this.f3344e.e(i.a.INBOUND, j4);
            if (!z4) {
                synchronized (h.this.f3320l) {
                    h.this.f3318j.g(true, r11, r12);
                }
                return;
            }
            synchronized (h.this.f3320l) {
                u0Var = null;
                if (h.this.f3332x == null) {
                    h.Y.warning("Received unexpected ping ack. No ping outstanding");
                } else if (h.this.f3332x.h() == j4) {
                    u0 u0Var2 = h.this.f3332x;
                    h.this.f3332x = null;
                    u0Var = u0Var2;
                } else {
                    h.Y.log(Level.WARNING, String.format("Received unexpected ping ack. Expecting %d, got %d", Long.valueOf(h.this.f3332x.h()), Long.valueOf(j4)));
                }
            }
            if (u0Var != null) {
                u0Var.d();
            }
        }

        @Override // f3.b.a
        public void h(boolean z4, int r8, h4.e eVar, int r10) {
            this.f3344e.b(i.a.INBOUND, r8, eVar.W(), r10, z4);
            g a02 = h.this.a0(r8);
            if (a02 != null) {
                long j4 = r10;
                eVar.Q(j4);
                h4.c cVar = new h4.c();
                cVar.w(eVar.W(), j4);
                j3.c.c("OkHttpClientTransport$ClientFrameHandler.data", a02.u().f0());
                synchronized (h.this.f3320l) {
                    a02.u().g0(cVar, z4);
                }
            } else {
                if (!h.this.e0(r8)) {
                    h.this.h0(f3.a.PROTOCOL_ERROR, "Received data for unknown stream: " + r8);
                    return;
                }
                synchronized (h.this.f3320l) {
                    h.this.f3318j.c(r8, f3.a.INVALID_STREAM);
                }
                eVar.A(r10);
            }
            h.B(h.this, r10);
            if (h.this.f3327s >= h.this.f3314f * 0.5f) {
                synchronized (h.this.f3320l) {
                    h.this.f3318j.f(0, h.this.f3327s);
                }
                h.this.f3327s = 0;
            }
        }

        @Override // f3.b.a
        public void i() {
        }

        @Override // f3.b.a
        public void j(int r32, int r4, List<f3.d> list) {
            this.f3344e.g(i.a.INBOUND, r32, r4, list);
            synchronized (h.this.f3320l) {
                h.this.f3318j.c(r32, f3.a.PROTOCOL_ERROR);
            }
        }

        @Override // f3.b.a
        public void k(boolean z4, boolean z5, int r7, int r8, List<f3.d> list, f3.e eVar) {
            f1 f1Var;
            int a5;
            this.f3344e.d(i.a.INBOUND, r7, list, z5);
            boolean z6 = true;
            if (h.this.P == Integer.MAX_VALUE || (a5 = a(list)) <= h.this.P) {
                f1Var = null;
            } else {
                f1 f1Var2 = f1.f765o;
                Object[] objArr = new Object[3];
                objArr[0] = z5 ? "trailer" : "header";
                objArr[1] = Integer.valueOf(h.this.P);
                objArr[2] = Integer.valueOf(a5);
                f1Var = f1Var2.q(String.format("Response %s metadata larger than %d: %d", objArr));
            }
            synchronized (h.this.f3320l) {
                g gVar = (g) h.this.f3323o.get(Integer.valueOf(r7));
                if (gVar == null) {
                    if (h.this.e0(r7)) {
                        h.this.f3318j.c(r7, f3.a.INVALID_STREAM);
                    }
                } else if (f1Var == null) {
                    j3.c.c("OkHttpClientTransport$ClientFrameHandler.headers", gVar.u().f0());
                    gVar.u().h0(list, z5);
                } else {
                    if (!z5) {
                        h.this.f3318j.c(r7, f3.a.CANCEL);
                    }
                    gVar.u().N(f1Var, false, new b3.u0());
                }
                z6 = false;
            }
            if (z6) {
                h.this.h0(f3.a.PROTOCOL_ERROR, "Received header for unknown stream: " + r7);
            }
        }

        @Override // f3.b.a
        public void l(int r6, f3.a aVar, h4.f fVar) {
            this.f3344e.c(i.a.INBOUND, r6, aVar, fVar);
            if (aVar == f3.a.ENHANCE_YOUR_CALM) {
                String x4 = fVar.x();
                h.Y.log(Level.WARNING, String.format("%s: Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: %s", this, x4));
                if ("too_many_pings".equals(x4)) {
                    h.this.O.run();
                }
            }
            f1 e5 = q0.h.k(aVar.f3710e).e("Received Goaway");
            if (fVar.s() > 0) {
                e5 = e5.e(fVar.x());
            }
            h.this.m0(r6, null, e5);
        }

        @Override // f3.b.a
        public void m(int r12, int r22, int r32, boolean z4) {
        }

        @Override // f3.b.a
        public void n(boolean z4, f3.i iVar) {
            boolean z5;
            this.f3344e.i(i.a.INBOUND, iVar);
            synchronized (h.this.f3320l) {
                if (l.b(iVar, 4)) {
                    h.this.E = l.a(iVar, 4);
                }
                if (l.b(iVar, 7)) {
                    z5 = h.this.f3319k.e(l.a(iVar, 7));
                } else {
                    z5 = false;
                }
                if (this.f3346g) {
                    h.this.f3315g.b();
                    this.f3346g = false;
                }
                h.this.f3318j.p(iVar);
                if (z5) {
                    h.this.f3319k.h();
                }
                h.this.n0();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            f1 f1Var;
            String name = Thread.currentThread().getName();
            Thread.currentThread().setName("OkHttpClientTransport");
            while (this.f3345f.e0(this)) {
                try {
                    if (h.this.J != null) {
                        h.this.J.m();
                    }
                } catch (Throwable th) {
                    try {
                        h.this.m0(0, f3.a.PROTOCOL_ERROR, f1.f770t.q("error in frame handler").p(th));
                        try {
                            this.f3345f.close();
                        } catch (IOException e5) {
                            e = e5;
                            h.Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                            h.this.f3315g.a();
                            Thread.currentThread().setName(name);
                        }
                    } catch (Throwable th2) {
                        try {
                            this.f3345f.close();
                        } catch (IOException e6) {
                            h.Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e6);
                        }
                        h.this.f3315g.a();
                        Thread.currentThread().setName(name);
                        throw th2;
                    }
                }
            }
            synchronized (h.this.f3320l) {
                f1Var = h.this.f3330v;
            }
            if (f1Var == null) {
                f1Var = f1.f771u.q("End of stream or IOException");
            }
            h.this.m0(0, f3.a.INTERNAL_ERROR, f1Var);
            try {
                this.f3345f.close();
            } catch (IOException e7) {
                e = e7;
                h.Y.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                h.this.f3315g.a();
                Thread.currentThread().setName(name);
            }
            h.this.f3315g.a();
            Thread.currentThread().setName(name);
        }
    }

    h(InetSocketAddress inetSocketAddress, String str, String str2, b3.a aVar, Executor executor, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e3.b bVar, int r14, int r15, b0 b0Var, Runnable runnable, int r18, n2 n2Var, boolean z4) {
        this.f3309a = (InetSocketAddress) q0.l.o(inetSocketAddress, "address");
        this.f3310b = str;
        this.f3326r = r14;
        this.f3314f = r15;
        this.f3324p = (Executor) q0.l.o(executor, "executor");
        this.f3325q = new c2(executor);
        this.A = socketFactory == null ? SocketFactory.getDefault() : socketFactory;
        this.B = sSLSocketFactory;
        this.C = hostnameVerifier;
        this.G = (e3.b) q0.l.o(bVar, "connectionSpec");
        this.f3313e = q0.f5584v;
        this.f3311c = q0.g("okhttp", str2);
        this.U = b0Var;
        this.O = (Runnable) q0.l.o(runnable, "tooManyPingsRunnable");
        this.P = r18;
        this.R = (n2) q0.l.n(n2Var);
        this.f3321m = h0.a(getClass(), inetSocketAddress.toString());
        this.f3329u = b3.a.c().d(p0.f5551b, aVar).a();
        this.Q = z4;
        b0();
    }

    static /* synthetic */ int B(h hVar, int r22) {
        int r02 = hVar.f3327s + r22;
        hVar.f3327s = r02;
        return r02;
    }

    private static Map<f3.a, f1> Q() {
        EnumMap enumMap = new EnumMap(f3.a.class);
        f3.a aVar = f3.a.NO_ERROR;
        f1 f1Var = f1.f770t;
        enumMap.put((EnumMap) aVar, (f3.a) f1Var.q("No error: A GRPC status of OK should have been sent"));
        enumMap.put((EnumMap) f3.a.PROTOCOL_ERROR, (f3.a) f1Var.q("Protocol error"));
        enumMap.put((EnumMap) f3.a.INTERNAL_ERROR, (f3.a) f1Var.q("Internal error"));
        enumMap.put((EnumMap) f3.a.FLOW_CONTROL_ERROR, (f3.a) f1Var.q("Flow control error"));
        enumMap.put((EnumMap) f3.a.STREAM_CLOSED, (f3.a) f1Var.q("Stream closed"));
        enumMap.put((EnumMap) f3.a.FRAME_TOO_LARGE, (f3.a) f1Var.q("Frame too large"));
        enumMap.put((EnumMap) f3.a.REFUSED_STREAM, (f3.a) f1.f771u.q("Refused stream"));
        enumMap.put((EnumMap) f3.a.CANCEL, (f3.a) f1.f757g.q("Cancelled"));
        enumMap.put((EnumMap) f3.a.COMPRESSION_ERROR, (f3.a) f1Var.q("Compression error"));
        enumMap.put((EnumMap) f3.a.CONNECT_ERROR, (f3.a) f1Var.q("Connect error"));
        enumMap.put((EnumMap) f3.a.ENHANCE_YOUR_CALM, (f3.a) f1.f765o.q("Enhance your calm"));
        enumMap.put((EnumMap) f3.a.INADEQUATE_SECURITY, (f3.a) f1.f763m.q("Inadequate security"));
        return Collections.unmodifiableMap(enumMap);
    }

    private c2.e R(InetSocketAddress inetSocketAddress, String str, String str2) {
        c2.c a5 = new c.b().k("https").h(inetSocketAddress.getHostName()).j(inetSocketAddress.getPort()).a();
        e.b g5 = new e.b().h(a5).g("Host", a5.c() + ":" + a5.j()).g("User-Agent", this.f3311c);
        if (str != null && str2 != null) {
            g5.g("Proxy-Authorization", c2.a.a(str, str2));
        }
        return g5.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Socket S(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) {
        try {
            Socket createSocket = inetSocketAddress2.getAddress() != null ? this.A.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.A.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            createSocket.setTcpNoDelay(true);
            h4.n g5 = h4.g.g(createSocket);
            h4.d a5 = h4.g.a(h4.g.e(createSocket));
            c2.e R = R(inetSocketAddress, str, str2);
            c2.c b5 = R.b();
            a5.U(String.format("CONNECT %s:%d HTTP/1.1", b5.c(), Integer.valueOf(b5.j()))).U("\r\n");
            int b6 = R.a().b();
            for (int r12 = 0; r12 < b6; r12++) {
                a5.U(R.a().a(r12)).U(": ").U(R.a().c(r12)).U("\r\n");
            }
            a5.U("\r\n");
            a5.flush();
            d2.a a6 = d2.a.a(i0(g5));
            while (!i0(g5).equals("")) {
            }
            int r11 = a6.f3215b;
            if (r11 >= 200 && r11 < 300) {
                return createSocket;
            }
            h4.c cVar = new h4.c();
            try {
                createSocket.shutdownOutput();
                g5.o(cVar, 1024L);
            } catch (IOException e5) {
                cVar.U("Unable to read body: " + e5.toString());
            }
            try {
                createSocket.close();
            } catch (IOException unused) {
            }
            throw f1.f771u.q(String.format("Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(a6.f3215b), a6.f3216c, cVar.R())).c();
        } catch (IOException e6) {
            throw f1.f771u.q("Failed trying to connect with proxy").p(e6).c();
        }
    }

    private Throwable Z() {
        synchronized (this.f3320l) {
            f1 f1Var = this.f3330v;
            if (f1Var != null) {
                return f1Var.c();
            }
            return f1.f771u.q("Connection closed").c();
        }
    }

    private void b0() {
        synchronized (this.f3320l) {
            this.R.g(new b());
        }
    }

    private boolean c0() {
        return this.f3309a == null;
    }

    private void f0(g gVar) {
        if (this.f3334z && this.F.isEmpty() && this.f3323o.isEmpty()) {
            this.f3334z = false;
            b1 b1Var = this.J;
            if (b1Var != null) {
                b1Var.o();
            }
        }
        if (gVar.y()) {
            this.S.e(gVar, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(f3.a aVar, String str) {
        m0(0, aVar, r0(aVar).e(str));
    }

    private static String i0(h4.n nVar) {
        h4.c cVar = new h4.c();
        while (nVar.o(cVar, 1L) != -1) {
            if (cVar.l(cVar.i0() - 1) == 10) {
                return cVar.c0();
            }
        }
        throw new EOFException("\\n not found: " + cVar.y().n());
    }

    private void l0(g gVar) {
        if (!this.f3334z) {
            this.f3334z = true;
            b1 b1Var = this.J;
            if (b1Var != null) {
                b1Var.n();
            }
        }
        if (gVar.y()) {
            this.S.e(gVar, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(int r8, f3.a aVar, f1 f1Var) {
        synchronized (this.f3320l) {
            if (this.f3330v == null) {
                this.f3330v = f1Var;
                this.f3315g.c(f1Var);
            }
            if (aVar != null && !this.f3331w) {
                this.f3331w = true;
                this.f3318j.q(0, aVar, new byte[0]);
            }
            Iterator<Map.Entry<Integer, g>> it = this.f3323o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, g> next = it.next();
                if (next.getKey().intValue() > r8) {
                    it.remove();
                    next.getValue().u().M(f1Var, r.a.REFUSED, false, new b3.u0());
                    f0(next.getValue());
                }
            }
            for (g gVar : this.F) {
                gVar.u().M(f1Var, r.a.REFUSED, true, new b3.u0());
                f0(gVar);
            }
            this.F.clear();
            p0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n0() {
        boolean z4 = false;
        while (!this.F.isEmpty() && this.f3323o.size() < this.E) {
            o0(this.F.poll());
            z4 = true;
        }
        return z4;
    }

    private void o0(g gVar) {
        q0.l.u(gVar.Q() == -1, "StreamId already assigned");
        this.f3323o.put(Integer.valueOf(this.f3322n), gVar);
        l0(gVar);
        gVar.u().d0(this.f3322n);
        if ((gVar.P() != v0.d.UNARY && gVar.P() != v0.d.SERVER_STREAMING) || gVar.T()) {
            this.f3318j.flush();
        }
        int r4 = this.f3322n;
        if (r4 < 2147483645) {
            this.f3322n = r4 + 2;
        } else {
            this.f3322n = Integer.MAX_VALUE;
            m0(Integer.MAX_VALUE, f3.a.NO_ERROR, f1.f771u.q("Stream ids exhausted"));
        }
    }

    private void p0() {
        if (this.f3330v == null || !this.f3323o.isEmpty() || !this.F.isEmpty() || this.f3333y) {
            return;
        }
        this.f3333y = true;
        b1 b1Var = this.J;
        if (b1Var != null) {
            b1Var.q();
            this.I = (ScheduledExecutorService) e2.f(q0.f5583u, this.I);
        }
        u0 u0Var = this.f3332x;
        if (u0Var != null) {
            u0Var.f(Z());
            this.f3332x = null;
        }
        if (!this.f3331w) {
            this.f3331w = true;
            this.f3318j.q(0, f3.a.NO_ERROR, new byte[0]);
        }
        this.f3318j.close();
    }

    static f1 r0(f3.a aVar) {
        f1 f1Var = X.get(aVar);
        if (f1Var != null) {
            return f1Var;
        }
        return f1.f758h.q("Unknown http2 error code: " + aVar.f3710e);
    }

    void T(boolean z4, long j4, long j5, boolean z5) {
        this.K = z4;
        this.L = j4;
        this.M = j5;
        this.N = z5;
    }

    void U(int r4, f1 f1Var, r.a aVar, boolean z4, f3.a aVar2, b3.u0 u0Var) {
        synchronized (this.f3320l) {
            g remove = this.f3323o.remove(Integer.valueOf(r4));
            if (remove != null) {
                if (aVar2 != null) {
                    this.f3318j.c(r4, f3.a.CANCEL);
                }
                if (f1Var != null) {
                    g.b u4 = remove.u();
                    if (u0Var == null) {
                        u0Var = new b3.u0();
                    }
                    u4.M(f1Var, aVar, z4, u0Var);
                }
                if (!n0()) {
                    p0();
                    f0(remove);
                }
            }
        }
    }

    g[] V() {
        g[] gVarArr;
        synchronized (this.f3320l) {
            gVarArr = (g[]) this.f3323o.values().toArray(Z);
        }
        return gVarArr;
    }

    public b3.a W() {
        return this.f3329u;
    }

    String X() {
        URI b5 = q0.b(this.f3310b);
        return b5.getHost() != null ? b5.getHost() : this.f3310b;
    }

    int Y() {
        URI b5 = q0.b(this.f3310b);
        return b5.getPort() != -1 ? b5.getPort() : this.f3309a.getPort();
    }

    @Override // io.grpc.internal.j1
    public void a(f1 f1Var) {
        f(f1Var);
        synchronized (this.f3320l) {
            Iterator<Map.Entry<Integer, g>> it = this.f3323o.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, g> next = it.next();
                it.remove();
                next.getValue().u().N(f1Var, false, new b3.u0());
                f0(next.getValue());
            }
            for (g gVar : this.F) {
                gVar.u().N(f1Var, true, new b3.u0());
                f0(gVar);
            }
            this.F.clear();
            p0();
        }
    }

    g a0(int r32) {
        g gVar;
        synchronized (this.f3320l) {
            gVar = this.f3323o.get(Integer.valueOf(r32));
        }
        return gVar;
    }

    @Override // d3.b.a
    public void b(Throwable th) {
        q0.l.o(th, "failureCause");
        m0(0, f3.a.INTERNAL_ERROR, f1.f771u.p(th));
    }

    @Override // b3.l0
    public h0 d() {
        return this.f3321m;
    }

    boolean d0() {
        return this.B == null;
    }

    @Override // io.grpc.internal.j1
    public Runnable e(j1.a aVar) {
        c2 c2Var;
        Runnable eVar;
        this.f3315g = (j1.a) q0.l.o(aVar, "listener");
        if (this.K) {
            this.I = (ScheduledExecutorService) e2.d(q0.f5583u);
            b1 b1Var = new b1(new b1.c(this), this.I, this.L, this.M, this.N);
            this.J = b1Var;
            b1Var.p();
        }
        if (c0()) {
            synchronized (this.f3320l) {
                d3.b bVar = new d3.b(this, this.H, this.f3317i);
                this.f3318j = bVar;
                this.f3319k = new p(this, bVar);
            }
            c2Var = this.f3325q;
            eVar = new c();
        } else {
            d3.a r4 = d3.a.r(this.f3325q, this);
            f3.g gVar = new f3.g();
            f3.c a5 = gVar.a(h4.g.a(r4), true);
            synchronized (this.f3320l) {
                d3.b bVar2 = new d3.b(this, a5);
                this.f3318j = bVar2;
                this.f3319k = new p(this, bVar2);
            }
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f3325q.execute(new d(countDownLatch, r4, gVar));
            try {
                k0();
                countDownLatch.countDown();
                c2Var = this.f3325q;
                eVar = new e();
            } catch (Throwable th) {
                countDownLatch.countDown();
                throw th;
            }
        }
        c2Var.execute(eVar);
        return null;
    }

    boolean e0(int r4) {
        boolean z4;
        synchronized (this.f3320l) {
            z4 = true;
            if (r4 >= this.f3322n || (r4 & 1) != 1) {
                z4 = false;
            }
        }
        return z4;
    }

    @Override // io.grpc.internal.j1
    public void f(f1 f1Var) {
        synchronized (this.f3320l) {
            if (this.f3330v != null) {
                return;
            }
            this.f3330v = f1Var;
            this.f3315g.c(f1Var);
            p0();
        }
    }

    @Override // io.grpc.internal.s
    public void g(s.a aVar, Executor executor) {
        long nextLong;
        synchronized (this.f3320l) {
            boolean z4 = true;
            q0.l.t(this.f3318j != null);
            if (this.f3333y) {
                u0.g(aVar, executor, Z());
                return;
            }
            u0 u0Var = this.f3332x;
            if (u0Var != null) {
                nextLong = 0;
                z4 = false;
            } else {
                nextLong = this.f3312d.nextLong();
                q0.n nVar = this.f3313e.get();
                nVar.g();
                u0 u0Var2 = new u0(nextLong, nVar);
                this.f3332x = u0Var2;
                this.R.b();
                u0Var = u0Var2;
            }
            if (z4) {
                this.f3318j.g(false, (int) (nextLong >>> 32), (int) nextLong);
            }
            u0Var.a(aVar, executor);
        }
    }

    @Override // io.grpc.internal.s
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public g c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
        q0.l.o(v0Var, "method");
        q0.l.o(u0Var, "headers");
        h2 h5 = h2.h(kVarArr, W(), u0Var);
        synchronized (this.f3320l) {
            try {
                try {
                    return new g(v0Var, u0Var, this.f3318j, this, this.f3319k, this.f3320l, this.f3326r, this.f3314f, this.f3310b, this.f3311c, h5, this.R, cVar, this.Q);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    void j0(g gVar) {
        this.F.remove(gVar);
        f0(gVar);
    }

    void k0() {
        synchronized (this.f3320l) {
            this.f3318j.a0();
            f3.i iVar = new f3.i();
            l.c(iVar, 7, this.f3314f);
            this.f3318j.P(iVar);
            if (this.f3314f > 65535) {
                this.f3318j.f(0, r1 - 65535);
            }
        }
    }

    void q0(g gVar) {
        if (this.f3330v != null) {
            gVar.u().M(this.f3330v, r.a.REFUSED, true, new b3.u0());
        } else if (this.f3323o.size() < this.E) {
            o0(gVar);
        } else {
            this.F.add(gVar);
            l0(gVar);
        }
    }

    public String toString() {
        return q0.h.c(this).c("logId", this.f3321m.d()).d("address", this.f3309a).toString();
    }
}
