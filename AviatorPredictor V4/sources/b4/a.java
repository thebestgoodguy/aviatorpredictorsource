package b4;

/* loaded from: classes.dex */
public abstract class a<T> extends w1 implements n3.d<T>, m0 {

    /* renamed from: f, reason: collision with root package name */
    private final n3.g f982f;

    public a(n3.g gVar, boolean z4, boolean z5) {
        super(z5);
        if (z4) {
            S((p1) gVar.get(p1.f1038a));
        }
        this.f982f = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // b4.w1
    public String C() {
        return kotlin.jvm.internal.i.i(r0.a(this), " was cancelled");
    }

    @Override // b4.w1
    public final void R(Throwable th) {
        i0.a(this.f982f, th);
    }

    @Override // b4.w1
    public String Y() {
        String b5 = f0.b(this.f982f);
        if (b5 == null) {
            return super.Y();
        }
        return '\"' + b5 + "\":" + super.Y();
    }

    @Override // b4.m0
    public n3.g c() {
        return this.f982f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b4.w1
    protected final void d0(Object obj) {
        if (!(obj instanceof z)) {
            v0(obj);
        } else {
            z zVar = (z) obj;
            u0(zVar.f1086a, zVar.a());
        }
    }

    @Override // b4.w1, b4.p1
    public boolean e() {
        return super.e();
    }

    @Override // n3.d
    public final n3.g getContext() {
        return this.f982f;
    }

    @Override // n3.d
    public final void resumeWith(Object obj) {
        Object W = W(d0.d(obj, null, 1, null));
        if (W == x1.f1073b) {
            return;
        }
        t0(W);
    }

    protected void t0(Object obj) {
        x(obj);
    }

    protected void u0(Throwable th, boolean z4) {
    }

    protected void v0(T t4) {
    }

    public final <R> void w0(o0 o0Var, R r4, u3.p<? super R, ? super n3.d<? super T>, ? extends Object> pVar) {
        o0Var.g(pVar, r4, this);
    }
}
