package o0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class f0<TResult> extends h<TResult> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f6702a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final c0<TResult> f6703b = new c0<>();

    /* renamed from: c, reason: collision with root package name */
    private boolean f6704c;

    /* renamed from: d, reason: collision with root package name */
    private volatile boolean f6705d;

    /* renamed from: e, reason: collision with root package name */
    private TResult f6706e;

    /* renamed from: f, reason: collision with root package name */
    private Exception f6707f;

    f0() {
    }

    private final void v() {
        w.r.l(this.f6704c, "Task is not yet complete");
    }

    private final void w() {
        if (this.f6705d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        if (this.f6704c) {
            throw b.a(this);
        }
    }

    private final void y() {
        synchronized (this.f6702a) {
            if (this.f6704c) {
                this.f6703b.b(this);
            }
        }
    }

    @Override // o0.h
    public final h<TResult> a(Executor executor, c cVar) {
        this.f6703b.a(new u(executor, cVar));
        y();
        return this;
    }

    @Override // o0.h
    public final h<TResult> b(Executor executor, d<TResult> dVar) {
        this.f6703b.a(new w(executor, dVar));
        y();
        return this;
    }

    @Override // o0.h
    public final h<TResult> c(d<TResult> dVar) {
        this.f6703b.a(new w(j.f6711a, dVar));
        y();
        return this;
    }

    @Override // o0.h
    public final h<TResult> d(Executor executor, e eVar) {
        this.f6703b.a(new y(executor, eVar));
        y();
        return this;
    }

    @Override // o0.h
    public final h<TResult> e(e eVar) {
        d(j.f6711a, eVar);
        return this;
    }

    @Override // o0.h
    public final h<TResult> f(Executor executor, f<? super TResult> fVar) {
        this.f6703b.a(new a0(executor, fVar));
        y();
        return this;
    }

    @Override // o0.h
    public final h<TResult> g(f<? super TResult> fVar) {
        f(j.f6711a, fVar);
        return this;
    }

    @Override // o0.h
    public final <TContinuationResult> h<TContinuationResult> h(Executor executor, a<TResult, TContinuationResult> aVar) {
        f0 f0Var = new f0();
        this.f6703b.a(new q(executor, aVar, f0Var));
        y();
        return f0Var;
    }

    @Override // o0.h
    public final <TContinuationResult> h<TContinuationResult> i(a<TResult, TContinuationResult> aVar) {
        return h(j.f6711a, aVar);
    }

    @Override // o0.h
    public final <TContinuationResult> h<TContinuationResult> j(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        f0 f0Var = new f0();
        this.f6703b.a(new s(executor, aVar, f0Var));
        y();
        return f0Var;
    }

    @Override // o0.h
    public final <TContinuationResult> h<TContinuationResult> k(a<TResult, h<TContinuationResult>> aVar) {
        return j(j.f6711a, aVar);
    }

    @Override // o0.h
    public final Exception l() {
        Exception exc;
        synchronized (this.f6702a) {
            exc = this.f6707f;
        }
        return exc;
    }

    @Override // o0.h
    public final TResult m() {
        TResult tresult;
        synchronized (this.f6702a) {
            v();
            w();
            Exception exc = this.f6707f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = this.f6706e;
        }
        return tresult;
    }

    @Override // o0.h
    public final boolean n() {
        return this.f6705d;
    }

    @Override // o0.h
    public final boolean o() {
        boolean z4;
        synchronized (this.f6702a) {
            z4 = this.f6704c;
        }
        return z4;
    }

    @Override // o0.h
    public final boolean p() {
        boolean z4;
        synchronized (this.f6702a) {
            z4 = false;
            if (this.f6704c && !this.f6705d && this.f6707f == null) {
                z4 = true;
            }
        }
        return z4;
    }

    public final void q(Exception exc) {
        w.r.j(exc, "Exception must not be null");
        synchronized (this.f6702a) {
            x();
            this.f6704c = true;
            this.f6707f = exc;
        }
        this.f6703b.b(this);
    }

    public final void r(TResult tresult) {
        synchronized (this.f6702a) {
            x();
            this.f6704c = true;
            this.f6706e = tresult;
        }
        this.f6703b.b(this);
    }

    public final boolean s() {
        synchronized (this.f6702a) {
            if (this.f6704c) {
                return false;
            }
            this.f6704c = true;
            this.f6705d = true;
            this.f6703b.b(this);
            return true;
        }
    }

    public final boolean t(Exception exc) {
        w.r.j(exc, "Exception must not be null");
        synchronized (this.f6702a) {
            if (this.f6704c) {
                return false;
            }
            this.f6704c = true;
            this.f6707f = exc;
            this.f6703b.b(this);
            return true;
        }
    }

    public final boolean u(TResult tresult) {
        synchronized (this.f6702a) {
            if (this.f6704c) {
                return false;
            }
            this.f6704c = true;
            this.f6706e = tresult;
            this.f6703b.b(this);
            return true;
        }
    }
}
