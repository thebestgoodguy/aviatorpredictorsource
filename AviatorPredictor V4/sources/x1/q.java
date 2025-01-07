package x1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class q extends com.google.protobuf.a0<q, b> implements w0 {
    private static final q DEFAULT_INSTANCE;
    public static final int DOCUMENT_CHANGE_FIELD_NUMBER = 3;
    public static final int DOCUMENT_DELETE_FIELD_NUMBER = 4;
    public static final int DOCUMENT_REMOVE_FIELD_NUMBER = 6;
    public static final int FILTER_FIELD_NUMBER = 5;
    private static volatile f1<q> PARSER = null;
    public static final int TARGET_CHANGE_FIELD_NUMBER = 2;
    private int responseTypeCase_ = 0;
    private Object responseType_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8198a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8198a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8198a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8198a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8198a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8198a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8198a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8198a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<q, b> implements w0 {
        private b() {
            super(q.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public enum c {
        TARGET_CHANGE(2),
        DOCUMENT_CHANGE(3),
        DOCUMENT_DELETE(4),
        DOCUMENT_REMOVE(6),
        FILTER(5),
        RESPONSETYPE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f8206e;

        c(int r32) {
            this.f8206e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return RESPONSETYPE_NOT_SET;
            }
            if (r12 == 2) {
                return TARGET_CHANGE;
            }
            if (r12 == 3) {
                return DOCUMENT_CHANGE;
            }
            if (r12 == 4) {
                return DOCUMENT_DELETE;
            }
            if (r12 == 5) {
                return FILTER;
            }
            if (r12 != 6) {
                return null;
            }
            return DOCUMENT_REMOVE;
        }
    }

    static {
        q qVar = new q();
        DEFAULT_INSTANCE = qVar;
        com.google.protobuf.a0.R(q.class, qVar);
    }

    private q() {
    }

    public static q U() {
        return DEFAULT_INSTANCE;
    }

    public i V() {
        return this.responseTypeCase_ == 3 ? (i) this.responseType_ : i.U();
    }

    public j W() {
        return this.responseTypeCase_ == 4 ? (j) this.responseType_ : j.U();
    }

    public l X() {
        return this.responseTypeCase_ == 6 ? (l) this.responseType_ : l.U();
    }

    public n Y() {
        return this.responseTypeCase_ == 5 ? (n) this.responseType_ : n.V();
    }

    public c Z() {
        return c.d(this.responseTypeCase_);
    }

    public v a0() {
        return this.responseTypeCase_ == 2 ? (v) this.responseType_ : v.V();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8198a[fVar.ordinal()]) {
            case 1:
                return new q();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", v.class, i.class, j.class, n.class, l.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<q> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (q.class) {
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
