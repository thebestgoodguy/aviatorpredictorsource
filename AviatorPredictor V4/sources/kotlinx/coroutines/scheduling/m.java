package kotlinx.coroutines.scheduling;

import b4.q0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6519b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6520c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6521d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6522e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<i> f6523a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ i b(m mVar, i iVar, boolean z4, int r32, Object obj) {
        if ((r32 & 2) != 0) {
            z4 = false;
        }
        return mVar.a(iVar, z4);
    }

    private final i c(i iVar) {
        if (iVar.f6511f.y() == 1) {
            f6522e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int r02 = this.producerIndex & 127;
        while (this.f6523a.get(r02) != null) {
            Thread.yield();
        }
        this.f6523a.lazySet(r02, iVar);
        f6520c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            if (iVar.f6511f.y() == 1) {
                int decrementAndGet = f6522e.decrementAndGet(this);
                if (q0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int r02 = this.consumerIndex;
            if (r02 - this.producerIndex == 0) {
                return null;
            }
            int r12 = r02 & 127;
            if (f6521d.compareAndSet(this, r02, r02 + 1) && (andSet = this.f6523a.getAndSet(r12, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i4 = i();
        if (i4 == null) {
            return false;
        }
        dVar.a(i4);
        return true;
    }

    private final long m(m mVar, boolean z4) {
        i iVar;
        do {
            iVar = (i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z4) {
                if (!(iVar.f6511f.y() == 1)) {
                    return -2L;
                }
            }
            long a5 = l.f6518f.a() - iVar.f6510e;
            long j4 = l.f6513a;
            if (a5 < j4) {
                return j4 - a5;
            }
        } while (!b4.l.a(f6519b, mVar, iVar, null));
        b(this, iVar, false, 2, null);
        return -1L;
    }

    public final i a(i iVar, boolean z4) {
        if (z4) {
            return c(iVar);
        }
        i iVar2 = (i) f6519b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) f6519b.getAndSet(this, null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        while (j(dVar)) {
        }
    }

    public final i h() {
        i iVar = (i) f6519b.getAndSet(this, null);
        return iVar == null ? i() : iVar;
    }

    public final long k(m mVar) {
        if (q0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int r32 = mVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = mVar.f6523a;
        for (int r02 = mVar.consumerIndex; r02 != r32; r02++) {
            int r5 = r02 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(r5);
            if (iVar != null) {
                if ((iVar.f6511f.y() == 1) && atomicReferenceArray.compareAndSet(r5, iVar, null)) {
                    f6522e.decrementAndGet(mVar);
                    b(this, iVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(mVar, true);
    }

    public final long l(m mVar) {
        if (q0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i i4 = mVar.i();
        if (i4 == null) {
            return m(mVar, false);
        }
        i b5 = b(this, i4, false, 2, null);
        if (!q0.a()) {
            return -1L;
        }
        if (b5 == null) {
            return -1L;
        }
        throw new AssertionError();
    }
}
