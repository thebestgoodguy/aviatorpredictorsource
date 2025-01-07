package x1;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.w0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class r extends com.google.protobuf.a0<r, b> implements w0 {
    private static final r DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile f1<r> PARSER;
    private p0<String, x> fields_ = p0.d();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8207a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8207a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8207a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8207a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8207a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8207a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8207a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8207a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<r, b> implements w0 {
        private b() {
            super(r.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public boolean B(String str) {
            str.getClass();
            return ((r) this.f2777f).X().containsKey(str);
        }

        public b D(Map<String, x> map) {
            v();
            ((r) this.f2777f).a0().putAll(map);
            return this;
        }

        public b E(String str, x xVar) {
            str.getClass();
            xVar.getClass();
            v();
            ((r) this.f2777f).a0().put(str, xVar);
            return this;
        }

        public b F(String str) {
            str.getClass();
            v();
            ((r) this.f2777f).a0().remove(str);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final o0<String, x> f8208a = o0.d(b2.b.f2810o, "", b2.b.f2812q, x.i0());
    }

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        com.google.protobuf.a0.R(r.class, rVar);
    }

    private r() {
    }

    public static r V() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, x> a0() {
        return c0();
    }

    private p0<String, x> b0() {
        return this.fields_;
    }

    private p0<String, x> c0() {
        if (!this.fields_.h()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public static b d0() {
        return DEFAULT_INSTANCE.u();
    }

    public int W() {
        return b0().size();
    }

    public Map<String, x> X() {
        return Collections.unmodifiableMap(b0());
    }

    public x Y(String str, x xVar) {
        str.getClass();
        p0<String, x> b02 = b0();
        return b02.containsKey(str) ? b02.get(str) : xVar;
    }

    public x Z(String str) {
        str.getClass();
        p0<String, x> b02 = b0();
        if (b02.containsKey(str)) {
            return b02.get(str);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8207a[fVar.ordinal()]) {
            case 1:
                return new r();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", c.f8208a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<r> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (r.class) {
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
