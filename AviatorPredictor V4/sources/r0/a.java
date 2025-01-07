package r0;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class a<E> extends y<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f7382e;

    /* renamed from: f, reason: collision with root package name */
    private int f7383f;

    protected a(int r12, int r22) {
        q0.l.q(r22, r12);
        this.f7382e = r12;
        this.f7383f = r22;
    }

    protected abstract E c(int r12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f7383f < this.f7382e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f7383f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int r02 = this.f7383f;
        this.f7383f = r02 + 1;
        return c(r02);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f7383f;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int r02 = this.f7383f - 1;
        this.f7383f = r02;
        return c(r02);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f7383f - 1;
    }
}
