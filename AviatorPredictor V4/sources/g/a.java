package g;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public class a extends androidx.core.content.a {

    /* renamed from: c, reason: collision with root package name */
    private static InterfaceC0041a f3795c;

    /* renamed from: g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0041a {
        boolean a(Activity activity, int r22, int r32, Intent intent);
    }

    public static InterfaceC0041a d() {
        return f3795c;
    }

    public static void e(Activity activity, Intent intent, int r4, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, r4, bundle);
        } else {
            activity.startActivityForResult(intent, r4);
        }
    }
}
