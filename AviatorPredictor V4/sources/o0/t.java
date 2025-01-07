package o0;

/* loaded from: classes.dex */
final class t implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ u f6732e;

    t(u uVar) {
        this.f6732e = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f6732e.f6734b;
        synchronized (obj) {
            u uVar = this.f6732e;
            cVar = uVar.f6735c;
            if (cVar != null) {
                cVar2 = uVar.f6735c;
                cVar2.b();
            }
        }
    }
}
