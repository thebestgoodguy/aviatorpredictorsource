package io.grpc.internal;

import b3.c;
import b3.f1;
import b3.i0;
import b3.k;
import b3.n0;
import b3.u0;
import io.grpc.internal.e2;
import io.grpc.internal.j2;
import io.grpc.internal.r;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5563a = Logger.getLogger(q0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f5564b = StandardCharsets.US_ASCII;

    /* renamed from: c, reason: collision with root package name */
    public static final u0.g<Long> f5565c = u0.g.e("grpc-timeout", new i());

    /* renamed from: d, reason: collision with root package name */
    public static final u0.g<String> f5566d;

    /* renamed from: e, reason: collision with root package name */
    public static final u0.g<byte[]> f5567e;

    /* renamed from: f, reason: collision with root package name */
    public static final u0.g<String> f5568f;

    /* renamed from: g, reason: collision with root package name */
    public static final u0.g<byte[]> f5569g;

    /* renamed from: h, reason: collision with root package name */
    static final u0.g<String> f5570h;

    /* renamed from: i, reason: collision with root package name */
    public static final u0.g<String> f5571i;

    /* renamed from: j, reason: collision with root package name */
    public static final u0.g<String> f5572j;

    /* renamed from: k, reason: collision with root package name */
    public static final u0.g<String> f5573k;

    /* renamed from: l, reason: collision with root package name */
    public static final q0.m f5574l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f5575m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f5576n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f5577o;

    /* renamed from: p, reason: collision with root package name */
    public static final b3.c1 f5578p;

    /* renamed from: q, reason: collision with root package name */
    public static final b3.c1 f5579q;

    /* renamed from: r, reason: collision with root package name */
    public static final c.a<Boolean> f5580r;

    /* renamed from: s, reason: collision with root package name */
    private static final b3.k f5581s;

    /* renamed from: t, reason: collision with root package name */
    public static final e2.d<Executor> f5582t;

    /* renamed from: u, reason: collision with root package name */
    public static final e2.d<ScheduledExecutorService> f5583u;

    /* renamed from: v, reason: collision with root package name */
    public static final q0.p<q0.n> f5584v;

    class a implements b3.c1 {
        a() {
        }

        @Override // b3.c1
        public b3.b1 a(SocketAddress socketAddress) {
            return null;
        }
    }

    class b extends b3.k {
        b() {
        }
    }

    class c implements e2.d<Executor> {
        c() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(Executor executor) {
            ((ExecutorService) executor).shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Executor a() {
            return Executors.newCachedThreadPool(q0.i("grpc-default-executor-%d", true));
        }

        public String toString() {
            return "grpc-default-executor";
        }
    }

    class d implements e2.d<ScheduledExecutorService> {
        d() {
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(ScheduledExecutorService scheduledExecutorService) {
            scheduledExecutorService.shutdown();
        }

        @Override // io.grpc.internal.e2.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public ScheduledExecutorService a() {
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, q0.i("grpc-timer-%d", true));
            try {
                newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
            } catch (RuntimeException e5) {
                throw e5;
            } catch (Exception e6) {
                throw new RuntimeException(e6);
            }
            return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
        }
    }

    class e implements q0.p<q0.n> {
        e() {
        }

        @Override // q0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q0.n get() {
            return q0.n.c();
        }
    }

    class f implements s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k.a f5585a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f5586b;

        f(k.a aVar, s sVar) {
            this.f5585a = aVar;
            this.f5586b = sVar;
        }

        @Override // io.grpc.internal.s
        public q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
            b3.k a5 = this.f5585a.a(k.b.a().b(cVar).a(), u0Var);
            q0.l.u(kVarArr[kVarArr.length - 1] == q0.f5581s, "lb tracer already assigned");
            kVarArr[kVarArr.length - 1] = a5;
            return this.f5586b.c(v0Var, u0Var, cVar, kVarArr);
        }

        @Override // b3.l0
        public b3.h0 d() {
            return this.f5586b.d();
        }
    }

    private static final class g implements i0.a<byte[]> {
        private g() {
        }

        /* synthetic */ g(a aVar) {
            this();
        }

        @Override // b3.u0.j
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public byte[] b(byte[] bArr) {
            return bArr;
        }

        @Override // b3.u0.j
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public byte[] a(byte[] bArr) {
            return bArr;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'g' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class h {

        /* renamed from: g, reason: collision with root package name */
        public static final h f5587g;

        /* renamed from: h, reason: collision with root package name */
        public static final h f5588h;

        /* renamed from: i, reason: collision with root package name */
        public static final h f5589i;

        /* renamed from: j, reason: collision with root package name */
        public static final h f5590j;

        /* renamed from: k, reason: collision with root package name */
        public static final h f5591k;

        /* renamed from: l, reason: collision with root package name */
        public static final h f5592l;

        /* renamed from: m, reason: collision with root package name */
        public static final h f5593m;

        /* renamed from: n, reason: collision with root package name */
        public static final h f5594n;

        /* renamed from: o, reason: collision with root package name */
        public static final h f5595o;

        /* renamed from: p, reason: collision with root package name */
        public static final h f5596p;

        /* renamed from: q, reason: collision with root package name */
        public static final h f5597q;

        /* renamed from: r, reason: collision with root package name */
        public static final h f5598r;

        /* renamed from: s, reason: collision with root package name */
        public static final h f5599s;

        /* renamed from: t, reason: collision with root package name */
        public static final h f5600t;

        /* renamed from: u, reason: collision with root package name */
        private static final h[] f5601u;

        /* renamed from: v, reason: collision with root package name */
        private static final /* synthetic */ h[] f5602v;

        /* renamed from: e, reason: collision with root package name */
        private final int f5603e;

        /* renamed from: f, reason: collision with root package name */
        private final b3.f1 f5604f;

        static {
            b3.f1 f1Var = b3.f1.f771u;
            h hVar = new h("NO_ERROR", 0, 0, f1Var);
            f5587g = hVar;
            b3.f1 f1Var2 = b3.f1.f770t;
            h hVar2 = new h("PROTOCOL_ERROR", 1, 1, f1Var2);
            f5588h = hVar2;
            h hVar3 = new h("INTERNAL_ERROR", 2, 2, f1Var2);
            f5589i = hVar3;
            h hVar4 = new h("FLOW_CONTROL_ERROR", 3, 3, f1Var2);
            f5590j = hVar4;
            h hVar5 = new h("SETTINGS_TIMEOUT", 4, 4, f1Var2);
            f5591k = hVar5;
            h hVar6 = new h("STREAM_CLOSED", 5, 5, f1Var2);
            f5592l = hVar6;
            h hVar7 = new h("FRAME_SIZE_ERROR", 6, 6, f1Var2);
            f5593m = hVar7;
            h hVar8 = new h("REFUSED_STREAM", 7, 7, f1Var);
            f5594n = hVar8;
            h hVar9 = new h("CANCEL", 8, 8, b3.f1.f757g);
            f5595o = hVar9;
            h hVar10 = new h("COMPRESSION_ERROR", 9, 9, f1Var2);
            f5596p = hVar10;
            h hVar11 = new h("CONNECT_ERROR", 10, 10, f1Var2);
            f5597q = hVar11;
            h hVar12 = new h("ENHANCE_YOUR_CALM", 11, 11, b3.f1.f765o.q("Bandwidth exhausted"));
            f5598r = hVar12;
            h hVar13 = new h("INADEQUATE_SECURITY", 12, 12, b3.f1.f763m.q("Permission denied as protocol is not secure enough to call"));
            f5599s = hVar13;
            h hVar14 = new h("HTTP_1_1_REQUIRED", 13, 13, b3.f1.f758h);
            f5600t = hVar14;
            f5602v = new h[]{hVar, hVar2, hVar3, hVar4, hVar5, hVar6, hVar7, hVar8, hVar9, hVar10, hVar11, hVar12, hVar13, hVar14};
            f5601u = d();
        }

        private h(String str, int r22, int r32, b3.f1 f1Var) {
            this.f5603e = r32;
            String str2 = "HTTP/2 error code: " + name();
            if (f1Var.n() != null) {
                str2 = str2 + " (" + f1Var.n() + ")";
            }
            this.f5604f = f1Var.q(str2);
        }

        private static h[] d() {
            h[] values = values();
            h[] hVarArr = new h[((int) values[values.length - 1].g()) + 1];
            for (h hVar : values) {
                hVarArr[(int) hVar.g()] = hVar;
            }
            return hVarArr;
        }

        public static h h(long j4) {
            h[] hVarArr = f5601u;
            if (j4 >= hVarArr.length || j4 < 0) {
                return null;
            }
            return hVarArr[(int) j4];
        }

        public static b3.f1 k(long j4) {
            h h5 = h(j4);
            if (h5 != null) {
                return h5.i();
            }
            return b3.f1.h(f5589i.i().m().h()).q("Unrecognized HTTP/2 error code: " + j4);
        }

        public static h valueOf(String str) {
            return (h) Enum.valueOf(h.class, str);
        }

        public static h[] values() {
            return (h[]) f5602v.clone();
        }

        public long g() {
            return this.f5603e;
        }

        public b3.f1 i() {
            return this.f5604f;
        }
    }

    static class i implements u0.d<Long> {
        i() {
        }

        @Override // b3.u0.d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long b(String str) {
            TimeUnit timeUnit;
            q0.l.e(str.length() > 0, "empty timeout");
            q0.l.e(str.length() <= 9, "bad timeout format");
            long parseLong = Long.parseLong(str.substring(0, str.length() - 1));
            char charAt = str.charAt(str.length() - 1);
            if (charAt == 'H') {
                timeUnit = TimeUnit.HOURS;
            } else if (charAt == 'M') {
                timeUnit = TimeUnit.MINUTES;
            } else if (charAt == 'S') {
                timeUnit = TimeUnit.SECONDS;
            } else if (charAt == 'u') {
                timeUnit = TimeUnit.MICROSECONDS;
            } else {
                if (charAt != 'm') {
                    if (charAt == 'n') {
                        return Long.valueOf(parseLong);
                    }
                    throw new IllegalArgumentException(String.format("Invalid timeout unit: %s", Character.valueOf(charAt)));
                }
                timeUnit = TimeUnit.MILLISECONDS;
            }
            return Long.valueOf(timeUnit.toNanos(parseLong));
        }

        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        @Override // b3.u0.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public java.lang.String a(
        /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
            java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
            	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
            	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            */
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r7v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:310)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
            	at jadx.core.ProcessClass.process(ProcessClass.java:79)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
            	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
            	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
            */
    }

    static {
        u0.d<String> dVar = b3.u0.f903e;
        f5566d = u0.g.e("grpc-encoding", dVar);
        a aVar = null;
        f5567e = b3.i0.b("grpc-accept-encoding", new g(aVar));
        f5568f = u0.g.e("content-encoding", dVar);
        f5569g = b3.i0.b("accept-encoding", new g(aVar));
        f5570h = u0.g.e("content-length", dVar);
        f5571i = u0.g.e("content-type", dVar);
        f5572j = u0.g.e("te", dVar);
        f5573k = u0.g.e("user-agent", dVar);
        f5574l = q0.m.a(',').c();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f5575m = timeUnit.toNanos(20L);
        f5576n = TimeUnit.HOURS.toNanos(2L);
        f5577o = timeUnit.toNanos(20L);
        f5578p = new t1();
        f5579q = new a();
        f5580r = c.a.b("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER");
        f5581s = new b();
        f5582t = new c();
        f5583u = new d();
        f5584v = new e();
    }

    private q0() {
    }

    public static URI b(String str) {
        q0.l.o(str, "authority");
        try {
            return new URI(null, str, null, null, null);
        } catch (URISyntaxException e5) {
            throw new IllegalArgumentException("Invalid authority: " + str, e5);
        }
    }

    public static String c(String str) {
        URI b5 = b(str);
        q0.l.j(b5.getHost() != null, "No host in authority '%s'", str);
        q0.l.j(b5.getUserInfo() == null, "Userinfo must not be present on authority: '%s'", str);
        return str;
    }

    static void d(j2.a aVar) {
        while (true) {
            InputStream next = aVar.next();
            if (next == null) {
                return;
            } else {
                e(next);
            }
        }
    }

    public static void e(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e5) {
            f5563a.log(Level.WARNING, "exception caught in closeQuietly", (Throwable) e5);
        }
    }

    public static b3.k[] f(b3.c cVar, b3.u0 u0Var, int r6, boolean z4) {
        List<k.a> i4 = cVar.i();
        int size = i4.size() + 1;
        b3.k[] kVarArr = new b3.k[size];
        k.b a5 = k.b.a().b(cVar).d(r6).c(z4).a();
        for (int r62 = 0; r62 < i4.size(); r62++) {
            kVarArr[r62] = i4.get(r62).a(a5, u0Var);
        }
        kVarArr[size - 1] = f5581s;
        return kVarArr;
    }

    public static String g(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append('/');
        sb.append("1.44.1");
        return sb.toString();
    }

    public static String h(InetSocketAddress inetSocketAddress) {
        try {
            return (String) InetSocketAddress.class.getMethod("getHostString", new Class[0]).invoke(inetSocketAddress, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return inetSocketAddress.getHostName();
        }
    }

    public static ThreadFactory i(String str, boolean z4) {
        return new v0.e().e(z4).f(str).b();
    }

    static s j(n0.e eVar, boolean z4) {
        n0.h c5 = eVar.c();
        s b5 = c5 != null ? ((m2) c5.d()).b() : null;
        if (b5 != null) {
            k.a b6 = eVar.b();
            return b6 == null ? b5 : new f(b6, b5);
        }
        if (!eVar.a().o()) {
            if (eVar.d()) {
                return new g0(eVar.a(), r.a.DROPPED);
            }
            if (!z4) {
                return new g0(eVar.a(), r.a.PROCESSED);
            }
        }
        return null;
    }

    private static f1.b k(int r12) {
        if (r12 >= 100 && r12 < 200) {
            return f1.b.INTERNAL;
        }
        if (r12 != 400) {
            if (r12 == 401) {
                return f1.b.UNAUTHENTICATED;
            }
            if (r12 == 403) {
                return f1.b.PERMISSION_DENIED;
            }
            if (r12 == 404) {
                return f1.b.UNIMPLEMENTED;
            }
            if (r12 != 429) {
                if (r12 != 431) {
                    switch (r12) {
                        case 502:
                        case 503:
                        case 504:
                            break;
                        default:
                            return f1.b.UNKNOWN;
                    }
                }
            }
            return f1.b.UNAVAILABLE;
        }
        return f1.b.INTERNAL;
    }

    public static b3.f1 l(int r32) {
        return k(r32).g().q("HTTP status code " + r32);
    }

    public static boolean m(String str) {
        char charAt;
        if (str == null || 16 > str.length()) {
            return false;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("application/grpc")) {
            return lowerCase.length() == 16 || (charAt = lowerCase.charAt(16)) == '+' || charAt == ';';
        }
        return false;
    }

    public static boolean n(b3.c cVar) {
        return !Boolean.TRUE.equals(cVar.h(f5580r));
    }
}
