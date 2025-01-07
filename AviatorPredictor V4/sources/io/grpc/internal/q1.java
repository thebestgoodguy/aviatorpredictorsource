package io.grpc.internal;

import b3.n0;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class q1 extends b3.n0 {

    /* renamed from: b, reason: collision with root package name */
    private final n0.d f5605b;

    /* renamed from: c, reason: collision with root package name */
    private n0.h f5606c;

    class a implements n0.j {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n0.h f5607a;

        a(n0.h hVar) {
            this.f5607a = hVar;
        }

        @Override // b3.n0.j
        public void a(b3.q qVar) {
            q1.this.h(this.f5607a, qVar);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5609a;

        static {
            int[] r02 = new int[b3.p.values().length];
            f5609a = r02;
            try {
                r02[b3.p.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5609a[b3.p.CONNECTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5609a[b3.p.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5609a[b3.p.TRANSIENT_FAILURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static final class c extends n0.i {

        /* renamed from: a, reason: collision with root package name */
        private final n0.e f5610a;

        c(n0.e eVar) {
            this.f5610a = (n0.e) q0.l.o(eVar, "result");
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            return this.f5610a;
        }

        public String toString() {
            return q0.h.b(c.class).d("result", this.f5610a).toString();
        }
    }

    private final class d extends n0.i {

        /* renamed from: a, reason: collision with root package name */
        private final n0.h f5611a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f5612b = new AtomicBoolean(false);

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f5611a.e();
            }
        }

        d(n0.h hVar) {
            this.f5611a = (n0.h) q0.l.o(hVar, "subchannel");
        }

        @Override // b3.n0.i
        public n0.e a(n0.f fVar) {
            if (this.f5612b.compareAndSet(false, true)) {
                q1.this.f5605b.c().execute(new a());
            }
            return n0.e.g();
        }
    }

    q1(n0.d dVar) {
        this.f5605b = (n0.d) q0.l.o(dVar, "helper");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(n0.h hVar, b3.q qVar) {
        n0.i dVar;
        n0.i iVar;
        b3.p c5 = qVar.c();
        if (c5 == b3.p.SHUTDOWN) {
            return;
        }
        if (qVar.c() == b3.p.TRANSIENT_FAILURE || qVar.c() == b3.p.IDLE) {
            this.f5605b.d();
        }
        int r12 = b.f5609a[c5.ordinal()];
        if (r12 != 1) {
            if (r12 == 2) {
                iVar = new c(n0.e.g());
            } else if (r12 == 3) {
                dVar = new c(n0.e.h(hVar));
            } else {
                if (r12 != 4) {
                    throw new IllegalArgumentException("Unsupported state:" + c5);
                }
                iVar = new c(n0.e.f(qVar.d()));
            }
            this.f5605b.e(c5, iVar);
        }
        dVar = new d(hVar);
        iVar = dVar;
        this.f5605b.e(c5, iVar);
    }

    @Override // b3.n0
    public void b(b3.f1 f1Var) {
        n0.h hVar = this.f5606c;
        if (hVar != null) {
            hVar.f();
            this.f5606c = null;
        }
        this.f5605b.e(b3.p.TRANSIENT_FAILURE, new c(n0.e.f(f1Var)));
    }

    @Override // b3.n0
    public void c(n0.g gVar) {
        List<b3.x> a5 = gVar.a();
        n0.h hVar = this.f5606c;
        if (hVar != null) {
            hVar.h(a5);
            return;
        }
        n0.h a6 = this.f5605b.a(n0.b.c().e(a5).b());
        a6.g(new a(a6));
        this.f5606c = a6;
        this.f5605b.e(b3.p.CONNECTING, new c(n0.e.h(a6)));
        a6.e();
    }

    @Override // b3.n0
    public void d() {
        n0.h hVar = this.f5606c;
        if (hVar != null) {
            hVar.e();
        }
    }

    @Override // b3.n0
    public void e() {
        n0.h hVar = this.f5606c;
        if (hVar != null) {
            hVar.f();
        }
    }
}
