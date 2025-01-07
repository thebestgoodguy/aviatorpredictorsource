package k3;

/* loaded from: classes.dex */
public final class e implements Comparable<e> {

    /* renamed from: i, reason: collision with root package name */
    public static final a f6359i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final e f6360j = f.a();

    /* renamed from: e, reason: collision with root package name */
    private final int f6361e;

    /* renamed from: f, reason: collision with root package name */
    private final int f6362f;

    /* renamed from: g, reason: collision with root package name */
    private final int f6363g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6364h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public e(int r12, int r22, int r32) {
        this.f6361e = r12;
        this.f6362f = r22;
        this.f6363g = r32;
        this.f6364h = g(r12, r22, r32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if ((r7 >= 0 && r7 < 256) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int g(int r5, int r6, int r7) {
        /*
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            r2 = 0
            if (r5 < 0) goto La
            if (r5 >= r0) goto La
            r3 = 1
            goto Lb
        La:
            r3 = 0
        Lb:
            if (r3 == 0) goto L20
            if (r6 < 0) goto L13
            if (r6 >= r0) goto L13
            r3 = 1
            goto L14
        L13:
            r3 = 0
        L14:
            if (r3 == 0) goto L20
            if (r7 < 0) goto L1c
            if (r7 >= r0) goto L1c
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 == 0) goto L20
            goto L21
        L20:
            r1 = 0
        L21:
            if (r1 == 0) goto L2a
            int r5 = r5 << 16
            int r6 = r6 << 8
            int r5 = r5 + r6
            int r5 = r5 + r7
            return r5
        L2a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Version components are out of range: "
            r0.append(r1)
            r0.append(r5)
            r5 = 46
            r0.append(r5)
            r0.append(r6)
            r0.append(r5)
            r0.append(r7)
            java.lang.String r5 = r0.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.g(int, int, int):int");
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        kotlin.jvm.internal.i.d(eVar, "other");
        return this.f6364h - eVar.f6364h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f6364h == eVar.f6364h;
    }

    public int hashCode() {
        return this.f6364h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6361e);
        sb.append('.');
        sb.append(this.f6362f);
        sb.append('.');
        sb.append(this.f6363g);
        return sb.toString();
    }
}
