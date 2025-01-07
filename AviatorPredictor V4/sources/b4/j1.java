package b4;

/* loaded from: classes.dex */
public final class j1 implements k1 {

    /* renamed from: e, reason: collision with root package name */
    private final a2 f1012e;

    public j1(a2 a2Var) {
        this.f1012e = a2Var;
    }

    @Override // b4.k1
    public boolean e() {
        return false;
    }

    @Override // b4.k1
    public a2 f() {
        return this.f1012e;
    }

    public String toString() {
        return q0.c() ? f().y("New") : super.toString();
    }
}
