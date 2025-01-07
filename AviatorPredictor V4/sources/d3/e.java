package d3;

import b3.l1;
import b3.r0;
import e3.b;
import io.grpc.internal.b1;
import io.grpc.internal.e2;
import io.grpc.internal.g1;
import io.grpc.internal.h;
import io.grpc.internal.n2;
import io.grpc.internal.q0;
import io.grpc.internal.t;
import io.grpc.internal.v;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public final class e extends io.grpc.internal.b<e> {

    /* renamed from: r, reason: collision with root package name */
    private static final Logger f3245r = Logger.getLogger(e.class.getName());

    /* renamed from: s, reason: collision with root package name */
    static final e3.b f3246s = new b.C0035b(e3.b.f3546f).f(e3.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, e3.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, e3.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, e3.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, e3.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, e3.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256).i(e3.h.TLS_1_2).h(true).e();

    /* renamed from: t, reason: collision with root package name */
    private static final long f3247t = TimeUnit.DAYS.toNanos(1000);

    /* renamed from: u, reason: collision with root package name */
    private static final e2.d<Executor> f3248u = new a();

    /* renamed from: v, reason: collision with root package name */
    private static final EnumSet<l1> f3249v = EnumSet.of(l1.MTLS, l1.CUSTOM_MANAGERS);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f3250w = 0;

    /* renamed from: b, reason: collision with root package name */
    private final g1 f3251b;

    /* renamed from: d, reason: collision with root package name */
    private Executor f3253d;

    /* renamed from: e, reason: collision with root package name */
    private ScheduledExecutorService f3254e;

    /* renamed from: f, reason: collision with root package name */
    private SocketFactory f3255f;

    /* renamed from: g, reason: collision with root package name */
    private SSLSocketFactory f3256g;

    /* renamed from: i, reason: collision with root package name */
    private HostnameVerifier f3258i;

    /* renamed from: o, reason: collision with root package name */
    private boolean f3264o;

    /* renamed from: c, reason: collision with root package name */
    private n2.b f3252c = n2.a();

    /* renamed from: j, reason: collision with root package name */
    private e3.b f3259j = f3246s;

    /* renamed from: k, reason: collision with root package name */
    private c f3260k = c.TLS;

    /* renamed from: l, reason: collision with root package name */
    private long f3261l = Long.MAX_VALUE;

    /* renamed from: m, reason: collision with root package name */
    private long f3262m = q0.f5575m;

    /* renamed from: n, reason: collision with root package name */
    private int f3263n = 65535;

    /* renamed from: p, reason: collision with root package name */
    private int f3265p = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f3266q = false;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3257h = false;

    class a implements e2.d<Executor> {
        a() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(q0.i("grpc-okhttp-%d", true));
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3267a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3268b;

        static {
            int[] r02 = new int[c.values().length];
            f3268b = r02;
            try {
                r02[c.PLAINTEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3268b[c.TLS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] r22 = new int[d3.d.values().length];
            f3267a = r22;
            try {
                r22[d3.d.TLS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3267a[d3.d.PLAINTEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum c {
        TLS,
        PLAINTEXT
    }

    private final class d implements g1.b {
        private d() {
        }

        /* synthetic */ d(e eVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return e.this.i();
        }
    }

    /* renamed from: d3.e$e, reason: collision with other inner class name */
    private final class C0029e implements g1.c {
        private C0029e() {
        }

        /* synthetic */ C0029e(e eVar, a aVar) {
            this();
        }

        @Override // io.grpc.internal.g1.c
        public t a() {
            return e.this.g();
        }
    }

    static final class f implements t {

        /* renamed from: e, reason: collision with root package name */
        private final Executor f3274e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f3275f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f3276g;

        /* renamed from: h, reason: collision with root package name */
        private final n2.b f3277h;

        /* renamed from: i, reason: collision with root package name */
        private final SocketFactory f3278i;

        /* renamed from: j, reason: collision with root package name */
        private final SSLSocketFactory f3279j;

        /* renamed from: k, reason: collision with root package name */
        private final HostnameVerifier f3280k;

        /* renamed from: l, reason: collision with root package name */
        private final e3.b f3281l;

        /* renamed from: m, reason: collision with root package name */
        private final int f3282m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f3283n;

        /* renamed from: o, reason: collision with root package name */
        private final long f3284o;

        /* renamed from: p, reason: collision with root package name */
        private final io.grpc.internal.h f3285p;

        /* renamed from: q, reason: collision with root package name */
        private final long f3286q;

        /* renamed from: r, reason: collision with root package name */
        private final int f3287r;

        /* renamed from: s, reason: collision with root package name */
        private final boolean f3288s;

        /* renamed from: t, reason: collision with root package name */
        private final int f3289t;

        /* renamed from: u, reason: collision with root package name */
        private final ScheduledExecutorService f3290u;

        /* renamed from: v, reason: collision with root package name */
        private final boolean f3291v;

        /* renamed from: w, reason: collision with root package name */
        private boolean f3292w;

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ h.b f3293e;

            a(h.b bVar) {
                this.f3293e = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f3293e.a();
            }
        }

        private f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e3.b bVar, int r15, boolean z4, long j4, long j5, int r21, boolean z5, int r23, n2.b bVar2, boolean z6) {
            Executor executor2 = executor;
            boolean z7 = scheduledExecutorService == null;
            this.f3276g = z7;
            this.f3290u = z7 ? (ScheduledExecutorService) e2.d(q0.f5583u) : scheduledExecutorService;
            this.f3278i = socketFactory;
            this.f3279j = sSLSocketFactory;
            this.f3280k = hostnameVerifier;
            this.f3281l = bVar;
            this.f3282m = r15;
            this.f3283n = z4;
            this.f3284o = j4;
            this.f3285p = new io.grpc.internal.h("keepalive time nanos", j4);
            this.f3286q = j5;
            this.f3287r = r21;
            this.f3288s = z5;
            this.f3289t = r23;
            this.f3291v = z6;
            boolean z8 = executor2 == null;
            this.f3275f = z8;
            this.f3277h = (n2.b) q0.l.o(bVar2, "transportTracerFactory");
            this.f3274e = z8 ? (Executor) e2.d(e.f3248u) : executor2;
        }

        /* synthetic */ f(Executor executor, ScheduledExecutorService scheduledExecutorService, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, e3.b bVar, int r7, boolean z4, long j4, long j5, int r13, boolean z5, int r15, n2.b bVar2, boolean z6, a aVar) {
            this(executor, scheduledExecutorService, socketFactory, sSLSocketFactory, hostnameVerifier, bVar, r7, z4, j4, j5, r13, z5, r15, bVar2, z6);
        }

        @Override // io.grpc.internal.t
        public ScheduledExecutorService B() {
            return this.f3290u;
        }

        @Override // io.grpc.internal.t
        public v V(SocketAddress socketAddress, t.a aVar, b3.f fVar) {
            if (this.f3292w) {
                throw new IllegalStateException("The transport factory is closed.");
            }
            h.b d5 = this.f3285p.d();
            h hVar = new h((InetSocketAddress) socketAddress, aVar.a(), aVar.d(), aVar.b(), this.f3274e, this.f3278i, this.f3279j, this.f3280k, this.f3281l, this.f3282m, this.f3287r, aVar.c(), new a(d5), this.f3289t, this.f3277h.a(), this.f3291v);
            if (this.f3283n) {
                hVar.T(true, d5.b(), this.f3286q, this.f3288s);
            }
            return hVar;
        }

        @Override // io.grpc.internal.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f3292w) {
                return;
            }
            this.f3292w = true;
            if (this.f3276g) {
                e2.f(q0.f5583u, this.f3290u);
            }
            if (this.f3275f) {
                e2.f(e.f3248u, this.f3274e);
            }
        }
    }

    private e(String str) {
        a aVar = null;
        this.f3251b = new g1(str, new C0029e(this, aVar), new d(this, aVar));
    }

    public static e forTarget(String str) {
        return new e(str);
    }

    @Override // io.grpc.internal.b
    protected r0<?> e() {
        return this.f3251b;
    }

    t g() {
        return new f(this.f3253d, this.f3254e, this.f3255f, h(), this.f3258i, this.f3259j, this.f5010a, this.f3261l != Long.MAX_VALUE, this.f3261l, this.f3262m, this.f3263n, this.f3264o, this.f3265p, this.f3252c, false, null);
    }

    SSLSocketFactory h() {
        int r02 = b.f3268b[this.f3260k.ordinal()];
        if (r02 == 1) {
            return null;
        }
        if (r02 != 2) {
            throw new RuntimeException("Unknown negotiation type: " + this.f3260k);
        }
        try {
            if (this.f3256g == null) {
                this.f3256g = SSLContext.getInstance("Default", e3.f.e().g()).getSocketFactory();
            }
            return this.f3256g;
        } catch (GeneralSecurityException e5) {
            throw new RuntimeException("TLS Provider failure", e5);
        }
    }

    int i() {
        int r02 = b.f3268b[this.f3260k.ordinal()];
        if (r02 == 1) {
            return 80;
        }
        if (r02 == 2) {
            return 443;
        }
        throw new AssertionError(this.f3260k + " not handled");
    }

    @Override // b3.r0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e c(long j4, TimeUnit timeUnit) {
        q0.l.e(j4 > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j4);
        this.f3261l = nanos;
        long l4 = b1.l(nanos);
        this.f3261l = l4;
        if (l4 >= f3247t) {
            this.f3261l = Long.MAX_VALUE;
        }
        return this;
    }

    @Override // b3.r0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public e d() {
        q0.l.u(!this.f3257h, "Cannot change security when using ChannelCredentials");
        this.f3260k = c.PLAINTEXT;
        return this;
    }

    public e scheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.f3254e = (ScheduledExecutorService) q0.l.o(scheduledExecutorService, "scheduledExecutorService");
        return this;
    }

    public e sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        q0.l.u(!this.f3257h, "Cannot change security when using ChannelCredentials");
        this.f3256g = sSLSocketFactory;
        this.f3260k = c.TLS;
        return this;
    }

    public e transportExecutor(Executor executor) {
        this.f3253d = executor;
        return this;
    }
}
