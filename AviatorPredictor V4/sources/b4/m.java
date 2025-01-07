package b4;

import b4.p1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class m<T> extends u0<T> implements k<T>, kotlin.coroutines.jvm.internal.e {

    /* renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1021k = AtomicIntegerFieldUpdater.newUpdater(m.class, "_decision");

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1022l = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: h, reason: collision with root package name */
    private final n3.d<T> f1023h;

    /* renamed from: i, reason: collision with root package name */
    private final n3.g f1024i;

    /* renamed from: j, reason: collision with root package name */
    private y0 f1025j;

    /* JADX WARN: Multi-variable type inference failed */
    public m(n3.d<? super T> dVar, int r4) {
        super(r4);
        this.f1023h = dVar;
        if (q0.a()) {
            if (!(r4 != -1)) {
                throw new AssertionError();
            }
        }
        this.f1024i = dVar.getContext();
        this._decision = 0;
        this._state = d.f996e;
    }

    private final boolean A() {
        return v0.c(this.f1052g) && ((kotlinx.coroutines.internal.f) this.f1023h).n();
    }

    private final i B(u3.l<? super Throwable, k3.s> lVar) {
        return lVar instanceof i ? (i) lVar : new m1(lVar);
    }

    private final void C(u3.l<? super Throwable, k3.s> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        n3.d<T> dVar = this.f1023h;
        kotlinx.coroutines.internal.f fVar = dVar instanceof kotlinx.coroutines.internal.f ? (kotlinx.coroutines.internal.f) dVar : null;
        Throwable s4 = fVar != null ? fVar.s(this) : null;
        if (s4 == null) {
            return;
        }
        s();
        q(s4);
    }

    private final void H(Object obj, int r10, u3.l<? super Throwable, k3.s> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (!(obj2 instanceof c2)) {
                if (obj2 instanceof p) {
                    p pVar = (p) obj2;
                    if (pVar.c()) {
                        if (lVar == null) {
                            return;
                        }
                        n(lVar, pVar.f1086a);
                        return;
                    }
                }
                i(obj);
                throw new k3.d();
            }
        } while (!l.a(f1022l, this, obj2, J((c2) obj2, obj, r10, lVar, null)));
        t();
        u(r10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I(m mVar, Object obj, int r22, u3.l lVar, int r4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((r4 & 4) != 0) {
            lVar = null;
        }
        mVar.H(obj, r22, lVar);
    }

    private final Object J(c2 c2Var, Object obj, int r11, u3.l<? super Throwable, k3.s> lVar, Object obj2) {
        if (obj instanceof z) {
            if (q0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!q0.a()) {
                return obj;
            }
            if (lVar == null) {
                return obj;
            }
            throw new AssertionError();
        }
        if (!v0.b(r11) && obj2 == null) {
            return obj;
        }
        if (lVar != null || (((c2Var instanceof i) && !(c2Var instanceof e)) || obj2 != null)) {
            return new y(obj, c2Var instanceof i ? (i) c2Var : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    private final boolean K() {
        do {
            int r02 = this._decision;
            if (r02 != 0) {
                if (r02 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f1021k.compareAndSet(this, 0, 2));
        return true;
    }

    private final kotlinx.coroutines.internal.y L(Object obj, Object obj2, u3.l<? super Throwable, k3.s> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (!(obj3 instanceof c2)) {
                if (!(obj3 instanceof y) || obj2 == null) {
                    return null;
                }
                y yVar = (y) obj3;
                if (yVar.f1082d != obj2) {
                    return null;
                }
                if (!q0.a() || kotlin.jvm.internal.i.a(yVar.f1079a, obj)) {
                    return n.f1027a;
                }
                throw new AssertionError();
            }
        } while (!l.a(f1022l, this, obj3, J((c2) obj3, obj, this.f1052g, lVar, obj2)));
        t();
        return n.f1027a;
    }

    private final boolean M() {
        do {
            int r02 = this._decision;
            if (r02 != 0) {
                if (r02 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f1021k.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Already resumed, but proposed with update ", obj).toString());
    }

    private final void l(u3.l<? super Throwable, k3.s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            i0.a(getContext(), new c0(kotlin.jvm.internal.i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean r(Throwable th) {
        if (A()) {
            return ((kotlinx.coroutines.internal.f) this.f1023h).q(th);
        }
        return false;
    }

    private final void t() {
        if (A()) {
            return;
        }
        s();
    }

    private final void u(int r22) {
        if (K()) {
            return;
        }
        v0.a(this, r22);
    }

    private final String y() {
        Object x4 = x();
        return x4 instanceof c2 ? "Active" : x4 instanceof p ? "Cancelled" : "Completed";
    }

    private final y0 z() {
        p1 p1Var = (p1) getContext().get(p1.f1038a);
        if (p1Var == null) {
            return null;
        }
        y0 d5 = p1.a.d(p1Var, true, false, new q(this), 2, null);
        this.f1025j = d5;
        return d5;
    }

    protected String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (r(th)) {
            return;
        }
        q(th);
        t();
    }

    public final boolean G() {
        if (q0.a()) {
            if (!(this.f1052g == 2)) {
                throw new AssertionError();
            }
        }
        if (q0.a()) {
            if (!(this.f1025j != b2.f994e)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (q0.a() && !(!(obj instanceof c2))) {
            throw new AssertionError();
        }
        if ((obj instanceof y) && ((y) obj).f1082d != null) {
            s();
            return false;
        }
        this._decision = 0;
        this._state = d.f996e;
        return true;
    }

    @Override // b4.u0
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof c2) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof z) {
                return;
            }
            if (obj2 instanceof y) {
                y yVar = (y) obj2;
                if (!(!yVar.c())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (l.a(f1022l, this, obj2, y.b(yVar, null, null, null, null, th, 15, null))) {
                    yVar.d(this, th);
                    return;
                }
            } else if (l.a(f1022l, this, obj2, new y(obj2, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    @Override // b4.k
    public Object b(T t4, Object obj) {
        return L(t4, obj, null);
    }

    @Override // b4.u0
    public final n3.d<T> c() {
        return this.f1023h;
    }

    @Override // b4.u0
    public Throwable d(Object obj) {
        Throwable j4;
        Throwable d5 = super.d(obj);
        if (d5 == null) {
            return null;
        }
        n3.d<T> c5 = c();
        if (!q0.d() || !(c5 instanceof kotlin.coroutines.jvm.internal.e)) {
            return d5;
        }
        j4 = kotlinx.coroutines.internal.x.j(d5, (kotlin.coroutines.jvm.internal.e) c5);
        return j4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b4.u0
    public <T> T e(Object obj) {
        return obj instanceof y ? (T) ((y) obj).f1079a : obj;
    }

    @Override // b4.k
    public void f(u3.l<? super Throwable, k3.s> lVar) {
        i B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof d) {
                if (l.a(f1022l, this, obj, B)) {
                    return;
                }
            } else if (obj instanceof i) {
                C(lVar, obj);
            } else {
                boolean z4 = obj instanceof z;
                if (z4) {
                    z zVar = (z) obj;
                    if (!zVar.b()) {
                        C(lVar, obj);
                    }
                    if (obj instanceof p) {
                        if (!z4) {
                            zVar = null;
                        }
                        l(lVar, zVar != null ? zVar.f1086a : null);
                        return;
                    }
                    return;
                }
                if (obj instanceof y) {
                    y yVar = (y) obj;
                    if (yVar.f1080b != null) {
                        C(lVar, obj);
                    }
                    if (B instanceof e) {
                        return;
                    }
                    if (yVar.c()) {
                        l(lVar, yVar.f1083e);
                        return;
                    } else {
                        if (l.a(f1022l, this, obj, y.b(yVar, null, B, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (B instanceof e) {
                        return;
                    }
                    if (l.a(f1022l, this, obj, new y(obj, B, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n3.d<T> dVar = this.f1023h;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // n3.d
    public n3.g getContext() {
        return this.f1024i;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // b4.u0
    public Object h() {
        return x();
    }

    @Override // b4.k
    public Object j(Throwable th) {
        return L(new z(th, false, 2, null), null, null);
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.a(th);
        } catch (Throwable th2) {
            i0.a(getContext(), new c0(kotlin.jvm.internal.i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    @Override // b4.k
    public void m(Object obj) {
        if (q0.a()) {
            if (!(obj == n.f1027a)) {
                throw new AssertionError();
            }
        }
        u(this.f1052g);
    }

    public final void n(u3.l<? super Throwable, k3.s> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            i0.a(getContext(), new c0(kotlin.jvm.internal.i.i("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // b4.k
    public Object o(T t4, Object obj, u3.l<? super Throwable, k3.s> lVar) {
        return L(t4, obj, lVar);
    }

    @Override // b4.k
    public void p(T t4, u3.l<? super Throwable, k3.s> lVar) {
        H(t4, this.f1052g, lVar);
    }

    public boolean q(Throwable th) {
        Object obj;
        boolean z4;
        do {
            obj = this._state;
            if (!(obj instanceof c2)) {
                return false;
            }
            z4 = obj instanceof i;
        } while (!l.a(f1022l, this, obj, new p(this, th, z4)));
        i iVar = z4 ? (i) obj : null;
        if (iVar != null) {
            k(iVar, th);
        }
        t();
        u(this.f1052g);
        return true;
    }

    @Override // n3.d
    public void resumeWith(Object obj) {
        I(this, d0.b(obj, this), this.f1052g, null, 4, null);
    }

    public final void s() {
        y0 y0Var = this.f1025j;
        if (y0Var == null) {
            return;
        }
        y0Var.d();
        this.f1025j = b2.f994e;
    }

    public String toString() {
        return D() + '(' + r0.c(this.f1023h) + "){" + y() + "}@" + r0.b(this);
    }

    public Throwable v(p1 p1Var) {
        return p1Var.l();
    }

    public final Object w() {
        p1 p1Var;
        Throwable j4;
        Throwable j5;
        Object c5;
        boolean A = A();
        if (M()) {
            if (this.f1025j == null) {
                z();
            }
            if (A) {
                F();
            }
            c5 = o3.d.c();
            return c5;
        }
        if (A) {
            F();
        }
        Object x4 = x();
        if (x4 instanceof z) {
            Throwable th = ((z) x4).f1086a;
            if (!q0.d()) {
                throw th;
            }
            j5 = kotlinx.coroutines.internal.x.j(th, this);
            throw j5;
        }
        if (!v0.b(this.f1052g) || (p1Var = (p1) getContext().get(p1.f1038a)) == null || p1Var.e()) {
            return e(x4);
        }
        CancellationException l4 = p1Var.l();
        a(x4, l4);
        if (!q0.d()) {
            throw l4;
        }
        j4 = kotlinx.coroutines.internal.x.j(l4, this);
        throw j4;
    }

    public final Object x() {
        return this._state;
    }
}
