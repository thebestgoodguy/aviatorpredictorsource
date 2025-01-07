package com.android.billingclient.api;

import androidx.annotation.NonNull;
import java.util.List;

@zzk
/* loaded from: classes62.dex */
public interface PurchasesResponseListener {
    @zzk
    void b(@NonNull BillingResult billingResult, @NonNull List<Purchase> list);
}
