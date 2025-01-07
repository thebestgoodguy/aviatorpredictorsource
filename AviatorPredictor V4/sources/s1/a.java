package s1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import f1.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7534a;

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7535b;

    /* renamed from: c, reason: collision with root package name */
    private final c f7536c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f7537d;

    public a(Context context, String str, c cVar) {
        Context a5 = a(context);
        this.f7534a = a5;
        this.f7535b = a5.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f7536c = cVar;
        this.f7537d = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : androidx.core.content.a.a(context);
    }

    private boolean c() {
        return this.f7535b.contains("firebase_data_collection_default_enabled") ? this.f7535b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f7534a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f7534a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z4) {
        if (this.f7537d != z4) {
            this.f7537d = z4;
            this.f7536c.a(new f1.a<>(x0.a.class, new x0.a(z4)));
        }
    }

    public synchronized boolean b() {
        return this.f7537d;
    }

    public synchronized void e(Boolean bool) {
        boolean equals;
        if (bool == null) {
            this.f7535b.edit().remove("firebase_data_collection_default_enabled").apply();
            equals = d();
        } else {
            equals = Boolean.TRUE.equals(bool);
            this.f7535b.edit().putBoolean("firebase_data_collection_default_enabled", equals).apply();
        }
        f(equals);
    }
}
