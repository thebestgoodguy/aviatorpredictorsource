package com.android.billingclient.api;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzr implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Bundle c;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.a.a(this.b, this.c);
    }
}
