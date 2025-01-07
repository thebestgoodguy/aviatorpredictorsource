package n3;

import kotlin.jvm.internal.i;
import n3.g;
import u3.p;

/* loaded from: classes.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        i.d(cVar, "key");
        this.key = cVar;
    }

    @Override // n3.g
    public <R> R fold(R r4, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // n3.g.b, n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // n3.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // n3.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // n3.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
