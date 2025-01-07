package n3;

import kotlin.jvm.internal.i;
import n3.g;

/* loaded from: classes.dex */
public interface e extends g.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f6691d = b.f6692e;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            i.d(eVar, "this");
            i.d(cVar, "key");
            if (!(cVar instanceof n3.b)) {
                if (e.f6691d == cVar) {
                    return eVar;
                }
                return null;
            }
            n3.b bVar = (n3.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e5 = (E) bVar.b(eVar);
            if (e5 instanceof g.b) {
                return e5;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> cVar) {
            i.d(eVar, "this");
            i.d(cVar, "key");
            if (!(cVar instanceof n3.b)) {
                return e.f6691d == cVar ? h.f6694e : eVar;
            }
            n3.b bVar = (n3.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f6694e;
        }
    }

    public static final class b implements g.c<e> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ b f6692e = new b();

        private b() {
        }
    }

    <T> d<T> k(d<? super T> dVar);

    void n(d<?> dVar);
}
