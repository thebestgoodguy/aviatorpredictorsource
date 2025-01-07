package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0<TResult> implements b0<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f6695a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f6696b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private f<? super TResult> f6697c;

    public a0(Executor executor, f<? super TResult> fVar) {
        this.f6695a = executor;
        this.f6697c = fVar;
    }

    @Override // o0.b0
    public final void a(h<TResult> hVar) {
        if (hVar.p()) {
            synchronized (this.f6696b) {
                if (this.f6697c == null) {
                    return;
                }
                this.f6695a.execute(new z(this, hVar));
            }
        }
    }
}
