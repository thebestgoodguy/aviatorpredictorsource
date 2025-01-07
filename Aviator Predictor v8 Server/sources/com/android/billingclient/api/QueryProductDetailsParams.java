package com.android.billingclient.api;

import androidx.annotation.NonNull;
import defpackage.ad;

@zzj
/* loaded from: classes62.dex */
public final class QueryProductDetailsParams {
    private final ad a;

    @zzj
    public class Builder {
        private Builder() {
        }
    }

    @zzj
    public class Product {
        private final String a;
        private final String b;

        @zzj
        public class Builder {
            private Builder() {
            }
        }

        @NonNull
        public final String a() {
            return this.a;
        }

        @NonNull
        public final String b() {
            return this.b;
        }
    }

    public final ad a() {
        return this.a;
    }

    @NonNull
    public final String b() {
        return ((Product) this.a.get(0)).b();
    }
}
