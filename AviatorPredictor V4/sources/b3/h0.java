package b3;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicLong f803d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    private final String f804a;

    /* renamed from: b, reason: collision with root package name */
    private final String f805b;

    /* renamed from: c, reason: collision with root package name */
    private final long f806c;

    h0(String str, String str2, long j4) {
        q0.l.o(str, "typeName");
        q0.l.e(!str.isEmpty(), "empty type");
        this.f804a = str;
        this.f805b = str2;
        this.f806c = j4;
    }

    public static h0 a(Class<?> cls, String str) {
        return b(c(cls), str);
    }

    public static h0 b(String str, String str2) {
        return new h0(str, str2, e());
    }

    private static String c(Class<?> cls) {
        String simpleName = ((Class) q0.l.o(cls, "type")).getSimpleName();
        return !simpleName.isEmpty() ? simpleName : cls.getName().substring(cls.getPackage().getName().length() + 1);
    }

    static long e() {
        return f803d.incrementAndGet();
    }

    public long d() {
        return this.f806c;
    }

    public String f() {
        return this.f804a + "<" + this.f806c + ">";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(f());
        if (this.f805b != null) {
            sb.append(": (");
            sb.append(this.f805b);
            sb.append(')');
        }
        return sb.toString();
    }
}
