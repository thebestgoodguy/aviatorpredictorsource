package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
abstract class d9 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    private Object f1514e;

    /* renamed from: f, reason: collision with root package name */
    private int f1515f = 2;

    protected d9() {
    }

    protected abstract Object c();

    protected final Object d() {
        this.f1515f = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.f1515f;
        if (r02 == 4) {
            throw new IllegalStateException();
        }
        int r22 = r02 - 1;
        if (r02 == 0) {
            throw null;
        }
        if (r22 == 0) {
            return true;
        }
        if (r22 != 2) {
            this.f1515f = 4;
            this.f1514e = c();
            if (this.f1515f != 3) {
                this.f1515f = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1515f = 2;
        Object obj = this.f1514e;
        this.f1514e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
