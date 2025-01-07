package b4;

/* loaded from: classes.dex */
public abstract class a1 extends g0 {

    /* renamed from: f, reason: collision with root package name */
    private long f985f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f986g;

    /* renamed from: h, reason: collision with root package name */
    private kotlinx.coroutines.internal.a<u0<?>> f987h;

    private final long M(boolean z4) {
        return z4 ? 4294967296L : 1L;
    }

    public static /* synthetic */ void c0(a1 a1Var, boolean z4, int r22, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((r22 & 1) != 0) {
            z4 = false;
        }
        a1Var.X(z4);
    }

    public final void K(boolean z4) {
        long M = this.f985f - M(z4);
        this.f985f = M;
        if (M > 0) {
            return;
        }
        if (q0.a()) {
            if (!(this.f985f == 0)) {
                throw new AssertionError();
            }
        }
        if (this.f986g) {
            shutdown();
        }
    }

    public final void R(u0<?> u0Var) {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f987h;
        if (aVar == null) {
            aVar = new kotlinx.coroutines.internal.a<>();
            this.f987h = aVar;
        }
        aVar.a(u0Var);
    }

    protected long S() {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f987h;
        return (aVar == null || aVar.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void X(boolean z4) {
        this.f985f += M(z4);
        if (z4) {
            return;
        }
        this.f986g = true;
    }

    public final boolean f0() {
        return this.f985f >= M(true);
    }

    public final boolean i0() {
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f987h;
        if (aVar == null) {
            return true;
        }
        return aVar.c();
    }

    public final boolean j0() {
        u0<?> d5;
        kotlinx.coroutines.internal.a<u0<?>> aVar = this.f987h;
        if (aVar == null || (d5 = aVar.d()) == null) {
            return false;
        }
        d5.run();
        return true;
    }

    protected void shutdown() {
    }
}
