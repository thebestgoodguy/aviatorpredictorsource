package n3;

import kotlin.jvm.internal.i;
import n3.g;
import n3.g.b;
import u3.l;

/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: e, reason: collision with root package name */
    private final l<g.b, E> f6686e;

    /* renamed from: f, reason: collision with root package name */
    private final g.c<?> f6687f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [n3.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u3.l<? super n3.g$b, ? extends E extends B>, u3.l<n3.g$b, E extends B>] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        i.d(cVar, "baseKey");
        i.d(lVar, "safeCast");
        this.f6686e = lVar;
        this.f6687f = cVar instanceof b ? (g.c<B>) ((b) cVar).f6687f : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        i.d(cVar, "key");
        return cVar == this || this.f6687f == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ln3/g$b;)TE; */
    public final g.b b(g.b bVar) {
        i.d(bVar, "element");
        return (g.b) this.f6686e.invoke(bVar);
    }
}
