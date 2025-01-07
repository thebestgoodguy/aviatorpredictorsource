package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f2114a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f2115b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f2116c;

    /* renamed from: d, reason: collision with root package name */
    private static final r1 f2117d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f2118e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f2119f;

    /* renamed from: g, reason: collision with root package name */
    static final long f2120g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f2121h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    static {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.s1.<clinit>():void");
    }

    private s1() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int r12 = tq.f2176a;
        try {
            Class cls2 = f2115b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j4) {
        return f2117d.g(obj, j4);
    }

    static boolean C() {
        return f2119f;
    }

    static boolean D() {
        return f2118e;
    }

    private static int E(Class cls) {
        if (f2119f) {
            return f2117d.h(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f2119f) {
            return f2117d.i(cls);
        }
        return -1;
    }

    private static Field b() {
        int r02 = tq.f2176a;
        Field c5 = c(Buffer.class, "effectiveDirectAddress");
        if (c5 != null) {
            return c5;
        }
        Field c6 = c(Buffer.class, "address");
        if (c6 == null || c6.getType() != Long.TYPE) {
            return null;
        }
        return c6;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        r1 r1Var = f2117d;
        int j6 = r1Var.j(obj, j5);
        int r6 = ((~((int) j4)) & 3) << 3;
        r1Var.n(obj, j5, ((255 & b5) << r6) | (j6 & (~(255 << r6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        r1 r1Var = f2117d;
        int r6 = (((int) j4) & 3) << 3;
        r1Var.n(obj, j5, ((255 & b5) << r6) | (r1Var.j(obj, j5) & (~(255 << r6))));
    }

    static double f(Object obj, long j4) {
        return f2117d.a(obj, j4);
    }

    static float g(Object obj, long j4) {
        return f2117d.b(obj, j4);
    }

    static int h(Object obj, long j4) {
        return f2117d.j(obj, j4);
    }

    static long i(Object obj, long j4) {
        return f2117d.k(obj, j4);
    }

    static Object j(Class cls) {
        try {
            return f2114a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    static Object k(Object obj, long j4) {
        return f2117d.m(obj, j4);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o1());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(s1.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j4, boolean z4) {
        f2117d.c(obj, j4, z4);
    }

    static void s(byte[] bArr, long j4, byte b5) {
        f2117d.d(bArr, f2120g + j4, b5);
    }

    static void t(Object obj, long j4, double d5) {
        f2117d.e(obj, j4, d5);
    }

    static void u(Object obj, long j4, float f5) {
        f2117d.f(obj, j4, f5);
    }

    static void v(Object obj, long j4, int r4) {
        f2117d.n(obj, j4, r4);
    }

    static void w(Object obj, long j4, long j5) {
        f2117d.o(obj, j4, j5);
    }

    static void x(Object obj, long j4, Object obj2) {
        f2117d.p(obj, j4, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j4) {
        return ((byte) ((f2117d.j(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j4) {
        return ((byte) ((f2117d.j(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }
}
