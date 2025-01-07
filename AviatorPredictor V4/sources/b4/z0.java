package b4;

/* loaded from: classes.dex */
final class z0 implements k1 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1087e;

    public z0(boolean z4) {
        this.f1087e = z4;
    }

    @Override // b4.k1
    public boolean e() {
        return this.f1087e;
    }

    @Override // b4.k1
    public a2 f() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(e() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
