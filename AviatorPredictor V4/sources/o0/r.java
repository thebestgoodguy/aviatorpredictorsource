package o0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class r implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ h f6727e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ s f6728f;

    r(s sVar, h hVar) {
        this.f6728f = sVar;
        this.f6727e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f0 f0Var;
        f0 f0Var2;
        f0 f0Var3;
        a aVar;
        try {
            aVar = this.f6728f.f6730b;
            h hVar = (h) aVar.a(this.f6727e);
            if (hVar == null) {
                this.f6728f.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f6712b;
            hVar.f(executor, this.f6728f);
            hVar.d(executor, this.f6728f);
            hVar.a(executor, this.f6728f);
        } catch (g e5) {
            if (e5.getCause() instanceof Exception) {
                f0Var3 = this.f6728f.f6731c;
                f0Var3.q((Exception) e5.getCause());
            } else {
                f0Var2 = this.f6728f.f6731c;
                f0Var2.q(e5);
            }
        } catch (Exception e6) {
            f0Var = this.f6728f.f6731c;
            f0Var.q(e6);
        }
    }
}
