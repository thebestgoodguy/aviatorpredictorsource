package w1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import x1.t;

/* loaded from: classes.dex */
public final class a extends a0<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int LIMIT_TYPE_FIELD_NUMBER = 3;
    public static final int PARENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
    private int limitType_;
    private Object queryType_;
    private int queryTypeCase_ = 0;
    private String parent_ = "";

    /* renamed from: w1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0101a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8081a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8081a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8081a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8081a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8081a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8081a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8081a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8081a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0101a c0101a) {
            this();
        }

        public b B(c cVar) {
            v();
            ((a) this.f2777f).c0(cVar);
            return this;
        }

        public b D(String str) {
            v();
            ((a) this.f2777f).d0(str);
            return this;
        }

        public b E(t tVar) {
            v();
            ((a) this.f2777f).e0(tVar);
            return this;
        }
    }

    public enum c implements d0.c {
        FIRST(0),
        LAST(1),
        UNRECOGNIZED(-1);


        /* renamed from: i, reason: collision with root package name */
        private static final d0.d<c> f8085i = new C0102a();

        /* renamed from: e, reason: collision with root package name */
        private final int f8087e;

        /* renamed from: w1.a$c$a, reason: collision with other inner class name */
        class C0102a implements d0.d<c> {
            C0102a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int r12) {
                return c.d(r12);
            }
        }

        c(int r32) {
            this.f8087e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return FIRST;
            }
            if (r12 != 1) {
                return null;
            }
            return LAST;
        }

        @Override // com.google.protobuf.d0.c
        public final int e() {
            if (this != UNRECOGNIZED) {
                return this.f8087e;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        a0.R(a.class, aVar);
    }

    private a() {
    }

    public static b a0() {
        return DEFAULT_INSTANCE.u();
    }

    public static a b0(byte[] bArr) {
        return (a) a0.N(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(c cVar) {
        this.limitType_ = cVar.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.parent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(t tVar) {
        tVar.getClass();
        this.queryType_ = tVar;
        this.queryTypeCase_ = 2;
    }

    public c X() {
        c d5 = c.d(this.limitType_);
        return d5 == null ? c.UNRECOGNIZED : d5;
    }

    public String Y() {
        return this.parent_;
    }

    public t Z() {
        return this.queryTypeCase_ == 2 ? (t) this.queryType_ : t.e0();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        C0101a c0101a = null;
        switch (C0101a.f8081a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0101a);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003\f", new Object[]{"queryType_", "queryTypeCase_", "parent_", t.class, "limitType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a.class) {
                        f1Var = PARSER;
                        if (f1Var == null) {
                            f1Var = new a0.b<>(DEFAULT_INSTANCE);
                            PARSER = f1Var;
                        }
                    }
                }
                return f1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
