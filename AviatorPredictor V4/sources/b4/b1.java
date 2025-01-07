package b4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b1 extends c1 {

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f988i = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_queue");

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f989j = AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    public static abstract class a implements Runnable, Comparable<a>, y0, kotlinx.coroutines.internal.e0 {

        /* renamed from: e, reason: collision with root package name */
        public long f990e;

        /* renamed from: f, reason: collision with root package name */
        private Object f991f;

        /* renamed from: g, reason: collision with root package name */
        private int f992g;

        @Override // b4.y0
        public final synchronized void d() {
            kotlinx.coroutines.internal.y yVar;
            kotlinx.coroutines.internal.y yVar2;
            Object obj = this.f991f;
            yVar = e1.f997a;
            if (obj == yVar) {
                return;
            }
            b bVar = obj instanceof b ? (b) obj : null;
            if (bVar != null) {
                bVar.g(this);
            }
            yVar2 = e1.f997a;
            this.f991f = yVar2;
        }

        @Override // kotlinx.coroutines.internal.e0
        public void g(int r12) {
            this.f992g = r12;
        }

        @Override // kotlinx.coroutines.internal.e0
        public void h(kotlinx.coroutines.internal.d0<?> d0Var) {
            kotlinx.coroutines.internal.y yVar;
            Object obj = this.f991f;
            yVar = e1.f997a;
            if (!(obj != yVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.f991f = d0Var;
        }

        @Override // kotlinx.coroutines.internal.e0
        public kotlinx.coroutines.internal.d0<?> k() {
            Object obj = this.f991f;
            if (obj instanceof kotlinx.coroutines.internal.d0) {
                return (kotlinx.coroutines.internal.d0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.e0
        public int n() {
            return this.f992g;
        }

        @Override // java.lang.Comparable
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            long j4 = this.f990e - aVar.f990e;
            if (j4 > 0) {
                return 1;
            }
            return j4 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0048, TryCatch #0 {, blocks: (B:11:0x000d, B:19:0x0021, B:20:0x0037, B:22:0x0040, B:23:0x0042, B:27:0x0024, B:30:0x002e), top: B:10:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int q(long r8, b4.b1.b r10, b4.b1 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7.f991f     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.y r1 = b4.e1.b()     // Catch: java.lang.Throwable -> L4b
                if (r0 != r1) goto Lc
                r8 = 2
            La:
                monitor-exit(r7)
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
                kotlinx.coroutines.internal.e0 r0 = r10.b()     // Catch: java.lang.Throwable -> L48
                b4.b1$a r0 = (b4.b1.a) r0     // Catch: java.lang.Throwable -> L48
                boolean r11 = b4.b1.n0(r11)     // Catch: java.lang.Throwable -> L48
                if (r11 == 0) goto L1d
                r8 = 1
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r7)
                return r8
            L1d:
                r1 = 0
                if (r0 != 0) goto L24
            L21:
                r10.f993b = r8     // Catch: java.lang.Throwable -> L48
                goto L37
            L24:
                long r3 = r0.f990e     // Catch: java.lang.Throwable -> L48
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L2d
                goto L2e
            L2d:
                r8 = r3
            L2e:
                long r3 = r10.f993b     // Catch: java.lang.Throwable -> L48
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L37
                goto L21
            L37:
                long r8 = r7.f990e     // Catch: java.lang.Throwable -> L48
                long r3 = r10.f993b     // Catch: java.lang.Throwable -> L48
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L42
                r7.f990e = r3     // Catch: java.lang.Throwable -> L48
            L42:
                r10.a(r7)     // Catch: java.lang.Throwable -> L48
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                r8 = 0
                goto La
            L48:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
                throw r8     // Catch: java.lang.Throwable -> L4b
            L4b:
                r8 = move-exception
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: b4.b1.a.q(long, b4.b1$b, b4.b1):int");
        }

        public final boolean r(long j4) {
            return j4 - this.f990e >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f990e + ']';
        }
    }

    public static final class b extends kotlinx.coroutines.internal.d0<a> {

        /* renamed from: b, reason: collision with root package name */
        public long f993b;

        public b(long j4) {
            this.f993b = j4;
        }
    }

    private final boolean A0(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.e()) == aVar;
    }

    private final void o0() {
        kotlinx.coroutines.internal.y yVar;
        kotlinx.coroutines.internal.y yVar2;
        if (q0.a() && !s0()) {
            throw new AssertionError();
        }
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f988i;
                yVar = e1.f998b;
                if (l.a(atomicReferenceFieldUpdater, this, null, yVar)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.p) {
                    ((kotlinx.coroutines.internal.p) obj).d();
                    return;
                }
                yVar2 = e1.f998b;
                if (obj == yVar2) {
                    return;
                }
                kotlinx.coroutines.internal.p pVar = new kotlinx.coroutines.internal.p(8, true);
                pVar.a((Runnable) obj);
                if (l.a(f988i, this, obj, pVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable p0() {
        kotlinx.coroutines.internal.y yVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.p) {
                kotlinx.coroutines.internal.p pVar = (kotlinx.coroutines.internal.p) obj;
                Object j4 = pVar.j();
                if (j4 != kotlinx.coroutines.internal.p.f6447h) {
                    return (Runnable) j4;
                }
                l.a(f988i, this, obj, pVar.i());
            } else {
                yVar = e1.f998b;
                if (obj == yVar) {
                    return null;
                }
                if (l.a(f988i, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean r0(Runnable runnable) {
        kotlinx.coroutines.internal.y yVar;
        while (true) {
            Object obj = this._queue;
            if (s0()) {
                return false;
            }
            if (obj == null) {
                if (l.a(f988i, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.p) {
                kotlinx.coroutines.internal.p pVar = (kotlinx.coroutines.internal.p) obj;
                int a5 = pVar.a(runnable);
                if (a5 == 0) {
                    return true;
                }
                if (a5 == 1) {
                    l.a(f988i, this, obj, pVar.i());
                } else if (a5 == 2) {
                    return false;
                }
            } else {
                yVar = e1.f998b;
                if (obj == yVar) {
                    return false;
                }
                kotlinx.coroutines.internal.p pVar2 = new kotlinx.coroutines.internal.p(8, true);
                pVar2.a((Runnable) obj);
                pVar2.a(runnable);
                if (l.a(f988i, this, obj, pVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean s0() {
        return this._isCompleted;
    }

    private final void v0() {
        c.a();
        long nanoTime = System.nanoTime();
        while (true) {
            b bVar = (b) this._delayed;
            a i4 = bVar == null ? null : bVar.i();
            if (i4 == null) {
                return;
            } else {
                l0(nanoTime, i4);
            }
        }
    }

    private final int y0(long j4, a aVar) {
        if (s0()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            l.a(f989j, this, null, new b(j4));
            Object obj = this._delayed;
            kotlin.jvm.internal.i.b(obj);
            bVar = (b) obj;
        }
        return aVar.q(j4, bVar, this);
    }

    private final void z0(boolean z4) {
        this._isCompleted = z4 ? 1 : 0;
    }

    @Override // b4.g0
    public final void F(n3.g gVar, Runnable runnable) {
        q0(runnable);
    }

    @Override // b4.a1
    protected long S() {
        long b5;
        kotlinx.coroutines.internal.y yVar;
        if (super.S() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.p)) {
                yVar = e1.f998b;
                return obj == yVar ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.p) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a e5 = bVar == null ? null : bVar.e();
        if (e5 == null) {
            return Long.MAX_VALUE;
        }
        long j4 = e5.f990e;
        c.a();
        b5 = x3.f.b(j4 - System.nanoTime(), 0L);
        return b5;
    }

    public final void q0(Runnable runnable) {
        if (r0(runnable)) {
            m0();
        } else {
            s0.f1047k.q0(runnable);
        }
    }

    @Override // b4.a1
    protected void shutdown() {
        g2.f1005a.b();
        z0(true);
        o0();
        while (u0() <= 0) {
        }
        v0();
    }

    protected boolean t0() {
        kotlinx.coroutines.internal.y yVar;
        if (!i0()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.p) {
                return ((kotlinx.coroutines.internal.p) obj).g();
            }
            yVar = e1.f998b;
            if (obj != yVar) {
                return false;
            }
        }
        return true;
    }

    public long u0() {
        a aVar;
        if (j0()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            c.a();
            long nanoTime = System.nanoTime();
            do {
                synchronized (bVar) {
                    a b5 = bVar.b();
                    aVar = null;
                    if (b5 != null) {
                        a aVar2 = b5;
                        if (aVar2.r(nanoTime) ? r0(aVar2) : false) {
                            aVar = bVar.h(0);
                        }
                    }
                }
            } while (aVar != null);
        }
        Runnable p02 = p0();
        if (p02 == null) {
            return S();
        }
        p02.run();
        return 0L;
    }

    protected final void w0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void x0(long j4, a aVar) {
        int y02 = y0(j4, aVar);
        if (y02 == 0) {
            if (A0(aVar)) {
                m0();
            }
        } else if (y02 == 1) {
            l0(j4, aVar);
        } else if (y02 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }
}
