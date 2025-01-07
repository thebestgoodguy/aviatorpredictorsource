package o0;

/* loaded from: classes.dex */
final class v implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f6736e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ w f6737f;

    v(w wVar, h hVar) {
        this.f6737f = wVar;
        this.f6736e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f6737f.f6739b;
        synchronized (obj) {
            w wVar = this.f6737f;
            dVar = wVar.f6740c;
            if (dVar != null) {
                dVar2 = wVar.f6740c;
                dVar2.a(this.f6736e);
            }
        }
    }
}
