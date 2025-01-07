package x1;

import b2.a;
import com.google.protobuf.a0;
import com.google.protobuf.e1;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import x1.a;
import x1.r;

/* loaded from: classes.dex */
public final class x extends com.google.protobuf.a0<x, b> implements w0 {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
    public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
    public static final int BYTES_VALUE_FIELD_NUMBER = 18;
    private static final x DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
    public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
    public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
    public static final int MAP_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 11;
    private static volatile f1<x> PARSER = null;
    public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
    public static final int STRING_VALUE_FIELD_NUMBER = 17;
    public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
    private int valueTypeCase_ = 0;
    private Object valueType_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8271a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8271a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8271a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8271a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8271a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8271a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8271a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8271a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<x, b> implements w0 {
        private b() {
            super(x.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public r B() {
            return ((x) this.f2777f).m0();
        }

        public b D(a.b bVar) {
            v();
            ((x) this.f2777f).s0(bVar.t());
            return this;
        }

        public b E(x1.a aVar) {
            v();
            ((x) this.f2777f).s0(aVar);
            return this;
        }

        public b F(boolean z4) {
            v();
            ((x) this.f2777f).t0(z4);
            return this;
        }

        public b G(com.google.protobuf.j jVar) {
            v();
            ((x) this.f2777f).u0(jVar);
            return this;
        }

        public b H(double d5) {
            v();
            ((x) this.f2777f).v0(d5);
            return this;
        }

        public b I(a.b bVar) {
            v();
            ((x) this.f2777f).w0(bVar.t());
            return this;
        }

        public b J(long j4) {
            v();
            ((x) this.f2777f).x0(j4);
            return this;
        }

        public b L(r.b bVar) {
            v();
            ((x) this.f2777f).y0(bVar.t());
            return this;
        }

        public b N(r rVar) {
            v();
            ((x) this.f2777f).y0(rVar);
            return this;
        }

        public b O(e1 e1Var) {
            v();
            ((x) this.f2777f).z0(e1Var);
            return this;
        }

        public b P(String str) {
            v();
            ((x) this.f2777f).A0(str);
            return this;
        }

        public b Q(String str) {
            v();
            ((x) this.f2777f).B0(str);
            return this;
        }

        public b R(t1.b bVar) {
            v();
            ((x) this.f2777f).C0(bVar.t());
            return this;
        }
    }

    public enum c {
        NULL_VALUE(11),
        BOOLEAN_VALUE(1),
        INTEGER_VALUE(2),
        DOUBLE_VALUE(3),
        TIMESTAMP_VALUE(10),
        STRING_VALUE(17),
        BYTES_VALUE(18),
        REFERENCE_VALUE(5),
        GEO_POINT_VALUE(8),
        ARRAY_VALUE(9),
        MAP_VALUE(6),
        VALUETYPE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f8285e;

        c(int r32) {
            this.f8285e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return VALUETYPE_NOT_SET;
            }
            if (r12 == 1) {
                return BOOLEAN_VALUE;
            }
            if (r12 == 2) {
                return INTEGER_VALUE;
            }
            if (r12 == 3) {
                return DOUBLE_VALUE;
            }
            if (r12 == 5) {
                return REFERENCE_VALUE;
            }
            if (r12 == 6) {
                return MAP_VALUE;
            }
            if (r12 == 17) {
                return STRING_VALUE;
            }
            if (r12 == 18) {
                return BYTES_VALUE;
            }
            switch (r12) {
                case 8:
                    return GEO_POINT_VALUE;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    return ARRAY_VALUE;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    return TIMESTAMP_VALUE;
                case 11:
                    return NULL_VALUE;
                default:
                    return null;
            }
        }
    }

    static {
        x xVar = new x();
        DEFAULT_INSTANCE = xVar;
        com.google.protobuf.a0.R(x.class, xVar);
    }

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0(String str) {
        str.getClass();
        this.valueTypeCase_ = 5;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(String str) {
        str.getClass();
        this.valueTypeCase_ = 17;
        this.valueType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(t1 t1Var) {
        t1Var.getClass();
        this.valueType_ = t1Var;
        this.valueTypeCase_ = 10;
    }

    public static x i0() {
        return DEFAULT_INSTANCE;
    }

    public static b r0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(x1.a aVar) {
        aVar.getClass();
        this.valueType_ = aVar;
        this.valueTypeCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(boolean z4) {
        this.valueTypeCase_ = 1;
        this.valueType_ = Boolean.valueOf(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(com.google.protobuf.j jVar) {
        jVar.getClass();
        this.valueTypeCase_ = 18;
        this.valueType_ = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(double d5) {
        this.valueTypeCase_ = 3;
        this.valueType_ = Double.valueOf(d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0(b2.a aVar) {
        aVar.getClass();
        this.valueType_ = aVar;
        this.valueTypeCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0(long j4) {
        this.valueTypeCase_ = 2;
        this.valueType_ = Long.valueOf(j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0(r rVar) {
        rVar.getClass();
        this.valueType_ = rVar;
        this.valueTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(e1 e1Var) {
        this.valueType_ = Integer.valueOf(e1Var.e());
        this.valueTypeCase_ = 11;
    }

    public x1.a f0() {
        return this.valueTypeCase_ == 9 ? (x1.a) this.valueType_ : x1.a.a0();
    }

    public boolean g0() {
        if (this.valueTypeCase_ == 1) {
            return ((Boolean) this.valueType_).booleanValue();
        }
        return false;
    }

    public com.google.protobuf.j h0() {
        return this.valueTypeCase_ == 18 ? (com.google.protobuf.j) this.valueType_ : com.google.protobuf.j.f2914f;
    }

    public double j0() {
        if (this.valueTypeCase_ == 3) {
            return ((Double) this.valueType_).doubleValue();
        }
        return 0.0d;
    }

    public b2.a k0() {
        return this.valueTypeCase_ == 8 ? (b2.a) this.valueType_ : b2.a.W();
    }

    public long l0() {
        if (this.valueTypeCase_ == 2) {
            return ((Long) this.valueType_).longValue();
        }
        return 0L;
    }

    public r m0() {
        return this.valueTypeCase_ == 6 ? (r) this.valueType_ : r.V();
    }

    public String n0() {
        return this.valueTypeCase_ == 5 ? (String) this.valueType_ : "";
    }

    public String o0() {
        return this.valueTypeCase_ == 17 ? (String) this.valueType_ : "";
    }

    public t1 p0() {
        return this.valueTypeCase_ == 10 ? (t1) this.valueType_ : t1.W();
    }

    public c q0() {
        return c.d(this.valueTypeCase_);
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8271a[fVar.ordinal()]) {
            case 1:
                return new x();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005Ȼ\u0000\u0006<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011Ȼ\u0000\u0012=\u0000", new Object[]{"valueType_", "valueTypeCase_", r.class, b2.a.class, x1.a.class, t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<x> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (x.class) {
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
