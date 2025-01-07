package a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private static final y0 f141a = new y0();

    private y0() {
    }

    public static y0 b() {
        return f141a;
    }

    private static void f(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator<String> it = sharedPreferences.getAll().keySet().iterator();
        while (it.hasNext()) {
            edit.remove(it.next());
        }
        edit.apply();
    }

    private static final SharedPreferences g(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", str), 0);
    }

    public final synchronized x0 a(Context context, String str, String str2) {
        w.r.e(str);
        w.r.e(str2);
        SharedPreferences g5 = g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        String format3 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2);
        String format4 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        String string = g5.getString(format, null);
        String string2 = g5.getString(format2, null);
        String string3 = g5.getString(format3, null);
        String string4 = g5.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
        String string5 = g5.getString(format4, null);
        SharedPreferences.Editor edit = g5.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.remove(format3);
        edit.remove(format4);
        edit.apply();
        if (string == null || string2 == null || string3 == null) {
            return null;
        }
        return new x0(string, string2, string3, string4, string5);
    }

    public final synchronized String c(Context context, String str, String str2) {
        String string;
        String string2;
        w.r.e(str);
        w.r.e(str2);
        SharedPreferences g5 = g(context, str);
        String format = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2);
        string = g5.getString(format, null);
        String format2 = String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2);
        string2 = g5.getString(format2, null);
        SharedPreferences.Editor edit = g5.edit();
        edit.remove(format);
        edit.remove(format2);
        edit.apply();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string2;
    }

    public final synchronized void d(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        w.r.e(str);
        w.r.e(str2);
        w.r.e(str3);
        w.r.e(str7);
        SharedPreferences g5 = g(context, str);
        f(g5);
        SharedPreferences.Editor edit = g5.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.SESSION_ID", str2), str3);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), str4);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.PROVIDER_ID", str2), str5);
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str7);
        edit.putString("com.google.firebase.auth.api.gms.config.tenant.id", str6);
        edit.apply();
    }

    public final synchronized void e(Context context, String str, String str2, String str3, String str4) {
        w.r.e(str);
        w.r.e(str2);
        SharedPreferences g5 = g(context, str);
        f(g5);
        SharedPreferences.Editor edit = g5.edit();
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.OPERATION", str2), "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        edit.putString(String.format("com.google.firebase.auth.internal.EVENT_ID.%s.FIREBASE_APP_NAME", str2), str4);
        edit.apply();
    }
}
