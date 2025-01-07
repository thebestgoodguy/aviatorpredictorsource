package i1;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final a f4163a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.i f4164b;

    public enum a {
        REMOVED,
        ADDED,
        MODIFIED,
        METADATA
    }

    private n(a aVar, l1.i iVar) {
        this.f4163a = aVar;
        this.f4164b = iVar;
    }

    public static n a(a aVar, l1.i iVar) {
        return new n(aVar, iVar);
    }

    public l1.i b() {
        return this.f4164b;
    }

    public a c() {
        return this.f4163a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f4163a.equals(nVar.f4163a) && this.f4164b.equals(nVar.f4164b);
    }

    public int hashCode() {
        return ((((1891 + this.f4163a.hashCode()) * 31) + this.f4164b.getKey().hashCode()) * 31) + this.f4164b.k().hashCode();
    }

    public String toString() {
        return "DocumentViewChange(" + this.f4164b + "," + this.f4163a + ")";
    }
}
