package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: c, reason: collision with root package name */
    public static final h2 f5371c = new h2(new b3.i1[0]);

    /* renamed from: a, reason: collision with root package name */
    private final b3.i1[] f5372a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f5373b = new AtomicBoolean(false);

    h2(b3.i1[] i1VarArr) {
        this.f5372a = i1VarArr;
    }

    public static h2 h(b3.k[] kVarArr, b3.a aVar, b3.u0 u0Var) {
        h2 h2Var = new h2(kVarArr);
        for (b3.k kVar : kVarArr) {
            kVar.m(aVar, u0Var);
        }
        return h2Var;
    }

    public void a() {
        for (b3.i1 i1Var : this.f5372a) {
            ((b3.k) i1Var).j();
        }
    }

    public void b(b3.u0 u0Var) {
        for (b3.i1 i1Var : this.f5372a) {
            ((b3.k) i1Var).k(u0Var);
        }
    }

    public void c() {
        for (b3.i1 i1Var : this.f5372a) {
            ((b3.k) i1Var).l();
        }
    }

    public void d(int r5) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.a(r5);
        }
    }

    public void e(int r10, long j4, long j5) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.b(r10, j4, j5);
        }
    }

    public void f(long j4) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.c(j4);
        }
    }

    public void g(long j4) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.d(j4);
        }
    }

    public void i(int r5) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.e(r5);
        }
    }

    public void j(int r10, long j4, long j5) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.f(r10, j4, j5);
        }
    }

    public void k(long j4) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.g(j4);
        }
    }

    public void l(long j4) {
        for (b3.i1 i1Var : this.f5372a) {
            i1Var.h(j4);
        }
    }

    public void m(b3.f1 f1Var) {
        if (this.f5373b.compareAndSet(false, true)) {
            for (b3.i1 i1Var : this.f5372a) {
                i1Var.i(f1Var);
            }
        }
    }
}
