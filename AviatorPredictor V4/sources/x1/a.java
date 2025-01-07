package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends com.google.protobuf.a0<a, b> implements x1.b {
    private static final a DEFAULT_INSTANCE;
    private static volatile f1<a> PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private d0.i<x> values_ = com.google.protobuf.a0.A();

    /* renamed from: x1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0104a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8156a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8156a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8156a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8156a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8156a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8156a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8156a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8156a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<a, b> implements x1.b {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0104a c0104a) {
            this();
        }

        public b B(Iterable<? extends x> iterable) {
            v();
            ((a) this.f2777f).X(iterable);
            return this;
        }

        public b D(x xVar) {
            v();
            ((a) this.f2777f).Y(xVar);
            return this;
        }

        public x E(int r22) {
            return ((a) this.f2777f).b0(r22);
        }

        public int F() {
            return ((a) this.f2777f).c0();
        }

        public b G(int r22) {
            v();
            ((a) this.f2777f).e0(r22);
            return this;
        }

        @Override // x1.b
        public List<x> k() {
            return Collections.unmodifiableList(((a) this.f2777f).k());
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        com.google.protobuf.a0.R(a.class, aVar);
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X(Iterable<? extends x> iterable) {
        Z();
        com.google.protobuf.a.i(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y(x xVar) {
        xVar.getClass();
        Z();
        this.values_.add(xVar);
    }

    private void Z() {
        d0.i<x> iVar = this.values_;
        if (iVar.n()) {
            return;
        }
        this.values_ = com.google.protobuf.a0.H(iVar);
    }

    public static a a0() {
        return DEFAULT_INSTANCE;
    }

    public static b d0() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(int r22) {
        Z();
        this.values_.remove(r22);
    }

    public x b0(int r22) {
        return this.values_.get(r22);
    }

    public int c0() {
        return this.values_.size();
    }

    @Override // x1.b
    public List<x> k() {
        return this.values_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        C0104a c0104a = null;
        switch (C0104a.f8156a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0104a);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", x.class});
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
