package r0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class k {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends x<T> {

        /* renamed from: e, reason: collision with root package name */
        boolean f7402e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f7403f;

        a(Object obj) {
            this.f7403f = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f7402e;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f7402e) {
                throw new NoSuchElementException();
            }
            this.f7402e = true;
            return (T) this.f7403f;
        }
    }

    public static boolean a(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !q0.i.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> x<T> b(T t4) {
        return new a(t4);
    }
}
