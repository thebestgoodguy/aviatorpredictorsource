package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes62.dex */
public final class zzbh {

    @Nullable
    private final List a;
    private final BillingResult b;

    public zzbh(BillingResult billingResult, @Nullable List list) {
        this.a = list;
        this.b = billingResult;
    }

    public final BillingResult a() {
        return this.b;
    }

    @Nullable
    public final List b() {
        return this.a;
    }
}
