package x1;

import com.google.protobuf.a0;
import com.google.protobuf.d0;
import com.google.protobuf.f1;
import com.google.protobuf.w0;
import java.util.List;
import x1.m;

/* loaded from: classes.dex */
public final class y extends com.google.protobuf.a0<y, b> implements w0 {
    public static final int CURRENT_DOCUMENT_FIELD_NUMBER = 4;
    private static final y DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 2;
    private static volatile f1<y> PARSER = null;
    public static final int TRANSFORM_FIELD_NUMBER = 6;
    public static final int UPDATE_FIELD_NUMBER = 1;
    public static final int UPDATE_MASK_FIELD_NUMBER = 3;
    public static final int UPDATE_TRANSFORMS_FIELD_NUMBER = 7;
    public static final int VERIFY_FIELD_NUMBER = 5;
    private s currentDocument_;
    private Object operation_;
    private k updateMask_;
    private int operationCase_ = 0;
    private d0.i<m.c> updateTransforms_ = com.google.protobuf.a0.A();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8286a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f8286a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8286a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8286a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8286a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8286a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8286a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8286a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<y, b> implements w0 {
        private b() {
            super(y.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(m.c cVar) {
            v();
            ((y) this.f2777f).a0(cVar);
            return this;
        }

        public b D(s sVar) {
            v();
            ((y) this.f2777f).r0(sVar);
            return this;
        }

        public b E(String str) {
            v();
            ((y) this.f2777f).s0(str);
            return this;
        }

        public b F(h hVar) {
            v();
            ((y) this.f2777f).t0(hVar);
            return this;
        }

        public b G(k kVar) {
            v();
            ((y) this.f2777f).u0(kVar);
            return this;
        }

        public b H(String str) {
            v();
            ((y) this.f2777f).v0(str);
            return this;
        }
    }

    public enum c {
        UPDATE(1),
        DELETE(2),
        VERIFY(5),
        TRANSFORM(6),
        OPERATION_NOT_SET(0);


        /* renamed from: e, reason: collision with root package name */
        private final int f8293e;

        c(int r32) {
            this.f8293e = r32;
        }

        public static c d(int r12) {
            if (r12 == 0) {
                return OPERATION_NOT_SET;
            }
            if (r12 == 1) {
                return UPDATE;
            }
            if (r12 == 2) {
                return DELETE;
            }
            if (r12 == 5) {
                return VERIFY;
            }
            if (r12 != 6) {
                return null;
            }
            return TRANSFORM;
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.protobuf.a0.R(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(m.c cVar) {
        cVar.getClass();
        b0();
        this.updateTransforms_.add(cVar);
    }

    private void b0() {
        d0.i<m.c> iVar = this.updateTransforms_;
        if (iVar.n()) {
            return;
        }
        this.updateTransforms_ = com.google.protobuf.a0.H(iVar);
    }

    public static b o0() {
        return DEFAULT_INSTANCE.u();
    }

    public static b p0(y yVar) {
        return DEFAULT_INSTANCE.v(yVar);
    }

    public static y q0(byte[] bArr) {
        return (y) com.google.protobuf.a0.N(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0(s sVar) {
        sVar.getClass();
        this.currentDocument_ = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s0(String str) {
        str.getClass();
        this.operationCase_ = 2;
        this.operation_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0(h hVar) {
        hVar.getClass();
        this.operation_ = hVar;
        this.operationCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0(k kVar) {
        kVar.getClass();
        this.updateMask_ = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0(String str) {
        str.getClass();
        this.operationCase_ = 5;
        this.operation_ = str;
    }

    public s c0() {
        s sVar = this.currentDocument_;
        return sVar == null ? s.X() : sVar;
    }

    public String d0() {
        return this.operationCase_ == 2 ? (String) this.operation_ : "";
    }

    public c e0() {
        return c.d(this.operationCase_);
    }

    public m f0() {
        return this.operationCase_ == 6 ? (m) this.operation_ : m.U();
    }

    public h g0() {
        return this.operationCase_ == 1 ? (h) this.operation_ : h.X();
    }

    public k h0() {
        k kVar = this.updateMask_;
        return kVar == null ? k.X() : kVar;
    }

    public List<m.c> i0() {
        return this.updateTransforms_;
    }

    public String j0() {
        return this.operationCase_ == 5 ? (String) this.operation_ : "";
    }

    public boolean k0() {
        return this.currentDocument_ != null;
    }

    public boolean l0() {
        return this.operationCase_ == 6;
    }

    public boolean m0() {
        return this.operationCase_ == 1;
    }

    public boolean n0() {
        return this.updateMask_ != null;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f8286a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(aVar);
            case 3:
                return com.google.protobuf.a0.J(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002Ȼ\u0000\u0003\t\u0004\t\u0005Ȼ\u0000\u0006<\u0000\u0007\u001b", new Object[]{"operation_", "operationCase_", h.class, "updateMask_", "currentDocument_", m.class, "updateTransforms_", m.c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<y> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (y.class) {
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
