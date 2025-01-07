package b4;

/* loaded from: classes.dex */
public final class i2<T> extends kotlinx.coroutines.internal.w<T> {

    /* renamed from: h, reason: collision with root package name */
    private n3.g f1010h;

    /* renamed from: i, reason: collision with root package name */
    private Object f1011i;

    @Override // kotlinx.coroutines.internal.w, b4.a
    protected void t0(Object obj) {
        n3.g gVar = this.f1010h;
        if (gVar != null) {
            kotlinx.coroutines.internal.c0.a(gVar, this.f1011i);
            this.f1010h = null;
            this.f1011i = null;
        }
        Object a5 = d0.a(obj, this.f6463g);
        n3.d<T> dVar = this.f6463g;
        n3.g context = dVar.getContext();
        Object c5 = kotlinx.coroutines.internal.c0.c(context, null);
        i2<?> e5 = c5 != kotlinx.coroutines.internal.c0.f6404a ? f0.e(dVar, context, c5) : null;
        try {
            this.f6463g.resumeWith(a5);
            k3.s sVar = k3.s.f6374a;
        } finally {
            if (e5 == null || e5.y0()) {
                kotlinx.coroutines.internal.c0.a(context, c5);
            }
        }
    }

    public final boolean y0() {
        if (this.f1010h == null) {
            return false;
        }
        this.f1010h = null;
        this.f1011i = null;
        return true;
    }

    public final void z0(n3.g gVar, Object obj) {
        this.f1010h = gVar;
        this.f1011i = obj;
    }
}
