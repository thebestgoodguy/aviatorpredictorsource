package f0;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class e extends c implements f {
    e(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
    }

    @Override // f0.f
    public final void l(h hVar) {
        Parcel a5 = a();
        d.b(a5, hVar);
        f(1, a5);
    }
}
