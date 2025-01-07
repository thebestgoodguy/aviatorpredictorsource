package i1;

/* loaded from: classes.dex */
public class q0 {

    /* renamed from: a, reason: collision with root package name */
    private final a f4209a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.l f4210b;

    public enum a {
        ADDED,
        REMOVED
    }

    public q0(a aVar, l1.l lVar) {
        this.f4209a = aVar;
        this.f4210b = lVar;
    }

    public l1.l a() {
        return this.f4210b;
    }

    public a b() {
        return this.f4209a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f4209a.equals(q0Var.b()) && this.f4210b.equals(q0Var.a());
    }

    public int hashCode() {
        return ((2077 + this.f4209a.hashCode()) * 31) + this.f4210b.hashCode();
    }
}
