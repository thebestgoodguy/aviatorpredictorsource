package n0;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import t.f;
import w.c;
import w.p0;
import w.r;

/* loaded from: classes.dex */
public class a extends w.g<g> implements m0.f {
    public static final /* synthetic */ int M = 0;
    private final boolean I;
    private final w.d J;
    private final Bundle K;
    private final Integer L;

    public a(Context context, Looper looper, boolean z4, w.d dVar, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        this.I = true;
        this.J = dVar;
        this.K = bundle;
        this.L = dVar.g();
    }

    public static Bundle j0(w.d dVar) {
        dVar.f();
        Integer g5 = dVar.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar.a());
        if (g5 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", g5.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // w.c
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // w.c
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m0.f
    public final void j(f fVar) {
        r.j(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b5 = this.J.b();
            ((g) C()).w(new j(1, new p0(b5, ((Integer) r.i(this.L)).intValue(), "<<default account>>".equals(b5.name) ? q.a.a(x()).b() : null)), fVar);
        } catch (RemoteException e5) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.v(new l(1, new s.a(8, null), null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e5);
            }
        }
    }

    @Override // w.c, t.a.f
    public final boolean m() {
        return this.I;
    }

    @Override // m0.f
    public final void n() {
        g(new c.d());
    }

    @Override // w.c, t.a.f
    public final int p() {
        return s.i.f7494a;
    }

    @Override // w.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }

    @Override // w.c
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.J.d())) {
            this.K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.J.d());
        }
        return this.K;
    }
}
