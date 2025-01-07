package l1;

/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: g, reason: collision with root package name */
    public static final f f6540g = g("", "");

    /* renamed from: e, reason: collision with root package name */
    private final String f6541e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6542f;

    private f(String str, String str2) {
        this.f6541e = str;
        this.f6542f = str2;
    }

    public static f g(String str, String str2) {
        return new f(str, str2);
    }

    public static f h(String str) {
        u x4 = u.x(str);
        p1.b.d(x4.s() > 3 && x4.p(0).equals("projects") && x4.p(2).equals("databases"), "Tried to parse an invalid resource name: %s", x4);
        return new f(x4.p(1), x4.p(3));
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(f fVar) {
        int compareTo = this.f6541e.compareTo(fVar.f6541e);
        return compareTo != 0 ? compareTo : this.f6542f.compareTo(fVar.f6542f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f6541e.equals(fVar.f6541e) && this.f6542f.equals(fVar.f6542f);
    }

    public int hashCode() {
        return (this.f6541e.hashCode() * 31) + this.f6542f.hashCode();
    }

    public String i() {
        return this.f6542f;
    }

    public String k() {
        return this.f6541e;
    }

    public String toString() {
        return "DatabaseId(" + this.f6541e + ", " + this.f6542f + ")";
    }
}
