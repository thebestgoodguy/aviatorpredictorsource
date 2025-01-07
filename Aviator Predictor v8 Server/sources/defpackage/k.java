package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ConsumeParams;
import com.android.billingclient.api.InAppMessageResult;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes61.dex */
public final class k {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return d(intent.getExtras(), "ProxyBillingActivity");
        }
        b("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int a(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                a(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            concat = "Unexpected type for bundle response code: ".concat(String.valueOf(obj.getClass().getName()));
        }
        b(str, concat);
        return 6;
    }

    public static Bundle a(int r8, boolean z, String str, @Nullable String str2, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        if (r8 >= 9) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        if (r8 >= 9 && z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        if (r8 >= 14) {
            ArrayList<String> arrayList2 = new ArrayList<>();
            ArrayList<String> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            boolean z2 = false;
            boolean z3 = false;
            for (int r3 = 0; r3 < size; r3++) {
                arrayList2.add(null);
                z2 |= !TextUtils.isEmpty(null);
                arrayList3.add(null);
                z3 |= !TextUtils.isEmpty(null);
                arrayList4.add(0);
            }
            if (z2) {
                bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
            }
            if (z3) {
                bundle.putStringArrayList("SKU_OFFER_ID_LIST", arrayList3);
            }
        }
        return bundle;
    }

    public static Bundle a(AcknowledgePurchaseParams acknowledgePurchaseParams, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        return bundle;
    }

    public static Bundle a(ConsumeParams consumeParams, boolean z, String str) {
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putString("playBillingLibraryVersion", str);
        }
        return bundle;
    }

    public static Bundle a(String str, ArrayList arrayList, @Nullable String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        boolean z = false;
        for (int r2 = 0; r2 < size; r2++) {
            arrayList2.add(null);
            z |= !TextUtils.isEmpty(null);
        }
        if (z) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        return bundle;
    }

    public static Bundle a(boolean z, boolean z2, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z && z2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static String a(int r0) {
        return a.a(r0).toString();
    }

    @Nullable
    public static List a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase c = c(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (c == null) {
                a("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(c);
        } else {
            a("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int r6 = 0; r6 < stringArrayList.size() && r6 < stringArrayList2.size(); r6++) {
                Purchase c2 = c(stringArrayList.get(r6), stringArrayList2.get(r6));
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
        }
        return arrayList;
    }

    public static void a(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int r0 = 40000;
            while (!str2.isEmpty() && r0 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, r0));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                r0 -= min;
            }
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static BillingResult b(Intent intent, String str) {
        if (intent != null) {
            BillingResult.Builder b = BillingResult.b();
            b.a(a(intent.getExtras(), str));
            b.a(c(intent.getExtras(), str));
            return b.a();
        }
        b("BillingHelper", "Got null intent!");
        BillingResult.Builder b2 = BillingResult.b();
        b2.a(6);
        b2.a("An internal error occurred.");
        return b2.a();
    }

    public static InAppMessageResult b(Bundle bundle, String str) {
        return bundle == null ? new InAppMessageResult(0, null) : new InAppMessageResult(d(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static void b(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    @Nullable
    private static Purchase c(String str, String str2) {
        if (str == null || str2 == null) {
            a("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e) {
            b("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }

    public static String c(Bundle bundle, String str) {
        if (bundle == null) {
            b(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            a(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        b(str, "Unexpected type for debug message: ".concat(String.valueOf(obj.getClass().getName())));
        return "";
    }

    private static int d(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        b(str, "Unexpected null bundle received!");
        return 0;
    }
}
