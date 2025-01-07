package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import java.util.List;
import x1.a;

/* loaded from: classes.dex */
public final class m extends com.google.protobuf.a0<m, b> implements w0 {
    private static final m DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 1;
    public static final int FIELD_TRANSFORMS_FIELD_NUMBER = 2;
    private static volatile f1<m> PARSER;
    private String document_ = "";
    private d0.i<c> fieldTransforms_ = com.google.protobuf.a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8175a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8175a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8175a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8175a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8175a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8175a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8175a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8175a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<m, b> implements w0 {
        private b() {
            super(m.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static final class c extends com.google.protobuf.a0<c, a> implements w0 {
        public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
        private static final c DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 1;
        public static final int INCREMENT_FIELD_NUMBER = 3;
        public static final int MAXIMUM_FIELD_NUMBER = 4;
        public static final int MINIMUM_FIELD_NUMBER = 5;
        private static volatile f1<c> PARSER = null;
        public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
        public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
        private Object transformType_;
        private int transformTypeCase_ = 0;
        private String fieldPath_ = "";

        public static final class a extends a0.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(a.b bVar) {
                v();
                ((c) this.f2777f).g0(bVar.t());
                return this;
            }

            public a D(String str) {
                v();
                ((c) this.f2777f).h0(str);
                return this;
            }

            public a E(x xVar) {
                v();
                ((c) this.f2777f).i0(xVar);
                return this;
            }

            public a F(a.b bVar) {
                v();
                ((c) this.f2777f).j0(bVar.t());
                return this;
            }

            public a G(b bVar) {
                v();
                ((c) this.f2777f).k0(bVar);
                return this;
            }
        }

        public enum b implements d0.c {
            SERVER_VALUE_UNSPECIFIED(0),
            REQUEST_TIME(1),
            UNRECOGNIZED(-1);


            /* renamed from: i, reason: collision with root package name */
            private static final d0.d<b> f8179i = new a();

            /* renamed from: e, reason: collision with root package name */
            private final int f8181e;

            class a implements d0.d<b> {
                a() {
                }

                @Override // com.google.protobuf.d0.d
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public b a(int r12) {
                    return b.d(r12);
                }
            }

            b(int r32) {
                this.f8181e = r32;
            }

            public static b d(int r12) {
                if (r12 == 0) {
                    return SERVER_VALUE_UNSPECIFIED;
                }
                if (r12 != 1) {
                    return null;
                }
                return REQUEST_TIME;
            }

            @Override // com.google.protobuf.d0.c
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f8181e;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        /* renamed from: x1.m$c$c, reason: collision with other inner class name */
        public enum EnumC0105c {
            SET_TO_SERVER_VALUE(2),
            INCREMENT(3),
            MAXIMUM(4),
            MINIMUM(5),
            APPEND_MISSING_ELEMENTS(6),
            REMOVE_ALL_FROM_ARRAY(7),
            TRANSFORMTYPE_NOT_SET(0);


            /* renamed from: e, reason: collision with root package name */
            private final int f8190e;

            EnumC0105c(int r32) {
                this.f8190e = r32;
            }

            public static EnumC0105c d(int r02) {
                if (r02 == 0) {
                    return TRANSFORMTYPE_NOT_SET;
                }
                switch (r02) {
                    case 2:
                        return SET_TO_SERVER_VALUE;
                    case 3:
                        return INCREMENT;
                    case 4:
                        return MAXIMUM;
                    case 5:
                        return MINIMUM;
                    case 6:
                        return APPEND_MISSING_ELEMENTS;
                    case 7:
                        return REMOVE_ALL_FROM_ARRAY;
                    default:
                        return null;
                }
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.a0.R(c.class, cVar);
        }

        private c() {
        }

        public static a f0() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g0(x1.a aVar) {
            aVar.getClass();
            this.transformType_ = aVar;
            this.transformTypeCase_ = 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void h0(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i0(x xVar) {
            xVar.getClass();
            this.transformType_ = xVar;
            this.transformTypeCase_ = 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j0(x1.a aVar) {
            aVar.getClass();
            this.transformType_ = aVar;
            this.transformTypeCase_ = 7;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k0(b bVar) {
            this.transformType_ = Integer.valueOf(bVar.e());
            this.transformTypeCase_ = 2;
        }

        public x1.a Z() {
            return this.transformTypeCase_ == 6 ? (x1.a) this.transformType_ : x1.a.a0();
        }

        public String a0() {
            return this.fieldPath_;
        }

        public x b0() {
            return this.transformTypeCase_ == 3 ? (x) this.transformType_ : x.i0();
        }

        public x1.a c0() {
            return this.transformTypeCase_ == 7 ? (x1.a) this.transformType_ : x1.a.a0();
        }

        public b d0() {
            if (this.transformTypeCase_ != 2) {
                return b.SERVER_VALUE_UNSPECIFIED;
            }
            b d5 = b.d(((Integer) this.transformType_).intValue());
            return d5 == null ? b.UNRECOGNIZED : d5;
        }

        public EnumC0105c e0() {
            return EnumC0105c.d(this.transformTypeCase_);
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8175a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"transformType_", "transformTypeCase_", "fieldPath_", x.class, x.class, x.class, x1.a.class, x1.a.class});
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
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        com.google.protobuf.a0.R(m.class, mVar);
    }

    private m() {
    }

    public static m U() {
        return DEFAULT_INSTANCE;
    }

    public List<c> V() {
        return this.fieldTransforms_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8175a[fVar.ordinal()]) {
            case 1:
                return new m();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"document_", "fieldTransforms_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<m> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (m.class) {
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
