package h3;

import b3.d;
import h3.a;
import h3.b;
import h3.c;

/* loaded from: classes.dex */
public abstract class a<S extends a<S>> extends b<S> {
    protected a(d dVar, b3.c cVar) {
        super(dVar, cVar);
    }

    public static <T extends b<T>> T e(b.a<T> aVar, d dVar) {
        return (T) f(aVar, dVar, b3.c.f699k);
    }

    public static <T extends b<T>> T f(b.a<T> aVar, d dVar, b3.c cVar) {
        return aVar.a(dVar, cVar.p(c.f3958b, c.a.ASYNC));
    }
}
