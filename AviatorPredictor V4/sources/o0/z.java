package o0;

/* loaded from: classes.dex */
final class z implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f6746e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a0 f6747f;

    z(a0 a0Var, h hVar) {
        this.f6747f = a0Var;
        this.f6746e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f6747f.f6696b;
        synchronized (obj) {
            a0 a0Var = this.f6747f;
            fVar = a0Var.f6697c;
            if (fVar != null) {
                fVar2 = a0Var.f6697c;
                fVar2.d(this.f6746e.m());
            }
        }
    }
}
