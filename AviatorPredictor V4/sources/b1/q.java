package b1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f666a;

    /* renamed from: b, reason: collision with root package name */
    private final int f667b;

    /* renamed from: c, reason: collision with root package name */
    private final int f668c;

    private q(Class<?> cls, int r32, int r4) {
        this.f666a = (Class) d0.c(cls, "Null dependency anInterface.");
        this.f667b = r32;
        this.f668c = r4;
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int r32) {
        if (r32 == 0) {
            return "direct";
        }
        if (r32 == 1) {
            return "provider";
        }
        if (r32 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + r32);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q k(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public Class<?> c() {
        return this.f666a;
    }

    public boolean d() {
        return this.f668c == 2;
    }

    public boolean e() {
        return this.f668c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f666a == qVar.f666a && this.f667b == qVar.f667b && this.f668c == qVar.f668c;
    }

    public boolean f() {
        return this.f667b == 1;
    }

    public boolean g() {
        return this.f667b == 2;
    }

    public int hashCode() {
        return ((((this.f666a.hashCode() ^ 1000003) * 1000003) ^ this.f667b) * 1000003) ^ this.f668c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f666a);
        sb.append(", type=");
        int r12 = this.f667b;
        sb.append(r12 == 1 ? "required" : r12 == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(b(this.f668c));
        sb.append("}");
        return sb.toString();
    }
}
