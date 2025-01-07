package n1;

import com.google.protobuf.a0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import x1.h;

/* loaded from: classes.dex */
public final class a extends a0<a, b> implements w0 {
    private static final a DEFAULT_INSTANCE;
    public static final int DOCUMENT_FIELD_NUMBER = 2;
    public static final int HAS_COMMITTED_MUTATIONS_FIELD_NUMBER = 4;
    public static final int NO_DOCUMENT_FIELD_NUMBER = 1;
    private static volatile f1<a> PARSER = null;
    public static final int UNKNOWN_DOCUMENT_FIELD_NUMBER = 3;
    private int documentTypeCase_ = 0;
    private Object documentType_;
    private boolean hasCommittedMutations_;

    /* renamed from: n1.a$a, reason: collision with other inner class name */
    static /* synthetic */ class C0068a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6670a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f6670a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6670a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6670a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6670a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6670a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6670a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6670a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<a, b> implements w0 {
        private b() {
            super(a.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(C0068a c0068a) {
            this();
        }

        public b B(h hVar) {
            v();
            ((a) this.f2777f).f0(hVar);
            return this;
        }

        public b D(boolean z4) {
            v();
            ((a) this.f2777f).g0(z4);
            return this;
        }

        public b E(n1.b bVar) {
            v();
            ((a) this.f2777f).h0(bVar);
            return this;
        }

        public b F(d dVar) {
            v();
            ((a) this.f2777f).i0(dVar);
            return this;
        }
    }

    public enum c {
        NO_DOCUMENT(1),
        DOCUMENT(2),
        UNKNOWN_DOCUMENT(3),
        DOCUMENTTYPE_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f6676e;

        c(int r32) {
            this.f6676e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return DOCUMENTTYPE_NOT_SET;
            }
            if (r12 == 1) {
                return NO_DOCUMENT;
            }
            if (r12 == 2) {
                return DOCUMENT;
            }
            if (r12 != 3) {
                return null;
            }
            return UNKNOWN_DOCUMENT;
        }
    }

    static {
        a aVar = new a();
        DEFAULT_INSTANCE = aVar;
        a0.R(a.class, aVar);
    }

    private a() {
    }

    public static b d0() {
        return DEFAULT_INSTANCE.u();
    }

    public static a e0(byte[] bArr) {
        return (a) a0.N(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(h hVar) {
        hVar.getClass();
        this.documentType_ = hVar;
        this.documentTypeCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(boolean z4) {
        this.hasCommittedMutations_ = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(n1.b bVar) {
        bVar.getClass();
        this.documentType_ = bVar;
        this.documentTypeCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(d dVar) {
        dVar.getClass();
        this.documentType_ = dVar;
        this.documentTypeCase_ = 3;
    }

    public h Y() {
        return this.documentTypeCase_ == 2 ? (h) this.documentType_ : h.X();
    }

    public c Z() {
        return c.d(this.documentTypeCase_);
    }

    public boolean a0() {
        return this.hasCommittedMutations_;
    }

    public n1.b b0() {
        return this.documentTypeCase_ == 1 ? (n1.b) this.documentType_ : n1.b.W();
    }

    public d c0() {
        return this.documentTypeCase_ == 3 ? (d) this.documentType_ : d.W();
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        C0068a c0068a = null;
        switch (C0068a.f6670a[fVar.ordinal()]) {
            case 1:
                return new a();
            case 2:
                return new b(c0068a);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007", new Object[]{"documentType_", "documentTypeCase_", n1.b.class, h.class, d.class, "hasCommittedMutations_"});
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
