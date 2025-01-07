package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n1 extends AbstractList implements RandomAccess, l {

    /* renamed from: e, reason: collision with root package name */
    private final l f1951e;

    public n1(l lVar) {
        this.f1951e = lVar;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final l d() {
        return this;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final List f() {
        return this.f1951e.f();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final void g(hr hrVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int r22) {
        return ((k) this.f1951e).get(r22);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new m1(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int r22) {
        return new l1(this, r22);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.l
    public final Object o(int r22) {
        return this.f1951e.o(r22);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f1951e.size();
    }
}
