package b4;

/* loaded from: classes.dex */
public abstract class v1 extends b0 implements y0, k1 {

    /* renamed from: h, reason: collision with root package name */
    public w1 f1054h;

    public final void A(w1 w1Var) {
        this.f1054h = w1Var;
    }

    @Override // b4.y0
    public void d() {
        z().h0(this);
    }

    @Override // b4.k1
    public boolean e() {
        return true;
    }

    @Override // b4.k1
    public a2 f() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.n
    public String toString() {
        return r0.a(this) + '@' + r0.b(this) + "[job@" + r0.b(z()) + ']';
    }

    public final w1 z() {
        w1 w1Var = this.f1054h;
        if (w1Var != null) {
            return w1Var;
        }
        kotlin.jvm.internal.i.m("job");
        return null;
    }
}
