package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import com.android.billingclient.api.BillingResult;
import defpackage.k;

/* loaded from: classes62.dex */
final class zzah extends ResultReceiver {
    final /* synthetic */ PriceChangeConfirmationListener a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, Bundle bundle) {
        BillingResult.Builder b = BillingResult.b();
        b.a(r2);
        b.a(k.c(bundle, "BillingClient"));
        this.a.c(b.a());
    }
}
