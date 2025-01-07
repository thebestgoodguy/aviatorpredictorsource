package k1;

/* loaded from: classes.dex */
public final class b4 {

    /* renamed from: a, reason: collision with root package name */
    private final i1.c1 f6037a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6038b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6039c;

    /* renamed from: d, reason: collision with root package name */
    private final b1 f6040d;

    /* renamed from: e, reason: collision with root package name */
    private final l1.w f6041e;

    /* renamed from: f, reason: collision with root package name */
    private final l1.w f6042f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.protobuf.j f6043g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b4(i1.c1 r10, int r11, long r12, k1.b1 r14) {
        /*
            r9 = this;
            l1.w r7 = l1.w.f6583f
            com.google.protobuf.j r8 = o1.u0.f6951t
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r5 = r14
            r6 = r7
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.b4.<init>(i1.c1, int, long, k1.b1):void");
    }

    b4(i1.c1 c1Var, int r22, long j4, b1 b1Var, l1.w wVar, l1.w wVar2, com.google.protobuf.j jVar) {
        this.f6037a = (i1.c1) p1.x.b(c1Var);
        this.f6038b = r22;
        this.f6039c = j4;
        this.f6042f = wVar2;
        this.f6040d = b1Var;
        this.f6041e = (l1.w) p1.x.b(wVar);
        this.f6043g = (com.google.protobuf.j) p1.x.b(jVar);
    }

    public l1.w a() {
        return this.f6042f;
    }

    public b1 b() {
        return this.f6040d;
    }

    public com.google.protobuf.j c() {
        return this.f6043g;
    }

    public long d() {
        return this.f6039c;
    }

    public l1.w e() {
        return this.f6041e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b4.class != obj.getClass()) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.f6037a.equals(b4Var.f6037a) && this.f6038b == b4Var.f6038b && this.f6039c == b4Var.f6039c && this.f6040d.equals(b4Var.f6040d) && this.f6041e.equals(b4Var.f6041e) && this.f6042f.equals(b4Var.f6042f) && this.f6043g.equals(b4Var.f6043g);
    }

    public i1.c1 f() {
        return this.f6037a;
    }

    public int g() {
        return this.f6038b;
    }

    public b4 h(l1.w wVar) {
        return new b4(this.f6037a, this.f6038b, this.f6039c, this.f6040d, this.f6041e, wVar, this.f6043g);
    }

    public int hashCode() {
        return (((((((((((this.f6037a.hashCode() * 31) + this.f6038b) * 31) + ((int) this.f6039c)) * 31) + this.f6040d.hashCode()) * 31) + this.f6041e.hashCode()) * 31) + this.f6042f.hashCode()) * 31) + this.f6043g.hashCode();
    }

    public b4 i(com.google.protobuf.j jVar, l1.w wVar) {
        return new b4(this.f6037a, this.f6038b, this.f6039c, this.f6040d, wVar, this.f6042f, jVar);
    }

    public b4 j(long j4) {
        return new b4(this.f6037a, this.f6038b, j4, this.f6040d, this.f6041e, this.f6042f, this.f6043g);
    }

    public String toString() {
        return "TargetData{target=" + this.f6037a + ", targetId=" + this.f6038b + ", sequenceNumber=" + this.f6039c + ", purpose=" + this.f6040d + ", snapshotVersion=" + this.f6041e + ", lastLimboFreeSnapshotVersion=" + this.f6042f + ", resumeToken=" + this.f6043g + '}';
    }
}
