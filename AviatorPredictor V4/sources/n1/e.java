package n1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.j;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import x1.y;

/* loaded from: classes.dex */
public final class e extends a0<e, b> implements w0 {
    public static final int BASE_WRITES_FIELD_NUMBER = 4;
    public static final int BATCH_ID_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
    private static volatile f1<e> PARSER = null;
    public static final int WRITES_FIELD_NUMBER = 2;
    private int batchId_;
    private t1 localWriteTime_;
    private d0.i<y> writes_ = a0.A();
    private d0.i<y> baseWrites_ = a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6685a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f6685a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6685a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6685a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6685a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6685a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6685a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6685a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<e, b> implements w0 {
        private b() {
            super(e.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(y yVar) {
            v();
            ((e) this.f2777f).Y(yVar);
            return this;
        }

        public b D(y yVar) {
            v();
            ((e) this.f2777f).Z(yVar);
            return this;
        }

        public b E(int r22) {
            v();
            ((e) this.f2777f).l0(r22);
            return this;
        }

        public b F(t1 t1Var) {
            v();
            ((e) this.f2777f).m0(t1Var);
            return this;
        }
    }

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        a0.R(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(y yVar) {
        yVar.getClass();
        a0();
        this.baseWrites_.add(yVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z(y yVar) {
        yVar.getClass();
        b0();
        this.writes_.add(yVar);
    }

    private void a0() {
        d0.i<y> iVar = this.baseWrites_;
        if (iVar.n()) {
            return;
        }
        this.baseWrites_ = a0.H(iVar);
    }

    private void b0() {
        d0.i<y> iVar = this.writes_;
        if (iVar.n()) {
            return;
        }
        this.writes_ = a0.H(iVar);
    }

    public static b i0() {
        return DEFAULT_INSTANCE.u();
    }

    public static e j0(j jVar) {
        return (e) a0.L(DEFAULT_INSTANCE, jVar);
    }

    public static e k0(byte[] bArr) {
        return (e) a0.N(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(int r12) {
        this.batchId_ = r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(t1 t1Var) {
        t1Var.getClass();
        this.localWriteTime_ = t1Var;
    }

    public y c0(int r22) {
        return this.baseWrites_.get(r22);
    }

    public int d0() {
        return this.baseWrites_.size();
    }

    public int e0() {
        return this.batchId_;
    }

    public t1 f0() {
        t1 t1Var = this.localWriteTime_;
        return t1Var == null ? t1.W() : t1Var;
    }

    public y g0(int r22) {
        return this.writes_.get(r22);
    }

    public int h0() {
        return this.writes_.size();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f6685a[fVar.ordinal()]) {
            case 1:
                return new e();
            case 2:
                return new b(aVar);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b", new Object[]{"batchId_", "writes_", y.class, "localWriteTime_", "baseWrites_", y.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<e> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (e.class) {
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
