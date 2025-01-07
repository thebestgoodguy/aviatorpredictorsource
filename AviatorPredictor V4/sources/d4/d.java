package d4;

import b4.q0;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public class d<E> extends d4.a<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f3414e;

    /* renamed from: f, reason: collision with root package name */
    private final e f3415f;

    /* renamed from: g, reason: collision with root package name */
    private final ReentrantLock f3416g;

    /* renamed from: h, reason: collision with root package name */
    private Object[] f3417h;

    /* renamed from: i, reason: collision with root package name */
    private int f3418i;
    private volatile /* synthetic */ int size;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3419a;

        static {
            int[] r02 = new int[e.values().length];
            r02[e.SUSPEND.ordinal()] = 1;
            r02[e.DROP_LATEST.ordinal()] = 2;
            r02[e.DROP_OLDEST.ordinal()] = 3;
            f3419a = r02;
        }
    }

    public d(int r7, e eVar, u3.l<? super E, k3.s> lVar) {
        super(lVar);
        this.f3414e = r7;
        this.f3415f = eVar;
        if (!(r7 >= 1)) {
            throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + r7 + " was specified").toString());
        }
        this.f3416g = new ReentrantLock();
        Object[] objArr = new Object[Math.min(r7, 8)];
        l3.d.e(objArr, b.f3404a, 0, 0, 6, null);
        k3.s sVar = k3.s.f6374a;
        this.f3417h = objArr;
        this.size = 0;
    }

    private final void x(int r6, E e5) {
        if (r6 < this.f3414e) {
            y(r6);
            Object[] objArr = this.f3417h;
            objArr[(this.f3418i + r6) % objArr.length] = e5;
            return;
        }
        if (q0.a()) {
            if (!(this.f3415f == e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f3417h;
        int r22 = this.f3418i;
        objArr2[r22 % objArr2.length] = null;
        objArr2[(r6 + r22) % objArr2.length] = e5;
        this.f3418i = (r22 + 1) % objArr2.length;
    }

    private final void y(int r9) {
        Object[] objArr = this.f3417h;
        if (r9 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f3414e);
            Object[] objArr2 = new Object[min];
            if (r9 > 0) {
                int r32 = 0;
                while (true) {
                    int r4 = r32 + 1;
                    Object[] objArr3 = this.f3417h;
                    objArr2[r32] = objArr3[(this.f3418i + r32) % objArr3.length];
                    if (r4 >= r9) {
                        break;
                    } else {
                        r32 = r4;
                    }
                }
            }
            l3.d.d(objArr2, b.f3404a, r9, min);
            this.f3417h = objArr2;
            this.f3418i = 0;
        }
    }

    private final y z(int r4) {
        if (r4 < this.f3414e) {
            this.size = r4 + 1;
            return null;
        }
        int r42 = a.f3419a[this.f3415f.ordinal()];
        if (r42 == 1) {
            return b.f3406c;
        }
        if (r42 == 2) {
            return b.f3405b;
        }
        if (r42 == 3) {
            return null;
        }
        throw new k3.k();
    }

    @Override // d4.c
    protected String c() {
        return "(buffer:capacity=" + this.f3414e + ",size=" + this.size + ')';
    }

    @Override // d4.c
    protected Object i(E e5) {
        q<E> l4;
        y b5;
        ReentrantLock reentrantLock = this.f3416g;
        reentrantLock.lock();
        try {
            int r12 = this.size;
            j<?> d5 = d();
            if (d5 != null) {
                return d5;
            }
            y z4 = z(r12);
            if (z4 != null) {
                return z4;
            }
            if (r12 == 0) {
                do {
                    l4 = l();
                    if (l4 != null) {
                        if (l4 instanceof j) {
                            this.size = r12;
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
                this.size = r12;
                k3.s sVar = k3.s.f6374a;
                reentrantLock.unlock();
                l4.c(e5);
                return l4.a();
            }
            x(r12, e5);
            return b.f3405b;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // d4.a
    protected boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f3416g;
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
        return this.size == 0;
    }

    @Override // d4.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f3416g;
        reentrantLock.lock();
        try {
            int r12 = this.size;
            if (r12 == 0) {
                Object d5 = d();
                if (d5 == null) {
                    d5 = b.f3407d;
                }
                return d5;
            }
            Object[] objArr = this.f3417h;
            int r32 = this.f3418i;
            Object obj = objArr[r32];
            s sVar = null;
            objArr[r32] = null;
            this.size = r12 - 1;
            Object obj2 = b.f3407d;
            if (r12 == this.f3414e) {
                s sVar2 = null;
                while (true) {
                    s m4 = m();
                    if (m4 == null) {
                        sVar = sVar2;
                        break;
                    }
                    y A = m4.A(null);
                    if (A != null) {
                        if (q0.a()) {
                            if (!(A == b4.n.f1027a)) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m4.z();
                        sVar = m4;
                        r6 = true;
                    } else {
                        m4.B();
                        sVar2 = m4;
                    }
                }
            }
            if (obj2 != b.f3407d && !(obj2 instanceof j)) {
                this.size = r12;
                Object[] objArr2 = this.f3417h;
                objArr2[(this.f3418i + r12) % objArr2.length] = obj2;
            }
            this.f3418i = (this.f3418i + 1) % this.f3417h.length;
            k3.s sVar3 = k3.s.f6374a;
            if (r6) {
                kotlin.jvm.internal.i.b(sVar);
                sVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
