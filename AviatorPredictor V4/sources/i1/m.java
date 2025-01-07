package i1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final l1.f f4156a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4157b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4158c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4159d;

    public m(l1.f fVar, String str, String str2, boolean z4) {
        this.f4156a = fVar;
        this.f4157b = str;
        this.f4158c = str2;
        this.f4159d = z4;
    }

    public l1.f a() {
        return this.f4156a;
    }

    public String b() {
        return this.f4158c;
    }

    public String c() {
        return this.f4157b;
    }

    public boolean d() {
        return this.f4159d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.f4156a + " host:" + this.f4158c + ")";
    }
}
