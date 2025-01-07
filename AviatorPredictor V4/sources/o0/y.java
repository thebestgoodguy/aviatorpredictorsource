package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class y<TResult> implements b0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6743a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6744b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private e f6745c;

    public y(Executor executor, e eVar) {
        this.f6743a = executor;
        this.f6745c = eVar;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        if (hVar.p() || hVar.n()) {
            return;
        }
        synchronized (this.f6744b) {
            if (this.f6745c == null) {
                return;
            }
            this.f6743a.execute(new x(this, hVar));
        }
    }
}
