package b3;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class v0<ReqT, RespT> {

    /* renamed from: a, reason: collision with root package name */
    private final d f923a;

    /* renamed from: b, reason: collision with root package name */
    private final String f924b;

    /* renamed from: c, reason: collision with root package name */
    private final String f925c;

    /* renamed from: d, reason: collision with root package name */
    private final c<ReqT> f926d;

    /* renamed from: e, reason: collision with root package name */
    private final c<RespT> f927e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f928f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f929g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f930h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f931i;

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReferenceArray<Object> f932j;

    public static final class b<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        private c<ReqT> f933a;

        /* renamed from: b, reason: collision with root package name */
        private c<RespT> f934b;

        /* renamed from: c, reason: collision with root package name */
        private d f935c;

        /* renamed from: d, reason: collision with root package name */
        private String f936d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f937e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f938f;

        /* renamed from: g, reason: collision with root package name */
        private Object f939g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f940h;

        private b() {
        }

        public v0<ReqT, RespT> a() {
            return new v0<>(this.f935c, this.f936d, this.f933a, this.f934b, this.f939g, this.f937e, this.f938f, this.f940h);
        }

        public b<ReqT, RespT> b(String str) {
            this.f936d = str;
            return this;
        }

        public b<ReqT, RespT> c(c<ReqT> cVar) {
            this.f933a = cVar;
            return this;
        }

        public b<ReqT, RespT> d(c<RespT> cVar) {
            this.f934b = cVar;
            return this;
        }

        public b<ReqT, RespT> e(boolean z4) {
            this.f940h = z4;
            return this;
        }

        public b<ReqT, RespT> f(d dVar) {
            this.f935c = dVar;
            return this;
        }
    }

    public interface c<T> {
        T a(InputStream inputStream);

        InputStream b(T t4);
    }

    public enum d {
        UNARY,
        CLIENT_STREAMING,
        SERVER_STREAMING,
        BIDI_STREAMING,
        UNKNOWN;

        public final boolean d() {
            return this == UNARY || this == SERVER_STREAMING;
        }
    }

    private v0(d dVar, String str, c<ReqT> cVar, c<RespT> cVar2, Object obj, boolean z4, boolean z5, boolean z6) {
        this.f932j = new AtomicReferenceArray<>(2);
        this.f923a = (d) q0.l.o(dVar, "type");
        this.f924b = (String) q0.l.o(str, "fullMethodName");
        this.f925c = a(str);
        this.f926d = (c) q0.l.o(cVar, "requestMarshaller");
        this.f927e = (c) q0.l.o(cVar2, "responseMarshaller");
        this.f928f = obj;
        this.f929g = z4;
        this.f930h = z5;
        this.f931i = z6;
    }

    public static String a(String str) {
        int lastIndexOf = ((String) q0.l.o(str, "fullMethodName")).lastIndexOf(47);
        if (lastIndexOf == -1) {
            return null;
        }
        return str.substring(0, lastIndexOf);
    }

    public static String b(String str, String str2) {
        return ((String) q0.l.o(str, "fullServiceName")) + "/" + ((String) q0.l.o(str2, "methodName"));
    }

    public static <ReqT, RespT> b<ReqT, RespT> g() {
        return h(null, null);
    }

    public static <ReqT, RespT> b<ReqT, RespT> h(c<ReqT> cVar, c<RespT> cVar2) {
        return new b().c(cVar).d(cVar2);
    }

    public String c() {
        return this.f924b;
    }

    public String d() {
        return this.f925c;
    }

    public d e() {
        return this.f923a;
    }

    public boolean f() {
        return this.f930h;
    }

    public RespT i(InputStream inputStream) {
        return this.f927e.a(inputStream);
    }

    public InputStream j(ReqT reqt) {
        return this.f926d.b(reqt);
    }

    public String toString() {
        return q0.h.c(this).d("fullMethodName", this.f924b).d("type", this.f923a).e("idempotent", this.f929g).e("safe", this.f930h).e("sampledToLocalTracing", this.f931i).d("requestMarshaller", this.f926d).d("responseMarshaller", this.f927e).d("schemaDescriptor", this.f928f).h().toString();
    }
}
