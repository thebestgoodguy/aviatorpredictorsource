package x1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class s extends com.google.protobuf.a0<s, b> implements w0 {
    private static final s DEFAULT_INSTANCE;
    public static final int EXISTS_FIELD_NUMBER = 1;
    private static volatile f1<s> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 2;
    private int conditionTypeCase_ = 0;
    private Object conditionType_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8209a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8209a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8209a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8209a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8209a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8209a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8209a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8209a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<s, b> implements w0 {
        private b() {
            super(s.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(boolean z4) {
            v();
            ((s) this.f2777f).b0(z4);
            return this;
        }

        public b D(t1 t1Var) {
            v();
            ((s) this.f2777f).c0(t1Var);
            return this;
        }
    }

    public enum c {
        EXISTS(1),
        UPDATE_TIME(2),
        CONDITIONTYPE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f8214e;

        c(int r32) {
            this.f8214e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return CONDITIONTYPE_NOT_SET;
            }
            if (r12 == 1) {
                return EXISTS;
            }
            if (r12 != 2) {
                return null;
            }
            return UPDATE_TIME;
        }
    }

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        com.google.protobuf.a0.R(s.class, sVar);
    }

    private s() {
    }

    public static s X() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z4) {
        this.conditionTypeCase_ = 1;
        this.conditionType_ = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(t1 t1Var) {
        t1Var.getClass();
        this.conditionType_ = t1Var;
        this.conditionTypeCase_ = 2;
    }

    public c W() {
        return c.d(this.conditionTypeCase_);
    }

    public boolean Y() {
        if (this.conditionTypeCase_ == 1) {
            return ((Boolean) this.conditionType_).booleanValue();
        }
        return false;
    }

    public t1 Z() {
        return this.conditionTypeCase_ == 2 ? (t1) this.conditionType_ : t1.W();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8209a[fVar.ordinal()]) {
            case 1:
                return new s();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001:\u0000\u0002<\u0000", new Object[]{"conditionType_", "conditionTypeCase_", t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<s> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (s.class) {
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
