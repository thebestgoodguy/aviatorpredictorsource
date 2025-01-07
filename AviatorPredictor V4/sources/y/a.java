package y;

import android.os.IBinder;
import android.os.Parcel;
import w.v;

/* loaded from: classes.dex */
public final class a extends g0.a {
    a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void w(v vVar) {
        Parcel a5 = a();
        g0.c.b(a5, vVar);
        h(1, a5);
    }
}
