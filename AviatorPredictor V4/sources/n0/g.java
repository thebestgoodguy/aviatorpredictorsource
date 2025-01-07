package n0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class g extends g0.a {
    g(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void w(j jVar, f fVar) {
        Parcel a5 = a();
        g0.c.b(a5, jVar);
        g0.c.c(a5, fVar);
        f(12, a5);
    }
}
