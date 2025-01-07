package r0;

import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class y<E> extends x<E> implements ListIterator<E> {
    protected y() {
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void add(E e5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @Deprecated
    public final void set(E e5) {
        throw new UnsupportedOperationException();
    }
}
