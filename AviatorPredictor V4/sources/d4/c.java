package d4;

import b4.q0;
import b4.r0;
import d4.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public abstract class c<E> implements t<E> {

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3410d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "onCloseHandler");

    /* renamed from: b, reason: collision with root package name */
    protected final u3.l<E, k3.s> f3411b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.coroutines.internal.l f3412c = new kotlinx.coroutines.internal.l();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public static final class a<E> extends s {

        /* renamed from: h, reason: collision with root package name */
        public final E f3413h;

        public a(E e5) {
            this.f3413h = e5;
        }

        @Override // d4.s
        public y A(n.b bVar) {
            return b4.n.f1027a;
        }

        @Override // kotlinx.coroutines.internal.n
        public String toString() {
            return "SendBuffered@" + r0.b(this) + '(' + this.f3413h + ')';
        }

        @Override // d4.s
        public void y() {
        }

        @Override // d4.s
        public Object z() {
            return this.f3413h;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(u3.l<? super E, k3.s> lVar) {
        this.f3411b = lVar;
    }

    private final int b() {
        kotlinx.coroutines.internal.l lVar = this.f3412c;
        int r22 = 0;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) lVar.o(); !kotlin.jvm.internal.i.a(nVar, lVar); nVar = nVar.p()) {
            if (nVar instanceof kotlinx.coroutines.internal.n) {
                r22++;
            }
        }
        return r22;
    }

    private final String f() {
        kotlinx.coroutines.internal.n p4 = this.f3412c.p();
        if (p4 == this.f3412c) {
            return "EmptyQueue";
        }
        String nVar = p4 instanceof j ? p4.toString() : p4 instanceof o ? "ReceiveQueued" : p4 instanceof s ? "SendQueued" : kotlin.jvm.internal.i.i("UNEXPECTED:", p4);
        kotlinx.coroutines.internal.n q4 = this.f3412c.q();
        if (q4 == p4) {
            return nVar;
        }
        String str = nVar + ",queueSize=" + b();
        if (!(q4 instanceof j)) {
            return str;
        }
        return str + ",closedForSend=" + q4;
    }

    private final void g(j<?> jVar) {
        Object b5 = kotlinx.coroutines.internal.k.b(null, 1, null);
        while (true) {
            kotlinx.coroutines.internal.n q4 = jVar.q();
            o oVar = q4 instanceof o ? (o) q4 : null;
            if (oVar == null) {
                break;
            } else if (oVar.u()) {
                b5 = kotlinx.coroutines.internal.k.c(b5, oVar);
            } else {
                oVar.r();
            }
        }
        if (b5 != null) {
            if (b5 instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) b5;
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int r12 = size - 1;
                        ((o) arrayList.get(size)).z(jVar);
                        if (r12 < 0) {
                            break;
                        } else {
                            size = r12;
                        }
                    }
                }
            } else {
                ((o) b5).z(jVar);
            }
        }
        j(jVar);
    }

    private final Throwable h(j<?> jVar) {
        g(jVar);
        return jVar.F();
    }

    @Override // d4.t
    public final Object a(E e5) {
        i.b bVar;
        j<?> jVar;
        Object i4 = i(e5);
        if (i4 == b.f3405b) {
            return i.f3427a.c(k3.s.f6374a);
        }
        if (i4 == b.f3406c) {
            jVar = d();
            if (jVar == null) {
                return i.f3427a.b();
            }
            bVar = i.f3427a;
        } else {
            if (!(i4 instanceof j)) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("trySend returned ", i4).toString());
            }
            bVar = i.f3427a;
            jVar = (j) i4;
        }
        return bVar.a(h(jVar));
    }

    protected String c() {
        return "";
    }

    protected final j<?> d() {
        kotlinx.coroutines.internal.n q4 = this.f3412c.q();
        j<?> jVar = q4 instanceof j ? (j) q4 : null;
        if (jVar == null) {
            return null;
        }
        g(jVar);
        return jVar;
    }

    protected final kotlinx.coroutines.internal.l e() {
        return this.f3412c;
    }

    protected Object i(E e5) {
        q<E> l4;
        y b5;
        do {
            l4 = l();
            if (l4 == null) {
                return b.f3406c;
            }
            b5 = l4.b(e5, null);
        } while (b5 == null);
        if (q0.a()) {
            if (!(b5 == b4.n.f1027a)) {
                throw new AssertionError();
            }
        }
        l4.c(e5);
        return l4.a();
    }

    protected void j(kotlinx.coroutines.internal.n nVar) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final q<?> k(E e5) {
        kotlinx.coroutines.internal.n q4;
        kotlinx.coroutines.internal.l lVar = this.f3412c;
        a aVar = new a(e5);
        do {
            q4 = lVar.q();
            if (q4 instanceof q) {
                return (q) q4;
            }
        } while (!q4.j(aVar, lVar));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.internal.n] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    protected q<E> l() {
        ?? r12;
        kotlinx.coroutines.internal.n v4;
        kotlinx.coroutines.internal.l lVar = this.f3412c;
        while (true) {
            r12 = (kotlinx.coroutines.internal.n) lVar.o();
            if (r12 != lVar && (r12 instanceof q)) {
                if (((((q) r12) instanceof j) && !r12.t()) || (v4 = r12.v()) == null) {
                    break;
                }
                v4.s();
            }
        }
        r12 = 0;
        return (q) r12;
    }

    protected final s m() {
        kotlinx.coroutines.internal.n nVar;
        kotlinx.coroutines.internal.n v4;
        kotlinx.coroutines.internal.l lVar = this.f3412c;
        while (true) {
            nVar = (kotlinx.coroutines.internal.n) lVar.o();
            if (nVar != lVar && (nVar instanceof s)) {
                if (((((s) nVar) instanceof j) && !nVar.t()) || (v4 = nVar.v()) == null) {
                    break;
                }
                v4.s();
            }
        }
        nVar = null;
        return (s) nVar;
    }

    public String toString() {
        return r0.a(this) + '@' + r0.b(this) + '{' + f() + '}' + c();
    }
}
