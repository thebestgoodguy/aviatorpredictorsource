package w;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* loaded from: classes.dex */
public final class b1 extends u0 {

    /* renamed from: a, reason: collision with root package name */
    private c f7909a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7910b;

    public b1(c cVar, int r22) {
        this.f7909a = cVar;
        this.f7910b = r22;
    }

    @Override // w.l
    public final void k(int r22, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // w.l
    public final void t(int r32, IBinder iBinder, f1 f1Var) {
        c cVar = this.f7909a;
        r.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        r.i(f1Var);
        c.a0(cVar, f1Var);
        u(r32, iBinder, f1Var.f7986e);
    }

    @Override // w.l
    public final void u(int r32, IBinder iBinder, Bundle bundle) {
        r.j(this.f7909a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f7909a.M(r32, iBinder, bundle, this.f7910b);
        this.f7909a = null;
    }
}
