package w;

import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    private static final e.e<String, String> f7956a = new e.e<>();

    /* renamed from: b, reason: collision with root package name */
    private static Locale f7957b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c0.c.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(r.b.f7373g);
    }

    public static String c(Context context, int r22) {
        return context.getResources().getString(r22 != 1 ? r22 != 2 ? r22 != 3 ? R.string.ok : r.b.f7367a : r.b.f7376j : r.b.f7370d);
    }

    public static String d(Context context, int r6) {
        Resources resources = context.getResources();
        String a5 = a(context);
        if (r6 == 1) {
            return resources.getString(r.b.f7371e, a5);
        }
        if (r6 == 2) {
            return b0.g.c(context) ? resources.getString(r.b.f7380n) : resources.getString(r.b.f7377k, a5);
        }
        if (r6 == 3) {
            return resources.getString(r.b.f7368b, a5);
        }
        if (r6 == 5) {
            return h(context, "common_google_play_services_invalid_account_text", a5);
        }
        if (r6 == 7) {
            return h(context, "common_google_play_services_network_error_text", a5);
        }
        if (r6 == 9) {
            return resources.getString(r.b.f7375i, a5);
        }
        if (r6 == 20) {
            return h(context, "common_google_play_services_restricted_profile_text", a5);
        }
        switch (r6) {
            case 16:
                return h(context, "common_google_play_services_api_unavailable_text", a5);
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return h(context, "common_google_play_services_sign_in_failed_text", a5);
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return resources.getString(r.b.f7379m, a5);
            default:
                return resources.getString(s.k.f7499a, a5);
        }
    }

    public static String e(Context context, int r22) {
        return (r22 == 6 || r22 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, r22);
    }

    public static String f(Context context, int r22) {
        String i4 = r22 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, r22);
        return i4 == null ? context.getResources().getString(r.b.f7374h) : i4;
    }

    public static String g(Context context, int r4) {
        String str;
        Resources resources = context.getResources();
        switch (r4) {
            case 1:
                return resources.getString(r.b.f7372f);
            case 2:
                return resources.getString(r.b.f7378l);
            case 3:
                return resources.getString(r.b.f7369c);
            case 4:
            case 6:
            case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(r4);
                str = sb.toString();
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i4 = i(context, str);
        if (i4 == null) {
            i4 = resources.getString(s.k.f7499a);
        }
        return String.format(resources.getConfiguration().locale, i4, str2);
    }

    private static String i(Context context, String str) {
        e.e<String, String> eVar = f7956a;
        synchronized (eVar) {
            Locale c5 = i.a.a(context.getResources().getConfiguration()).c(0);
            if (!c5.equals(f7957b)) {
                eVar.clear();
                f7957b = c5;
            }
            String str2 = eVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources d5 = s.h.d(context);
            if (d5 == null) {
                return null;
            }
            int identifier = d5.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = d5.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            eVar.put(str, string);
            return string;
        }
    }
}
