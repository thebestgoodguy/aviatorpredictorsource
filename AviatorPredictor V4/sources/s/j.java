package s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    private static j f7497b;

    /* renamed from: a, reason: collision with root package name */
    private final Context f7498a;

    public j(Context context) {
        this.f7498a = context.getApplicationContext();
    }

    public static j a(Context context) {
        w.r.i(context);
        synchronized (j.class) {
            if (f7497b == null) {
                y.a(context);
                f7497b = new j(context);
            }
        }
        return f7497b;
    }

    static final u b(PackageInfo packageInfo, u... uVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        v vVar = new v(packageInfo.signatures[0].toByteArray());
        for (int r22 = 0; r22 < uVarArr.length; r22++) {
            if (uVarArr[r22].equals(vVar)) {
                return uVarArr[r22];
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z4) {
        if (packageInfo != null && packageInfo.signatures != null) {
            if ((z4 ? b(packageInfo, x.f7510a) : b(packageInfo, x.f7510a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
