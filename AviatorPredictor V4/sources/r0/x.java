package r0;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class x<E> implements Iterator<E> {
    protected x() {
    }

    @Override // java.util.Iterator
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
