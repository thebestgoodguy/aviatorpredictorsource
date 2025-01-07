package b4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class t0<T> extends kotlinx.coroutines.internal.w<T> {

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1050h = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean y0() {
        do {
            int r02 = this._decision;
            if (r02 != 0) {
                if (r02 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f1050h.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.w, b4.a
    protected void t0(Object obj) {
        n3.d b5;
        if (y0()) {
            return;
        }
        b5 = o3.c.b(this.f6463g);
        kotlinx.coroutines.internal.g.c(b5, d0.a(obj, this.f6463g), null, 2, null);
    }

    @Override // kotlinx.coroutines.internal.w, b4.w1
    protected void x(Object obj) {
        t0(obj);
    }
}
