package com.google.android.gms.internal.p000firebaseauthapi;

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
public final class i {

    /* renamed from: h, reason: collision with root package name */
    public static final i f1746h;

    /* renamed from: i, reason: collision with root package name */
    public static final i f1747i;

    /* renamed from: j, reason: collision with root package name */
    public static final i f1748j;

    /* renamed from: k, reason: collision with root package name */
    public static final i f1749k;

    /* renamed from: l, reason: collision with root package name */
    public static final i f1750l;

    /* renamed from: m, reason: collision with root package name */
    public static final i f1751m;

    /* renamed from: n, reason: collision with root package name */
    public static final i f1752n;

    /* renamed from: o, reason: collision with root package name */
    public static final i f1753o;

    /* renamed from: p, reason: collision with root package name */
    public static final i f1754p;

    /* renamed from: q, reason: collision with root package name */
    public static final i f1755q;

    /* renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ i[] f1756r;

    /* renamed from: e, reason: collision with root package name */
    private final Class f1757e;

    /* renamed from: f, reason: collision with root package name */
    private final Class f1758f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f1759g;

    static {
        i iVar = new i("VOID", 0, Void.class, Void.class, null);
        f1746h = iVar;
        Class cls = Integer.TYPE;
        i iVar2 = new i("INT", 1, cls, Integer.class, 0);
        f1747i = iVar2;
        i iVar3 = new i("LONG", 2, Long.TYPE, Long.class, 0L);
        f1748j = iVar3;
        i iVar4 = new i("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f1749k = iVar4;
        i iVar5 = new i("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f1750l = iVar5;
        i iVar6 = new i("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f1751m = iVar6;
        i iVar7 = new i("STRING", 6, String.class, String.class, "");
        f1752n = iVar7;
        i iVar8 = new i("BYTE_STRING", 7, hr.class, hr.class, hr.f1739f);
        f1753o = iVar8;
        i iVar9 = new i("ENUM", 8, cls, Integer.class, null);
        f1754p = iVar9;
        i iVar10 = new i("MESSAGE", 9, Object.class, Object.class, null);
        f1755q = iVar10;
        f1756r = new i[]{iVar, iVar2, iVar3, iVar4, iVar5, iVar6, iVar7, iVar8, iVar9, iVar10};
    }

    private i(String str, int r22, Class cls, Class cls2, Object obj) {
        this.f1757e = cls;
        this.f1758f = cls2;
        this.f1759g = obj;
    }

    public static i[] values() {
        return (i[]) f1756r.clone();
    }

    public final Class d() {
        return this.f1758f;
    }
}
