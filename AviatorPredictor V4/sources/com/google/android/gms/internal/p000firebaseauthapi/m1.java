package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;

/* loaded from: classes.dex */
final class m1 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    final Iterator f1913e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n1 f1914f;

    m1(n1 n1Var) {
        l lVar;
        this.f1914f = n1Var;
        lVar = n1Var.f1951e;
        this.f1913e = lVar.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1913e.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f1913e.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
