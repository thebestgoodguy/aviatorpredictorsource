package n1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.j;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import x1.u;

/* loaded from: classes.dex */
public final class c extends a0<c, b> implements w0 {
    private static final c DEFAULT_INSTANCE;
    public static final int DOCUMENTS_FIELD_NUMBER = 6;
    public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
    public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
    private static volatile f1<c> PARSER = null;
    public static final int QUERY_FIELD_NUMBER = 5;
    public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
    public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
    public static final int TARGET_ID_FIELD_NUMBER = 1;
    private t1 lastLimboFreeSnapshotVersion_;
    private long lastListenSequenceNumber_;
    private t1 snapshotVersion_;
    private int targetId_;
    private Object targetType_;
    private int targetTypeCase_ = 0;
    private j resumeToken_ = j.f2914f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6678a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f6678a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6678a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6678a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6678a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6678a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6678a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6678a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<c, b> implements w0 {
        private b() {
            super(c.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B() {
            v();
            ((c) this.f2777f).c0();
            return this;
        }

        public b D(u.c cVar) {
            v();
            ((c) this.f2777f).n0(cVar);
            return this;
        }

        public b E(t1 t1Var) {
            v();
            ((c) this.f2777f).o0(t1Var);
            return this;
        }

        public b F(long j4) {
            v();
            ((c) this.f2777f).p0(j4);
            return this;
        }

        public b G(u.d dVar) {
            v();
            ((c) this.f2777f).q0(dVar);
            return this;
        }

        public b H(j jVar) {
            v();
            ((c) this.f2777f).r0(jVar);
            return this;
        }

        public b I(t1 t1Var) {
            v();
            ((c) this.f2777f).s0(t1Var);
            return this;
        }

        public b J(int r22) {
            v();
            ((c) this.f2777f).t0(r22);
            return this;
        }
    }

    /* renamed from: n1.c$c, reason: collision with other inner class name */
    public enum EnumC0070c {
        QUERY(5),
        DOCUMENTS(6),
        TARGETTYPE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f6683e;

        EnumC0070c(int r32) {
            this.f6683e = r32;
        }

        public static EnumC0070c d(int r12) {
            if (r12 == 0) {
                return TARGETTYPE_NOT_SET;
            }
            if (r12 == 5) {
                return QUERY;
            }
            if (r12 != 6) {
                return null;
            }
            return DOCUMENTS;
        }
    }

    static {
        c cVar = new c();
        DEFAULT_INSTANCE = cVar;
        a0.R(c.class, cVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        this.lastLimboFreeSnapshotVersion_ = null;
    }

    public static b l0() {
        return DEFAULT_INSTANCE.u();
    }

    public static c m0(byte[] bArr) {
        return (c) a0.N(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(u.c cVar) {
        cVar.getClass();
        this.targetType_ = cVar;
        this.targetTypeCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o0(t1 t1Var) {
        t1Var.getClass();
        this.lastLimboFreeSnapshotVersion_ = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(long j4) {
        this.lastListenSequenceNumber_ = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q0(u.d dVar) {
        dVar.getClass();
        this.targetType_ = dVar;
        this.targetTypeCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(j jVar) {
        jVar.getClass();
        this.resumeToken_ = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(t1 t1Var) {
        t1Var.getClass();
        this.snapshotVersion_ = t1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(int r12) {
        this.targetId_ = r12;
    }

    public u.c d0() {
        return this.targetTypeCase_ == 6 ? (u.c) this.targetType_ : u.c.X();
    }

    public t1 e0() {
        t1 t1Var = this.lastLimboFreeSnapshotVersion_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public long f0() {
        return this.lastListenSequenceNumber_;
    }

    public u.d g0() {
        return this.targetTypeCase_ == 5 ? (u.d) this.targetType_ : u.d.W();
    }

    public j h0() {
        return this.resumeToken_;
    }

    public t1 i0() {
        t1 t1Var = this.snapshotVersion_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public int j0() {
        return this.targetId_;
    }

    public EnumC0070c k0() {
        return EnumC0070c.d(this.targetTypeCase_);
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f6678a[fVar.ordinal()]) {
            case 1:
                return new c();
            case 2:
                return new b(aVar);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\n\u0004\u0002\u0005<\u0000\u0006<\u0000\u0007\t", new Object[]{"targetType_", "targetTypeCase_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", u.d.class, u.c.class, "lastLimboFreeSnapshotVersion_"});
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
