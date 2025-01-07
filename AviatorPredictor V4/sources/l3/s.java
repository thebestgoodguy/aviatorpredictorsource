package l3;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class s implements List, Serializable, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public static final s f6596e = new s();

    private s() {
    }

    @Override // java.util.List
    public boolean addAll(int r12, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return q((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        kotlin.jvm.internal.i.d(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void add(int r12, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return t((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return r.f6595e;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return u((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return r.f6595e;
    }

    @Override // java.util.List
    public ListIterator listIterator(int r32) {
        if (r32 == 0) {
            return r.f6595e;
        }
        throw new IndexOutOfBoundsException(kotlin.jvm.internal.i.i("Index: ", Integer.valueOf(r32)));
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public boolean add(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean q(Void r22) {
        kotlin.jvm.internal.i.d(r22, "element");
        return false;
    }

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public Void get(int r4) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + r4 + '.');
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return s();
    }

    @Override // java.util.List
    public List subList(int r4, int r5) {
        if (r4 == 0 && r5 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + r4 + ", toIndex: " + r5);
    }

    public int t(Void r22) {
        kotlin.jvm.internal.i.d(r22, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.d.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        kotlin.jvm.internal.i.d(tArr, "array");
        return (T[]) kotlin.jvm.internal.d.b(this, tArr);
    }

    public String toString() {
        return "[]";
    }

    public int u(Void r22) {
        kotlin.jvm.internal.i.d(r22, "element");
        return -1;
    }

    @Override // java.util.List
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Void set(int r12, Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
