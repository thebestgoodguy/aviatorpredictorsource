package f0;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class j extends w.g<f> {
    public j(Context context, Looper looper, w.d dVar, u.c cVar, u.h hVar) {
        super(context, looper, 126, dVar, cVar, hVar);
    }

    @Override // w.c
    protected final String D() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // w.c
    protected final String E() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
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
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new e(iBinder);
    }

    @Override // w.c
    public final s.c[] u() {
        return b.f3644d;
    }
}
