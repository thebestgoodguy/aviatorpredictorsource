package a1;

/* loaded from: classes.dex */
final class n implements o0.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ o f94a;

    n(o oVar) {
        this.f94a = oVar;
    }

    @Override // o0.e
    public final void c(Exception exc) {
        z.a aVar;
        if (exc instanceof x0.l) {
            aVar = p.f101h;
            aVar.g("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f94a.f98f.d();
        }
    }
}
