package com.google.android.gms.internal.p000firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'h' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: f, reason: collision with root package name */
    public static final y1 f2351f;

    /* renamed from: g, reason: collision with root package name */
    public static final y1 f2352g;

    /* renamed from: h, reason: collision with root package name */
    public static final y1 f2353h;

    /* renamed from: i, reason: collision with root package name */
    public static final y1 f2354i;

    /* renamed from: j, reason: collision with root package name */
    public static final y1 f2355j;

    /* renamed from: k, reason: collision with root package name */
    public static final y1 f2356k;

    /* renamed from: l, reason: collision with root package name */
    public static final y1 f2357l;

    /* renamed from: m, reason: collision with root package name */
    public static final y1 f2358m;

    /* renamed from: n, reason: collision with root package name */
    public static final y1 f2359n;

    /* renamed from: o, reason: collision with root package name */
    public static final y1 f2360o;

    /* renamed from: p, reason: collision with root package name */
    public static final y1 f2361p;

    /* renamed from: q, reason: collision with root package name */
    public static final y1 f2362q;

    /* renamed from: r, reason: collision with root package name */
    public static final y1 f2363r;

    /* renamed from: s, reason: collision with root package name */
    public static final y1 f2364s;

    /* renamed from: t, reason: collision with root package name */
    public static final y1 f2365t;

    /* renamed from: u, reason: collision with root package name */
    public static final y1 f2366u;

    /* renamed from: v, reason: collision with root package name */
    public static final y1 f2367v;

    /* renamed from: w, reason: collision with root package name */
    public static final y1 f2368w;

    /* renamed from: x, reason: collision with root package name */
    private static final /* synthetic */ y1[] f2369x;

    /* renamed from: e, reason: collision with root package name */
    private final z1 f2370e;

    static {
        y1 y1Var = new y1("DOUBLE", 0, z1.DOUBLE, 1);
        f2351f = y1Var;
        y1 y1Var2 = new y1("FLOAT", 1, z1.FLOAT, 5);
        f2352g = y1Var2;
        z1 z1Var = z1.LONG;
        y1 y1Var3 = new y1("INT64", 2, z1Var, 0);
        f2353h = y1Var3;
        y1 y1Var4 = new y1("UINT64", 3, z1Var, 0);
        f2354i = y1Var4;
        z1 z1Var2 = z1.INT;
        y1 y1Var5 = new y1("INT32", 4, z1Var2, 0);
        f2355j = y1Var5;
        y1 y1Var6 = new y1("FIXED64", 5, z1Var, 1);
        f2356k = y1Var6;
        y1 y1Var7 = new y1("FIXED32", 6, z1Var2, 5);
        f2357l = y1Var7;
        y1 y1Var8 = new y1("BOOL", 7, z1.BOOLEAN, 0);
        f2358m = y1Var8;
        y1 y1Var9 = new y1("STRING", 8, z1.STRING, 2);
        f2359n = y1Var9;
        z1 z1Var3 = z1.MESSAGE;
        y1 y1Var10 = new y1("GROUP", 9, z1Var3, 3);
        f2360o = y1Var10;
        y1 y1Var11 = new y1("MESSAGE", 10, z1Var3, 2);
        f2361p = y1Var11;
        y1 y1Var12 = new y1("BYTES", 11, z1.BYTE_STRING, 2);
        f2362q = y1Var12;
        y1 y1Var13 = new y1("UINT32", 12, z1Var2, 0);
        f2363r = y1Var13;
        y1 y1Var14 = new y1("ENUM", 13, z1.ENUM, 0);
        f2364s = y1Var14;
        y1 y1Var15 = new y1("SFIXED32", 14, z1Var2, 5);
        f2365t = y1Var15;
        y1 y1Var16 = new y1("SFIXED64", 15, z1Var, 1);
        f2366u = y1Var16;
        y1 y1Var17 = new y1("SINT32", 16, z1Var2, 0);
        f2367v = y1Var17;
        y1 y1Var18 = new y1("SINT64", 17, z1Var, 0);
        f2368w = y1Var18;
        f2369x = new y1[]{y1Var, y1Var2, y1Var3, y1Var4, y1Var5, y1Var6, y1Var7, y1Var8, y1Var9, y1Var10, y1Var11, y1Var12, y1Var13, y1Var14, y1Var15, y1Var16, y1Var17, y1Var18};
    }

    private y1(String str, int r22, z1 z1Var, int r4) {
        this.f2370e = z1Var;
    }

    public static y1[] values() {
        return (y1[]) f2369x.clone();
    }

    public final z1 d() {
        return this.f2370e;
    }
}
