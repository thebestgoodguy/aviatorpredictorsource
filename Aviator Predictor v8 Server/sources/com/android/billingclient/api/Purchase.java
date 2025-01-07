package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.json.JSONObject;

/* loaded from: classes62.dex */
public class Purchase {
    private final String a;
    private final String b;
    private final JSONObject c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface PurchaseState {
    }

    public Purchase(@NonNull String str, @NonNull String str2) {
        this.a = str;
        this.b = str2;
        this.c = new JSONObject(str);
    }

    @NonNull
    public String a() {
        return this.a;
    }

    @NonNull
    public String b() {
        JSONObject jSONObject = this.c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    @NonNull
    public String c() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.a, purchase.a()) && TextUtils.equals(this.b, purchase.c());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.a));
    }
}
