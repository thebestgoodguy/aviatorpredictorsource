package kotlinx.coroutines.internal;

import b4.a1;
import b4.g2;
import b4.q0;
import b4.r0;
import b4.u0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class f<T> extends u0<T> implements kotlin.coroutines.jvm.internal.e, n3.d<T> {

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6414l = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final b4.g0 f6415h;

    /* renamed from: i, reason: collision with root package name */
    public final n3.d<T> f6416i;

    /* renamed from: j, reason: collision with root package name */
    public Object f6417j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f6418k;

    /* JADX WARN: Multi-variable type inference failed */
    public f(b4.g0 g0Var, n3.d<? super T> dVar) {
        super(-1);
        y yVar;
        this.f6415h = g0Var;
        this.f6416i = dVar;
        yVar = g.f6423a;
        this.f6417j = yVar;
        this.f6418k = c0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final b4.m<?> l() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof b4.m) {
            return (b4.m) obj;
        }
        return null;
    }

    @Override // b4.u0
    public void a(Object obj, Throwable th) {
        if (obj instanceof b4.a0) {
            ((b4.a0) obj).f984b.invoke(th);
        }
    }

    @Override // b4.u0
    public n3.d<T> c() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        n3.d<T> dVar = this.f6416i;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // n3.d
    public n3.g getContext() {
        return this.f6416i.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // b4.u0
    public Object h() {
        y yVar;
        y yVar2;
        Object obj = this.f6417j;
        if (q0.a()) {
            yVar2 = g.f6423a;
            if (!(obj != yVar2)) {
                throw new AssertionError();
            }
        }
        yVar = g.f6423a;
        this.f6417j = yVar;
        return obj;
    }

    public final void i() {
        while (this._reusableCancellableContinuation == g.f6424b) {
        }
    }

    public final b4.m<T> k() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = g.f6424b;
                return null;
            }
            if (obj instanceof b4.m) {
                if (b4.l.a(f6414l, this, obj, g.f6424b)) {
                    return (b4.m) obj;
                }
            } else if (obj != g.f6424b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(kotlin.jvm.internal.i.i("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean n() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            y yVar = g.f6424b;
            if (kotlin.jvm.internal.i.a(obj, yVar)) {
                if (b4.l.a(f6414l, this, yVar, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (b4.l.a(f6414l, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        i();
        b4.m<?> l4 = l();
        if (l4 == null) {
            return;
        }
        l4.s();
    }

    @Override // n3.d
    public void resumeWith(Object obj) {
        n3.g context = this.f6416i.getContext();
        Object d5 = b4.d0.d(obj, null, 1, null);
        if (this.f6415h.H(context)) {
            this.f6417j = d5;
            this.f1052g = 0;
            this.f6415h.F(context, this);
            return;
        }
        q0.a();
        a1 a5 = g2.f1005a.a();
        if (a5.f0()) {
            this.f6417j = d5;
            this.f1052g = 0;
            a5.R(this);
            return;
        }
        a5.X(true);
        try {
            n3.g context2 = getContext();
            Object c5 = c0.c(context2, this.f6418k);
            try {
                this.f6416i.resumeWith(obj);
                k3.s sVar = k3.s.f6374a;
                while (a5.j0()) {
                }
            } finally {
                c0.a(context2, c5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(b4.k<?> kVar) {
        y yVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            yVar = g.f6424b;
            if (obj != yVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(kotlin.jvm.internal.i.i("Inconsistent state ", obj).toString());
                }
                if (b4.l.a(f6414l, this, obj, null)) {
                    return (Throwable) obj;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } while (!b4.l.a(f6414l, this, yVar, kVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f6415h + ", " + r0.c(this.f6416i) + ']';
    }
}
