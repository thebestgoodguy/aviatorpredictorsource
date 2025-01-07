package io.grpc.internal;

import b3.w0;
import io.grpc.internal.e0;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class g1 extends b3.r0<g1> {
    private static final Logger H = Logger.getLogger(g1.class.getName());
    static final long I = TimeUnit.MINUTES.toMillis(30);
    static final long J = TimeUnit.SECONDS.toMillis(1);
    private static final o1<? extends Executor> K = f2.c(q0.f5582t);
    private static final b3.v L = b3.v.c();
    private static final b3.o M = b3.o.a();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private final c F;
    private final b G;

    /* renamed from: a, reason: collision with root package name */
    o1<? extends Executor> f5327a;

    /* renamed from: b, reason: collision with root package name */
    o1<? extends Executor> f5328b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b3.h> f5329c;

    /* renamed from: d, reason: collision with root package name */
    final b3.y0 f5330d;

    /* renamed from: e, reason: collision with root package name */
    w0.d f5331e;

    /* renamed from: f, reason: collision with root package name */
    final String f5332f;

    /* renamed from: g, reason: collision with root package name */
    final b3.b f5333g;

    /* renamed from: h, reason: collision with root package name */
    private final SocketAddress f5334h;

    /* renamed from: i, reason: collision with root package name */
    String f5335i;

    /* renamed from: j, reason: collision with root package name */
    String f5336j;

    /* renamed from: k, reason: collision with root package name */
    String f5337k;

    /* renamed from: l, reason: collision with root package name */
    boolean f5338l;

    /* renamed from: m, reason: collision with root package name */
    b3.v f5339m;

    /* renamed from: n, reason: collision with root package name */
    b3.o f5340n;

    /* renamed from: o, reason: collision with root package name */
    long f5341o;

    /* renamed from: p, reason: collision with root package name */
    int f5342p;

    /* renamed from: q, reason: collision with root package name */
    int f5343q;

    /* renamed from: r, reason: collision with root package name */
    long f5344r;

    /* renamed from: s, reason: collision with root package name */
    long f5345s;

    /* renamed from: t, reason: collision with root package name */
    boolean f5346t;

    /* renamed from: u, reason: collision with root package name */
    b3.c0 f5347u;

    /* renamed from: v, reason: collision with root package name */
    int f5348v;

    /* renamed from: w, reason: collision with root package name */
    Map<String, ?> f5349w;

    /* renamed from: x, reason: collision with root package name */
    boolean f5350x;

    /* renamed from: y, reason: collision with root package name */
    b3.c1 f5351y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f5352z;

    public interface b {
        int a();
    }

    public interface c {
        t a();
    }

    private static final class d implements b {
        private d() {
        }

        @Override // io.grpc.internal.g1.b
        public int a() {
            return 443;
        }
    }

    public g1(String str, b3.e eVar, b3.b bVar, c cVar, b bVar2) {
        o1<? extends Executor> o1Var = K;
        this.f5327a = o1Var;
        this.f5328b = o1Var;
        this.f5329c = new ArrayList();
        b3.y0 d5 = b3.y0.d();
        this.f5330d = d5;
        this.f5331e = d5.c();
        this.f5337k = "pick_first";
        this.f5339m = L;
        this.f5340n = M;
        this.f5341o = I;
        this.f5342p = 5;
        this.f5343q = 5;
        this.f5344r = 16777216L;
        this.f5345s = 1048576L;
        this.f5346t = true;
        this.f5347u = b3.c0.g();
        this.f5350x = true;
        this.f5352z = true;
        this.A = true;
        this.B = true;
        this.C = false;
        this.D = true;
        this.E = true;
        this.f5332f = (String) q0.l.o(str, "target");
        this.f5333g = bVar;
        this.F = (c) q0.l.o(cVar, "clientTransportFactoryBuilder");
        this.f5334h = null;
        if (bVar2 != null) {
            this.G = bVar2;
        } else {
            this.G = new d();
        }
    }

    public g1(String str, c cVar, b bVar) {
        this(str, null, null, cVar, bVar);
    }

    @Override // b3.r0
    public b3.q0 a() {
        return new h1(new f1(this, this.F.a(), new e0.a(), f2.c(q0.f5582t), q0.f5584v, f(), k2.f5425a));
    }

    int e() {
        return this.G.a();
    }

    List<b3.h> f() {
        b3.h hVar;
        ArrayList arrayList = new ArrayList(this.f5329c);
        b3.h hVar2 = null;
        if (this.f5352z) {
            try {
                Class<?> cls = Class.forName("io.grpc.census.InternalCensusStatsAccessor");
                Class<?> cls2 = Boolean.TYPE;
                hVar = (b3.h) cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2).invoke(null, Boolean.valueOf(this.A), Boolean.valueOf(this.B), Boolean.valueOf(this.C), Boolean.valueOf(this.D));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                H.log(Level.FINE, "Unable to apply census stats", e5);
                hVar = null;
            }
            if (hVar != null) {
                arrayList.add(0, hVar);
            }
        }
        if (this.E) {
            try {
                hVar2 = (b3.h) Class.forName("io.grpc.census.InternalCensusTracingAccessor").getDeclaredMethod("getClientInterceptor", new Class[0]).invoke(null, new Object[0]);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e6) {
                H.log(Level.FINE, "Unable to apply census stats", e6);
            }
            if (hVar2 != null) {
                arrayList.add(0, hVar2);
            }
        }
        return arrayList;
    }
}
