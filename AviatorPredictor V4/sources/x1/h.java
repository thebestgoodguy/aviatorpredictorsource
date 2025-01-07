package x1;

import com.google.protobuf.a0;
import com.google.protobuf.b2;
import com.google.protobuf.f1;
import com.google.protobuf.o0;
import com.google.protobuf.p0;
import com.google.protobuf.t1;
import com.google.protobuf.w0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class h extends com.google.protobuf.a0<h, b> implements w0 {
    public static final int CREATE_TIME_FIELD_NUMBER = 3;
    private static final h DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile f1<h> PARSER = null;
    public static final int UPDATE_TIME_FIELD_NUMBER = 4;
    private t1 createTime_;
    private p0<String, x> fields_ = p0.d();
    private String name_ = "";
    private t1 updateTime_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8169a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8169a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8169a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8169a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8169a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8169a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8169a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8169a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<h, b> implements w0 {
        private b() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(Map<String, x> map) {
            v();
            ((h) this.f2777f).Z().putAll(map);
            return this;
        }

        public b D(String str) {
            v();
            ((h) this.f2777f).f0(str);
            return this;
        }

        public b E(t1 t1Var) {
            v();
            ((h) this.f2777f).g0(t1Var);
            return this;
        }
    }

    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final o0<String, x> f8170a = o0.d(b2.b.f2810o, "", b2.b.f2812q, x.i0());
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        com.google.protobuf.a0.R(h.class, hVar);
    }

    private h() {
    }

    public static h X() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, x> Z() {
        return d0();
    }

    private p0<String, x> c0() {
        return this.fields_;
    }

    private p0<String, x> d0() {
        if (!this.fields_.h()) {
            this.fields_ = this.fields_.l();
        }
        return this.fields_;
    }

    public static b e0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(t1 t1Var) {
        t1Var.getClass();
        this.updateTime_ = t1Var;
    }

    public Map<String, x> Y() {
        return Collections.unmodifiableMap(c0());
    }

    public String a0() {
        return this.name_;
    }

    public t1 b0() {
        t1 t1Var = this.updateTime_;
        return t1Var == null ? t1.W() : t1Var;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8169a[fVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001Ȉ\u00022\u0003\t\u0004\t", new Object[]{"name_", "fields_", c.f8170a, "createTime_", "updateTime_"});
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
