package com.android.billingclient.api;

import java.util.Collections;
import java.util.List;

/* loaded from: classes62.dex */
final class zzat implements AcknowledgePurchaseResponseListener, BillingClientStateListener, ConsumeResponseListener, PriceChangeConfirmationListener, PurchaseHistoryResponseListener, PurchasesResponseListener, PurchasesUpdatedListener, SkuDetailsResponseListener {
    private final long a = 0;

    zzat() {
    }

    public static native void nativeOnAcknowledgePurchaseResponse(int r0, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int r0, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int r0, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int r0, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int r0, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int r0, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int r0, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int r0, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void a() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
    public final void a(BillingResult billingResult) {
        nativeOnAcknowledgePurchaseResponse(billingResult.a(), billingResult.c(), this.a);
    }

    @Override // com.android.billingclient.api.ConsumeResponseListener
    public final void a(BillingResult billingResult, String str) {
        nativeOnConsumePurchaseResponse(billingResult.a(), billingResult.c(), str, this.a);
    }

    @Override // com.android.billingclient.api.PurchaseHistoryResponseListener
    public final void a(BillingResult billingResult, List<PurchaseHistoryRecord> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(billingResult.a(), billingResult.c(), (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), this.a);
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void b(BillingResult billingResult) {
        nativeOnBillingSetupFinished(billingResult.a(), billingResult.c(), this.a);
    }

    @Override // com.android.billingclient.api.PurchasesResponseListener
    public final void b(BillingResult billingResult, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(billingResult.a(), billingResult.c(), (Purchase[]) list.toArray(new Purchase[list.size()]), this.a);
    }

    @Override // com.android.billingclient.api.PriceChangeConfirmationListener
    public final void c(BillingResult billingResult) {
        nativeOnPriceChangeConfirmationResult(billingResult.a(), billingResult.c(), this.a);
    }

    @Override // com.android.billingclient.api.PurchasesUpdatedListener
    public final void c(BillingResult billingResult, List<Purchase> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(billingResult.a(), billingResult.c(), (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // com.android.billingclient.api.SkuDetailsResponseListener
    public final void d(BillingResult billingResult, List<SkuDetails> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(billingResult.a(), billingResult.c(), (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), this.a);
    }
}
