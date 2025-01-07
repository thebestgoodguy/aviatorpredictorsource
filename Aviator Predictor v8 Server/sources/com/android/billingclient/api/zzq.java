package com.android.billingclient.api;

import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzq implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ SkuDetailsResponseListener d;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.a(this.b, this.c, (String) null, this.d);
        return null;
    }
}
