package c0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f1092a;

    public b(Context context) {
        this.f1092a = context;
    }

    public ApplicationInfo a(String str, int r32) {
        return this.f1092a.getPackageManager().getApplicationInfo(str, r32);
    }

    public CharSequence b(String str) {
        return this.f1092a.getPackageManager().getApplicationLabel(this.f1092a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int r32) {
        return this.f1092a.getPackageManager().getPackageInfo(str, r32);
    }
}
