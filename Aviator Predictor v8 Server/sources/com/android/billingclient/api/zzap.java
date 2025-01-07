package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import defpackage.k;
import defpackage.m;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* loaded from: classes62.dex */
final class zzap implements ServiceConnection {
    final /* synthetic */ BillingClientImpl a;
    private final Object b;
    private boolean c;
    private BillingClientStateListener d;

    private final void a(BillingResult billingResult) {
        synchronized (this.b) {
            BillingClientStateListener billingClientStateListener = this.d;
            if (billingClientStateListener != null) {
                billingClientStateListener.b(billingResult);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ java.lang.Object a() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzap.a():java.lang.Object");
    }

    final /* synthetic */ void b() {
        this.a.a = 0;
        this.a.f = null;
        a(zzbb.n);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Handler a;
        Future a2;
        BillingResult b;
        k.a("BillingClient", "Billing service connected.");
        this.a.f = m.a(iBinder);
        BillingClientImpl billingClientImpl = this.a;
        Callable callable = new Callable() { // from class: com.android.billingclient.api.zzam
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzap.this.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.android.billingclient.api.zzan
            @Override // java.lang.Runnable
            public final void run() {
                zzap.this.b();
            }
        };
        a = billingClientImpl.a();
        a2 = billingClientImpl.a(callable, 30000L, runnable, a);
        if (a2 == null) {
            b = this.a.b();
            a(b);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        k.b("BillingClient", "Billing service disconnected.");
        this.a.f = null;
        this.a.a = 0;
        synchronized (this.b) {
            BillingClientStateListener billingClientStateListener = this.d;
            if (billingClientStateListener != null) {
                billingClientStateListener.a();
            }
        }
    }
}
