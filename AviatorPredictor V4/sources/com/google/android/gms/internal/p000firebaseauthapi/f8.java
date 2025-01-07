package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    private HashMap f1641a = new HashMap();

    public final h8 a() {
        if (this.f1641a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        h8 h8Var = new h8(Collections.unmodifiableMap(this.f1641a), null);
        this.f1641a = null;
        return h8Var;
    }
}
