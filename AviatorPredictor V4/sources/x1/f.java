package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class f extends com.google.protobuf.a0<f, b> implements w0 {
    public static final int COMMIT_TIME_FIELD_NUMBER = 2;
    private static final f DEFAULT_INSTANCE;
    private static volatile f1<f> PARSER = null;
    public static final int WRITE_RESULTS_FIELD_NUMBER = 1;
    private t1 commitTime_;
    private d0.i<b0> writeResults_ = com.google.protobuf.a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8167a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8167a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8167a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8167a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8167a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8167a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8167a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8167a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<f, b> implements w0 {
        private b() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        com.google.protobuf.a0.R(f.class, fVar);
    }

    private f() {
    }

    public static f V() {
        return DEFAULT_INSTANCE;
    }

    public t1 U() {
        t1 t1Var = this.commitTime_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public b0 W(int r22) {
        return this.writeResults_.get(r22);
    }

    public int X() {
        return this.writeResults_.size();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8167a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t", new Object[]{"writeResults_", b0.class, "commitTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<f> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (f.class) {
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
