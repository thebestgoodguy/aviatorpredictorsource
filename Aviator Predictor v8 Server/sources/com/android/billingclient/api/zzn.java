package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import defpackage.ad;
import defpackage.k;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes62.dex */
final class zzn extends BroadcastReceiver {
    private final PurchasesUpdatedListener a;
    private final zzbe b;
    private final zzc c;

    static /* bridge */ /* synthetic */ zzbe a(zzn zznVar) {
        zzbe zzbeVar = zznVar.b;
        return null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        BillingResult b = k.b(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            this.a.c(b, k.a(intent.getExtras()));
            return;
        }
        if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            Bundle extras = intent.getExtras();
            if (b.a() != 0) {
                this.a.c(b, ad.d());
                return;
            }
            if (this.c == null) {
                k.b("BillingBroadcastManager", "AlternativeBillingListener is null.");
                this.a.c(zzbb.j, ad.d());
                return;
            }
            if (extras == null) {
                k.b("BillingBroadcastManager", "Bundle is null.");
                this.a.c(zzbb.j, ad.d());
                return;
            }
            String string = extras.getString("ALTERNATIVE_BILLING_USER_CHOICE_DATA");
            if (string == null) {
                k.b("BillingBroadcastManager", "Couldn't find alternative billing user choice data in bundle.");
                this.a.c(zzbb.j, ad.d());
                return;
            }
            try {
                JSONArray optJSONArray = new JSONObject(string).optJSONArray("products");
                ArrayList arrayList = new ArrayList();
                if (optJSONArray != null) {
                    for (int r3 = 0; r3 < optJSONArray.length(); r3++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(r3);
                        if (optJSONObject != null) {
                            arrayList.add(new zze(optJSONObject, null));
                        }
                    }
                }
                this.c.a();
            } catch (JSONException unused) {
                k.b("BillingBroadcastManager", String.format("Error when parsing invalid alternative choice data: [%s]", string));
                this.a.c(zzbb.j, ad.d());
            }
        }
    }
}
