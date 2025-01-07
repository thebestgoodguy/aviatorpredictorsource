package androidx.collection;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
abstract class IndexBasedArrayIterator<T> implements Iterator<T> {
    private boolean mCanRemove;
    private int mIndex;
    private int mSize;

    protected abstract T elementAt(int r1);

    protected abstract void removeAt(int r1);

    IndexBasedArrayIterator(int startingSize) {
        this.mSize = startingSize;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.mIndex < this.mSize;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T res = elementAt(this.mIndex);
        this.mIndex++;
        this.mCanRemove = true;
        return res;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.mCanRemove) {
            throw new IllegalStateException();
        }
        int r0 = this.mIndex - 1;
        this.mIndex = r0;
        removeAt(r0);
        this.mSize--;
        this.mCanRemove = false;
    }
}
