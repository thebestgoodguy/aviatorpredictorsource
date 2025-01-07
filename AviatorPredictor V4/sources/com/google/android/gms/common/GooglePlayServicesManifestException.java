package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes.dex */
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: e, reason: collision with root package name */
    private final int f1199e;

    public GooglePlayServicesManifestException(int r12, String str) {
        super(str);
        this.f1199e = r12;
    }
}
