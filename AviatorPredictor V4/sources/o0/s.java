package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class s<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6729a;

    /* renamed from: b, reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f6730b;

    /* renamed from: c, reason: collision with root package name */
    private final f0<TContinuationResult> f6731c;

    public s(Executor executor, a<TResult, h<TContinuationResult>> aVar, f0<TContinuationResult> f0Var) {
        this.f6729a = executor;
        this.f6730b = aVar;
        this.f6731c = f0Var;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        this.f6729a.execute(new r(this, hVar));
    }

    @Override // o0.c
    public final void b() {
        this.f6731c.s();
    }

    @Override // o0.e
    public final void c(Exception exc) {
        this.f6731c.q(exc);
    }

    @Override // o0.f
    public final void d(TContinuationResult tcontinuationresult) {
        this.f6731c.r(tcontinuationresult);
    }
}
