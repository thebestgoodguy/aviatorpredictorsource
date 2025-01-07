package y2;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import io.flutter.plugins.urllauncher.WebViewActivity;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8314a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f8315b;

    enum a {
        OK,
        NO_ACTIVITY,
        ACTIVITY_NOT_FOUND
    }

    b(Context context, Activity activity) {
        this.f8314a = context;
        this.f8315b = activity;
    }

    boolean a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        ComponentName resolveActivity = intent.resolveActivity(this.f8314a.getPackageManager());
        if (resolveActivity == null) {
            Log.i("UrlLauncher", "component name for " + str + " is null");
            return false;
        }
        Log.i("UrlLauncher", "component name for " + str + " is " + resolveActivity.toShortString());
        return !"{com.android.fallback/com.android.fallback.Fallback}".equals(resolveActivity.toShortString());
    }

    void b() {
        this.f8314a.sendBroadcast(new Intent(WebViewActivity.f4795i));
    }

    a c(String str, Bundle bundle, boolean z4, boolean z5, boolean z6) {
        Activity activity = this.f8315b;
        if (activity == null) {
            return a.NO_ACTIVITY;
        }
        try {
            this.f8315b.startActivity(z4 ? WebViewActivity.b(activity, str, z5, z6, bundle) : new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", bundle));
            return a.OK;
        } catch (ActivityNotFoundException unused) {
            return a.ACTIVITY_NOT_FOUND;
        }
    }

    void d(Activity activity) {
        this.f8315b = activity;
    }
}
