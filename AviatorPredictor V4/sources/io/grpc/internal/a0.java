package io.grpc.internal;

import b3.n0;
import io.grpc.internal.j1;
import io.grpc.internal.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class a0 implements j1 {

    /* renamed from: c, reason: collision with root package name */
    private final Executor f4983c;

    /* renamed from: d, reason: collision with root package name */
    private final b3.j1 f4984d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f4985e;

    /* renamed from: f, reason: collision with root package name */
    private Runnable f4986f;

    /* renamed from: g, reason: collision with root package name */
    private Runnable f4987g;

    /* renamed from: h, reason: collision with root package name */
    private j1.a f4988h;

    /* renamed from: j, reason: collision with root package name */
    private b3.f1 f4990j;

    /* renamed from: k, reason: collision with root package name */
    private n0.i f4991k;

    /* renamed from: l, reason: collision with root package name */
    private long f4992l;

    /* renamed from: a, reason: collision with root package name */
    private final b3.h0 f4981a = b3.h0.a(a0.class, null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f4982b = new Object();

    /* renamed from: i, reason: collision with root package name */
    private Collection<e> f4989i = new LinkedHashSet();

    class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1.a f4993e;

        a(j1.a aVar) {
            this.f4993e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4993e.d(true);
        }
    }

    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1.a f4995e;

        b(j1.a aVar) {
            this.f4995e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4995e.d(false);
        }
    }

    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j1.a f4997e;

        c(j1.a aVar) {
            this.f4997e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4997e.a();
        }
    }

    class d implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b3.f1 f4999e;

        d(b3.f1 f1Var) {
            this.f4999e = f1Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            a0.this.f4988h.c(this.f4999e);
        }
    }

    private class e extends b0 {

        /* renamed from: j, reason: collision with root package name */
        private final n0.f f5001j;

        /* renamed from: k, reason: collision with root package name */
        private final b3.r f5002k;

        /* renamed from: l, reason: collision with root package name */
        private final b3.k[] f5003l;

        private e(n0.f fVar, b3.k[] kVarArr) {
            this.f5002k = b3.r.e();
            this.f5001j = fVar;
            this.f5003l = kVarArr;
        }

        /* synthetic */ e(a0 a0Var, n0.f fVar, b3.k[] kVarArr, a aVar) {
            this(fVar, kVarArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Runnable B(s sVar) {
            b3.r b5 = this.f5002k.b();
            try {
                q c5 = sVar.c(this.f5001j.c(), this.f5001j.b(), this.f5001j.a(), this.f5003l);
                this.f5002k.f(b5);
                return x(c5);
            } catch (Throwable th) {
                this.f5002k.f(b5);
                throw th;
            }
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void c(b3.f1 f1Var) {
            super.c(f1Var);
            synchronized (a0.this.f4982b) {
                if (a0.this.f4987g != null) {
                    boolean remove = a0.this.f4989i.remove(this);
                    if (!a0.this.q() && remove) {
                        a0.this.f4984d.b(a0.this.f4986f);
                        if (a0.this.f4990j != null) {
                            a0.this.f4984d.b(a0.this.f4987g);
                            a0.this.f4987g = null;
                        }
                    }
                }
            }
            a0.this.f4984d.a();
        }

        @Override // io.grpc.internal.b0, io.grpc.internal.q
        public void l(w0 w0Var) {
            if (this.f5001j.a().j()) {
                w0Var.a("wait_for_ready");
            }
            super.l(w0Var);
        }

        @Override // io.grpc.internal.b0
        protected void v(b3.f1 f1Var) {
            for (b3.k kVar : this.f5003l) {
                kVar.i(f1Var);
            }
        }
    }

    a0(Executor executor, b3.j1 j1Var) {
        this.f4983c = executor;
        this.f4984d = j1Var;
    }

    private e o(n0.f fVar, b3.k[] kVarArr) {
        e eVar = new e(this, fVar, kVarArr, null);
        this.f4989i.add(eVar);
        if (p() == 1) {
            this.f4984d.b(this.f4985e);
        }
        return eVar;
    }

    @Override // io.grpc.internal.j1
    public final void a(b3.f1 f1Var) {
        Collection<e> collection;
        Runnable runnable;
        f(f1Var);
        synchronized (this.f4982b) {
            collection = this.f4989i;
            runnable = this.f4987g;
            this.f4987g = null;
            if (!collection.isEmpty()) {
                this.f4989i = Collections.emptyList();
            }
        }
        if (runnable != null) {
            for (e eVar : collection) {
                Runnable x4 = eVar.x(new f0(f1Var, r.a.REFUSED, eVar.f5003l));
                if (x4 != null) {
                    x4.run();
                }
            }
            this.f4984d.execute(runnable);
        }
    }

    @Override // io.grpc.internal.s
    public final q c(b3.v0<?, ?> v0Var, b3.u0 u0Var, b3.c cVar, b3.k[] kVarArr) {
        q f0Var;
        try {
            s1 s1Var = new s1(v0Var, u0Var, cVar);
            n0.i iVar = null;
            long j4 = -1;
            while (true) {
                synchronized (this.f4982b) {
                    if (this.f4990j == null) {
                        n0.i iVar2 = this.f4991k;
                        if (iVar2 != null) {
                            if (iVar != null && j4 == this.f4992l) {
                                f0Var = o(s1Var, kVarArr);
                                break;
                            }
                            j4 = this.f4992l;
                            s j5 = q0.j(iVar2.a(s1Var), cVar.j());
                            if (j5 != null) {
                                f0Var = j5.c(s1Var.c(), s1Var.b(), s1Var.a(), kVarArr);
                                break;
                            }
                            iVar = iVar2;
                        } else {
                            f0Var = o(s1Var, kVarArr);
                            break;
                        }
                    } else {
                        f0Var = new f0(this.f4990j, kVarArr);
                        break;
                    }
                }
            }
            return f0Var;
        } finally {
            this.f4984d.a();
        }
    }

    @Override // b3.l0
    public b3.h0 d() {
        return this.f4981a;
    }

    @Override // io.grpc.internal.j1
    public final Runnable e(j1.a aVar) {
        this.f4988h = aVar;
        this.f4985e = new a(aVar);
        this.f4986f = new b(aVar);
        this.f4987g = new c(aVar);
        return null;
    }

    @Override // io.grpc.internal.j1
    public final void f(b3.f1 f1Var) {
        Runnable runnable;
        synchronized (this.f4982b) {
            if (this.f4990j != null) {
                return;
            }
            this.f4990j = f1Var;
            this.f4984d.b(new d(f1Var));
            if (!q() && (runnable = this.f4987g) != null) {
                this.f4984d.b(runnable);
                this.f4987g = null;
            }
            this.f4984d.a();
        }
    }

    final int p() {
        int size;
        synchronized (this.f4982b) {
            size = this.f4989i.size();
        }
        return size;
    }

    public final boolean q() {
        boolean z4;
        synchronized (this.f4982b) {
            z4 = !this.f4989i.isEmpty();
        }
        return z4;
    }

    final void r(n0.i iVar) {
        Runnable runnable;
        synchronized (this.f4982b) {
            this.f4991k = iVar;
            this.f4992l++;
            if (iVar != null && q()) {
                ArrayList arrayList = new ArrayList(this.f4989i);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    e eVar = (e) it.next();
                    n0.e a5 = iVar.a(eVar.f5001j);
                    b3.c a6 = eVar.f5001j.a();
                    s j4 = q0.j(a5, a6.j());
                    if (j4 != null) {
                        Executor executor = this.f4983c;
                        if (a6.e() != null) {
                            executor = a6.e();
                        }
                        Runnable B = eVar.B(j4);
                        if (B != null) {
                            executor.execute(B);
                        }
                        arrayList2.add(eVar);
                    }
                }
                synchronized (this.f4982b) {
                    if (q()) {
                        this.f4989i.removeAll(arrayList2);
                        if (this.f4989i.isEmpty()) {
                            this.f4989i = new LinkedHashSet();
                        }
                        if (!q()) {
                            this.f4984d.b(this.f4986f);
                            if (this.f4990j != null && (runnable = this.f4987g) != null) {
                                this.f4984d.b(runnable);
                                this.f4987g = null;
                            }
                        }
                        this.f4984d.a();
                    }
                }
            }
        }
    }
}
