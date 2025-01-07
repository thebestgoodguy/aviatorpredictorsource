package io.grpc.internal;

import b3.w0;
import io.grpc.internal.e2;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class c0 extends b3.w0 {
    private static final g A;
    private static String B;

    /* renamed from: s, reason: collision with root package name */
    private static final Logger f5083s = Logger.getLogger(c0.class.getName());

    /* renamed from: t, reason: collision with root package name */
    private static final Set<String> f5084t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));

    /* renamed from: u, reason: collision with root package name */
    private static final String f5085u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f5086v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f5087w;

    /* renamed from: x, reason: collision with root package name */
    static boolean f5088x;

    /* renamed from: y, reason: collision with root package name */
    static boolean f5089y;

    /* renamed from: z, reason: collision with root package name */
    protected static boolean f5090z;

    /* renamed from: a, reason: collision with root package name */
    final b3.c1 f5091a;

    /* renamed from: b, reason: collision with root package name */
    private final Random f5092b = new Random();

    /* renamed from: c, reason: collision with root package name */
    protected volatile b f5093c = d.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference<f> f5094d = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    private final String f5095e;

    /* renamed from: f, reason: collision with root package name */
    private final String f5096f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5097g;

    /* renamed from: h, reason: collision with root package name */
    private final e2.d<Executor> f5098h;

    /* renamed from: i, reason: collision with root package name */
    private final long f5099i;

    /* renamed from: j, reason: collision with root package name */
    private final b3.j1 f5100j;

    /* renamed from: k, reason: collision with root package name */
    private final q0.n f5101k;

    /* renamed from: l, reason: collision with root package name */
    protected boolean f5102l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f5103m;

    /* renamed from: n, reason: collision with root package name */
    private Executor f5104n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f5105o;

    /* renamed from: p, reason: collision with root package name */
    private final w0.h f5106p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f5107q;

    /* renamed from: r, reason: collision with root package name */
    private w0.e f5108r;

    public interface b {
        List<InetAddress> d(String str);
    }

    protected static final class c {

        /* renamed from: a, reason: collision with root package name */
        private b3.f1 f5109a;

        /* renamed from: b, reason: collision with root package name */
        private List<b3.x> f5110b;

        /* renamed from: c, reason: collision with root package name */
        private w0.c f5111c;

        /* renamed from: d, reason: collision with root package name */
        public b3.a f5112d;

        private c() {
        }
    }

    private enum d implements b {
        INSTANCE;

        @Override // io.grpc.internal.c0.b
        public List<InetAddress> d(String str) {
            return Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(str)));
        }
    }

    private final class e implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final w0.e f5115e;

        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ boolean f5117e;

            a(boolean z4) {
                this.f5117e = z4;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (this.f5117e) {
                    c0 c0Var = c0.this;
                    c0Var.f5102l = true;
                    if (c0Var.f5099i > 0) {
                        c0.this.f5101k.f().g();
                    }
                }
                c0.this.f5107q = false;
            }
        }

        e(w0.e eVar) {
            this.f5115e = (w0.e) q0.l.o(eVar, "savedListener");
        }

        @Override // java.lang.Runnable
        public void run() {
            b3.j1 j1Var;
            a aVar;
            Logger logger = c0.f5083s;
            Level level = Level.FINER;
            if (logger.isLoggable(level)) {
                c0.f5083s.finer("Attempting DNS resolution of " + c0.this.f5096f);
            }
            c cVar = null;
            try {
                try {
                    b3.x n4 = c0.this.n();
                    w0.g.a d5 = w0.g.d();
                    if (n4 != null) {
                        if (c0.f5083s.isLoggable(level)) {
                            c0.f5083s.finer("Using proxy address " + n4);
                        }
                        d5.b(Collections.singletonList(n4));
                    } else {
                        cVar = c0.this.o(false);
                        if (cVar.f5109a != null) {
                            this.f5115e.b(cVar.f5109a);
                            return;
                        }
                        if (cVar.f5110b != null) {
                            d5.b(cVar.f5110b);
                        }
                        if (cVar.f5111c != null) {
                            d5.d(cVar.f5111c);
                        }
                        b3.a aVar2 = cVar.f5112d;
                        if (aVar2 != null) {
                            d5.c(aVar2);
                        }
                    }
                    this.f5115e.c(d5.a());
                    r2 = cVar != null && cVar.f5109a == null;
                    j1Var = c0.this.f5100j;
                    aVar = new a(r2);
                } catch (IOException e5) {
                    this.f5115e.b(b3.f1.f771u.q("Unable to resolve host " + c0.this.f5096f).p(e5));
                    r2 = 0 != 0 && null.f5109a == null;
                    j1Var = c0.this.f5100j;
                    aVar = new a(r2);
                }
                j1Var.execute(aVar);
            } finally {
                c0.this.f5100j.execute(new a(0 != 0 && null.f5109a == null));
            }
        }
    }

    public interface f {
        List<String> a(String str);
    }

    interface g {
        f a();

        Throwable b();
    }

    static {
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f5085u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f5086v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f5087w = property3;
        f5088x = Boolean.parseBoolean(property);
        f5089y = Boolean.parseBoolean(property2);
        f5090z = Boolean.parseBoolean(property3);
        A = v(c0.class.getClassLoader());
    }

    protected c0(String str, String str2, w0.b bVar, e2.d<Executor> dVar, q0.n nVar, boolean z4) {
        q0.l.o(bVar, "args");
        this.f5098h = dVar;
        URI create = URI.create("//" + ((String) q0.l.o(str2, "name")));
        q0.l.j(create.getHost() != null, "Invalid DNS name: %s", str2);
        this.f5095e = (String) q0.l.p(create.getAuthority(), "nameUri (%s) doesn't have an authority", create);
        this.f5096f = create.getHost();
        this.f5097g = create.getPort() == -1 ? bVar.a() : create.getPort();
        this.f5091a = (b3.c1) q0.l.o(bVar.c(), "proxyDetector");
        this.f5099i = s(z4);
        this.f5101k = (q0.n) q0.l.o(nVar, "stopwatch");
        this.f5100j = (b3.j1) q0.l.o(bVar.e(), "syncContext");
        Executor b5 = bVar.b();
        this.f5104n = b5;
        this.f5105o = b5 == null;
        this.f5106p = (w0.h) q0.l.o(bVar.d(), "serviceConfigParser");
    }

    private List<b3.x> A() {
        Exception e5 = null;
        try {
            try {
                List<InetAddress> d5 = this.f5093c.d(this.f5096f);
                ArrayList arrayList = new ArrayList(d5.size());
                Iterator<InetAddress> it = d5.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b3.x(new InetSocketAddress(it.next(), this.f5097g)));
                }
                return Collections.unmodifiableList(arrayList);
            } catch (Exception e6) {
                e5 = e6;
                q0.q.f(e5);
                throw new RuntimeException(e5);
            }
        } catch (Throwable th) {
            if (e5 != null) {
                f5083s.log(Level.FINE, "Address resolution failure", (Throwable) e5);
            }
            throw th;
        }
    }

    private w0.c B() {
        List<String> emptyList = Collections.emptyList();
        f u4 = u();
        if (u4 != null) {
            try {
                emptyList = u4.a("_grpc_config." + this.f5096f);
            } catch (Exception e5) {
                f5083s.log(Level.FINE, "ServiceConfig resolution failure", (Throwable) e5);
            }
        }
        if (emptyList.isEmpty()) {
            f5083s.log(Level.FINE, "No TXT records found for {0}", new Object[]{this.f5096f});
            return null;
        }
        w0.c x4 = x(emptyList, this.f5092b, r());
        if (x4 != null) {
            return x4.d() != null ? w0.c.b(x4.d()) : this.f5106p.a((Map) x4.c());
        }
        return null;
    }

    protected static boolean C(boolean z4, boolean z5, String str) {
        if (!z4) {
            return false;
        }
        if ("localhost".equalsIgnoreCase(str)) {
            return z5;
        }
        if (str.contains(":")) {
            return false;
        }
        boolean z6 = true;
        for (int r5 = 0; r5 < str.length(); r5++) {
            char charAt = str.charAt(r5);
            if (charAt != '.') {
                z6 &= charAt >= '0' && charAt <= '9';
            }
        }
        return true ^ z6;
    }

    private boolean m() {
        if (this.f5102l) {
            long j4 = this.f5099i;
            if (j4 != 0 && (j4 <= 0 || this.f5101k.d(TimeUnit.NANOSECONDS) <= this.f5099i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b3.x n() {
        b3.b1 a5 = this.f5091a.a(InetSocketAddress.createUnresolved(this.f5096f, this.f5097g));
        if (a5 != null) {
            return new b3.x(a5);
        }
        return null;
    }

    private static final List<String> p(Map<String, ?> map) {
        return a1.g(map, "clientLanguage");
    }

    private static final List<String> q(Map<String, ?> map) {
        return a1.g(map, "clientHostname");
    }

    private static String r() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e5) {
                throw new RuntimeException(e5);
            }
        }
        return B;
    }

    private static long s(boolean z4) {
        if (z4) {
            return 0L;
        }
        String property = System.getProperty("networkaddress.cache.ttl");
        long j4 = 30;
        if (property != null) {
            try {
                j4 = Long.parseLong(property);
            } catch (NumberFormatException unused) {
                f5083s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
            }
        }
        return j4 > 0 ? TimeUnit.SECONDS.toNanos(j4) : j4;
    }

    private static final Double t(Map<String, ?> map) {
        return a1.h(map, "percentage");
    }

    static g v(ClassLoader classLoader) {
        Logger logger;
        Level level;
        String str;
        g gVar;
        try {
            try {
                try {
                    gVar = (g) Class.forName("io.grpc.internal.y0", true, classLoader).asSubclass(g.class).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Exception e5) {
                    e = e5;
                    logger = f5083s;
                    level = Level.FINE;
                    str = "Can't construct JndiResourceResolverFactory, skipping.";
                }
            } catch (Exception e6) {
                e = e6;
                logger = f5083s;
                level = Level.FINE;
                str = "Can't find JndiResourceResolverFactory ctor, skipping.";
            }
        } catch (ClassCastException e7) {
            e = e7;
            logger = f5083s;
            level = Level.FINE;
            str = "Unable to cast JndiResourceResolverFactory, skipping.";
        } catch (ClassNotFoundException e8) {
            e = e8;
            logger = f5083s;
            level = Level.FINE;
            str = "Unable to find JndiResourceResolverFactory, skipping.";
        }
        if (gVar.b() == null) {
            return gVar;
        }
        logger = f5083s;
        level = Level.FINE;
        e = gVar.b();
        str = "JndiResourceResolverFactory not available, skipping.";
        logger.log(level, str, e);
        return null;
    }

    static Map<String, ?> w(Map<String, ?> map, Random random, String str) {
        boolean z4;
        boolean z5;
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            q0.s.a(f5084t.contains(entry.getKey()), "Bad key: %s", entry);
        }
        List<String> p4 = p(map);
        if (p4 != null && !p4.isEmpty()) {
            Iterator<String> it = p4.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                if ("java".equalsIgnoreCase(it.next())) {
                    z5 = true;
                    break;
                }
            }
            if (!z5) {
                return null;
            }
        }
        Double t4 = t(map);
        if (t4 != null) {
            int intValue = t4.intValue();
            q0.s.a(intValue >= 0 && intValue <= 100, "Bad percentage: %s", t4);
            if (random.nextInt(100) >= intValue) {
                return null;
            }
        }
        List<String> q4 = q(map);
        if (q4 != null && !q4.isEmpty()) {
            Iterator<String> it2 = q4.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z4 = false;
                    break;
                }
                if (it2.next().equals(str)) {
                    z4 = true;
                    break;
                }
            }
            if (!z4) {
                return null;
            }
        }
        Map<String, ?> j4 = a1.j(map, "serviceConfig");
        if (j4 != null) {
            return j4;
        }
        throw new q0.t(String.format("key '%s' missing in '%s'", map, "serviceConfig"));
    }

    static w0.c x(List<String> list, Random random, String str) {
        b3.f1 f1Var;
        String str2;
        try {
            Iterator<Map<String, ?>> it = y(list).iterator();
            Map<String, ?> map = null;
            while (it.hasNext()) {
                try {
                    map = w(it.next(), random, str);
                    if (map != null) {
                        break;
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    f1Var = b3.f1.f758h;
                    str2 = "failed to pick service config choice";
                    return w0.c.b(f1Var.q(str2).p(e));
                }
            }
            if (map == null) {
                return null;
            }
            return w0.c.a(map);
        } catch (IOException | RuntimeException e6) {
            e = e6;
            f1Var = b3.f1.f758h;
            str2 = "failed to parse TXT records";
        }
    }

    static List<Map<String, ?>> y(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.startsWith("grpc_config=")) {
                Object a5 = z0.a(str.substring(12));
                if (!(a5 instanceof List)) {
                    throw new ClassCastException("wrong type " + a5);
                }
                arrayList.addAll(a1.a((List) a5));
            } else {
                f5083s.log(Level.FINE, "Ignoring non service config {0}", new Object[]{str});
            }
        }
        return arrayList;
    }

    private void z() {
        if (this.f5107q || this.f5103m || !m()) {
            return;
        }
        this.f5107q = true;
        this.f5104n.execute(new e(this.f5108r));
    }

    @Override // b3.w0
    public String a() {
        return this.f5095e;
    }

    @Override // b3.w0
    public void b() {
        q0.l.u(this.f5108r != null, "not started");
        z();
    }

    @Override // b3.w0
    public void c() {
        if (this.f5103m) {
            return;
        }
        this.f5103m = true;
        Executor executor = this.f5104n;
        if (executor == null || !this.f5105o) {
            return;
        }
        this.f5104n = (Executor) e2.f(this.f5098h, executor);
    }

    @Override // b3.w0
    public void d(w0.e eVar) {
        q0.l.u(this.f5108r == null, "already started");
        if (this.f5105o) {
            this.f5104n = (Executor) e2.d(this.f5098h);
        }
        this.f5108r = (w0.e) q0.l.o(eVar, "listener");
        z();
    }

    protected c o(boolean z4) {
        c cVar = new c();
        try {
            cVar.f5110b = A();
        } catch (Exception e5) {
            if (!z4) {
                cVar.f5109a = b3.f1.f771u.q("Unable to resolve host " + this.f5096f).p(e5);
                return cVar;
            }
        }
        if (f5090z) {
            cVar.f5111c = B();
        }
        return cVar;
    }

    protected f u() {
        g gVar;
        if (!C(f5088x, f5089y, this.f5096f)) {
            return null;
        }
        f fVar = this.f5094d.get();
        return (fVar != null || (gVar = A) == null) ? fVar : gVar.a();
    }
}
