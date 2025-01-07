package b3;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    private final p f882a;

    /* renamed from: b, reason: collision with root package name */
    private final f1 f883b;

    private q(p pVar, f1 f1Var) {
        this.f882a = (p) q0.l.o(pVar, "state is null");
        this.f883b = (f1) q0.l.o(f1Var, "status is null");
    }

    public static q a(p pVar) {
        q0.l.e(pVar != p.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new q(pVar, f1.f756f);
    }

    public static q b(f1 f1Var) {
        q0.l.e(!f1Var.o(), "The error status must not be OK");
        return new q(p.TRANSIENT_FAILURE, f1Var);
    }

    public p c() {
        return this.f882a;
    }

    public f1 d() {
        return this.f883b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f882a.equals(qVar.f882a) && this.f883b.equals(qVar.f883b);
    }

    public int hashCode() {
        return this.f882a.hashCode() ^ this.f883b.hashCode();
    }

    public String toString() {
        if (this.f883b.o()) {
            return this.f882a.toString();
        }
        return this.f882a + "(" + this.f883b + ")";
    }
}
