package com.android.billingclient.api;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzx implements Runnable {
    public final /* synthetic */ PriceChangeConfirmationListener a;
    public final /* synthetic */ BillingResult b;

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c(this.b);
    }
}
