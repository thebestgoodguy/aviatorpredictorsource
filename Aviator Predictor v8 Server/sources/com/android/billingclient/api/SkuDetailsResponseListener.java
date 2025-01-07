package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

@Deprecated
/* loaded from: classes62.dex */
public interface SkuDetailsResponseListener {
    void d(@NonNull BillingResult billingResult, @Nullable List<SkuDetails> list);
}
