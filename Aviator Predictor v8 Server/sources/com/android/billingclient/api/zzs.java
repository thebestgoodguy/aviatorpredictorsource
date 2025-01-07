package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzs implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ QueryProductDetailsParams b;
    public final /* synthetic */ ProductDetailsResponseListener c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.a(this.b, this.c);
        return null;
    }
}
