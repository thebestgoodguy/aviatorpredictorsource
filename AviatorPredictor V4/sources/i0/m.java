package i0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import t.f;

/* loaded from: classes.dex */
public final class m extends w.g<h> {
    private final Context I;

    public m(Context context, Looper looper, w.d dVar, f.a aVar, f.b bVar) {
        super(context, looper, 45, dVar, aVar, bVar);
        this.I = context;
    }

    @Override // w.c
    protected final String D() {
        return "com.google.android.gms.safetynet.internal.ISafetyNetService";
    }

    @Override // w.c
    protected final String E() {
        return "com.google.android.gms.safetynet.service.START";
    }

    protected final String j0(String str) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.I.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.I.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null) {
                return null;
            }
            return (String) bundle.get(str);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // w.c, t.a.f
    public final int p() {
        return 12200000;
    }

    @Override // w.c
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.safetynet.internal.ISafetyNetService");
        return queryLocalInterface instanceof h ? (h) queryLocalInterface : new i(iBinder);
    }
}
