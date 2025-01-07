package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import defpackage.k;
import defpackage.o;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;

/* loaded from: classes62.dex */
final class zzar extends o {
    final WeakReference a;
    final ResultReceiver b;

    /* synthetic */ zzar(WeakReference weakReference, ResultReceiver resultReceiver, zzaq zzaqVar) {
        this.a = weakReference;
        this.b = resultReceiver;
    }

    @Override // defpackage.p
    public final void a(Bundle bundle) {
        ResultReceiver resultReceiver = this.b;
        if (resultReceiver == null) {
            k.b("BillingClient", "Unable to send result for in-app messaging");
            return;
        }
        if (bundle == null) {
            resultReceiver.send(0, null);
            return;
        }
        Activity activity = (Activity) this.a.get();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("KEY_LAUNCH_INTENT");
        if (activity == null || pendingIntent == null) {
            this.b.send(0, null);
            k.b("BillingClient", "Unable to launch intent for in-app messaging");
            return;
        }
        try {
            Intent intent = new Intent(activity, (Class<?>) ProxyBillingActivity.class);
            intent.putExtra("in_app_message_result_receiver", this.b);
            intent.putExtra("IN_APP_MESSAGE_INTENT", pendingIntent);
            activity.startActivity(intent);
        } catch (CancellationException e) {
            this.b.send(0, null);
            k.a("BillingClient", "Exception caught while launching intent for in-app messaging.", e);
        }
    }
}
