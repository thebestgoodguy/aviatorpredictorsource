package com.android.billingclient.api;

import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzac implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c);
    }
}
