package io.grpc.internal;

import b3.b;

/* loaded from: classes.dex */
final class m1 extends b.a {

    /* renamed from: a, reason: collision with root package name */
    private final s f5468a;

    /* renamed from: b, reason: collision with root package name */
    private final b3.v0<?, ?> f5469b;

    /* renamed from: c, reason: collision with root package name */
    private final b3.u0 f5470c;

    /* renamed from: d, reason: collision with root package name */
    private final b3.c f5471d;

    /* renamed from: f, reason: collision with root package name */
    private final a f5473f;

    /* renamed from: g, reason: collision with root package name */
    private final b3.k[] f5474g;

    /* renamed from: i, reason: collision with root package name */
    private q f5476i;

    /* renamed from: j, reason: collision with root package name */
    boolean f5477j;

    /* renamed from: k, reason: collision with root package name */
    b0 f5478k;

    /* renamed from: h, reason: collision with root package name */
    private final Object f5475h = new Object();

    /* renamed from: e, reason: collision with root package name */
    private final b3.r f5472e = b3.r.e();

    public interface a {
        void a();
    }

    m1(s sVar, b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, a aVar, b3.k[] kVarArr) {
        this.f5468a = sVar;
        this.f5469b = v0Var;
        this.f5470c = u0Var;
        this.f5471d = cVar;
        this.f5473f = aVar;
        this.f5474g = kVarArr;
    }

    private void c(q qVar) {
        boolean z4;
        q0.l.u(!this.f5477j, "already finalized");
        this.f5477j = true;
        synchronized (this.f5475h) {
            if (this.f5476i == null) {
                this.f5476i = qVar;
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if (!z4) {
            q0.l.u(this.f5478k != null, "delayedStream is null");
            Runnable x4 = this.f5478k.x(qVar);
            if (x4 != null) {
                x4.run();
            }
        }
        this.f5473f.a();
    }

    @Override // b3.b.a
    public void a(b3.u0 u0Var) {
        q0.l.u(!this.f5477j, "apply() or fail() already called");
        q0.l.o(u0Var, "headers");
        this.f5470c.m(u0Var);
        b3.r b5 = this.f5472e.b();
        try {
            q c5 = this.f5468a.c(this.f5469b, this.f5470c, this.f5471d, this.f5474g);
            this.f5472e.f(b5);
            c(c5);
        } catch (Throwable th) {
            this.f5472e.f(b5);
            throw th;
        }
    }

    @Override // b3.b.a
    public void b(b3.f1 f1Var) {
        q0.l.e(!f1Var.o(), "Cannot fail with OK status");
        q0.l.u(!this.f5477j, "apply() or fail() already called");
        c(new f0(f1Var, this.f5474g));
    }

    q d() {
        synchronized (this.f5475h) {
            q qVar = this.f5476i;
            if (qVar != null) {
                return qVar;
            }
            b0 b0Var = new b0();
            this.f5478k = b0Var;
            this.f5476i = b0Var;
            return b0Var;
        }
    }
}
