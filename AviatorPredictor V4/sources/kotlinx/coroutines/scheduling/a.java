package kotlinx.coroutines.scheduling;

import b4.q0;
import b4.r0;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import k3.s;
import kotlinx.coroutines.internal.y;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: e, reason: collision with root package name */
    public final int f6472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f6473f;

    /* renamed from: g, reason: collision with root package name */
    public final long f6474g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6475h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f6476i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.scheduling.d f6477j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceArray<c> f6478k;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* renamed from: l, reason: collision with root package name */
    public static final C0065a f6467l = new C0065a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final y f6471p = new y("NOT_IN_STACK");

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f6468m = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: n, reason: collision with root package name */
    static final /* synthetic */ AtomicLongFieldUpdater f6469n = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6470o = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C0065a {
        private C0065a() {
        }

        public /* synthetic */ C0065a(kotlin.jvm.internal.e eVar) {
            this();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6479a;

        static {
            int[] r02 = new int[d.values().length];
            r02[d.PARKING.ordinal()] = 1;
            r02[d.BLOCKING.ordinal()] = 2;
            r02[d.CPU_ACQUIRED.ordinal()] = 3;
            r02[d.DORMANT.ordinal()] = 4;
            r02[d.TERMINATED.ordinal()] = 5;
            f6479a = r02;
        }
    }

    public final class c extends Thread {

        /* renamed from: l, reason: collision with root package name */
        static final /* synthetic */ AtomicIntegerFieldUpdater f6480l = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: e, reason: collision with root package name */
        public final m f6481e;

        /* renamed from: f, reason: collision with root package name */
        public d f6482f;

        /* renamed from: g, reason: collision with root package name */
        private long f6483g;

        /* renamed from: h, reason: collision with root package name */
        private long f6484h;

        /* renamed from: i, reason: collision with root package name */
        private int f6485i;
        private volatile int indexInArray;

        /* renamed from: j, reason: collision with root package name */
        public boolean f6486j;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.f6481e = new m();
            this.f6482f = d.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.f6471p;
            this.f6485i = v3.c.f7904e.b();
        }

        public c(int r22) {
            this();
            n(r22);
        }

        private final void a(int r4) {
            if (r4 == 0) {
                return;
            }
            a.f6469n.addAndGet(a.this, -2097152L);
            d dVar = this.f6482f;
            if (dVar != d.TERMINATED) {
                if (q0.a()) {
                    if (!(dVar == d.BLOCKING)) {
                        throw new AssertionError();
                    }
                }
                this.f6482f = d.DORMANT;
            }
        }

        private final void b(int r12) {
            if (r12 != 0 && r(d.BLOCKING)) {
                a.this.C();
            }
        }

        private final void c(i iVar) {
            int y4 = iVar.f6511f.y();
            h(y4);
            b(y4);
            a.this.t(iVar);
            a(y4);
        }

        private final i d(boolean z4) {
            i l4;
            i l5;
            if (z4) {
                boolean z5 = j(a.this.f6472e * 2) == 0;
                if (z5 && (l5 = l()) != null) {
                    return l5;
                }
                i h5 = this.f6481e.h();
                if (h5 != null) {
                    return h5;
                }
                if (!z5 && (l4 = l()) != null) {
                    return l4;
                }
            } else {
                i l6 = l();
                if (l6 != null) {
                    return l6;
                }
            }
            return s(false);
        }

        private final void h(int r32) {
            this.f6483g = 0L;
            if (this.f6482f == d.PARKING) {
                if (q0.a()) {
                    if (!(r32 == 1)) {
                        throw new AssertionError();
                    }
                }
                this.f6482f = d.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.f6471p;
        }

        private final void k() {
            if (this.f6483g == 0) {
                this.f6483g = System.nanoTime() + a.this.f6474g;
            }
            LockSupport.parkNanos(a.this.f6474g);
            if (System.nanoTime() - this.f6483g >= 0) {
                this.f6483g = 0L;
                t();
            }
        }

        private final i l() {
            kotlinx.coroutines.scheduling.d dVar;
            if (j(2) == 0) {
                i d5 = a.this.f6476i.d();
                if (d5 != null) {
                    return d5;
                }
                dVar = a.this.f6477j;
            } else {
                i d6 = a.this.f6477j.d();
                if (d6 != null) {
                    return d6;
                }
                dVar = a.this.f6476i;
            }
            return dVar.d();
        }

        private final void m() {
            loop0: while (true) {
                boolean z4 = false;
                while (!a.this.isTerminated() && this.f6482f != d.TERMINATED) {
                    i e5 = e(this.f6486j);
                    if (e5 != null) {
                        this.f6484h = 0L;
                        c(e5);
                    } else {
                        this.f6486j = false;
                        if (this.f6484h == 0) {
                            q();
                        } else if (z4) {
                            r(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f6484h);
                            this.f6484h = 0L;
                        } else {
                            z4 = true;
                        }
                    }
                }
            }
            r(d.TERMINATED);
        }

        private final boolean p() {
            boolean z4;
            if (this.f6482f != d.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j4 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                        z4 = false;
                        break;
                    }
                    if (a.f6469n.compareAndSet(aVar, j4, j4 - 4398046511104L)) {
                        z4 = true;
                        break;
                    }
                }
                if (!z4) {
                    return false;
                }
                this.f6482f = d.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.r(this);
                return;
            }
            if (q0.a()) {
                if (!(this.f6481e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.isTerminated() && this.f6482f != d.TERMINATED) {
                r(d.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z4) {
            if (q0.a()) {
                if (!(this.f6481e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int r12 = (int) (a.this.controlState & 2097151);
            if (r12 < 2) {
                return null;
            }
            int j4 = j(r12);
            a aVar = a.this;
            long j5 = Long.MAX_VALUE;
            for (int r9 = 0; r9 < r12; r9++) {
                j4++;
                if (j4 > r12) {
                    j4 = 1;
                }
                c cVar = aVar.f6478k.get(j4);
                if (cVar != null && cVar != this) {
                    if (q0.a()) {
                        if (!(this.f6481e.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    m mVar = this.f6481e;
                    m mVar2 = cVar.f6481e;
                    long k4 = z4 ? mVar.k(mVar2) : mVar.l(mVar2);
                    if (k4 == -1) {
                        return this.f6481e.h();
                    }
                    if (k4 > 0) {
                        j5 = Math.min(j5, k4);
                    }
                }
            }
            if (j5 == Long.MAX_VALUE) {
                j5 = 0;
            }
            this.f6484h = j5;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f6478k) {
                if (aVar.isTerminated()) {
                    return;
                }
                if (((int) (aVar.controlState & 2097151)) <= aVar.f6472e) {
                    return;
                }
                if (f6480l.compareAndSet(this, -1, 1)) {
                    int f5 = f();
                    n(0);
                    aVar.s(this, f5, 0);
                    int andDecrement = (int) (a.f6469n.getAndDecrement(aVar) & 2097151);
                    if (andDecrement != f5) {
                        c cVar = aVar.f6478k.get(andDecrement);
                        kotlin.jvm.internal.i.b(cVar);
                        c cVar2 = cVar;
                        aVar.f6478k.set(f5, cVar2);
                        cVar2.n(f5);
                        aVar.s(cVar2, andDecrement, f5);
                    }
                    aVar.f6478k.set(andDecrement, null);
                    s sVar = s.f6374a;
                    this.f6482f = d.TERMINATED;
                }
            }
        }

        public final i e(boolean z4) {
            i d5;
            if (p()) {
                return d(z4);
            }
            if (!z4 || (d5 = this.f6481e.h()) == null) {
                d5 = a.this.f6477j.d();
            }
            return d5 == null ? s(true) : d5;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int r4) {
            int r02 = this.f6485i;
            int r03 = r02 ^ (r02 << 13);
            int r04 = r03 ^ (r03 >> 17);
            int r05 = r04 ^ (r04 << 5);
            this.f6485i = r05;
            int r12 = r4 - 1;
            return (r12 & r4) == 0 ? r05 & r12 : (r05 & Integer.MAX_VALUE) % r4;
        }

        public final void n(int r32) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f6475h);
            sb.append("-worker-");
            sb.append(r32 == 0 ? "TERMINATED" : String.valueOf(r32));
            setName(sb.toString());
            this.indexInArray = r32;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(d dVar) {
            d dVar2 = this.f6482f;
            boolean z4 = dVar2 == d.CPU_ACQUIRED;
            if (z4) {
                a.f6469n.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f6482f = dVar;
            }
            return z4;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int r5, int r6, long j4, String str) {
        this.f6472e = r5;
        this.f6473f = r6;
        this.f6474g = j4;
        this.f6475h = str;
        if (!(r5 >= 1)) {
            throw new IllegalArgumentException(("Core pool size " + r5 + " should be at least 1").toString());
        }
        if (!(r6 >= r5)) {
            throw new IllegalArgumentException(("Max pool size " + r6 + " should be greater than or equals to core pool size " + r5).toString());
        }
        if (!(r6 <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + r6 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j4 > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.f6476i = new kotlinx.coroutines.scheduling.d();
        this.f6477j = new kotlinx.coroutines.scheduling.d();
        this.parkedWorkersStack = 0L;
        this.f6478k = new AtomicReferenceArray<>(r6 + 1);
        this.controlState = r5 << 42;
        this._isTerminated = 0;
    }

    private final i F(c cVar, i iVar, boolean z4) {
        if (cVar == null || cVar.f6482f == d.TERMINATED) {
            return iVar;
        }
        if (iVar.f6511f.y() == 0 && cVar.f6482f == d.BLOCKING) {
            return iVar;
        }
        cVar.f6486j = true;
        return cVar.f6481e.a(iVar, z4);
    }

    private final boolean H(long j4) {
        int a5;
        a5 = x3.f.a(((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21)), 0);
        if (a5 < this.f6472e) {
            int d5 = d();
            if (d5 == 1 && this.f6472e > 1) {
                d();
            }
            if (d5 > 0) {
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ boolean K(a aVar, long j4, int r32, Object obj) {
        if ((r32 & 1) != 0) {
            j4 = aVar.controlState;
        }
        return aVar.H(j4);
    }

    private final boolean M() {
        c n4;
        do {
            n4 = n();
            if (n4 == null) {
                return false;
            }
        } while (!c.f6480l.compareAndSet(n4, -1, 0));
        LockSupport.unpark(n4);
        return true;
    }

    private final boolean a(i iVar) {
        return (iVar.f6511f.y() == 1 ? this.f6477j : this.f6476i).a(iVar);
    }

    private final int d() {
        int a5;
        int r12;
        synchronized (this.f6478k) {
            if (isTerminated()) {
                r12 = -1;
            } else {
                long j4 = this.controlState;
                int r6 = (int) (j4 & 2097151);
                a5 = x3.f.a(r6 - ((int) ((j4 & 4398044413952L) >> 21)), 0);
                if (a5 >= this.f6472e) {
                    return 0;
                }
                if (r6 >= this.f6473f) {
                    return 0;
                }
                int r62 = ((int) (this.controlState & 2097151)) + 1;
                if (!(r62 > 0 && this.f6478k.get(r62) == null)) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                c cVar = new c(r62);
                this.f6478k.set(r62, cVar);
                if (!(r62 == ((int) (2097151 & f6469n.incrementAndGet(this))))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                cVar.start();
                r12 = a5 + 1;
            }
            return r12;
        }
    }

    private final c h() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar != null && kotlin.jvm.internal.i.a(a.this, this)) {
            return cVar;
        }
        return null;
    }

    public static /* synthetic */ void k(a aVar, Runnable runnable, j jVar, boolean z4, int r4, Object obj) {
        if ((r4 & 2) != 0) {
            jVar = g.f6508e;
        }
        if ((r4 & 4) != 0) {
            z4 = false;
        }
        aVar.i(runnable, jVar, z4);
    }

    private final int l(c cVar) {
        int f5;
        do {
            Object g5 = cVar.g();
            if (g5 == f6471p) {
                return -1;
            }
            if (g5 == null) {
                return 0;
            }
            cVar = (c) g5;
            f5 = cVar.f();
        } while (f5 == 0);
        return f5;
    }

    private final c n() {
        while (true) {
            long j4 = this.parkedWorkersStack;
            c cVar = this.f6478k.get((int) (2097151 & j4));
            if (cVar == null) {
                return null;
            }
            long j5 = (2097152 + j4) & (-2097152);
            int l4 = l(cVar);
            if (l4 >= 0 && f6468m.compareAndSet(this, j4, l4 | j5)) {
                cVar.o(f6471p);
                return cVar;
            }
        }
    }

    private final void y(boolean z4) {
        long addAndGet = f6469n.addAndGet(this, 2097152L);
        if (z4 || M() || H(addAndGet)) {
            return;
        }
        M();
    }

    public final void C() {
        if (M() || K(this, 0L, 1, null)) {
            return;
        }
        M();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        v(10000L);
    }

    public final i e(Runnable runnable, j jVar) {
        long a5 = l.f6518f.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a5, jVar);
        }
        i iVar = (i) runnable;
        iVar.f6510e = a5;
        iVar.f6511f = jVar;
        return iVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        k(this, runnable, null, false, 6, null);
    }

    public final void i(Runnable runnable, j jVar, boolean z4) {
        b4.c.a();
        i e5 = e(runnable, jVar);
        c h5 = h();
        i F = F(h5, e5, z4);
        if (F != null && !a(F)) {
            throw new RejectedExecutionException(kotlin.jvm.internal.i.i(this.f6475h, " was terminated"));
        }
        boolean z5 = z4 && h5 != null;
        if (e5.f6511f.y() != 0) {
            y(z5);
        } else {
            if (z5) {
                return;
            }
            C();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public final boolean r(c cVar) {
        long j4;
        long j5;
        int f5;
        if (cVar.g() != f6471p) {
            return false;
        }
        do {
            j4 = this.parkedWorkersStack;
            int r12 = (int) (2097151 & j4);
            j5 = (2097152 + j4) & (-2097152);
            f5 = cVar.f();
            if (q0.a()) {
                if (!(f5 != 0)) {
                    throw new AssertionError();
                }
            }
            cVar.o(this.f6478k.get(r12));
        } while (!f6468m.compareAndSet(this, j4, f5 | j5));
        return true;
    }

    public final void s(c cVar, int r10, int r11) {
        while (true) {
            long j4 = this.parkedWorkersStack;
            int r12 = (int) (2097151 & j4);
            long j5 = (2097152 + j4) & (-2097152);
            if (r12 == r10) {
                r12 = r11 == 0 ? l(cVar) : r11;
            }
            if (r12 >= 0 && f6468m.compareAndSet(this, j4, j5 | r12)) {
                return;
            }
        }
    }

    public final void t(i iVar) {
        try {
            iVar.run();
        } finally {
            try {
            } finally {
            }
        }
    }

    public String toString() {
        int r12;
        int r4;
        int r6;
        int r7;
        StringBuilder sb;
        char c5;
        ArrayList arrayList = new ArrayList();
        int length = this.f6478k.length();
        int r22 = 0;
        if (1 < length) {
            r4 = 0;
            int r5 = 0;
            r6 = 0;
            r7 = 0;
            int r8 = 1;
            while (true) {
                int r9 = r8 + 1;
                c cVar = this.f6478k.get(r8);
                if (cVar != null) {
                    int f5 = cVar.f6481e.f();
                    int r82 = b.f6479a[cVar.f6482f.ordinal()];
                    if (r82 != 1) {
                        if (r82 == 2) {
                            r4++;
                            sb = new StringBuilder();
                            sb.append(f5);
                            c5 = 'b';
                        } else if (r82 == 3) {
                            r5++;
                            sb = new StringBuilder();
                            sb.append(f5);
                            c5 = 'c';
                        } else if (r82 == 4) {
                            r6++;
                            if (f5 > 0) {
                                sb = new StringBuilder();
                                sb.append(f5);
                                c5 = 'd';
                            }
                        } else if (r82 == 5) {
                            r7++;
                        }
                        sb.append(c5);
                        arrayList.add(sb.toString());
                    } else {
                        r22++;
                    }
                }
                if (r9 >= length) {
                    break;
                }
                r8 = r9;
            }
            r12 = r22;
            r22 = r5;
        } else {
            r12 = 0;
            r4 = 0;
            r6 = 0;
            r7 = 0;
        }
        long j4 = this.controlState;
        return this.f6475h + '@' + r0.b(this) + "[Pool Size {core = " + this.f6472e + ", max = " + this.f6473f + "}, Worker States {CPU = " + r22 + ", blocking = " + r4 + ", parked = " + r12 + ", dormant = " + r6 + ", terminated = " + r7 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f6476i.c() + ", global blocking queue size = " + this.f6477j.c() + ", Control State {created workers= " + ((int) (2097151 & j4)) + ", blocking tasks = " + ((int) ((4398044413952L & j4) >> 21)) + ", CPUs acquired = " + (this.f6472e - ((int) ((9223367638808264704L & j4) >> 42))) + "}]";
    }

    public final void v(long j4) {
        int r5;
        if (f6470o.compareAndSet(this, 0, 1)) {
            c h5 = h();
            synchronized (this.f6478k) {
                r5 = (int) (this.controlState & 2097151);
            }
            if (1 <= r5) {
                int r32 = 1;
                while (true) {
                    int r4 = r32 + 1;
                    c cVar = this.f6478k.get(r32);
                    kotlin.jvm.internal.i.b(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != h5) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(j4);
                        }
                        d dVar = cVar2.f6482f;
                        if (q0.a()) {
                            if (!(dVar == d.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        cVar2.f6481e.g(this.f6477j);
                    }
                    if (r32 == r5) {
                        break;
                    } else {
                        r32 = r4;
                    }
                }
            }
            this.f6477j.b();
            this.f6476i.b();
            while (true) {
                i e5 = h5 == null ? null : h5.e(true);
                if (e5 == null && (e5 = this.f6476i.d()) == null && (e5 = this.f6477j.d()) == null) {
                    break;
                } else {
                    t(e5);
                }
            }
            if (h5 != null) {
                h5.r(d.TERMINATED);
            }
            if (q0.a()) {
                if (!(((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f6472e)) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }
}
