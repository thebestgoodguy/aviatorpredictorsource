package y;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import u.h;
import w.g;
import w.y;

/* loaded from: classes.dex */
public final class e extends g<a> {
    private final y I;

    public e(Context context, Looper looper, w.d dVar, y yVar, u.c cVar, h hVar) {
        super(context, looper, 270, dVar, cVar, hVar);
        this.I = yVar;
    }

    @Override // w.c
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // w.c
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // w.c
    protected final boolean H() {
        return true;
    }

    @Override // w.c, t.a.f
    public final int p() {
        return 203400000;
    }

    @Override // w.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // w.c
    public final s.c[] u() {
        return g0.d.f3865b;
    }

    @Override // w.c
    protected final Bundle z() {
        return this.I.d();
    }
}
