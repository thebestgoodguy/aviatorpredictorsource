package io.grpc.internal;

/* loaded from: classes.dex */
abstract class x implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final b3.r f5709e;

    protected x(b3.r rVar) {
        this.f5709e = rVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        b3.r b5 = this.f5709e.b();
        try {
            a();
        } finally {
            this.f5709e.f(b5);
        }
    }
}
