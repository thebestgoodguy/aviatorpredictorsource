package i1;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f4269a;

    /* renamed from: b, reason: collision with root package name */
    final l1.r f4270b;

    public enum a {
        ASCENDING(1),
        DESCENDING(-1);


        /* renamed from: e, reason: collision with root package name */
        private final int f4274e;

        a(int r32) {
            this.f4274e = r32;
        }

        int d() {
            return this.f4274e;
        }
    }

    private w0(a aVar, l1.r rVar) {
        this.f4269a = aVar;
        this.f4270b = rVar;
    }

    public static w0 d(a aVar, l1.r rVar) {
        return new w0(aVar, rVar);
    }

    int a(l1.i iVar, l1.i iVar2) {
        int d5;
        int i4;
        if (this.f4270b.equals(l1.r.f6563f)) {
            d5 = this.f4269a.d();
            i4 = iVar.getKey().compareTo(iVar2.getKey());
        } else {
            x1.x f5 = iVar.f(this.f4270b);
            x1.x f6 = iVar2.f(this.f4270b);
            p1.b.d((f5 == null || f6 == null) ? false : true, "Trying to compare documents on fields that don't exist.", new Object[0]);
            d5 = this.f4269a.d();
            i4 = l1.y.i(f5, f6);
        }
        return d5 * i4;
    }

    public a b() {
        return this.f4269a;
    }

    public l1.r c() {
        return this.f4270b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.f4269a == w0Var.f4269a && this.f4270b.equals(w0Var.f4270b);
    }

    public int hashCode() {
        return ((899 + this.f4269a.hashCode()) * 31) + this.f4270b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4269a == a.ASCENDING ? "" : "-");
        sb.append(this.f4270b.h());
        return sb.toString();
    }
}
