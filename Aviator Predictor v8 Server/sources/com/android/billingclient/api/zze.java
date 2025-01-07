package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONObject;

/* loaded from: classes62.dex */
public final class zze {
    private final String a;
    private final String b;

    /* synthetic */ zze(JSONObject jSONObject, zzd zzdVar) {
        this.a = jSONObject.optString("productId");
        this.b = jSONObject.optString("productType");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zze)) {
            return false;
        }
        zze zzeVar = (zze) obj;
        return this.a.equals(zzeVar.a) && this.b.equals(zzeVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("{id: %s, type: %s}", this.a, this.b);
    }
}
