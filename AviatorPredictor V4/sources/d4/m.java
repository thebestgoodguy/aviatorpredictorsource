package d4;

import b4.q0;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final ReentrantLock f3431e;

    /* renamed from: f, reason: collision with root package name */
    private Object f3432f;

    public m(u3.l<? super E, k3.s> lVar) {
        super(lVar);
        this.f3431e = new ReentrantLock();
        this.f3432f = b.f3404a;
    }

    private final g0 x(Object obj) {
        u3.l<E, k3.s> lVar;
        Object obj2 = this.f3432f;
        g0 g0Var = null;
        if (obj2 != b.f3404a && (lVar = this.f3411b) != null) {
            g0Var = kotlinx.coroutines.internal.t.d(lVar, obj2, null, 2, null);
        }
        this.f3432f = obj;
        return g0Var;
    }

    @Override // d4.c
    protected String c() {
        return "(value=" + this.f3432f + ')';
    }

    @Override // d4.c
    protected Object i(E e5) {
        q<E> l4;
        y b5;
        ReentrantLock reentrantLock = this.f3431e;
        reentrantLock.lock();
        try {
            j<?> d5 = d();
            if (d5 != null) {
                return d5;
            }
            if (this.f3432f == b.f3404a) {
                do {
                    l4 = l();
                    if (l4 != null) {
                        if (l4 instanceof j) {
                            return l4;
                        }
                        b5 = l4.b(e5, null);
                    }
                } while (b5 == null);
                if (q0.a()) {
                    if (!(b5 == b4.n.f1027a)) {
                        throw new AssertionError();
                    }
                }
                k3.s sVar = k3.s.f6374a;
                reentrantLock.unlock();
                l4.c(e5);
                return l4.a();
            }
            g0 x4 = x(e5);
            if (x4 == null) {
                return b.f3405b;
            }
            throw x4;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // d4.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f3431e;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // d4.a
    protected final boolean r() {
        return false;
    }

    @Override // d4.a
    protected final boolean s() {
        return this.f3432f == b.f3404a;
    }

    @Override // d4.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f3431e;
        reentrantLock.lock();
        try {
            Object obj = this.f3432f;
            y yVar = b.f3404a;
            if (obj != yVar) {
                this.f3432f = yVar;
                k3.s sVar = k3.s.f6374a;
                return obj;
            }
            Object d5 = d();
            if (d5 == null) {
                d5 = b.f3407d;
            }
            return d5;
        } finally {
            reentrantLock.unlock();
        }
    }
}
