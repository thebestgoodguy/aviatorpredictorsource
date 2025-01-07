package z3;

import java.util.Iterator;
import u3.l;

/* loaded from: classes.dex */
public final class i<T, R> implements b<R> {

    /* renamed from: a, reason: collision with root package name */
    private final b<T> f8361a;

    /* renamed from: b, reason: collision with root package name */
    private final l<T, R> f8362b;

    public static final class a implements Iterator<R> {

        /* renamed from: e, reason: collision with root package name */
        private final Iterator<T> f8363e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ i<T, R> f8364f;

        a(i<T, R> iVar) {
            this.f8364f = iVar;
            this.f8363e = ((i) iVar).f8361a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8363e.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((i) this.f8364f).f8362b.invoke(this.f8363e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        kotlin.jvm.internal.i.d(bVar, "sequence");
        kotlin.jvm.internal.i.d(lVar, "transformer");
        this.f8361a = bVar;
        this.f8362b = lVar;
    }

    @Override // z3.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
