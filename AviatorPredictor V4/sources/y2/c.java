package y2;

import android.util.Log;
import j2.a;

/* loaded from: classes.dex */
public final class c implements j2.a, k2.a {

    /* renamed from: a, reason: collision with root package name */
    private a f8320a;

    /* renamed from: b, reason: collision with root package name */
    private b f8321b;

    @Override // j2.a
    public void c(a.b bVar) {
        b bVar2 = new b(bVar.a(), null);
        this.f8321b = bVar2;
        a aVar = new a(bVar2);
        this.f8320a = aVar;
        aVar.f(bVar.b());
    }

    @Override // j2.a
    public void d(a.b bVar) {
        a aVar = this.f8320a;
        if (aVar == null) {
            Log.wtf("UrlLauncherPlugin", "Already detached from the engine.");
            return;
        }
        aVar.g();
        this.f8320a = null;
        this.f8321b = null;
    }

    @Override // k2.a
    public void f() {
        if (this.f8320a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f8321b.d(null);
        }
    }

    @Override // k2.a
    public void g(k2.c cVar) {
        i(cVar);
    }

    @Override // k2.a
    public void i(k2.c cVar) {
        if (this.f8320a == null) {
            Log.wtf("UrlLauncherPlugin", "urlLauncher was never set.");
        } else {
            this.f8321b.d(cVar.d());
        }
    }

    @Override // k2.a
    public void k() {
        f();
    }
}
