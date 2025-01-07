package b4;

import b4.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import n3.g;

/* loaded from: classes.dex */
public class w1 implements p1, t, d2 {

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f1059e = AtomicReferenceFieldUpdater.newUpdater(w1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    private static final class a extends v1 {

        /* renamed from: i, reason: collision with root package name */
        private final w1 f1060i;

        /* renamed from: j, reason: collision with root package name */
        private final b f1061j;

        /* renamed from: k, reason: collision with root package name */
        private final s f1062k;

        /* renamed from: l, reason: collision with root package name */
        private final Object f1063l;

        public a(w1 w1Var, b bVar, s sVar, Object obj) {
            this.f1060i = w1Var;
            this.f1061j = bVar;
            this.f1062k = sVar;
            this.f1063l = obj;
        }

        @Override // u3.l
        public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
            y(th);
            return k3.s.f6374a;
        }

        @Override // b4.b0
        public void y(Throwable th) {
            this.f1060i.F(this.f1061j, this.f1062k, this.f1063l);
        }
    }

    private static final class b implements k1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: e, reason: collision with root package name */
        private final a2 f1064e;

        public b(a2 a2Var, boolean z4, Throwable th) {
            this.f1064e = a2Var;
            this._isCompleting = z4 ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> b() {
            return new ArrayList<>(4);
        }

        private final Object c() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        public final void a(Throwable th) {
            Throwable d5 = d();
            if (d5 == null) {
                m(th);
                return;
            }
            if (th == d5) {
                return;
            }
            Object c5 = c();
            if (c5 == null) {
                l(th);
                return;
            }
            if (!(c5 instanceof Throwable)) {
                if (!(c5 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("State is ", c5).toString());
                }
                ((ArrayList) c5).add(th);
            } else {
                if (th == c5) {
                    return;
                }
                ArrayList<Throwable> b5 = b();
                b5.add(c5);
                b5.add(th);
                k3.s sVar = k3.s.f6374a;
                l(b5);
            }
        }

        public final Throwable d() {
            return (Throwable) this._rootCause;
        }

        @Override // b4.k1
        public boolean e() {
            return d() == null;
        }

        @Override // b4.k1
        public a2 f() {
            return this.f1064e;
        }

        public final boolean g() {
            return d() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            kotlinx.coroutines.internal.y yVar;
            Object c5 = c();
            yVar = x1.f1076e;
            return c5 == yVar;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            kotlinx.coroutines.internal.y yVar;
            Object c5 = c();
            if (c5 == null) {
                arrayList = b();
            } else if (c5 instanceof Throwable) {
                ArrayList<Throwable> b5 = b();
                b5.add(c5);
                arrayList = b5;
            } else {
                if (!(c5 instanceof ArrayList)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("State is ", c5).toString());
                }
                arrayList = (ArrayList) c5;
            }
            Throwable d5 = d();
            if (d5 != null) {
                arrayList.add(0, d5);
            }
            if (th != null && !kotlin.jvm.internal.i.a(th, d5)) {
                arrayList.add(th);
            }
            yVar = x1.f1076e;
            l(yVar);
            return arrayList;
        }

        public final void k(boolean z4) {
            this._isCompleting = z4 ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + d() + ", exceptions=" + c() + ", list=" + f() + ']';
        }
    }

    public static final class c extends n.a {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.internal.n f1065d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ w1 f1066e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Object f1067f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlinx.coroutines.internal.n nVar, w1 w1Var, Object obj) {
            super(nVar);
            this.f1065d = nVar;
            this.f1066e = w1Var;
            this.f1067f = obj;
        }

        @Override // kotlinx.coroutines.internal.c
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(kotlinx.coroutines.internal.n nVar) {
            if (this.f1066e.P() == this.f1067f) {
                return null;
            }
            return kotlinx.coroutines.internal.m.a();
        }
    }

    public w1(boolean z4) {
        this._state = z4 ? x1.f1078g : x1.f1077f;
        this._parentHandle = null;
    }

    private final Object A(Object obj) {
        kotlinx.coroutines.internal.y yVar;
        Object q02;
        kotlinx.coroutines.internal.y yVar2;
        do {
            Object P = P();
            if (!(P instanceof k1) || ((P instanceof b) && ((b) P).h())) {
                yVar = x1.f1072a;
                return yVar;
            }
            q02 = q0(P, new z(G(obj), false, 2, null));
            yVar2 = x1.f1074c;
        } while (q02 == yVar2);
        return q02;
    }

    private final boolean B(Throwable th) {
        if (U()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        r O = O();
        return (O == null || O == b2.f994e) ? z4 : O.i(th) || z4;
    }

    private final void E(k1 k1Var, Object obj) {
        r O = O();
        if (O != null) {
            O.d();
            i0(b2.f994e);
        }
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar != null ? zVar.f1086a : null;
        if (!(k1Var instanceof v1)) {
            a2 f5 = k1Var.f();
            if (f5 == null) {
                return;
            }
            b0(f5, th);
            return;
        }
        try {
            ((v1) k1Var).y(th);
        } catch (Throwable th2) {
            R(new c0("Exception in completion handler " + k1Var + " for " + this, th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(b bVar, s sVar, Object obj) {
        if (q0.a()) {
            if (!(P() == bVar)) {
                throw new AssertionError();
            }
        }
        s Z = Z(sVar);
        if (Z == null || !s0(bVar, Z, obj)) {
            x(H(bVar, obj));
        }
    }

    private final Throwable G(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new q1(C(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((d2) obj).i();
    }

    private final Object H(b bVar, Object obj) {
        boolean g5;
        Throwable K;
        boolean z4 = true;
        if (q0.a()) {
            if (!(P() == bVar)) {
                throw new AssertionError();
            }
        }
        if (q0.a() && !(!bVar.i())) {
            throw new AssertionError();
        }
        if (q0.a() && !bVar.h()) {
            throw new AssertionError();
        }
        z zVar = obj instanceof z ? (z) obj : null;
        Throwable th = zVar == null ? null : zVar.f1086a;
        synchronized (bVar) {
            g5 = bVar.g();
            List<Throwable> j4 = bVar.j(th);
            K = K(bVar, j4);
            if (K != null) {
                w(K, j4);
            }
        }
        if (K != null && K != th) {
            obj = new z(K, false, 2, null);
        }
        if (K != null) {
            if (!B(K) && !Q(K)) {
                z4 = false;
            }
            if (z4) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((z) obj).b();
            }
        }
        if (!g5) {
            c0(K);
        }
        d0(obj);
        boolean a5 = l.a(f1059e, this, bVar, x1.g(obj));
        if (q0.a() && !a5) {
            throw new AssertionError();
        }
        E(bVar, obj);
        return obj;
    }

    private final s I(k1 k1Var) {
        s sVar = k1Var instanceof s ? (s) k1Var : null;
        if (sVar != null) {
            return sVar;
        }
        a2 f5 = k1Var.f();
        if (f5 == null) {
            return null;
        }
        return Z(f5);
    }

    private final Throwable J(Object obj) {
        z zVar = obj instanceof z ? (z) obj : null;
        if (zVar == null) {
            return null;
        }
        return zVar.f1086a;
    }

    private final Throwable K(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (bVar.g()) {
                return new q1(C(), null, this);
            }
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : list.get(0);
    }

    private final a2 N(k1 k1Var) {
        a2 f5 = k1Var.f();
        if (f5 != null) {
            return f5;
        }
        if (k1Var instanceof z0) {
            return new a2();
        }
        if (!(k1Var instanceof v1)) {
            throw new IllegalStateException(kotlin.jvm.internal.i.i("State should have list: ", k1Var).toString());
        }
        g0((v1) k1Var);
        return null;
    }

    private final Object V(Object obj) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        kotlinx.coroutines.internal.y yVar4;
        kotlinx.coroutines.internal.y yVar5;
        kotlinx.coroutines.internal.y yVar6;
        Throwable th = null;
        while (true) {
            Object P = P();
            if (P instanceof b) {
                synchronized (P) {
                    if (((b) P).i()) {
                        yVar2 = x1.f1075d;
                        return yVar2;
                    }
                    boolean g5 = ((b) P).g();
                    if (obj != null || !g5) {
                        if (th == null) {
                            th = G(obj);
                        }
                        ((b) P).a(th);
                    }
                    Throwable d5 = g5 ^ true ? ((b) P).d() : null;
                    if (d5 != null) {
                        a0(((b) P).f(), d5);
                    }
                    yVar = x1.f1072a;
                    return yVar;
                }
            }
            if (!(P instanceof k1)) {
                yVar3 = x1.f1075d;
                return yVar3;
            }
            if (th == null) {
                th = G(obj);
            }
            k1 k1Var = (k1) P;
            if (!k1Var.e()) {
                Object q02 = q0(P, new z(th, false, 2, null));
                yVar5 = x1.f1072a;
                if (q02 == yVar5) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("Cannot happen in ", P).toString());
                }
                yVar6 = x1.f1074c;
                if (q02 != yVar6) {
                    return q02;
                }
            } else if (p0(k1Var, th)) {
                yVar4 = x1.f1072a;
                return yVar4;
            }
        }
    }

    private final v1 X(u3.l<? super Throwable, k3.s> lVar, boolean z4) {
        if (z4) {
            r0 = lVar instanceof r1 ? (r1) lVar : null;
            if (r0 == null) {
                r0 = new n1(lVar);
            }
        } else {
            v1 v1Var = lVar instanceof v1 ? (v1) lVar : null;
            if (v1Var != null) {
                if (q0.a() && !(!(v1Var instanceof r1))) {
                    throw new AssertionError();
                }
                r0 = v1Var;
            }
            if (r0 == null) {
                r0 = new o1(lVar);
            }
        }
        r0.A(this);
        return r0;
    }

    private final s Z(kotlinx.coroutines.internal.n nVar) {
        while (nVar.t()) {
            nVar = nVar.q();
        }
        while (true) {
            nVar = nVar.p();
            if (!nVar.t()) {
                if (nVar instanceof s) {
                    return (s) nVar;
                }
                if (nVar instanceof a2) {
                    return null;
                }
            }
        }
    }

    private final void a0(a2 a2Var, Throwable th) {
        c0 c0Var;
        c0(th);
        c0 c0Var2 = null;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) a2Var.o(); !kotlin.jvm.internal.i.a(nVar, a2Var); nVar = nVar.p()) {
            if (nVar instanceof r1) {
                v1 v1Var = (v1) nVar;
                try {
                    v1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        k3.b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + v1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 != null) {
            R(c0Var2);
        }
        B(th);
    }

    private final void b0(a2 a2Var, Throwable th) {
        c0 c0Var;
        c0 c0Var2 = null;
        for (kotlinx.coroutines.internal.n nVar = (kotlinx.coroutines.internal.n) a2Var.o(); !kotlin.jvm.internal.i.a(nVar, a2Var); nVar = nVar.p()) {
            if (nVar instanceof v1) {
                v1 v1Var = (v1) nVar;
                try {
                    v1Var.y(th);
                } catch (Throwable th2) {
                    if (c0Var2 == null) {
                        c0Var = null;
                    } else {
                        k3.b.a(c0Var2, th2);
                        c0Var = c0Var2;
                    }
                    if (c0Var == null) {
                        c0Var2 = new c0("Exception in completion handler " + v1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (c0Var2 == null) {
            return;
        }
        R(c0Var2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [b4.j1] */
    private final void f0(z0 z0Var) {
        a2 a2Var = new a2();
        if (!z0Var.e()) {
            a2Var = new j1(a2Var);
        }
        l.a(f1059e, this, z0Var, a2Var);
    }

    private final void g0(v1 v1Var) {
        v1Var.k(new a2());
        l.a(f1059e, this, v1Var, v1Var.p());
    }

    private final int j0(Object obj) {
        z0 z0Var;
        if (!(obj instanceof z0)) {
            if (!(obj instanceof j1)) {
                return 0;
            }
            if (!l.a(f1059e, this, obj, ((j1) obj).f())) {
                return -1;
            }
            e0();
            return 1;
        }
        if (((z0) obj).e()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1059e;
        z0Var = x1.f1078g;
        if (!l.a(atomicReferenceFieldUpdater, this, obj, z0Var)) {
            return -1;
        }
        e0();
        return 1;
    }

    private final String k0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof k1 ? ((k1) obj).e() ? "Active" : "New" : obj instanceof z ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException m0(w1 w1Var, Throwable th, String str, int r32, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((r32 & 1) != 0) {
            str = null;
        }
        return w1Var.l0(th, str);
    }

    private final boolean o0(k1 k1Var, Object obj) {
        if (q0.a()) {
            if (!((k1Var instanceof z0) || (k1Var instanceof v1))) {
                throw new AssertionError();
            }
        }
        if (q0.a() && !(!(obj instanceof z))) {
            throw new AssertionError();
        }
        if (!l.a(f1059e, this, k1Var, x1.g(obj))) {
            return false;
        }
        c0(null);
        d0(obj);
        E(k1Var, obj);
        return true;
    }

    private final boolean p0(k1 k1Var, Throwable th) {
        if (q0.a() && !(!(k1Var instanceof b))) {
            throw new AssertionError();
        }
        if (q0.a() && !k1Var.e()) {
            throw new AssertionError();
        }
        a2 N = N(k1Var);
        if (N == null) {
            return false;
        }
        if (!l.a(f1059e, this, k1Var, new b(N, false, th))) {
            return false;
        }
        a0(N, th);
        return true;
    }

    private final Object q0(Object obj, Object obj2) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        if (!(obj instanceof k1)) {
            yVar2 = x1.f1072a;
            return yVar2;
        }
        if ((!(obj instanceof z0) && !(obj instanceof v1)) || (obj instanceof s) || (obj2 instanceof z)) {
            return r0((k1) obj, obj2);
        }
        if (o0((k1) obj, obj2)) {
            return obj2;
        }
        yVar = x1.f1074c;
        return yVar;
    }

    private final Object r0(k1 k1Var, Object obj) {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        a2 N = N(k1Var);
        if (N == null) {
            yVar3 = x1.f1074c;
            return yVar3;
        }
        b bVar = k1Var instanceof b ? (b) k1Var : null;
        if (bVar == null) {
            bVar = new b(N, false, null);
        }
        synchronized (bVar) {
            if (bVar.h()) {
                yVar2 = x1.f1072a;
                return yVar2;
            }
            bVar.k(true);
            if (bVar != k1Var && !l.a(f1059e, this, k1Var, bVar)) {
                yVar = x1.f1074c;
                return yVar;
            }
            if (q0.a() && !(!bVar.i())) {
                throw new AssertionError();
            }
            boolean g5 = bVar.g();
            z zVar = obj instanceof z ? (z) obj : null;
            if (zVar != null) {
                bVar.a(zVar.f1086a);
            }
            Throwable d5 = true ^ g5 ? bVar.d() : null;
            k3.s sVar = k3.s.f6374a;
            if (d5 != null) {
                a0(N, d5);
            }
            s I = I(k1Var);
            return (I == null || !s0(bVar, I, obj)) ? H(bVar, obj) : x1.f1073b;
        }
    }

    private final boolean s0(b bVar, s sVar, Object obj) {
        while (p1.a.d(sVar.f1046i, false, false, new a(this, bVar, sVar, obj), 1, null) == b2.f994e) {
            sVar = Z(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(Object obj, a2 a2Var, v1 v1Var) {
        int x4;
        c cVar = new c(v1Var, this, obj);
        do {
            x4 = a2Var.q().x(v1Var, a2Var, cVar);
            if (x4 == 1) {
                return true;
            }
        } while (x4 != 2);
        return false;
    }

    private final void w(Throwable th, List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Throwable n4 = !q0.d() ? th : kotlinx.coroutines.internal.x.n(th);
        for (Throwable th2 : list) {
            if (q0.d()) {
                th2 = kotlinx.coroutines.internal.x.n(th2);
            }
            if (th2 != th && th2 != n4 && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                k3.b.a(th, th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String C() {
        return "Job was cancelled";
    }

    public boolean D(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return y(th) && L();
    }

    public boolean L() {
        return true;
    }

    public boolean M() {
        return false;
    }

    public final r O() {
        return (r) this._parentHandle;
    }

    public final Object P() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof kotlinx.coroutines.internal.u)) {
                return obj;
            }
            ((kotlinx.coroutines.internal.u) obj).c(this);
        }
    }

    protected boolean Q(Throwable th) {
        return false;
    }

    public void R(Throwable th) {
        throw th;
    }

    protected final void S(p1 p1Var) {
        if (q0.a()) {
            if (!(O() == null)) {
                throw new AssertionError();
            }
        }
        if (p1Var == null) {
            i0(b2.f994e);
            return;
        }
        p1Var.a();
        r v4 = p1Var.v(this);
        i0(v4);
        if (T()) {
            v4.d();
            i0(b2.f994e);
        }
    }

    public final boolean T() {
        return !(P() instanceof k1);
    }

    protected boolean U() {
        return false;
    }

    public final Object W(Object obj) {
        Object q02;
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        do {
            q02 = q0(P(), obj);
            yVar = x1.f1072a;
            if (q02 == yVar) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, J(obj));
            }
            yVar2 = x1.f1074c;
        } while (q02 == yVar2);
        return q02;
    }

    public String Y() {
        return r0.a(this);
    }

    @Override // b4.p1
    public final boolean a() {
        int j02;
        do {
            j02 = j0(P());
            if (j02 == 0) {
                return false;
            }
        } while (j02 != 1);
        return true;
    }

    protected void c0(Throwable th) {
    }

    protected void d0(Object obj) {
    }

    @Override // b4.p1
    public boolean e() {
        Object P = P();
        return (P instanceof k1) && ((k1) P).e();
    }

    protected void e0() {
    }

    @Override // n3.g
    public <R> R fold(R r4, u3.p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) p1.a.b(this, r4, pVar);
    }

    @Override // n3.g.b, n3.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) p1.a.c(this, cVar);
    }

    @Override // n3.g.b
    public final g.c<?> getKey() {
        return p1.f1038a;
    }

    @Override // b4.p1
    public final y0 h(boolean z4, boolean z5, u3.l<? super Throwable, k3.s> lVar) {
        v1 X = X(lVar, z4);
        while (true) {
            Object P = P();
            if (P instanceof z0) {
                z0 z0Var = (z0) P;
                if (!z0Var.e()) {
                    f0(z0Var);
                } else if (l.a(f1059e, this, P, X)) {
                    return X;
                }
            } else {
                if (!(P instanceof k1)) {
                    if (z5) {
                        z zVar = P instanceof z ? (z) P : null;
                        lVar.invoke(zVar != null ? zVar.f1086a : null);
                    }
                    return b2.f994e;
                }
                a2 f5 = ((k1) P).f();
                if (f5 == null) {
                    Objects.requireNonNull(P, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    g0((v1) P);
                } else {
                    y0 y0Var = b2.f994e;
                    if (z4 && (P instanceof b)) {
                        synchronized (P) {
                            r3 = ((b) P).d();
                            if (r3 == null || ((lVar instanceof s) && !((b) P).h())) {
                                if (u(P, f5, X)) {
                                    if (r3 == null) {
                                        return X;
                                    }
                                    y0Var = X;
                                }
                            }
                            k3.s sVar = k3.s.f6374a;
                        }
                    }
                    if (r3 != null) {
                        if (z5) {
                            lVar.invoke(r3);
                        }
                        return y0Var;
                    }
                    if (u(P, f5, X)) {
                        return X;
                    }
                }
            }
        }
    }

    public final void h0(v1 v1Var) {
        Object P;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z0 z0Var;
        do {
            P = P();
            if (!(P instanceof v1)) {
                if (!(P instanceof k1) || ((k1) P).f() == null) {
                    return;
                }
                v1Var.u();
                return;
            }
            if (P != v1Var) {
                return;
            }
            atomicReferenceFieldUpdater = f1059e;
            z0Var = x1.f1078g;
        } while (!l.a(atomicReferenceFieldUpdater, this, P, z0Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Throwable] */
    @Override // b4.d2
    public CancellationException i() {
        CancellationException cancellationException;
        Object P = P();
        if (P instanceof b) {
            cancellationException = ((b) P).d();
        } else if (P instanceof z) {
            cancellationException = ((z) P).f1086a;
        } else {
            if (P instanceof k1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Cannot be cancelling child in this state: ", P).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new q1(kotlin.jvm.internal.i.i("Parent job is ", k0(P)), cancellationException, this) : cancellationException2;
    }

    public final void i0(r rVar) {
        this._parentHandle = rVar;
    }

    @Override // b4.p1
    public final CancellationException l() {
        Object P = P();
        if (!(P instanceof b)) {
            if (P instanceof k1) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Job is still new or active: ", this).toString());
            }
            return P instanceof z ? m0(this, ((z) P).f1086a, null, 1, null) : new q1(kotlin.jvm.internal.i.i(r0.a(this), " has completed normally"), null, this);
        }
        Throwable d5 = ((b) P).d();
        if (d5 != null) {
            return l0(d5, kotlin.jvm.internal.i.i(r0.a(this), " is cancelling"));
        }
        throw new IllegalStateException(kotlin.jvm.internal.i.i("Job is still new or active: ", this).toString());
    }

    protected final CancellationException l0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = C();
            }
            cancellationException = new q1(str, th, this);
        }
        return cancellationException;
    }

    @Override // n3.g
    public n3.g minusKey(g.c<?> cVar) {
        return p1.a.e(this, cVar);
    }

    public final String n0() {
        return Y() + '{' + k0(P()) + '}';
    }

    @Override // n3.g
    public n3.g plus(n3.g gVar) {
        return p1.a.f(this, gVar);
    }

    @Override // b4.p1
    public void r(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new q1(C(), null, this);
        }
        z(cancellationException);
    }

    @Override // b4.t
    public final void t(d2 d2Var) {
        y(d2Var);
    }

    public String toString() {
        return n0() + '@' + r0.b(this);
    }

    @Override // b4.p1
    public final r v(t tVar) {
        return (r) p1.a.d(this, true, false, new s(tVar), 2, null);
    }

    protected void x(Object obj) {
    }

    public final boolean y(Object obj) {
        Object obj2;
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        kotlinx.coroutines.internal.y yVar3;
        obj2 = x1.f1072a;
        if (M() && (obj2 = A(obj)) == x1.f1073b) {
            return true;
        }
        yVar = x1.f1072a;
        if (obj2 == yVar) {
            obj2 = V(obj);
        }
        yVar2 = x1.f1072a;
        if (obj2 == yVar2 || obj2 == x1.f1073b) {
            return true;
        }
        yVar3 = x1.f1075d;
        if (obj2 == yVar3) {
            return false;
        }
        x(obj2);
        return true;
    }

    public void z(Throwable th) {
        y(th);
    }
}
