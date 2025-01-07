package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes.dex */
public final class ff implements lf {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.lf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }
}
