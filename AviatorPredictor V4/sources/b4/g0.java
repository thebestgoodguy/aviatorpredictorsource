package b4;

import n3.e;
import n3.g;

/* loaded from: classes.dex */
public abstract class g0 extends n3.a implements n3.e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1001e = new a(null);

    public static final class a extends n3.b<n3.e, g0> {

        /* renamed from: b4.g0$a$a, reason: collision with other inner class name */
        static final class C0011a extends kotlin.jvm.internal.j implements u3.l<g.b, g0> {

            /* renamed from: e, reason: collision with root package name */
            public static final C0011a f1002e = new C0011a();

            C0011a() {
                super(1);
            }

            @Override // u3.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(g.b bVar) {
                if (bVar instanceof g0) {
                    return (g0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(n3.e.f6691d, C0011a.f1002e);
        }

        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public g0() {
        super(n3.e.f6691d);
    }

    public abstract void F(n3.g gVar, Runnable runnable);

    public boolean H(n3.g gVar) {
        return true;
    }

    @Override // n3.a, n3.g.b, n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // n3.e
    public final <T> n3.d<T> k(n3.d<? super T> dVar) {
        return new kotlinx.coroutines.internal.f(this, dVar);
    }

    @Override // n3.a, n3.g
    public n3.g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    @Override // n3.e
    public final void n(n3.d<?> dVar) {
        ((kotlinx.coroutines.internal.f) dVar).r();
    }

    public String toString() {
        return r0.a(this) + '@' + r0.b(this);
    }
}
