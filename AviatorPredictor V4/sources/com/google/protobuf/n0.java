package com.google.protobuf;

/* loaded from: classes.dex */
final class n0 implements o1 {

    /* renamed from: b, reason: collision with root package name */
    private static final u0 f3023b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u0 f3024a;

    static class a implements u0 {
        a() {
        }

        @Override // com.google.protobuf.u0
        public boolean a(Class<?> cls) {
            return false;
        }

        @Override // com.google.protobuf.u0
        public t0 b(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }
    }

    private static class b implements u0 {

        /* renamed from: a, reason: collision with root package name */
        private u0[] f3025a;

        b(u0... u0VarArr) {
            this.f3025a = u0VarArr;
        }

        @Override // com.google.protobuf.u0
        public boolean a(Class<?> cls) {
            for (u0 u0Var : this.f3025a) {
                if (u0Var.a(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.protobuf.u0
        public t0 b(Class<?> cls) {
            for (u0 u0Var : this.f3025a) {
                if (u0Var.a(cls)) {
                    return u0Var.b(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }
    }

    public n0() {
        this(b());
    }

    private n0(u0 u0Var) {
        this.f3024a = (u0) d0.b(u0Var, "messageInfoFactory");
    }

    private static u0 b() {
        return new b(z.c(), c());
    }

    private static u0 c() {
        try {
            return (u0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f3023b;
        }
    }

    private static boolean d(t0 t0Var) {
        return t0Var.a() == h1.PROTO2;
    }

    private static <T> n1<T> e(Class<T> cls, t0 t0Var) {
        return a0.class.isAssignableFrom(cls) ? d(t0Var) ? y0.R(cls, t0Var, c1.b(), l0.b(), p1.M(), u.b(), s0.b()) : y0.R(cls, t0Var, c1.b(), l0.b(), p1.M(), null, s0.b()) : d(t0Var) ? y0.R(cls, t0Var, c1.a(), l0.a(), p1.H(), u.a(), s0.a()) : y0.R(cls, t0Var, c1.a(), l0.a(), p1.I(), null, s0.a());
    }

    @Override // com.google.protobuf.o1
    public <T> n1<T> a(Class<T> cls) {
        v1<?, ?> H;
        s<?> a5;
        p1.J(cls);
        t0 b5 = this.f3024a.b(cls);
        if (!b5.c()) {
            return e(cls, b5);
        }
        if (a0.class.isAssignableFrom(cls)) {
            H = p1.M();
            a5 = u.b();
        } else {
            H = p1.H();
            a5 = u.a();
        }
        return z0.m(H, a5, b5.b());
    }
}
