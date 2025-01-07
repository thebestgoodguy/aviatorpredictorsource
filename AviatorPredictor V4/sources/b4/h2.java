package b4;

/* loaded from: classes.dex */
public final class h2 extends g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final h2 f1009f = new h2();

    private h2() {
    }

    @Override // b4.g0
    public void F(n3.g gVar, Runnable runnable) {
        k2 k2Var = (k2) gVar.get(k2.f1016f);
        if (k2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        k2Var.f1017e = true;
    }

    @Override // b4.g0
    public boolean H(n3.g gVar) {
        return false;
    }

    @Override // b4.g0
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
