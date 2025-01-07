package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes.dex */
public final class kf implements lf {
    @Override // com.google.android.gms.internal.p000firebaseauthapi.lf
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }
}
