package n1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class d extends a0<d, b> implements w0 {
    private static final d DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<d> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private String name_ = "";
    private t1 version_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6684a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f6684a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6684a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6684a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6684a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6684a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6684a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6684a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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

        public b B(String str) {
            v();
            ((d) this.f2777f).a0(str);
            return this;
        }

        public b D(t1 t1Var) {
            v();
            ((d) this.f2777f).b0(t1Var);
            return this;
        }
    }

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        a0.R(d.class, dVar);
    }

    private d() {
    }

    public static d W() {
        return DEFAULT_INSTANCE;
    }

    public static b Z() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(t1 t1Var) {
        t1Var.getClass();
        this.version_ = t1Var;
    }

    public String X() {
        return this.name_;
    }

    public t1 Y() {
        t1 t1Var = this.version_;
        return t1Var == null ? t1.W() : t1Var;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f6684a[fVar.ordinal()]) {
            case 1:
                return new d();
            case 2:
                return new b(aVar);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "version_"});
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
