package o0;

/* loaded from: classes.dex */
final class x implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f6741e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ y f6742f;

    x(y yVar, h hVar) {
        this.f6742f = yVar;
        this.f6741e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f6742f.f6744b;
        synchronized (obj) {
            y yVar = this.f6742f;
            eVar = yVar.f6745c;
            if (eVar != null) {
                eVar2 = yVar.f6745c;
                eVar2.c((Exception) w.r.i(this.f6741e.l()));
            }
        }
    }
}
