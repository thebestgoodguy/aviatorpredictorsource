package x1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class d extends com.google.protobuf.a0<d, b> implements w0 {
    private static final d DEFAULT_INSTANCE;
    public static final int FOUND_FIELD_NUMBER = 1;
    public static final int MISSING_FIELD_NUMBER = 2;
    private static volatile f1<d> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 4;
    public static final int TRANSACTION_FIELD_NUMBER = 3;
    private t1 readTime_;
    private Object result_;
    private int resultCase_ = 0;
    private com.google.protobuf.j transaction_ = com.google.protobuf.j.f2914f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8160a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8160a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8160a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8160a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8160a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8160a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8160a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8160a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<d, b> implements w0 {
        private b() {
            super(d.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        FOUND(1),
        MISSING(2),
        RESULT_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f8165e;

        c(int r32) {
            this.f8165e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return RESULT_NOT_SET;
            }
            if (r12 == 1) {
                return FOUND;
            }
            if (r12 != 2) {
                return null;
            }
            return MISSING;
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        com.google.protobuf.a0.R(d.class, dVar);
    }

    private d() {
    }

    public static d U() {
        return DEFAULT_INSTANCE;
    }

    public h V() {
        return this.resultCase_ == 1 ? (h) this.result_ : h.X();
    }

    public String W() {
        return this.resultCase_ == 2 ? (String) this.result_ : "";
    }

    public t1 X() {
        t1 t1Var = this.readTime_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public c Y() {
        return c.d(this.resultCase_);
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8160a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\n\u0004\t", new Object[]{"result_", "resultCase_", h.class, "transaction_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<d> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (d.class) {
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
