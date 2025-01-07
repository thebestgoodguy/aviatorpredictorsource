package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class q<TResult, TContinuationResult> implements b0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6724a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, TContinuationResult> f6725b;

    /* renamed from: c, reason: collision with root package name */
    private final f0<TContinuationResult> f6726c;

    public q(Executor executor, a<TResult, TContinuationResult> aVar, f0<TContinuationResult> f0Var) {
        this.f6724a = executor;
        this.f6725b = aVar;
        this.f6726c = f0Var;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        this.f6724a.execute(new p(this, hVar));
    }
}
