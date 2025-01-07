package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import java.util.List;

/* loaded from: classes.dex */
public final class v extends com.google.protobuf.a0<v, b> implements w0 {
    public static final int CAUSE_FIELD_NUMBER = 3;
    private static final v DEFAULT_INSTANCE;
    private static volatile f1<v> PARSER = null;
    public static final int READ_TIME_FIELD_NUMBER = 6;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
    public static final int TARGET_IDS_FIELD_NUMBER = 2;
    private a2.a cause_;
    private t1 readTime_;
    private int targetChangeType_;
    private int targetIdsMemoizedSerializedSize = -1;
    private d0.g targetIds_ = com.google.protobuf.a0.z();
    private com.google.protobuf.j resumeToken_ = com.google.protobuf.j.f2914f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8260a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8260a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8260a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8260a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8260a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8260a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8260a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8260a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<v, b> implements w0 {
        private b() {
            super(v.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c implements d0.c {
        NO_CHANGE(0),
        ADD(1),
        REMOVE(2),
        CURRENT(3),
        RESET(4),
        UNRECOGNIZED(-1);


        /* renamed from: l, reason: collision with root package name */
        private static final d0.d<c> f8267l = new a();

        /* renamed from: e, reason: collision with root package name */
        private final int f8269e;

        class a implements d0.d<c> {
            a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int r12) {
                return c.d(r12);
            }
        }

        c(int r32) {
            this.f8269e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return NO_CHANGE;
            }
            if (r12 == 1) {
                return ADD;
            }
            if (r12 == 2) {
                return REMOVE;
            }
            if (r12 == 3) {
                return CURRENT;
            }
            if (r12 != 4) {
                return null;
            }
            return RESET;
        }

        @Override // com.google.protobuf.d0.c
        public final int e() {
            if (this != UNRECOGNIZED) {
                return this.f8269e;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        v vVar = new v();
        DEFAULT_INSTANCE = vVar;
        com.google.protobuf.a0.R(v.class, vVar);
    }

    private v() {
    }

    public static v V() {
        return DEFAULT_INSTANCE;
    }

    public a2.a U() {
        a2.a aVar = this.cause_;
        return aVar == null ? a2.a.V() : aVar;
    }

    public t1 W() {
        t1 t1Var = this.readTime_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public com.google.protobuf.j X() {
        return this.resumeToken_;
    }

    public c Y() {
        c d5 = c.d(this.targetChangeType_);
        return d5 == null ? c.UNRECOGNIZED : d5;
    }

    public int Z() {
        return this.targetIds_.size();
    }

    public List<Integer> a0() {
        return this.targetIds_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8260a[fVar.ordinal()]) {
            case 1:
                return new v();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\f\u0002'\u0003\t\u0004\n\u0006\t", new Object[]{"targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<v> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (v.class) {
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
