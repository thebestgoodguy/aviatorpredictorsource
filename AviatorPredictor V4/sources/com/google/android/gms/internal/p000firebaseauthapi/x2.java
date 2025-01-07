package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.content.a;

/* loaded from: classes.dex */
public final class x2 extends a {
    @Deprecated
    public static Intent d(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (a.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != a.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
