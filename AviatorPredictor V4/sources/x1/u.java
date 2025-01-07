package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import x1.t;

/* loaded from: classes.dex */
public final class u extends com.google.protobuf.a0<u, b> implements w0 {
    private static final u DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 3;
    public static final int ONCE_FIELD_NUMBER = 6;
    private static volatile f1<u> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 2;
    public static final int READ_TIME_FIELD_NUMBER = 11;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
    public static final int TARGET_ID_FIELD_NUMBER = 5;
    private boolean once_;
    private Object resumeType_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private int resumeTypeCase_ = 0;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8259a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8259a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8259a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8259a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8259a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8259a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8259a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8259a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<u, b> implements w0 {
        private b() {
            super(u.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(c cVar) {
            v();
            ((u) this.f2777f).a0(cVar);
            return this;
        }

        public b D(d dVar) {
            v();
            ((u) this.f2777f).b0(dVar);
            return this;
        }

        public b E(t1 t1Var) {
            v();
            ((u) this.f2777f).c0(t1Var);
            return this;
        }

        public b F(com.google.protobuf.j jVar) {
            v();
            ((u) this.f2777f).d0(jVar);
            return this;
        }

        public b G(int r22) {
            v();
            ((u) this.f2777f).e0(r22);
            return this;
        }
    }

    public static final class c extends com.google.protobuf.a0<c, a> implements w0 {
        private static final c DEFAULT_INSTANCE;
        public static final int DOCUMENTS_FIELD_NUMBER = 2;
        private static volatile f1<c> PARSER;
        private d0.i<String> documents_ = com.google.protobuf.a0.A();

        public static final class a extends a0.a<c, a> implements w0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(String str) {
                v();
                ((c) this.f2777f).V(str);
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

        /* JADX INFO: Access modifiers changed from: private */
        public void V(String str) {
            str.getClass();
            W();
            this.documents_.add(str);
        }

        private void W() {
            d0.i<String> iVar = this.documents_;
            if (iVar.n()) {
                return;
            }
            this.documents_ = com.google.protobuf.a0.H(iVar);
        }

        public static c X() {
            return DEFAULT_INSTANCE;
        }

        public static a a0() {
            return DEFAULT_INSTANCE.u();
        }

        public String Y(int r22) {
            return this.documents_.get(r22);
        }

        public int Z() {
            return this.documents_.size();
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8259a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002Ț", new Object[]{"documents_"});
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
        public static final int PARENT_FIELD_NUMBER = 1;
        private static volatile f1<d> PARSER = null;
        public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
        private Object queryType_;
        private int queryTypeCase_ = 0;
        private String parent_ = "";

        public static final class a extends a0.a<d, a> implements w0 {
            private a() {
                super(d.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(String str) {
                v();
                ((d) this.f2777f).a0(str);
                return this;
            }

            public a D(t.b bVar) {
                v();
                ((d) this.f2777f).b0(bVar.t());
                return this;
            }
        }

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            com.google.protobuf.a0.R(d.class, dVar);
        }

        private d() {
        }

        public static d W() {
            return DEFAULT_INSTANCE;
        }

        public static a Z() {
            return DEFAULT_INSTANCE.u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a0(String str) {
            str.getClass();
            this.parent_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b0(t tVar) {
            tVar.getClass();
            this.queryType_ = tVar;
            this.queryTypeCase_ = 2;
        }

        public String X() {
            return this.parent_;
        }

        public t Y() {
            return this.queryTypeCase_ == 2 ? (t) this.queryType_ : t.e0();
        }

        @Override // com.google.protobuf.a0
        protected final Object y(a0.f fVar, Object obj, Object obj2) {
            a aVar = null;
            switch (a.f8259a[fVar.ordinal()]) {
                case 1:
                    return new d();
                case 2:
                    return new a(aVar);
                case 3:
                    return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"queryType_", "queryTypeCase_", "parent_", t.class});
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

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        com.google.protobuf.a0.R(u.class, uVar);
    }

    private u() {
    }

    public static b Z() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(t1 t1Var) {
        t1Var.getClass();
        this.resumeType_ = t1Var;
        this.resumeTypeCase_ = 11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(com.google.protobuf.j jVar) {
        jVar.getClass();
        this.resumeTypeCase_ = 4;
        this.resumeType_ = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int r12) {
        this.targetId_ = r12;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8259a[fVar.ordinal()]) {
            case 1:
                return new u();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001", new Object[]{"targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", d.class, c.class, "targetId_", "once_", t1.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<u> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (u.class) {
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
