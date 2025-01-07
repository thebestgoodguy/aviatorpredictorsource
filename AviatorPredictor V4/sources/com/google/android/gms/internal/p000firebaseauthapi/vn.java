package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import z.a;

/* loaded from: classes.dex */
final class vn extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final String f2247a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ xn f2248b;

    public vn(xn xnVar, String str) {
        this.f2248b = xnVar;
        this.f2247a = str;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        HashMap hashMap;
        a aVar;
        a aVar2;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent.getAction())) {
            Bundle extras = intent.getExtras();
            if (((Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS")).k0() == 0) {
                String str = (String) extras.get("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE");
                hashMap = this.f2248b.f2346c;
                wn wnVar = (wn) hashMap.get(this.f2247a);
                if (wnVar == null) {
                    aVar2 = xn.f2343d;
                    aVar2.c("Verification code received with no active retrieval session.", new Object[0]);
                } else {
                    String b5 = xn.b(str);
                    wnVar.f2294e = b5;
                    if (b5 == null) {
                        aVar = xn.f2343d;
                        aVar.c("Unable to extract verification code.", new Object[0]);
                    } else if (!d2.d(wnVar.f2293d)) {
                        xn.e(this.f2248b, this.f2247a);
                    }
                }
            }
            context.getApplicationContext().unregisterReceiver(this);
        }
    }
}
