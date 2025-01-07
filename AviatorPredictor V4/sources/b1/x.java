package b1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
class x<T> implements r1.b<Set<T>> {

    /* renamed from: b, reason: collision with root package name */
    private volatile Set<T> f679b = null;

    /* renamed from: a, reason: collision with root package name */
    private volatile Set<r1.b<T>> f678a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection<r1.b<T>> collection) {
        this.f678a.addAll(collection);
    }

    static x<?> b(Collection<r1.b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        Iterator<r1.b<T>> it = this.f678a.iterator();
        while (it.hasNext()) {
            this.f679b.add(it.next().get());
        }
        this.f678a = null;
    }

    synchronized void a(r1.b<T> bVar) {
        Set set;
        if (this.f679b == null) {
            set = this.f678a;
        } else {
            set = this.f679b;
            bVar = (r1.b<T>) bVar.get();
        }
        set.add(bVar);
    }

    @Override // r1.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set<T> get() {
        if (this.f679b == null) {
            synchronized (this) {
                if (this.f679b == null) {
                    this.f679b = Collections.newSetFromMap(new ConcurrentHashMap());
                    d();
                }
            }
        }
        return Collections.unmodifiableSet(this.f679b);
    }
}
