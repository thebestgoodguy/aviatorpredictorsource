package r0;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
final class e<T> extends p<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    final Comparator<T> f7386e;

    e(Comparator<T> comparator) {
        this.f7386e = (Comparator) q0.l.n(comparator);
    }

    @Override // r0.p, java.util.Comparator
    public int compare(T t4, T t5) {
        return this.f7386e.compare(t4, t5);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f7386e.equals(((e) obj).f7386e);
        }
        return false;
    }

    public int hashCode() {
        return this.f7386e.hashCode();
    }

    public String toString() {
        return this.f7386e.toString();
    }
}
