package com.android.billingclient.api;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.Nullable;
import defpackage.k;

/* loaded from: classes62.dex */
final class zzak extends ResultReceiver {
    final /* synthetic */ InAppMessageResponseListener a;

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int r2, @Nullable Bundle bundle) {
        this.a.a(k.b(bundle, "BillingClient"));
    }
}
