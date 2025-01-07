package d4;

import b4.k;
import b4.q0;
import b4.r0;
import k3.m;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.x;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public abstract class a<E> extends d4.c<E> implements f<E> {

    /* renamed from: d4.a$a, reason: collision with other inner class name */
    private static final class C0030a<E> implements g<E> {

        /* renamed from: a, reason: collision with root package name */
        public final a<E> f3396a;

        /* renamed from: b, reason: collision with root package name */
        private Object f3397b = d4.b.f3407d;

        public C0030a(a<E> aVar) {
            this.f3396a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f3430h == null) {
                return false;
            }
            throw x.k(jVar.E());
        }

        private final Object d(n3.d<? super Boolean> dVar) {
            n3.d b5;
            Object c5;
            Object a5;
            b5 = o3.c.b(dVar);
            b4.m a6 = b4.o.a(b5);
            b bVar = new b(this, a6);
            while (true) {
                if (this.f3396a.p(bVar)) {
                    this.f3396a.w(a6, bVar);
                    break;
                }
                Object v4 = this.f3396a.v();
                e(v4);
                if (v4 instanceof j) {
                    j jVar = (j) v4;
                    if (jVar.f3430h == null) {
                        a5 = kotlin.coroutines.jvm.internal.b.a(false);
                        m.a aVar = k3.m.f6368e;
                    } else {
                        Throwable E = jVar.E();
                        m.a aVar2 = k3.m.f6368e;
                        a5 = k3.n.a(E);
                    }
                    a6.resumeWith(k3.m.a(a5));
                } else if (v4 != d4.b.f3407d) {
                    Boolean a7 = kotlin.coroutines.jvm.internal.b.a(true);
                    u3.l<E, k3.s> lVar = this.f3396a.f3411b;
                    a6.p(a7, lVar == null ? null : kotlinx.coroutines.internal.t.a(lVar, v4, a6.getContext()));
                }
            }
            Object w4 = a6.w();
            c5 = o3.d.c();
            if (w4 == c5) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return w4;
        }

        @Override // d4.g
        public Object a(n3.d<? super Boolean> dVar) {
            Object b5 = b();
            y yVar = d4.b.f3407d;
            if (b5 == yVar) {
                e(this.f3396a.v());
                if (b() == yVar) {
                    return d(dVar);
                }
            }
            return kotlin.coroutines.jvm.internal.b.a(c(b()));
        }

        public final Object b() {
            return this.f3397b;
        }

        public final void e(Object obj) {
            this.f3397b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d4.g
        public E next() {
            E e5 = (E) this.f3397b;
            if (e5 instanceof j) {
                throw x.k(((j) e5).E());
            }
            y yVar = d4.b.f3407d;
            if (e5 == yVar) {
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            this.f3397b = yVar;
            return e5;
        }
    }

    private static class b<E> extends o<E> {

        /* renamed from: h, reason: collision with root package name */
        public final C0030a<E> f3398h;

        /* renamed from: i, reason: collision with root package name */
        public final b4.k<Boolean> f3399i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0030a<E> c0030a, b4.k<? super Boolean> kVar) {
            this.f3398h = c0030a;
            this.f3399i = kVar;
        }

        public u3.l<Throwable, k3.s> A(E e5) {
            u3.l<E, k3.s> lVar = this.f3398h.f3396a.f3411b;
            if (lVar == null) {
                return null;
            }
            return kotlinx.coroutines.internal.t.a(lVar, e5, this.f3399i.getContext());
        }

        @Override // d4.q
        public y b(E e5, n.b bVar) {
            Object o4 = this.f3399i.o(Boolean.TRUE, null, A(e5));
            if (o4 == null) {
                return null;
            }
            if (q0.a()) {
                if (!(o4 == b4.n.f1027a)) {
                    throw new AssertionError();
                }
            }
            return b4.n.f1027a;
        }

        @Override // d4.q
        public void c(E e5) {
            this.f3398h.e(e5);
            this.f3399i.m(b4.n.f1027a);
        }

        @Override // kotlinx.coroutines.internal.n
        public String toString() {
            return kotlin.jvm.internal.i.i("ReceiveHasNext@", r0.b(this));
        }

        @Override // d4.o
        public void z(j<?> jVar) {
            Object a5 = jVar.f3430h == null ? k.a.a(this.f3399i, Boolean.FALSE, null, 2, null) : this.f3399i.j(jVar.E());
            if (a5 != null) {
                this.f3398h.e(jVar);
                this.f3399i.m(a5);
            }
        }
    }

    private final class c extends b4.e {

        /* renamed from: e, reason: collision with root package name */
        private final o<?> f3400e;

        public c(o<?> oVar) {
            this.f3400e = oVar;
        }

        @Override // b4.j
        public void a(Throwable th) {
            if (this.f3400e.u()) {
                a.this.t();
            }
        }

        @Override // u3.l
        public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
            a(th);
            return k3.s.f6374a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f3400e + ']';
        }
    }

    public static final class d extends n.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.n f3402d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ a f3403e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlinx.coroutines.internal.n nVar, a aVar) {
            super(nVar);
            this.f3402d = nVar;
            this.f3403e = aVar;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.n nVar) {
            if (this.f3403e.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.m.a();
        }
    }

    public a(u3.l<? super E, k3.s> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q4 = q(oVar);
        if (q4) {
            u();
        }
        return q4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(b4.k<?> kVar, o<?> oVar) {
        kVar.f(new c(oVar));
    }

    @Override // d4.p
    public final g<E> iterator() {
        return new C0030a(this);
    }

    @Override // d4.c
    protected q<E> l() {
        q<E> l4 = super.l();
        if (l4 != null && !(l4 instanceof j)) {
            t();
        }
        return l4;
    }

    protected boolean q(o<? super E> oVar) {
        int x4;
        kotlinx.coroutines.internal.n q4;
        if (!r()) {
            kotlinx.coroutines.internal.n e5 = e();
            d dVar = new d(oVar, this);
            do {
                kotlinx.coroutines.internal.n q5 = e5.q();
                if (!(!(q5 instanceof s))) {
                    return false;
                }
                x4 = q5.x(oVar, e5, dVar);
                if (x4 != 1) {
                }
            } while (x4 != 2);
            return false;
        }
        kotlinx.coroutines.internal.n e6 = e();
        do {
            q4 = e6.q();
            if (!(!(q4 instanceof s))) {
                return false;
            }
        } while (!q4.j(oVar, e6));
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m4 = m();
            if (m4 == null) {
                return d4.b.f3407d;
            }
            y A = m4.A(null);
            if (A != null) {
                if (q0.a()) {
                    if (!(A == b4.n.f1027a)) {
                        throw new AssertionError();
                    }
                }
                m4.y();
                return m4.z();
            }
            m4.B();
        }
    }
}
