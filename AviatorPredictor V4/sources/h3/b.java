package h3;

import b3.d;
import h3.b;
import java.util.concurrent.Executor;
import q0.l;

/* loaded from: classes.dex */
public abstract class b<S extends b<S>> {

    /* renamed from: a, reason: collision with root package name */
    private final d f3955a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.c f3956b;

    public interface a<T extends b<T>> {
        T a(d dVar, b3.c cVar);
    }

    protected b(d dVar, b3.c cVar) {
        this.f3955a = (d) l.o(dVar, "channel");
        this.f3956b = (b3.c) l.o(cVar, "callOptions");
    }

    protected abstract S a(d dVar, b3.c cVar);

    public final b3.c b() {
        return this.f3956b;
    }

    public final S c(b3.b bVar) {
        return a(this.f3955a, this.f3956b.k(bVar));
    }

    public final S d(Executor executor) {
        return a(this.f3955a, this.f3956b.m(executor));
    }
}
