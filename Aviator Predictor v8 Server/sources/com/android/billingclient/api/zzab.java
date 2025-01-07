package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzab implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ BillingFlowParams e;
    public final /* synthetic */ Bundle f;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c, this.d, this.e, this.f);
    }
}
