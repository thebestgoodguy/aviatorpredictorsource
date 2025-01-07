package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class z0 implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f2413e = -1;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2414f;

    /* renamed from: g, reason: collision with root package name */
    private Iterator f2415g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ e1 f2416h;

    private final Iterator c() {
        Map map;
        if (this.f2415g == null) {
            map = this.f2416h.f1535g;
            this.f2415g = map.entrySet().iterator();
        }
        return this.f2415g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        List list;
        Map map;
        int r02 = this.f2413e + 1;
        list = this.f2416h.f1534f;
        if (r02 < list.size()) {
            return true;
        }
        map = this.f2416h.f1535g;
        return !map.isEmpty() && c().hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        List list;
        Object next;
        List list2;
        this.f2414f = true;
        int r12 = this.f2413e + 1;
        this.f2413e = r12;
        list = this.f2416h.f1534f;
        if (r12 < list.size()) {
            list2 = this.f2416h.f1534f;
            next = list2.get(this.f2413e);
        } else {
            next = c().next();
        }
        return (Map.Entry) next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        List list;
        if (!this.f2414f) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f2414f = false;
        this.f2416h.n();
        int r02 = this.f2413e;
        list = this.f2416h.f1534f;
        if (r02 >= list.size()) {
            c().remove();
            return;
        }
        e1 e1Var = this.f2416h;
        int r12 = this.f2413e;
        this.f2413e = r12 - 1;
        e1Var.l(r12);
    }
}
