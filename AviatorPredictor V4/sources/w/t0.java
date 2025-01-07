package w;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class t0 extends a1<Boolean> {

    /* renamed from: d, reason: collision with root package name */
    public final int f8065d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f8066e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f8067f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected t0(c cVar, int r32, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f8067f = cVar;
        this.f8065d = r32;
        this.f8066e = bundle;
    }

    @Override // w.a1
    protected final /* bridge */ /* synthetic */ void a(Boolean bool) {
        s.a aVar;
        if (this.f8065d != 0) {
            this.f8067f.g0(1, null);
            Bundle bundle = this.f8066e;
            aVar = new s.a(this.f8065d, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null);
        } else {
            if (g()) {
                return;
            }
            this.f8067f.g0(1, null);
            aVar = new s.a(8, null);
        }
        f(aVar);
    }

    @Override // w.a1
    protected final void b() {
    }

    protected abstract void f(s.a aVar);

    protected abstract boolean g();
}
