package b4;

import n3.g;

/* loaded from: classes.dex */
final class j2 implements g.b, g.c<j2> {

    /* renamed from: e, reason: collision with root package name */
    public static final j2 f1013e = new j2();

    private j2() {
    }

    @Override // n3.g
    public <R> R fold(R r4, u3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r4, pVar);
    }

    @Override // n3.g.b, n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // n3.g.b
    public g.c<?> getKey() {
        return this;
    }

    @Override // n3.g
    public n3.g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // n3.g
    public n3.g plus(n3.g gVar) {
        return g.b.a.d(this, gVar);
    }
}
