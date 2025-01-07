package a2;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.e;
import com.google.protobuf.f1;
import com.google.protobuf.w0;

/* loaded from: classes.dex */
public final class a extends a0<a, b> implements w0 {
    public static final int CODE_FIELD_NUMBER = 1;
    private static final a DEFAULT_INSTANCE;
    public static final int DETAILS_FIELD_NUMBER = 3;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile f1<a> PARSER;
    private int code_;
    private String message_ = "";
    private d0.i<e> details_ = a0.A();

    /* renamed from: a2.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0001a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f148a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f148a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f148a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f148a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f148a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f148a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f148a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f148a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0001a c0001a) {
            this();
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        a0.R(a.class, aVar);
    }

    private a() {
    }

    public static a V() {
        return DEFAULT_INSTANCE;
    }

    public int U() {
        return this.code_;
    }

    public String W() {
        return this.message_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        C0001a c0001a = null;
        switch (C0001a.f148a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0001a);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003\u001b", new Object[]{"code_", "message_", "details_", e.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<a> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (a.class) {
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
