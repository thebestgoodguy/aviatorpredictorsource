package com.android.billingclient.api;

import androidx.annotation.AnyThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes62.dex */
public abstract class BillingClient {

    @Retention(RetentionPolicy.SOURCE)
    public @interface BillingResponseCode {
    }

    @AnyThread
    public final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface FeatureType {
    }

    @zzj
    @Retention(RetentionPolicy.SOURCE)
    public @interface ProductType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Deprecated
    public @interface SkuType {
    }
}
