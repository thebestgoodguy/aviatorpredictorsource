package o0;

/* loaded from: classes.dex */
final class p implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f6722e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6723f;

    p(q qVar, h hVar) {
        this.f6723f = qVar;
        this.f6722e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        a aVar;
        f0 f0Var4;
        f0 f0Var5;
        if (this.f6722e.n()) {
            f0Var5 = this.f6723f.f6726c;
            f0Var5.s();
            return;
        }
        try {
            aVar = this.f6723f.f6725b;
            Object a5 = aVar.a(this.f6722e);
            f0Var4 = this.f6723f.f6726c;
            f0Var4.r(a5);
        } catch (g e5) {
            if (e5.getCause() instanceof Exception) {
                f0Var3 = this.f6723f.f6726c;
                f0Var3.q((Exception) e5.getCause());
            } else {
                f0Var2 = this.f6723f.f6726c;
                f0Var2.q(e5);
            }
        } catch (Exception e6) {
            f0Var = this.f6723f.f6726c;
            f0Var.q(e6);
        }
    }
}
