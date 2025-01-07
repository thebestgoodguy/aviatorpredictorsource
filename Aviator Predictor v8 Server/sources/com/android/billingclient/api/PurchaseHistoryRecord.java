package com.android.billingclient.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* loaded from: classes62.dex */
public class PurchaseHistoryRecord {
    private final String a;
    private final String b;
    private final JSONObject c;

    public PurchaseHistoryRecord(@NonNull String str, @NonNull String str2) {
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
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        return TextUtils.equals(this.a, purchaseHistoryRecord.a()) && TextUtils.equals(this.b, purchaseHistoryRecord.c());
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NonNull
    public String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.a));
    }
}
