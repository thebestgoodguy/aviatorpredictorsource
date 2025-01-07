package b3;

/* loaded from: classes.dex */
public class g1 extends Exception {

    /* renamed from: e, reason: collision with root package name */
    private final f1 f800e;

    /* renamed from: f, reason: collision with root package name */
    private final u0 f801f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f802g;

    public g1(f1 f1Var) {
        this(f1Var, null);
    }

    public g1(f1 f1Var, u0 u0Var) {
        this(f1Var, u0Var, true);
    }

    g1(f1 f1Var, u0 u0Var, boolean z4) {
        super(f1.g(f1Var), f1Var.l());
        this.f800e = f1Var;
        this.f801f = u0Var;
        this.f802g = z4;
        fillInStackTrace();
    }

    public final f1 a() {
        return this.f800e;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        return this.f802g ? super.fillInStackTrace() : this;
    }
}
