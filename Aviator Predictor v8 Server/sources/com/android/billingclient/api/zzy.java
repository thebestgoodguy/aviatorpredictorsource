package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzy implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ AcknowledgePurchaseParams b;
    public final /* synthetic */ AcknowledgePurchaseResponseListener c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.a(this.b, this.c);
        return null;
    }
}
