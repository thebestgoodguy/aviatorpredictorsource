package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes62.dex */
public class BillingFlowParams {

    public class Builder {
        private SubscriptionUpdateParams.Builder a;

        private Builder() {
            SubscriptionUpdateParams.Builder a = SubscriptionUpdateParams.a();
            SubscriptionUpdateParams.Builder.a(a);
            this.a = a;
        }
    }

    @zzj
    public final class ProductDetailsParams {

        @zzj
        public class Builder {
            private Builder() {
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ProrationMode {
    }

    public class SubscriptionUpdateParams {
        private int a = 0;

        public class Builder {
            private boolean a;
            private int b = 0;

            private Builder() {
            }

            /* synthetic */ Builder(zzax zzaxVar) {
            }

            static /* synthetic */ Builder a(Builder builder) {
                builder.a = true;
                return builder;
            }
        }

        private SubscriptionUpdateParams() {
        }

        @NonNull
        public static Builder a() {
            return new Builder(null);
        }
    }

    private BillingFlowParams() {
    }
}
