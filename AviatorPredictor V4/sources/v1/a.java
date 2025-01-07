package v1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends a0<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int QUERY_SCOPE_FIELD_NUMBER = 2;
    public static final int STATE_FIELD_NUMBER = 4;
    private int queryScope_;
    private int state_;
    private String name_ = "";
    private d0.i<c> fields_ = a0.A();

    /* renamed from: v1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0095a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7838a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f7838a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7838a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7838a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7838a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7838a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7838a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7838a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0095a c0095a) {
            this();
        }
    }

    public static final class c extends a0<c, C0096a> implements w0 {
        public static final int ARRAY_CONFIG_FIELD_NUMBER = 3;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int ORDER_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private Object valueMode_;
        private int valueModeCase_ = 0;
        private String fieldPath_ = "";

        /* renamed from: v1.a$c$a, reason: collision with other inner class name */
        public static final class C0096a extends a0.a<c, C0096a> implements w0 {
            private C0096a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ C0096a(C0095a c0095a) {
                this();
            }
        }

        public enum b implements d0.c {
            ORDER_UNSPECIFIED(0),
            ASCENDING(1),
            DESCENDING(2),
            UNRECOGNIZED(-1);


            /* renamed from: j, reason: collision with root package name */
            private static final d0.d<b> f7843j = new C0097a();

            /* renamed from: e, reason: collision with root package name */
            private final int f7845e;

            /* renamed from: v1.a$c$b$a, reason: collision with other inner class name */
            class C0097a implements d0.d<b> {
                C0097a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int r12) {
                    return b.d(r12);
                }
            }

            b(int r32) {
                this.f7845e = r32;
            }

            public static b d(int r12) {
                if (r12 == 0) {
                    return ORDER_UNSPECIFIED;
                }
                if (r12 == 1) {
                    return ASCENDING;
                }
                if (r12 != 2) {
                    return null;
                }
                return DESCENDING;
            }

            @Override // com.google.protobuf.d0.c
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f7845e;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: v1.a$c$c, reason: collision with other inner class name */
        public enum EnumC0098c {
            ORDER(2),
            ARRAY_CONFIG(3),
            VALUEMODE_NOT_SET(0);


            /* renamed from: e, reason: collision with root package name */
            private final int f7850e;

            EnumC0098c(int r32) {
                this.f7850e = r32;
            }

            public static EnumC0098c d(int r12) {
                if (r12 == 0) {
                    return VALUEMODE_NOT_SET;
                }
                if (r12 == 2) {
                    return ORDER;
                }
                if (r12 != 3) {
                    return null;
                }
                return ARRAY_CONFIG;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            a0.R(c.class, cVar);
        }

        private c() {
        }

        public String U() {
            return this.fieldPath_;
        }

        public b V() {
            if (this.valueModeCase_ != 2) {
                return b.ORDER_UNSPECIFIED;
            }
            b d5 = b.d(((Integer) this.valueMode_).intValue());
            return d5 == null ? b.UNRECOGNIZED : d5;
        }

        public EnumC0098c W() {
            return EnumC0098c.d(this.valueModeCase_);
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            C0095a c0095a = null;
            switch (C0095a.f7838a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new C0096a(c0095a);
                case 3:
                    return a0.J(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003?\u0000", new Object[]{"valueMode_", "valueModeCase_", "fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<c> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (c.class) {
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

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        a0.R(a.class, aVar);
    }

    private a() {
    }

    public static a V(byte[] bArr) {
        return (a) a0.N(DEFAULT_INSTANCE, bArr);
    }

    public List<c> U() {
        return this.fields_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        C0095a c0095a = null;
        switch (C0095a.f7838a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0095a);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\f", new Object[]{"name_", "queryScope_", "fields_", c.class, "state_"});
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
