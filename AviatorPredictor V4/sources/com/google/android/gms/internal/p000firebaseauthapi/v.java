package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
final class v implements r0 {

    /* renamed from: b, reason: collision with root package name */
    private static final c0 f2223b = new t();

    /* renamed from: a, reason: collision with root package name */
    private final c0 f2224a;

    public v() {
        c0 c0Var;
        c0[] c0VarArr = new c0[2];
        c0VarArr[0] = gs.c();
        try {
            c0Var = (c0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            c0Var = f2223b;
        }
        c0VarArr[1] = c0Var;
        u uVar = new u(c0VarArr);
        f.f(uVar, "messageInfoFactory");
        this.f2224a = uVar;
    }

    private static boolean b(a0 a0Var) {
        return a0Var.c() == 1;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.r0
    public final q0 a(Class cls) {
        j0 a5;
        r d5;
        i1 a6;
        zr zrVar;
        y a7;
        i1 b02;
        zr a8;
        s0.g(cls);
        a0 a9 = this.f2224a.a(cls);
        if (a9.b()) {
            if (ks.class.isAssignableFrom(cls)) {
                b02 = s0.b();
                a8 = bs.b();
            } else {
                b02 = s0.b0();
                a8 = bs.a();
            }
            return i0.k(b02, a8, a9.a());
        }
        if (ks.class.isAssignableFrom(cls)) {
            boolean b5 = b(a9);
            a5 = k0.b();
            d5 = r.e();
            a6 = s0.b();
            zrVar = b5 ? bs.b() : null;
            a7 = z.b();
        } else {
            boolean b6 = b(a9);
            a5 = k0.a();
            d5 = r.d();
            if (b6) {
                a6 = s0.b0();
                zrVar = bs.a();
            } else {
                a6 = s0.a();
                zrVar = null;
            }
            a7 = z.a();
        }
        return h0.K(cls, a9, a5, d5, a6, zrVar, a7);
    }
}
