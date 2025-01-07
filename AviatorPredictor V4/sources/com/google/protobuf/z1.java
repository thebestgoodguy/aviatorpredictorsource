package com.google.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class z1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f3170a = H();

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?> f3171b = com.google.protobuf.d.b();

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f3172c = q(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f3173d = q(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    private static final e f3174e = F();

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f3175f = X();

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f3176g = W();

    /* renamed from: h, reason: collision with root package name */
    static final long f3177h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f3178i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f3179j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f3180k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f3181l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f3182m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f3183n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f3184o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f3185p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f3186q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f3187r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f3188s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f3189t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f3190u;

    /* renamed from: v, reason: collision with root package name */
    private static final int f3191v;

    /* renamed from: w, reason: collision with root package name */
    static final boolean f3192w;

    static class a implements PrivilegedExceptionAction<Unsafe> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    private static final class b extends e {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j4) {
            return z1.f3192w ? z1.u(obj, j4) : z1.v(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j4) {
            return z1.f3192w ? z1.y(obj, j4) : z1.z(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j4) {
            return Double.longBitsToDouble(k(obj, j4));
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j4) {
            return Float.intBitsToFloat(i(obj, j4));
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j4, boolean z4) {
            if (z1.f3192w) {
                z1.M(obj, j4, z4);
            } else {
                z1.N(obj, j4, z4);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j4, byte b5) {
            if (z1.f3192w) {
                z1.P(obj, j4, b5);
            } else {
                z1.Q(obj, j4, b5);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j4, double d5) {
            s(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j4, float f5) {
            r(obj, j4, Float.floatToIntBits(f5));
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            return false;
        }
    }

    private static final class c extends e {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j4) {
            return z1.f3192w ? z1.u(obj, j4) : z1.v(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j4) {
            return z1.f3192w ? z1.y(obj, j4) : z1.z(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j4) {
            return Double.longBitsToDouble(k(obj, j4));
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j4) {
            return Float.intBitsToFloat(i(obj, j4));
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j4, boolean z4) {
            if (z1.f3192w) {
                z1.M(obj, j4, z4);
            } else {
                z1.N(obj, j4, z4);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j4, byte b5) {
            if (z1.f3192w) {
                z1.P(obj, j4, b5);
            } else {
                z1.Q(obj, j4, b5);
            }
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j4, double d5) {
            s(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j4, float f5) {
            r(obj, j4, Float.floatToIntBits(f5));
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            return false;
        }
    }

    private static final class d extends e {
        d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.protobuf.z1.e
        public void c(long j4, byte[] bArr, long j5, long j6) {
            this.f3193a.copyMemory((Object) null, j4, bArr, z1.f3177h + j5, j6);
        }

        @Override // com.google.protobuf.z1.e
        public boolean d(Object obj, long j4) {
            return this.f3193a.getBoolean(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public byte e(long j4) {
            return this.f3193a.getByte(j4);
        }

        @Override // com.google.protobuf.z1.e
        public byte f(Object obj, long j4) {
            return this.f3193a.getByte(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public double g(Object obj, long j4) {
            return this.f3193a.getDouble(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public float h(Object obj, long j4) {
            return this.f3193a.getFloat(obj, j4);
        }

        @Override // com.google.protobuf.z1.e
        public long j(long j4) {
            return this.f3193a.getLong(j4);
        }

        @Override // com.google.protobuf.z1.e
        public void n(Object obj, long j4, boolean z4) {
            this.f3193a.putBoolean(obj, j4, z4);
        }

        @Override // com.google.protobuf.z1.e
        public void o(Object obj, long j4, byte b5) {
            this.f3193a.putByte(obj, j4, b5);
        }

        @Override // com.google.protobuf.z1.e
        public void p(Object obj, long j4, double d5) {
            this.f3193a.putDouble(obj, j4, d5);
        }

        @Override // com.google.protobuf.z1.e
        public void q(Object obj, long j4, float f5) {
            this.f3193a.putFloat(obj, j4, f5);
        }

        @Override // com.google.protobuf.z1.e
        public boolean u() {
            if (!super.u()) {
                return false;
            }
            try {
                Class<?> cls = this.f3193a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }

        @Override // com.google.protobuf.z1.e
        public boolean v() {
            if (!super.v()) {
                return false;
            }
            try {
                Class<?> cls = this.f3193a.getClass();
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }
    }

    private static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f3193a;

        e(Unsafe unsafe) {
            this.f3193a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f3193a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f3193a.arrayIndexScale(cls);
        }

        public abstract void c(long j4, byte[] bArr, long j5, long j6);

        public abstract boolean d(Object obj, long j4);

        public abstract byte e(long j4);

        public abstract byte f(Object obj, long j4);

        public abstract double g(Object obj, long j4);

        public abstract float h(Object obj, long j4);

        public final int i(Object obj, long j4) {
            return this.f3193a.getInt(obj, j4);
        }

        public abstract long j(long j4);

        public final long k(Object obj, long j4) {
            return this.f3193a.getLong(obj, j4);
        }

        public final Object l(Object obj, long j4) {
            return this.f3193a.getObject(obj, j4);
        }

        public final long m(Field field) {
            return this.f3193a.objectFieldOffset(field);
        }

        public abstract void n(Object obj, long j4, boolean z4);

        public abstract void o(Object obj, long j4, byte b5);

        public abstract void p(Object obj, long j4, double d5);

        public abstract void q(Object obj, long j4, float f5);

        public final void r(Object obj, long j4, int r5) {
            this.f3193a.putInt(obj, j4, r5);
        }

        public final void s(Object obj, long j4, long j5) {
            this.f3193a.putLong(obj, j4, j5);
        }

        public final void t(Object obj, long j4, Object obj2) {
            this.f3193a.putObject(obj, j4, obj2);
        }

        public boolean u() {
            Unsafe unsafe = this.f3193a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class<?> cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }

        public boolean v() {
            Unsafe unsafe = this.f3193a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return z1.o() != null;
            } catch (Throwable th) {
                z1.K(th);
                return false;
            }
        }
    }

    static {
        long m4 = m(byte[].class);
        f3177h = m4;
        f3178i = m(boolean[].class);
        f3179j = n(boolean[].class);
        f3180k = m(int[].class);
        f3181l = n(int[].class);
        f3182m = m(long[].class);
        f3183n = n(long[].class);
        f3184o = m(float[].class);
        f3185p = n(float[].class);
        f3186q = m(double[].class);
        f3187r = n(double[].class);
        f3188s = m(Object[].class);
        f3189t = n(Object[].class);
        f3190u = s(o());
        f3191v = (int) (7 & m4);
        f3192w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private z1() {
    }

    static double A(Object obj, long j4) {
        return f3174e.g(obj, j4);
    }

    static float B(Object obj, long j4) {
        return f3174e.h(obj, j4);
    }

    static int C(Object obj, long j4) {
        return f3174e.i(obj, j4);
    }

    static long D(long j4) {
        return f3174e.j(j4);
    }

    static long E(Object obj, long j4) {
        return f3174e.k(obj, j4);
    }

    private static e F() {
        Unsafe unsafe = f3170a;
        if (unsafe == null) {
            return null;
        }
        if (!com.google.protobuf.d.c()) {
            return new d(unsafe);
        }
        if (f3172c) {
            return new c(unsafe);
        }
        if (f3173d) {
            return new b(unsafe);
        }
        return null;
    }

    static Object G(Object obj, long j4) {
        return f3174e.l(obj, j4);
    }

    static Unsafe H() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    static boolean I() {
        return f3176g;
    }

    static boolean J() {
        return f3175f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void K(Throwable th) {
        Logger.getLogger(z1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    static void L(Object obj, long j4, boolean z4) {
        f3174e.n(obj, j4, z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void M(Object obj, long j4, boolean z4) {
        P(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void N(Object obj, long j4, boolean z4) {
        Q(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void O(byte[] bArr, long j4, byte b5) {
        f3174e.o(bArr, f3177h + j4, b5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void P(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int C = C(obj, j5);
        int r5 = ((~((int) j4)) & 3) << 3;
        T(obj, j5, ((255 & b5) << r5) | (C & (~(255 << r5))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void Q(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int r5 = (((int) j4) & 3) << 3;
        T(obj, j5, ((255 & b5) << r5) | (C(obj, j5) & (~(255 << r5))));
    }

    static void R(Object obj, long j4, double d5) {
        f3174e.p(obj, j4, d5);
    }

    static void S(Object obj, long j4, float f5) {
        f3174e.q(obj, j4, f5);
    }

    static void T(Object obj, long j4, int r4) {
        f3174e.r(obj, j4, r4);
    }

    static void U(Object obj, long j4, long j5) {
        f3174e.s(obj, j4, j5);
    }

    static void V(Object obj, long j4, Object obj2) {
        f3174e.t(obj, j4, obj2);
    }

    private static boolean W() {
        e eVar = f3174e;
        if (eVar == null) {
            return false;
        }
        return eVar.u();
    }

    private static boolean X() {
        e eVar = f3174e;
        if (eVar == null) {
            return false;
        }
        return eVar.v();
    }

    static long k(ByteBuffer byteBuffer) {
        return f3174e.k(byteBuffer, f3190u);
    }

    static <T> T l(Class<T> cls) {
        try {
            return (T) f3170a.allocateInstance(cls);
        } catch (InstantiationException e5) {
            throw new IllegalStateException(e5);
        }
    }

    private static int m(Class<?> cls) {
        if (f3176g) {
            return f3174e.a(cls);
        }
        return -1;
    }

    private static int n(Class<?> cls) {
        if (f3176g) {
            return f3174e.b(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field o() {
        Field r4;
        if (com.google.protobuf.d.c() && (r4 = r(Buffer.class, "effectiveDirectAddress")) != null) {
            return r4;
        }
        Field r5 = r(Buffer.class, "address");
        if (r5 == null || r5.getType() != Long.TYPE) {
            return null;
        }
        return r5;
    }

    static void p(long j4, byte[] bArr, long j5, long j6) {
        f3174e.c(j4, bArr, j5, j6);
    }

    static boolean q(Class<?> cls) {
        if (!com.google.protobuf.d.c()) {
            return false;
        }
        try {
            Class<?> cls2 = f3171b;
            Class<?> cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class<?> cls4 = Integer.TYPE;
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

    private static Field r(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static long s(Field field) {
        e eVar;
        if (field == null || (eVar = f3174e) == null) {
            return -1L;
        }
        return eVar.m(field);
    }

    static boolean t(Object obj, long j4) {
        return f3174e.d(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean u(Object obj, long j4) {
        return y(obj, j4) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean v(Object obj, long j4) {
        return z(obj, j4) != 0;
    }

    static byte w(long j4) {
        return f3174e.e(j4);
    }

    static byte x(byte[] bArr, long j4) {
        return f3174e.f(bArr, f3177h + j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte y(Object obj, long j4) {
        return (byte) ((C(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte z(Object obj, long j4) {
        return (byte) ((C(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255);
    }
}
