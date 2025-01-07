package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

@zzj
/* loaded from: classes62.dex */
public final class ProductDetails {
    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    @Nullable
    private final List i;

    @zzg
    public final class OneTimePurchaseOfferDetails {
    }

    @zzj
    public final class PricingPhase {
        private final String a;
        private final long b;
        private final String c;
        private final String d;
        private final int e;
        private final int f;

        PricingPhase(JSONObject jSONObject) {
            this.d = jSONObject.optString("billingPeriod");
            this.c = jSONObject.optString("priceCurrencyCode");
            this.a = jSONObject.optString("formattedPrice");
            this.b = jSONObject.optLong("priceAmountMicros");
            this.f = jSONObject.optInt("recurrenceMode");
            this.e = jSONObject.optInt("billingCycleCount");
        }
    }

    @zzj
    public class PricingPhases {
        private final List<PricingPhase> a;

        PricingPhases(JSONArray jSONArray) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                for (int r1 = 0; r1 < jSONArray.length(); r1++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(r1);
                    if (optJSONObject != null) {
                        arrayList.add(new PricingPhase(optJSONObject));
                    }
                }
            }
            this.a = arrayList;
        }
    }

    @zzj
    @Retention(RetentionPolicy.SOURCE)
    public @interface RecurrenceMode {
    }

    @zzj
    public final class SubscriptionOfferDetails {
        private final String a;
        private final PricingPhases b;
        private final List<String> c;

        @Nullable
        private final zzbg d;

        SubscriptionOfferDetails(JSONObject jSONObject) {
            this.a = jSONObject.getString("offerIdToken");
            this.b = new PricingPhases(jSONObject.getJSONArray("pricingPhases"));
            JSONObject optJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
            this.d = optJSONObject == null ? null : new zzbg(optJSONObject);
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
            if (optJSONArray != null) {
                for (int r1 = 0; r1 < optJSONArray.length(); r1++) {
                    arrayList.add(optJSONArray.getString(r1));
                }
            }
            this.c = arrayList;
        }
    }

    ProductDetails(String str) {
        this.a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.c = optString;
        String optString2 = jSONObject.optString("type");
        this.d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.e = jSONObject.optString("title");
        this.f = jSONObject.optString("name");
        this.g = jSONObject.optString("description");
        this.h = jSONObject.optString("skuDetailsToken");
        if (optString2.equals("inapp")) {
            this.i = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            for (int r1 = 0; r1 < optJSONArray.length(); r1++) {
                arrayList.add(new SubscriptionOfferDetails(optJSONArray.getJSONObject(r1)));
            }
        }
        this.i = arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.a, ((ProductDetails) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "ProductDetails{jsonString='" + this.a + "', parsedJson=" + this.b.toString() + ", productId='" + this.c + "', productType='" + this.d + "', title='" + this.e + "', productDetailsToken='" + this.h + "', subscriptionOfferDetails=" + String.valueOf(this.i) + "}";
    }
}
