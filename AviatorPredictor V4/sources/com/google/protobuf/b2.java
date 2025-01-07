package com.google.protobuf;

/* loaded from: classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    static final int f2798a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f2799b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f2800c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f2801d = c(3, 2);

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
    public static class b {

        /* renamed from: g, reason: collision with root package name */
        public static final b f2802g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f2803h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f2804i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f2805j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f2806k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f2807l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f2808m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f2809n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f2810o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f2811p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f2812q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f2813r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f2814s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f2815t;

        /* renamed from: u, reason: collision with root package name */
        public static final b f2816u;

        /* renamed from: v, reason: collision with root package name */
        public static final b f2817v;

        /* renamed from: w, reason: collision with root package name */
        public static final b f2818w;

        /* renamed from: x, reason: collision with root package name */
        public static final b f2819x;

        /* renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ b[] f2820y;

        /* renamed from: e, reason: collision with root package name */
        private final c f2821e;

        /* renamed from: f, reason: collision with root package name */
        private final int f2822f;

        enum a extends b {
            a(String str, int r8, c cVar, int r10) {
                super(str, r8, cVar, r10);
            }
        }

        /* renamed from: com.google.protobuf.b2$b$b, reason: collision with other inner class name */
        enum C0024b extends b {
            C0024b(String str, int r8, c cVar, int r10) {
                super(str, r8, cVar, r10);
            }
        }

        enum c extends b {
            c(String str, int r8, c cVar, int r10) {
                super(str, r8, cVar, r10);
            }
        }

        enum d extends b {
            d(String str, int r8, c cVar, int r10) {
                super(str, r8, cVar, r10);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f2802g = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f2803h = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f2804i = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f2805j = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f2806k = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f2807l = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f2808m = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f2809n = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f2810o = aVar;
            c cVar3 = c.MESSAGE;
            C0024b c0024b = new C0024b("GROUP", 9, cVar3, 3);
            f2811p = c0024b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f2812q = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f2813r = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f2814s = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f2815t = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f2816u = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f2817v = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f2818w = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f2819x = bVar14;
            f2820y = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0024b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int r22, c cVar, int r4) {
            this.f2821e = cVar;
            this.f2822f = r4;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f2820y.clone();
        }

        public c d() {
            return this.f2821e;
        }

        public int g() {
            return this.f2822f;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(j.f2914f),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: e, reason: collision with root package name */
        private final Object f2833e;

        c(Object obj) {
            this.f2833e = obj;
        }
    }

    public static int a(int r02) {
        return r02 >>> 3;
    }

    public static int b(int r02) {
        return r02 & 7;
    }

    static int c(int r02, int r12) {
        return (r02 << 3) | r12;
    }
}
