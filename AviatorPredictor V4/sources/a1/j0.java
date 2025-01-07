package a1;

import android.text.TextUtils;
import android.util.Log;
import k0.d;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f68a = "j0";

    public static boolean a(d.a aVar) {
        if (aVar == null || TextUtils.isEmpty(aVar.c())) {
            Log.e(f68a, "No SafetyNet AttestationResponse passed.");
            return false;
        }
        i0 a5 = i0.a(aVar.c());
        if (a5 == null) {
            Log.e(f68a, "Unable to parse SafetyNet AttestationResponse");
            return false;
        }
        if (!a5.c()) {
            Log.e(f68a, "SafetyNet Attestation fails basic integrity.");
            return false;
        }
        if (TextUtils.isEmpty(a5.b())) {
            return true;
        }
        Log.e(f68a, "SafetyNet Attestation has advice: \n".concat(String.valueOf(a5.b())));
        return false;
    }
}
