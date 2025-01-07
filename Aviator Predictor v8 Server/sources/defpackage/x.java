package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes61.dex */
abstract class x extends j {
    private final int a;
    private int b;

    protected x(int r2, int r3) {
        v.b(r3, r2, "index");
        this.a = r2;
        this.b = r3;
    }

    protected abstract Object a(int r1);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int r0 = this.b;
        this.b = r0 + 1;
        return a(r0);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int r0 = this.b - 1;
        this.b = r0;
        return a(r0);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }
}
