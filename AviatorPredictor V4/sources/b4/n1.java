package b4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
final class n1 extends r1 {

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f1028j = AtomicIntegerFieldUpdater.newUpdater(n1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: i, reason: collision with root package name */
    private final u3.l<Throwable, k3.s> f1029i;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(u3.l<? super Throwable, k3.s> lVar) {
        this.f1029i = lVar;
    }

    @Override // u3.l
    public /* bridge */ /* synthetic */ k3.s invoke(Throwable th) {
        y(th);
        return k3.s.f6374a;
    }

    @Override // b4.b0
    public void y(Throwable th) {
        if (f1028j.compareAndSet(this, 0, 1)) {
            this.f1029i.invoke(th);
        }
    }
}
