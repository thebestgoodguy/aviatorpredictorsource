package com.google.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class x {
    public static final x A;
    public static final x B;
    public static final x C;
    public static final x D;
    public static final x E;
    public static final x F;
    public static final x G;
    public static final x H;
    public static final x I;
    public static final x J;
    public static final x K;
    public static final x L;
    public static final x M;
    public static final x N;
    public static final x O;
    public static final x P;
    public static final x Q;
    public static final x R;
    public static final x S;
    public static final x T;
    public static final x U;
    public static final x V;
    public static final x W;
    public static final x X;
    public static final x Y;
    public static final x Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final x f3095a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final x f3096b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final x f3097c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final x f3098d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final x f3099e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final x f3100f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final x f3101g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final x f3102h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final x[] f3103i0;

    /* renamed from: j, reason: collision with root package name */
    public static final x f3104j;

    /* renamed from: j0, reason: collision with root package name */
    private static final Type[] f3105j0;

    /* renamed from: k, reason: collision with root package name */
    public static final x f3106k;

    /* renamed from: k0, reason: collision with root package name */
    private static final /* synthetic */ x[] f3107k0;

    /* renamed from: l, reason: collision with root package name */
    public static final x f3108l;

    /* renamed from: m, reason: collision with root package name */
    public static final x f3109m;

    /* renamed from: n, reason: collision with root package name */
    public static final x f3110n;

    /* renamed from: o, reason: collision with root package name */
    public static final x f3111o;

    /* renamed from: p, reason: collision with root package name */
    public static final x f3112p;

    /* renamed from: q, reason: collision with root package name */
    public static final x f3113q;

    /* renamed from: r, reason: collision with root package name */
    public static final x f3114r;

    /* renamed from: s, reason: collision with root package name */
    public static final x f3115s;

    /* renamed from: t, reason: collision with root package name */
    public static final x f3116t;

    /* renamed from: u, reason: collision with root package name */
    public static final x f3117u;

    /* renamed from: v, reason: collision with root package name */
    public static final x f3118v;

    /* renamed from: w, reason: collision with root package name */
    public static final x f3119w;

    /* renamed from: x, reason: collision with root package name */
    public static final x f3120x;

    /* renamed from: y, reason: collision with root package name */
    public static final x f3121y;

    /* renamed from: z, reason: collision with root package name */
    public static final x f3122z;

    /* renamed from: e, reason: collision with root package name */
    private final g0 f3123e;

    /* renamed from: f, reason: collision with root package name */
    private final int f3124f;

    /* renamed from: g, reason: collision with root package name */
    private final b f3125g;

    /* renamed from: h, reason: collision with root package name */
    private final Class<?> f3126h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f3127i;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3128a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3129b;

        static {
            int[] r02 = new int[g0.values().length];
            f3129b = r02;
            try {
                r02[g0.f2890o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3129b[g0.f2892q.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3129b[g0.f2889n.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] r32 = new int[b.values().length];
            f3128a = r32;
            try {
                r32[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3128a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3128a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);


        /* renamed from: e, reason: collision with root package name */
        private final boolean f3135e;

        b(boolean z4) {
            this.f3135e = z4;
        }
    }

    static {
        b bVar = b.SCALAR;
        g0 g0Var = g0.f2887l;
        x xVar = new x("DOUBLE", 0, 0, bVar, g0Var);
        f3104j = xVar;
        g0 g0Var2 = g0.f2886k;
        x xVar2 = new x("FLOAT", 1, 1, bVar, g0Var2);
        f3106k = xVar2;
        g0 g0Var3 = g0.f2885j;
        x xVar3 = new x("INT64", 2, 2, bVar, g0Var3);
        f3108l = xVar3;
        x xVar4 = new x("UINT64", 3, 3, bVar, g0Var3);
        f3109m = xVar4;
        g0 g0Var4 = g0.f2884i;
        x xVar5 = new x("INT32", 4, 4, bVar, g0Var4);
        f3110n = xVar5;
        x xVar6 = new x("FIXED64", 5, 5, bVar, g0Var3);
        f3111o = xVar6;
        x xVar7 = new x("FIXED32", 6, 6, bVar, g0Var4);
        f3112p = xVar7;
        g0 g0Var5 = g0.f2888m;
        x xVar8 = new x("BOOL", 7, 7, bVar, g0Var5);
        f3113q = xVar8;
        g0 g0Var6 = g0.f2889n;
        x xVar9 = new x("STRING", 8, 8, bVar, g0Var6);
        f3114r = xVar9;
        g0 g0Var7 = g0.f2892q;
        x xVar10 = new x("MESSAGE", 9, 9, bVar, g0Var7);
        f3115s = xVar10;
        g0 g0Var8 = g0.f2890o;
        x xVar11 = new x("BYTES", 10, 10, bVar, g0Var8);
        f3116t = xVar11;
        x xVar12 = new x("UINT32", 11, 11, bVar, g0Var4);
        f3117u = xVar12;
        g0 g0Var9 = g0.f2891p;
        x xVar13 = new x("ENUM", 12, 12, bVar, g0Var9);
        f3118v = xVar13;
        x xVar14 = new x("SFIXED32", 13, 13, bVar, g0Var4);
        f3119w = xVar14;
        x xVar15 = new x("SFIXED64", 14, 14, bVar, g0Var3);
        f3120x = xVar15;
        x xVar16 = new x("SINT32", 15, 15, bVar, g0Var4);
        f3121y = xVar16;
        x xVar17 = new x("SINT64", 16, 16, bVar, g0Var3);
        f3122z = xVar17;
        x xVar18 = new x("GROUP", 17, 17, bVar, g0Var7);
        A = xVar18;
        b bVar2 = b.VECTOR;
        x xVar19 = new x("DOUBLE_LIST", 18, 18, bVar2, g0Var);
        B = xVar19;
        x xVar20 = new x("FLOAT_LIST", 19, 19, bVar2, g0Var2);
        C = xVar20;
        x xVar21 = new x("INT64_LIST", 20, 20, bVar2, g0Var3);
        D = xVar21;
        x xVar22 = new x("UINT64_LIST", 21, 21, bVar2, g0Var3);
        E = xVar22;
        x xVar23 = new x("INT32_LIST", 22, 22, bVar2, g0Var4);
        F = xVar23;
        x xVar24 = new x("FIXED64_LIST", 23, 23, bVar2, g0Var3);
        G = xVar24;
        x xVar25 = new x("FIXED32_LIST", 24, 24, bVar2, g0Var4);
        H = xVar25;
        x xVar26 = new x("BOOL_LIST", 25, 25, bVar2, g0Var5);
        I = xVar26;
        x xVar27 = new x("STRING_LIST", 26, 26, bVar2, g0Var6);
        J = xVar27;
        x xVar28 = new x("MESSAGE_LIST", 27, 27, bVar2, g0Var7);
        K = xVar28;
        x xVar29 = new x("BYTES_LIST", 28, 28, bVar2, g0Var8);
        L = xVar29;
        x xVar30 = new x("UINT32_LIST", 29, 29, bVar2, g0Var4);
        M = xVar30;
        x xVar31 = new x("ENUM_LIST", 30, 30, bVar2, g0Var9);
        N = xVar31;
        x xVar32 = new x("SFIXED32_LIST", 31, 31, bVar2, g0Var4);
        O = xVar32;
        x xVar33 = new x("SFIXED64_LIST", 32, 32, bVar2, g0Var3);
        P = xVar33;
        x xVar34 = new x("SINT32_LIST", 33, 33, bVar2, g0Var4);
        Q = xVar34;
        x xVar35 = new x("SINT64_LIST", 34, 34, bVar2, g0Var3);
        R = xVar35;
        b bVar3 = b.PACKED_VECTOR;
        x xVar36 = new x("DOUBLE_LIST_PACKED", 35, 35, bVar3, g0Var);
        S = xVar36;
        x xVar37 = new x("FLOAT_LIST_PACKED", 36, 36, bVar3, g0Var2);
        T = xVar37;
        x xVar38 = new x("INT64_LIST_PACKED", 37, 37, bVar3, g0Var3);
        U = xVar38;
        x xVar39 = new x("UINT64_LIST_PACKED", 38, 38, bVar3, g0Var3);
        V = xVar39;
        x xVar40 = new x("INT32_LIST_PACKED", 39, 39, bVar3, g0Var4);
        W = xVar40;
        x xVar41 = new x("FIXED64_LIST_PACKED", 40, 40, bVar3, g0Var3);
        X = xVar41;
        x xVar42 = new x("FIXED32_LIST_PACKED", 41, 41, bVar3, g0Var4);
        Y = xVar42;
        x xVar43 = new x("BOOL_LIST_PACKED", 42, 42, bVar3, g0Var5);
        Z = xVar43;
        x xVar44 = new x("UINT32_LIST_PACKED", 43, 43, bVar3, g0Var4);
        f3095a0 = xVar44;
        x xVar45 = new x("ENUM_LIST_PACKED", 44, 44, bVar3, g0Var9);
        f3096b0 = xVar45;
        x xVar46 = new x("SFIXED32_LIST_PACKED", 45, 45, bVar3, g0Var4);
        f3097c0 = xVar46;
        x xVar47 = new x("SFIXED64_LIST_PACKED", 46, 46, bVar3, g0Var3);
        f3098d0 = xVar47;
        x xVar48 = new x("SINT32_LIST_PACKED", 47, 47, bVar3, g0Var4);
        f3099e0 = xVar48;
        x xVar49 = new x("SINT64_LIST_PACKED", 48, 48, bVar3, g0Var3);
        f3100f0 = xVar49;
        x xVar50 = new x("GROUP_LIST", 49, 49, bVar2, g0Var7);
        f3101g0 = xVar50;
        x xVar51 = new x("MAP", 50, 50, b.MAP, g0.f2883h);
        f3102h0 = xVar51;
        f3107k0 = new x[]{xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9, xVar10, xVar11, xVar12, xVar13, xVar14, xVar15, xVar16, xVar17, xVar18, xVar19, xVar20, xVar21, xVar22, xVar23, xVar24, xVar25, xVar26, xVar27, xVar28, xVar29, xVar30, xVar31, xVar32, xVar33, xVar34, xVar35, xVar36, xVar37, xVar38, xVar39, xVar40, xVar41, xVar42, xVar43, xVar44, xVar45, xVar46, xVar47, xVar48, xVar49, xVar50, xVar51};
        f3105j0 = new Type[0];
        x[] values = values();
        f3103i0 = new x[values.length];
        for (x xVar52 : values) {
            f3103i0[xVar52.f3124f] = xVar52;
        }
    }

    private x(String str, int r32, int r4, b bVar, g0 g0Var) {
        int r5;
        this.f3124f = r4;
        this.f3125g = bVar;
        this.f3123e = g0Var;
        int r22 = a.f3128a[bVar.ordinal()];
        this.f3126h = (r22 == 1 || r22 == 2) ? g0Var.d() : null;
        this.f3127i = (bVar != b.SCALAR || (r5 = a.f3129b[g0Var.ordinal()]) == 1 || r5 == 2 || r5 == 3) ? false : true;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) f3107k0.clone();
    }

    public int d() {
        return this.f3124f;
    }
}
