package f3;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final h4.f f3713d = h4.f.i(":status");

    /* renamed from: e, reason: collision with root package name */
    public static final h4.f f3714e = h4.f.i(":method");

    /* renamed from: f, reason: collision with root package name */
    public static final h4.f f3715f = h4.f.i(":path");

    /* renamed from: g, reason: collision with root package name */
    public static final h4.f f3716g = h4.f.i(":scheme");

    /* renamed from: h, reason: collision with root package name */
    public static final h4.f f3717h = h4.f.i(":authority");

    /* renamed from: i, reason: collision with root package name */
    public static final h4.f f3718i = h4.f.i(":host");

    /* renamed from: j, reason: collision with root package name */
    public static final h4.f f3719j = h4.f.i(":version");

    /* renamed from: a, reason: collision with root package name */
    public final h4.f f3720a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.f f3721b;

    /* renamed from: c, reason: collision with root package name */
    final int f3722c;

    public d(h4.f fVar, h4.f fVar2) {
        this.f3720a = fVar;
        this.f3721b = fVar2;
        this.f3722c = fVar.s() + 32 + fVar2.s();
    }

    public d(h4.f fVar, String str) {
        this(fVar, h4.f.i(str));
    }

    public d(String str, String str2) {
        this(h4.f.i(str), h4.f.i(str2));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3720a.equals(dVar.f3720a) && this.f3721b.equals(dVar.f3721b);
    }

    public int hashCode() {
        return ((527 + this.f3720a.hashCode()) * 31) + this.f3721b.hashCode();
    }

    public String toString() {
        return String.format("%s: %s", this.f3720a.x(), this.f3721b.x());
    }
}
