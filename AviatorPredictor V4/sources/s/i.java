package s;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import w.w0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f7494a = 12451000;

    /* renamed from: b, reason: collision with root package name */
    static final AtomicBoolean f7495b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicBoolean f7496c = new AtomicBoolean();

    @Deprecated
    public static void a(Context context, int r32) {
        int g5 = e.e().g(context, r32);
        if (g5 != 0) {
            Intent a5 = e.e().a(context, g5, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(g5);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a5 != null) {
                throw new g(g5, "Google Play Services not available", a5);
            }
            throw new f(g5);
        }
    }

    @Deprecated
    public static String b(int r02) {
        return a.o0(r02);
    }

    public static Context c(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources d(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Deprecated
    public static int e(Context context, int r11) {
        String valueOf;
        String str;
        PackageInfo packageInfo;
        try {
            context.getResources().getString(k.f7499a);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !f7496c.get()) {
            int a5 = w0.a(context);
            if (a5 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (a5 != f7494a) {
                throw new GooglePlayServicesIncorrectManifestValueException(a5);
            }
        }
        boolean z4 = (b0.g.c(context) || b0.g.e(context)) ? false : true;
        w.r.a(r11 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z4) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                valueOf = String.valueOf(packageName);
                str = " requires the Google Play Store, but it is missing.";
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            j.a(context);
            if (j.c(packageInfo2, true)) {
                if (z4) {
                    w.r.i(packageInfo);
                    if (!j.c(packageInfo, true)) {
                        valueOf = String.valueOf(packageName);
                        str = " requires Google Play Store, but its signature is invalid.";
                    }
                }
                if (!z4 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    if (b0.m.a(packageInfo2.versionCode) >= b0.m.a(r11)) {
                        ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e5) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e5);
                                return 1;
                            }
                        }
                        return !applicationInfo.enabled ? 3 : 0;
                    }
                    int r10 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 82);
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(r11);
                    sb.append(" but found ");
                    sb.append(r10);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    return 2;
                }
                valueOf = String.valueOf(packageName);
                str = " requires Google Play Store, but its signature doesn't match that of Google Play services.";
            } else {
                valueOf = String.valueOf(packageName);
                str = " requires Google Play services, but their signature is invalid.";
            }
            Log.w("GooglePlayServicesUtil", valueOf.concat(str));
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean f(Context context, int r32) {
        if (r32 == 18) {
            return true;
        }
        if (r32 == 1) {
            return i(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean g(Context context) {
        if (!b0.j.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        w.r.i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean h(int r22) {
        return r22 == 1 || r22 == 2 || r22 == 3 || r22 == 9;
    }

    static boolean i(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (b0.j.e()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return equals ? applicationInfo.enabled : applicationInfo.enabled && !g(context);
    }
}
