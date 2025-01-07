package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes62.dex */
final class zzas {
    private final List a;
    private final BillingResult b;

    zzas(BillingResult billingResult, @Nullable List list) {
        this.a = list;
        this.b = billingResult;
    }

    final BillingResult a() {
        return this.b;
    }

    final List b() {
        return this.a;
    }
}
