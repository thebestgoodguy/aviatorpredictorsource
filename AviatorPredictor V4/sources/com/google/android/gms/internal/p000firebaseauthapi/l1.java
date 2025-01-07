package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ListIterator;

/* loaded from: classes.dex */
final class l1 implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    final ListIterator f1865e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f1866f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n1 f1867g;

    l1(n1 n1Var, int r22) {
        l lVar;
        this.f1867g = n1Var;
        this.f1866f = r22;
        lVar = n1Var.f1951e;
        this.f1865e = lVar.listIterator(r22);
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1865e.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1865e.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f1865e.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1865e.nextIndex();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f1865e.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1865e.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
