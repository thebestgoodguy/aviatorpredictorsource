package n3;

import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import n3.e;
import u3.p;

/* loaded from: classes.dex */
public interface g {

    public static final class a {

        /* renamed from: n3.g$a$a, reason: collision with other inner class name */
        static final class C0071a extends j implements p<g, b, g> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0071a f6693e = new C0071a();

            C0071a() {
                super(2);
            }

            @Override // u3.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g gVar, b bVar) {
                n3.c cVar;
                i.d(gVar, "acc");
                i.d(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f6694e;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.f6691d;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new n3.c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new n3.c(bVar, eVar);
                    }
                    cVar = new n3.c(new n3.c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            i.d(gVar, "this");
            i.d(gVar2, "context");
            return gVar2 == h.f6694e ? gVar : (g) gVar2.fold(gVar, C0071a.f6693e);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r4, p<? super R, ? super b, ? extends R> pVar) {
                i.d(bVar, "this");
                i.d(pVar, "operation");
                return pVar.invoke(r4, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                i.d(bVar, "this");
                i.d(cVar, "key");
                if (i.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                i.d(bVar, "this");
                i.d(cVar, "key");
                return i.a(bVar.getKey(), cVar) ? h.f6694e : bVar;
            }

            public static g d(b bVar, g gVar) {
                i.d(bVar, "this");
                i.d(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // n3.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r4, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
