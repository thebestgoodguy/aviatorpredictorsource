package o0;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
final class m implements n {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f6713a = new CountDownLatch(1);

    /* synthetic */ m(l lVar) {
    }

    public final void a() {
        this.f6713a.await();
    }

    @Override // o0.c
    public final void b() {
        this.f6713a.countDown();
    }

    @Override // o0.e
    public final void c(Exception exc) {
        this.f6713a.countDown();
    }

    @Override // o0.f
    public final void d(Object obj) {
        this.f6713a.countDown();
    }
}
