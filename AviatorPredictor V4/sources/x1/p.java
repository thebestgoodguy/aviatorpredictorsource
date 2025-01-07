package x1;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends com.google.protobuf.a0<p, b> implements w0 {
    public static final int ADD_TARGET_FIELD_NUMBER = 2;
    public static final int DATABASE_FIELD_NUMBER = 1;
    private static final p DEFAULT_INSTANCE;
    public static final int LABELS_FIELD_NUMBER = 4;
    private static volatile f1<p> PARSER = null;
    public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
    private Object targetChange_;
    private int targetChangeCase_ = 0;
    private p0<String, String> labels_ = p0.d();
    private String database_ = "";

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8196a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8196a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8196a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8196a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8196a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8196a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8196a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8196a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<p, b> implements w0 {
        private b() {
            super(p.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(Map<String, String> map) {
            v();
            ((p) this.f2777f).Z().putAll(map);
            return this;
        }

        public b D(u uVar) {
            v();
            ((p) this.f2777f).c0(uVar);
            return this;
        }

        public b E(String str) {
            v();
            ((p) this.f2777f).d0(str);
            return this;
        }

        public b F(int r22) {
            v();
            ((p) this.f2777f).e0(r22);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final o0<String, String> f8197a;

        static {
            b2.b bVar = b2.b.f2810o;
            f8197a = o0.d(bVar, "", bVar, "");
        }
    }

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        com.google.protobuf.a0.R(p.class, pVar);
    }

    private p() {
    }

    public static p Y() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> Z() {
        return a0();
    }

    private p0<String, String> a0() {
        if (!this.labels_.h()) {
            this.labels_ = this.labels_.l();
        }
        return this.labels_;
    }

    public static b b0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(u uVar) {
        uVar.getClass();
        this.targetChange_ = uVar;
        this.targetChangeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(String str) {
        str.getClass();
        this.database_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int r22) {
        this.targetChangeCase_ = 3;
        this.targetChange_ = Integer.valueOf(r22);
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8196a[fVar.ordinal()]) {
            case 1:
                return new p();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u0002<\u0000\u00037\u0000\u00042", new Object[]{"targetChange_", "targetChangeCase_", "database_", u.class, "labels_", c.f8197a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<p> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (p.class) {
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
