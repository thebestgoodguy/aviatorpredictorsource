package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'i' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: h, reason: collision with root package name */
    public static final g0 f2883h;

    /* renamed from: i, reason: collision with root package name */
    public static final g0 f2884i;

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f2885j;

    /* renamed from: k, reason: collision with root package name */
    public static final g0 f2886k;

    /* renamed from: l, reason: collision with root package name */
    public static final g0 f2887l;

    /* renamed from: m, reason: collision with root package name */
    public static final g0 f2888m;

    /* renamed from: n, reason: collision with root package name */
    public static final g0 f2889n;

    /* renamed from: o, reason: collision with root package name */
    public static final g0 f2890o;

    /* renamed from: p, reason: collision with root package name */
    public static final g0 f2891p;

    /* renamed from: q, reason: collision with root package name */
    public static final g0 f2892q;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ g0[] f2893r;

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f2894e;

    /* renamed from: f, reason: collision with root package name */
    private final Class<?> f2895f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f2896g;

    static {
        g0 g0Var = new g0("VOID", 0, Void.class, Void.class, null);
        f2883h = g0Var;
        Class cls = Integer.TYPE;
        g0 g0Var2 = new g0("INT", 1, cls, Integer.class, 0);
        f2884i = g0Var2;
        g0 g0Var3 = new g0("LONG", 2, Long.TYPE, Long.class, 0L);
        f2885j = g0Var3;
        g0 g0Var4 = new g0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f2886k = g0Var4;
        g0 g0Var5 = new g0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f2887l = g0Var5;
        g0 g0Var6 = new g0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f2888m = g0Var6;
        g0 g0Var7 = new g0("STRING", 6, String.class, String.class, "");
        f2889n = g0Var7;
        g0 g0Var8 = new g0("BYTE_STRING", 7, j.class, j.class, j.f2914f);
        f2890o = g0Var8;
        g0 g0Var9 = new g0("ENUM", 8, cls, Integer.class, null);
        f2891p = g0Var9;
        g0 g0Var10 = new g0("MESSAGE", 9, Object.class, Object.class, null);
        f2892q = g0Var10;
        f2893r = new g0[]{g0Var, g0Var2, g0Var3, g0Var4, g0Var5, g0Var6, g0Var7, g0Var8, g0Var9, g0Var10};
    }

    private g0(String str, int r22, Class cls, Class cls2, Object obj) {
        this.f2894e = cls;
        this.f2895f = cls2;
        this.f2896g = obj;
    }

    public static g0 valueOf(String str) {
        return (g0) Enum.valueOf(g0.class, str);
    }

    public static g0[] values() {
        return (g0[]) f2893r.clone();
    }

    public Class<?> d() {
        return this.f2895f;
    }
}
