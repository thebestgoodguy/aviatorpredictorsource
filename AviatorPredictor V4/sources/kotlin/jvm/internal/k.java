package kotlin.jvm.internal;

/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: e, reason: collision with root package name */
    private final Class<?> f6391e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6392f;

    public k(Class<?> cls, String str) {
        i.d(cls, "jClass");
        i.d(str, "moduleName");
        this.f6391e = cls;
        this.f6392f = str;
    }

    @Override // kotlin.jvm.internal.b
    public Class<?> b() {
        return this.f6391e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(b(), ((k) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return i.i(b().toString(), " (Kotlin reflection is not available)");
    }
}
