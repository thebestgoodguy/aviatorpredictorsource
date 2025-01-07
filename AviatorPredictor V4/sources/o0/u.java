package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class u<TResult> implements b0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6733a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6734b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private c f6735c;

    public u(Executor executor, c cVar) {
        this.f6733a = executor;
        this.f6735c = cVar;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        if (hVar.n()) {
            synchronized (this.f6734b) {
                if (this.f6735c == null) {
                    return;
                }
                this.f6733a.execute(new t(this));
            }
        }
    }
}
