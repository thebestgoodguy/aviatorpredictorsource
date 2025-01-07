package com.google.protobuf;

import com.google.protobuf.d0;
import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
abstract class c<E> extends AbstractList<E> implements d0.i<E> {

    /* renamed from: e, reason: collision with root package name */
    private boolean f2834e = true;

    c() {
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        i();
        return super.add(e5);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int r12, Collection<? extends E> collection) {
        i();
        return super.addAll(r12, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> collection) {
        i();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int r32 = 0; r32 < size; r32++) {
            if (!get(r32).equals(list.get(r32))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.protobuf.d0.i
    public final void h() {
        this.f2834e = false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int r12 = 1;
        for (int r22 = 0; r22 < size; r22++) {
            r12 = (r12 * 31) + get(r22).hashCode();
        }
        return r12;
    }

    protected void i() {
        if (!this.f2834e) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // com.google.protobuf.d0.i
    public boolean n() {
        return this.f2834e;
    }

    @Override // java.util.AbstractList, java.util.List
    public abstract E remove(int r12);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        i();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        i();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        i();
        return super.retainAll(collection);
    }
}
