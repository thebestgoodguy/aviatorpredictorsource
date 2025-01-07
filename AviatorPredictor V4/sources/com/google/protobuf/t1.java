package com.google.protobuf;

import com.google.protobuf.a0;

/* loaded from: classes.dex */
public final class t1 extends a0<t1, b> implements w0 {
    private static final t1 DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile f1<t1> PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3079a;

        static {
            int[] r02 = new int[a0.f.values().length];
            f3079a = r02;
            try {
                r02[a0.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3079a[a0.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3079a[a0.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3079a[a0.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3079a[a0.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3079a[a0.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3079a[a0.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class b extends a0.a<t1, b> implements w0 {
        private b() {
            super(t1.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(int r22) {
            v();
            ((t1) this.f2777f).a0(r22);
            return this;
        }

        public b D(long j4) {
            v();
            ((t1) this.f2777f).b0(j4);
            return this;
        }
    }

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        a0.R(t1.class, t1Var);
    }

    private t1() {
    }

    public static t1 W() {
        return DEFAULT_INSTANCE;
    }

    public static b Z() {
        return DEFAULT_INSTANCE.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0(int r12) {
        this.nanos_ = r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0(long j4) {
        this.seconds_ = j4;
    }

    public int X() {
        return this.nanos_;
    }

    public long Y() {
        return this.seconds_;
    }

    @Override // com.google.protobuf.a0
    protected final Object y(a0.f fVar, Object obj, Object obj2) {
        a aVar = null;
        switch (a.f3079a[fVar.ordinal()]) {
            case 1:
                return new t1();
            case 2:
                return new b(aVar);
            case 3:
                return a0.J(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                f1<t1> f1Var = PARSER;
                if (f1Var == null) {
                    synchronized (t1.class) {
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
