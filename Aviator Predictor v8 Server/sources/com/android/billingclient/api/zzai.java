package com.android.billingclient.api;

import defpackage.ad;
import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
final class zzai implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ PurchasesResponseListener b;
    final /* synthetic */ BillingClientImpl c;

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        zzbh b = BillingClientImpl.b(this.c, this.a);
        if (b.b() != null) {
            this.b.b(b.a(), b.b());
            return null;
        }
        this.b.b(b.a(), ad.d());
        return null;
    }
}
