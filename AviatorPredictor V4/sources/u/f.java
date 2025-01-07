package u;

/* loaded from: classes.dex */
public final class f<L> {

    /* renamed from: a, reason: collision with root package name */
    private final L f7605a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7606b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f7605a == fVar.f7605a && this.f7606b.equals(fVar.f7606b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f7605a) * 31) + this.f7606b.hashCode();
    }
}
