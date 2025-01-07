package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@zzf
/* loaded from: classes62.dex */
public final class InAppMessageResult {
    private final int a;

    @Nullable
    private final String b;

    @zzf
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageResponseCode {
    }

    public InAppMessageResult(int r1, @Nullable String str) {
        this.a = r1;
        this.b = str;
    }
}
