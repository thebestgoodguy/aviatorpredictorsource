package x1;

import com.google.protobuf.a0;
import com.google.protobuf.b0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import java.util.List;
import x1.g;

/* loaded from: classes.dex */
public final class t extends com.google.protobuf.a0<t, b> implements w0 {
    private static final t DEFAULT_INSTANCE;
    public static final int END_AT_FIELD_NUMBER = 8;
    public static final int FROM_FIELD_NUMBER = 2;
    public static final int LIMIT_FIELD_NUMBER = 5;
    public static final int OFFSET_FIELD_NUMBER = 6;
    public static final int ORDER_BY_FIELD_NUMBER = 4;
    private static volatile f1<t> PARSER = null;
    public static final int SELECT_FIELD_NUMBER = 1;
    public static final int START_AT_FIELD_NUMBER = 7;
    public static final int WHERE_FIELD_NUMBER = 3;
    private x1.g endAt_;
    private com.google.protobuf.b0 limit_;
    private int offset_;
    private j select_;
    private x1.g startAt_;
    private h where_;
    private d0.i<c> from_ = com.google.protobuf.a0.A();
    private d0.i<i> orderBy_ = com.google.protobuf.a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8215a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8215a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8215a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8215a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8215a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8215a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8215a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8215a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<t, b> implements w0 {
        private b() {
            super(t.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(c.a aVar) {
            v();
            ((t) this.f2777f).a0(aVar.t());
            return this;
        }

        public b D(i iVar) {
            v();
            ((t) this.f2777f).b0(iVar);
            return this;
        }

        public b E(g.b bVar) {
            v();
            ((t) this.f2777f).s0(bVar.t());
            return this;
        }

        public b F(b0.b bVar) {
            v();
            ((t) this.f2777f).t0(bVar.t());
            return this;
        }

        public b G(g.b bVar) {
            v();
            ((t) this.f2777f).u0(bVar.t());
            return this;
        }

        public b H(h hVar) {
            v();
            ((t) this.f2777f).v0(hVar);
            return this;
        }
    }

    public static final class c extends com.google.protobuf.a0<c, a> implements w0 {
        public static final int ALL_DESCENDANTS_FIELD_NUMBER = 3;
        public static final int COLLECTION_ID_FIELD_NUMBER = 2;
        private static final c DEFAULT_INSTANCE;
        private static volatile f1<c> PARSER;
        private boolean allDescendants_;
        private String collectionId_ = "";

        public static final class a extends a0.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(boolean z4) {
                v();
                ((c) this.f2777f).Z(z4);
                return this;
            }

            public a D(String str) {
                v();
                ((c) this.f2777f).a0(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.protobuf.a0.R(c.class, cVar);
        }

        private c() {
        }

        public static a Y() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(boolean z4) {
            this.allDescendants_ = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(String str) {
            str.getClass();
            this.collectionId_ = str;
        }

        public boolean W() {
            return this.allDescendants_;
        }

        public String X() {
            return this.collectionId_;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"collectionId_", "allDescendants_"});
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

    public static final class d extends com.google.protobuf.a0<d, a> implements w0 {
        private static final d DEFAULT_INSTANCE;
        public static final int FILTERS_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER;
        private d0.i<h> filters_ = com.google.protobuf.a0.A();
        private int op_;

        public static final class a extends a0.a<d, a> implements w0 {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(Iterable<? extends h> iterable) {
                v();
                ((d) this.f2777f).W(iterable);
                return this;
            }

            public a D(b bVar) {
                v();
                ((d) this.f2777f).c0(bVar);
                return this;
            }
        }

        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            AND(1),
            UNRECOGNIZED(-1);


            /* renamed from: i, reason: collision with root package name */
            private static final d0.d<b> f8219i = new a();

            /* renamed from: e, reason: collision with root package name */
            private final int f8221e;

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
                this.f8221e = r32;
            }

            public static b d(int r12) {
                if (r12 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (r12 != 1) {
                    return null;
                }
                return AND;
            }

            @Override // com.google.protobuf.d0.c
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f8221e;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.a0.R(d.class, dVar);
        }

        private d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void W(Iterable<? extends h> iterable) {
            X();
            com.google.protobuf.a.i(iterable, this.filters_);
        }

        private void X() {
            d0.i<h> iVar = this.filters_;
            if (iVar.n()) {
                return;
            }
            this.filters_ = com.google.protobuf.a0.H(iVar);
        }

        public static d Y() {
            return DEFAULT_INSTANCE;
        }

        public static a b0() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(b bVar) {
            this.op_ = bVar.e();
        }

        public List<h> Z() {
            return this.filters_;
        }

        public b a0() {
            b d5 = b.d(this.op_);
            return d5 == null ? b.UNRECOGNIZED : d5;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002\u001b", new Object[]{"op_", "filters_", h.class});
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

    public enum e implements d0.c {
        DIRECTION_UNSPECIFIED(0),
        ASCENDING(1),
        DESCENDING(2),
        UNRECOGNIZED(-1);


        /* renamed from: j, reason: collision with root package name */
        private static final d0.d<e> f8226j = new a();

        /* renamed from: e, reason: collision with root package name */
        private final int f8228e;

        class a implements d0.d<e> {
            a() {
            }

            @Override // com.google.protobuf.d0.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e a(int r12) {
                return e.d(r12);
            }
        }

        e(int r32) {
            this.f8228e = r32;
        }

        public static e d(int r12) {
            if (r12 == 0) {
                return DIRECTION_UNSPECIFIED;
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
                return this.f8228e;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static final class f extends com.google.protobuf.a0<f, a> implements w0 {
        private static final f DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 1;
        public static final int OP_FIELD_NUMBER = 2;
        private static volatile f1<f> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private g field_;
        private int op_;
        private x value_;

        public static final class a extends a0.a<f, a> implements w0 {
            private a() {
                super(f.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(g gVar) {
                v();
                ((f) this.f2777f).c0(gVar);
                return this;
            }

            public a D(b bVar) {
                v();
                ((f) this.f2777f).d0(bVar);
                return this;
            }

            public a E(x xVar) {
                v();
                ((f) this.f2777f).e0(xVar);
                return this;
            }
        }

        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            LESS_THAN(1),
            LESS_THAN_OR_EQUAL(2),
            GREATER_THAN(3),
            GREATER_THAN_OR_EQUAL(4),
            EQUAL(5),
            NOT_EQUAL(6),
            ARRAY_CONTAINS(7),
            IN(8),
            ARRAY_CONTAINS_ANY(9),
            NOT_IN(10),
            UNRECOGNIZED(-1);


            /* renamed from: r, reason: collision with root package name */
            private static final d0.d<b> f8241r = new a();

            /* renamed from: e, reason: collision with root package name */
            private final int f8243e;

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
                this.f8243e = r32;
            }

            public static b d(int r02) {
                switch (r02) {
                    case 0:
                        return OPERATOR_UNSPECIFIED;
                    case 1:
                        return LESS_THAN;
                    case 2:
                        return LESS_THAN_OR_EQUAL;
                    case 3:
                        return GREATER_THAN;
                    case 4:
                        return GREATER_THAN_OR_EQUAL;
                    case 5:
                        return EQUAL;
                    case 6:
                        return NOT_EQUAL;
                    case 7:
                        return ARRAY_CONTAINS;
                    case 8:
                        return IN;
                    case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        return ARRAY_CONTAINS_ANY;
                    case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        return NOT_IN;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.d0.c
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f8243e;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            com.google.protobuf.a0.R(f.class, fVar);
        }

        private f() {
        }

        public static f X() {
            return DEFAULT_INSTANCE;
        }

        public static a b0() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(b bVar) {
            this.op_ = bVar.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(x xVar) {
            xVar.getClass();
            this.value_ = xVar;
        }

        public g Y() {
            g gVar = this.field_;
            return gVar == null ? g.V() : gVar;
        }

        public b Z() {
            b d5 = b.d(this.op_);
            return d5 == null ? b.UNRECOGNIZED : d5;
        }

        public x a0() {
            x xVar = this.value_;
            return xVar == null ? x.i0() : xVar;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new f();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003\t", new Object[]{"field_", "op_", "value_"});
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

    public static final class g extends com.google.protobuf.a0<g, a> implements w0 {
        private static final g DEFAULT_INSTANCE;
        public static final int FIELD_PATH_FIELD_NUMBER = 2;
        private static volatile f1<g> PARSER;
        private String fieldPath_ = "";

        public static final class a extends a0.a<g, a> implements w0 {
            private a() {
                super(g.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(String str) {
                v();
                ((g) this.f2777f).Y(str);
                return this;
            }
        }

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            com.google.protobuf.a0.R(g.class, gVar);
        }

        private g() {
        }

        public static g V() {
            return DEFAULT_INSTANCE;
        }

        public static a X() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Y(String str) {
            str.getClass();
            this.fieldPath_ = str;
        }

        public String W() {
            return this.fieldPath_;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new g();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002Ȉ", new Object[]{"fieldPath_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<g> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (g.class) {
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

    public static final class h extends com.google.protobuf.a0<h, a> implements w0 {
        public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
        private static final h DEFAULT_INSTANCE;
        public static final int FIELD_FILTER_FIELD_NUMBER = 2;
        private static volatile f1<h> PARSER = null;
        public static final int UNARY_FILTER_FIELD_NUMBER = 3;
        private int filterTypeCase_ = 0;
        private Object filterType_;

        public static final class a extends a0.a<h, a> implements w0 {
            private a() {
                super(h.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(d.a aVar) {
                v();
                ((h) this.f2777f).d0(aVar.t());
                return this;
            }

            public a D(f.a aVar) {
                v();
                ((h) this.f2777f).e0(aVar.t());
                return this;
            }

            public a E(k.a aVar) {
                v();
                ((h) this.f2777f).f0(aVar.t());
                return this;
            }
        }

        public enum b {
            COMPOSITE_FILTER(1),
            FIELD_FILTER(2),
            UNARY_FILTER(3),
            FILTERTYPE_NOT_SET(0);


            /* renamed from: e, reason: collision with root package name */
            private final int f8249e;

            b(int r32) {
                this.f8249e = r32;
            }

            public static b d(int r12) {
                if (r12 == 0) {
                    return FILTERTYPE_NOT_SET;
                }
                if (r12 == 1) {
                    return COMPOSITE_FILTER;
                }
                if (r12 == 2) {
                    return FIELD_FILTER;
                }
                if (r12 != 3) {
                    return null;
                }
                return UNARY_FILTER;
            }
        }

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            com.google.protobuf.a0.R(h.class, hVar);
        }

        private h() {
        }

        public static h Y() {
            return DEFAULT_INSTANCE;
        }

        public static a c0() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d0(d dVar) {
            dVar.getClass();
            this.filterType_ = dVar;
            this.filterTypeCase_ = 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(f fVar) {
            fVar.getClass();
            this.filterType_ = fVar;
            this.filterTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f0(k kVar) {
            kVar.getClass();
            this.filterType_ = kVar;
            this.filterTypeCase_ = 3;
        }

        public d X() {
            return this.filterTypeCase_ == 1 ? (d) this.filterType_ : d.Y();
        }

        public f Z() {
            return this.filterTypeCase_ == 2 ? (f) this.filterType_ : f.X();
        }

        public b a0() {
            return b.d(this.filterTypeCase_);
        }

        public k b0() {
            return this.filterTypeCase_ == 3 ? (k) this.filterType_ : k.W();
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new h();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"filterType_", "filterTypeCase_", d.class, f.class, k.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<h> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (h.class) {
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

    public static final class i extends com.google.protobuf.a0<i, a> implements w0 {
        private static final i DEFAULT_INSTANCE;
        public static final int DIRECTION_FIELD_NUMBER = 2;
        public static final int FIELD_FIELD_NUMBER = 1;
        private static volatile f1<i> PARSER;
        private int direction_;
        private g field_;

        public static final class a extends a0.a<i, a> implements w0 {
            private a() {
                super(i.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(e eVar) {
                v();
                ((i) this.f2777f).Z(eVar);
                return this;
            }

            public a D(g gVar) {
                v();
                ((i) this.f2777f).a0(gVar);
                return this;
            }
        }

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            com.google.protobuf.a0.R(i.class, iVar);
        }

        private i() {
        }

        public static a Y() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void Z(e eVar) {
            this.direction_ = eVar.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(g gVar) {
            gVar.getClass();
            this.field_ = gVar;
        }

        public e W() {
            e d5 = e.d(this.direction_);
            return d5 == null ? e.UNRECOGNIZED : d5;
        }

        public g X() {
            g gVar = this.field_;
            return gVar == null ? g.V() : gVar;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new i();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\f", new Object[]{"field_", "direction_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<i> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (i.class) {
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

    public static final class j extends com.google.protobuf.a0<j, a> implements w0 {
        private static final j DEFAULT_INSTANCE;
        public static final int FIELDS_FIELD_NUMBER = 2;
        private static volatile f1<j> PARSER;
        private d0.i<g> fields_ = com.google.protobuf.a0.A();

        public static final class a extends a0.a<j, a> implements w0 {
            private a() {
                super(j.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }
        }

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            com.google.protobuf.a0.R(j.class, jVar);
        }

        private j() {
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new j();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"fields_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<j> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (j.class) {
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

    public static final class k extends com.google.protobuf.a0<k, a> implements w0 {
        private static final k DEFAULT_INSTANCE;
        public static final int FIELD_FIELD_NUMBER = 2;
        public static final int OP_FIELD_NUMBER = 1;
        private static volatile f1<k> PARSER;
        private int op_;
        private int operandTypeCase_ = 0;
        private Object operandType_;

        public static final class a extends a0.a<k, a> implements w0 {
            private a() {
                super(k.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(g gVar) {
                v();
                ((k) this.f2777f).a0(gVar);
                return this;
            }

            public a D(b bVar) {
                v();
                ((k) this.f2777f).b0(bVar);
                return this;
            }
        }

        public enum b implements d0.c {
            OPERATOR_UNSPECIFIED(0),
            IS_NAN(2),
            IS_NULL(3),
            IS_NOT_NAN(4),
            IS_NOT_NULL(5),
            UNRECOGNIZED(-1);


            /* renamed from: l, reason: collision with root package name */
            private static final d0.d<b> f8256l = new a();

            /* renamed from: e, reason: collision with root package name */
            private final int f8258e;

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
                this.f8258e = r32;
            }

            public static b d(int r12) {
                if (r12 == 0) {
                    return OPERATOR_UNSPECIFIED;
                }
                if (r12 == 2) {
                    return IS_NAN;
                }
                if (r12 == 3) {
                    return IS_NULL;
                }
                if (r12 == 4) {
                    return IS_NOT_NAN;
                }
                if (r12 != 5) {
                    return null;
                }
                return IS_NOT_NULL;
            }

            @Override // com.google.protobuf.d0.c
            public final int e() {
                if (this != UNRECOGNIZED) {
                    return this.f8258e;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            com.google.protobuf.a0.R(k.class, kVar);
        }

        private k() {
        }

        public static k W() {
            return DEFAULT_INSTANCE;
        }

        public static a Z() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(g gVar) {
            gVar.getClass();
            this.operandType_ = gVar;
            this.operandTypeCase_ = 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(b bVar) {
            this.op_ = bVar.e();
        }

        public g X() {
            return this.operandTypeCase_ == 2 ? (g) this.operandType_ : g.V();
        }

        public b Y() {
            b d5 = b.d(this.op_);
            return d5 == null ? b.UNRECOGNIZED : d5;
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8215a[fVar.ordinal()]) {
                case 1:
                    return new k();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002<\u0000", new Object[]{"operandType_", "operandTypeCase_", "op_", g.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    f1<k> f1Var = PARSER;
                    if (f1Var == null) {
                        synchronized (k.class) {
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
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        com.google.protobuf.a0.R(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(c cVar) {
        cVar.getClass();
        c0();
        this.from_.add(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(i iVar) {
        iVar.getClass();
        d0();
        this.orderBy_.add(iVar);
    }

    private void c0() {
        d0.i<c> iVar = this.from_;
        if (iVar.n()) {
            return;
        }
        this.from_ = com.google.protobuf.a0.H(iVar);
    }

    private void d0() {
        d0.i<i> iVar = this.orderBy_;
        if (iVar.n()) {
            return;
        }
        this.orderBy_ = com.google.protobuf.a0.H(iVar);
    }

    public static t e0() {
        return DEFAULT_INSTANCE;
    }

    public static b r0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(x1.g gVar) {
        gVar.getClass();
        this.endAt_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(com.google.protobuf.b0 b0Var) {
        b0Var.getClass();
        this.limit_ = b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(x1.g gVar) {
        gVar.getClass();
        this.startAt_ = gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(h hVar) {
        hVar.getClass();
        this.where_ = hVar;
    }

    public x1.g f0() {
        x1.g gVar = this.endAt_;
        return gVar == null ? x1.g.Z() : gVar;
    }

    public c g0(int r22) {
        return this.from_.get(r22);
    }

    public int h0() {
        return this.from_.size();
    }

    public com.google.protobuf.b0 i0() {
        com.google.protobuf.b0 b0Var = this.limit_;
        return b0Var == null ? com.google.protobuf.b0.V() : b0Var;
    }

    public i j0(int r22) {
        return this.orderBy_.get(r22);
    }

    public int k0() {
        return this.orderBy_.size();
    }

    public x1.g l0() {
        x1.g gVar = this.startAt_;
        return gVar == null ? x1.g.Z() : gVar;
    }

    public h m0() {
        h hVar = this.where_;
        return hVar == null ? h.Y() : hVar;
    }

    public boolean n0() {
        return this.endAt_ != null;
    }

    public boolean o0() {
        return this.limit_ != null;
    }

    public boolean p0() {
        return this.startAt_ != null;
    }

    public boolean q0() {
        return this.where_ != null;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8215a[fVar.ordinal()]) {
            case 1:
                return new t();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\b\t", new Object[]{"select_", "from_", c.class, "where_", "orderBy_", i.class, "limit_", "offset_", "startAt_", "endAt_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<t> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (t.class) {
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
