package kotlinx.coroutines.scheduling;

import b4.g1;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class e extends g1 implements j, Executor {

    /* renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f6501l = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: g, reason: collision with root package name */
    private final c f6502g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6503h;

    /* renamed from: i, reason: collision with root package name */
    private final String f6504i;

    /* renamed from: j, reason: collision with root package name */
    private final int f6505j;

    /* renamed from: k, reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f6506k = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int r22, String str, int r4) {
        this.f6502g = cVar;
        this.f6503h = r22;
        this.f6504i = str;
        this.f6505j = r4;
    }

    private final void K(Runnable runnable, boolean z4) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6501l;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f6503h) {
                this.f6502g.M(runnable, this, z4);
                return;
            }
            this.f6506k.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= this.f6503h) {
                return;
            } else {
                runnable = this.f6506k.poll();
            }
        } while (runnable != null);
    }

    @Override // kotlinx.coroutines.scheduling.j
    public void C() {
        Runnable poll = this.f6506k.poll();
        if (poll != null) {
            this.f6502g.M(poll, this, true);
            return;
        }
        f6501l.decrementAndGet(this);
        Runnable poll2 = this.f6506k.poll();
        if (poll2 == null) {
            return;
        }
        K(poll2, true);
    }

    @Override // b4.g0
    public void F(n3.g gVar, Runnable runnable) {
        K(runnable, false);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        K(runnable, false);
    }

    @Override // b4.g0
    public String toString() {
        String str = this.f6504i;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f6502g + ']';
    }

    @Override // kotlinx.coroutines.scheduling.j
    public int y() {
        return this.f6505j;
    }
}
