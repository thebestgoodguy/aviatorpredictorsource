package l1;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n implements Iterable<i> {

    /* renamed from: e, reason: collision with root package name */
    private final c1.c<l, i> f6551e;

    /* renamed from: f, reason: collision with root package name */
    private final c1.e<i> f6552f;

    private n(c1.c<l, i> cVar, c1.e<i> eVar) {
        this.f6551e = cVar;
        this.f6552f = eVar;
    }

    public static n q(final Comparator<i> comparator) {
        return new n(j.a(), new c1.e(Collections.emptyList(), new Comparator() { // from class: l1.m
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int v4;
                v4 = n.v(comparator, (i) obj, (i) obj2);
                return v4;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int v(Comparator comparator, i iVar, i iVar2) {
        int compare = comparator.compare(iVar, iVar2);
        return compare == 0 ? i.f6544a.compare(iVar, iVar2) : compare;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        if (size() != nVar.size()) {
            return false;
        }
        Iterator<i> it = iterator();
        Iterator<i> it2 = nVar.iterator();
        while (it.hasNext()) {
            if (!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Iterator<i> it = iterator();
        int r12 = 0;
        while (it.hasNext()) {
            i next = it.next();
            r12 = (((r12 * 31) + next.getKey().hashCode()) * 31) + next.k().hashCode();
        }
        return r12;
    }

    public boolean isEmpty() {
        return this.f6551e.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<i> iterator() {
        return this.f6552f.iterator();
    }

    public n p(i iVar) {
        n w4 = w(iVar.getKey());
        return new n(w4.f6551e.t(iVar.getKey(), iVar), w4.f6552f.q(iVar));
    }

    public i r(l lVar) {
        return this.f6551e.p(lVar);
    }

    public i s() {
        return this.f6552f.p();
    }

    public int size() {
        return this.f6551e.size();
    }

    public i t() {
        return this.f6552f.i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<i> it = iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            i next = it.next();
            if (z4) {
                z4 = false;
            } else {
                sb.append(", ");
            }
            sb.append(next);
        }
        sb.append("]");
        return sb.toString();
    }

    public int u(l lVar) {
        i p4 = this.f6551e.p(lVar);
        if (p4 == null) {
            return -1;
        }
        return this.f6552f.indexOf(p4);
    }

    public n w(l lVar) {
        i p4 = this.f6551e.p(lVar);
        return p4 == null ? this : new n(this.f6551e.v(lVar), this.f6552f.s(p4));
    }
}
