package b4;

/* loaded from: classes.dex */
public final class s extends r1 implements r {

    /* renamed from: i, reason: collision with root package name */
    public final t f1046i;

    public s(t tVar) {
        this.f1046i = tVar;
    }

    @Override // b4.r
    public p1 getParent() {
        return z();
    }

    @Override // b4.r
    public boolean i(Throwable th) {
        return z().D(th);
    }

    @Override // u3.l
    public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
        y(th);
        return k3.s.f6374a;
    }

    @Override // b4.b0
    public void y(Throwable th) {
        this.f1046i.t(z());
    }
}
