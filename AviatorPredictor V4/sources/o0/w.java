package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class w<TResult> implements b0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6738a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6739b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private d<TResult> f6740c;

    public w(Executor executor, d<TResult> dVar) {
        this.f6738a = executor;
        this.f6740c = dVar;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        synchronized (this.f6739b) {
            if (this.f6740c == null) {
                return;
            }
            this.f6738a.execute(new v(this, hVar));
        }
    }
}
