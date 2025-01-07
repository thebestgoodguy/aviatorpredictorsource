package androidx.collection;

/* loaded from: classes5.dex */
public final class CircularArray<E> {
    private int mCapacityBitmask;
    private E[] mElements;
    private int mHead;
    private int mTail;

    private void doubleCapacity() {
        E[] eArr = this.mElements;
        int length = eArr.length;
        int r2 = this.mHead;
        int r3 = length - r2;
        int r4 = length << 1;
        if (r4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[r4];
        System.arraycopy(eArr, r2, eArr2, 0, r3);
        System.arraycopy(this.mElements, 0, eArr2, r3, this.mHead);
        this.mElements = eArr2;
        this.mHead = 0;
        this.mTail = length;
        this.mCapacityBitmask = r4 - 1;
    }

    public CircularArray() {
        this(8);
    }

    public CircularArray(int r3) {
        int r0;
        if (r3 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (r3 <= 1073741824) {
            if (Integer.bitCount(r3) != 1) {
                r0 = Integer.highestOneBit(r3 - 1) << 1;
            } else {
                r0 = r3;
            }
            this.mCapacityBitmask = r0 - 1;
            this.mElements = (E[]) new Object[r0];
            return;
        }
        throw new IllegalArgumentException("capacity must be <= 2^30");
    }

    public void addFirst(E e) {
        int r0 = (this.mHead - 1) & this.mCapacityBitmask;
        this.mHead = r0;
        this.mElements[r0] = e;
        if (r0 == this.mTail) {
            doubleCapacity();
        }
    }

    public void addLast(E e) {
        E[] eArr = this.mElements;
        int r1 = this.mTail;
        eArr[r1] = e;
        int r0 = this.mCapacityBitmask & (r1 + 1);
        this.mTail = r0;
        if (r0 == this.mHead) {
            doubleCapacity();
        }
    }

    public E popFirst() {
        int r0 = this.mHead;
        if (r0 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.mElements;
        E result = eArr[r0];
        eArr[r0] = null;
        this.mHead = (r0 + 1) & this.mCapacityBitmask;
        return result;
    }

    public E popLast() {
        int r0 = this.mHead;
        int r1 = this.mTail;
        if (r0 == r1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int t = this.mCapacityBitmask & (r1 - 1);
        E[] eArr = this.mElements;
        E result = eArr[t];
        eArr[t] = null;
        this.mTail = t;
        return result;
    }

    public void clear() {
        removeFromStart(size());
    }

    public void removeFromStart(int numOfElements) {
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int end = this.mElements.length;
        int r1 = this.mHead;
        if (numOfElements < end - r1) {
            end = r1 + numOfElements;
        }
        for (int i = this.mHead; i < end; i++) {
            this.mElements[i] = null;
        }
        int i2 = this.mHead;
        int removed = end - i2;
        int numOfElements2 = numOfElements - removed;
        this.mHead = (i2 + removed) & this.mCapacityBitmask;
        if (numOfElements2 > 0) {
            for (int i3 = 0; i3 < numOfElements2; i3++) {
                this.mElements[i3] = null;
            }
            this.mHead = numOfElements2;
        }
    }

    public void removeFromEnd(int numOfElements) {
        int r2;
        if (numOfElements <= 0) {
            return;
        }
        if (numOfElements > size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int start = 0;
        int r1 = this.mTail;
        if (numOfElements < r1) {
            start = r1 - numOfElements;
        }
        int i = start;
        while (true) {
            r2 = this.mTail;
            if (i >= r2) {
                break;
            }
            this.mElements[i] = null;
            i++;
        }
        int i2 = r2 - start;
        int numOfElements2 = numOfElements - i2;
        this.mTail = r2 - i2;
        if (numOfElements2 > 0) {
            int length = this.mElements.length;
            this.mTail = length;
            int newTail = length - numOfElements2;
            for (int i3 = newTail; i3 < this.mTail; i3++) {
                this.mElements[i3] = null;
            }
            this.mTail = newTail;
        }
    }

    public E getFirst() {
        int r0 = this.mHead;
        if (r0 == this.mTail) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[r0];
    }

    public E getLast() {
        int r0 = this.mHead;
        int r1 = this.mTail;
        if (r0 == r1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(r1 - 1) & this.mCapacityBitmask];
    }

    public E get(int n) {
        if (n < 0 || n >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.mElements[(this.mHead + n) & this.mCapacityBitmask];
    }

    public int size() {
        return (this.mTail - this.mHead) & this.mCapacityBitmask;
    }

    public boolean isEmpty() {
        return this.mHead == this.mTail;
    }
}
