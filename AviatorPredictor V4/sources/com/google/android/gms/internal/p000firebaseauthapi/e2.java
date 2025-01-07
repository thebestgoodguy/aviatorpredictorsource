package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class e2 extends l2 {

    /* renamed from: e, reason: collision with root package name */
    private final int f1539e;

    /* renamed from: f, reason: collision with root package name */
    private int f1540f;

    protected e2(int r22, int r32) {
        mq.b(r32, r22, "index");
        this.f1539e = r22;
        this.f1540f = r32;
    }

    protected abstract Object c(int r12);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f1540f < this.f1539e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1540f > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int r02 = this.f1540f;
        this.f1540f = r02 + 1;
        return c(r02);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1540f;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int r02 = this.f1540f - 1;
        this.f1540f = r02;
        return c(r02);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1540f - 1;
    }
}
