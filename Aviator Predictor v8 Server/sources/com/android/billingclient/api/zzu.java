package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzu implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ ConsumeParams b;
    public final /* synthetic */ ConsumeResponseListener c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.a(this.b, this.c);
        return null;
    }
}
