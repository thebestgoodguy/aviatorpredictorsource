package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.k;

/* loaded from: classes62.dex */
public final class BillingResult {
    private int a;
    private String b;

    public class Builder {
        private int a;
        private String b = "";

        private Builder() {
        }

        /* synthetic */ Builder(zzba zzbaVar) {
        }

        @NonNull
        public Builder a(int r1) {
            this.a = r1;
            return this;
        }

        @NonNull
        public Builder a(@NonNull String str) {
            this.b = str;
            return this;
        }

        @NonNull
        public BillingResult a() {
            BillingResult billingResult = new BillingResult();
            billingResult.a = this.a;
            billingResult.b = this.b;
            return billingResult;
        }
    }

    @NonNull
    public static Builder b() {
        return new Builder(null);
    }

    public int a() {
        return this.a;
    }

    @NonNull
    public String c() {
        return this.b;
    }

    @NonNull
    public String toString() {
        return "Response Code: " + k.a(this.a) + ", Debug Message: " + this.b;
    }
}
