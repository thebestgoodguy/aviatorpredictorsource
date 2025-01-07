package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class y1 extends AbstractList<String> implements k0, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    private final k0 f3159e;

    class a implements ListIterator<String> {

        /* renamed from: e, reason: collision with root package name */
        ListIterator<String> f3160e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f3161f;

        a(int r22) {
            this.f3161f = r22;
            this.f3160e = y1.this.f3159e.listIterator(r22);
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f3160e.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return this.f3160e.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f3160e.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f3160e.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f3160e.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f3160e.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    class b implements Iterator<String> {

        /* renamed from: e, reason: collision with root package name */
        Iterator<String> f3163e;

        b() {
            this.f3163e = y1.this.f3159e.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return this.f3163e.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3163e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public y1(k0 k0Var) {
        this.f3159e = k0Var;
    }

    @Override // com.google.protobuf.k0
    public k0 a() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // com.google.protobuf.k0
    public Object j(int r22) {
        return this.f3159e.j(r22);
    }

    @Override // com.google.protobuf.k0
    public void l(j jVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int r22) {
        return new a(r22);
    }

    @Override // com.google.protobuf.k0
    public List<?> m() {
        return this.f3159e.m();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public String get(int r22) {
        return (String) this.f3159e.get(r22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3159e.size();
    }
}
