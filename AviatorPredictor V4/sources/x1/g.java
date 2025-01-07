package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends com.google.protobuf.a0<g, b> implements w0 {
    public static final int BEFORE_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    private static volatile f1<g> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private boolean before_;
    private d0.i<x> values_ = com.google.protobuf.a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8168a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8168a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8168a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8168a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8168a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8168a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8168a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8168a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<g, b> implements w0 {
        private b() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(Iterable<? extends x> iterable) {
            v();
            ((g) this.f2777f).W(iterable);
            return this;
        }

        public b D(boolean z4) {
            v();
            ((g) this.f2777f).b0(z4);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void W(Iterable<? extends x> iterable) {
        X();
        com.google.protobuf.a.i(iterable, this.values_);
    }

    private void X() {
        d0.i<x> iVar = this.values_;
        if (iVar.n()) {
            return;
        }
        this.values_ = com.google.protobuf.a0.H(iVar);
    }

    public static g Z() {
        return DEFAULT_INSTANCE;
    }

    public static b a0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(boolean z4) {
        this.before_ = z4;
    }

    public boolean Y() {
        return this.before_;
    }

    public List<x> k() {
        return this.values_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8168a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"values_", x.class, "before_"});
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
