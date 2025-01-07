package com.google.firebase.firestore;

import i1.u1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class m0 implements Iterable<l0> {

    /* renamed from: e, reason: collision with root package name */
    private final k0 f2690e;

    /* renamed from: f, reason: collision with root package name */
    private final u1 f2691f;

    /* renamed from: g, reason: collision with root package name */
    private final FirebaseFirestore f2692g;

    /* renamed from: h, reason: collision with root package name */
    private List<c> f2693h;

    /* renamed from: i, reason: collision with root package name */
    private e0 f2694i;

    /* renamed from: j, reason: collision with root package name */
    private final p0 f2695j;

    private class a implements Iterator<l0> {

        /* renamed from: e, reason: collision with root package name */
        private final Iterator<l1.i> f2696e;

        a(Iterator<l1.i> it) {
            this.f2696e = it;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public l0 next() {
            return m0.this.p(this.f2696e.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2696e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("QuerySnapshot does not support remove().");
        }
    }

    m0(k0 k0Var, u1 u1Var, FirebaseFirestore firebaseFirestore) {
        this.f2690e = (k0) p1.x.b(k0Var);
        this.f2691f = (u1) p1.x.b(u1Var);
        this.f2692g = (FirebaseFirestore) p1.x.b(firebaseFirestore);
        this.f2695j = new p0(u1Var.i(), u1Var.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 p(l1.i iVar) {
        return l0.h(this.f2692g, iVar, this.f2691f.j(), this.f2691f.f().contains(iVar.getKey()));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return this.f2692g.equals(m0Var.f2692g) && this.f2690e.equals(m0Var.f2690e) && this.f2691f.equals(m0Var.f2691f) && this.f2695j.equals(m0Var.f2695j);
    }

    public int hashCode() {
        return (((((this.f2692g.hashCode() * 31) + this.f2690e.hashCode()) * 31) + this.f2691f.hashCode()) * 31) + this.f2695j.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<l0> iterator() {
        return new a(this.f2691f.e().iterator());
    }

    public List<c> q() {
        return r(e0.EXCLUDE);
    }

    public List<c> r(e0 e0Var) {
        if (e0.INCLUDE.equals(e0Var) && this.f2691f.b()) {
            throw new IllegalArgumentException("To include metadata changes with your document changes, you must also pass MetadataChanges.INCLUDE to addSnapshotListener().");
        }
        if (this.f2693h == null || this.f2694i != e0Var) {
            this.f2693h = Collections.unmodifiableList(c.a(this.f2692g, e0Var, this.f2691f));
            this.f2694i = e0Var;
        }
        return this.f2693h;
    }

    public List<i> s() {
        ArrayList arrayList = new ArrayList(this.f2691f.e().size());
        Iterator<l1.i> it = this.f2691f.e().iterator();
        while (it.hasNext()) {
            arrayList.add(p(it.next()));
        }
        return arrayList;
    }

    public p0 t() {
        return this.f2695j;
    }
}
