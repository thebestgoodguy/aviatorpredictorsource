package com.android.billingclient.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes62.dex */
public interface PurchaseHistoryResponseListener {
    void a(@NonNull BillingResult billingResult, @Nullable List<PurchaseHistoryRecord> list);
}
