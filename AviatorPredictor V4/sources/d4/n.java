package d4;

import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public class n<E> extends a<E> {
    public n(u3.l<? super E, k3.s> lVar) {
        super(lVar);
    }

    @Override // d4.c
    protected Object i(E e5) {
        q<?> k4;
        do {
            Object i4 = super.i(e5);
            y yVar = b.f3405b;
            if (i4 == yVar) {
                return yVar;
            }
            if (i4 != b.f3406c) {
                if (i4 instanceof j) {
                    return i4;
                }
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Invalid offerInternal result ", i4).toString());
            }
            k4 = k(e5);
            if (k4 == null) {
                return yVar;
            }
        } while (!(k4 instanceof j));
        return k4;
    }

    @Override // d4.a
    protected final boolean r() {
        return true;
    }

    @Override // d4.a
    protected final boolean s() {
        return true;
    }
}
