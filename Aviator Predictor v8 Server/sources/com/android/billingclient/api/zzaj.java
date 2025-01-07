package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
final class zzaj implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ PurchaseHistoryResponseListener b;
    final /* synthetic */ BillingClientImpl c;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zzas a = BillingClientImpl.a(this.c, this.a);
        this.b.a(a.a(), a.b());
        return null;
    }
}
