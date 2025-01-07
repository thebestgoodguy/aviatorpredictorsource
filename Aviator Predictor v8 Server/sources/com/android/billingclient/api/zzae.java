package com.android.billingclient.api;

import android.app.Activity;
import android.os.Bundle;
import android.os.ResultReceiver;
import java.util.concurrent.Callable;

/* loaded from: classes62.dex */
public final /* synthetic */ class zzae implements Callable {
    public final /* synthetic */ BillingClientImpl a;
    public final /* synthetic */ Bundle b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ResultReceiver d;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.a.a(this.b, this.c, this.d);
        return null;
    }
}
