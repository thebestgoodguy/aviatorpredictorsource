package com.google.android.gms.internal.p000firebaseauthapi;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;
import x1.x;

/* loaded from: classes.dex */
final class h0<T> implements q0<T> {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f1692q = new int[0];

    /* renamed from: r, reason: collision with root package name */
    private static final Unsafe f1693r = s1.l();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f1694a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f1695b;

    /* renamed from: c, reason: collision with root package name */
    private final int f1696c;

    /* renamed from: d, reason: collision with root package name */
    private final int f1697d;

    /* renamed from: e, reason: collision with root package name */
    private final e0 f1698e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f1699f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f1700g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1701h;

    /* renamed from: i, reason: collision with root package name */
    private final int[] f1702i;

    /* renamed from: j, reason: collision with root package name */
    private final int f1703j;

    /* renamed from: k, reason: collision with root package name */
    private final int f1704k;

    /* renamed from: l, reason: collision with root package name */
    private final r f1705l;

    /* renamed from: m, reason: collision with root package name */
    private final i1 f1706m;

    /* renamed from: n, reason: collision with root package name */
    private final zr f1707n;

    /* renamed from: o, reason: collision with root package name */
    private final j0 f1708o;

    /* renamed from: p, reason: collision with root package name */
    private final y f1709p;

    private h0(int[] r6, Object[] objArr, int r8, int r9, e0 e0Var, boolean z4, boolean z5, int[] r13, int r14, int r15, j0 j0Var, r rVar, i1 i1Var, zr zrVar, y yVar, byte[] bArr) {
        this.f1694a = r6;
        this.f1695b = objArr;
        this.f1696c = r8;
        this.f1697d = r9;
        this.f1700g = e0Var instanceof ks;
        this.f1701h = z4;
        boolean z6 = false;
        if (zrVar != null && zrVar.h(e0Var)) {
            z6 = true;
        }
        this.f1699f = z6;
        this.f1702i = r13;
        this.f1703j = r14;
        this.f1704k = r15;
        this.f1708o = j0Var;
        this.f1705l = rVar;
        this.f1706m = i1Var;
        this.f1707n = zrVar;
        this.f1698e = e0Var;
        this.f1709p = yVar;
    }

    private final boolean A(Object obj, int r11) {
        int X = X(r11);
        long j4 = X & 1048575;
        if (j4 != 1048575) {
            return (s1.h(obj, j4) & (1 << (X >>> 20))) != 0;
        }
        int m4 = m(r11);
        long j5 = m4 & 1048575;
        switch (l(m4)) {
            case 0:
                return Double.doubleToRawLongBits(s1.f(obj, j5)) != 0;
            case 1:
                return Float.floatToRawIntBits(s1.g(obj, j5)) != 0;
            case 2:
                return s1.i(obj, j5) != 0;
            case 3:
                return s1.i(obj, j5) != 0;
            case 4:
                return s1.h(obj, j5) != 0;
            case 5:
                return s1.i(obj, j5) != 0;
            case 6:
                return s1.h(obj, j5) != 0;
            case 7:
                return s1.B(obj, j5);
            case 8:
                Object k4 = s1.k(obj, j5);
                if (k4 instanceof String) {
                    return !((String) k4).isEmpty();
                }
                if (k4 instanceof hr) {
                    return !hr.f1739f.equals(k4);
                }
                throw new IllegalArgumentException();
            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return s1.k(obj, j5) != null;
            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return !hr.f1739f.equals(s1.k(obj, j5));
            case 11:
                return s1.h(obj, j5) != 0;
            case 12:
                return s1.h(obj, j5) != 0;
            case 13:
                return s1.h(obj, j5) != 0;
            case 14:
                return s1.i(obj, j5) != 0;
            case 15:
                return s1.h(obj, j5) != 0;
            case 16:
                return s1.i(obj, j5) != 0;
            case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return s1.k(obj, j5) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean B(Object obj, int r32, int r4, int r5, int r6) {
        return r4 == 1048575 ? A(obj, r32) : (r5 & r6) != 0;
    }

    private static boolean C(Object obj, int r32, q0 q0Var) {
        return q0Var.i(s1.k(obj, r32 & 1048575));
    }

    private final boolean D(Object obj, int r4, int r5) {
        return s1.h(obj, (long) (X(r5) & 1048575)) == r4;
    }

    private static boolean E(Object obj, long j4) {
        return ((Boolean) s1.k(obj, j4)).booleanValue();
    }

    private final void F(Object obj, ur urVar) {
        int r11;
        if (this.f1699f) {
            this.f1707n.a(obj);
            throw null;
        }
        int length = this.f1694a.length;
        Unsafe unsafe = f1693r;
        int r5 = 1048575;
        int r7 = 0;
        int r8 = 0;
        int r9 = 1048575;
        while (r7 < length) {
            int m4 = m(r7);
            int[] r112 = this.f1694a;
            int r12 = r112[r7];
            int l4 = l(m4);
            if (l4 <= 17) {
                int r113 = r112[r7 + 2];
                int r14 = r113 & r5;
                if (r14 != r9) {
                    r8 = unsafe.getInt(obj, r14);
                    r9 = r14;
                }
                r11 = 1 << (r113 >>> 20);
            } else {
                r11 = 0;
            }
            long j4 = m4 & r5;
            switch (l4) {
                case 0:
                    if ((r8 & r11) == 0) {
                        break;
                    } else {
                        urVar.q(r12, s1.f(obj, j4));
                        continue;
                    }
                case 1:
                    if ((r8 & r11) != 0) {
                        urVar.z(r12, s1.g(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((r8 & r11) != 0) {
                        urVar.E(r12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((r8 & r11) != 0) {
                        urVar.j(r12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((r8 & r11) != 0) {
                        urVar.C(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((r8 & r11) != 0) {
                        urVar.x(r12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((r8 & r11) != 0) {
                        urVar.v(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((r8 & r11) != 0) {
                        urVar.m(r12, s1.B(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((r8 & r11) != 0) {
                        H(r12, unsafe.getObject(obj, j4), urVar);
                        break;
                    } else {
                        continue;
                    }
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if ((r8 & r11) != 0) {
                        urVar.G(r12, unsafe.getObject(obj, j4), p(r7));
                        break;
                    } else {
                        continue;
                    }
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if ((r8 & r11) != 0) {
                        urVar.o(r12, (hr) unsafe.getObject(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((r8 & r11) != 0) {
                        urVar.h(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((r8 & r11) != 0) {
                        urVar.t(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((r8 & r11) != 0) {
                        urVar.H(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((r8 & r11) != 0) {
                        urVar.J(r12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((r8 & r11) != 0) {
                        urVar.a(r12, unsafe.getInt(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((r8 & r11) != 0) {
                        urVar.c(r12, unsafe.getLong(obj, j4));
                        break;
                    } else {
                        continue;
                    }
                case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if ((r8 & r11) != 0) {
                        urVar.B(r12, unsafe.getObject(obj, j4), p(r7));
                        break;
                    } else {
                        continue;
                    }
                case x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    s0.l(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 19:
                    s0.p(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 20:
                    s0.s(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 21:
                    s0.B(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 22:
                    s0.r(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 23:
                    s0.o(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 24:
                    s0.n(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 25:
                    s0.j(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    continue;
                case 26:
                    s0.y(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar);
                    break;
                case 27:
                    s0.t(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, p(r7));
                    break;
                case 28:
                    s0.k(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar);
                    break;
                case 29:
                    s0.z(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 30:
                    s0.m(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 31:
                    s0.u(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 32:
                    s0.v(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 33:
                    s0.w(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 34:
                    s0.x(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, false);
                    break;
                case 35:
                    s0.l(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 36:
                    s0.p(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 37:
                    s0.s(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 38:
                    s0.B(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 39:
                    s0.r(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 40:
                    s0.o(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 41:
                    s0.n(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 42:
                    s0.j(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 43:
                    s0.z(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 44:
                    s0.m(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 45:
                    s0.u(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 46:
                    s0.v(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 47:
                    s0.w(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 48:
                    s0.x(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, true);
                    break;
                case 49:
                    s0.q(this.f1694a[r7], (List) unsafe.getObject(obj, j4), urVar, p(r7));
                    break;
                case 50:
                    G(urVar, r12, unsafe.getObject(obj, j4), r7);
                    break;
                case 51:
                    if (D(obj, r12, r7)) {
                        urVar.q(r12, M(obj, j4));
                        break;
                    }
                    break;
                case 52:
                    if (D(obj, r12, r7)) {
                        urVar.z(r12, N(obj, j4));
                        break;
                    }
                    break;
                case 53:
                    if (D(obj, r12, r7)) {
                        urVar.E(r12, n(obj, j4));
                        break;
                    }
                    break;
                case 54:
                    if (D(obj, r12, r7)) {
                        urVar.j(r12, n(obj, j4));
                        break;
                    }
                    break;
                case 55:
                    if (D(obj, r12, r7)) {
                        urVar.C(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 56:
                    if (D(obj, r12, r7)) {
                        urVar.x(r12, n(obj, j4));
                        break;
                    }
                    break;
                case 57:
                    if (D(obj, r12, r7)) {
                        urVar.v(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 58:
                    if (D(obj, r12, r7)) {
                        urVar.m(r12, E(obj, j4));
                        break;
                    }
                    break;
                case 59:
                    if (D(obj, r12, r7)) {
                        H(r12, unsafe.getObject(obj, j4), urVar);
                        break;
                    }
                    break;
                case 60:
                    if (D(obj, r12, r7)) {
                        urVar.G(r12, unsafe.getObject(obj, j4), p(r7));
                        break;
                    }
                    break;
                case 61:
                    if (D(obj, r12, r7)) {
                        urVar.o(r12, (hr) unsafe.getObject(obj, j4));
                        break;
                    }
                    break;
                case 62:
                    if (D(obj, r12, r7)) {
                        urVar.h(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 63:
                    if (D(obj, r12, r7)) {
                        urVar.t(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 64:
                    if (D(obj, r12, r7)) {
                        urVar.H(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 65:
                    if (D(obj, r12, r7)) {
                        urVar.J(r12, n(obj, j4));
                        break;
                    }
                    break;
                case 66:
                    if (D(obj, r12, r7)) {
                        urVar.a(r12, Q(obj, j4));
                        break;
                    }
                    break;
                case 67:
                    if (D(obj, r12, r7)) {
                        urVar.c(r12, n(obj, j4));
                        break;
                    }
                    break;
                case 68:
                    if (D(obj, r12, r7)) {
                        urVar.B(r12, unsafe.getObject(obj, j4), p(r7));
                        break;
                    }
                    break;
            }
            r7 += 3;
            r5 = 1048575;
        }
        i1 i1Var = this.f1706m;
        i1Var.r(i1Var.d(obj), urVar);
    }

    private final void G(ur urVar, int r22, Object obj, int r4) {
        if (obj == null) {
            return;
        }
        throw null;
    }

    private static final void H(int r12, Object obj, ur urVar) {
        if (obj instanceof String) {
            urVar.f(r12, (String) obj);
        } else {
            urVar.o(r12, (hr) obj);
        }
    }

    static j1 J(Object obj) {
        ks ksVar = (ks) obj;
        j1 j1Var = ksVar.zzc;
        if (j1Var != j1.c()) {
            return j1Var;
        }
        j1 e5 = j1.e();
        ksVar.zzc = e5;
        return e5;
    }

    static h0 K(Class cls, a0 a0Var, j0 j0Var, r rVar, i1 i1Var, zr zrVar, y yVar) {
        if (a0Var instanceof o0) {
            return L((o0) a0Var, j0Var, rVar, i1Var, zrVar, yVar);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0260  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.p000firebaseauthapi.h0 L(com.google.android.gms.internal.p000firebaseauthapi.o0 r34, com.google.android.gms.internal.p000firebaseauthapi.j0 r35, com.google.android.gms.internal.p000firebaseauthapi.r r36, com.google.android.gms.internal.p000firebaseauthapi.i1 r37, com.google.android.gms.internal.p000firebaseauthapi.zr r38, com.google.android.gms.internal.p000firebaseauthapi.y r39) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.L(com.google.android.gms.internal.firebase-auth-api.o0, com.google.android.gms.internal.firebase-auth-api.j0, com.google.android.gms.internal.firebase-auth-api.r, com.google.android.gms.internal.firebase-auth-api.i1, com.google.android.gms.internal.firebase-auth-api.zr, com.google.android.gms.internal.firebase-auth-api.y):com.google.android.gms.internal.firebase-auth-api.h0");
    }

    private static double M(Object obj, long j4) {
        return ((Double) s1.k(obj, j4)).doubleValue();
    }

    private static float N(Object obj, long j4) {
        return ((Float) s1.k(obj, j4)).floatValue();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (D(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x016f, code lost:
    
        r3 = com.google.android.gms.internal.p000firebaseauthapi.tr.f(r11 << 3) + 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        if (D(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x015f, code lost:
    
        r3 = com.google.android.gms.internal.p000firebaseauthapi.tr.f(r11 << 3) + 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009e, code lost:
    
        if (D(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012a, code lost:
    
        r3 = Q(r17, r3);
        r4 = com.google.android.gms.internal.p000firebaseauthapi.tr.f(r11 << 3);
        r3 = com.google.android.gms.internal.p000firebaseauthapi.tr.G(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011a, code lost:
    
        if (D(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        if (D(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0128, code lost:
    
        if (D(r17, r11, r5) != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x013e, code lost:
    
        if (D(r17, r11, r5) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0147, code lost:
    
        r6 = r6 + (com.google.android.gms.internal.p000firebaseauthapi.tr.f(r11 << 3) + com.google.android.gms.internal.p000firebaseauthapi.tr.g(n(r17, r3)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        if (D(r17, r11, r5) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015d, code lost:
    
        if (D(r17, r11, r5) != false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
    
        if (D(r17, r11, r5) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01a0, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0251, code lost:
    
        r4 = com.google.android.gms.internal.p000firebaseauthapi.tr.e(r11) + com.google.android.gms.internal.p000firebaseauthapi.tr.f(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ae, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01bc, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01ca, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01d8, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01e6, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f4, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0201, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x020e, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x021b, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0228, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0235, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0242, code lost:
    
        if (r3 > 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x024f, code lost:
    
        if (r3 > 0) goto L116;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int O(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.O(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x030e, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p000firebaseauthapi.hr) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0097, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p000firebaseauthapi.hr) != false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0311, code lost:
    
        r5 = com.google.android.gms.internal.p000firebaseauthapi.tr.f(r6 << 3);
        r4 = com.google.android.gms.internal.p000firebaseauthapi.tr.d((java.lang.String) r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int P(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.P(java.lang.Object):int");
    }

    private static int Q(Object obj, long j4) {
        return ((Integer) s1.k(obj, j4)).intValue();
    }

    private final int R(Object obj, byte[] bArr, int r32, int r4, int r5, long j4, uq uqVar) {
        Unsafe unsafe = f1693r;
        Object r6 = r(r5);
        Object object = unsafe.getObject(obj, j4);
        if (y.b(object)) {
            x b5 = x.a().b();
            y.c(b5, object);
            unsafe.putObject(obj, j4, b5);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int S(Object obj, byte[] bArr, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long j4, int r28, uq uqVar) {
        int m4;
        long j5;
        int r32;
        Object valueOf;
        int j6;
        Object obj2;
        Unsafe unsafe = f1693r;
        long j7 = this.f1694a[r28 + 2] & 1048575;
        switch (r25) {
            case 51:
                if (r23 == 1) {
                    unsafe.putObject(obj, j4, Double.valueOf(Double.longBitsToDouble(vq.n(bArr, r19))));
                    unsafe.putInt(obj, j7, r22);
                    return r19 + 8;
                }
                return r19;
            case 52:
                if (r23 == 5) {
                    unsafe.putObject(obj, j4, Float.valueOf(Float.intBitsToFloat(vq.b(bArr, r19))));
                    unsafe.putInt(obj, j7, r22);
                    return r19 + 4;
                }
                return r19;
            case 53:
            case 54:
                if (r23 == 0) {
                    m4 = vq.m(bArr, r19, uqVar);
                    j5 = uqVar.f2219b;
                    valueOf = Long.valueOf(j5);
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 55:
            case 62:
                if (r23 == 0) {
                    m4 = vq.j(bArr, r19, uqVar);
                    r32 = uqVar.f2218a;
                    valueOf = Integer.valueOf(r32);
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 56:
            case 65:
                if (r23 == 1) {
                    unsafe.putObject(obj, j4, Long.valueOf(vq.n(bArr, r19)));
                    unsafe.putInt(obj, j7, r22);
                    return r19 + 8;
                }
                return r19;
            case 57:
            case 64:
                if (r23 == 5) {
                    unsafe.putObject(obj, j4, Integer.valueOf(vq.b(bArr, r19)));
                    unsafe.putInt(obj, j7, r22);
                    return r19 + 4;
                }
                return r19;
            case 58:
                if (r23 == 0) {
                    m4 = vq.m(bArr, r19, uqVar);
                    valueOf = Boolean.valueOf(uqVar.f2219b != 0);
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 59:
                if (r23 == 2) {
                    j6 = vq.j(bArr, r19, uqVar);
                    int r4 = uqVar.f2218a;
                    if (r4 == 0) {
                        obj2 = "";
                        unsafe.putObject(obj, j4, obj2);
                        unsafe.putInt(obj, j7, r22);
                        return j6;
                    }
                    if ((r24 & 536870912) != 0 && !x1.f(bArr, j6, j6 + r4)) {
                        throw h.d();
                    }
                    unsafe.putObject(obj, j4, new String(bArr, j6, r4, f.f1632b));
                    j6 += r4;
                    unsafe.putInt(obj, j7, r22);
                    return j6;
                }
                return r19;
            case 60:
                if (r23 == 2) {
                    j6 = vq.d(p(r28), bArr, r19, r20, uqVar);
                    Object object = unsafe.getInt(obj, j7) == r22 ? unsafe.getObject(obj, j4) : null;
                    obj2 = uqVar.f2220c;
                    if (object != null) {
                        obj2 = f.g(object, obj2);
                    }
                    unsafe.putObject(obj, j4, obj2);
                    unsafe.putInt(obj, j7, r22);
                    return j6;
                }
                return r19;
            case 61:
                if (r23 == 2) {
                    m4 = vq.a(bArr, r19, uqVar);
                    valueOf = uqVar.f2220c;
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 63:
                if (r23 == 0) {
                    int j8 = vq.j(bArr, r19, uqVar);
                    int r42 = uqVar.f2218a;
                    d o4 = o(r28);
                    if (o4 == null || o4.a()) {
                        unsafe.putObject(obj, j4, Integer.valueOf(r42));
                        unsafe.putInt(obj, j7, r22);
                    } else {
                        J(obj).h(r21, Long.valueOf(r42));
                    }
                    return j8;
                }
                return r19;
            case 66:
                if (r23 == 0) {
                    m4 = vq.j(bArr, r19, uqVar);
                    r32 = lr.l(uqVar.f2218a);
                    valueOf = Integer.valueOf(r32);
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 67:
                if (r23 == 0) {
                    m4 = vq.m(bArr, r19, uqVar);
                    j5 = lr.m(uqVar.f2219b);
                    valueOf = Long.valueOf(j5);
                    unsafe.putObject(obj, j4, valueOf);
                    unsafe.putInt(obj, j7, r22);
                    return m4;
                }
                return r19;
            case 68:
                if (r23 == 3) {
                    j6 = vq.c(p(r28), bArr, r19, r20, (r21 & (-8)) | 4, uqVar);
                    Object object2 = unsafe.getInt(obj, j7) == r22 ? unsafe.getObject(obj, j4) : null;
                    obj2 = uqVar.f2220c;
                    if (object2 != null) {
                        obj2 = f.g(object2, obj2);
                    }
                    unsafe.putObject(obj, j4, obj2);
                    unsafe.putInt(obj, j7, r22);
                    return j6;
                }
                return r19;
            default:
                return r19;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x02cf, code lost:
    
        if (r0 != r5) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d1, code lost:
    
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02e5, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0316, code lost:
    
        if (r0 != r15) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0337, code lost:
    
        if (r0 != r15) goto L103;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x008e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int T(java.lang.Object r31, byte[] r32, int r33, int r34, com.google.android.gms.internal.p000firebaseauthapi.uq r35) {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.T(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.uq):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0156, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0132, code lost:
    
        r12.add(com.google.android.gms.internal.p000firebaseauthapi.hr.B(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0254, code lost:
    
        if (r29.f2219b != 0) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0256, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0259, code lost:
    
        r12.p(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x025c, code lost:
    
        if (r4 >= r19) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x025e, code lost:
    
        r6 = com.google.android.gms.internal.p000firebaseauthapi.vq.j(r17, r4, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0264, code lost:
    
        if (r20 == r29.f2218a) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0267, code lost:
    
        r4 = com.google.android.gms.internal.p000firebaseauthapi.vq.m(r17, r6, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x026f, code lost:
    
        if (r29.f2219b == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0258, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0272, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0259, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0122, code lost:
    
        if (r4 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0124, code lost:
    
        r12.add(com.google.android.gms.internal.p000firebaseauthapi.hr.f1739f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0132, code lost:
    
        if (r1 >= r19) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0134, code lost:
    
        r4 = com.google.android.gms.internal.p000firebaseauthapi.vq.j(r17, r1, r29);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013a, code lost:
    
        if (r20 == r29.f2218a) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x013d, code lost:
    
        r1 = com.google.android.gms.internal.p000firebaseauthapi.vq.j(r17, r4, r29);
        r4 = r29.f2218a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0143, code lost:
    
        if (r4 < 0) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0147, code lost:
    
        if (r4 > (r17.length - r1)) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0149, code lost:
    
        if (r4 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x012a, code lost:
    
        r12.add(com.google.android.gms.internal.p000firebaseauthapi.hr.B(r17, r1, r4));
        r1 = r1 + r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0150, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.h.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0155, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.h.f();
     */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:102:0x01b4 -> B:96:0x0193). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x01f8 -> B:113:0x01cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:156:0x026f -> B:150:0x0256). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0149 -> B:68:0x0124). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int U(java.lang.Object r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.google.android.gms.internal.p000firebaseauthapi.uq r29) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.U(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.google.android.gms.internal.firebase-auth-api.uq):int");
    }

    private final int V(int r22) {
        if (r22 < this.f1696c || r22 > this.f1697d) {
            return -1;
        }
        return k(r22, 0);
    }

    private final int W(int r22, int r32) {
        if (r22 < this.f1696c || r22 > this.f1697d) {
            return -1;
        }
        return k(r22, r32);
    }

    private final int X(int r22) {
        return this.f1694a[r22 + 2];
    }

    private final int k(int r6, int r7) {
        int length = (this.f1694a.length / 3) - 1;
        while (r7 <= length) {
            int r22 = (length + r7) >>> 1;
            int r32 = r22 * 3;
            int r4 = this.f1694a[r32];
            if (r6 == r4) {
                return r32;
            }
            if (r6 < r4) {
                length = r22 - 1;
            } else {
                r7 = r22 + 1;
            }
        }
        return -1;
    }

    private static int l(int r02) {
        return (r02 >>> 20) & 255;
    }

    private final int m(int r22) {
        return this.f1694a[r22 + 1];
    }

    private static long n(Object obj, long j4) {
        return ((Long) s1.k(obj, j4)).longValue();
    }

    private final d o(int r22) {
        int r23 = r22 / 3;
        return (d) this.f1695b[r23 + r23 + 1];
    }

    private final q0 p(int r4) {
        int r42 = r4 / 3;
        int r43 = r42 + r42;
        q0 q0Var = (q0) this.f1695b[r43];
        if (q0Var != null) {
            return q0Var;
        }
        q0 b5 = m0.a().b((Class) this.f1695b[r43 + 1]);
        this.f1695b[r43] = b5;
        return b5;
    }

    private final Object q(Object obj, int r4, Object obj2, i1 i1Var) {
        int r6 = this.f1694a[r4];
        Object k4 = s1.k(obj, m(r4) & 1048575);
        if (k4 == null || o(r4) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object r(int r22) {
        int r23 = r22 / 3;
        return this.f1695b[r23 + r23];
    }

    private static Field s(Class cls, String str) {
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

    private final void t(Object obj, Object obj2, int r6) {
        long m4 = m(r6) & 1048575;
        if (A(obj2, r6)) {
            Object k4 = s1.k(obj, m4);
            Object k5 = s1.k(obj2, m4);
            if (k4 != null && k5 != null) {
                k5 = f.g(k4, k5);
            } else if (k5 == null) {
                return;
            }
            s1.x(obj, m4, k5);
            w(obj, r6);
        }
    }

    private final void u(Object obj, Object obj2, int r7) {
        int m4 = m(r7);
        int r12 = this.f1694a[r7];
        long j4 = m4 & 1048575;
        if (D(obj2, r12, r7)) {
            Object k4 = D(obj, r12, r7) ? s1.k(obj, j4) : null;
            Object k5 = s1.k(obj2, j4);
            if (k4 != null && k5 != null) {
                k5 = f.g(k4, k5);
            } else if (k5 == null) {
                return;
            }
            s1.x(obj, j4, k5);
            x(obj, r12, r7);
        }
    }

    private final void v(Object obj, int r4, p0 p0Var) {
        long j4;
        Object n4;
        if (z(r4)) {
            j4 = r4 & 1048575;
            n4 = p0Var.y();
        } else {
            int r42 = r4 & 1048575;
            if (this.f1700g) {
                j4 = r42;
                n4 = p0Var.M();
            } else {
                j4 = r42;
                n4 = p0Var.n();
            }
        }
        s1.x(obj, j4, n4);
    }

    private final void w(Object obj, int r7) {
        int X = X(r7);
        long j4 = 1048575 & X;
        if (j4 == 1048575) {
            return;
        }
        s1.v(obj, j4, (1 << (X >>> 20)) | s1.h(obj, j4));
    }

    private final void x(Object obj, int r4, int r5) {
        s1.v(obj, X(r5) & 1048575, r4);
    }

    private final boolean y(Object obj, Object obj2, int r32) {
        return A(obj, r32) == A(obj2, r32);
    }

    private static boolean z(int r12) {
        return (r12 & 536870912) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0438, code lost:
    
        if (r6 == r3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x043a, code lost:
    
        r26.putInt(r12, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0440, code lost:
    
        r3 = r9.f1703j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0444, code lost:
    
        if (r3 >= r9.f1704k) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0446, code lost:
    
        r9.q(r12, r9.f1702i[r3], r2, r9.f1706m);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0454, code lost:
    
        if (r7 != 0) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0456, code lost:
    
        if (r0 != r32) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x045d, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.h.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0462, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x045e, code lost:
    
        if (r0 > r32) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0460, code lost:
    
        if (r1 != r7) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0467, code lost:
    
        throw com.google.android.gms.internal.p000firebaseauthapi.h.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final int I(java.lang.Object r29, byte[] r30, int r31, int r32, int r33, com.google.android.gms.internal.p000firebaseauthapi.uq r34) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.I(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.uq):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c8, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
    
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
    
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00da, code lost:
    
        if (r3 != null) goto L67;
     */
    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.h0.a(java.lang.Object):int");
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void b(Object obj) {
        int r12;
        int r02 = this.f1703j;
        while (true) {
            r12 = this.f1704k;
            if (r02 >= r12) {
                break;
            }
            long m4 = m(this.f1702i[r02]) & 1048575;
            Object k4 = s1.k(obj, m4);
            if (k4 != null) {
                ((x) k4).c();
                s1.x(obj, m4, k4);
            }
            r02++;
        }
        int length = this.f1702i.length;
        while (r12 < length) {
            this.f1705l.b(obj, this.f1702i[r12]);
            r12++;
        }
        this.f1706m.m(obj);
        if (this.f1699f) {
            this.f1707n.e(obj);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void c(Object obj, ur urVar) {
        double f5;
        float g5;
        long i4;
        long i5;
        int h5;
        long i6;
        int h6;
        boolean B;
        int h7;
        int h8;
        int h9;
        long i7;
        int h10;
        long i8;
        if (!this.f1701h) {
            F(obj, urVar);
            return;
        }
        if (this.f1699f) {
            this.f1707n.a(obj);
            throw null;
        }
        int length = this.f1694a.length;
        for (int r22 = 0; r22 < length; r22 += 3) {
            int m4 = m(r22);
            int r4 = this.f1694a[r22];
            switch (l(m4)) {
                case 0:
                    if (A(obj, r22)) {
                        f5 = s1.f(obj, m4 & 1048575);
                        urVar.q(r4, f5);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (A(obj, r22)) {
                        g5 = s1.g(obj, m4 & 1048575);
                        urVar.z(r4, g5);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (A(obj, r22)) {
                        i4 = s1.i(obj, m4 & 1048575);
                        urVar.E(r4, i4);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (A(obj, r22)) {
                        i5 = s1.i(obj, m4 & 1048575);
                        urVar.j(r4, i5);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (A(obj, r22)) {
                        h5 = s1.h(obj, m4 & 1048575);
                        urVar.C(r4, h5);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (A(obj, r22)) {
                        i6 = s1.i(obj, m4 & 1048575);
                        urVar.x(r4, i6);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (A(obj, r22)) {
                        h6 = s1.h(obj, m4 & 1048575);
                        urVar.v(r4, h6);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (A(obj, r22)) {
                        B = s1.B(obj, m4 & 1048575);
                        urVar.m(r4, B);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!A(obj, r22)) {
                        break;
                    }
                    H(r4, s1.k(obj, m4 & 1048575), urVar);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (!A(obj, r22)) {
                        break;
                    }
                    urVar.G(r4, s1.k(obj, m4 & 1048575), p(r22));
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!A(obj, r22)) {
                        break;
                    }
                    urVar.o(r4, (hr) s1.k(obj, m4 & 1048575));
                    break;
                case 11:
                    if (A(obj, r22)) {
                        h7 = s1.h(obj, m4 & 1048575);
                        urVar.h(r4, h7);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (A(obj, r22)) {
                        h8 = s1.h(obj, m4 & 1048575);
                        urVar.t(r4, h8);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (A(obj, r22)) {
                        h9 = s1.h(obj, m4 & 1048575);
                        urVar.H(r4, h9);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (A(obj, r22)) {
                        i7 = s1.i(obj, m4 & 1048575);
                        urVar.J(r4, i7);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (A(obj, r22)) {
                        h10 = s1.h(obj, m4 & 1048575);
                        urVar.a(r4, h10);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (A(obj, r22)) {
                        i8 = s1.i(obj, m4 & 1048575);
                        urVar.c(r4, i8);
                        break;
                    } else {
                        break;
                    }
                case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (!A(obj, r22)) {
                        break;
                    }
                    urVar.B(r4, s1.k(obj, m4 & 1048575), p(r22));
                    break;
                case x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    s0.l(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 19:
                    s0.p(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 20:
                    s0.s(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 21:
                    s0.B(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 22:
                    s0.r(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 23:
                    s0.o(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 24:
                    s0.n(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 25:
                    s0.j(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 26:
                    s0.y(r4, (List) s1.k(obj, m4 & 1048575), urVar);
                    break;
                case 27:
                    s0.t(r4, (List) s1.k(obj, m4 & 1048575), urVar, p(r22));
                    break;
                case 28:
                    s0.k(r4, (List) s1.k(obj, m4 & 1048575), urVar);
                    break;
                case 29:
                    s0.z(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 30:
                    s0.m(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 31:
                    s0.u(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 32:
                    s0.v(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 33:
                    s0.w(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 34:
                    s0.x(r4, (List) s1.k(obj, m4 & 1048575), urVar, false);
                    break;
                case 35:
                    s0.l(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 36:
                    s0.p(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 37:
                    s0.s(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 38:
                    s0.B(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 39:
                    s0.r(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 40:
                    s0.o(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 41:
                    s0.n(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 42:
                    s0.j(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 43:
                    s0.z(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 44:
                    s0.m(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 45:
                    s0.u(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 46:
                    s0.v(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 47:
                    s0.w(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 48:
                    s0.x(r4, (List) s1.k(obj, m4 & 1048575), urVar, true);
                    break;
                case 49:
                    s0.q(r4, (List) s1.k(obj, m4 & 1048575), urVar, p(r22));
                    break;
                case 50:
                    G(urVar, r4, s1.k(obj, m4 & 1048575), r22);
                    break;
                case 51:
                    if (D(obj, r4, r22)) {
                        f5 = M(obj, m4 & 1048575);
                        urVar.q(r4, f5);
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, r4, r22)) {
                        g5 = N(obj, m4 & 1048575);
                        urVar.z(r4, g5);
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, r4, r22)) {
                        i4 = n(obj, m4 & 1048575);
                        urVar.E(r4, i4);
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, r4, r22)) {
                        i5 = n(obj, m4 & 1048575);
                        urVar.j(r4, i5);
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, r4, r22)) {
                        h5 = Q(obj, m4 & 1048575);
                        urVar.C(r4, h5);
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, r4, r22)) {
                        i6 = n(obj, m4 & 1048575);
                        urVar.x(r4, i6);
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, r4, r22)) {
                        h6 = Q(obj, m4 & 1048575);
                        urVar.v(r4, h6);
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, r4, r22)) {
                        B = E(obj, m4 & 1048575);
                        urVar.m(r4, B);
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!D(obj, r4, r22)) {
                        break;
                    }
                    H(r4, s1.k(obj, m4 & 1048575), urVar);
                    break;
                case 60:
                    if (!D(obj, r4, r22)) {
                        break;
                    }
                    urVar.G(r4, s1.k(obj, m4 & 1048575), p(r22));
                    break;
                case 61:
                    if (!D(obj, r4, r22)) {
                        break;
                    }
                    urVar.o(r4, (hr) s1.k(obj, m4 & 1048575));
                    break;
                case 62:
                    if (D(obj, r4, r22)) {
                        h7 = Q(obj, m4 & 1048575);
                        urVar.h(r4, h7);
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, r4, r22)) {
                        h8 = Q(obj, m4 & 1048575);
                        urVar.t(r4, h8);
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, r4, r22)) {
                        h9 = Q(obj, m4 & 1048575);
                        urVar.H(r4, h9);
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, r4, r22)) {
                        i7 = n(obj, m4 & 1048575);
                        urVar.J(r4, i7);
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, r4, r22)) {
                        h10 = Q(obj, m4 & 1048575);
                        urVar.a(r4, h10);
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, r4, r22)) {
                        i8 = n(obj, m4 & 1048575);
                        urVar.c(r4, i8);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (!D(obj, r4, r22)) {
                        break;
                    }
                    urVar.B(r4, s1.k(obj, m4 & 1048575), p(r22));
                    break;
            }
        }
        i1 i1Var = this.f1706m;
        i1Var.r(i1Var.d(obj), urVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final Object d() {
        return ((ks) this.f1698e).r(4, null, null);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final int e(Object obj) {
        return this.f1701h ? P(obj) : O(obj);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void f(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int r02 = 0; r02 < this.f1694a.length; r02 += 3) {
            int m4 = m(r02);
            long j4 = 1048575 & m4;
            int r4 = this.f1694a[r02];
            switch (l(m4)) {
                case 0:
                    if (A(obj2, r02)) {
                        s1.t(obj, j4, s1.f(obj2, j4));
                        w(obj, r02);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (A(obj2, r02)) {
                        s1.u(obj, j4, s1.g(obj2, j4));
                        w(obj, r02);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.w(obj, j4, s1.i(obj2, j4));
                    w(obj, r02);
                    break;
                case 3:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.w(obj, j4, s1.i(obj2, j4));
                    w(obj, r02);
                    break;
                case 4:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 5:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.w(obj, j4, s1.i(obj2, j4));
                    w(obj, r02);
                    break;
                case 6:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 7:
                    if (A(obj2, r02)) {
                        s1.r(obj, j4, s1.B(obj2, j4));
                        w(obj, r02);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.x(obj, j4, s1.k(obj2, j4));
                    w(obj, r02);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    t(obj, obj2, r02);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.x(obj, j4, s1.k(obj2, j4));
                    w(obj, r02);
                    break;
                case 11:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 12:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 13:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 14:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.w(obj, j4, s1.i(obj2, j4));
                    w(obj, r02);
                    break;
                case 15:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.v(obj, j4, s1.h(obj2, j4));
                    w(obj, r02);
                    break;
                case 16:
                    if (!A(obj2, r02)) {
                        break;
                    }
                    s1.w(obj, j4, s1.i(obj2, j4));
                    w(obj, r02);
                    break;
                case x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    this.f1705l.c(obj, obj2, j4);
                    break;
                case 50:
                    s0.i(this.f1709p, obj, obj2, j4);
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
                    if (!D(obj2, r4, r02)) {
                        break;
                    }
                    s1.x(obj, j4, s1.k(obj2, j4));
                    x(obj, r4, r02);
                    break;
                case 60:
                case 68:
                    u(obj, obj2, r02);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!D(obj2, r4, r02)) {
                        break;
                    }
                    s1.x(obj, j4, s1.k(obj2, j4));
                    x(obj, r4, r02);
                    break;
            }
        }
        s0.f(this.f1706m, obj, obj2);
        if (this.f1699f) {
            s0.e(this.f1707n, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void g(Object obj, byte[] bArr, int r11, int r12, uq uqVar) {
        if (this.f1701h) {
            T(obj, bArr, r11, r12, uqVar);
        } else {
            I(obj, bArr, r11, r12, 0, uqVar);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final boolean h(Object obj, Object obj2) {
        int length = this.f1694a.length;
        for (int r22 = 0; r22 < length; r22 += 3) {
            int m4 = m(r22);
            long j4 = m4 & 1048575;
            switch (l(m4)) {
                case 0:
                    if (y(obj, obj2, r22) && Double.doubleToLongBits(s1.f(obj, j4)) == Double.doubleToLongBits(s1.f(obj2, j4))) {
                        break;
                    }
                    return false;
                case 1:
                    if (y(obj, obj2, r22) && Float.floatToIntBits(s1.g(obj, j4)) == Float.floatToIntBits(s1.g(obj2, j4))) {
                        break;
                    }
                    return false;
                case 2:
                    if (y(obj, obj2, r22) && s1.i(obj, j4) == s1.i(obj2, j4)) {
                        break;
                    }
                    return false;
                case 3:
                    if (y(obj, obj2, r22) && s1.i(obj, j4) == s1.i(obj2, j4)) {
                        break;
                    }
                    return false;
                case 4:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 5:
                    if (y(obj, obj2, r22) && s1.i(obj, j4) == s1.i(obj2, j4)) {
                        break;
                    }
                    return false;
                case 6:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 7:
                    if (y(obj, obj2, r22) && s1.B(obj, j4) == s1.B(obj2, j4)) {
                        break;
                    }
                    return false;
                case 8:
                    if (y(obj, obj2, r22) && s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        break;
                    }
                    return false;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    if (y(obj, obj2, r22) && s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        break;
                    }
                    return false;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    if (y(obj, obj2, r22) && s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        break;
                    }
                    return false;
                case 11:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 12:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 13:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 14:
                    if (y(obj, obj2, r22) && s1.i(obj, j4) == s1.i(obj2, j4)) {
                        break;
                    }
                    return false;
                case 15:
                    if (y(obj, obj2, r22) && s1.h(obj, j4) == s1.h(obj2, j4)) {
                        break;
                    }
                    return false;
                case 16:
                    if (y(obj, obj2, r22) && s1.i(obj, j4) == s1.i(obj2, j4)) {
                        break;
                    }
                    return false;
                case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    if (y(obj, obj2, r22) && s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        break;
                    }
                    return false;
                case x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
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
                    if (!s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        return false;
                    }
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long X = X(r22) & 1048575;
                    if (s1.h(obj, X) == s1.h(obj2, X) && s0.h(s1.k(obj, j4), s1.k(obj2, j4))) {
                        break;
                    }
                    return false;
            }
        }
        if (!this.f1706m.d(obj).equals(this.f1706m.d(obj2))) {
            return false;
        }
        if (!this.f1699f) {
            return true;
        }
        this.f1707n.a(obj);
        this.f1707n.a(obj2);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final boolean i(Object obj) {
        int r16;
        int r17;
        int r02 = 1048575;
        int r12 = 0;
        int r10 = 0;
        while (r10 < this.f1703j) {
            int r122 = this.f1702i[r10];
            int r13 = this.f1694a[r122];
            int m4 = m(r122);
            int r22 = this.f1694a[r122 + 2];
            int r4 = r22 & 1048575;
            int r15 = 1 << (r22 >>> 20);
            if (r4 != r02) {
                if (r4 != 1048575) {
                    r12 = f1693r.getInt(obj, r4);
                }
                r17 = r12;
                r16 = r4;
            } else {
                r16 = r02;
                r17 = r12;
            }
            if ((268435456 & m4) != 0 && !B(obj, r122, r16, r17, r15)) {
                return false;
            }
            int l4 = l(m4);
            if (l4 != 9 && l4 != 17) {
                if (l4 != 27) {
                    if (l4 == 60 || l4 == 68) {
                        if (D(obj, r13, r122) && !C(obj, m4, p(r122))) {
                            return false;
                        }
                    } else if (l4 != 49) {
                        if (l4 == 50 && !((x) s1.k(obj, m4 & 1048575)).isEmpty()) {
                            throw null;
                        }
                    }
                }
                List list = (List) s1.k(obj, m4 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    q0 p4 = p(r122);
                    for (int r23 = 0; r23 < list.size(); r23++) {
                        if (!p4.i(list.get(r23))) {
                            return false;
                        }
                    }
                }
            } else if (B(obj, r122, r16, r17, r15) && !C(obj, m4, p(r122))) {
                return false;
            }
            r10++;
            r02 = r16;
            r12 = r17;
        }
        if (!this.f1699f) {
            return true;
        }
        this.f1707n.a(obj);
        throw null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.q0
    public final void j(Object obj, p0 p0Var, yr yrVar) {
        long j4;
        Object g5;
        int d5;
        List a5;
        List a6;
        List a7;
        List a8;
        List a9;
        List a10;
        List a11;
        List a12;
        List a13;
        List a14;
        d o4;
        List a15;
        List a16;
        List a17;
        List a18;
        Objects.requireNonNull(yrVar);
        i1 i1Var = this.f1706m;
        zr zrVar = this.f1707n;
        ds dsVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int c5 = p0Var.c();
                int V = V(c5);
                if (V >= 0) {
                    int m4 = m(V);
                    try {
                        switch (l(m4)) {
                            case 0:
                                s1.t(obj, m4 & 1048575, p0Var.a());
                                w(obj, V);
                                break;
                            case 1:
                                s1.u(obj, m4 & 1048575, p0Var.b());
                                w(obj, V);
                                break;
                            case 2:
                                s1.w(obj, m4 & 1048575, p0Var.t());
                                w(obj, V);
                                break;
                            case 3:
                                s1.w(obj, m4 & 1048575, p0Var.g());
                                w(obj, V);
                                break;
                            case 4:
                                s1.v(obj, m4 & 1048575, p0Var.H());
                                w(obj, V);
                                break;
                            case 5:
                                s1.w(obj, m4 & 1048575, p0Var.h());
                                w(obj, V);
                                break;
                            case 6:
                                s1.v(obj, m4 & 1048575, p0Var.v());
                                w(obj, V);
                                break;
                            case 7:
                                s1.r(obj, m4 & 1048575, p0Var.k());
                                w(obj, V);
                                break;
                            case 8:
                                v(obj, m4, p0Var);
                                w(obj, V);
                                break;
                            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                                if (A(obj, V)) {
                                    j4 = m4 & 1048575;
                                    g5 = f.g(s1.k(obj, j4), p0Var.z(p(V), yrVar));
                                    s1.x(obj, j4, g5);
                                    break;
                                } else {
                                    s1.x(obj, m4 & 1048575, p0Var.z(p(V), yrVar));
                                    w(obj, V);
                                    break;
                                }
                            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                                s1.x(obj, m4 & 1048575, p0Var.n());
                                w(obj, V);
                                break;
                            case 11:
                                s1.v(obj, m4 & 1048575, p0Var.p());
                                w(obj, V);
                                break;
                            case 12:
                                d5 = p0Var.d();
                                d o5 = o(V);
                                if (o5 != null && !o5.a()) {
                                    obj2 = s0.d(c5, d5, obj2, i1Var);
                                    break;
                                } else {
                                    s1.v(obj, m4 & 1048575, d5);
                                    w(obj, V);
                                    break;
                                }
                                break;
                            case 13:
                                s1.v(obj, m4 & 1048575, p0Var.f());
                                w(obj, V);
                                break;
                            case 14:
                                s1.w(obj, m4 & 1048575, p0Var.i());
                                w(obj, V);
                                break;
                            case 15:
                                s1.v(obj, m4 & 1048575, p0Var.j());
                                w(obj, V);
                                break;
                            case 16:
                                s1.w(obj, m4 & 1048575, p0Var.l());
                                w(obj, V);
                                break;
                            case x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                                if (A(obj, V)) {
                                    j4 = m4 & 1048575;
                                    g5 = f.g(s1.k(obj, j4), p0Var.L(p(V), yrVar));
                                    s1.x(obj, j4, g5);
                                    break;
                                } else {
                                    s1.x(obj, m4 & 1048575, p0Var.L(p(V), yrVar));
                                    w(obj, V);
                                    break;
                                }
                            case x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                                a5 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.E(a5);
                                break;
                            case 19:
                                a6 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.K(a6);
                                break;
                            case 20:
                                a7 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.x(a7);
                                break;
                            case 21:
                                a8 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.D(a8);
                                break;
                            case 22:
                                a9 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.J(a9);
                                break;
                            case 23:
                                a10 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.A(a10);
                                break;
                            case 24:
                                a11 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.G(a11);
                                break;
                            case 25:
                                a12 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.u(a12);
                                break;
                            case 26:
                                if (z(m4)) {
                                    ((mr) p0Var).N(this.f1705l.a(obj, m4 & 1048575), true);
                                    break;
                                } else {
                                    ((mr) p0Var).N(this.f1705l.a(obj, m4 & 1048575), false);
                                    break;
                                }
                            case 27:
                                p0Var.q(this.f1705l.a(obj, m4 & 1048575), p(V), yrVar);
                                break;
                            case 28:
                                p0Var.I(this.f1705l.a(obj, m4 & 1048575));
                                break;
                            case 29:
                                a13 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.m(a13);
                                break;
                            case 30:
                                a14 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.s(a14);
                                o4 = o(V);
                                obj2 = s0.c(c5, a14, o4, obj2, i1Var);
                                break;
                            case 31:
                                a15 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.w(a15);
                                break;
                            case 32:
                                a16 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.r(a16);
                                break;
                            case 33:
                                a17 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.F(a17);
                                break;
                            case 34:
                                a18 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.o(a18);
                                break;
                            case 35:
                                a5 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.E(a5);
                                break;
                            case 36:
                                a6 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.K(a6);
                                break;
                            case 37:
                                a7 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.x(a7);
                                break;
                            case 38:
                                a8 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.D(a8);
                                break;
                            case 39:
                                a9 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.J(a9);
                                break;
                            case 40:
                                a10 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.A(a10);
                                break;
                            case 41:
                                a11 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.G(a11);
                                break;
                            case 42:
                                a12 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.u(a12);
                                break;
                            case 43:
                                a13 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.m(a13);
                                break;
                            case 44:
                                a14 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.s(a14);
                                o4 = o(V);
                                obj2 = s0.c(c5, a14, o4, obj2, i1Var);
                                break;
                            case 45:
                                a15 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.w(a15);
                                break;
                            case 46:
                                a16 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.r(a16);
                                break;
                            case 47:
                                a17 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.F(a17);
                                break;
                            case 48:
                                a18 = this.f1705l.a(obj, m4 & 1048575);
                                p0Var.o(a18);
                                break;
                            case 49:
                                p0Var.B(this.f1705l.a(obj, m4 & 1048575), p(V), yrVar);
                                break;
                            case 50:
                                Object r4 = r(V);
                                long m5 = m(V) & 1048575;
                                Object k4 = s1.k(obj, m5);
                                if (k4 == null) {
                                    k4 = x.a().b();
                                    s1.x(obj, m5, k4);
                                } else if (y.b(k4)) {
                                    Object b5 = x.a().b();
                                    y.c(b5, k4);
                                    s1.x(obj, m5, b5);
                                    k4 = b5;
                                }
                                throw null;
                                break;
                            case 51:
                                s1.x(obj, m4 & 1048575, Double.valueOf(p0Var.a()));
                                x(obj, c5, V);
                                break;
                            case 52:
                                s1.x(obj, m4 & 1048575, Float.valueOf(p0Var.b()));
                                x(obj, c5, V);
                                break;
                            case 53:
                                s1.x(obj, m4 & 1048575, Long.valueOf(p0Var.t()));
                                x(obj, c5, V);
                                break;
                            case 54:
                                s1.x(obj, m4 & 1048575, Long.valueOf(p0Var.g()));
                                x(obj, c5, V);
                                break;
                            case 55:
                                s1.x(obj, m4 & 1048575, Integer.valueOf(p0Var.H()));
                                x(obj, c5, V);
                                break;
                            case 56:
                                s1.x(obj, m4 & 1048575, Long.valueOf(p0Var.h()));
                                x(obj, c5, V);
                                break;
                            case 57:
                                s1.x(obj, m4 & 1048575, Integer.valueOf(p0Var.v()));
                                x(obj, c5, V);
                                break;
                            case 58:
                                s1.x(obj, m4 & 1048575, Boolean.valueOf(p0Var.k()));
                                x(obj, c5, V);
                                break;
                            case 59:
                                v(obj, m4, p0Var);
                                x(obj, c5, V);
                                break;
                            case 60:
                                int r32 = m4 & 1048575;
                                if (D(obj, c5, V)) {
                                    long j5 = r32;
                                    s1.x(obj, j5, f.g(s1.k(obj, j5), p0Var.z(p(V), yrVar)));
                                } else {
                                    s1.x(obj, r32, p0Var.z(p(V), yrVar));
                                    w(obj, V);
                                }
                                x(obj, c5, V);
                                break;
                            case 61:
                                s1.x(obj, m4 & 1048575, p0Var.n());
                                x(obj, c5, V);
                                break;
                            case 62:
                                s1.x(obj, m4 & 1048575, Integer.valueOf(p0Var.p()));
                                x(obj, c5, V);
                                break;
                            case 63:
                                d5 = p0Var.d();
                                d o6 = o(V);
                                if (o6 != null && !o6.a()) {
                                    obj2 = s0.d(c5, d5, obj2, i1Var);
                                    break;
                                }
                                s1.x(obj, m4 & 1048575, Integer.valueOf(d5));
                                x(obj, c5, V);
                                break;
                            case 64:
                                s1.x(obj, m4 & 1048575, Integer.valueOf(p0Var.f()));
                                x(obj, c5, V);
                                break;
                            case 65:
                                s1.x(obj, m4 & 1048575, Long.valueOf(p0Var.i()));
                                x(obj, c5, V);
                                break;
                            case 66:
                                s1.x(obj, m4 & 1048575, Integer.valueOf(p0Var.j()));
                                x(obj, c5, V);
                                break;
                            case 67:
                                s1.x(obj, m4 & 1048575, Long.valueOf(p0Var.l()));
                                x(obj, c5, V);
                                break;
                            case 68:
                                s1.x(obj, m4 & 1048575, p0Var.L(p(V), yrVar));
                                x(obj, c5, V);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = i1Var.f();
                                }
                                if (!i1Var.p(obj2, p0Var)) {
                                    for (int r14 = this.f1703j; r14 < this.f1704k; r14++) {
                                        obj2 = q(obj, this.f1702i[r14], obj2, i1Var);
                                    }
                                    if (obj2 != null) {
                                        i1Var.n(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (g unused) {
                        i1Var.q(p0Var);
                        if (obj2 == null) {
                            obj2 = i1Var.c(obj);
                        }
                        if (!i1Var.p(obj2, p0Var)) {
                            for (int r142 = this.f1703j; r142 < this.f1704k; r142++) {
                                obj2 = q(obj, this.f1702i[r142], obj2, i1Var);
                            }
                            if (obj2 != null) {
                                i1Var.n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else {
                    if (c5 == Integer.MAX_VALUE) {
                        for (int r143 = this.f1703j; r143 < this.f1704k; r143++) {
                            obj2 = q(obj, this.f1702i[r143], obj2, i1Var);
                        }
                        if (obj2 != null) {
                            i1Var.n(obj, obj2);
                            return;
                        }
                        return;
                    }
                    Object c6 = !this.f1699f ? null : zrVar.c(yrVar, this.f1698e, c5);
                    if (c6 != null) {
                        if (dsVar == null) {
                            dsVar = zrVar.b(obj);
                        }
                        ds dsVar2 = dsVar;
                        obj2 = zrVar.d(p0Var, c6, yrVar, dsVar2, obj2, i1Var);
                        dsVar = dsVar2;
                    } else {
                        i1Var.q(p0Var);
                        if (obj2 == null) {
                            obj2 = i1Var.c(obj);
                        }
                        if (!i1Var.p(obj2, p0Var)) {
                            for (int r144 = this.f1703j; r144 < this.f1704k; r144++) {
                                obj2 = q(obj, this.f1702i[r144], obj2, i1Var);
                            }
                            if (obj2 != null) {
                                i1Var.n(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int r15 = this.f1703j; r15 < this.f1704k; r15++) {
                    obj2 = q(obj, this.f1702i[r15], obj2, i1Var);
                }
                if (obj2 != null) {
                    i1Var.n(obj, obj2);
                }
                throw th;
            }
        }
    }
}
