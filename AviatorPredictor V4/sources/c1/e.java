package c1;

import c1.c;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class e<T> implements Iterable<T> {

    /* renamed from: e, reason: collision with root package name */
    private final c<T, Void> f1106e;

    private static class a<T> implements Iterator<T> {

        /* renamed from: e, reason: collision with root package name */
        final Iterator<Map.Entry<T, Void>> f1107e;

        public a(Iterator<Map.Entry<T, Void>> it) {
            this.f1107e = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1107e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            return this.f1107e.next().getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f1107e.remove();
        }
    }

    private e(c<T, Void> cVar) {
        this.f1106e = cVar;
    }

    public e(List<T> list, Comparator<T> comparator) {
        this.f1106e = c.a.b(list, Collections.emptyMap(), c.a.d(), comparator);
    }

    public boolean contains(T t4) {
        return this.f1106e.i(t4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.f1106e.equals(((e) obj).f1106e);
        }
        return false;
    }

    public int hashCode() {
        return this.f1106e.hashCode();
    }

    public T i() {
        return this.f1106e.r();
    }

    public int indexOf(T t4) {
        return this.f1106e.indexOf(t4);
    }

    public boolean isEmpty() {
        return this.f1106e.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return new a(this.f1106e.iterator());
    }

    public T p() {
        return this.f1106e.s();
    }

    public e<T> q(T t4) {
        return new e<>(this.f1106e.t(t4, null));
    }

    public Iterator<T> r(T t4) {
        return new a(this.f1106e.u(t4));
    }

    public e<T> s(T t4) {
        c<T, Void> v4 = this.f1106e.v(t4);
        return v4 == this.f1106e ? this : new e<>(v4);
    }

    public int size() {
        return this.f1106e.size();
    }

    public e<T> t(e<T> eVar) {
        e<T> eVar2;
        if (size() < eVar.size()) {
            eVar2 = eVar;
            eVar = this;
        } else {
            eVar2 = this;
        }
        Iterator<T> it = eVar.iterator();
        while (it.hasNext()) {
            eVar2 = eVar2.q(it.next());
        }
        return eVar2;
    }
}
