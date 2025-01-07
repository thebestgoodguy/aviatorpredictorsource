package r0;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class p<T> implements Comparator<T> {
    protected p() {
    }

    public static <T> p<T> a(Comparator<T> comparator) {
        return comparator instanceof p ? (p) comparator : new e(comparator);
    }

    public <F> p<F> b(q0.d<F, ? extends T> dVar) {
        return new b(dVar, this);
    }

    @Override // java.util.Comparator
    public abstract int compare(T t4, T t5);
}
