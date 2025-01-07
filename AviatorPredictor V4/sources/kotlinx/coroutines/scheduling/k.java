package kotlinx.coroutines.scheduling;

import b4.r0;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f6512g;

    public k(Runnable runnable, long j4, j jVar) {
        super(j4, jVar);
        this.f6512g = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f6512g.run();
        } finally {
            this.f6511f.C();
        }
    }

    public String toString() {
        return "Task[" + r0.a(this.f6512g) + '@' + r0.b(this.f6512g) + ", " + this.f6510e + ", " + this.f6511f + ']';
    }
}
