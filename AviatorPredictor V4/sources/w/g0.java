package w;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class g0 implements DialogInterface.OnClickListener {
    public static g0 b(Activity activity, Intent intent, int r32) {
        return new e0(intent, activity, r32);
    }

    public static g0 c(u.e eVar, Intent intent, int r32) {
        return new f0(intent, eVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int r6) {
        try {
            a();
        } catch (ActivityNotFoundException e5) {
            Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e5);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
