package com.google.protobuf;

import com.google.protobuf.b2;
import com.google.protobuf.c2;
import com.google.protobuf.d0;
import com.google.protobuf.f;
import com.google.protobuf.j;
import com.google.protobuf.o0;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class y0<T> implements n1<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f3139r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f3140s = z1.H();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f3141a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f3142b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3143c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3144d;

    /* renamed from: e, reason: collision with root package name */
    private final v0 f3145e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f3146f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f3147g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f3148h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3149i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f3150j;

    /* renamed from: k, reason: collision with root package name */
    private final int f3151k;

    /* renamed from: l, reason: collision with root package name */
    private final int f3152l;

    /* renamed from: m, reason: collision with root package name */
    private final a1 f3153m;

    /* renamed from: n, reason: collision with root package name */
    private final l0 f3154n;

    /* renamed from: o, reason: collision with root package name */
    private final v1<?, ?> f3155o;

    /* renamed from: p, reason: collision with root package name */
    private final s<?> f3156p;

    /* renamed from: q, reason: collision with root package name */
    private final q0 f3157q;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3158a;

        static {
            int[] r02 = new int[b2.b.values().length];
            f3158a = r02;
            try {
                r02[b2.b.f2809n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3158a[b2.b.f2813r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3158a[b2.b.f2802g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3158a[b2.b.f2808m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3158a[b2.b.f2816u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3158a[b2.b.f2807l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3158a[b2.b.f2817v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3158a[b2.b.f2803h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3158a[b2.b.f2815t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3158a[b2.b.f2806k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3158a[b2.b.f2814s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3158a[b2.b.f2804i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3158a[b2.b.f2805j.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3158a[b2.b.f2812q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3158a[b2.b.f2818w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3158a[b2.b.f2819x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3158a[b2.b.f2810o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private y0(int[] r12, Object[] objArr, int r32, int r4, v0 v0Var, boolean z4, boolean z5, int[] r8, int r9, int r10, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, s<?> sVar, q0 q0Var) {
        this.f3141a = r12;
        this.f3142b = objArr;
        this.f3143c = r32;
        this.f3144d = r4;
        this.f3147g = v0Var instanceof a0;
        this.f3148h = z4;
        this.f3146f = sVar != null && sVar.e(v0Var);
        this.f3149i = z5;
        this.f3150j = r8;
        this.f3151k = r9;
        this.f3152l = r10;
        this.f3153m = a1Var;
        this.f3154n = l0Var;
        this.f3155o = v1Var;
        this.f3156p = sVar;
        this.f3145e = v0Var;
        this.f3157q = q0Var;
    }

    private static <T> int A(T t4, long j4) {
        return z1.C(t4, j4);
    }

    private static boolean B(int r12) {
        return (r12 & 536870912) != 0;
    }

    private boolean C(T t4, int r10) {
        int i02 = i0(r10);
        long j4 = 1048575 & i02;
        if (j4 != 1048575) {
            return (z1.C(t4, j4) & (1 << (i02 >>> 20))) != 0;
        }
        int s02 = s0(r10);
        long V = V(s02);
        switch (r0(s02)) {
            case 0:
                return Double.doubleToRawLongBits(z1.A(t4, V)) != 0;
            case 1:
                return Float.floatToRawIntBits(z1.B(t4, V)) != 0;
            case 2:
                return z1.E(t4, V) != 0;
            case 3:
                return z1.E(t4, V) != 0;
            case 4:
                return z1.C(t4, V) != 0;
            case 5:
                return z1.E(t4, V) != 0;
            case 6:
                return z1.C(t4, V) != 0;
            case 7:
                return z1.t(t4, V);
            case 8:
                Object G = z1.G(t4, V);
                if (G instanceof String) {
                    return !((String) G).isEmpty();
                }
                if (G instanceof j) {
                    return !j.f2914f.equals(G);
                }
                throw new IllegalArgumentException();
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return z1.G(t4, V) != null;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !j.f2914f.equals(z1.G(t4, V));
            case 11:
                return z1.C(t4, V) != 0;
            case 12:
                return z1.C(t4, V) != 0;
            case 13:
                return z1.C(t4, V) != 0;
            case 14:
                return z1.E(t4, V) != 0;
            case 15:
                return z1.C(t4, V) != 0;
            case 16:
                return z1.E(t4, V) != 0;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return z1.G(t4, V) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private boolean D(T t4, int r32, int r4, int r5, int r6) {
        return r4 == 1048575 ? C(t4, r32) : (r5 & r6) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object obj, int r32, n1 n1Var) {
        return n1Var.b(z1.G(obj, V(r32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean F(Object obj, int r5, int r6) {
        List list = (List) z1.G(obj, V(r5));
        if (list.isEmpty()) {
            return true;
        }
        n1 v4 = v(r6);
        for (int r12 = 0; r12 < list.size(); r12++) {
            if (!v4.b(list.get(r12))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.n1] */
    private boolean G(T t4, int r5, int r6) {
        Map<?, ?> b5 = this.f3157q.b(z1.G(t4, V(r5)));
        if (b5.isEmpty()) {
            return true;
        }
        if (this.f3157q.h(u(r6)).f3034c.d() != b2.c.MESSAGE) {
            return true;
        }
        ?? r52 = 0;
        for (Object obj : b5.values()) {
            r52 = r52;
            if (r52 == 0) {
                r52 = i1.a().d(obj.getClass());
            }
            if (!r52.b(obj)) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t4, T t5, int r5) {
        long i02 = i0(r5) & 1048575;
        return z1.C(t4, i02) == z1.C(t5, i02);
    }

    private boolean I(T t4, int r4, int r5) {
        return z1.C(t4, (long) (i0(r5) & 1048575)) == r4;
    }

    private static boolean J(int r12) {
        return (r12 & 268435456) != 0;
    }

    private static List<?> K(Object obj, long j4) {
        return (List) z1.G(obj, j4);
    }

    private static <T> long L(T t4, long j4) {
        return z1.E(t4, j4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:288:0x0077, code lost:
    
        r0 = r16.f3151k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x007b, code lost:
    
        if (r0 >= r16.f3152l) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x007d, code lost:
    
        r13 = q(r19, r16.f3150j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0088, code lost:
    
        if (r13 == null) goto L327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x008a, code lost:
    
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x008d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:?, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private <UT, UB, ET extends com.google.protobuf.w.b<ET>> void M(com.google.protobuf.v1<UT, UB> r17, com.google.protobuf.s<ET> r18, T r19, com.google.protobuf.l1 r20, com.google.protobuf.r r21) {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.M(com.google.protobuf.v1, com.google.protobuf.s, java.lang.Object, com.google.protobuf.l1, com.google.protobuf.r):void");
    }

    private final <K, V> void N(Object obj, int r6, Object obj2, r rVar, l1 l1Var) {
        long V = V(s0(r6));
        Object G = z1.G(obj, V);
        if (G == null) {
            G = this.f3157q.c(obj2);
            z1.V(obj, V, G);
        } else if (this.f3157q.f(G)) {
            Object c5 = this.f3157q.c(obj2);
            this.f3157q.a(c5, G);
            z1.V(obj, V, c5);
            G = c5;
        }
        l1Var.a(this.f3157q.e(G), this.f3157q.h(obj2), rVar);
    }

    private void O(T t4, T t5, int r6) {
        long V = V(s0(r6));
        if (C(t5, r6)) {
            Object G = z1.G(t4, V);
            Object G2 = z1.G(t5, V);
            if (G != null && G2 != null) {
                G2 = d0.h(G, G2);
            } else if (G2 == null) {
                return;
            }
            z1.V(t4, V, G2);
            o0(t4, r6);
        }
    }

    private void P(T t4, T t5, int r8) {
        int s02 = s0(r8);
        int U = U(r8);
        long V = V(s02);
        if (I(t5, U, r8)) {
            Object G = I(t4, U, r8) ? z1.G(t4, V) : null;
            Object G2 = z1.G(t5, V);
            if (G != null && G2 != null) {
                G2 = d0.h(G, G2);
            } else if (G2 == null) {
                return;
            }
            z1.V(t4, V, G2);
            p0(t4, U, r8);
        }
    }

    private void Q(T t4, T t5, int r8) {
        int s02 = s0(r8);
        long V = V(s02);
        int U = U(r8);
        switch (r0(s02)) {
            case 0:
                if (C(t5, r8)) {
                    z1.R(t4, V, z1.A(t5, V));
                    o0(t4, r8);
                    break;
                }
                break;
            case 1:
                if (C(t5, r8)) {
                    z1.S(t4, V, z1.B(t5, V));
                    o0(t4, r8);
                    break;
                }
                break;
            case 2:
                if (!C(t5, r8)) {
                }
                z1.U(t4, V, z1.E(t5, V));
                o0(t4, r8);
                break;
            case 3:
                if (!C(t5, r8)) {
                }
                z1.U(t4, V, z1.E(t5, V));
                o0(t4, r8);
                break;
            case 4:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 5:
                if (!C(t5, r8)) {
                }
                z1.U(t4, V, z1.E(t5, V));
                o0(t4, r8);
                break;
            case 6:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 7:
                if (C(t5, r8)) {
                    z1.L(t4, V, z1.t(t5, V));
                    o0(t4, r8);
                    break;
                }
                break;
            case 8:
                if (!C(t5, r8)) {
                }
                z1.V(t4, V, z1.G(t5, V));
                o0(t4, r8);
                break;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                O(t4, t5, r8);
                break;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                if (!C(t5, r8)) {
                }
                z1.V(t4, V, z1.G(t5, V));
                o0(t4, r8);
                break;
            case 11:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 12:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 13:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 14:
                if (!C(t5, r8)) {
                }
                z1.U(t4, V, z1.E(t5, V));
                o0(t4, r8);
                break;
            case 15:
                if (!C(t5, r8)) {
                }
                z1.T(t4, V, z1.C(t5, V));
                o0(t4, r8);
                break;
            case 16:
                if (!C(t5, r8)) {
                }
                z1.U(t4, V, z1.E(t5, V));
                o0(t4, r8);
                break;
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f3154n.d(t4, t5, V);
                break;
            case 50:
                p1.F(this.f3157q, t4, t5, V);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!I(t5, U, r8)) {
                }
                z1.V(t4, V, z1.G(t5, V));
                p0(t4, U, r8);
                break;
            case 60:
            case 68:
                P(t4, t5, r8);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!I(t5, U, r8)) {
                }
                z1.V(t4, V, z1.G(t5, V));
                p0(t4, U, r8);
                break;
        }
    }

    static <T> y0<T> R(Class<T> cls, t0 t0Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, s<?> sVar, q0 q0Var) {
        return t0Var instanceof k1 ? T((k1) t0Var, a1Var, l0Var, v1Var, sVar, q0Var) : S((r1) t0Var, a1Var, l0Var, v1Var, sVar, q0Var);
    }

    static <T> y0<T> S(r1 r1Var, a1 a1Var, l0 l0Var, v1<?, ?> v1Var, s<?> sVar, q0 q0Var) {
        boolean z4 = r1Var.a() == h1.PROTO3;
        v[] e5 = r1Var.e();
        if (e5.length != 0) {
            v vVar = e5[0];
            throw null;
        }
        int length = e5.length;
        int[] r4 = new int[length * 3];
        Object[] objArr = new Object[length * 2];
        if (e5.length > 0) {
            v vVar2 = e5[0];
            throw null;
        }
        int[] d5 = r1Var.d();
        if (d5 == null) {
            d5 = f3139r;
        }
        if (e5.length > 0) {
            v vVar3 = e5[0];
            throw null;
        }
        int[] r02 = f3139r;
        int[] r32 = f3139r;
        int[] r11 = new int[d5.length + r02.length + r32.length];
        System.arraycopy(d5, 0, r11, 0, d5.length);
        System.arraycopy(r02, 0, r11, d5.length, r02.length);
        System.arraycopy(r32, 0, r11, d5.length + r02.length, r32.length);
        return new y0<>(r4, objArr, 0, 0, r1Var.b(), z4, true, r11, d5.length, d5.length + r02.length, a1Var, l0Var, v1Var, sVar, q0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.protobuf.y0<T> T(com.google.protobuf.k1 r34, com.google.protobuf.a1 r35, com.google.protobuf.l0 r36, com.google.protobuf.v1<?, ?> r37, com.google.protobuf.s<?> r38, com.google.protobuf.q0 r39) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.T(com.google.protobuf.k1, com.google.protobuf.a1, com.google.protobuf.l0, com.google.protobuf.v1, com.google.protobuf.s, com.google.protobuf.q0):com.google.protobuf.y0");
    }

    private int U(int r22) {
        return this.f3141a[r22];
    }

    private static long V(int r22) {
        return r22 & 1048575;
    }

    private static <T> boolean W(T t4, long j4) {
        return ((Boolean) z1.G(t4, j4)).booleanValue();
    }

    private static <T> double X(T t4, long j4) {
        return ((Double) z1.G(t4, j4)).doubleValue();
    }

    private static <T> float Y(T t4, long j4) {
        return ((Float) z1.G(t4, j4)).floatValue();
    }

    private static <T> int Z(T t4, long j4) {
        return ((Integer) z1.G(t4, j4)).intValue();
    }

    private static <T> long a0(T t4, long j4) {
        return ((Long) z1.G(t4, j4)).longValue();
    }

    private <K, V> int b0(T t4, byte[] bArr, int r12, int r13, int r14, long j4, f.b bVar) {
        Unsafe unsafe = f3140s;
        Object u4 = u(r14);
        Object object = unsafe.getObject(t4, j4);
        if (this.f3157q.f(object)) {
            Object c5 = this.f3157q.c(u4);
            this.f3157q.a(c5, object);
            unsafe.putObject(t4, j4, c5);
            object = c5;
        }
        return m(bArr, r12, r13, this.f3157q.h(u4), this.f3157q.e(object), bVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int c0(T t4, byte[] bArr, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long j4, int r28, f.b bVar) {
        Object valueOf;
        Object valueOf2;
        int L;
        long j5;
        int r32;
        Object valueOf3;
        Unsafe unsafe = f3140s;
        long j6 = this.f3141a[r28 + 2] & 1048575;
        switch (r25) {
            case 51:
                if (r23 == 1) {
                    valueOf = Double.valueOf(f.d(bArr, r19));
                    unsafe.putObject(t4, j4, valueOf);
                    L = r19 + 8;
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 52:
                if (r23 == 5) {
                    valueOf2 = Float.valueOf(f.l(bArr, r19));
                    unsafe.putObject(t4, j4, valueOf2);
                    L = r19 + 4;
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 53:
            case 54:
                if (r23 == 0) {
                    L = f.L(bArr, r19, bVar);
                    j5 = bVar.f2863b;
                    valueOf3 = Long.valueOf(j5);
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 55:
            case 62:
                if (r23 == 0) {
                    L = f.I(bArr, r19, bVar);
                    r32 = bVar.f2862a;
                    valueOf3 = Integer.valueOf(r32);
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 56:
            case 65:
                if (r23 == 1) {
                    valueOf = Long.valueOf(f.j(bArr, r19));
                    unsafe.putObject(t4, j4, valueOf);
                    L = r19 + 8;
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 57:
            case 64:
                if (r23 == 5) {
                    valueOf2 = Integer.valueOf(f.h(bArr, r19));
                    unsafe.putObject(t4, j4, valueOf2);
                    L = r19 + 4;
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 58:
                if (r23 == 0) {
                    L = f.L(bArr, r19, bVar);
                    valueOf3 = Boolean.valueOf(bVar.f2863b != 0);
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 59:
                if (r23 == 2) {
                    L = f.I(bArr, r19, bVar);
                    int r4 = bVar.f2862a;
                    if (r4 == 0) {
                        valueOf3 = "";
                        unsafe.putObject(t4, j4, valueOf3);
                        unsafe.putInt(t4, j6, r22);
                        return L;
                    }
                    if ((r24 & 536870912) != 0 && !a2.t(bArr, L, L + r4)) {
                        throw e0.d();
                    }
                    unsafe.putObject(t4, j4, new String(bArr, L, r4, d0.f2847b));
                    L += r4;
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 60:
                if (r23 == 2) {
                    L = f.p(v(r28), bArr, r19, r20, bVar);
                    Object object = unsafe.getInt(t4, j6) == r22 ? unsafe.getObject(t4, j4) : null;
                    valueOf3 = bVar.f2864c;
                    if (object != null) {
                        valueOf3 = d0.h(object, valueOf3);
                    }
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 61:
                if (r23 == 2) {
                    L = f.b(bArr, r19, bVar);
                    valueOf3 = bVar.f2864c;
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 63:
                if (r23 == 0) {
                    int I = f.I(bArr, r19, bVar);
                    int r42 = bVar.f2862a;
                    d0.e t5 = t(r28);
                    if (t5 == null || t5.a(r42)) {
                        unsafe.putObject(t4, j4, Integer.valueOf(r42));
                        unsafe.putInt(t4, j6, r22);
                    } else {
                        w(t4).m(r21, Long.valueOf(r42));
                    }
                    return I;
                }
                return r19;
            case 66:
                if (r23 == 0) {
                    L = f.I(bArr, r19, bVar);
                    r32 = k.b(bVar.f2862a);
                    valueOf3 = Integer.valueOf(r32);
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 67:
                if (r23 == 0) {
                    L = f.L(bArr, r19, bVar);
                    j5 = k.c(bVar.f2863b);
                    valueOf3 = Long.valueOf(j5);
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            case 68:
                if (r23 == 3) {
                    L = f.n(v(r28), bArr, r19, r20, (r21 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t4, j6) == r22 ? unsafe.getObject(t4, j4) : null;
                    valueOf3 = bVar.f2864c;
                    if (object2 != null) {
                        valueOf3 = d0.h(object2, valueOf3);
                    }
                    unsafe.putObject(t4, j4, valueOf3);
                    unsafe.putInt(t4, j6, r22);
                    return L;
                }
                return r19;
            default:
                return r19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x0280, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0282, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r19;
        r2 = r20;
        r6 = r24;
        r7 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02eb, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c7, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x02e8, code lost:
    
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0092. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int e0(T r31, byte[] r32, int r33, int r34, com.google.protobuf.f.b r35) {
        /*
            Method dump skipped, instructions count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.e0(java.lang.Object, byte[], int, int, com.google.protobuf.f$b):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int f0(T t4, byte[] bArr, int r16, int r17, int r18, int r19, int r20, int r21, long j4, int r24, long j5, f.b bVar) {
        int J;
        Unsafe unsafe = f3140s;
        d0.i iVar = (d0.i) unsafe.getObject(t4, j5);
        if (!iVar.n()) {
            int size = iVar.size();
            iVar = iVar.k(size == 0 ? 10 : size * 2);
            unsafe.putObject(t4, j5, iVar);
        }
        switch (r24) {
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 35:
                if (r20 == 2) {
                    return f.s(bArr, r16, iVar, bVar);
                }
                if (r20 == 1) {
                    return f.e(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (r20 == 2) {
                    return f.v(bArr, r16, iVar, bVar);
                }
                if (r20 == 5) {
                    return f.m(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (r20 == 2) {
                    return f.z(bArr, r16, iVar, bVar);
                }
                if (r20 == 0) {
                    return f.M(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (r20 == 2) {
                    return f.y(bArr, r16, iVar, bVar);
                }
                if (r20 == 0) {
                    return f.J(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (r20 == 2) {
                    return f.u(bArr, r16, iVar, bVar);
                }
                if (r20 == 1) {
                    return f.k(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (r20 == 2) {
                    return f.t(bArr, r16, iVar, bVar);
                }
                if (r20 == 5) {
                    return f.i(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (r20 == 2) {
                    return f.r(bArr, r16, iVar, bVar);
                }
                if (r20 == 0) {
                    return f.a(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 26:
                if (r20 == 2) {
                    long j6 = j4 & 536870912;
                    d0.i iVar2 = iVar;
                    return j6 == 0 ? f.D(r18, bArr, r16, r17, iVar2, bVar) : f.E(r18, bArr, r16, r17, iVar2, bVar);
                }
                break;
            case 27:
                if (r20 == 2) {
                    return f.q(v(r21), r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 28:
                if (r20 == 2) {
                    return f.c(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (r20 == 2) {
                    J = f.y(bArr, r16, iVar, bVar);
                } else if (r20 == 0) {
                    J = f.J(r18, bArr, r16, r17, iVar, bVar);
                }
                a0 a0Var = (a0) t4;
                w1 w1Var = a0Var.unknownFields;
                if (w1Var == w1.c()) {
                    w1Var = null;
                }
                w1 w1Var2 = (w1) p1.A(r19, iVar, t(r21), w1Var, this.f3155o);
                if (w1Var2 != null) {
                    a0Var.unknownFields = w1Var2;
                }
                return J;
            case 33:
            case 47:
                if (r20 == 2) {
                    return f.w(bArr, r16, iVar, bVar);
                }
                if (r20 == 0) {
                    return f.A(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (r20 == 2) {
                    return f.x(bArr, r16, iVar, bVar);
                }
                if (r20 == 0) {
                    return f.B(r18, bArr, r16, r17, iVar, bVar);
                }
                break;
            case 49:
                if (r20 == 3) {
                    return f.o(v(r21), r18, bArr, r16, r17, iVar, bVar);
                }
                break;
        }
        return r16;
    }

    private int g0(int r22) {
        if (r22 < this.f3143c || r22 > this.f3144d) {
            return -1;
        }
        return q0(r22, 0);
    }

    private int h0(int r22, int r32) {
        if (r22 < this.f3143c || r22 > this.f3144d) {
            return -1;
        }
        return q0(r22, r32);
    }

    private int i0(int r22) {
        return this.f3141a[r22 + 2];
    }

    private <E> void j0(Object obj, long j4, l1 l1Var, n1<E> n1Var, r rVar) {
        l1Var.t(this.f3154n.e(obj, j4), n1Var, rVar);
    }

    private boolean k(T t4, T t5, int r32) {
        return C(t4, r32) == C(t5, r32);
    }

    private <E> void k0(Object obj, int r4, l1 l1Var, n1<E> n1Var, r rVar) {
        l1Var.M(this.f3154n.e(obj, V(r4)), n1Var, rVar);
    }

    private static <T> boolean l(T t4, long j4) {
        return z1.t(t4, j4);
    }

    private void l0(Object obj, int r4, l1 l1Var) {
        long V;
        Object e5;
        if (B(r4)) {
            V = V(r4);
            e5 = l1Var.G();
        } else if (this.f3147g) {
            V = V(r4);
            e5 = l1Var.E();
        } else {
            V = V(r4);
            e5 = l1Var.e();
        }
        z1.V(obj, V, e5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [java.util.Map, java.util.Map<K, V>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    private <K, V> int m(byte[] bArr, int r16, int r17, o0.a<K, V> aVar, Map<K, V> map, f.b bVar) {
        int r22;
        int I = f.I(bArr, r16, bVar);
        int r12 = bVar.f2862a;
        if (r12 < 0 || r12 > r17 - I) {
            throw e0.m();
        }
        int r11 = I + r12;
        Object obj = aVar.f3033b;
        Object obj2 = aVar.f3035d;
        while (I < r11) {
            int r13 = I + 1;
            byte b5 = bArr[I];
            if (b5 < 0) {
                r22 = f.H(b5, bArr, r13, bVar);
                b5 = bVar.f2862a;
            } else {
                r22 = r13;
            }
            int r14 = b5 >>> 3;
            int r32 = b5 & 7;
            if (r14 != 1) {
                if (r14 == 2 && r32 == aVar.f3034c.g()) {
                    I = n(bArr, r22, r17, aVar.f3034c, aVar.f3035d.getClass(), bVar);
                    obj2 = bVar.f2864c;
                }
                I = f.N(b5, bArr, r22, r17, bVar);
            } else if (r32 == aVar.f3032a.g()) {
                I = n(bArr, r22, r17, aVar.f3032a, null, bVar);
                obj = bVar.f2864c;
            } else {
                I = f.N(b5, bArr, r22, r17, bVar);
            }
        }
        if (I != r11) {
            throw e0.h();
        }
        map.put(obj, obj2);
        return r11;
    }

    private void m0(Object obj, int r5, l1 l1Var) {
        if (B(r5)) {
            l1Var.c(this.f3154n.e(obj, V(r5)));
        } else {
            l1Var.P(this.f3154n.e(obj, V(r5)));
        }
    }

    private int n(byte[] bArr, int r32, int r4, b2.b bVar, Class<?> cls, f.b bVar2) {
        int L;
        Object valueOf;
        Object valueOf2;
        Object valueOf3;
        int r33;
        long j4;
        switch (a.f3158a[bVar.ordinal()]) {
            case 1:
                L = f.L(bArr, r32, bVar2);
                valueOf = Boolean.valueOf(bVar2.f2863b != 0);
                bVar2.f2864c = valueOf;
                return L;
            case 2:
                return f.b(bArr, r32, bVar2);
            case 3:
                valueOf2 = Double.valueOf(f.d(bArr, r32));
                bVar2.f2864c = valueOf2;
                return r32 + 8;
            case 4:
            case 5:
                valueOf3 = Integer.valueOf(f.h(bArr, r32));
                bVar2.f2864c = valueOf3;
                return r32 + 4;
            case 6:
            case 7:
                valueOf2 = Long.valueOf(f.j(bArr, r32));
                bVar2.f2864c = valueOf2;
                return r32 + 8;
            case 8:
                valueOf3 = Float.valueOf(f.l(bArr, r32));
                bVar2.f2864c = valueOf3;
                return r32 + 4;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
                L = f.I(bArr, r32, bVar2);
                r33 = bVar2.f2862a;
                valueOf = Integer.valueOf(r33);
                bVar2.f2864c = valueOf;
                return L;
            case 12:
            case 13:
                L = f.L(bArr, r32, bVar2);
                j4 = bVar2.f2863b;
                valueOf = Long.valueOf(j4);
                bVar2.f2864c = valueOf;
                return L;
            case 14:
                return f.p(i1.a().d(cls), bArr, r32, r4, bVar2);
            case 15:
                L = f.I(bArr, r32, bVar2);
                r33 = k.b(bVar2.f2862a);
                valueOf = Integer.valueOf(r33);
                bVar2.f2864c = valueOf;
                return L;
            case 16:
                L = f.L(bArr, r32, bVar2);
                j4 = k.c(bVar2.f2863b);
                valueOf = Long.valueOf(j4);
                bVar2.f2864c = valueOf;
                return L;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return f.F(bArr, r32, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static Field n0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double o(T t4, long j4) {
        return z1.A(t4, j4);
    }

    private void o0(T t4, int r7) {
        int i02 = i0(r7);
        long j4 = 1048575 & i02;
        if (j4 == 1048575) {
            return;
        }
        z1.T(t4, j4, (1 << (i02 >>> 20)) | z1.C(t4, j4));
    }

    private boolean p(T t4, T t5, int r10) {
        int s02 = s0(r10);
        long V = V(s02);
        switch (r0(s02)) {
            case 0:
                return k(t4, t5, r10) && Double.doubleToLongBits(z1.A(t4, V)) == Double.doubleToLongBits(z1.A(t5, V));
            case 1:
                return k(t4, t5, r10) && Float.floatToIntBits(z1.B(t4, V)) == Float.floatToIntBits(z1.B(t5, V));
            case 2:
                return k(t4, t5, r10) && z1.E(t4, V) == z1.E(t5, V);
            case 3:
                return k(t4, t5, r10) && z1.E(t4, V) == z1.E(t5, V);
            case 4:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 5:
                return k(t4, t5, r10) && z1.E(t4, V) == z1.E(t5, V);
            case 6:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 7:
                return k(t4, t5, r10) && z1.t(t4, V) == z1.t(t5, V);
            case 8:
                return k(t4, t5, r10) && p1.K(z1.G(t4, V), z1.G(t5, V));
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return k(t4, t5, r10) && p1.K(z1.G(t4, V), z1.G(t5, V));
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return k(t4, t5, r10) && p1.K(z1.G(t4, V), z1.G(t5, V));
            case 11:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 12:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 13:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 14:
                return k(t4, t5, r10) && z1.E(t4, V) == z1.E(t5, V);
            case 15:
                return k(t4, t5, r10) && z1.C(t4, V) == z1.C(t5, V);
            case 16:
                return k(t4, t5, r10) && z1.E(t4, V) == z1.E(t5, V);
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return k(t4, t5, r10) && p1.K(z1.G(t4, V), z1.G(t5, V));
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return p1.K(z1.G(t4, V), z1.G(t5, V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return H(t4, t5, r10) && p1.K(z1.G(t4, V), z1.G(t5, V));
            default:
                return true;
        }
    }

    private void p0(T t4, int r4, int r5) {
        z1.T(t4, i0(r5) & 1048575, r4);
    }

    private final <UT, UB> UB q(Object obj, int r9, UB ub, v1<UT, UB> v1Var) {
        d0.e t4;
        int U = U(r9);
        Object G = z1.G(obj, V(s0(r9)));
        return (G == null || (t4 = t(r9)) == null) ? ub : (UB) r(r9, U, this.f3157q.e(G), t4, ub, v1Var);
    }

    private int q0(int r5, int r6) {
        int length = (this.f3141a.length / 3) - 1;
        while (r6 <= length) {
            int r12 = (length + r6) >>> 1;
            int r22 = r12 * 3;
            int U = U(r22);
            if (r5 == U) {
                return r22;
            }
            if (r5 < U) {
                length = r12 - 1;
            } else {
                r6 = r12 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB r(int r5, int r6, Map<K, V> map, d0.e eVar, UB ub, v1<UT, UB> v1Var) {
        o0.a<?, ?> h5 = this.f3157q.h(u(r5));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = v1Var.n();
                }
                j.h G = j.G(o0.b(h5, next.getKey(), next.getValue()));
                try {
                    o0.e(G.b(), h5, next.getKey(), next.getValue());
                    v1Var.d(ub, r6, G.a());
                    it.remove();
                } catch (IOException e5) {
                    throw new RuntimeException(e5);
                }
            }
        }
        return ub;
    }

    private static int r0(int r12) {
        return (r12 & 267386880) >>> 20;
    }

    private static <T> float s(T t4, long j4) {
        return z1.B(t4, j4);
    }

    private int s0(int r22) {
        return this.f3141a[r22 + 1];
    }

    private d0.e t(int r22) {
        return (d0.e) this.f3142b[((r22 / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0(T r18, com.google.protobuf.c2 r19) {
        /*
            Method dump skipped, instructions count: 1338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.t0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private Object u(int r22) {
        return this.f3142b[(r22 / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void u0(T r13, com.google.protobuf.c2 r14) {
        /*
            Method dump skipped, instructions count: 1488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.u0(java.lang.Object, com.google.protobuf.c2):void");
    }

    private n1 v(int r4) {
        int r42 = (r4 / 3) * 2;
        n1 n1Var = (n1) this.f3142b[r42];
        if (n1Var != null) {
            return n1Var;
        }
        n1<T> d5 = i1.a().d((Class) this.f3142b[r42 + 1]);
        this.f3142b[r42] = d5;
        return d5;
    }

    /* JADX WARN: Removed duplicated region for block: B:267:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(T r11, com.google.protobuf.c2 r12) {
        /*
            Method dump skipped, instructions count: 1490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.v0(java.lang.Object, com.google.protobuf.c2):void");
    }

    static w1 w(Object obj) {
        a0 a0Var = (a0) obj;
        w1 w1Var = a0Var.unknownFields;
        if (w1Var != w1.c()) {
            return w1Var;
        }
        w1 j4 = w1.j();
        a0Var.unknownFields = j4;
        return j4;
    }

    private <K, V> void w0(c2 c2Var, int r32, Object obj, int r5) {
        if (obj != null) {
            c2Var.d(r32, this.f3157q.h(u(r5)), this.f3157q.b(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01cd, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01df, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f1, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0202, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0213, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0224, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0246, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        if (I(r17, r10, r5) != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0257, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0310, code lost:
    
        r3 = com.google.protobuf.m.t(r10, (com.google.protobuf.v0) r2.getObject(r17, r13), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x030e, code lost:
    
        if ((r8 & r15) != 0) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x033b, code lost:
    
        if ((r8 & r15) != 0) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0344, code lost:
    
        if ((r8 & r15) != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0369, code lost:
    
        if ((r8 & r15) != 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0378, code lost:
    
        if ((r8 & r15) != 0) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x03a5, code lost:
    
        if ((r8 & r15) != 0) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (I(r17, r10, r5) != false) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x033d, code lost:
    
        r3 = com.google.protobuf.m.O(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
    
        if (I(r17, r10, r5) != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0346, code lost:
    
        r4 = com.google.protobuf.m.M(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (I(r17, r10, r5) != false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x036b, code lost:
    
        r3 = com.google.protobuf.m.h(r10, (com.google.protobuf.j) r2.getObject(r17, r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
    
        if (I(r17, r10, r5) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x037a, code lost:
    
        r3 = com.google.protobuf.p1.o(r10, r2.getObject(r17, r13), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00de, code lost:
    
        if (I(r17, r10, r5) != false) goto L207;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x03a7, code lost:
    
        r3 = com.google.protobuf.m.e(r10, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x025d, code lost:
    
        r4 = (com.google.protobuf.m.W(r10) + com.google.protobuf.m.Y(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0259, code lost:
    
        r2.putInt(r17, r12, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0185, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0197, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a9, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01bb, code lost:
    
        if (r16.f3149i != false) goto L150;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int x(T r17) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.x(java.lang.Object):int");
    }

    private void x0(int r22, Object obj, c2 c2Var) {
        if (obj instanceof String) {
            c2Var.w(r22, (String) obj);
        } else {
            c2Var.v(r22, (j) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x012a, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0214, code lost:
    
        r6 = (com.google.protobuf.m.W(r8) + com.google.protobuf.m.Y(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0210, code lost:
    
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x013c, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x014e, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0160, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0172, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0184, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0196, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01a8, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01b9, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x01ca, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01db, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01ec, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x01fd, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x020e, code lost:
    
        if (r15.f3149i != false) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0334, code lost:
    
        if ((r6 instanceof com.google.protobuf.j) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a6, code lost:
    
        if ((r6 instanceof com.google.protobuf.j) != false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
    
        r6 = com.google.protobuf.m.U(r8, (java.lang.String) r6);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int y(T r16) {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.y(java.lang.Object):int");
    }

    private <UT, UB> void y0(v1<UT, UB> v1Var, T t4, c2 c2Var) {
        v1Var.t(v1Var.g(t4), c2Var);
    }

    private <UT, UB> int z(v1<UT, UB> v1Var, T t4) {
        return v1Var.h(v1Var.g(t4));
    }

    @Override // com.google.protobuf.n1
    public void a(T t4, T t5) {
        Objects.requireNonNull(t5);
        for (int r02 = 0; r02 < this.f3141a.length; r02 += 3) {
            Q(t4, t5, r02);
        }
        p1.G(this.f3155o, t4, t5);
        if (this.f3146f) {
            p1.E(this.f3156p, t4, t5);
        }
    }

    @Override // com.google.protobuf.n1
    public final boolean b(T t4) {
        int r15;
        int r16;
        int r02 = 1048575;
        int r12 = 0;
        int r10 = 0;
        while (r10 < this.f3151k) {
            int r11 = this.f3150j[r10];
            int U = U(r11);
            int s02 = s0(r11);
            int r22 = this.f3141a[r11 + 2];
            int r4 = r22 & 1048575;
            int r14 = 1 << (r22 >>> 20);
            if (r4 != r02) {
                if (r4 != 1048575) {
                    r12 = f3140s.getInt(t4, r4);
                }
                r16 = r12;
                r15 = r4;
            } else {
                r15 = r02;
                r16 = r12;
            }
            if (J(s02) && !D(t4, r11, r15, r16, r14)) {
                return false;
            }
            int r03 = r0(s02);
            if (r03 != 9 && r03 != 17) {
                if (r03 != 27) {
                    if (r03 == 60 || r03 == 68) {
                        if (I(t4, U, r11) && !E(t4, s02, v(r11))) {
                            return false;
                        }
                    } else if (r03 != 49) {
                        if (r03 == 50 && !G(t4, s02, r11)) {
                            return false;
                        }
                    }
                }
                if (!F(t4, s02, r11)) {
                    return false;
                }
            } else if (D(t4, r11, r15, r16, r14) && !E(t4, s02, v(r11))) {
                return false;
            }
            r10++;
            r02 = r15;
            r12 = r16;
        }
        return !this.f3146f || this.f3156p.c(t4).p();
    }

    @Override // com.google.protobuf.n1
    public void c(T t4, l1 l1Var, r rVar) {
        Objects.requireNonNull(rVar);
        M(this.f3155o, this.f3156p, t4, l1Var, rVar);
    }

    @Override // com.google.protobuf.n1
    public boolean d(T t4, T t5) {
        int length = this.f3141a.length;
        for (int r22 = 0; r22 < length; r22 += 3) {
            if (!p(t4, t5, r22)) {
                return false;
            }
        }
        if (!this.f3155o.g(t4).equals(this.f3155o.g(t5))) {
            return false;
        }
        if (this.f3146f) {
            return this.f3156p.c(t4).equals(this.f3156p.c(t5));
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:99:0x008c. Please report as an issue. */
    int d0(T t4, byte[] bArr, int r31, int r32, int r33, f.b bVar) {
        Unsafe unsafe;
        int r8;
        y0<T> y0Var;
        int r12;
        T t5;
        int r4;
        int r17;
        int r22;
        int r9;
        int r23;
        int r24;
        int r21;
        int r82;
        int r11;
        T t6;
        T t7;
        long j4;
        int r13;
        int r5;
        T t8;
        long j5;
        Object obj;
        int r15;
        int r19;
        y0<T> y0Var2 = this;
        T t9 = t4;
        byte[] bArr2 = bArr;
        int r132 = r32;
        int r112 = r33;
        f.b bVar2 = bVar;
        Unsafe unsafe2 = f3140s;
        int r02 = r31;
        int r14 = -1;
        int r25 = 0;
        int r34 = 0;
        int r52 = 0;
        int r6 = 1048575;
        while (true) {
            if (r02 < r132) {
                int r35 = r02 + 1;
                byte b5 = bArr2[r02];
                if (b5 < 0) {
                    int H = f.H(b5, bArr2, r35, bVar2);
                    r4 = bVar2.f2862a;
                    r35 = H;
                } else {
                    r4 = b5;
                }
                int r03 = r4 >>> 3;
                int r7 = r4 & 7;
                int h02 = r03 > r14 ? y0Var2.h0(r03, r25 / 3) : y0Var2.g0(r03);
                if (h02 == -1) {
                    r17 = r03;
                    r22 = r35;
                    r9 = r4;
                    r23 = r52;
                    r24 = r6;
                    unsafe = unsafe2;
                    r8 = r112;
                    r21 = 0;
                } else {
                    int r16 = y0Var2.f3141a[h02 + 1];
                    int r04 = r0(r16);
                    long V = V(r16);
                    int r192 = r4;
                    if (r04 <= 17) {
                        int r42 = y0Var2.f3141a[h02 + 2];
                        int r212 = 1 << (r42 >>> 20);
                        int r43 = r42 & 1048575;
                        if (r43 != r6) {
                            if (r6 != 1048575) {
                                unsafe2.putInt(t9, r6, r52);
                            }
                            r52 = unsafe2.getInt(t9, r43);
                            r24 = r43;
                        } else {
                            r24 = r6;
                        }
                        int r62 = r52;
                        switch (r04) {
                            case 0:
                                t6 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 1) {
                                    z1.R(t6, V, f.d(bArr2, r35));
                                    r02 = r35 + 8;
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 1:
                                t6 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 5) {
                                    z1.S(t6, V, f.l(bArr2, r35));
                                    r02 = r35 + 4;
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 2:
                            case 3:
                                T t10 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 0) {
                                    int L = f.L(bArr2, r35, bVar2);
                                    t7 = t10;
                                    unsafe2.putLong(t4, V, bVar2.f2863b);
                                    r52 = r62 | r212;
                                    r02 = L;
                                    r25 = r82;
                                    r34 = r11;
                                    t9 = t7;
                                    r14 = r17;
                                    r6 = r24;
                                    r132 = r32;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 4:
                            case 11:
                                t6 = t9;
                                r82 = h02;
                                r17 = r03;
                                j4 = V;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 0) {
                                    r02 = f.I(bArr2, r35, bVar2);
                                    r13 = bVar2.f2862a;
                                    unsafe2.putInt(t6, j4, r13);
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 5:
                            case 14:
                                T t11 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 1) {
                                    t7 = t11;
                                    unsafe2.putLong(t4, V, f.j(bArr2, r35));
                                    r02 = r35 + 8;
                                    r52 = r62 | r212;
                                    r25 = r82;
                                    r34 = r11;
                                    t9 = t7;
                                    r14 = r17;
                                    r6 = r24;
                                    r132 = r32;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 6:
                            case 13:
                                r5 = r32;
                                t8 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 5) {
                                    unsafe2.putInt(t8, V, f.h(bArr2, r35));
                                    r02 = r35 + 4;
                                    int r18 = r62 | r212;
                                    t9 = t8;
                                    r132 = r5;
                                    r25 = r82;
                                    r34 = r11;
                                    r6 = r24;
                                    r112 = r33;
                                    r52 = r18;
                                    r14 = r17;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 7:
                                r5 = r32;
                                t8 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 0) {
                                    r02 = f.L(bArr2, r35, bVar2);
                                    z1.L(t8, V, bVar2.f2863b != 0);
                                    int r182 = r62 | r212;
                                    t9 = t8;
                                    r132 = r5;
                                    r25 = r82;
                                    r34 = r11;
                                    r6 = r24;
                                    r112 = r33;
                                    r52 = r182;
                                    r14 = r17;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 8:
                                r5 = r32;
                                t8 = t9;
                                r82 = h02;
                                r17 = r03;
                                j5 = V;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 2) {
                                    r02 = (r16 & 536870912) == 0 ? f.C(bArr2, r35, bVar2) : f.F(bArr2, r35, bVar2);
                                    obj = bVar2.f2864c;
                                    unsafe2.putObject(t8, j5, obj);
                                    int r1822 = r62 | r212;
                                    t9 = t8;
                                    r132 = r5;
                                    r25 = r82;
                                    r34 = r11;
                                    r6 = r24;
                                    r112 = r33;
                                    r52 = r1822;
                                    r14 = r17;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                t8 = t9;
                                r82 = h02;
                                r17 = r03;
                                j5 = V;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 2) {
                                    r5 = r32;
                                    r02 = f.p(y0Var2.v(r82), bArr2, r35, r5, bVar2);
                                    obj = (r62 & r212) == 0 ? bVar2.f2864c : d0.h(unsafe2.getObject(t8, j5), bVar2.f2864c);
                                    unsafe2.putObject(t8, j5, obj);
                                    int r18222 = r62 | r212;
                                    t9 = t8;
                                    r132 = r5;
                                    r25 = r82;
                                    r34 = r11;
                                    r6 = r24;
                                    r112 = r33;
                                    r52 = r18222;
                                    r14 = r17;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                t6 = t9;
                                r82 = h02;
                                r17 = r03;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 == 2) {
                                    r02 = f.b(bArr2, r35, bVar2);
                                    unsafe2.putObject(t6, V, bVar2.f2864c);
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 12:
                                t6 = t9;
                                r82 = h02;
                                r17 = r03;
                                j4 = V;
                                r11 = r192;
                                bArr2 = bArr;
                                if (r7 != 0) {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                } else {
                                    r02 = f.I(bArr2, r35, bVar2);
                                    r13 = bVar2.f2862a;
                                    d0.e t12 = y0Var2.t(r82);
                                    if (t12 != null && !t12.a(r13)) {
                                        w(t4).m(r11, Long.valueOf(r13));
                                        r132 = r32;
                                        t9 = t6;
                                        r52 = r62;
                                        r25 = r82;
                                        r34 = r11;
                                        r14 = r17;
                                        r6 = r24;
                                        r112 = r33;
                                        break;
                                    }
                                    unsafe2.putInt(t6, j4, r13);
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                }
                                break;
                            case 15:
                                j4 = V;
                                r82 = h02;
                                r11 = r192;
                                bArr2 = bArr;
                                r17 = r03;
                                if (r7 == 0) {
                                    r02 = f.I(bArr2, r35, bVar2);
                                    r13 = k.b(bVar2.f2862a);
                                    t6 = t4;
                                    unsafe2.putInt(t6, j4, r13);
                                    r52 = r62 | r212;
                                    r132 = r32;
                                    t9 = t6;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case 16:
                                r82 = h02;
                                r17 = r03;
                                if (r7 == 0) {
                                    bArr2 = bArr;
                                    int L2 = f.L(bArr2, r35, bVar2);
                                    r11 = r192;
                                    unsafe2.putLong(t4, V, k.c(bVar2.f2863b));
                                    r52 = r62 | r212;
                                    t9 = t4;
                                    r132 = r32;
                                    r02 = L2;
                                    r25 = r82;
                                    r34 = r11;
                                    r14 = r17;
                                    r6 = r24;
                                    r112 = r33;
                                    break;
                                } else {
                                    r11 = r192;
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (r7 == 3) {
                                    r02 = f.n(y0Var2.v(h02), bArr, r35, r32, (r03 << 3) | 4, bVar);
                                    unsafe2.putObject(t9, V, (r62 & r212) == 0 ? bVar2.f2864c : d0.h(unsafe2.getObject(t9, V), bVar2.f2864c));
                                    r52 = r62 | r212;
                                    bArr2 = bArr;
                                    r132 = r32;
                                    r112 = r33;
                                    r34 = r192;
                                    r25 = h02;
                                    r14 = r03;
                                    r6 = r24;
                                    break;
                                } else {
                                    r82 = h02;
                                    r17 = r03;
                                    r11 = r192;
                                    r22 = r35;
                                    r23 = r62;
                                    r21 = r82;
                                    unsafe = unsafe2;
                                    r9 = r11;
                                    r8 = r33;
                                    break;
                                }
                            default:
                                r82 = h02;
                                r11 = r192;
                                r17 = r03;
                                r22 = r35;
                                r23 = r62;
                                r21 = r82;
                                unsafe = unsafe2;
                                r9 = r11;
                                r8 = r33;
                                break;
                        }
                    } else {
                        r17 = r03;
                        T t13 = t9;
                        bArr2 = bArr;
                        if (r04 != 27) {
                            r21 = h02;
                            r23 = r52;
                            r24 = r6;
                            if (r04 <= 49) {
                                int r44 = r35;
                                unsafe = unsafe2;
                                r19 = r192;
                                r02 = f0(t4, bArr, r35, r32, r192, r17, r7, r21, r16, r04, V, bVar);
                                if (r02 != r44) {
                                    y0Var2 = this;
                                    t9 = t4;
                                    bArr2 = bArr;
                                    r132 = r32;
                                    r112 = r33;
                                    bVar2 = bVar;
                                    r14 = r17;
                                    r34 = r19;
                                    r25 = r21;
                                    r52 = r23;
                                    r6 = r24;
                                    unsafe2 = unsafe;
                                } else {
                                    r8 = r33;
                                    r22 = r02;
                                    r9 = r19;
                                }
                            } else {
                                r15 = r35;
                                unsafe = unsafe2;
                                r19 = r192;
                                if (r04 != 50) {
                                    r02 = c0(t4, bArr, r15, r32, r19, r17, r7, r16, r04, V, r21, bVar);
                                    if (r02 != r15) {
                                        y0Var2 = this;
                                        t9 = t4;
                                        bArr2 = bArr;
                                        r132 = r32;
                                        r112 = r33;
                                        bVar2 = bVar;
                                        r14 = r17;
                                        r34 = r19;
                                        r25 = r21;
                                        r52 = r23;
                                        r6 = r24;
                                        unsafe2 = unsafe;
                                    } else {
                                        r8 = r33;
                                        r22 = r02;
                                        r9 = r19;
                                    }
                                } else if (r7 == 2) {
                                    r02 = b0(t4, bArr, r15, r32, r21, V, bVar);
                                    if (r02 != r15) {
                                        y0Var2 = this;
                                        t9 = t4;
                                        bArr2 = bArr;
                                        r132 = r32;
                                        r112 = r33;
                                        bVar2 = bVar;
                                        r14 = r17;
                                        r34 = r19;
                                        r25 = r21;
                                        r52 = r23;
                                        r6 = r24;
                                        unsafe2 = unsafe;
                                    } else {
                                        r8 = r33;
                                        r22 = r02;
                                        r9 = r19;
                                    }
                                }
                            }
                        } else if (r7 == 2) {
                            d0.i iVar = (d0.i) unsafe2.getObject(t13, V);
                            if (!iVar.n()) {
                                int size = iVar.size();
                                iVar = iVar.k(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t13, V, iVar);
                            }
                            r24 = r6;
                            r02 = f.q(y0Var2.v(h02), r192, bArr, r35, r32, iVar, bVar);
                            t9 = t4;
                            r132 = r32;
                            r34 = r192;
                            r14 = r17;
                            r25 = h02;
                            r52 = r52;
                            r6 = r24;
                            r112 = r33;
                        } else {
                            r21 = h02;
                            r23 = r52;
                            r24 = r6;
                            r15 = r35;
                            unsafe = unsafe2;
                            r19 = r192;
                        }
                        r8 = r33;
                        r22 = r15;
                        r9 = r19;
                    }
                }
                if (r9 != r8 || r8 == 0) {
                    r02 = (!this.f3146f || bVar.f2865d == r.b()) ? f.G(r9, bArr, r22, r32, w(t4), bVar) : f.g(r9, bArr, r22, r32, t4, this.f3145e, this.f3155o, bVar);
                    t9 = t4;
                    bArr2 = bArr;
                    r132 = r32;
                    r34 = r9;
                    y0Var2 = this;
                    bVar2 = bVar;
                    r14 = r17;
                    r25 = r21;
                    r52 = r23;
                    r6 = r24;
                    unsafe2 = unsafe;
                    r112 = r8;
                } else {
                    r12 = 1048575;
                    y0Var = this;
                    r02 = r22;
                    r34 = r9;
                    r52 = r23;
                    r6 = r24;
                }
            } else {
                unsafe = unsafe2;
                r8 = r112;
                y0Var = y0Var2;
                r12 = 1048575;
            }
        }
        if (r6 != r12) {
            t5 = t4;
            unsafe.putInt(t5, r6, r52);
        } else {
            t5 = t4;
        }
        w1 w1Var = null;
        for (int r26 = y0Var.f3151k; r26 < y0Var.f3152l; r26++) {
            w1Var = (w1) y0Var.q(t5, y0Var.f3150j[r26], w1Var, y0Var.f3155o);
        }
        if (w1Var != null) {
            y0Var.f3155o.o(t5, w1Var);
        }
        if (r8 == 0) {
            if (r02 != r32) {
                throw e0.h();
            }
        } else if (r02 > r32 || r34 != r8) {
            throw e0.h();
        }
        return r02;
    }

    @Override // com.google.protobuf.n1
    public void e(T t4, byte[] bArr, int r11, int r12, f.b bVar) {
        if (this.f3148h) {
            e0(t4, bArr, r11, r12, bVar);
        } else {
            d0(t4, bArr, r11, r12, 0, bVar);
        }
    }

    @Override // com.google.protobuf.n1
    public int f(T t4) {
        return this.f3148h ? y(t4) : x(t4);
    }

    @Override // com.google.protobuf.n1
    public T g() {
        return (T) this.f3153m.a(this.f3145e);
    }

    @Override // com.google.protobuf.n1
    public void h(T t4, c2 c2Var) {
        if (c2Var.n() == c2.a.DESCENDING) {
            v0(t4, c2Var);
        } else if (this.f3148h) {
            u0(t4, c2Var);
        } else {
            t0(t4, c2Var);
        }
    }

    @Override // com.google.protobuf.n1
    public void i(T t4) {
        int r12;
        int r02 = this.f3151k;
        while (true) {
            r12 = this.f3152l;
            if (r02 >= r12) {
                break;
            }
            long V = V(s0(this.f3150j[r02]));
            Object G = z1.G(t4, V);
            if (G != null) {
                z1.V(t4, V, this.f3157q.g(G));
            }
            r02++;
        }
        int length = this.f3150j.length;
        while (r12 < length) {
            this.f3154n.c(t4, this.f3150j[r12]);
            r12++;
        }
        this.f3155o.j(t4);
        if (this.f3146f) {
            this.f3156p.f(t4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00cc, code lost:
    
        if (r3 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00e0, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00de, code lost:
    
        if (r3 != null) goto L68;
     */
    @Override // com.google.protobuf.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int j(T r9) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.y0.j(java.lang.Object):int");
    }
}
