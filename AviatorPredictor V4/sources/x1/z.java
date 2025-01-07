package x1;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class z extends com.google.protobuf.a0<z, b> implements w0 {
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final z DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 5;
    private static volatile f1<z> PARSER = null;
    public static final int STREAM_ID_FIELD_NUMBER = 2;
    public static final int STREAM_TOKEN_FIELD_NUMBER = 4;
    public static final int WRITES_FIELD_NUMBER = 3;
    private p0<String, String> labels_ = p0.d();
    private String database_ = "";
    private String streamId_ = "";
    private d0.i<y> writes_ = com.google.protobuf.a0.A();
    private com.google.protobuf.j streamToken_ = com.google.protobuf.j.f2914f;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8294a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8294a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8294a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8294a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8294a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8294a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8294a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8294a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<z, b> implements w0 {
        private b() {
            super(z.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(y yVar) {
            v();
            ((z) this.f2777f).X(yVar);
            return this;
        }

        public b D(String str) {
            v();
            ((z) this.f2777f).b0(str);
            return this;
        }

        public b E(com.google.protobuf.j jVar) {
            v();
            ((z) this.f2777f).c0(jVar);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final o0<String, String> f8295a;

        static {
            b2.b bVar = b2.b.f2810o;
            f8295a = o0.d(bVar, "", bVar, "");
        }
    }

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.protobuf.a0.R(z.class, zVar);
    }

    private z() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(y yVar) {
        yVar.getClass();
        Y();
        this.writes_.add(yVar);
    }

    private void Y() {
        d0.i<y> iVar = this.writes_;
        if (iVar.n()) {
            return;
        }
        this.writes_ = com.google.protobuf.a0.H(iVar);
    }

    public static z Z() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(com.google.protobuf.j jVar) {
        jVar.getClass();
        this.streamToken_ = jVar;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8294a[fVar.ordinal()]) {
            case 1:
                return new z();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0001\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\n\u00052", new Object[]{"database_", "streamId_", "writes_", y.class, "streamToken_", "labels_", c.f8295a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<z> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (z.class) {
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
