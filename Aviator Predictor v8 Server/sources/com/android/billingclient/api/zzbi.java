package com.android.billingclient.api;

import android.os.Bundle;
import com.android.billingclient.api.BillingResult;
import defpackage.k;
import java.util.ArrayList;

/* loaded from: classes62.dex */
final class zzbi {
    static BillingResult a(Bundle bundle, String str, String str2) {
        String format;
        BillingResult billingResult = zzbb.j;
        if (bundle == null) {
            format = String.format("%s got null owned items list", str2);
        } else {
            int a = k.a(bundle, "BillingClient");
            String c = k.c(bundle, "BillingClient");
            BillingResult.Builder b = BillingResult.b();
            b.a(a);
            b.a(c);
            BillingResult a2 = b.a();
            if (a != 0) {
                k.b("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(a)));
                return a2;
            }
            if (bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundle.containsKey("INAPP_PURCHASE_DATA_LIST") && bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                if (stringArrayList == null) {
                    format = String.format("Bundle returned from %s contains null SKUs list.", str2);
                } else if (stringArrayList2 == null) {
                    format = String.format("Bundle returned from %s contains null purchases list.", str2);
                } else {
                    if (stringArrayList3 != null) {
                        return zzbb.l;
                    }
                    format = String.format("Bundle returned from %s contains null signatures list.", str2);
                }
            } else {
                format = String.format("Bundle returned from %s doesn't contain required fields.", str2);
            }
        }
        k.b("BillingClient", format);
        return billingResult;
    }
}
