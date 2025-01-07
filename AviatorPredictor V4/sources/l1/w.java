package l1;

/* loaded from: classes.dex */
public final class w implements Comparable<w> {

    /* renamed from: f, reason: collision with root package name */
    public static final w f6583f = new w(new x0.o(0, 0));

    /* renamed from: e, reason: collision with root package name */
    private final x0.o f6584e;

    public w(x0.o oVar) {
        this.f6584e = oVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        return this.f6584e.compareTo(wVar.f6584e);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof w) && compareTo((w) obj) == 0;
    }

    public x0.o g() {
        return this.f6584e;
    }

    public int hashCode() {
        return g().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f6584e.i() + ", nanos=" + this.f6584e.g() + ")";
    }
}
